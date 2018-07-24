package penultimate.psychohistory.controllers;

import penultimate.psychohistory.commands.PopulatedSystemForm;
import penultimate.psychohistory.converters.PopulatedSystemToPopulatedSystemForm;
import penultimate.psychohistory.domain.PopulatedSystem;
import penultimate.psychohistory.services.PopulatedSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class PopulatedSystemController {
    private PopulatedSystemService populatedSystemService;

    private PopulatedSystemToPopulatedSystemForm populatedSystemToPopulatedSystemForm;

    @Autowired
    public void setPopulatedSystemToPopulatedSystemForm(PopulatedSystemToPopulatedSystemForm populatedSystemToPopulatedSystemForm) {
        this.populatedSystemToPopulatedSystemForm = populatedSystemToPopulatedSystemForm;
    }

    @Autowired
    public void setPopulatedSystemService(PopulatedSystemService populatedSystemService) {
        this.populatedSystemService = populatedSystemService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/populatedSystem/list";
    }

    @RequestMapping({"/populatedSystem/list", "/populatedSystem"})
    public String listPopulatedSystems(Model model){
        model.addAttribute("populatedSystems", populatedSystemService.listAll());
        return "populatedSystem/list";
    }

    @RequestMapping("/populatedSystem/show/{id}")
    public String getPopulatedSystem(@PathVariable String id, Model model){
        model.addAttribute("populatedSystem", populatedSystemService.getById(Long.valueOf(id)));
        return "populatedSystem/show";
    }

    @RequestMapping("populatedSystem/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        PopulatedSystem populatedSystem = populatedSystemService.getById(Long.valueOf(id));
        PopulatedSystemForm populatedSystemForm = populatedSystemToPopulatedSystemForm.convert(populatedSystem);

        model.addAttribute("populatedSystemForm", populatedSystemForm);
        return "populatedSystem/populatedSystemform";
    }

    @RequestMapping("/populatedSystem/new")
    public String newPopulatedSystem(Model model){
        model.addAttribute("populatedSystemForm", new PopulatedSystemForm());
        return "populatedSystem/populatedSystemform";
    }

    @RequestMapping(value = "/populatedSystem", method = RequestMethod.POST)
    public String saveOrUpdatePopulatedSystem(@Valid PopulatedSystemForm populatedSystemForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "populatedSystem/populatedSystemform";
        }

        PopulatedSystem savedPopulatedSystem = populatedSystemService.saveOrUpdatePopulatedSystemForm(populatedSystemForm);

        return "redirect:/populatedSystem/show/" + savedPopulatedSystem.getId();
    }

    @RequestMapping("/populatedSystem/delete/{id}")
    public String delete(@PathVariable String id){
        populatedSystemService.delete(Long.valueOf(id));
        return "redirect:/populatedSystem/list";
    }
}

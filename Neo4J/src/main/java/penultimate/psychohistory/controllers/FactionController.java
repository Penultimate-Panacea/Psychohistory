package penultimate.psychohistory.controllers;

import penultimate.psychohistory.commands.FactionForm;
import penultimate.psychohistory.converters.FactionToFactionForm;
import penultimate.psychohistory.domain.Faction;
import penultimate.psychohistory.services.FactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class FactionController {
    private FactionService factionService;

    private FactionToFactionForm factionToFactionForm;

    @Autowired
    public void setFactionToFactionForm(FactionToFactionForm factionToFactionForm) {
        this.factionToFactionForm = factionToFactionForm;
    }

    @Autowired
    public void setFactionService(FactionService factionService) {
        this.factionService = factionService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/faction/list";
    }

    @RequestMapping({"/faction/list", "/faction"})
    public String listFactions(Model model){
        model.addAttribute("factions", factionService.listAll());
        return "faction/list";
    }

    @RequestMapping("/faction/show/{id}")
    public String getFaction(@PathVariable String id, Model model){
        model.addAttribute("faction", factionService.getById(Long.valueOf(id)));
        return "faction/show";
    }

    @RequestMapping("faction/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Faction faction = factionService.getById(Long.valueOf(id));
        FactionForm factionForm = factionToFactionForm.convert(faction);

        model.addAttribute("factionForm", factionForm);
        return "faction/factionform";
    }

    @RequestMapping("/faction/new")
    public String newFaction(Model model){
        model.addAttribute("factionForm", new FactionForm());
        return "faction/factionform";
    }

    @RequestMapping(value = "/faction", method = RequestMethod.POST)
    public String saveOrUpdateFaction(@Valid FactionForm factionForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "faction/factionform";
        }

        Faction savedFaction = factionService.saveOrUpdateFactionForm(factionForm);

        return "redirect:/faction/show/" + savedFaction.getId();
    }

    @RequestMapping("/faction/delete/{id}")
    public String delete(@PathVariable String id){
        factionService.delete(Long.valueOf(id));
        return "redirect:/faction/list";
    }
}

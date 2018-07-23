package penultimate.psychohistory.controllers;

import penultimate.psychohistory.commands.StationForm;
import penultimate.psychohistory.converters.StationToStationForm;
import penultimate.psychohistory.domain.Station;
import penultimate.psychohistory.services.StationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class StationController {
    private StationService stationService;

    private StationToStationForm stationToStationForm;

    @Autowired
    public void setStationToStationForm(StationToStationForm stationToStationForm) {
        this.stationToStationForm = stationToStationForm;
    }

    @Autowired
    public void setStationService(StationService stationService) {
        this.stationService = stationService;
    }

    @RequestMapping("/")
    public String redirToList(){
        return "redirect:/station/list";
    }

    @RequestMapping({"/station/list", "/station"})
    public String listStations(Model model){
        model.addAttribute("stations", stationService.listAll());
        return "station/list";
    }

    @RequestMapping("/station/show/{id}")
    public String getStation(@PathVariable String id, Model model){
        model.addAttribute("station", stationService.getById(Long.valueOf(id)));
        return "station/show";
    }

    @RequestMapping("station/edit/{id}")
    public String edit(@PathVariable String id, Model model){
        Station station = stationService.getById(Long.valueOf(id));
        StationForm stationForm = stationToStationForm.convert(station);

        model.addAttribute("stationForm", stationForm);
        return "station/stationform";
    }

    @RequestMapping("/station/new")
    public String newStation(Model model){
        model.addAttribute("stationForm", new StationForm());
        return "station/stationform";
    }

    @RequestMapping(value = "/station", method = RequestMethod.POST)
    public String saveOrUpdateStation(@Valid StationForm stationForm, BindingResult bindingResult){

        if(bindingResult.hasErrors()){
            return "station/stationform";
        }

        Station savedStation = stationService.saveOrUpdateStationForm(stationForm);

        return "redirect:/station/show/" + savedStation.getId();
    }

    @RequestMapping("/station/delete/{id}")
    public String delete(@PathVariable String id){
        stationService.delete(Long.valueOf(id));
        return "redirect:/station/list";
    }
}

package penultimate.psychohistory.converters;

import penultimate.psychohistory.commands.FactionForm;
import penultimate.psychohistory.domain.Faction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FactionFormToFaction implements Converter<FactionForm, Faction> {

    @Override
    public Faction convert(FactionForm factionForm) {
        Faction faction = new Faction();
        faction.setName(factionForm.getName());
        faction.setUpdated_at(factionForm.getUpdated_at());
        faction.setGovernment_id(factionForm.getGovernment_id());
        faction.setGovernment(factionForm.getGovernment());
        faction.setAllegiance_id(factionForm.getAllegiance_id());
        faction.setAllegiance(factionForm.getAllegiance());
        faction.setState_id(factionForm.getState_id());
        faction.setState(factionForm.getState());
        faction.setHome_system_id(factionForm.getHome_system_id());
        faction.setIs_player_faction(factionForm.is_player_faction());
        return faction;
    }
}
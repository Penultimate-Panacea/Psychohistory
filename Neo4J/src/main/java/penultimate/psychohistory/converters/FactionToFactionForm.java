package penultimate.psychohistory.converters;

import penultimate.psychohistory.commands.FactionForm;
import penultimate.psychohistory.domain.Faction;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FactionToFactionForm implements Converter<Faction, FactionForm> {

    @Override
    public FactionForm convert(Faction faction) {
        FactionForm factionForm = new FactionForm();
        factionForm.setName(faction.getName());
        factionForm.setUpdated_at(faction.getUpdated_at());
        factionForm.setGovernment_id(faction.getGovernment_id());
        factionForm.setGovernment(faction.getGovernment());
        factionForm.setAllegiance_id(faction.getAllegiance_id());
        factionForm.setAllegiance(faction.getAllegiance());
        factionForm.setState_id(faction.getState_id());
        factionForm.setState(faction.getState());
        factionForm.setHome_system_id(faction.getHome_system_id());
        factionForm.setIs_player_faction(faction.is_player_faction());
        return factionForm;
    }
}
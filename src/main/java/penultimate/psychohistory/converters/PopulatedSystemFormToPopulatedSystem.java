package penultimate.psychohistory.converters;

import penultimate.psychohistory.commands.PopulatedSystemForm;
import penultimate.psychohistory.domain.PopulatedSystem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PopulatedSystemFormToPopulatedSystem implements Converter<PopulatedSystemForm, PopulatedSystem> {

    @Override
    public PopulatedSystem convert(PopulatedSystemForm populatedSystemForm) {
        PopulatedSystem populatedSystem = new PopulatedSystem();
        populatedSystem.setId(populatedSystemForm.getId());
        populatedSystem.setEdsm_id(populatedSystemForm.getEdsm_id());
        populatedSystem.setName(populatedSystemForm.getName());
        populatedSystem.setX(populatedSystemForm.getX());
        populatedSystem.setY(populatedSystemForm.getY());
        populatedSystem.setZ(populatedSystemForm.getZ());
        populatedSystem.setPopulation(populatedSystemForm.getPopulation());
        populatedSystem.setIs_populated(populatedSystemForm.isIs_populated());
        populatedSystem.setGovernment_id(populatedSystemForm.getGovernment_id());
        populatedSystem.setGovernment(populatedSystemForm.getGovernment());
        populatedSystem.setAllegiance_id(populatedSystemForm.getAllegiance_id());
        populatedSystem.setAllegiance(populatedSystemForm.getAllegiance());
        populatedSystem.setState_id(populatedSystemForm.getState_id());
        populatedSystem.setState(populatedSystemForm.getState());
        populatedSystem.setSecurity_id(populatedSystemForm.getSecurity_id());
        populatedSystem.setSecurity(populatedSystemForm.getSecurity());
        populatedSystem.setPrimary_economy_id(populatedSystemForm.getPrimary_economy_id());
        populatedSystem.setPrimary_economy(populatedSystemForm.getPrimary_economy());
        populatedSystem.setPower(populatedSystemForm.getPower());
        populatedSystem.setPower_state(populatedSystemForm.getPower_state());
        populatedSystem.setPower_state_id(populatedSystemForm.getPower_state_id());
        populatedSystem.setNeeds_permit(populatedSystemForm.isNeeds_permit());
        populatedSystem.setUpdated_at(populatedSystemForm.getUpdated_at());
        populatedSystem.setSimbad_ref(populatedSystemForm.getSimbad_ref());
        populatedSystem.setControlling_minor_faction_id(populatedSystemForm.getControlling_minor_faction_id());
        populatedSystem.setControlling_minor_faction(populatedSystemForm.getControlling_minor_faction());
        populatedSystem.setReserver_type_id(populatedSystemForm.getReserver_type_id());
        populatedSystem.setReserver_type(populatedSystemForm.getReserver_type());
        populatedSystem.setMinor_faction_presence(populatedSystemForm.getMinor_faction_presence());
        return populatedSystem;
    }
}
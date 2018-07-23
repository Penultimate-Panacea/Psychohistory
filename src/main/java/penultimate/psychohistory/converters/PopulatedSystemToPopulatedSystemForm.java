package penultimate.psychohistory.converters;

import penultimate.psychohistory.commands.PopulatedSystemForm;
import penultimate.psychohistory.domain.PopulatedSystem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PopulatedSystemToPopulatedSystemForm implements Converter<PopulatedSystem, PopulatedSystemForm> {

    @Override
    public PopulatedSystemForm convert(PopulatedSystem populatedSystem) {
        PopulatedSystemForm populatedSystemForm = new PopulatedSystemForm();
        populatedSystemForm.setId(populatedSystem.getId());
        populatedSystemForm.setEdsm_id(populatedSystem.getEdsm_id());
        populatedSystemForm.setName(populatedSystem.getName());
        populatedSystemForm.setX(populatedSystem.getX());
        populatedSystemForm.setY(populatedSystem.getY());
        populatedSystemForm.setZ(populatedSystem.getZ());
        populatedSystemForm.setPopulation(populatedSystem.getPopulation());
        populatedSystemForm.setIs_populated(populatedSystem.isIs_populated());
        populatedSystemForm.setGovernment_id(populatedSystem.getGovernment_id());
        populatedSystemForm.setGovernment(populatedSystem.getGovernment());
        populatedSystemForm.setAllegiance_id(populatedSystem.getAllegiance_id());
        populatedSystemForm.setAllegiance(populatedSystem.getAllegiance());
        populatedSystemForm.setState_id(populatedSystem.getState_id());
        populatedSystemForm.setState(populatedSystem.getState());
        populatedSystemForm.setSecurity_id(populatedSystem.getSecurity_id());
        populatedSystemForm.setSecurity(populatedSystem.getSecurity());
        populatedSystemForm.setPrimary_economy_id(populatedSystem.getPrimary_economy_id());
        populatedSystemForm.setPrimary_economy(populatedSystem.getPrimary_economy());
        populatedSystemForm.setPower(populatedSystem.getPower());
        populatedSystemForm.setPower_state(populatedSystem.getPower_state());
        populatedSystemForm.setPower_state_id(populatedSystem.getPower_state_id());
        populatedSystemForm.setNeeds_permit(populatedSystem.isNeeds_permit());
        populatedSystemForm.setUpdated_at(populatedSystem.getUpdated_at());
        populatedSystemForm.setSimbad_ref(populatedSystem.getSimbad_ref());
        populatedSystemForm.setControlling_minor_faction_id(populatedSystem.getControlling_minor_faction_id());
        populatedSystemForm.setControlling_minor_faction(populatedSystem.getControlling_minor_faction());
        populatedSystemForm.setReserver_type_id(populatedSystem.getReserver_type_id());
        populatedSystemForm.setReserver_type(populatedSystem.getReserver_type());
        populatedSystemForm.setMinor_faction_presence(populatedSystem.getMinor_faction_presence());
        return populatedSystemForm;
    }
}
package penultimate.psychohistory.converters;

import penultimate.psychohistory.commands.StationForm;
import penultimate.psychohistory.domain.Station;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StationToStationForm implements Converter<Station, StationForm> {

    @Override
    public StationForm convert(Station station) {
        StationForm stationForm = new StationForm();
        stationForm.setId(station.getId());
        stationForm.setName(station.getName());
        stationForm.setSystem_id(station.getSystem_id());
        stationForm.setUpdated_at(station.getUpdated_at());
        stationForm.setDistance_to_star(station.getDistance_to_star());
        stationForm.setGovernment_id(station.getGovernment_id());
        stationForm.setGovernment(station.getGovernment());
        stationForm.setAllegiance_id(station.getAllegiance_id());
        stationForm.setAllegiance(station.getAllegiance());
        stationForm.setState_id(station.getState_id());
        stationForm.setState(station.getState());
        stationForm.setType_id(station.getType_id());
        stationForm.setType(station.getType());
        stationForm.setHas_blackmarket(station.isHas_blackmarket());
        stationForm.setHas_market(station.isHas_market());
        stationForm.setHas_rearm(station.isHas_rearm());
        stationForm.setHas_refuel(station.isHas_refuel());
        stationForm.setHas_repair(station.isHas_refuel());
        stationForm.setHas_outfitting(station.isHas_outfitting());
        stationForm.setHas_shipyard(station.isHas_shipyard());
        stationForm.setHas_docking(station.isHas_docking());
        stationForm.setHas_commodities(station.isHas_commodities());
        stationForm.setImport_commodities(station.getImport_commodities());
        stationForm.setExport_commodities(station.getExport_commodities());
        stationForm.setProhibited_commodities(station.getProhibited_commodities());
        stationForm.setEconomies(station.getEconomies());
        stationForm.setShipyard_updated_at(station.getShipyard_updated_at());
        stationForm.setOutfitting_updated_at(station.getOutfitting_updated_at());
        stationForm.setMarket_updated_at(station.getMarket_updated_at());
        stationForm.setIs_planetary(station.isIs_planetary());
        stationForm.setSelling_ships(station.getSelling_ships());
        stationForm.setSelling_modules(station.getSelling_modules());
        stationForm.setBody_id(station.getBody_id());
        stationForm.setControlling_minor_faction_id(station.getControlling_minor_faction_id());

        return stationForm;
    }
}
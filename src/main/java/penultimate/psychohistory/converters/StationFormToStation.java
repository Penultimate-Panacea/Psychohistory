package penultimate.psychohistory.converters;

import penultimate.psychohistory.commands.StationForm;
import penultimate.psychohistory.domain.Station;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class StationFormToStation implements Converter<StationForm, Station> {

    @Override
    public Station convert(StationForm stationForm) {
        Station station = new Station();
        station.setId(stationForm.getId());
        station.setName(stationForm.getName());
        station.setSystem_id(stationForm.getSystem_id());
        station.setUpdated_at(stationForm.getUpdated_at());
        station.setDistance_to_star(stationForm.getDistance_to_star());
        station.setGovernment_id(stationForm.getGovernment_id());
        station.setGovernment(stationForm.getGovernment());
        station.setAllegiance_id(stationForm.getAllegiance_id());
        station.setAllegiance(stationForm.getAllegiance());
        station.setState_id(stationForm.getState_id());
        station.setState(stationForm.getState());
        station.setType_id(stationForm.getType_id());
        station.setType(stationForm.getType());
        station.setHas_blackmarket(stationForm.isHas_blackmarket());
        station.setHas_market(stationForm.isHas_market());
        station.setHas_rearm(stationForm.isHas_rearm());
        station.setHas_refuel(stationForm.isHas_refuel());
        station.setHas_repair(stationForm.isHas_refuel());
        station.setHas_outfitting(stationForm.isHas_outfitting());
        station.setHas_shipyard(stationForm.isHas_shipyard());
        station.setHas_docking(stationForm.isHas_docking());
        station.setHas_commodities(stationForm.isHas_commodities());
        station.setImport_commodities(stationForm.getImport_commodities());
        station.setExport_commodities(stationForm.getExport_commodities());
        station.setProhibited_commodities(stationForm.getProhibited_commodities());
        station.setEconomies(stationForm.getEconomies());
        station.setShipyard_updated_at(stationForm.getShipyard_updated_at());
        station.setOutfitting_updated_at(stationForm.getOutfitting_updated_at());
        station.setMarket_updated_at(stationForm.getMarket_updated_at());
        station.setIs_planetary(stationForm.isIs_planetary());
        station.setSelling_ships(stationForm.getSelling_ships());
        station.setSelling_modules(stationForm.getSelling_modules());
        station.setBody_id(stationForm.getBody_id());
        station.setControlling_minor_faction_id(stationForm.getControlling_minor_faction_id());

        return station;
    }
}
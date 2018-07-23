package penultimate.psychohistory.domain;

import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Station {
    @Id @GeneratedValue
    private long id;
    private String name;
    private int system_id;
    private long updated_at;
    private int distance_to_star;
    private int government_id;
    private String government;
    private int allegiance_id;
    private String allegiance;
    private int state_id;
    private String state;
    private int type_id;
    private String type;
    private boolean has_blackmarket;
    private boolean has_market;
    private boolean has_refuel;
    private boolean has_repair;
    private boolean has_rearm;
    private boolean has_outfitting;
    private boolean has_shipyard;
    private boolean has_docking;
    private boolean has_commodities;
    private String[] import_commodities;
    private String[] export_commodities;
    private String[] prohibited_commodities;
    private String[] economies;
    private long shipyard_updated_at;
    private long outfitting_updated_at;
    private long market_updated_at;
    private boolean is_planetary;
    private String[] selling_ships;
    private int[] selling_modules;
    /*
    Not yet implemented [if ever]
    private int settlement_size_id;
    private String settlement_size;
    private int settlement_security_id;
    private String settlement_security;
    */
    private long body_id;
    private int controlling_minor_faction_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSystem_id() {
        return system_id;
    }

    public void setSystem_id(int system_id) {
        this.system_id = system_id;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public int getDistance_to_star() {
        return distance_to_star;
    }

    public void setDistance_to_star(int distance_to_star) {
        this.distance_to_star = distance_to_star;
    }

    public int getGovernment_id() {
        return government_id;
    }

    public void setGovernment_id(int government_id) {
        this.government_id = government_id;
    }

    public String getGovernment() {
        return government;
    }

    public void setGovernment(String government) {
        this.government = government;
    }

    public int getAllegiance_id() {
        return allegiance_id;
    }

    public void setAllegiance_id(int allegiance_id) {
        this.allegiance_id = allegiance_id;
    }

    public String getAllegiance() {
        return allegiance;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public int getState_id() {
        return state_id;
    }

    public void setState_id(int state_id) {
        this.state_id = state_id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isHas_blackmarket() {
        return has_blackmarket;
    }

    public void setHas_blackmarket(boolean has_blackmarket) {
        this.has_blackmarket = has_blackmarket;
    }

    public boolean isHas_market() {
        return has_market;
    }

    public void setHas_market(boolean has_market) {
        this.has_market = has_market;
    }

    public boolean isHas_refuel() {
        return has_refuel;
    }

    public void setHas_refuel(boolean has_refuel) {
        this.has_refuel = has_refuel;
    }

    public boolean isHas_repair() {
        return has_repair;
    }

    public void setHas_repair(boolean has_repair) {
        this.has_repair = has_repair;
    }

    public boolean isHas_rearm() {
        return has_rearm;
    }

    public void setHas_rearm(boolean has_rearm) {
        this.has_rearm = has_rearm;
    }

    public boolean isHas_outfitting() {
        return has_outfitting;
    }

    public void setHas_outfitting(boolean has_outfitting) {
        this.has_outfitting = has_outfitting;
    }

    public boolean isHas_shipyard() {
        return has_shipyard;
    }

    public void setHas_shipyard(boolean has_shipyard) {
        this.has_shipyard = has_shipyard;
    }

    public boolean isHas_docking() {
        return has_docking;
    }

    public void setHas_docking(boolean has_docking) {
        this.has_docking = has_docking;
    }

    public boolean isHas_commodities() {
        return has_commodities;
    }

    public void setHas_commodities(boolean has_commodities) {
        this.has_commodities = has_commodities;
    }

    public String[] getImport_commodities() {
        return import_commodities;
    }

    public void setImport_commodities(String[] import_commodities) {
        this.import_commodities = import_commodities;
    }

    public String[] getExport_commodities() {
        return export_commodities;
    }

    public void setExport_commodities(String[] export_commodities) {
        this.export_commodities = export_commodities;
    }

    public String[] getProhibited_commodities() {
        return prohibited_commodities;
    }

    public void setProhibited_commodities(String[] prohibited_commodities) {
        this.prohibited_commodities = prohibited_commodities;
    }

    public String[] getEconomies() {
        return economies;
    }

    public void setEconomies(String[] economies) {
        this.economies = economies;
    }

    public long getShipyard_updated_at() {
        return shipyard_updated_at;
    }

    public void setShipyard_updated_at(long shipyard_updated_at) {
        this.shipyard_updated_at = shipyard_updated_at;
    }

    public long getOutfitting_updated_at() {
        return outfitting_updated_at;
    }

    public void setOutfitting_updated_at(long outfitting_updated_at) {
        this.outfitting_updated_at = outfitting_updated_at;
    }

    public long getMarket_updated_at() {
        return market_updated_at;
    }

    public void setMarket_updated_at(long market_updated_at) {
        this.market_updated_at = market_updated_at;
    }

    public boolean isIs_planetary() {
        return is_planetary;
    }

    public void setIs_planetary(boolean is_planetary) {
        this.is_planetary = is_planetary;
    }

    public String[] getSelling_ships() {
        return selling_ships;
    }

    public void setSelling_ships(String[] selling_ships) {
        this.selling_ships = selling_ships;
    }

    public int[] getSelling_modules() {
        return selling_modules;
    }

    public void setSelling_modules(int[] selling_modules) {
        this.selling_modules = selling_modules;
    }

    public long getBody_id() {
        return body_id;
    }

    public void setBody_id(long body_id) {
        this.body_id = body_id;
    }

    public int getControlling_minor_faction_id() {
        return controlling_minor_faction_id;
    }

    public void setControlling_minor_faction_id(int controlling_minor_faction_id) {
        this.controlling_minor_faction_id = controlling_minor_faction_id;
    }

}

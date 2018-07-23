package penultimate.psychohistory;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class PopulatedSystem {
    @GraphId
    private long id;
    private long edsm_id;
    private String name;
    private double x;
    private double y;
    private double z;
    private int population;
    private boolean is_populated;
    private int government_id;
    private String government;
    private int allegiance_id;
    private String allegiance;
    private int state_id;
    private String state;
    private int security_id;
    private String security;
    private int primary_economy_id;
    private String primary_economy;
    private String power;
    private String power_state;
    private int power_state_id;
    private boolean needs_permit;
    private long updated_at;
    private String simbad_ref;
    private int controlling_minor_faction_id;
    private String controlling_minor_faction;
    private int reserver_type_id;
    private String reserver_type;
    private String[][] minor_faction_presence; //TODO handle the second level array for multiple minor factions

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEdsm_id() {
        return edsm_id;
    }

    public void setEdsm_id(long edsm_id) {
        this.edsm_id = edsm_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public boolean isIs_populated() {
        return is_populated;
    }

    public void setIs_populated(boolean is_populated) {
        this.is_populated = is_populated;
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

    public int getSecurity_id() {
        return security_id;
    }

    public void setSecurity_id(int security_id) {
        this.security_id = security_id;
    }

    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public int getPrimary_economy_id() {
        return primary_economy_id;
    }

    public void setPrimary_economy_id(int primary_economy_id) {
        this.primary_economy_id = primary_economy_id;
    }

    public String getPrimary_economy() {
        return primary_economy;
    }

    public void setPrimary_economy(String primary_economy) {
        this.primary_economy = primary_economy;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getPower_state() {
        return power_state;
    }

    public void setPower_state(String power_state) {
        this.power_state = power_state;
    }

    public int getPower_state_id() {
        return power_state_id;
    }

    public void setPower_state_id(int power_state_id) {
        this.power_state_id = power_state_id;
    }

    public boolean isNeeds_permit() {
        return needs_permit;
    }

    public void setNeeds_permit(boolean needs_permit) {
        this.needs_permit = needs_permit;
    }

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
    }

    public String getSimbad_ref() {
        return simbad_ref;
    }

    public void setSimbad_ref(String simbad_ref) {
        this.simbad_ref = simbad_ref;
    }

    public int getControlling_minor_faction_id() {
        return controlling_minor_faction_id;
    }

    public void setControlling_minor_faction_id(int controlling_minor_faction_id) {
        this.controlling_minor_faction_id = controlling_minor_faction_id;
    }

    public String getControlling_minor_faction() {
        return controlling_minor_faction;
    }

    public void setControlling_minor_faction(String controlling_minor_faction) {
        this.controlling_minor_faction = controlling_minor_faction;
    }

    public int getReserver_type_id() {
        return reserver_type_id;
    }

    public void setReserver_type_id(int reserver_type_id) {
        this.reserver_type_id = reserver_type_id;
    }

    public String getReserver_type() {
        return reserver_type;
    }

    public void setReserver_type(String reserver_type) {
        this.reserver_type = reserver_type;
    }

    public String[][] getMinor_faction_presence() {
        return minor_faction_presence;
    }

    public void setMinor_faction_presence(String[][] minor_faction_presence) {
        this.minor_faction_presence = minor_faction_presence;
    }
}
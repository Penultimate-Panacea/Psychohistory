package penultimate.psychohistory.commands;


public class FactionForm {

    private long id;
    private String name;
    private long updated_at;
    private int government_id;
    private String government;
    private int allegiance_id;
    private String allegiance;
    private int state_id;
    private String state;
    private int home_system_id;
    private boolean is_player_faction;

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

    public long getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(long updated_at) {
        this.updated_at = updated_at;
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

    public int getHome_system_id() {
        return home_system_id;
    }

    public void setHome_system_id(int home_system_id) {
        this.home_system_id = home_system_id;
    }

    public boolean is_player_faction() {
        return is_player_faction;
    }

    public void setIs_player_faction(boolean is_player_faction) {
        this.is_player_faction = is_player_faction;
    }
}

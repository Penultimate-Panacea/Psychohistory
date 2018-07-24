package penultimate.psychohistory.repositories;

import penultimate.psychohistory.domain.Faction;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class FactionRepositoryTest {

    private static final long DUKE_ID = Long.valueOf(363);
    private static final String DUKE_NAME = "The Dukes of Mikunn";
    private static final long DUKE_ARBIT_UPDATE = 1532191783;
    private static final int DUKE_GOVERNMENT_ID = 128;
    private static final String DUKE_GOVERNMENT = "Feudal";
    private static final int DUKE_ALLEGIANCE_ID = 4;
    private static final String DUKE_ALLEGIANCE = "Independent";
    private static final int DUKE_STATE_ID = 16;
    private static final String DUKE_STATE = "Boom";
    private static final int DUKE_HOME_SYSTEM_ID = 136649;
    private static final boolean DUKE_IS_PLAYER = true;

    @Autowired
    private FactionRepository factionRepository;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testPersistence() {
        //given
        Faction faction = new Faction();
        faction.setId(DUKE_ID);
        faction.setName(DUKE_NAME);
        faction.setUpdated_at(DUKE_ARBIT_UPDATE);
        faction.setGovernment_id(DUKE_GOVERNMENT_ID);
        faction.setGovernment(DUKE_GOVERNMENT);
        faction.setAllegiance_id(DUKE_ALLEGIANCE_ID);
        faction.setAllegiance(DUKE_ALLEGIANCE);
        faction.setState_id(DUKE_STATE_ID);
        faction.setState(DUKE_STATE);
        faction.setHome_system_id(DUKE_HOME_SYSTEM_ID);
        faction.setIs_player_faction(DUKE_IS_PLAYER);
        //when
        factionRepository.save(faction);

        //then
        Assert.assertNotNull(faction.getId());
        Faction newFaction = factionRepository.findById(faction.getId()).orElse(null);
        Assert.assertEquals(DUKE_ID, newFaction.getId());
        Assert.assertEquals(DUKE_NAME, newFaction.getName());
        Assert.assertEquals(DUKE_ARBIT_UPDATE, newFaction.getUpdated_at());
        Assert.assertEquals(DUKE_GOVERNMENT_ID, newFaction.getGovernment_id());
        Assert.assertEquals(DUKE_GOVERNMENT, newFaction.getGovernment());
        Assert.assertEquals(DUKE_ALLEGIANCE, newFaction.getAllegiance());
        Assert.assertEquals(DUKE_STATE_ID, newFaction.getState_id());
        Assert.assertEquals(DUKE_STATE, newFaction.getState());
        Assert.assertEquals(DUKE_HOME_SYSTEM_ID, newFaction.getHome_system_id());
        Assert.assertEquals(DUKE_IS_PLAYER, newFaction.is_player_faction());
    }
}
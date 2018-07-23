package penultimate.psychohistory.services;

import penultimate.psychohistory.commands.StationForm;
import penultimate.psychohistory.domain.Station;
import java.util.List;

public interface StationService {

    List<Station> listAll();

    Station getById(Long id);

    Station saveOrUpdate(Station station);

    void delete(Long id);

    Station saveOrUpdateStationForm(StationForm stationForm);
}

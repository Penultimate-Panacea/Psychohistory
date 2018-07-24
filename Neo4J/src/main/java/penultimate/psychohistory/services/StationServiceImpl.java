package penultimate.psychohistory.services;

import penultimate.psychohistory.commands.StationForm;
import penultimate.psychohistory.converters.StationFormToStation;
import penultimate.psychohistory.domain.Station;
import penultimate.psychohistory.repositories.StationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StationServiceImpl implements StationService {

    private StationRepository stationRepository;
    private StationFormToStation stationFormToStation;

    @Autowired
    public StationServiceImpl(StationRepository stationRepository, StationFormToStation stationFormToStation) {
        this.stationRepository = stationRepository;
        this.stationFormToStation = stationFormToStation;
    }


    @Override
    public List<Station> listAll() {
        List<Station> stations = new ArrayList<>();
        stationRepository.findAll().forEach(stations::add); //fun with Java 8
        return stations;
    }

    @Override
    public Station getById(Long id) {
        return stationRepository.findById(id).orElse(null);
    }

    @Override
    public Station saveOrUpdate(Station station) {
        stationRepository.save(station);
        return station;
    }

    @Override
    public void delete(Long id) {
        stationRepository.deleteById(id);

    }

    @Override
    public Station saveOrUpdateStationForm(StationForm stationForm) {
        Station savedStation = saveOrUpdate(stationFormToStation.convert(stationForm));

        System.out.println("Saved Station Id: " + savedStation.getId());
        return savedStation;
    }
}

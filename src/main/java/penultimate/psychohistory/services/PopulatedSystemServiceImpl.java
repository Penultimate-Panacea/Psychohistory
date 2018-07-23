package penultimate.psychohistory.services;

import penultimate.psychohistory.commands.PopulatedSystemForm;
import penultimate.psychohistory.converters.PopulatedSystemFormToPopulatedSystem;
import penultimate.psychohistory.domain.PopulatedSystem;
import penultimate.psychohistory.repositories.PopulatedSystemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PopulatedSystemServiceImpl implements PopulatedSystemService {

    private PopulatedSystemRepository populatedSystemRepository;
    private PopulatedSystemFormToPopulatedSystem populatedSystemFormToPopulatedSystem;

    @Autowired
    public PopulatedSystemServiceImpl(PopulatedSystemRepository populatedSystemRepository, PopulatedSystemFormToPopulatedSystem populatedSystemFormToPopulatedSystem) {
        this.populatedSystemRepository = populatedSystemRepository;
        this.populatedSystemFormToPopulatedSystem = populatedSystemFormToPopulatedSystem;
    }


    @Override
    public List<PopulatedSystem> listAll() {
        List<PopulatedSystem> populatedSystems = new ArrayList<>();
        populatedSystemRepository.findAll().forEach(populatedSystems::add); //fun with Java 8
        return populatedSystems;
    }

    @Override
    public PopulatedSystem getById(Long id) {
        return populatedSystemRepository.findById(id).orElse(null);
    }

    @Override
    public PopulatedSystem saveOrUpdate(PopulatedSystem populatedSystem) {
        populatedSystemRepository.save(populatedSystem);
        return populatedSystem;
    }

    @Override
    public void delete(Long id) {
        populatedSystemRepository.deleteById(id);

    }

    @Override
    public PopulatedSystem saveOrUpdatePopulatedSystemForm(PopulatedSystemForm populatedSystemForm) {
        PopulatedSystem savedPopulatedSystem = saveOrUpdate(populatedSystemFormToPopulatedSystem.convert(populatedSystemForm));

        System.out.println("Saved PopulatedSystem Id: " + savedPopulatedSystem.getId());
        return savedPopulatedSystem;
    }
}

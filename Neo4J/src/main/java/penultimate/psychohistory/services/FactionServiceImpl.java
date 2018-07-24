package penultimate.psychohistory.services;

import penultimate.psychohistory.commands.FactionForm;
import penultimate.psychohistory.converters.FactionFormToFaction;
import penultimate.psychohistory.domain.Faction;
import penultimate.psychohistory.repositories.FactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FactionServiceImpl implements FactionService {

    private FactionRepository factionRepository;
    private FactionFormToFaction factionFormToFaction;

    @Autowired
    public FactionServiceImpl(FactionRepository factionRepository, FactionFormToFaction factionFormToFaction) {
        this.factionRepository = factionRepository;
        this.factionFormToFaction = factionFormToFaction;
    }


    @Override
    public List<Faction> listAll() {
        List<Faction> factions = new ArrayList<>();
        factionRepository.findAll().forEach(factions::add); //fun with Java 8
        return factions;
    }

    @Override
    public Faction getById(Long id) {
        return factionRepository.findById(id).orElse(null);
    }

    @Override
    public Faction saveOrUpdate(Faction faction) {
        factionRepository.save(faction);
        return faction;
    }

    @Override
    public void delete(Long id) {
        factionRepository.deleteById(id);

    }

    @Override
    public Faction saveOrUpdateFactionForm(FactionForm factionForm) {
        Faction savedFaction = saveOrUpdate(factionFormToFaction.convert(factionForm));

        System.out.println("Saved Faction Id: " + savedFaction.getId());
        return savedFaction;
    }
}

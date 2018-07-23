package penultimate.psychohistory.services;

import penultimate.psychohistory.commands.FactionForm;
import penultimate.psychohistory.domain.Faction;
import java.util.List;

public interface FactionService {

    List<Faction> listAll();

    Faction getById(Long id);

    Faction saveOrUpdate(Faction faction);

    void delete(Long id);

    Faction saveOrUpdateFactionForm(FactionForm factionForm);
}

package penultimate.psychohistory.services;

import penultimate.psychohistory.commands.PopulatedSystemForm;
import penultimate.psychohistory.domain.PopulatedSystem;
import java.util.List;

public interface PopulatedSystemService {

    List<PopulatedSystem> listAll();

    PopulatedSystem getById(Long id);

    PopulatedSystem saveOrUpdate(PopulatedSystem populatedSystem);

    void delete(Long id);

    PopulatedSystem saveOrUpdatePopulatedSystemForm(PopulatedSystemForm populatedSystemForm);
}

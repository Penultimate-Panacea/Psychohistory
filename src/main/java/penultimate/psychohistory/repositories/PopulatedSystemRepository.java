package penultimate.psychohistory.repositories;

import penultimate.psychohistory.domain.PopulatedSystem;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface PopulatedSystemRepository extends Neo4jRepository<PopulatedSystem, Long> {
}

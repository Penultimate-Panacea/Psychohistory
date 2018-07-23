package penultimate.psychohistory.repositories;

import penultimate.psychohistory.domain.Faction;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface StationRepository extends Neo4jRepository<Faction, Long> {
}

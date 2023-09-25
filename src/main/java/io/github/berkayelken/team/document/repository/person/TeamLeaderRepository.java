package io.github.berkayelken.team.document.repository.person;

import io.github.berkayelken.team.document.domain.person.TeamLeader;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamLeaderRepository extends CrudRepository<TeamLeader, String> {
}

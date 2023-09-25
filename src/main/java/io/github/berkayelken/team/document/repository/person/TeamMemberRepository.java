package io.github.berkayelken.team.document.repository.person;

import io.github.berkayelken.team.document.domain.person.TeamMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamMemberRepository extends CrudRepository<TeamMember, String> {
	List<TeamMember> findAllByLeaderId(String leaderId);
	List<TeamMember> findAllByChapterId(String chapterId);
	List<TeamMember> findAllBySquadId(String squadId);
}

package io.github.berkayelken.team.document.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeamMemberTest {

	@Test
	public void testTeamMemberDefaultConstructor() {
		Assertions.assertNotNull(new TeamMember());
	}

	@Test
	public void testTeamMemberId() {
		TeamMember teamMember = new TeamMember();

		teamMember.setId(1);
		Assertions.assertEquals(1, teamMember.getId());
	}

	@Test
	public void testTeamMemberName() {
		TeamMember teamMember = new TeamMember();

		teamMember.setName("Test Name");
		Assertions.assertEquals("Test Name", teamMember.getName());
	}

	@Test
	public void testTeamMemberSurname() {
		TeamMember teamMember = new TeamMember();

		teamMember.setSurname("Test Surname");
		Assertions.assertEquals("Test Surname", teamMember.getSurname());
	}

	@Test
	public void testTeamMemberLeaderId() {
		TeamMember teamMember = new TeamMember();

		teamMember.setLeaderId(1);
		Assertions.assertEquals(1, teamMember.getLeaderId());
	}

	@Test
	public void testTeamMemberChapterId() {
		TeamMember teamMember = new TeamMember();

		teamMember.setChapterId(1);
		Assertions.assertEquals(1, teamMember.getChapterId());
	}

	@Test
	public void testTeamMemberTeamId() {
		TeamMember teamMember = new TeamMember();

		teamMember.setTeamId(1);
		Assertions.assertEquals(1, teamMember.getTeamId());
	}
}

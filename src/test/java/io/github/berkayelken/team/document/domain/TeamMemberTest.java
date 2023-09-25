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

		teamMember.setId("id");
		Assertions.assertEquals("id", teamMember.getId());
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

		teamMember.setLeaderId("id");
		Assertions.assertEquals("id", teamMember.getLeaderId());
	}

	@Test
	public void testTeamMemberChapterId() {
		TeamMember teamMember = new TeamMember();

		teamMember.setChapterId("id");
		Assertions.assertEquals("id", teamMember.getChapterId());
	}

	@Test
	public void testTeamMemberTeamId() {
		TeamMember teamMember = new TeamMember();

		teamMember.setTeamId("id");
		Assertions.assertEquals("id", teamMember.getTeamId());
	}

	@Test
	public void testTeamMembersEquality() {
		TeamMember teamMember = new TeamMember();
		teamMember.setId("id");

		TeamMember teamMember2 = new TeamMember();
		teamMember2.setId("id");

		Assertions.assertEquals(teamMember, teamMember2);
	}
}

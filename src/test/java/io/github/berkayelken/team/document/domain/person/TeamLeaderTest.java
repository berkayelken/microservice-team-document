package io.github.berkayelken.team.document.domain.person;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TeamLeaderTest {
	@Test
	public void testTeamLeaderDefaultConstructor() {
		Assertions.assertNotNull(new TeamLeader());
	}

	@Test
	public void testTeamLeaderId() {
		TeamLeader leader = new TeamLeader();

		leader.setId("id");
		Assertions.assertEquals("id", leader.getId());
	}

	@Test
	public void testTeamLeaderName() {
		TeamLeader leader = new TeamLeader();

		leader.setName("Test Name");
		Assertions.assertEquals("Test Name", leader.getName());
	}

	@Test
	public void testTeamLeaderSurname() {
		TeamLeader leader = new TeamLeader();

		leader.setSurname("Test Surname");
		Assertions.assertEquals("Test Surname", leader.getSurname());
	}

	@Test
	public void testTeamMembersEquality() {
		TeamLeader leader = new TeamLeader();
		leader.setId("id");

		TeamLeader leader2 = new TeamLeader();
		leader2.setId("id");

		Assertions.assertEquals(leader, leader2);
	}

}

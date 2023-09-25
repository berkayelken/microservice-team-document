package io.github.berkayelken.team.document.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquadTest {
	@Test
	public void testSquadDefaultConstructor() {
		Assertions.assertNotNull(new Squad());
	}

	@Test
	public void testSquadId() {
		Squad squad = new Squad();

		squad.setId("id");
		Assertions.assertEquals("id", squad.getId());
	}

	@Test
	public void testSquadName() {
		Squad squad = new Squad();

		squad.setName("Test Name");
		Assertions.assertEquals("Test Name", squad.getName());
	}

	@Test
	public void testSquadProductOwner() {
		Squad squad = new Squad();

		squad.setProductOwner("Test Product Owner");
		Assertions.assertEquals("Test Product Owner", squad.getProductOwner());
	}

	@Test
	public void testSquadResponsibleLeaderId() {
		Squad squad = new Squad();

		squad.setResponsibleLeaderId("id");
		Assertions.assertEquals("id", squad.getResponsibleLeaderId());
	}

	@Test
	public void testTeamMembersEquality() {
		Squad squad = new Squad();
		squad.setId("id");

		Squad squad2 = new Squad();
		squad2.setId("id");

		Assertions.assertEquals(squad, squad2);
	}
}

package io.github.berkayelken.team.document.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ChapterTest {
	@Test
	public void testChapterDefaultConstructor() {
		Assertions.assertNotNull(new Chapter());
	}

	@Test
	public void testChapterId() {
		Chapter chapter = new Chapter();

		chapter.setId("id");
		Assertions.assertEquals("id", chapter.getId());
	}

	@Test
	public void testChapterName() {
		Chapter chapter = new Chapter();

		chapter.setName("Test Name");
		Assertions.assertEquals("Test Name", chapter.getName());
	}

	@Test
	public void testChapterManagerName() {
		Chapter chapter = new Chapter();

		chapter.setManagerName("Test Manager Name");
		Assertions.assertEquals("Test Manager Name", chapter.getManagerName());
	}

	@Test
	public void testTeamMembersEquality() {
		Chapter chapter = new Chapter();
		chapter.setId("id");

		Chapter chapter2 = new Chapter();
		chapter2.setId("id");

		Assertions.assertEquals(chapter, chapter2);
	}
}

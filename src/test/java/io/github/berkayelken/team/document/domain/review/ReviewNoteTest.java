package io.github.berkayelken.team.document.domain.review;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ReviewNoteTest {
	@Test
	public void testReviewNoteDefaultConstructor() {
		Assertions.assertNotNull(new ReviewNote());
	}

	@Test
	public void testReviewNoteId() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setId("id");
		Assertions.assertEquals("id", reviewNote.getId());
	}

	@Test
	public void testReviewNoteReviewedPersonId() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setReviewedPersonId("id");
		Assertions.assertEquals("id", reviewNote.getReviewedPersonId());
	}

	@Test
	public void testReviewNoteReviewerId() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setReviewerId("id");
		Assertions.assertEquals("id", reviewNote.getReviewerId());
	}

	@Test
	public void testReviewNoteType() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setType(ReviewNoteType.ONE_TO_ONE);
		Assertions.assertEquals(ReviewNoteType.ONE_TO_ONE, reviewNote.getType());

		reviewNote.setType(ReviewNoteType.MONTHLY);
		Assertions.assertEquals(ReviewNoteType.MONTHLY, reviewNote.getType());

		reviewNote.setType(ReviewNoteType.PERFORMANCE_PERIOD);
		Assertions.assertEquals(ReviewNoteType.PERFORMANCE_PERIOD, reviewNote.getType());
	}

	@Test
	public void testReviewNoteExpectationType() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setExpectationType(ExpectationType.TECHNICAL);
		Assertions.assertEquals(ExpectationType.TECHNICAL, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.SOFT);
		Assertions.assertEquals(ExpectationType.SOFT, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.NECESSITY);
		Assertions.assertEquals(ExpectationType.NECESSITY, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.TO_COMPANY);
		Assertions.assertEquals(ExpectationType.TO_COMPANY, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.TO_CUSTOMER);
		Assertions.assertEquals(ExpectationType.TO_CUSTOMER, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.TO_ORGANIZATION);
		Assertions.assertEquals(ExpectationType.TO_ORGANIZATION, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.FROM_COMPANY);
		Assertions.assertEquals(ExpectationType.FROM_COMPANY, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.FROM_CUSTOMER);
		Assertions.assertEquals(ExpectationType.FROM_CUSTOMER, reviewNote.getExpectationType());

		reviewNote.setExpectationType(ExpectationType.FROM_COMPANY);
		Assertions.assertEquals(ExpectationType.FROM_COMPANY, reviewNote.getExpectationType());
	}

	@Test
	public void testReviewNoteReviewRatingAtBeginning() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setRatingAtBeginning(ReviewRating.NEED_IMPROVING);
		Assertions.assertEquals(1, reviewNote.getRatingAtBeginning().getRatingValue());

		reviewNote.setRatingAtBeginning(ReviewRating.UNDER_IMPROVING);
		Assertions.assertEquals(2, reviewNote.getRatingAtBeginning().getRatingValue());

		reviewNote.setRatingAtBeginning(ReviewRating.IMPROVED);
		Assertions.assertEquals(3, reviewNote.getRatingAtBeginning().getRatingValue());

		reviewNote.setRatingAtBeginning(ReviewRating.ABOVE_EXPECTATIONS);
		Assertions.assertEquals(4, reviewNote.getRatingAtBeginning().getRatingValue());

		reviewNote.setRatingAtBeginning(ReviewRating.EXCELLENT);
		Assertions.assertEquals(5, reviewNote.getRatingAtBeginning().getRatingValue());
	}

	@Test
	public void testReviewNoteRemarkAtBeginning() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setRemarkAtBeginning("Remark");
		Assertions.assertEquals("Remark", reviewNote.getRemarkAtBeginning());
	}

	@Test
	public void testReviewNoteImprovingDeadline() {
		ReviewNote reviewNote = new ReviewNote();

		LocalDate deadline = LocalDate.now();
		reviewNote.setImprovingDeadline(deadline);
		Assertions.assertEquals(deadline, reviewNote.getImprovingDeadline());
	}

	@Test
	public void testReviewNoteReviewRatingAtTheEnd() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setRatingAtTheEnd(ReviewRating.NEED_IMPROVING);
		Assertions.assertEquals(1, reviewNote.getRatingAtTheEnd().getRatingValue());

		reviewNote.setRatingAtTheEnd(ReviewRating.UNDER_IMPROVING);
		Assertions.assertEquals(2, reviewNote.getRatingAtTheEnd().getRatingValue());

		reviewNote.setRatingAtTheEnd(ReviewRating.IMPROVED);
		Assertions.assertEquals(3, reviewNote.getRatingAtTheEnd().getRatingValue());

		reviewNote.setRatingAtTheEnd(ReviewRating.ABOVE_EXPECTATIONS);
		Assertions.assertEquals(4, reviewNote.getRatingAtTheEnd().getRatingValue());

		reviewNote.setRatingAtTheEnd(ReviewRating.EXCELLENT);
		Assertions.assertEquals(5, reviewNote.getRatingAtTheEnd().getRatingValue());
	}

	@Test
	public void testReviewNoteRemarkAtTheEnd() {
		ReviewNote reviewNote = new ReviewNote();

		reviewNote.setRemarkAtTheEnd("Remark");
		Assertions.assertEquals("Remark", reviewNote.getRemarkAtTheEnd());
	}

	@Test
	public void testReviewNoteEquality() {
		ReviewNote reviewNote = new ReviewNote();
		reviewNote.setId("id");

		ReviewNote reviewNote2 = new ReviewNote();
		reviewNote2.setId("id");

		Assertions.assertEquals(reviewNote, reviewNote2);
	}

}

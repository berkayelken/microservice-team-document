package io.github.berkayelken.team.document.repository.review;

import io.github.berkayelken.team.document.domain.person.ManagerType;
import io.github.berkayelken.team.document.domain.review.ExpectationType;
import io.github.berkayelken.team.document.domain.review.ReviewNote;
import io.github.berkayelken.team.document.domain.review.ReviewNoteType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReviewNoteRepository extends CrudRepository<ReviewNote, String> {
	List<ReviewNote> findAllByReviewedPersonId(String reviewedPersonId);
	List<ReviewNote> findAllByReviewedPersonIdAndExpectationType(String reviewedPersonId, ExpectationType expectationType);
	List<ReviewNote> findAllByReviewedPersonIdAndExpectationTypeContains(String reviewedPersonId, List<ExpectationType> expectationTypes);
	List<ReviewNote> findAllByReviewedPersonIdAndType(String reviewedPersonId, ReviewNoteType type);
	List<ReviewNote> findAllByReviewedPersonIdAndReviewerType(String reviewedPersonId, ManagerType reviewerType);
	List<ReviewNote> findAllByReviewedPersonIdAndDateAfter(String reviewedPersonId, LocalDate startingDate);
	List<ReviewNote> findAllByReviewedPersonIdAndImprovingDeadlineAfter(String reviewedPersonId, LocalDate startingDate);
}

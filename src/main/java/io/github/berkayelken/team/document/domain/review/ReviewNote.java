package io.github.berkayelken.team.document.domain.review;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.Objects;

@Getter
@Setter
@ToString
public class ReviewNote {
	@Id
	@MongoId (targetType = FieldType.STRING)
	private String id;
	private String reviewedPersonId;
	private String reviewerId;
	private ReviewNoteType type;
	private ExpectationType expectationType;
	private ReviewRating ratingAtBeginning;
	private String remarkAtBeginning;
	private LocalDate improvingDeadline;
	private ReviewRating ratingAtTheEnd;
	private String remarkAtTheEnd;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		ReviewNote that = (ReviewNote) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

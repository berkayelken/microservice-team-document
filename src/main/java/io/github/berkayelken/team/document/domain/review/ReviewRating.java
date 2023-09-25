package io.github.berkayelken.team.document.domain.review;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ReviewRating {
	NEED_IMPROVING(1), UNDER_IMPROVING(2), IMPROVED(3), ABOVE_EXPECTATIONS(4), EXCELLENT(5);

	private final int ratingValue;
}

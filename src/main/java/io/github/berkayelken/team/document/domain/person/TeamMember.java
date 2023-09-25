package io.github.berkayelken.team.document.domain.person;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

@Getter
@Setter
@ToString
public class TeamMember {
	@Id
	@MongoId (targetType = FieldType.STRING)
	private String id;
	private String name;
	private String surname;
	private LocalDate birthdate;
	private LocalDateTime startingDateOfEmployment;
	private int exExperienceAsMonth;
	private String leaderId;
	private String chapterId;
	private String squadId;

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		TeamMember that = (TeamMember) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}

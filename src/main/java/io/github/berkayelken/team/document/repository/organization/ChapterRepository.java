package io.github.berkayelken.team.document.repository.organization;

import io.github.berkayelken.team.document.domain.organization.Chapter;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChapterRepository extends CrudRepository<Chapter, String> {
}

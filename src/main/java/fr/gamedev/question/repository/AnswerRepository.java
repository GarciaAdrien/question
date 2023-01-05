package fr.gamedev.question.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import fr.gamedev.question.data.Answer;

/**
 * @author djer1
 *
 */
@RepositoryRestResource(collectionResourceRel = "answer", path = "answer")
@SuppressWarnings({ "checkstyle:HideUtilityClassConstructor" })
public interface AnswerRepository extends PagingAndSortingRepository<Answer, Long> { }

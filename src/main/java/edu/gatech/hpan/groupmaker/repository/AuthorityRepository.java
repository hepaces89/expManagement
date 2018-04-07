package edu.gatech.hpan.groupmaker.repository;

import edu.gatech.hpan.groupmaker.domain.Authority;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for the Authority entity.
 */
public interface AuthorityRepository extends MongoRepository<Authority, String> {
}

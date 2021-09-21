package io.swagger.repository;

import io.swagger.model.Service;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServiceRepository extends Neo4jRepository<Service, String> {
}

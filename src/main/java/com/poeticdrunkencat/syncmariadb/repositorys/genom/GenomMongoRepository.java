package com.poeticdrunkencat.syncmariadb.repositorys.genom;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface GenomMongoRepository extends MongoRepository<Genom,String> {
}


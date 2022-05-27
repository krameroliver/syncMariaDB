package com.poeticdrunkencat.syncmariadb.repositorys.tech;

import com.poeticdrunkencat.syncmariadb.entitys.transaction_state;
import org.springframework.data.repository.CrudRepository;

public interface techRepossitory extends CrudRepository<transaction_state, Integer> {
}

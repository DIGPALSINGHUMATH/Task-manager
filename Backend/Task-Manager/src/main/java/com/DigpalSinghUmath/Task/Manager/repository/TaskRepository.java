package com.DigpalSinghUmath.Task.Manager.repository;

import com.DigpalSinghUmath.Task.Manager.document.TaskDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends MongoRepository<TaskDocument,String> {
}

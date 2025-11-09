package com.DigpalSinghUmath.Task.Manager.document;

import com.DigpalSinghUmath.Task.Manager.document.enums.StatusTask;
import com.DigpalSinghUmath.Task.Manager.document.enums.TaskPriority;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "tasks")
@Getter
@Setter
@Data
public class TaskDocument {

    @Id
    private String id;
    private String task;
    private String description;
    private StatusTask status;
    private TaskPriority taskPriority;
    private LocalDate dueDate;



}

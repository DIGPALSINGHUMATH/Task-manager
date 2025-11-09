package com.DigpalSinghUmath.Task.Manager.dto.requestDto;

import com.DigpalSinghUmath.Task.Manager.document.enums.StatusTask;
import com.DigpalSinghUmath.Task.Manager.document.enums.TaskPriority;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TaskReqDto {
    private String task;
    private String description;
    private StatusTask status;
    private TaskPriority taskPriority;
    private LocalDate dueDate;
}

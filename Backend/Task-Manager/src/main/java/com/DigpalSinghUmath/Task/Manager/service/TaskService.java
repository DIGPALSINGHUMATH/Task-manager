package com.DigpalSinghUmath.Task.Manager.service;

import com.DigpalSinghUmath.Task.Manager.dto.requestDto.TaskReqDto;
import com.DigpalSinghUmath.Task.Manager.dto.responseDto.TaskrespDto;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface TaskService {

    TaskrespDto createTask(TaskReqDto taskReqDto);

    TaskrespDto getByIdTask(String id);

    TaskrespDto updateTaskById(String id, TaskReqDto taskReqDto);

    void deletetaskById(String id);
}

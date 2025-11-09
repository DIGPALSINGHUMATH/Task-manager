package com.DigpalSinghUmath.Task.Manager.controller;

import com.DigpalSinghUmath.Task.Manager.dto.requestDto.TaskReqDto;
import com.DigpalSinghUmath.Task.Manager.dto.responseDto.TaskrespDto;
import com.DigpalSinghUmath.Task.Manager.service.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping
    public ResponseEntity<TaskrespDto> createTask(@RequestBody TaskReqDto taskReqDto){
        return new ResponseEntity<>(taskService.createTask(taskReqDto), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskrespDto> getAllTask(@PathVariable String id){
        return ResponseEntity.ok(taskService.getByIdTask(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskrespDto> updateTask(@PathVariable String id,@RequestBody TaskReqDto taskReqDto ){
        TaskrespDto taskrespDtto = taskService.updateTaskById(id,taskReqDto);
        return ResponseEntity.ok(taskrespDtto);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> DeleteTask(@PathVariable String id){
        taskService.deletetaskById(id);
        return ResponseEntity.noContent().build();
    }
}

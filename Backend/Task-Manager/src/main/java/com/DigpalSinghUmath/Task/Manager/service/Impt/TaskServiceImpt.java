package com.DigpalSinghUmath.Task.Manager.service.Impt;

import com.DigpalSinghUmath.Task.Manager.document.TaskDocument;
import com.DigpalSinghUmath.Task.Manager.dto.requestDto.TaskReqDto;
import com.DigpalSinghUmath.Task.Manager.dto.responseDto.TaskrespDto;
import com.DigpalSinghUmath.Task.Manager.repository.TaskRepository;
import com.DigpalSinghUmath.Task.Manager.service.TaskService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Collections;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TaskServiceImpt implements TaskService {
    private final TaskRepository taskRepository;
    private final ModelMapper modelMapper;


    @Override
    public TaskrespDto createTask(TaskReqDto taskReqDto) {
        TaskDocument taskDocument = modelMapper.map(taskReqDto , TaskDocument.class);
        TaskDocument saveTask = taskRepository.save(taskDocument);
        return modelMapper.map(saveTask, TaskrespDto.class);
    }

    @Override
    public TaskrespDto getByIdTask(String id) {
        TaskDocument taskDocumentList = taskRepository.findById(id).orElseThrow(()-> new RuntimeException("not found by id "));
        return modelMapper.map(taskDocumentList, TaskrespDto.class);
    }

    @Override
    public TaskrespDto updateTaskById(String id,TaskReqDto taskReqDto) {
        TaskDocument taskDocument = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("not found by id ") );
        modelMapper.map(taskReqDto , taskDocument);
        TaskDocument savedata = taskRepository.save(taskDocument);

        return modelMapper.map(savedata ,TaskrespDto.class );
    }

    @Override
    public void deletetaskById(String id) {
        boolean isExit= taskRepository.existsById(id);
        if(!isExit){
            throw new RuntimeException("not exits is id : "+ id);
        }
        taskRepository.deleteById(id);
    }
}

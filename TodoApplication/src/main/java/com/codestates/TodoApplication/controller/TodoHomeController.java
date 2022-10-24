package com.codestates.TodoApplication.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoHomeController {

    @GetMapping("/")
    public String helloWorld(){
        return "To-Do Application !";
    }

    // 투두 포스팅
    @PostMapping
    public ResponseEntity postTodo(){
        return null;
    }

    // 투두 수정
    @PatchMapping
    public ResponseEntity patchTodo(){
        return null;
    }

    // 투두 조회
    @GetMapping
    public ResponseEntity getTodo(){
        return null;
    }

    // 투두 페이지 조회
    @GetMapping
    public ResponseEntity getTodos(){
        return null;
    }

    // 투두 삭제
    @DeleteMapping
    public ResponseEntity deleteTodo(){
        return null;
    }
}

package com.codestates.TodoApplication.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

public class TodoDto {

    @Getter
    public static class Post{
        private String title;
        private Boolean completed;
        private int orders;
    }

    @Getter @Setter
    public static class Patch{
        private long id;
        private String title;
        private Boolean completed;
        private int orders;

    }

    @Getter
    @Builder
    public static class Response{
        private int id;
        private String title;
        private Boolean completed;
        private int orders;
    }
}

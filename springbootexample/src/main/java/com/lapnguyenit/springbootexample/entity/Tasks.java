package com.lapnguyenit.springbootexample.entity;

import com.lapnguyenit.springbootexample.entity.keys.IdTasks;
import jakarta.persistence.*;

@Entity(name = "tasks")
@IdClass(IdTasks.class)
public class Tasks {
    //vửa là khóa chính vừa là khóa ngoại
    @Id
    private int userId;
    @Id
    private int projectId;
    @ManyToOne
    @JoinColumn(name = "user_id" ,insertable = false,updatable = false) //ngăn ko cho khóa ngoại insert và update do confuse giữa khóa chính và khóa ngoại
    private Users user;
    @ManyToOne
    @JoinColumn(name = "project_id",insertable = false,updatable = false)
    private Projects project;


}

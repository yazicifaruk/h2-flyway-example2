package com.db.dbh2repoexp;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
public class ToDoItem{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name="userName")
    private String userName;

    @Column(name="text")
    private String text;

    @Column(name="Status")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name="Date")
    @Temporal(TemporalType.DATE)
    private Date due_Date;

    @Column(name="Time")
    private Time estimate_time;

    @Column(name="create_date_Time")
    private LocalDateTime create_date_Time;

}

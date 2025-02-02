package com.ssebide.runners.run;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@Repository
public class RunRepository {

    public static final Logger log = LoggerFactory.getLogger(RunRepository.class);
    private final JdbcClient jdbcClient;

    public RunRepository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    public List<Run> findAll() {
        return jdbcClient.sql("select * from run")
        .query(Run.class)
        .list();
    }
    // List<Run> findAll() {
    //     return runs;
    // }

    // Optional<Run> findById(Integer id){
    //     return runs.stream()  
    //     .filter(run -> run.id() == id)
    //     .findFirst();
    // }

    // void create(Run run){
    //     runs.add(run);
    // }

    // void update(Run run, Integer id){
    //     Optional<Run> existingRun = findById(id);
    //     if(existingRun.isPresent()){
    //         runs.set(runs.indexOf(existingRun.get()), run);
    //     }
    // }

    // void delete(Integer id){
    //     runs.removeIf(run -> run.id().equals(id));
    // }

    // @PostConstruct
    // private void init() {
    //     runs.add(new Run (
    //         1,
    //         "Monday Morning Run",
    //         LocalDateTime.now(),
    //         LocalDateTime.now().plus(30, ChronoUnit.MINUTES),
    //         3,
    //         Location.INDOOR
    //     ));

    //     runs.add(new Run (
    //         2,
    //         "Wednesday Evening Run",
    //         LocalDateTime.now(),
    //         LocalDateTime.now().plus(60, ChronoUnit.MINUTES),
    //         6,
    //         Location.INDOOR
    //     ));
    // }

}

package com.artbrain.jpa;

import com.artbrain.entity.Level;
import com.artbrain.entity.Question;
import com.artbrain.entity.Solution;
import org.aspectj.weaver.patterns.TypePatternQuestions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2016/12/2 0002.
 */

@Repository
public interface QusRepo extends JpaRepository<Question, Integer> {



    @Query("select q from Question q where q.id =?1")
    Question find(int id);

    @Query("from Question q where q.sort=?1")
    Solution findbySort(int sort);

    @Query("from Question q where q.sort != null")
    List<Question> findAll();


}

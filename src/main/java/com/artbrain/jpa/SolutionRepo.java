package com.artbrain.jpa;

import com.artbrain.entity.Solution;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2016/12/2 0002.
 */
@Repository
public interface SolutionRepo extends JpaRepository<Solution, Integer> {


    @Query("from Solution s where s.username =?1 and s.question =?2")
    Solution findbyUseridAndQid(String username,int question);


}

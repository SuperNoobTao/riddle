package com.artbrain.Service;

import com.artbrain.entity.Solution;
import com.artbrain.jpa.SolutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
@Service
public class SolutionService {

    @Autowired
    private SolutionRepo solutionRepo;

    public Boolean save(Solution solution){
        if (solutionRepo.findbyUseridAndQid(solution.getUsername(),solution.getQuestion())!=null) {
            return false;
        }else{
            solutionRepo.save(solution);
            return true;
        }
    }


}

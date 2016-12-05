package com.artbrain.Service;

import com.artbrain.entity.Question;
import com.artbrain.entity.Solution;
import com.artbrain.jpa.QusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/12/4 0004.
 */


@Service
public class QuesService {

    @Autowired
    QusRepo qusRepo;

    public Boolean save(Question question){
        if (qusRepo.findbySort(question.getSort())!=null) {
            return false;
        }else{
            qusRepo.save(question);
            return true;
        }
    }


}

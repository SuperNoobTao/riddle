package com.artbrain.controller;

import com.artbrain.Service.QuesService;
import com.artbrain.entity.Level;
import com.artbrain.entity.Question;
import com.artbrain.entity.Solution;
import com.artbrain.jpa.QusRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
@Controller
public class QusCon {


    @Autowired
    private QusRepo qusRepo;
    @Autowired
    private QuesService quesService;


    /**
     * 进入问题主页面
     * @param mav
     * @return
     */
    @RequestMapping("/question")
    public ModelAndView qList(ModelAndView mav){
        List<Question> qList = qusRepo.findAll();
        mav.addObject("list",qList);
        mav.setViewName("question/qlist");
        return mav;
    }






}

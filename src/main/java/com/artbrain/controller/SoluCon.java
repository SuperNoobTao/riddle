package com.artbrain.controller;

import com.artbrain.entity.Level;
import com.artbrain.entity.Solution;
import com.artbrain.jpa.ListRepo;
import com.artbrain.jpa.SolutionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
@Controller
public class SoluCon {

    @Autowired
    SolutionRepo solutionRepo;

    @Autowired
    ListRepo listRepo;


    /**
     * 回答问题
     * @param mav
     * @param username
     * @param qid
     * @param answer
     * @return
     */
    @RequestMapping("/save")
    public ModelAndView save(ModelAndView mav,String username,int qid,String answer){
        Solution solution = new Solution(username,qid,answer);
        solutionRepo.save(solution);
        mav.setViewName("success");
        return mav;
    }


    /**
     * 进入中奖列表
     * @param mav
     * @return
     */
    @RequestMapping("/back")
    public ModelAndView back(ModelAndView mav){
        List<Level> list = listRepo.list();
        mav.addObject("list",list);
        mav.setViewName("list");
        return mav;
    }


}

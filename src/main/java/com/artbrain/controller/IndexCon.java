package com.artbrain.controller;

import com.artbrain.Service.SolutionService;
import com.artbrain.entity.Level;
import com.artbrain.entity.Solution;

import com.artbrain.util.CommonFunction;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
@Controller
public class IndexCon {

    @Autowired
    SolutionService solutionService;

    /**
     * 进入主页面，如果活动结束，则进入结束页面
     * @param mav
     * @return
     * @throws ParseException
     */
    @RequestMapping("/")
    public ModelAndView index(ModelAndView mav) throws ParseException {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2016-12-15");
        Date today = new Date();
        if (CommonFunction.compare(today, date)) {
            mav.setViewName("index");
        } else {
            mav.setViewName("hdjs");
        }
        return mav;
    }


    /**
     * 进入问题一
     * @param mav
     * @return
     */
    @RequestMapping("/question1")
    public ModelAndView q1(ModelAndView mav) {
        mav.addObject("q",1);
        mav.setViewName("index1");
        return mav;
    }


    /**
     * 进入问题二
     * @param mav
     * @return
     */
    @RequestMapping("/question2")
    public ModelAndView q2(ModelAndView mav) {
        mav.addObject("q",2);
        mav.setViewName("index2");
        return mav;
    }

    /**
     * 进入问题三
     * @param mav
     * @return
     */
    @RequestMapping("/question3")
    public ModelAndView q3(ModelAndView mav) {
        mav.addObject("q",3);
        mav.setViewName("index3");
        return mav;
    }


    /**
     * 提交问题一的答案
     * @param mav
     * @param username
     * @param answer
     * @return
     */
    @RequestMapping("/save1")
    public ModelAndView save1(ModelAndView mav, String username, String answer) {
        int qid = 1;
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(answer)) {
            mav.addObject("q",qid);
            mav.setViewName("null");
            return mav;
        }
        Solution solution = new Solution(username, qid, answer);
        if (solutionService.save(solution)) {
            mav.addObject("q",qid);
            mav.setViewName("success");
        } else {
            mav.addObject("q",qid);
            mav.setViewName("failed");
        }
        return mav;
    }

    /**
     * 提交问题二的答案
     * @param mav
     * @param username
     * @param answer
     * @return
     */
    @RequestMapping("/save2")
    public ModelAndView save2(ModelAndView mav, String username, String answer) {
        int qid = 2;
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(answer)) {
            mav.addObject("q",qid);
            mav.setViewName("null");
            return mav;
        }
        Solution solution = new Solution(username, qid, answer);
        if (solutionService.save(solution)) {
            mav.addObject("q",qid);
            mav.setViewName("success");
        } else {
            mav.addObject("q",qid);
            mav.setViewName("failed");
        }
        return mav;
    }

    /**
     * 提交问题三的答案
     * @param mav
     * @param username
     * @param answer
     * @return
     */
    @RequestMapping("/save3")
    public ModelAndView save3(ModelAndView mav, String username, String answer) {
        int qid = 3;
        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(answer)) {
            mav.addObject("q",qid);
            mav.setViewName("null");
            return mav;
        }
        Solution solution = new Solution(username, qid, answer);
        if (solutionService.save(solution)) {
            mav.addObject("q",qid);
            mav.setViewName("success");
        } else {
            mav.addObject("q",qid);
            mav.setViewName("failed");
        }
        return mav;
    }

}

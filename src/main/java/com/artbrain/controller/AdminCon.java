package com.artbrain.controller;

import com.artbrain.entity.Level;
import com.artbrain.jpa.AdminRepo;
import com.artbrain.jpa.ListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Administrator on 2016/12/3 0003.
 */
@Controller
public class AdminCon {

    @Autowired
    ListRepo listRepo;
    @Autowired
    AdminRepo adminRepo;

    /**
     * 登录页面
     * @param mav
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public ModelAndView loginPage(ModelAndView mav){
        mav.setViewName("login");
        return mav;
    }

    /**
     * 登录
     * @param mav
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public ModelAndView login(ModelAndView mav,String username,String password){
        if (adminRepo.findByName(username,password)!=null) {
            mav.setViewName("admin/admin");
        }else{
            mav.setViewName("/login");
        }
        return mav;
    }


    /**
     * 用户列表
     * @param mav
     * @return
     */
    @RequestMapping("/user")
    public ModelAndView userlist(ModelAndView mav){
        List<Level> userlist = listRepo.list();
        mav.addObject("list",userlist);
        mav.setViewName("userlist/userlist");
        return mav;
    }

    /**
     * 用户列表 没有答对的
     * @param mav
     * @return
     */
    @RequestMapping("/0")
    public ModelAndView list0(ModelAndView mav){
        List<Level> userlist = listRepo.listbynum(0);
        mav.addObject("list",userlist);
        mav.setViewName("userlist/userlist");
        return mav;
    }

    /**
     * 用户列表 答对一个
     * @param mav
     * @return
     */
    @RequestMapping("/1")
    public ModelAndView list1(ModelAndView mav){
        List<Level> userlist = listRepo.listbynum(1);
        mav.addObject("list",userlist);
        mav.setViewName("userlist/userlist");
        return mav;
    }

    /**
     * 用户列表 答对二个
     * @param mav
     * @return
     */
    @RequestMapping("/2")
    public ModelAndView list2(ModelAndView mav){
        List<Level> userlist = listRepo.listbynum(2);
        mav.addObject("list",userlist);
        mav.setViewName("userlist/userlist");
        return mav;
    }

    /**
     * 用户列表 答对三个
     * @param mav
     * @return
     */
    @RequestMapping("/3")
    public ModelAndView list3(ModelAndView mav){
        List<Level> userlist = listRepo.listbynum(3);
        mav.addObject("list",userlist);
        mav.setViewName("userlist/userlist");
        return mav;
    }






}

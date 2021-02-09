package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.entity.User1;
import com.ssm.service.UserService;
import com.zhenzhen.common.utils.ExcelUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/list")
    @ResponseBody
//    public ModelAndView list(){
//        ModelAndView modelAndView = new ModelAndView();
//        List<User> list = userService.list();
//        modelAndView.addObject("list",list);
//        return modelAndView;
//    }
    public List<User> list(){
        return userService.list();
    }

    @RequestMapping("user")
    public String lists(Model model){
        List<User> list = userService.list();
        model.addAttribute("g",list);
        return "list";
    }

    @RequestMapping("upload")
    public void upload(HttpServletResponse response) throws IOException {
        User1 user1 = new User1();
        ExcelUtil.exportExcel(User1.class,"学生.xls",response);
    }

}

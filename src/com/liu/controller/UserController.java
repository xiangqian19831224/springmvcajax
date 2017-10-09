package com.liu.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.liu.po.UserInfo;

@Controller
public class UserController {

	@RequestMapping("/ajaxUser.do")
	public void userNumber(String userNumber, HttpServletResponse response) {
		System.out.println(userNumber);
		try {
			response.setContentType("text/html");
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();

			if ("liu".equals(userNumber)) {
				out.println("对不起，请从新输入账号");
			} else {
				out.println("恭喜你，账号可以使用");
			}

			out.flush();
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping("ajaxUser2.do")
	public @ResponseBody UserInfo ajaxUser(Integer userId) {
		
		System.out.println("编号：" + userId);
		
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId(userId);
		userInfo.setUserName("张三");
		userInfo.setUserSex("男");

		return userInfo;
	}

}

package com.hzsun.jcjy.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hzsun.jcjy.server.ServerTest;

@Controller
public class ControllerTest {
	@Autowired
	ServerTest  server;
	
	@RequestMapping("test")
	public void  controllerTest(HttpServletResponse response){
		String  str=server.getName();
		try {
			response.getOutputStream().write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

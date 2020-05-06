package com.my.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.my.site.service.MemberService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value="/")
	public ModelAndView main(ModelAndView mv) throws Exception{
		mv.setViewName("/main/home");
		mv.addObject("setHeader", "타일즈테스트");
		System.out.println(memberService.getEmail("1213terry"));
		return mv;
	}
	
	@RequestMapping(value= {"/main/home","/home.do"})
	public ModelAndView openTilesView(ModelAndView mv) throws Exception{
		mv.setViewName("/main/home");//타일즈 view => 일반 view
		mv.addObject("setHeader", "타일즈테스트");
		return mv;
	}
	
}
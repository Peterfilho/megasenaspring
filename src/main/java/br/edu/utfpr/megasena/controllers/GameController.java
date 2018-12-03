package br.edu.utfpr.megasena.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class GameController {

	@RequestMapping("/jogar")
	public ModelAndView game() {

		ModelAndView mv = new ModelAndView("view/gametype");

		return mv;
	}
	
	@RequestMapping(value = "/jogar", method = RequestMethod.POST)
	public ModelAndView gamePOST() {

		ModelAndView mv = new ModelAndView("view/game");

		return mv;
	}
	
}

package br.edu.utfpr.megasena.controllers;

import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.utfpr.megasena.models.GameModel;
import br.edu.utfpr.megasena.util.Sort;


@Controller
public class ResultController {
	
	

	@RequestMapping("/resultado")
	public ModelAndView game() {

		ModelAndView mv = new ModelAndView("view/result");
		
		
		return mv;
	}
	

	
}

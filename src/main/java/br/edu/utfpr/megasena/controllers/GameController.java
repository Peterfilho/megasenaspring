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
public class GameController {


	private Sort sort = new Sort();
	
	@RequestMapping("/jogar")
	public ModelAndView game() {

		ModelAndView mv = new ModelAndView("view/game");
		
		mv.addObject(new GameModel ());
		
		return mv;
	}
	
	@RequestMapping(value = "/result", method = RequestMethod.POST)
	public String sortear(@PathVariable("gameModel") TreeSet <Integer> resultSet, GameModel gameModel) {
		
		System.out.println(gameModel);
		sort.sort(gameModel);
		gameModel.getRaffle();
		
		
		return "redirect:/result";
	}
	
	

	
}

package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.Livro;
import application.model.LivroRepository;

@Controller
@RequestMapping("/livro")
public class LivroController {
    

  private LivroRepository LivroRepo;

    @RequestMapping("/list")
    public String list() {
        return "/WEB-INF/livro/list.jsp";
    }
    
}

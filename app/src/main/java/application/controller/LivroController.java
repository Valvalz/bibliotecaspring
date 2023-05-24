package application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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

    @RequestMapping("/insert")
    public String insert() {
      return "/WEB-INF/livro/insert.jsp";
    }
    
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@RequestParam("titulo") String titulo) {
      Livro livro = new Livro();
      livro.setTitulo(titulo);

      LivroRepo.save(livro);
      return "redirect:/livro/list";
    }
}

package Controllers;

import Model.Developer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Контроллер для главной страницы приложения.
 */

@Controller
public class Hello {

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String index(){
      return "index";
  }

  @RequestMapping(value = "developer", method = RequestMethod.GET)
    public ModelAndView developer(){
      return new ModelAndView("developer", "command",new Developer());
  }

  @RequestMapping(value = "/addDeveloper", method = RequestMethod.POST)
  public String addStudent(Developer developer, ModelMap model){
    model.addAttribute("id", developer.getId());
    model.addAttribute("name", developer.getName());
    model.addAttribute("specialty", developer.getSpecialty());
    model.addAttribute("experience", developer.getSpecialty());

    return "result";
  }

}
package pe.com.granmercado.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import pe.com.granmercado.model.Producto;
import pe.com.granmercado.service.ProductoService;

@RestController
public class ProductoController {
	@Autowired
	private ProductoService service;
	
	  @RequestMapping(value = "/getProductos" , method = RequestMethod.GET)
	
	    public List<Producto> message() {
		     
	        return service.getAll();
	    }

	
}
/*

public class PersonController {

private PersonService personService;
 
@Autowired(required=true)
@Qualifier(value="personService")
public void setPersonService(PersonService ps){
    this.personService = ps;
}
 
@RequestMapping(value = "/persons", method = RequestMethod.GET)
public String listPersons(Model model) {
    model.addAttribute("person", new Person());
    model.addAttribute("listPersons", this.personService.listPersons());
    return "person";
}
 
//For add and update person both
@RequestMapping(value= "/person/add", method = RequestMethod.POST)
public String addPerson(@ModelAttribute("person") Person p){
     
    if(p.getId() == 0){
        //new person, add it
        this.personService.addPerson(p);
    }else{
        //existing person, call update
        this.personService.updatePerson(p);
    }
     
    return "redirect:/persons";
     
}
 
@RequestMapping("/remove/{id}")
public String removePerson(@PathVariable("id") int id){
     
    this.personService.removePerson(id);
    return "redirect:/persons";
}

@RequestMapping("/edit/{id}")
public String editPerson(@PathVariable("id") int id, Model model){
    model.addAttribute("person", this.personService.getPersonById(id));
    model.addAttribute("listPersons", this.personService.listPersons());
    return "person";
}
 
}

*/
package fr.formation.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import fr.formation.inti.entity.Event;
import fr.formation.inti.service.EventServiceImpl;

@Controller
public class IndexController {

	@Autowired
	EventServiceImpl eventService;
	
	@GetMapping("/")
	public String defaultPath() {
		return "Pages/index";
	}
	
	@GetMapping("/index.html")
	public String index() {
		return "Pages/index";
	}
	
	
	@GetMapping("/about_us.html")
	public String aboutUs() {
		return "Pages/about_us";
	}
	
	@GetMapping("/accueil.html")
	public String accueil() {
		return "Pages/accueil";
	}
	
	@GetMapping("/all_stats.html")
	public String allStats() {
		return "Pages/all_stats";
	}
	
	@GetMapping("/CGU.html")
	public String CGU() {
		return "Pages/CGU";
	}
	
	@GetMapping("/create_event.html")
	public String createEvent(@ModelAttribute Event event) {
		return "Pages/create_event";
	}
	
	@PostMapping("/create_event.html")
	public String resutForm(Event event, Model model) {
		
		
		eventService.saveEvent(event);
		List<Event> list = eventService.findAll();
		model.addAttribute("listEvent", list);	
		return "Pages/event_list.html";
	}
	
	@GetMapping("/event_list.html")
	public String eventListG(Model model) {
		List<Event> list = eventService.findAll();
		
		model.addAttribute("listEvent", list);	
		return "Pages/event_list";
	}
	
	@PostMapping("/event_list.html")
	public String eventListP(Model model) {
		List<Event> list = eventService.findAll();
		
		model.addAttribute("listEvent", list);	
		return "Pages/event_list";
	}
	
	
	@GetMapping("/FAQ.html")
	public String FAQ() {
		return "Pages/FAQ";
	}
	
	@GetMapping("/galerie.html")
	public String galerie() {
		return "Pages/galerie";
	}
	
	@GetMapping("/info_event.html")
	public String infoEvent() {
		return "Pages/info_event";
	}
	
	@GetMapping("/infos_pratique.html")
	public String infoPratique() {
		return "Pages/infos_pratique";
	}
	
	@GetMapping("/join_event.html")
	public String joinEvent() {
		return "Pages/join_event";
	}
	
	@GetMapping("/login.html")
	public String login() {
		return "Pages/login";
	}
	
	@GetMapping("/my_event.html")
	public String myEvent() {
		return "Pages/my_event";
	}
	
	@GetMapping("/my_information.html")
	public String myInformation() {
		return "Pages/my_information";
	}
	
	@GetMapping("/new_stat_event.html")
	public String newStat() {
		return "Pages/new_stat_event";
	}
	
	@GetMapping("/register.html")
	public String register() {
		return "Pages/register";
	}
	
	@GetMapping("/stat_event.html")
	public String statEvent() {
		return "Pages/stat_event";
	}
	

}

package fr.formation.inti.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import fr.formation.inti.entity.Event;
import fr.formation.inti.entity.EventPagination;
import fr.formation.inti.service.EventPaginationService;
import fr.formation.inti.service.EventService;

@Controller
public class IndexController {
	

	@Autowired
	EventService eventService;
	
	@Autowired
	EventPaginationService eventPaginationService;
	
	
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
		return "Pages/event_list";
	}
	
	
	@GetMapping("/event_list.html")
	public String EventPageG2(Model model, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
		Long i = eventPaginationService.findAll();
		System.out.println(page);
		System.out.println(size);
		System.out.println(i);
		
		model.addAttribute("i",i);
		List<EventPagination> list = eventPaginationService.findAll(page-1, size);
		model.addAttribute("listEvent", list);
		model.addAttribute("size", size);
		model.addAttribute("page", page);
		Integer j=0;
		while(i>(size*j)) {
			j++;
		}
		model.addAttribute("pageMax", j);
		
		return "Pages/event_list";
	}
	
	@PostMapping("/event_list.html")
	public String EventPageP2(Model model, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
		Long i = eventPaginationService.findAll();
		System.out.println(page);
		System.out.println(size);
		System.out.println(i);
		
		model.addAttribute("i",i);
		List<EventPagination> list = eventPaginationService.findAll(page-1, size);
		model.addAttribute("listEvent", list);
		model.addAttribute("size", size);
		model.addAttribute("page", page);
		Integer j=0;
		while(i>(size*j)) {
			j++;
		}
		model.addAttribute("pageMax", j);
		
		return "Pages/event_list";
	}
	

	
	@GetMapping("/edit")
	public String edit(Model model, @RequestParam Integer i) {
		Optional<Event> event = eventService.findById(i);
			
		model.addAttribute("event", event);	
		return "Pages/modif";
	}
	
	@GetMapping("/del")
	public String del(Model model, @RequestParam Integer i) {
		eventService.deleteEvent(i);
		
		List<Event> list = eventService.findAll();
		
		model.addAttribute("listEvent", list);	
		return "Pages/event_list";
	}
	
	@PostMapping("/cherche")
	public String findP(Model model, @RequestParam String text) {
	
		List<Event> list = eventService.findByFind(text);
		
		model.addAttribute("listEvent", list);	
		return "Pages/event_list";
	}
	
	@GetMapping("/cherche")
	public String findG(Model model, @RequestParam String text) {
	
		List<Event> list = eventService.findByFind(text);
		
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

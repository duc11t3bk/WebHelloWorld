package webhelloworld;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	@GetMapping("/hello")
	public String hello(@RequestParam(name = "name", required = false, defaultValue = "") String name, Model model) {
		model.addAttribute("name", name);
		return "hello";
	}
	
	@GetMapping("/profile")
	public String profile(Model model) {
		List<Info> profiles = new ArrayList<Info>();
		profiles.add(new Info("fullname", "minh duc hoang"));
		profiles.add(new Info("nickname", "duchcm"));
		profiles.add(new Info("email", "duc11t3bk@gmail.com"));
		profiles.add(new Info("facebook", "https://www.facebook.com/minhduchoang93"));
		model.addAttribute("profiles", profiles);
		return "profile";
	}
}

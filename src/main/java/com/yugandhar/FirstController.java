package com.yugandhar;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {
	
	@GetMapping("/") 
    public String getMessage()
    {
        return "Spring Boot First Application in EC2 !!";
    }
	@GetMapping("/heros")
	public List<Hero> getHerosList() {

		List<Hero> heors = new ArrayList<>();
		heors.add(new Hero("chiru", "Valteru veeraiah", 150));
		heors.add(new Hero("Venky", "Laksmi", 90));
		heors.add(new Hero("Rajendra Prasad", "Kobbari bondam", 112));
		heors.add(new Hero("Charan", "Maga Dheera", 15));
		heors.add(new Hero("Allu Arjun", "Pushpa", 40));
		heors.add(new Hero("NTR", "Yama gola", 36));
		return heors;

	}

}

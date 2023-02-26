package kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {
	private ProgrammingLanguageService programmingLanguageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		return programmingLanguageService.getAll();
	}

	@PostMapping("/add")
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		 this.programmingLanguageService.add(createProgrammingLanguageRequest);
	}

}

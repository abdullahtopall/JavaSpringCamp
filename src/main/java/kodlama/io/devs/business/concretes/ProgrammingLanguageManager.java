package kodlama.io.devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;
import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
		ProgrammingLanguage programmingLanguage = new ProgrammingLanguage();
		programmingLanguage.setName(createProgrammingLanguageRequest.getName());
		
		this.programmingLanguageRepository.save(programmingLanguage);
	}

	@Override
	public List<GetAllProgrammingLanguagesResponse> getAll() {
		List<ProgrammingLanguage> programmingLanguages = programmingLanguageRepository.findAll();
		List<GetAllProgrammingLanguagesResponse> programmingLanguagesResponse = new ArrayList<GetAllProgrammingLanguagesResponse>();
		
		for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
			GetAllProgrammingLanguagesResponse responseItem = new GetAllProgrammingLanguagesResponse();
			responseItem.setId(programmingLanguage.getId());
			responseItem.setName(programmingLanguage.getName());
			
			programmingLanguagesResponse.add(responseItem);
		}
		
		return programmingLanguagesResponse;
		
	}
	
	
}

package kodlama.io.devs.business.abstracts;

import java.util.List;

import kodlama.io.devs.business.requests.CreateProgrammingLanguageRequest;
import kodlama.io.devs.business.responses.GetAllProgrammingLanguagesResponse;

public interface ProgrammingLanguageService {

	void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);

	List<GetAllProgrammingLanguagesResponse> getAll();

}

package jsample.module3.service;

import jsample.service.Operation;

public class SearchOperation implements Operation {

	@Override
	public String perform(String input) {
		System.out.println("Performing search operation using input - " + input);

		return "search result";
	}
}

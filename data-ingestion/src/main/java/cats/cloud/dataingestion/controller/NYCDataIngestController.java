package cats.cloud.dataingestion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cats.cloud.dataingestion.service.DataIngestionService;

@RestController
@RequestMapping("/nyc-data")
public class NYCDataIngestController {
	
	@Autowired
	DataIngestionService service;
	
	@GetMapping("/nyc")
	public String getNYCData(){
		service.saveNYCData();
		return "Ok";
	}
}

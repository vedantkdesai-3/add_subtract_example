package com.vmware.vmwareassigment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.vmwareassigment.ro.Input;
import com.vmware.vmwareassigment.ro.ResultRO;

@RestController
public class AddSubtractController {
	
	@GetMapping("/api/health")
	public String health() {
		return "UP";
	}
	
	@PostMapping("/api/add")
	public ResultRO add(@RequestBody Input input) {
		ResultRO resultRO = new ResultRO();
		resultRO.setResult(input.getX() + input.getY());
		return resultRO;
	}

	@PostMapping("/api/sub")
	public ResultRO sub(@RequestBody Input input) {
		ResultRO resultRO = new ResultRO();
		resultRO.setResult(input.getX() - input.getY());
		return resultRO;
	}

}

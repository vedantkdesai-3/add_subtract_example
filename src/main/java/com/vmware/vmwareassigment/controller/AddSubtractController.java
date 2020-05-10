package com.vmware.vmwareassigment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vmware.vmwareassigment.exception.object.ValueNotfoundException;
import com.vmware.vmwareassigment.ro.Input;
import com.vmware.vmwareassigment.ro.ResultRO;

@RestController
public class AddSubtractController {

	@PostMapping("/api/add")
	public ResultRO add(@RequestBody Input input) {
		validation(input);
		ResultRO resultRO = new ResultRO();
		resultRO.setResult(input.getX() + input.getY());
		return resultRO;
	}

	@PostMapping("/api/sub")
	public ResultRO sub(@RequestBody Input input) {
		validation(input);
		ResultRO resultRO = new ResultRO();
		resultRO.setResult(input.getX() - input.getY());
		return resultRO;
	}

	private void validation(Input input) throws ValueNotfoundException {
		if (input.getY() == null && input.getX() == null) {
			throw new ValueNotfoundException("X and Y value cannot be null/empty");
		}
		if (input.getX() == null) {
			throw new ValueNotfoundException("X value cannot be null/empty");
		}
		if (input.getY() == null) {
			throw new ValueNotfoundException("Y value cannot be null/empty");
		}
	}

}

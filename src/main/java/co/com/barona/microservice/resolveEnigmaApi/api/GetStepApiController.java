package co.com.barona.microservice.resolveEnigmaApi.api;

import co.com.barona.microservice.resolveEnigmaApi.model.GetEnigmaRequest;
import co.com.barona.microservice.resolveEnigmaApi.model.GetEnigmaStepResponse;
import co.com.barona.microservice.resolveEnigmaApi.model.Header;
import co.com.barona.microservice.resolveEnigmaApi.model.JsonApiBodyRequest;
import co.com.barona.microservice.resolveEnigmaApi.model.JsonApiBodyResponseErrors;
import co.com.barona.microservice.resolveEnigmaApi.model.JsonApiBodyResponseSuccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-05T20:40:20.597-05:00[America/Bogota]")
@Controller
public class GetStepApiController implements GetStepApi {
	
	public ResponseEntity<JsonApiBodyResponseSuccess> getStep(@ApiParam(value = "request body get enigma Step", required = true) @Valid @RequestBody JsonApiBodyRequest body){
		
		GetEnigmaRequest enigmaRequest = body.getData().get(0);
        Header header = enigmaRequest.getHeader();
        String id = header.getId();
        String type = header.getType();
        String enigma = enigmaRequest.getEnigma();

        String solution = "Step3: Put the giraffe in .)";

        GetEnigmaStepResponse response = new GetEnigmaStepResponse();
        response.setId(id);
        response.setType(type);
        response.setSolution(solution);

        JsonApiBodyResponseSuccess responseBody = new JsonApiBodyResponseSuccess();
        responseBody.addDataItem(response);

        return new ResponseEntity<>(responseBody, HttpStatus.OK);
	}
	
		@GetMapping("/get")
		public ResponseEntity<String> answerEnigma(String enigmaQuestion) {
		return new ResponseEntity<String>(" Step3: Close de door", HttpStatus.OK);
	}

}

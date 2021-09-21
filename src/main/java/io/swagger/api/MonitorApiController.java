package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Monitor;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-15T10:06:57.629Z[GMT]")
@RestController
public class MonitorApiController implements MonitorApi {

    private static final Logger log = LoggerFactory.getLogger(MonitorApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MonitorApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<Monitor>> listMonitor(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Monitor>>(objectMapper.readValue("[ {\n  \"request\" : {\n    \"method\" : \"method\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"header\" : [ {\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : \"value\"\n    }, {\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : \"value\"\n    } ],\n    \"to\" : \"to\",\n    \"body\" : \"body\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"@baseType\" : \"@baseType\",\n  \"response\" : {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"header\" : [ null, null ],\n    \"body\" : \"body\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"statusCode\" : \"statusCode\"\n  },\n  \"@type\" : \"@type\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"state\" : \"state\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"sourceHref\" : \"sourceHref\"\n}, {\n  \"request\" : {\n    \"method\" : \"method\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"header\" : [ {\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : \"value\"\n    }, {\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : \"value\"\n    } ],\n    \"to\" : \"to\",\n    \"body\" : \"body\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"@baseType\" : \"@baseType\",\n  \"response\" : {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"header\" : [ null, null ],\n    \"body\" : \"body\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"statusCode\" : \"statusCode\"\n  },\n  \"@type\" : \"@type\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"state\" : \"state\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"sourceHref\" : \"sourceHref\"\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Monitor>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Monitor>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Monitor> retrieveMonitor(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Monitor", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to provide in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Monitor>(objectMapper.readValue("{\n  \"request\" : {\n    \"method\" : \"method\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"header\" : [ {\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : \"value\"\n    }, {\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"value\" : \"value\"\n    } ],\n    \"to\" : \"to\",\n    \"body\" : \"body\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  },\n  \"@baseType\" : \"@baseType\",\n  \"response\" : {\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"header\" : [ null, null ],\n    \"body\" : \"body\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"statusCode\" : \"statusCode\"\n  },\n  \"@type\" : \"@type\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"state\" : \"state\",\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"sourceHref\" : \"sourceHref\"\n}", Monitor.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Monitor>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Monitor>(HttpStatus.NOT_IMPLEMENTED);
    }

}

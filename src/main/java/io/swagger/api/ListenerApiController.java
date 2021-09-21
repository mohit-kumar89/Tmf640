package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.EventSubscription;
import io.swagger.model.MonitorAttributeValueChangeEvent;
import io.swagger.model.MonitorCreateEvent;
import io.swagger.model.MonitorDeleteEvent;
import io.swagger.model.MonitorStateChangeEvent;
import io.swagger.model.ServiceAttributeValueChangeEvent;
import io.swagger.model.ServiceCreateEvent;
import io.swagger.model.ServiceDeleteEvent;
import io.swagger.model.ServiceStateChangeEvent;
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
public class ListenerApiController implements ListenerApi {

    private static final Logger log = LoggerFactory.getLogger(ListenerApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ListenerApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<EventSubscription> listenToMonitorAttributeValueChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody MonitorAttributeValueChangeEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToMonitorCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody MonitorCreateEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToMonitorDeleteEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody MonitorDeleteEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToMonitorStateChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody MonitorStateChangeEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceAttributeValueChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceAttributeValueChangeEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceCreateEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceCreateEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceDeleteEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceDeleteEvent body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<EventSubscription>(objectMapper.readValue("{\n  \"query\" : \"query\",\n  \"callback\" : \"callback\",\n  \"id\" : \"id\"\n}", EventSubscription.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<EventSubscription>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<EventSubscription> listenToServiceStateChangeEvent(@Parameter(in = ParameterIn.DEFAULT, description = "The event data", required=true, schema=@Schema()) @Valid @RequestBody ServiceStateChangeEvent body) {
        System.out.println("listner is listening to state changes in service");
        System.out.println("****************************************************************************************************************");
        System.out.println(body.toString());
        System.out.println("****************************************************************************************************************");
        return new ResponseEntity<EventSubscription>(HttpStatus.NOT_IMPLEMENTED);
    }

}

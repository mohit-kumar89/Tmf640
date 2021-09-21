package io.swagger.api;

import io.swagger.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.model.Error;
import io.swagger.repository.ServiceRepository;
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
import org.springframework.beans.factory.annotation.Autowired;
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
import java.util.Date;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-08-15T10:06:57.629Z[GMT]")
@RestController
public class ServiceApiController implements ServiceApi {

    private static final Logger log = LoggerFactory.getLogger(ServiceApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ServiceApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    @Autowired
    ServiceRepository repository;

    @Autowired
    HubApiController hubApiController;

    @Autowired
    ListenerApiController listenerApiController;

    public ResponseEntity<Service> createService(@Parameter(in = ParameterIn.DEFAULT, description = "The Service to be created", required=true, schema=@Schema()) @Valid @RequestBody Service body) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
            try {
                hubApiController.registerListener(new EventSubscriptionInput("Callback Url"));
                Service saved = repository.save(body);
                System.out.println("Setting state to feasibility checked");
                saved.setState(ServiceStateType.FEASIBILITYCHECKED);
                repository.save(saved);
                System.out.println("****************************************************************************************************************");

                ServiceStateChangeEvent event = new ServiceStateChangeEvent();
                event.setEvent(new ServiceStateChangeEventPayload());
                ServiceStateChangeEventPayload eventPayload = new ServiceStateChangeEventPayload();
                eventPayload.setService(saved);
                event.setEvent(eventPayload);
                event.setEventId("abcdefgh");
                event.setEventTime(new Date());
                event.setEventType("State Change");
                event.setCorrelationId("abcdefghijklm");
                event.setDomain("State Change");
                event.setTitle("State Change Event");
                event.setDescription("State changed from Inactive to In Feasibilty checked");
                event.setPriority("High");

                event.setTimeOcurred(new Date());
                listenerApiController.listenToServiceStateChangeEvent(event);


                System.out.println("Setting state to Active");
                saved.setState(ServiceStateType.ACTIVE);
                repository.save(saved);
                System.out.println("****************************************************************************************************************");

                eventPayload.setService(saved);
                event.setEvent(eventPayload);
                event.setEventId("abcdefgh");
                event.setEventTime(new Date());
                event.setEventType("State Change");
                event.setCorrelationId("abcdefghijklm");
                event.setDomain("State Change");
                event.setTitle("State Change Event");
                event.setDescription("State changed from Feasibilty checked to Active");
                event.setPriority("High");
                event.setTimeOcurred(new Date());

                listenerApiController.listenToServiceStateChangeEvent(event);

                return new ResponseEntity<Service>(saved, HttpStatus.CREATED);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new ResponseEntity<Service>(HttpStatus.INTERNAL_SERVER_ERROR);
    }

    public ResponseEntity<Void> deleteService(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Service", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<List<Service>> listService(@Parameter(in = ParameterIn.QUERY, description = "Comma-separated properties to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "fields", required = false) String fields,@Parameter(in = ParameterIn.QUERY, description = "Requested index for start of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "offset", required = false) Integer offset,@Parameter(in = ParameterIn.QUERY, description = "Requested number of resources to be provided in response" ,schema=@Schema()) @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null) {
            return new ResponseEntity<List<Service>>((List<Service>) repository.findAll(), HttpStatus.OK);
        }

        return new ResponseEntity<List<Service>>(HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<Service> patchService(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Service", required=true, schema=@Schema()) @PathVariable("id") String id,@Parameter(in = ParameterIn.DEFAULT, description = "The Service to be updated", required=true, schema=@Schema()) @Valid @RequestBody ServiceUpdate body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Service>(objectMapper.readValue("{\n  \"isBundle\" : true,\n  \"serviceType\" : \"serviceType\",\n  \"note\" : [ {\n    \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"@baseType\" : \"@baseType\",\n    \"author\" : \"author\",\n    \"@type\" : \"@type\",\n    \"id\" : \"id\",\n    \"text\" : \"text\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"date\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"@baseType\" : \"@baseType\",\n    \"author\" : \"author\",\n    \"@type\" : \"@type\",\n    \"id\" : \"id\",\n    \"text\" : \"text\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"serviceDate\" : \"serviceDate\",\n  \"endDate\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"supportingResource\" : [ null, null ],\n  \"@type\" : \"@type\",\n  \"hasStarted\" : true,\n  \"description\" : \"description\",\n  \"serviceOrderItem\" : [ {\n    \"itemId\" : \"itemId\",\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"serviceOrderHref\" : \"serviceOrderHref\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"itemAction\" : \"add\",\n    \"serviceOrderId\" : \"serviceOrderId\"\n  }, {\n    \"itemId\" : \"itemId\",\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"serviceOrderHref\" : \"serviceOrderHref\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"itemAction\" : \"add\",\n    \"serviceOrderId\" : \"serviceOrderId\"\n  } ],\n  \"serviceRelationship\" : [ {\n    \"relationshipType\" : \"relationshipType\",\n    \"@baseType\" : \"@baseType\",\n    \"service\" : {\n      \"isBundle\" : true,\n      \"serviceType\" : \"serviceType\",\n      \"note\" : [ null, null ],\n      \"@referredType\" : \"@referredType\",\n      \"serviceDate\" : \"serviceDate\",\n      \"endDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"supportingResource\" : [ {\n        \"@referredType\" : \"@referredType\",\n        \"@baseType\" : \"ResourceSpecification\",\n        \"@type\" : \"LogicalResourceSpecification\",\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"href\" : \"http://example.com/aeiou\",\n        \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n      }, {\n        \"@referredType\" : \"@referredType\",\n        \"@baseType\" : \"ResourceSpecification\",\n        \"@type\" : \"LogicalResourceSpecification\",\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"href\" : \"http://example.com/aeiou\",\n        \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n      } ],\n      \"@type\" : \"LogicalResourceSpecification\",\n      \"hasStarted\" : true,\n      \"description\" : \"description\",\n      \"serviceOrderItem\" : [ null, null ],\n      \"serviceRelationship\" : [ null, null ],\n      \"feature\" : [ null, null ],\n      \"@baseType\" : \"ResourceSpecification\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"place\" : [ null, null ],\n      \"state\" : \"feasibilityChecked\",\n      \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n      \"isStateful\" : true,\n      \"serviceCharacteristic\" : [ null, null ],\n      \"relatedEntity\" : [ null, null ],\n      \"serviceSpecification\" : {\n        \"@referredType\" : \"@referredType\",\n        \"@baseType\" : \"ResourceSpecification\",\n        \"@type\" : \"LogicalResourceSpecification\",\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"href\" : \"http://example.com/aeiou\",\n        \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n        \"version\" : \"version\"\n      },\n      \"supportingService\" : [ null, null ],\n      \"relatedParty\" : [ null, null ],\n      \"isServiceEnabled\" : true,\n      \"startMode\" : \"startMode\",\n      \"name\" : \"name\",\n      \"category\" : \"category\",\n      \"startDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"ServiceRelationshipCharacteristic\" : [ null, null ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  }, {\n    \"relationshipType\" : \"relationshipType\",\n    \"@baseType\" : \"@baseType\",\n    \"service\" : {\n      \"isBundle\" : true,\n      \"serviceType\" : \"serviceType\",\n      \"note\" : [ null, null ],\n      \"@referredType\" : \"@referredType\",\n      \"serviceDate\" : \"serviceDate\",\n      \"endDate\" : \"2000-01-23T04:56:07.000+00:00\",\n      \"supportingResource\" : [ {\n        \"@referredType\" : \"@referredType\",\n        \"@baseType\" : \"ResourceSpecification\",\n        \"@type\" : \"LogicalResourceSpecification\",\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"href\" : \"http://example.com/aeiou\",\n        \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n      }, {\n        \"@referredType\" : \"@referredType\",\n        \"@baseType\" : \"ResourceSpecification\",\n        \"@type\" : \"LogicalResourceSpecification\",\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"href\" : \"http://example.com/aeiou\",\n        \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n      } ],\n      \"@type\" : \"LogicalResourceSpecification\",\n      \"hasStarted\" : true,\n      \"description\" : \"description\",\n      \"serviceOrderItem\" : [ null, null ],\n      \"serviceRelationship\" : [ null, null ],\n      \"feature\" : [ null, null ],\n      \"@baseType\" : \"ResourceSpecification\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"place\" : [ null, null ],\n      \"state\" : \"feasibilityChecked\",\n      \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n      \"isStateful\" : true,\n      \"serviceCharacteristic\" : [ null, null ],\n      \"relatedEntity\" : [ null, null ],\n      \"serviceSpecification\" : {\n        \"@referredType\" : \"@referredType\",\n        \"@baseType\" : \"ResourceSpecification\",\n        \"@type\" : \"LogicalResourceSpecification\",\n        \"name\" : \"name\",\n        \"id\" : \"id\",\n        \"href\" : \"http://example.com/aeiou\",\n        \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n        \"version\" : \"version\"\n      },\n      \"supportingService\" : [ null, null ],\n      \"relatedParty\" : [ null, null ],\n      \"isServiceEnabled\" : true,\n      \"startMode\" : \"startMode\",\n      \"name\" : \"name\",\n      \"category\" : \"category\",\n      \"startDate\" : \"2000-01-23T04:56:07.000+00:00\"\n    },\n    \"@type\" : \"@type\",\n    \"ServiceRelationshipCharacteristic\" : [ null, null ],\n    \"@schemaLocation\" : \"http://example.com/aeiou\"\n  } ],\n  \"feature\" : [ {\n    \"isBundle\" : true,\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"isEnabled\" : true,\n    \"name\" : \"name\",\n    \"featureCharacteristic\" : [ {\n      \"characteristicRelationship\" : [ {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      }, {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      } ],\n      \"@baseType\" : \"ResourceSpecification\",\n      \"@type\" : \"LogicalResourceSpecification\",\n      \"valueType\" : \"valueType\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n      \"value\" : { }\n    }, {\n      \"characteristicRelationship\" : [ {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      }, {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      } ],\n      \"@baseType\" : \"ResourceSpecification\",\n      \"@type\" : \"LogicalResourceSpecification\",\n      \"valueType\" : \"valueType\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n      \"value\" : { }\n    } ],\n    \"constraint\" : [ {\n      \"@referredType\" : \"@referredType\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    }, {\n      \"@referredType\" : \"@referredType\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    } ],\n    \"id\" : \"id\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"featureRelationship\" : [ {\n      \"relationshipType\" : \"relationshipType\",\n      \"@baseType\" : \"@baseType\",\n      \"validFor\" : {\n        \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      },\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    }, {\n      \"relationshipType\" : \"relationshipType\",\n      \"@baseType\" : \"@baseType\",\n      \"validFor\" : {\n        \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      },\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    } ]\n  }, {\n    \"isBundle\" : true,\n    \"@baseType\" : \"@baseType\",\n    \"@type\" : \"@type\",\n    \"isEnabled\" : true,\n    \"name\" : \"name\",\n    \"featureCharacteristic\" : [ {\n      \"characteristicRelationship\" : [ {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      }, {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      } ],\n      \"@baseType\" : \"ResourceSpecification\",\n      \"@type\" : \"LogicalResourceSpecification\",\n      \"valueType\" : \"valueType\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n      \"value\" : { }\n    }, {\n      \"characteristicRelationship\" : [ {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      }, {\n        \"relationshipType\" : \"relationshipType\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"id\" : \"id\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      } ],\n      \"@baseType\" : \"ResourceSpecification\",\n      \"@type\" : \"LogicalResourceSpecification\",\n      \"valueType\" : \"valueType\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\",\n      \"value\" : { }\n    } ],\n    \"constraint\" : [ {\n      \"@referredType\" : \"@referredType\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    }, {\n      \"@referredType\" : \"@referredType\",\n      \"@baseType\" : \"@baseType\",\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"href\" : \"href\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\",\n      \"version\" : \"version\"\n    } ],\n    \"id\" : \"id\",\n    \"@schemaLocation\" : \"http://example.com/aeiou\",\n    \"featureRelationship\" : [ {\n      \"relationshipType\" : \"relationshipType\",\n      \"@baseType\" : \"@baseType\",\n      \"validFor\" : {\n        \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      },\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    }, {\n      \"relationshipType\" : \"relationshipType\",\n      \"@baseType\" : \"@baseType\",\n      \"validFor\" : {\n        \"startDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@baseType\" : \"@baseType\",\n        \"@type\" : \"@type\",\n        \"endDateTime\" : \"2000-01-23T04:56:07.000+00:00\",\n        \"@schemaLocation\" : \"http://example.com/aeiou\"\n      },\n      \"@type\" : \"@type\",\n      \"name\" : \"name\",\n      \"id\" : \"id\",\n      \"@schemaLocation\" : \"http://example.com/aeiou\"\n    } ]\n  } ],\n  \"@baseType\" : \"@baseType\",\n  \"id\" : \"id\",\n  \"href\" : \"href\",\n  \"place\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"ResourceSpecification\",\n    \"@type\" : \"LogicalResourceSpecification\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"ResourceSpecification\",\n    \"@type\" : \"LogicalResourceSpecification\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n  } ],\n  \"@schemaLocation\" : \"http://example.com/aeiou\",\n  \"isStateful\" : true,\n  \"serviceCharacteristic\" : [ null, null ],\n  \"relatedEntity\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"ResourceSpecification\",\n    \"@type\" : \"LogicalResourceSpecification\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"ResourceSpecification\",\n    \"@type\" : \"LogicalResourceSpecification\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"href\",\n    \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n  } ],\n  \"supportingService\" : [ null, null ],\n  \"relatedParty\" : [ {\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"ResourceSpecification\",\n    \"@type\" : \"LogicalResourceSpecification\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n  }, {\n    \"@referredType\" : \"@referredType\",\n    \"role\" : \"role\",\n    \"@baseType\" : \"ResourceSpecification\",\n    \"@type\" : \"LogicalResourceSpecification\",\n    \"name\" : \"name\",\n    \"id\" : \"id\",\n    \"href\" : \"http://example.com/aeiou\",\n    \"@schemaLocation\" : \"https://mycsp.com:8080/tmf-api/schema/Resource/LogicalResourceSpecification.schema.json\"\n  } ],\n  \"isServiceEnabled\" : true,\n  \"startMode\" : \"startMode\",\n  \"name\" : \"name\",\n  \"category\" : \"category\",\n  \"startDate\" : \"2000-01-23T04:56:07.000+00:00\"\n}", Service.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Service>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Service>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Service> retrieveService(@Parameter(in = ParameterIn.PATH, description = "Identifier of the Service", required=true, schema=@Schema()) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        if (repository.existsById(id)) {
            return new ResponseEntity<Service>(repository.findById(id).get(), HttpStatus.OK);
        }

        return new ResponseEntity<Service>(HttpStatus.NOT_FOUND);
    }

}

package io.swagger.api;

import io.swagger.model.PlaceAuthenticatedAccess;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-02-27T15:59:20.699Z[GMT]")
@Controller
public class MovementApiController implements MovementApi {

    private static final Logger log = LoggerFactory.getLogger(MovementApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public MovementApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<PlaceAuthenticatedAccess>> getMovementUserId(@ApiParam(value = "ID of an User",required=true) @PathVariable("userId") List<Long> userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<PlaceAuthenticatedAccess>>(objectMapper.readValue("[ {\n  \"access\" : {\n    \"entranceTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"exitTimestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"placeId\" : 0,\n  \"ldapId\" : 6\n}, {\n  \"access\" : {\n    \"entranceTimestamp\" : \"2000-01-23T04:56:07.000+00:00\",\n    \"exitTimestamp\" : \"2000-01-23T04:56:07.000+00:00\"\n  },\n  \"placeId\" : 0,\n  \"ldapId\" : 6\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<PlaceAuthenticatedAccess>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<PlaceAuthenticatedAccess>>(HttpStatus.NOT_IMPLEMENTED);
    }

}

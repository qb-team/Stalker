/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.qbteam.api;

import it.qbteam.model.OrganizationAnonymousMovement;
import it.qbteam.model.OrganizationAuthenticatedMovement;
import it.qbteam.model.PlaceAnonymousMovement;
import it.qbteam.model.PlaceAuthenticatedMovement;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-02-29T20:29:04.115+01:00[Europe/Berlin]")

@Validated
@Api(value = "movement", description = "the movement API")
public interface MovementApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /movement/track/organization/anonymous : Tracks the user movement inside the trackingArea of an organization with the anonymous trackingMode.
     * Tracks the user movement inside the trackingArea of an organization with the anonymous trackingMode.
     *
     * @param organizationAnonymousMovement  (optional)
     * @return Movement successfully tracked. (status code 200)
     *         or Movement could not be tracked due to incorrect data sent to the system. (status code 400)
     */
    @ApiOperation(value = "Tracks the user movement inside the trackingArea of an organization with the anonymous trackingMode.", nickname = "trackAnonymousMovementInOrganization", notes = "Tracks the user movement inside the trackingArea of an organization with the anonymous trackingMode.", tags={ "tracking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Movement successfully tracked."),
        @ApiResponse(code = 400, message = "Movement could not be tracked due to incorrect data sent to the system.") })
    @RequestMapping(value = "/movement/track/organization/anonymous",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> trackAnonymousMovementInOrganization(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) OrganizationAnonymousMovement organizationAnonymousMovement) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /movement/track/place/anonymous : Tracks the user movement inside the trackingArea of a place of an organization with the anonymous trackingMode.
     * Tracks the user movement inside the trackingArea of a place of an organization with the anonymous trackingMode.
     *
     * @param placeAnonymousMovement  (optional)
     * @return Movement successfully tracked. (status code 200)
     *         or Movement could not be tracked due to incorrect data sent to the system. (status code 400)
     */
    @ApiOperation(value = "Tracks the user movement inside the trackingArea of a place of an organization with the anonymous trackingMode.", nickname = "trackAnonymousMovementInPlace", notes = "Tracks the user movement inside the trackingArea of a place of an organization with the anonymous trackingMode.", tags={ "tracking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Movement successfully tracked."),
        @ApiResponse(code = 400, message = "Movement could not be tracked due to incorrect data sent to the system.") })
    @RequestMapping(value = "/movement/track/place/anonymous",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> trackAnonymousMovementInPlace(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) PlaceAnonymousMovement placeAnonymousMovement) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /movement/track/organization/authenticated : Tracks the user movement inside the trackingArea of an organization with the authenticated trackingMode.
     * Tracks the user movement inside the trackingArea of an organization with the authenticated trackingMode.
     *
     * @param organizationAuthenticatedMovement  (optional)
     * @return Movement successfully tracked. (status code 200)
     *         or Movement could not be tracked due to incorrect data sent to the system. (status code 400)
     */
    @ApiOperation(value = "Tracks the user movement inside the trackingArea of an organization with the authenticated trackingMode.", nickname = "trackAuthenticatedMovementInOrganization", notes = "Tracks the user movement inside the trackingArea of an organization with the authenticated trackingMode.", tags={ "tracking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Movement successfully tracked."),
        @ApiResponse(code = 400, message = "Movement could not be tracked due to incorrect data sent to the system.") })
    @RequestMapping(value = "/movement/track/organization/authenticated",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> trackAuthenticatedMovementInOrganization(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) OrganizationAuthenticatedMovement organizationAuthenticatedMovement) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /movement/track/place/authenticated : Tracks the user movement inside the trackingArea of a place of an organization with the authenticated trackingMode.
     * Tracks the user movement inside the trackingArea of a place of an organization with the authenticated trackingMode.
     *
     * @param placeAuthenticatedMovement  (optional)
     * @return Movement successfully tracked. (status code 200)
     *         or Movement could not be tracked due to incorrect data sent to the system. (status code 400)
     */
    @ApiOperation(value = "Tracks the user movement inside the trackingArea of a place of an organization with the authenticated trackingMode.", nickname = "trackAuthenticatedMovementInPlace", notes = "Tracks the user movement inside the trackingArea of a place of an organization with the authenticated trackingMode.", tags={ "tracking", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Movement successfully tracked."),
        @ApiResponse(code = 400, message = "Movement could not be tracked due to incorrect data sent to the system.") })
    @RequestMapping(value = "/movement/track/place/authenticated",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> trackAuthenticatedMovementInPlace(@ApiParam(value = ""  )  @Valid @RequestBody(required = false) PlaceAuthenticatedMovement placeAuthenticatedMovement) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

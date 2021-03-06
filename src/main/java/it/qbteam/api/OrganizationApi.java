/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.qbteam.api;

import it.qbteam.model.Organization;
import it.qbteam.model.OrganizationDeletionRequest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiParam;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

@Validated
@Api(value = "organization", description = "the organization API")
public interface OrganizationApi {

    /**
     * GET /organization/{organizationId} : Gets the available data for a single organization.
     * Gets the data available for a single organization.  Both app users and web-app administrators can access this end-point but,  app users can request information for all the organizations while web-app  administrators can only for the organizations they have access to.
     *
     * @param organizationId ID of an organization. (required)
     * @return Organization returned successfully. (status code 200)
     *         or The user or the administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Gets the available data for a single organization.", nickname = "getOrganization", notes = "Gets the data available for a single organization.  Both app users and web-app administrators can access this end-point but,  app users can request information for all the organizations while web-app  administrators can only for the organizations they have access to.", response = Organization.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "organization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Organization returned successfully.", response = Organization.class),
        @ApiResponse(code = 401, message = "The user or the administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization could not be found. Nothing gets returned.") })
    @RequestMapping(value = "/organization/{organizationId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Organization> getOrganization(@Min(1L)@ApiParam(value = "ID of an organization.",required=true) @PathVariable("organizationId") Long organizationId);


    /**
     * GET /organization : Returns the list of all organizations.
     * Returns the list of all organizations available in the system. The list can be empty. Only app users can access this end-point.
     *
     * @return List of all organizations is non-empty and gets returned successfully. (status code 200)
     *         or List of all organizations is empty. Nothing gets returned. (status code 204)
     *         or The user is not authenticated. Nothing gets returned. (status code 401)
     *         or Administrators cannot have access. Nothing gets returned. (status code 403)
     *         or List of all organizations could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Returns the list of all organizations.", nickname = "getOrganizationList", notes = "Returns the list of all organizations available in the system. The list can be empty. Only app users can access this end-point.", response = Organization.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "organization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all organizations is non-empty and gets returned successfully.", response = Organization.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "List of all organizations is empty. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The user is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Administrators cannot have access. Nothing gets returned.") })
    @RequestMapping(value = "/organization",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Organization>> getOrganizationList();


/**
     * POST /organization/requestdeletion : Sends a deletion request to the system. The request will be examined by Stalker administrators.
     * Sends a deletion request to the system.  The request will be examined by Stalker administrators. Only web-app administrators can access this end-point.
     *
     * @param organizationDeletionRequest  (required)
     * @return Request sent successfully. Nothing gets returned. (status code 204)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users and administrators who do not own the organization cannot have access. Nothing gets returned. (status code 403)
     *         or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Sends a deletion request to the system. The request will be examined by Stalker administrators.", nickname = "requestDeletionOfOrganization", notes = "Sends a deletion request to the system.  The request will be examined by Stalker administrators. Only web-app administrators can access this end-point.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "organization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Request sent successfully. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users and administrators who do not own the organization cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization could not be found. Nothing gets returned.") })
    @RequestMapping(value = "/organization/requestdeletion",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> requestDeletionOfOrganization(@ApiParam(value = "" ,required=true )  @Valid @RequestBody OrganizationDeletionRequest organizationDeletionRequest);


     /**
     * PUT /organization : Updates one or more properties of an organization.
     * Updates one or more properties of an organization.  Only web-app administrators (if they have the correct access rights) can access this end-point.
     *
     * @param organization  (required)
     * @return Organization updated successfully. The updated organization gets returned. (status code 200)
     *         or The inserted data has some issues. Nothing gets returned. (status code 400)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users and administrators who do not own the organization cannot have access. Nothing gets returned. (status code 403)
     *         or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Updates one or more properties of an organization.", nickname = "updateOrganization", notes = "Updates one or more properties of an organization.  Only web-app administrators (if they have the correct access rights) can access this end-point.", response = Organization.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "organization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Organization updated successfully. The updated organization gets returned.", response = Organization.class),
        @ApiResponse(code = 400, message = "The inserted data has some issues. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users and administrators who do not own the organization cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization could not be found. Nothing gets returned.") })
    @RequestMapping(value = "/organization",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Organization> updateOrganization(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Organization organization);


    /**
     * PATCH /organization/{organizationId}/trackingArea : Updates the coordinates of the tracking area of an organization.
     * Updates the coordinates of the tracking area of an organization. Only web-app administrators can access this end-point.
     *
     * @param organizationId ID of an organization. The administrator must have at least manager permission to the organization. (required)
     * @param trackingArea JSON representation of a tracking trackingArea. (required)
     * @return The tracking area of the organization was updated successfully. The organization gets returned. (status code 200)
     *         or The new tracking area does not respect the area constraints for the organization. Nothing gets returned. (status code 400)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users or administrator with viewer permission cannot have access. Nothing gets returned. (status code 403)
     *         or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Updates the coordinates of the tracking area of an organization.", nickname = "updateOrganizationTrackingArea", notes = "Updates the coordinates of the tracking area of an organization. Only web-app administrators can access this end-point.", response = Organization.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "organization", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "The tracking area of the organization was updated successfully. The organization gets returned.", response = Organization.class),
        @ApiResponse(code = 400, message = "The new tracking area does not respect the area constraints for the organization. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users or administrator with viewer permission cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization could not be found. Nothing gets returned.") })
    @RequestMapping(value = "/organization/{organizationId}/trackingArea",
        produces = { "application/json" }, 
        consumes = { "application/x-www-form-urlencoded" },
        method = RequestMethod.PATCH)
    ResponseEntity<Organization> updateOrganizationTrackingArea(@Min(1L)@ApiParam(value = "ID of an organization. The administrator must have at least manager permission to the organization.",required=true) @PathVariable("organizationId") Long organizationId,@ApiParam(value = "JSON representation of a tracking trackingArea.", required=true) @RequestParam(value="trackingArea", required=true)  String trackingArea);

}

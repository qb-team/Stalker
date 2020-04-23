/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.qbteam.api;

import it.qbteam.model.Permission;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Validated
@Api(value = "administrator", description = "the administrator API")
public interface AdministratorApi {

    /**
     * POST /administrator/bindadministrator : Bind an already existent administrator to the organization.
     * Bind an already existent administrator to the organization. Only web-app administrators can access this end-point.
     *
     * @param permission  (required)
     * @return Administrator bound successfully. The permission record gets returned. (status code 201)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users or administrator with viewer or manager permission cannot have access. Nothing gets returned. (status code 403)
     *         or The organization or the administrator could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Bind an already existent administrator to the organization.", nickname = "bindAdministratorToOrganization", notes = "Bind an already existent administrator to the organization. Only web-app administrators can access this end-point.", response = Permission.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "administrator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Administrator bound successfully. The permission record gets returned.", response = Permission.class),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users or administrator with viewer or manager permission cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization or the administrator could not be found. Nothing gets returned.") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/administrator/bindadministrator",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Permission> bindAdministratorToOrganization(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Permission permission);


    /**
     * POST /administrator/createadministrator : Creates and binds a new administrator to the organization.
     * Creates and binds a new administrator to the current organization.  Only web-app administrators can access this end-point.
     *
     * @param permission  (required)
     * @return Administrator created and bound successfully. The permission record gets returned. (status code 201)
     *         or The administrator to be created has already an account. The process could not succeed. Nothing gets returned. (status code 400)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users or administrator with viewer or manager permission cannot have access. Nothing gets returned. (status code 403)
     *         or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Creates and binds a new administrator to the organization.", nickname = "createNewAdministratorInOrganization", notes = "Creates and binds a new administrator to the current organization.  Only web-app administrators can access this end-point.", response = Permission.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "administrator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Administrator created and bound successfully. The permission record gets returned.", response = Permission.class),
        @ApiResponse(code = 400, message = "The administrator to be created has already an account. The process could not succeed. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users or administrator with viewer or manager permission cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization could not be found. Nothing gets returned.") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/administrator/createadministrator",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Permission> createNewAdministratorInOrganization(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Permission permission);


    /**
     * GET /administrator/organization/{organizationId} : Returns the list of administrators of the organization.
     * Returns the list of administrators of the organization. Only web-app administrators can access this end-point.
     *
     * @param organizationId ID of an organization. The administrator must have at least owner permission to the organization. (required)
     * @return Administrators&#39; information returned successfully. (status code 200)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users or administrator with viewer or manager permission cannot have access. Nothing gets returned. (status code 403)
     *         or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Returns the list of administrators of the organization.", nickname = "getAdministratorListOfOrganization", notes = "Returns the list of administrators of the organization. Only web-app administrators can access this end-point.", response = Permission.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "administrator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Administrators' information returned successfully.", response = Permission.class, responseContainer = "List"),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users or administrator with viewer or manager permission cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization could not be found. Nothing gets returned.") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/administrator/organization/{organizationId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Permission>> getAdministratorListOfOrganization(@Min(1L)@ApiParam(value = "ID of an organization. The administrator must have at least owner permission to the organization.",required=true) @PathVariable("organizationId") Long organizationId);


    /**
     * GET /administrator/permission/{administratorId} : Gets the list of permission that an administrator has permissions to view/manage/own.
     * Gets the list of organizations that an administrator has permissions to view/manage/own. Only web-app administrators can access this end-point.
     *
     * @param administratorId ID of the administrator. It must be the same of the administratorId of the authenticated administrator. (required)
     * @return List of permissions returned successfully. (status code 200)
     *         or List of permissions is empty. Nothing gets returned. (status code 204)
     *         or The user or the administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Administrators cannot have access. Nothing gets returned. (status code 403)
     *         or List of organizations could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Gets the list of permission that an administrator has permissions to view/manage/own.", nickname = "getPermissionList", notes = "Gets the list of organizations that an administrator has permissions to view/manage/own. Only web-app administrators can access this end-point.", response = Permission.class, responseContainer = "List", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "administrator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of permissions returned successfully.", response = Permission.class, responseContainer = "List"),
        @ApiResponse(code = 204, message = "List of permissions is empty. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The user or the administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Administrators cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "List of organizations could not be found. Nothing gets returned.") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/administrator/permission/{administratorId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Permission>> getPermissionList(@ApiParam(value = "ID of the administrator. It must be the same of the administratorId of the authenticated administrator.",required=true) @PathVariable("administratorId") String administratorId);


    /**
     * POST /administrator/unbindadministrator : Unbind an administrator to the organization.
     * Unbind an administrator to the organization. Only web-app administrators can access this end-point.
     *
     * @param permission  (required)
     * @return Administrator unbound successfully. Nothing gets returned. (status code 204)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users or administrator with viewer or manager permission cannot have access. Nothing gets returned. (status code 403)
     *         or The organization or the administrator could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Unbind an administrator to the organization.", nickname = "unbindAdministratorFromOrganization", notes = "Unbind an administrator to the organization. Only web-app administrators can access this end-point.", authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "administrator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Administrator unbound successfully. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users or administrator with viewer or manager permission cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization or the administrator could not be found. Nothing gets returned.") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/administrator/unbindadministrator",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> unbindAdministratorFromOrganization(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Permission permission);


    /**
     * PATCH /administrator/updatepermission : Update the permission for an already existent administrator in the organization.
     * Update the permission for an already existent administrator in the organization. Only web-app administrators can access this end-point.
     *
     * @param permission  (required)
     * @return Administrator&#39;s permissions updated successfully. The permission record gets returned. (status code 201)
     *         or Only the permission can be changed. The request was not satisfied. Nothing gets returned. (status code 400)
     *         or The administrator is not authenticated. Nothing gets returned. (status code 401)
     *         or Users or administrator with viewer or manager permission cannot have access. Nothing gets returned. (status code 403)
     *         or The organization or the administrator could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Update the permission for an already existent administrator in the organization.", nickname = "updateAdministratorPermission", notes = "Update the permission for an already existent administrator in the organization. Only web-app administrators can access this end-point.", response = Permission.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "administrator", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Administrator's permissions updated successfully. The permission record gets returned.", response = Permission.class),
        @ApiResponse(code = 400, message = "Only the permission can be changed. The request was not satisfied. Nothing gets returned."),
        @ApiResponse(code = 401, message = "The administrator is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Users or administrator with viewer or manager permission cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization or the administrator could not be found. Nothing gets returned.") })
    @ApiImplicitParams({
    })
    @RequestMapping(value = "/administrator/updatepermission",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PATCH)
    ResponseEntity<Permission> updateAdministratorPermission(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Permission permission);

}

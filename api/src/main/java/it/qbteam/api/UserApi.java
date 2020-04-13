/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package it.qbteam.api;

import it.qbteam.model.User;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Validated
@Api(value = "user", description = "the user API")
public interface UserApi {

    /**
     * POST /user/binduser : Bind an already existent user to its organization account.
     * Bind an already existent user to the organization. Only app users can access this end-point.
     *
     * @param user  (required)
     * @return User bound successfully. The user record gets returned. (status code 201)
     *         or The user is not authenticated. Nothing gets returned. (status code 401)
     *         or Administrators cannot have access. Nothing gets returned. (status code 403)
     *         or The organization or the administrator could not be found. Nothing gets returned. (status code 404)
     */
    @ApiOperation(value = "Bind an already existent user to its organization account.", nickname = "bindUserToOrganizationAccount", notes = "Bind an already existent user to the organization. Only app users can access this end-point.", response = User.class, authorizations = {
        @Authorization(value = "bearerAuth")
    }, tags={ "user", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "User bound successfully. The user record gets returned.", response = User.class),
        @ApiResponse(code = 401, message = "The user is not authenticated. Nothing gets returned."),
        @ApiResponse(code = 403, message = "Administrators cannot have access. Nothing gets returned."),
        @ApiResponse(code = 404, message = "The organization or the administrator could not be found. Nothing gets returned.") })
    @RequestMapping(value = "/user/binduser",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<User> bindUserToOrganizationAccount(@ApiParam(value = "" ,required=true )  @Valid @RequestBody User user);

}

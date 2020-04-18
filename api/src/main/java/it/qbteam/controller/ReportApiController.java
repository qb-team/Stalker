package it.qbteam.controller;

import it.qbteam.api.ReportApi;
import it.qbteam.service.AuthenticationService;
import it.qbteam.model.TimePerUserReport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.Min;
import java.util.List;

public class ReportApiController extends StalkerBaseController implements ReportApi {

    @Autowired
    public ReportApiController(NativeWebRequest request, AuthenticationService service) {
        super(request, service);
    }
    /**
     * GET /report/organization/{organizationId} : Gets the report of total time spent per user inside the organization.
     * Gets the report of total time spent by each user inside the organization. Only web-app administrators can access this end-point.
     *
     * @param organizationId ID of the organization. The viewer administrator must have permissions for this organization. (required)
     * @return Report of time spent in the organization per user returned successfully. (status code 200)
     * or Report is empty. Nothing gets returned. (status code 204)
     * or The administrator is not authenticated. Nothing gets returned. (status code 401)
     * or Users cannot have access. Nothing gets returned. (status code 403)
     * or The organization could not be found. Nothing gets returned. (status code 404)
     */
    @Override
    public ResponseEntity<List<TimePerUserReport>> getTimePerUserReport(@Min(1L) Long organizationId) {
        return null;
    }
}
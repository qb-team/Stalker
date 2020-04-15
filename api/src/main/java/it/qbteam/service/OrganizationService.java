package it.qbteam.service;

import it.qbteam.model.Organization;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface OrganizationService {
    Optional<Organization> getOrganization(Long organizationId);
    Optional<List<Organization>> getOrganizationList();
    void requestDeletionOfOrganization(Long organizationId, String requestReason);
    Optional<Organization> updateOrganization(Long organizationId,  Organization organization);
    Optional<Organization> updateOrganizationTrackingArea(Long organizationId, String trackingArea);
}

package it.qbteam.serviceimpl;

import it.qbteam.model.OrganizationAccess;
import it.qbteam.model.PlaceAccess;
import it.qbteam.repository.sql.OrganizationAccessRepository;
import it.qbteam.repository.sql.PlaceAccessRepository;
import it.qbteam.service.AccessService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class AccessServiceImpl implements AccessService {

    private OrganizationAccessRepository organizationAccessRepo;
    private PlaceAccessRepository placeAccessRepo;

    @Autowired
    AccessServiceImpl(OrganizationAccessRepository organizationAccessRepository, PlaceAccessRepository placeAccessRepository) {
        this.organizationAccessRepo = organizationAccessRepository;
        this.placeAccessRepo = placeAccessRepository;
    }

    @Override
    public List<OrganizationAccess> getAuthenticatedAccessListInOrganization(List<String> orgAuthServerIds, Long organizationId) {
        List<OrganizationAccess> accessList = new LinkedList<>();
        
        if(orgAuthServerIds != null) {
            orgAuthServerIds.forEach((orgAuthServerId) -> {
                organizationAccessRepo.findByOrgAuthServerIdAndOrganizationId(orgAuthServerId, organizationId).forEach(accessList::add);
            });
        }

        return accessList;
    }

    @Override
    public List<PlaceAccess> getAuthenticatedAccessListInPlace(List<String> orgAuthServerIds, Long placeId) {
        List<PlaceAccess> placeList = new LinkedList<>();
        
        if(orgAuthServerIds != null) {
            orgAuthServerIds.forEach((orgAuthServerId) -> {
                placeAccessRepo.findByOrgAuthServerIdAndPlaceId(orgAuthServerId, placeId).forEach(placeList::add);
            });    
        }
        
        return placeList;
    }
}

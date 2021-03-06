package it.qbteam.model;

import java.io.Serializable;
import java.util.Objects;

public class PermissionId implements Serializable {
    private static final long serialVersionUID = -4860856100121562186L;

    private String administratorId;

    private Long organizationId;

    public PermissionId() {}

    public PermissionId(String administratorId, Long organizationId) {
        this.administratorId = administratorId;
        this.organizationId = organizationId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PermissionId)) return false;
        PermissionId that = (PermissionId) o;
        return Objects.equals(administratorId, that.administratorId) &&
                Objects.equals(organizationId, that.organizationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(administratorId, organizationId);
    }
}
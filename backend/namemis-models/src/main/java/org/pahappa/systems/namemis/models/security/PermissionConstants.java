package org.pahappa.systems.namemis.models.security;

public final class PermissionConstants {
    private PermissionConstants() {
    }

    @SystemPermission(name = "Api user", description = "Has role for api users")
    public static final String PERM_API_USER = "Api User";

}

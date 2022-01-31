package intetics.project.demo.model;

public enum Permission {
    USERS_READ("users:read"),
    USERS_WRITE("users:write");


    private final String permission;

    Permission(String permission) {
        this.permission = permission;
    }
}
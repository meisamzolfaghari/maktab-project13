package ir.maktab.busticket.features.share.services;

import ir.maktab.busticket.features.usermanagement.models.User;

public final class AuthenticationService {

    private static AuthenticationService authenticationService;
    private User loginUser;

    public AuthenticationService() {
    }

    public static synchronized AuthenticationService getInstance() {
        if (authenticationService == null)
            authenticationService = new AuthenticationService();
        return authenticationService;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }
}

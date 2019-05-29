package com.shan.genericapp.data;

import com.shan.genericapp.screens.viewmodel.SocialViewModel;

import java.io.IOException;

/**
 * Class that handles authentication w/ login credentials and retrieves user information.
 */
public class LoginDataSource {

    public Result<SocialViewModel.LoggedInUser> login(String username, String password) {

        try {
            SocialViewModel.LoggedInUser fakeUser =
                    new SocialViewModel.LoggedInUser(
                            java.util.UUID.randomUUID().toString(),
                            "Jane Doe");
            return new Result.Success<>(fakeUser);
        } catch (Exception e) {
            return new Result.Error(new IOException("Error logging in", e));
        }
    }

    public void logout() {

    }
}

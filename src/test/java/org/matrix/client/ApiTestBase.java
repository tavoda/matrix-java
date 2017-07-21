package org.matrix.client;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.matrix.client.api.SessionManagementApi;
import org.matrix.client.model.LoginRequest;
import org.matrix.client.model.LoginResponse;

/**
 * Created by tavoda on 7/18/17.
 */
public class ApiTestBase {
	static ApiClient anonClient = new ApiClient();
	static ApiClient authClient = new ApiClient();
	static LoginResponse login;

	@BeforeClass
	public static void prepareApiClient() throws ApiException {
//		anonClient.setBasePath("http://localhost:8008");
//		authClient.setBasePath("http://localhost:8008");

		// Login
		SessionManagementApi sessionManagementApi = new SessionManagementApi(anonClient);
		LoginRequest loginInfo = new LoginRequest();
		loginInfo.setType(LoginRequest.TypeEnum.PASSWORD);
		loginInfo.setUser("tavoda");
		loginInfo.setPassword("palo123");
		login = sessionManagementApi.login(loginInfo);
		System.out.println("Login: " + login);
		authClient.setApiKey(login.getAccessToken());
	}

	@AfterClass
	public static void cleanup() throws ApiException {
		SessionManagementApi sessionManagementApi = new SessionManagementApi(authClient);
		Object logout = sessionManagementApi.logout();
		System.out.println("Logout: " + logout);
	}
}

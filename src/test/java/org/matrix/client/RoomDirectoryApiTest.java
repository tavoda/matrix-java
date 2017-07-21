/*
 * Matrix Client-Server Client Config API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.matrix.client;

import org.junit.Ignore;
import org.junit.Test;
import org.matrix.client.api.RoomDirectoryApi;
import org.matrix.client.model.RoomIdResponse;
import org.matrix.client.model.RoomInfo;

/**
 * API tests for RoomDirectoryApi
 */
@Ignore
public class RoomDirectoryApiTest extends ApiTestBase {

	private final RoomDirectoryApi api = new RoomDirectoryApi(authClient);
	private String roomAlias;

	/**
	 * Test create, get and delete of Room alias
	 *
	 * @throws ApiException if the Api call fails
	 */
	@Test
	public void RoomDirectoryAliasTest() throws ApiException {
		roomAlias = "#KUKU:" + login.getHomeServer();

		createRoomAliasTest();
		getRoomIdTest();
		deleteRoomAliasTest();
	}

	/**
	 * Create a new mapping from room alias to room ID.
	 *
	 * @throws ApiException if the Api call fails
	 */
	private void createRoomAliasTest() throws ApiException {
		RoomInfo roomInfo = new RoomInfo();
		roomInfo.setRoomId("!RZghuKNehCCMyqMtJv:my.domain.name");
		roomInfo.setVisibility(RoomInfo.VisibilityEnum.PUBLIC);
		Object response = api.createRoomAlias(roomAlias, roomInfo);
		System.out.println("Create room alias " + roomAlias);
	}

	/**
	 * Remove a mapping of room alias to room ID.
	 * <p>
	 * Remove a mapping of room alias to room ID.  Servers may choose to implement additional access control checks here, for instance that room aliases can only be deleted by their creator or a server administrator.
	 *
	 * @throws ApiException if the Api call fails
	 */
	private void deleteRoomAliasTest() throws ApiException {
		Object response = api.deleteRoomAlias(roomAlias);
		System.out.println("Delete room alias " + roomAlias);
	}

	/**
	 * Get the room ID corresponding to this room alias.
	 * <p>
	 * Requests that the server resolve a room alias to a room ID.  The server will use the federation API to resolve the alias if the domain part of the alias does not correspond to the server&#39;s own domain.
	 *
	 * @throws ApiException if the Api call fails
	 */
	private void getRoomIdTest() throws ApiException {
		RoomIdResponse response = api.getRoomId(roomAlias);
		System.out.println("getRoomId: " + response);
	}

}
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

import org.matrix.client.ApiException;
import org.matrix.client.api.RoomCreationApi;
import org.matrix.client.model.CreateRoomRequest;
import org.matrix.client.model.CreateRoomResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RoomCreationApi
 */
@Ignore
public class RoomCreationApiTest extends ApiTestBase {

    private final RoomCreationApi api = new RoomCreationApi(authClient);

    
    /**
     * Create a new room
     *
     * Create a new room with various configuration options.  The server MUST apply the normal state resolution rules when creating the new room, including checking power levels for each event. It MUST apply the events implied by the request in the following order:  1. Events set by &#x60;&#x60;presets&#x60;&#x60;.  2. Events listed in &#x60;&#x60;initial_state&#x60;&#x60;, in the order that they are    listed.  3. Events implied by &#x60;&#x60;name&#x60;&#x60; and &#x60;&#x60;topic&#x60;&#x60;.  4. Invite events implied by &#x60;&#x60;invite&#x60;&#x60; and &#x60;&#x60;invite_3pid&#x60;&#x60;.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createRoomTest() throws ApiException {
        CreateRoomRequest request = new CreateRoomRequest();
        request.setName("PublicTestRoom");
        request.setPreset(CreateRoomRequest.PresetEnum.PUBLIC_CHAT);
        request.setTopic("About everything");
        request.setRoomAliasName("PublicTestRoomAlias");
        request.setVisibility(CreateRoomRequest.VisibilityEnum.PUBLIC);
        CreateRoomResponse response = api.createRoom(request);
        System.out.println("CreateRoomResponse: " + response);
    }
    
}

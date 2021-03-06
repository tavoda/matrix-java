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
import org.matrix.client.api.RoomDiscoveryApi;
import org.matrix.client.model.PublicRoomsResult;
import org.matrix.client.model.RoomFilter;

/**
 * API tests for RoomDiscoveryApi
 */
@Ignore
public class RoomDiscoveryApiTest extends ApiTestBase {

    private final RoomDiscoveryApi api = new RoomDiscoveryApi(authClient);

    /**
     * Lists the public rooms on the server.
     *
     * Lists the public rooms on the server.  This API returns paginated responses. The rooms are ordered by the number of joined members, with the largest rooms first.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPublicRoomsTest() throws ApiException {
        Integer limit = 100;
        String since = null;
        String server = null;
        PublicRoomsResult response = api.listPublicRooms(limit, since, server);
        System.out.println("ListRoomsResult: " + response);
    }
    
    /**
     * Lists the public rooms on the server with optional filter.
     *
     * Lists the public rooms on the server, with optional filter.  This API returns paginated responses. The rooms are ordered by the number of joined members, with the largest rooms first.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void filterPublicRoomsWithFilterTest() throws ApiException {
        RoomFilter filter = new RoomFilter();
        filter.setLimit(100);
        String server = null;
        PublicRoomsResult response = api.filterPublicRooms(filter, server);
        System.out.println("FilterRoomsResult: " + response);
    }
}

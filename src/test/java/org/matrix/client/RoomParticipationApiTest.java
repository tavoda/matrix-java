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
import org.matrix.client.api.RoomParticipationApi;
import org.matrix.client.model.CreateFilterResponse;
import org.matrix.client.model.Event;
import org.matrix.client.model.EventId;
import org.matrix.client.model.EventWithContextResponse;
import org.matrix.client.model.GetRoomMembersResponse;
import org.matrix.client.model.InitialSyncResponse;
import org.matrix.client.model.ListEventsResponse;
import org.matrix.client.model.ListenForEventsResponse;
import org.matrix.client.model.RoomEvent;
import org.matrix.client.model.RoomInitialSyncResponse;
import org.matrix.client.model.StateEvent;
import org.matrix.client.model.StripEventResponse;
import org.matrix.client.model.SyncFilter;
import org.matrix.client.model.SyncResponse;
import org.matrix.client.model.TypingState;

import java.util.List;

/**
 * API tests for RoomParticipationApi
 */
@Ignore
public class RoomParticipationApiTest extends ApiTestBase {

    private final RoomParticipationApi api = new RoomParticipationApi(authClient);

    
    /**
     * Upload a new filter.
     *
     * Uploads a new filter definition to the homeserver. Returns a filter ID that may be used in future requests to restrict which events are returned to the client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFilterTest() throws ApiException {
        String userId = null;
        SyncFilter filter = null;
        CreateFilterResponse response = api.createFilter(userId, filter);

        // TODO: test validations
    }
    
    /**
     * Get all state events in the current state of a room.
     *
     * Get the state events for the current state of a room.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllRoomStatesTest() throws ApiException {
        String roomId = "#public:" + login.getHomeServer();
        List<StateEvent> response = api.getAllRoomStates(roomId);
        response.stream().forEach(System.out::println);

        // TODO: test validations
    }
    
    /**
     * Get a single event by event ID.
     *
     * Get a single event based on &#x60;&#x60;event_id&#x60;&#x60;. You must have permission to retrieve this event e.g. by being a member in the room for this event.  This endpoint was deprecated in r0 of this specification. Clients should instead call the |/rooms/{roomId}/context/{eventId}|_ API.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventTest() throws ApiException {
        String eventId = null;
        Event response = api.getEvent(eventId);

        // TODO: test validations
    }
    
    /**
     * Get events and state around the specified event.
     *
     * This API returns a number of events that happened just before and after the specified event. This allows clients to get the context surrounding an event.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getEventWithContextTest() throws ApiException {
        String roomId = null;
        String eventId = null;
        Integer limit = null;
        EventWithContextResponse response = api.getEventWithContext(roomId, eventId, limit);

        // TODO: test validations
    }
    
    /**
     * Download a filter
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFilterTest() throws ApiException {
        String userId = null;
        String filterId = null;
        SyncFilter response = api.getFilter(userId, filterId);

        // TODO: test validations
    }
    
    /**
     * Get the m.room.member events for the room.
     *
     * Get the list of members for this room.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoomMembersTest() throws ApiException {
        String roomId = null;
        GetRoomMembersResponse response = api.getRoomMembers(roomId);

        // TODO: test validations
    }
    
    /**
     * Get the state identified by the type, with the empty state key.
     *
     * Looks up the contents of a state event in a room. If the user is joined to the room then the state is taken from the current state of the room. If the user has left the room then the state is taken from the state of the room when they left.  This looks up the state event with the empty state key.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoomStateTest() throws ApiException {
        String roomId = null;
        String eventType = null;
        StateEvent response = api.getRoomState(roomId, eventType);

        // TODO: test validations
    }
    
    /**
     * Get the state identified by the type and key.
     *
     * Looks up the contents of a state event in a room. If the user is joined to the room then the state is taken from the current state of the room. If the user has left the room then the state is taken from the state of the room when they left.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRoomStateWithKeyTest() throws ApiException {
        String roomId = null;
        String eventType = null;
        String stateKey = null;
        StateEvent response = api.getRoomStateWithKey(roomId, eventType, stateKey);

        // TODO: test validations
    }
    
    /**
     * Get the user&#39;s current state.
     *
     * This returns the full state for this user, with an optional limit on the number of messages per room to return.  This endpoint was deprecated in r0 of this specification. Clients should instead call the |/sync|_ API with no &#x60;&#x60;since&#x60;&#x60; parameter. See the &#x60;migration guide &lt;https://matrix.org/docs/guides/client-server-migrating-from-v1.html#deprecated-endpoints&gt;&#x60;_.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initialSyncTest() throws ApiException {
        Integer limit = null;
        Boolean archived = null;
        InitialSyncResponse response = api.initialSync(limit, archived);
        System.out.println("initialSync: " + response);
    }
    
    /**
     * Get a list of events for this room
     *
     * This API returns a list of message and state events for a room. It uses pagination query parameters to paginate history in the room.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listEventsTest() throws ApiException {
        String roomId = null;
        String from = null;
        String dir = null;
        String to = null;
        Integer limit = null;
        String filter = null;
        ListEventsResponse response = api.listEvents(roomId, from, dir, to, limit, filter);

        // TODO: test validations
    }
    
    /**
     * Listen on the event stream.
     *
     * This will listen for new events related to a particular room and return them to the caller. This will block until an event is received, or until the &#x60;&#x60;timeout&#x60;&#x60; is reached.  This API is the same as the normal &#x60;&#x60;/events&#x60;&#x60; endpoint, but can be called by users who have not joined the room.  Note that the normal &#x60;&#x60;/events&#x60;&#x60; endpoint has been deprecated. This API will also be deprecated at some point, but its replacement is not yet known.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listenForEventsTest() throws ApiException {
        String from = null;
        Integer timeout = null;
        String roomId = null;
        ListenForEventsResponse response = api.listenForEvents(from, timeout, roomId);

        // TODO: test validations
    }
    
    /**
     * Snapshot the current state of a room and its most recent messages.
     *
     * Get a copy of the current state and the most recent messages in a room.  This endpoint was deprecated in r0 of this specification. There is no direct replacement; the relevant information is returned by the |/sync|_ API. See the &#x60;migration guide &lt;https://matrix.org/docs/guides/client-server-migrating-from-v1.html#deprecated-endpoints&gt;&#x60;_.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void roomInitialSyncTest() throws ApiException {
        String roomId = null;
        RoomInitialSyncResponse response = api.roomInitialSync(roomId);

        // TODO: test validations
    }
    
    /**
     * Send a message event to the given room.
     *
     * This endpoint is used to send a message event to a room. Message events allow access to historical events and pagination, making them suited for \&quot;once-off\&quot; activity in a room.  The body of the request should be the content object of the event; the fields in this object will vary depending on the type of event. See &#x60;Room Events&#x60;_ for the m. event specification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendEventTest() throws ApiException {
        String roomId = null;
        String eventType = null;
        String txnId = null;
        RoomEvent body = null;
        EventId response = api.sendEvent(roomId, eventType, txnId, body);

        // TODO: test validations
    }
    
    /**
     * Send a receipt for the given event ID.
     *
     * This API updates the marker for the given receipt type to the event ID specified.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sendReceiptTest() throws ApiException {
        String roomId = null;
        String receiptType = null;
        String eventId = null;
        Object receipt = null;
        api.sendReceipt(roomId, receiptType, eventId, receipt);

        // TODO: test validations
    }
    
    /**
     * Send a state event to the given room.
     *
     * State events can be sent using this endpoint. This endpoint is equivalent to calling &#x60;/rooms/{roomId}/state/{eventType}/{stateKey}&#x60; with an empty &#x60;stateKey&#x60;. Previous state events with matching &#x60;&lt;roomId&gt;&#x60; and &#x60;&lt;eventType&gt;&#x60;, and empty &#x60;&lt;stateKey&gt;&#x60;, will be overwritten.  Requests to this endpoint **cannot use transaction IDs** like other &#x60;&#x60;PUT&#x60;&#x60; paths because they cannot be differentiated from the &#x60;&#x60;state_key&#x60;&#x60;. Furthermore, &#x60;&#x60;POST&#x60;&#x60; is unsupported on state paths.  The body of the request should be the content object of the event; the fields in this object will vary depending on the type of event. See &#x60;Room Events&#x60;_ for the &#x60;&#x60;m.&#x60;&#x60; event specification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRoomStateTest() throws ApiException {
        String roomId = null;
        String eventType = null;
        Object body = null;
        EventId response = api.setRoomState(roomId, eventType, body);

        // TODO: test validations
    }
    
    /**
     * Send a state event to the given room.
     *
     * State events can be sent using this endpoint.  These events will be overwritten if &#x60;&#x60;&lt;room id&gt;&#x60;&#x60;, &#x60;&#x60;&lt;event type&gt;&#x60;&#x60; and &#x60;&#x60;&lt;state key&gt;&#x60;&#x60; all match.  Requests to this endpoint **cannot use transaction IDs** like other &#x60;&#x60;PUT&#x60;&#x60; paths because they cannot be differentiated from the &#x60;&#x60;state_key&#x60;&#x60;. Furthermore, &#x60;&#x60;POST&#x60;&#x60; is unsupported on state paths.  The body of the request should be the content object of the event; the fields in this object will vary depending on the type of event. See &#x60;Room Events&#x60;_ for the &#x60;&#x60;m.&#x60;&#x60; event specification. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setRoomStateWithKeyTest() throws ApiException {
        String roomId = null;
        String eventType = null;
        String stateKey = null;
        Object body = null;
        EventId response = api.setRoomStateWithKey(roomId, eventType, stateKey, body);

        // TODO: test validations
    }
    
    /**
     * Informs the server that the user has started or stopped typing.
     *
     * This tells the server that the user is typing for the next N milliseconds where N is the value specified in the &#x60;&#x60;timeout&#x60;&#x60; key. Alternatively, if &#x60;&#x60;typing&#x60;&#x60; is &#x60;&#x60;false&#x60;&#x60;, it tells the server that the user has stopped typing.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setTypingStateTest() throws ApiException {
        String userId = null;
        String roomId = null;
        TypingState typingState = null;
        api.setTypingState(userId, roomId, typingState);

        // TODO: test validations
    }
    
    /**
     * Strips all non-integrity-critical information out of an event.
     *
     * Strips all information out of an event which isn&#39;t critical to the integrity of the server-side representation of the room.  This cannot be undone.  Users may redact their own events, and any user with a power level greater than or equal to the &#x60;redact&#x60; power level of the room may redact events there.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void stripEventTest() throws ApiException {
        String roomId = null;
        String eventId = null;
        String txnId = null;
        StripEventResponse body = null;
        EventId response = api.stripEvent(roomId, eventId, txnId, body);

        // TODO: test validations
    }
    
    /**
     * Synchronise the client&#39;s state and receive new messages.
     *
     * Synchronise the client&#39;s state with the latest state on the server. Clients use this API when they first log in to get an initial snapshot of the state on the server, and then continue to call this API to get incremental deltas to the state, and to receive new messages.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncTest() throws ApiException {
        String filter = null;
        String since = null;
        Boolean fullState = null;
        String setPresence = null;
        Integer timeout = null;
        SyncResponse response = api.sync(filter, since, fullState, setPresence, timeout);
        System.out.println("SYNC: " + response);
    }
    
}

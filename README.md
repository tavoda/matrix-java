# api

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>org.matrix</groupId>
    <artifactId>api</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.matrix:api:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/api-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.matrix.client.*;
import org.matrix.client.auth.*;
import org.matrix.client.model.*;
import org.matrix.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        
        DefaultApi apiInstance = new DefaultApi();
        try {
            apiInstance.clientR0Account3pidEmailRequestTokenPost();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientR0Account3pidEmailRequestTokenPost");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:8008/_matrix*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**clientR0Account3pidEmailRequestTokenPost**](docs/DefaultApi.md#clientR0Account3pidEmailRequestTokenPost) | **POST** /client/r0/account/3pid/email/requestToken | Requests a validation token be sent to the given email address for the purpose of adding an email address to an account
*DefaultApi* | [**clientR0AccountPasswordEmailRequestTokenPost**](docs/DefaultApi.md#clientR0AccountPasswordEmailRequestTokenPost) | **POST** /client/r0/account/password/email/requestToken | Requests a validation token be sent to the given email address for the purpose of resetting a user&#39;s password
*DefaultApi* | [**clientR0LoginCasRedirectGet**](docs/DefaultApi.md#clientR0LoginCasRedirectGet) | **GET** /client/r0/login/cas/redirect | Redirect the user&#39;s browser to the CAS interface.
*DefaultApi* | [**clientR0LoginCasTicketGet**](docs/DefaultApi.md#clientR0LoginCasTicketGet) | **GET** /client/r0/login/cas/ticket | Receive and validate a CAS login ticket.
*DefaultApi* | [**clientR0PushrulesScopeKindRuleIdActionsGet**](docs/DefaultApi.md#clientR0PushrulesScopeKindRuleIdActionsGet) | **GET** /client/r0/pushrules/{scope}/{kind}/{ruleId}/actions | The actions for a push rule
*DefaultApi* | [**clientR0PushrulesScopeKindRuleIdEnabledGet**](docs/DefaultApi.md#clientR0PushrulesScopeKindRuleIdEnabledGet) | **GET** /client/r0/pushrules/{scope}/{kind}/{ruleId}/enabled | Get whether a push rule is enabled
*DefaultApi* | [**clientR0RegisterEmailRequestTokenPost**](docs/DefaultApi.md#clientR0RegisterEmailRequestTokenPost) | **POST** /client/r0/register/email/requestToken | Requests a validation token be sent to the given email address for the purpose of registering an account
*DeviceManagementApi* | [**deleteDevice**](docs/DeviceManagementApi.md#deleteDevice) | **DELETE** /client/r0/devices/{deviceId} | Delete a device
*DeviceManagementApi* | [**getDevice**](docs/DeviceManagementApi.md#getDevice) | **GET** /client/r0/devices/{deviceId} | Get a single device
*DeviceManagementApi* | [**getDevices**](docs/DeviceManagementApi.md#getDevices) | **GET** /client/r0/devices | List registered devices for the current user
*DeviceManagementApi* | [**updateDevice**](docs/DeviceManagementApi.md#updateDevice) | **PUT** /client/r0/devices/{deviceId} | Update a device
*EndToEndEncryptionApi* | [**clientR0KeysChangesGet**](docs/EndToEndEncryptionApi.md#clientR0KeysChangesGet) | **GET** /client/r0/keys/changes | Query users with recent device key updates.
*EndToEndEncryptionApi* | [**clientR0KeysClaimPost**](docs/EndToEndEncryptionApi.md#clientR0KeysClaimPost) | **POST** /client/r0/keys/claim | Claim one-time encryption keys.
*EndToEndEncryptionApi* | [**clientR0KeysQueryPost**](docs/EndToEndEncryptionApi.md#clientR0KeysQueryPost) | **POST** /client/r0/keys/query | Download device identity keys.
*EndToEndEncryptionApi* | [**clientR0KeysUploadPost**](docs/EndToEndEncryptionApi.md#clientR0KeysUploadPost) | **POST** /client/r0/keys/upload | Upload end-to-end encryption keys.
*MediaApi* | [**mediaR0DownloadServerNameMediaIdFileNameGet**](docs/MediaApi.md#mediaR0DownloadServerNameMediaIdFileNameGet) | **GET** /media/r0/download/{serverName}/{mediaId}/{fileName} | Download content from the content repository as a given filename.
*MediaApi* | [**mediaR0DownloadServerNameMediaIdGet**](docs/MediaApi.md#mediaR0DownloadServerNameMediaIdGet) | **GET** /media/r0/download/{serverName}/{mediaId} | Download content from the content repository.
*MediaApi* | [**mediaR0ThumbnailServerNameMediaIdGet**](docs/MediaApi.md#mediaR0ThumbnailServerNameMediaIdGet) | **GET** /media/r0/thumbnail/{serverName}/{mediaId} | Download a thumbnail of the content from the content repository.
*MediaApi* | [**mediaR0UploadPost**](docs/MediaApi.md#mediaR0UploadPost) | **POST** /media/r0/upload | Upload some content to the content repository.
*PresenceApi* | [**clientR0PresenceListUserIdGet**](docs/PresenceApi.md#clientR0PresenceListUserIdGet) | **GET** /client/r0/presence/list/{userId} | Get presence events for this presence list.
*PresenceApi* | [**clientR0PresenceListUserIdPost**](docs/PresenceApi.md#clientR0PresenceListUserIdPost) | **POST** /client/r0/presence/list/{userId} | Add or remove users from this presence list.
*PresenceApi* | [**clientR0PresenceUserIdStatusGet**](docs/PresenceApi.md#clientR0PresenceUserIdStatusGet) | **GET** /client/r0/presence/{userId}/status | Get this user&#39;s presence state.
*PresenceApi* | [**clientR0PresenceUserIdStatusPut**](docs/PresenceApi.md#clientR0PresenceUserIdStatusPut) | **PUT** /client/r0/presence/{userId}/status | Update this user&#39;s presence state.
*PushNotificationsApi* | [**clientR0NotificationsGet**](docs/PushNotificationsApi.md#clientR0NotificationsGet) | **GET** /client/r0/notifications | Gets a list of events that the user has been notified about
*PushNotificationsApi* | [**clientR0PushersGet**](docs/PushNotificationsApi.md#clientR0PushersGet) | **GET** /client/r0/pushers | Gets the current pushers for the authenticated user
*PushNotificationsApi* | [**clientR0PushersSetPost**](docs/PushNotificationsApi.md#clientR0PushersSetPost) | **POST** /client/r0/pushers/set | Modify a pusher for this user on the homeserver.
*PushNotificationsApi* | [**clientR0PushrulesGet**](docs/PushNotificationsApi.md#clientR0PushrulesGet) | **GET** /client/r0/pushrules/ | Retrieve all push rulesets.
*PushNotificationsApi* | [**clientR0PushrulesScopeKindRuleIdActionsPut**](docs/PushNotificationsApi.md#clientR0PushrulesScopeKindRuleIdActionsPut) | **PUT** /client/r0/pushrules/{scope}/{kind}/{ruleId}/actions | Set the actions for a push rule.
*PushNotificationsApi* | [**clientR0PushrulesScopeKindRuleIdDelete**](docs/PushNotificationsApi.md#clientR0PushrulesScopeKindRuleIdDelete) | **DELETE** /client/r0/pushrules/{scope}/{kind}/{ruleId} | Delete a push rule.
*PushNotificationsApi* | [**clientR0PushrulesScopeKindRuleIdEnabledPut**](docs/PushNotificationsApi.md#clientR0PushrulesScopeKindRuleIdEnabledPut) | **PUT** /client/r0/pushrules/{scope}/{kind}/{ruleId}/enabled | Enable or disable a push rule.
*PushNotificationsApi* | [**clientR0PushrulesScopeKindRuleIdGet**](docs/PushNotificationsApi.md#clientR0PushrulesScopeKindRuleIdGet) | **GET** /client/r0/pushrules/{scope}/{kind}/{ruleId} | Retrieve a push rule.
*PushNotificationsApi* | [**clientR0PushrulesScopeKindRuleIdPut**](docs/PushNotificationsApi.md#clientR0PushrulesScopeKindRuleIdPut) | **PUT** /client/r0/pushrules/{scope}/{kind}/{ruleId} | Add or change a push rule.
*RoomCreationApi* | [**createRoom**](docs/RoomCreationApi.md#createRoom) | **POST** /client/r0/createRoom | Create a new room
*RoomDirectoryApi* | [**createRoomAlias**](docs/RoomDirectoryApi.md#createRoomAlias) | **PUT** /client/r0/directory/room/{roomAlias} | Create a new mapping from room alias to room ID.
*RoomDirectoryApi* | [**deleteRoomAlias**](docs/RoomDirectoryApi.md#deleteRoomAlias) | **DELETE** /client/r0/directory/room/{roomAlias} | Remove a mapping of room alias to room ID.
*RoomDirectoryApi* | [**getRoomId**](docs/RoomDirectoryApi.md#getRoomId) | **GET** /client/r0/directory/room/{roomAlias} | Get the room ID corresponding to this room alias.
*RoomDiscoveryApi* | [**filterPublicRooms**](docs/RoomDiscoveryApi.md#filterPublicRooms) | **POST** /client/r0/publicRooms | Lists the public rooms on the server with optional filter.
*RoomDiscoveryApi* | [**listPublicRooms**](docs/RoomDiscoveryApi.md#listPublicRooms) | **GET** /client/r0/publicRooms | Lists the public rooms on the server.
*RoomMembershipApi* | [**clientR0JoinRoomIdOrAliasPost**](docs/RoomMembershipApi.md#clientR0JoinRoomIdOrAliasPost) | **POST** /client/r0/join/{roomIdOrAlias} | Start the requesting user participating in a particular room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdBanPost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdBanPost) | **POST** /client/r0/rooms/{roomId}/ban | Ban a user in the room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdForgetPost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdForgetPost) | **POST** /client/r0/rooms/{roomId}/forget | Stop the requesting user remembering about a particular room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdInvitePost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdInvitePost) | **POST** /client/r0/rooms/{roomId}/invite  | Invite a user to participate in a particular room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdInvitePost_0**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdInvitePost_0) | **POST** /client/r0/rooms/{roomId}/invite | Invite a user to participate in a particular room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdJoinPost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdJoinPost) | **POST** /client/r0/rooms/{roomId}/join | Start the requesting user participating in a particular room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdKickPost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdKickPost) | **POST** /client/r0/rooms/{roomId}/kick | Kick a user from the room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdLeavePost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdLeavePost) | **POST** /client/r0/rooms/{roomId}/leave | Stop the requesting user participating in a particular room.
*RoomMembershipApi* | [**clientR0RoomsRoomIdUnbanPost**](docs/RoomMembershipApi.md#clientR0RoomsRoomIdUnbanPost) | **POST** /client/r0/rooms/{roomId}/unban | Unban a user from the room.
*RoomParticipationApi* | [**createFilter**](docs/RoomParticipationApi.md#createFilter) | **POST** /client/r0/user/{userId}/filter | Upload a new filter.
*RoomParticipationApi* | [**getAllRoomStates**](docs/RoomParticipationApi.md#getAllRoomStates) | **GET** /client/r0/rooms/{roomId}/state | Get all state events in the current state of a room.
*RoomParticipationApi* | [**getEvent**](docs/RoomParticipationApi.md#getEvent) | **GET** /client/r0/events/{eventId} | Get a single event by event ID.
*RoomParticipationApi* | [**getEventWithContext**](docs/RoomParticipationApi.md#getEventWithContext) | **GET** /client/r0/rooms/{roomId}/context/{eventId} | Get events and state around the specified event.
*RoomParticipationApi* | [**getFilter**](docs/RoomParticipationApi.md#getFilter) | **GET** /client/r0/user/{userId}/filter/{filterId} | Download a filter
*RoomParticipationApi* | [**getRoomMembers**](docs/RoomParticipationApi.md#getRoomMembers) | **GET** /client/r0/rooms/{roomId}/members | Get the m.room.member events for the room.
*RoomParticipationApi* | [**getRoomState**](docs/RoomParticipationApi.md#getRoomState) | **GET** /client/r0/rooms/{roomId}/state/{eventType} | Get the state identified by the type, with the empty state key.
*RoomParticipationApi* | [**getRoomStateWithKey**](docs/RoomParticipationApi.md#getRoomStateWithKey) | **GET** /client/r0/rooms/{roomId}/state/{eventType}/{stateKey} | Get the state identified by the type and key.
*RoomParticipationApi* | [**initialSync**](docs/RoomParticipationApi.md#initialSync) | **GET** /client/r0/initialSync | Get the user&#39;s current state.
*RoomParticipationApi* | [**listEvents**](docs/RoomParticipationApi.md#listEvents) | **GET** /client/r0/rooms/{roomId}/messages | Get a list of events for this room
*RoomParticipationApi* | [**listenForEvents**](docs/RoomParticipationApi.md#listenForEvents) | **GET** /client/r0/events | Listen on the event stream.
*RoomParticipationApi* | [**roomInitialSync**](docs/RoomParticipationApi.md#roomInitialSync) | **GET** /client/r0/rooms/{roomId}/initialSync | Snapshot the current state of a room and its most recent messages.
*RoomParticipationApi* | [**sendEvent**](docs/RoomParticipationApi.md#sendEvent) | **PUT** /client/r0/rooms/{roomId}/send/{eventType}/{txnId} | Send a message event to the given room.
*RoomParticipationApi* | [**sendReceipt**](docs/RoomParticipationApi.md#sendReceipt) | **POST** /client/r0/rooms/{roomId}/receipt/{receiptType}/{eventId} | Send a receipt for the given event ID.
*RoomParticipationApi* | [**setRoomState**](docs/RoomParticipationApi.md#setRoomState) | **PUT** /client/r0/rooms/{roomId}/state/{eventType} | Send a state event to the given room.
*RoomParticipationApi* | [**setRoomStateWithKey**](docs/RoomParticipationApi.md#setRoomStateWithKey) | **PUT** /client/r0/rooms/{roomId}/state/{eventType}/{stateKey} | Send a state event to the given room.
*RoomParticipationApi* | [**setTypingState**](docs/RoomParticipationApi.md#setTypingState) | **PUT** /client/r0/rooms/{roomId}/typing/{userId} | Informs the server that the user has started or stopped typing.
*RoomParticipationApi* | [**stripEvent**](docs/RoomParticipationApi.md#stripEvent) | **PUT** /client/r0/rooms/{roomId}/redact/{eventId}/{txnId} | Strips all non-integrity-critical information out of an event.
*RoomParticipationApi* | [**sync**](docs/RoomParticipationApi.md#sync) | **GET** /client/r0/sync | Synchronise the client&#39;s state and receive new messages.
*SearchApi* | [**clientR0SearchPost**](docs/SearchApi.md#clientR0SearchPost) | **POST** /client/r0/search | Perform a server-side search.
*SendToDeviceMessagingApi* | [**clientR0SendToDeviceEventTypeTxnIdPut**](docs/SendToDeviceMessagingApi.md#clientR0SendToDeviceEventTypeTxnIdPut) | **PUT** /client/r0/sendToDevice/{eventType}/{txnId} | Send an event to a given set of devices.
*ServerAdministrationApi* | [**versions**](docs/ServerAdministrationApi.md#versions) | **GET** /client/versions | Gets the versions of the specification supported by the server.
*ServerAdministrationApi* | [**whoIs**](docs/ServerAdministrationApi.md#whoIs) | **GET** /client/r0/admin/whois/{userId} | Gets information about a particular user.
*SessionManagementApi* | [**login**](docs/SessionManagementApi.md#login) | **POST** /client/r0/login | Authenticates the user.
*SessionManagementApi* | [**logout**](docs/SessionManagementApi.md#logout) | **POST** /client/r0/logout | Invalidates a user access token
*UserDataApi* | [**clientR0Account3pidGet**](docs/UserDataApi.md#clientR0Account3pidGet) | **GET** /client/r0/account/3pid | Gets a list of a user&#39;s third party identifiers.
*UserDataApi* | [**clientR0Account3pidPost**](docs/UserDataApi.md#clientR0Account3pidPost) | **POST** /client/r0/account/3pid | Adds contact information to the user&#39;s account.
*UserDataApi* | [**clientR0AccountDeactivatePost**](docs/UserDataApi.md#clientR0AccountDeactivatePost) | **POST** /client/r0/account/deactivate | Deactivate a user&#39;s account.
*UserDataApi* | [**clientR0AccountPasswordPost**](docs/UserDataApi.md#clientR0AccountPasswordPost) | **POST** /client/r0/account/password | Changes a user&#39;s password.
*UserDataApi* | [**clientR0ProfileUserIdAvatarUrlGet**](docs/UserDataApi.md#clientR0ProfileUserIdAvatarUrlGet) | **GET** /client/r0/profile/{userId}/avatar_url | Get the user&#39;s avatar URL.
*UserDataApi* | [**clientR0ProfileUserIdAvatarUrlPut**](docs/UserDataApi.md#clientR0ProfileUserIdAvatarUrlPut) | **PUT** /client/r0/profile/{userId}/avatar_url | Set the user&#39;s avatar URL.
*UserDataApi* | [**clientR0ProfileUserIdDisplaynameGet**](docs/UserDataApi.md#clientR0ProfileUserIdDisplaynameGet) | **GET** /client/r0/profile/{userId}/displayname | Get the user&#39;s display name.
*UserDataApi* | [**clientR0ProfileUserIdDisplaynamePut**](docs/UserDataApi.md#clientR0ProfileUserIdDisplaynamePut) | **PUT** /client/r0/profile/{userId}/displayname | Set the user&#39;s display name.
*UserDataApi* | [**clientR0ProfileUserIdGet**](docs/UserDataApi.md#clientR0ProfileUserIdGet) | **GET** /client/r0/profile/{userId} | Get this user&#39;s profile information.
*UserDataApi* | [**clientR0RegisterPost**](docs/UserDataApi.md#clientR0RegisterPost) | **POST** /client/r0/register | Register for an account on this homeserver.
*UserDataApi* | [**clientR0UserUserIdAccountDataTypePut**](docs/UserDataApi.md#clientR0UserUserIdAccountDataTypePut) | **PUT** /client/r0/user/{userId}/account_data/{type} | Set some account_data for the user.
*UserDataApi* | [**clientR0UserUserIdRoomsRoomIdAccountDataTypePut**](docs/UserDataApi.md#clientR0UserUserIdRoomsRoomIdAccountDataTypePut) | **PUT** /client/r0/user/{userId}/rooms/{roomId}/account_data/{type} | Set some account_data for the user.
*UserDataApi* | [**clientR0UserUserIdRoomsRoomIdTagsGet**](docs/UserDataApi.md#clientR0UserUserIdRoomsRoomIdTagsGet) | **GET** /client/r0/user/{userId}/rooms/{roomId}/tags | List the tags for a room.
*UserDataApi* | [**clientR0UserUserIdRoomsRoomIdTagsTagDelete**](docs/UserDataApi.md#clientR0UserUserIdRoomsRoomIdTagsTagDelete) | **DELETE** /client/r0/user/{userId}/rooms/{roomId}/tags/{tag} | Remove a tag from the room.
*UserDataApi* | [**clientR0UserUserIdRoomsRoomIdTagsTagPut**](docs/UserDataApi.md#clientR0UserUserIdRoomsRoomIdTagsTagPut) | **PUT** /client/r0/user/{userId}/rooms/{roomId}/tags/{tag} | Add a tag to a room.
*VOIPApi* | [**clientR0VoipTurnServerGet**](docs/VOIPApi.md#clientR0VoipTurnServerGet) | **GET** /client/r0/voip/turnServer | Obtain TURN server credentials.


## Documentation for Models

 - [Account3pidResponse](docs/Account3pidResponse.md)
 - [Answer](docs/Answer.md)
 - [AudioInfo](docs/AudioInfo.md)
 - [AuthData](docs/AuthData.md)
 - [AuthResponse](docs/AuthResponse.md)
 - [AuthResponseFlows](docs/AuthResponseFlows.md)
 - [AvatarUrl](docs/AvatarUrl.md)
 - [Body](docs/Body.md)
 - [Body1](docs/Body1.md)
 - [Body10](docs/Body10.md)
 - [Body11](docs/Body11.md)
 - [Body2](docs/Body2.md)
 - [Body3](docs/Body3.md)
 - [Body4](docs/Body4.md)
 - [Body5](docs/Body5.md)
 - [Body6](docs/Body6.md)
 - [Body7](docs/Body7.md)
 - [Body8](docs/Body8.md)
 - [Body9](docs/Body9.md)
 - [Candidate](docs/Candidate.md)
 - [Categories](docs/Categories.md)
 - [Categories1](docs/Categories1.md)
 - [ClientDevice](docs/ClientDevice.md)
 - [ConnectionInfo](docs/ConnectionInfo.md)
 - [CreateFilterResponse](docs/CreateFilterResponse.md)
 - [CreateRoomRequest](docs/CreateRoomRequest.md)
 - [CreateRoomResponse](docs/CreateRoomResponse.md)
 - [DeviceDeleteRequest](docs/DeviceDeleteRequest.md)
 - [DeviceInfo](docs/DeviceInfo.md)
 - [DeviceKeys](docs/DeviceKeys.md)
 - [DeviceUpdateRequest](docs/DeviceUpdateRequest.md)
 - [DevicesResponse](docs/DevicesResponse.md)
 - [DisplayName](docs/DisplayName.md)
 - [Error](docs/Error.md)
 - [Event](docs/Event.md)
 - [EventBatch](docs/EventBatch.md)
 - [EventContent](docs/EventContent.md)
 - [EventContext](docs/EventContext.md)
 - [EventContext1](docs/EventContext1.md)
 - [EventFilter](docs/EventFilter.md)
 - [EventId](docs/EventId.md)
 - [EventWithContextResponse](docs/EventWithContextResponse.md)
 - [FileInfo](docs/FileInfo.md)
 - [Filter](docs/Filter.md)
 - [GetRoomMembersResponse](docs/GetRoomMembersResponse.md)
 - [Group](docs/Group.md)
 - [Groupings](docs/Groupings.md)
 - [ImageInfo](docs/ImageInfo.md)
 - [InitialStateEvent](docs/InitialStateEvent.md)
 - [InitialSyncResponse](docs/InitialSyncResponse.md)
 - [InlineResponse200](docs/InlineResponse200.md)
 - [InlineResponse2001](docs/InlineResponse2001.md)
 - [InlineResponse20010](docs/InlineResponse20010.md)
 - [InlineResponse20011](docs/InlineResponse20011.md)
 - [InlineResponse20012](docs/InlineResponse20012.md)
 - [InlineResponse20013](docs/InlineResponse20013.md)
 - [InlineResponse20014](docs/InlineResponse20014.md)
 - [InlineResponse20015](docs/InlineResponse20015.md)
 - [InlineResponse2002](docs/InlineResponse2002.md)
 - [InlineResponse2003](docs/InlineResponse2003.md)
 - [InlineResponse2004](docs/InlineResponse2004.md)
 - [InlineResponse2005](docs/InlineResponse2005.md)
 - [InlineResponse2006](docs/InlineResponse2006.md)
 - [InlineResponse2007](docs/InlineResponse2007.md)
 - [InlineResponse2008](docs/InlineResponse2008.md)
 - [InlineResponse2009](docs/InlineResponse2009.md)
 - [Invite](docs/Invite.md)
 - [Invite3pid](docs/Invite3pid.md)
 - [InvitedRoom](docs/InvitedRoom.md)
 - [JoinedRoom](docs/JoinedRoom.md)
 - [Keys](docs/Keys.md)
 - [LeftRoom](docs/LeftRoom.md)
 - [ListEventsResponse](docs/ListEventsResponse.md)
 - [ListenForEventsResponse](docs/ListenForEventsResponse.md)
 - [LocationInfo](docs/LocationInfo.md)
 - [LoginRequest](docs/LoginRequest.md)
 - [LoginResponse](docs/LoginResponse.md)
 - [MCallAnswer](docs/MCallAnswer.md)
 - [MCallAnswerContent](docs/MCallAnswerContent.md)
 - [MCallCandidates](docs/MCallCandidates.md)
 - [MCallCandidatesContent](docs/MCallCandidatesContent.md)
 - [MCallHangup](docs/MCallHangup.md)
 - [MCallHangupContent](docs/MCallHangupContent.md)
 - [MCallInvite](docs/MCallInvite.md)
 - [MCallInviteContent](docs/MCallInviteContent.md)
 - [MDirect](docs/MDirect.md)
 - [MPresence](docs/MPresence.md)
 - [MPresenceContent](docs/MPresenceContent.md)
 - [MPushRules](docs/MPushRules.md)
 - [MPushRulesContent](docs/MPushRulesContent.md)
 - [MReceipt](docs/MReceipt.md)
 - [MReceiptEvent](docs/MReceiptEvent.md)
 - [MReceiptUser](docs/MReceiptUser.md)
 - [MRoomAliases](docs/MRoomAliases.md)
 - [MRoomAliasesContent](docs/MRoomAliasesContent.md)
 - [MRoomAvatar](docs/MRoomAvatar.md)
 - [MRoomAvatarContent](docs/MRoomAvatarContent.md)
 - [MRoomCanonicalAlias](docs/MRoomCanonicalAlias.md)
 - [MRoomCanonicalAliasContent](docs/MRoomCanonicalAliasContent.md)
 - [MRoomCreate](docs/MRoomCreate.md)
 - [MRoomCreateContent](docs/MRoomCreateContent.md)
 - [MRoomGuestAccess](docs/MRoomGuestAccess.md)
 - [MRoomGuestAccessContent](docs/MRoomGuestAccessContent.md)
 - [MRoomHistoryVisibility](docs/MRoomHistoryVisibility.md)
 - [MRoomHistoryVisibilityContent](docs/MRoomHistoryVisibilityContent.md)
 - [MRoomJoinRules](docs/MRoomJoinRules.md)
 - [MRoomJoinRulesContent](docs/MRoomJoinRulesContent.md)
 - [MRoomMember](docs/MRoomMember.md)
 - [MRoomMessage](docs/MRoomMessage.md)
 - [MRoomMessageContent](docs/MRoomMessageContent.md)
 - [MRoomMessageFeedback](docs/MRoomMessageFeedback.md)
 - [MRoomMessageFeedbackContent](docs/MRoomMessageFeedbackContent.md)
 - [MRoomMessageMAudio](docs/MRoomMessageMAudio.md)
 - [MRoomMessageMAudioContent](docs/MRoomMessageMAudioContent.md)
 - [MRoomMessageMEmote](docs/MRoomMessageMEmote.md)
 - [MRoomMessageMFile](docs/MRoomMessageMFile.md)
 - [MRoomMessageMImage](docs/MRoomMessageMImage.md)
 - [MRoomMessageMLocation](docs/MRoomMessageMLocation.md)
 - [MRoomMessageMNotice](docs/MRoomMessageMNotice.md)
 - [MRoomMessageMText](docs/MRoomMessageMText.md)
 - [MRoomMessageMVideo](docs/MRoomMessageMVideo.md)
 - [MRoomName](docs/MRoomName.md)
 - [MRoomNameContent](docs/MRoomNameContent.md)
 - [MRoomPowerLevels](docs/MRoomPowerLevels.md)
 - [MRoomPowerLevelsContent](docs/MRoomPowerLevelsContent.md)
 - [MRoomRedaction](docs/MRoomRedaction.md)
 - [MRoomRedactionContent](docs/MRoomRedactionContent.md)
 - [MRoomThirdPartyInvite](docs/MRoomThirdPartyInvite.md)
 - [MRoomThirdPartyInviteContent](docs/MRoomThirdPartyInviteContent.md)
 - [MRoomTopic](docs/MRoomTopic.md)
 - [MRoomTopicContent](docs/MRoomTopicContent.md)
 - [MTag](docs/MTag.md)
 - [MTagContent](docs/MTagContent.md)
 - [MTyping](docs/MTyping.md)
 - [MTypingContent](docs/MTypingContent.md)
 - [Notification](docs/Notification.md)
 - [Offer](docs/Offer.md)
 - [PaginationChunk](docs/PaginationChunk.md)
 - [PaginationChunk1](docs/PaginationChunk1.md)
 - [PresenceDiff](docs/PresenceDiff.md)
 - [PresenceState](docs/PresenceState.md)
 - [PublicKeys](docs/PublicKeys.md)
 - [PublicRoomsChunk](docs/PublicRoomsChunk.md)
 - [PublicRoomsResult](docs/PublicRoomsResult.md)
 - [PushCondition](docs/PushCondition.md)
 - [PushRule](docs/PushRule.md)
 - [PushRuleset](docs/PushRuleset.md)
 - [Pusher](docs/Pusher.md)
 - [PusherData](docs/PusherData.md)
 - [PusherData1](docs/PusherData1.md)
 - [Pushrule](docs/Pushrule.md)
 - [Query](docs/Query.md)
 - [Query1](docs/Query1.md)
 - [Result](docs/Result.md)
 - [Results](docs/Results.md)
 - [RoomBanRequest](docs/RoomBanRequest.md)
 - [RoomEvent](docs/RoomEvent.md)
 - [RoomEventFilter](docs/RoomEventFilter.md)
 - [RoomEventResults](docs/RoomEventResults.md)
 - [RoomEvents](docs/RoomEvents.md)
 - [RoomFilter](docs/RoomFilter.md)
 - [RoomFilter1](docs/RoomFilter1.md)
 - [RoomIdResponse](docs/RoomIdResponse.md)
 - [RoomInfo](docs/RoomInfo.md)
 - [RoomInitialSyncResponse](docs/RoomInitialSyncResponse.md)
 - [RoomUnbanRequest](docs/RoomUnbanRequest.md)
 - [Rooms](docs/Rooms.md)
 - [SessionInfo](docs/SessionInfo.md)
 - [Signed](docs/Signed.md)
 - [StateEvent](docs/StateEvent.md)
 - [StripEventResponse](docs/StripEventResponse.md)
 - [StrippedState](docs/StrippedState.md)
 - [SyncFilter](docs/SyncFilter.md)
 - [SyncResponse](docs/SyncResponse.md)
 - [ThirdPartyIdentifier](docs/ThirdPartyIdentifier.md)
 - [ThirdPartySigned](docs/ThirdPartySigned.md)
 - [ThirdPartySigned1](docs/ThirdPartySigned1.md)
 - [ThreePidCredentials](docs/ThreePidCredentials.md)
 - [ThumbnailInfo](docs/ThumbnailInfo.md)
 - [TimelineBatch](docs/TimelineBatch.md)
 - [TypingState](docs/TypingState.md)
 - [UnreadNotificationCounts](docs/UnreadNotificationCounts.md)
 - [UnsignedData](docs/UnsignedData.md)
 - [UploadResponse](docs/UploadResponse.md)
 - [UserProfile](docs/UserProfile.md)
 - [VersionsResponse](docs/VersionsResponse.md)
 - [VideoInfo](docs/VideoInfo.md)
 - [WhoIsResponse](docs/WhoIsResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### accessToken

- **Type**: API key
- **API key parameter name**: access_token
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author




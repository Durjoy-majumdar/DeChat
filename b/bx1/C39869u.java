package bx1;

import com.tencent.p014mm.autogen.events.ChatRoomJoinOrQuitEvent;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserConfirmStatusRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.UserConfirmStatusResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.u */
public class C39869u extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106923d;

    /* renamed from: e */
    public final C47350c f106924e;

    public C39869u(String str, int i, long j) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new UserConfirmStatusRequest();
        bVar.f127067b = new UserConfirmStatusResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/userconfirmstatus";
        bVar.f127069d = 4530;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106924e = a;
        UserConfirmStatusRequest userConfirmStatusRequest = (UserConfirmStatusRequest) a.f127055a.f127080a;
        userConfirmStatusRequest.chatroom_name = str;
        userConfirmStatusRequest.confirm_status = i;
        userConfirmStatusRequest.notification_id = j;
        Log.m105925i("GameChatRoom.CgiUserConfirmStatus", "chatRoomName:%s, status:%d, id:%d", str, Integer.valueOf(i), Long.valueOf(j));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106923d = nVar;
        return dispatch(gVar, this.f106924e, this);
    }

    public int getType() {
        return 4530;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiUserConfirmStatus", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        if (i2 == 0 && i3 == 0) {
            UserConfirmStatusRequest userConfirmStatusRequest = (UserConfirmStatusRequest) this.f106924e.f127055a.f127080a;
            if (userConfirmStatusRequest.confirm_status == 1) {
                ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent = new ChatRoomJoinOrQuitEvent();
                ChatRoomJoinOrQuitEvent.C40050a aVar = chatRoomJoinOrQuitEvent.f107400d;
                aVar.f107401a = 2;
                aVar.f107402b = userConfirmStatusRequest.chatroom_name;
                chatRoomJoinOrQuitEvent.publish();
            }
        }
        this.f106923d.onSceneEnd(i2, i3, str, this);
    }
}

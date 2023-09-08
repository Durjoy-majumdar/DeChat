package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LeaveChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.LeaveChatroomResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.o */
public class C0391o extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f994d;

    /* renamed from: e */
    public final C47350c f995e;

    public C0391o(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new LeaveChatroomRequest();
        bVar.f127067b = new LeaveChatroomResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/leavechatroom";
        bVar.f127069d = 4979;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f995e = a;
        ((LeaveChatroomRequest) a.f127055a.f127080a).chatroom_name = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f994d = nVar;
        return dispatch(gVar, this.f995e, this);
    }

    public int getType() {
        return 4979;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiLeaveChatRoom", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f994d.onSceneEnd(i2, i3, str, this);
    }
}

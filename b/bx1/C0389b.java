package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.EnterChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.EnterChatroomResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.b */
public class C0389b extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f991d;

    /* renamed from: e */
    public final C47350c f992e;

    public C0389b(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new EnterChatroomRequest();
        bVar.f127067b = new EnterChatroomResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/enterchatroom";
        bVar.f127069d = 4593;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f992e = a;
        ((EnterChatroomRequest) a.f127055a.f127080a).chatroom_name = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f991d = nVar;
        return dispatch(gVar, this.f992e, this);
    }

    public int getType() {
        return 4593;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiEnterChatRoom", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f991d.onSceneEnd(i2, i3, str, this);
    }
}

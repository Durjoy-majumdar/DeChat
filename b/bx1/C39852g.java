package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomRealtimeInfoResponse;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.g */
public class C39852g extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106877d;

    /* renamed from: e */
    public final C47350c f106878e;

    /* renamed from: f */
    public int f106879f;

    public C39852g(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetChatroomRealtimeInfoRequest();
        bVar.f127067b = new GetChatroomRealtimeInfoResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroomrealtimeinfo";
        bVar.f127069d = 4316;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127075j = true;
        bVar.f127076k = 25000;
        this.f106879f = i;
        C47350c a = bVar.mo72403a();
        this.f106878e = a;
        GetChatroomRealtimeInfoRequest getChatroomRealtimeInfoRequest = (GetChatroomRealtimeInfoRequest) a.f127055a.f127080a;
        getChatroomRealtimeInfoRequest.chatroom_name = str;
        getChatroomRealtimeInfoRequest.version = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106877d = nVar;
        return dispatch(gVar, this.f106878e, this);
    }

    public int getType() {
        return 4316;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f106877d.onSceneEnd(i2, i3, str, this);
    }
}

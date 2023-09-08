package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ReceiveChatroomMsgResponse;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.q */
public class C39864q extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106911d;

    /* renamed from: e */
    public final C47350c f106912e;

    /* renamed from: f */
    public int f106913f;

    public C39864q(String str, long j, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ReceiveChatroomMsgRequest();
        bVar.f127067b = new ReceiveChatroomMsgResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/receivechatroommsg";
        bVar.f127069d = 4302;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127075j = true;
        bVar.f127076k = 25000;
        this.f106913f = i;
        C47350c a = bVar.mo72403a();
        this.f106912e = a;
        ReceiveChatroomMsgRequest receiveChatroomMsgRequest = (ReceiveChatroomMsgRequest) a.f127055a.f127080a;
        receiveChatroomMsgRequest.chatroom_name = str;
        receiveChatroomMsgRequest.seq = j;
        receiveChatroomMsgRequest.version = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106911d = nVar;
        return dispatch(gVar, this.f106912e, this);
    }

    public int getType() {
        return 4302;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f106911d.onSceneEnd(i2, i3, str, this);
    }
}

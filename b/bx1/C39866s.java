package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SetChatroomMsgChosenRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.SetChatroomMsgChosenResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.s */
public class C39866s extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106916d;

    /* renamed from: e */
    public final C47350c f106917e;

    public C39866s(String str, long j, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new SetChatroomMsgChosenRequest();
        bVar.f127067b = new SetChatroomMsgChosenResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/setchatroommsgchosen";
        bVar.f127069d = 4383;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106917e = a;
        SetChatroomMsgChosenRequest setChatroomMsgChosenRequest = (SetChatroomMsgChosenRequest) a.f127055a.f127080a;
        setChatroomMsgChosenRequest.chatroom_name = str;
        setChatroomMsgChosenRequest.seq = j;
        setChatroomMsgChosenRequest.is_chosen = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106916d = nVar;
        return dispatch(gVar, this.f106917e, this);
    }

    public int getType() {
        return 4383;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiSetChatroomMsgChosen", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106916d.onSceneEnd(i2, i3, str, this);
    }
}

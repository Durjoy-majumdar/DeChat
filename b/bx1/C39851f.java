package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomPanelResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C47465a;

/* renamed from: bx1.f */
public final class C39851f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106875d;

    /* renamed from: e */
    public C47350c f106876e;

    public C39851f(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetChatroomPanelRequest();
        bVar.f127067b = new GetChatroomPanelResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroompanel";
        bVar.f127069d = 5072;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106876e = a;
        C47465a aVar = a.f127055a.f127080a;
        C87412m.m108592e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.game.autogen.chatroom.GetChatroomPanelRequest");
        ((GetChatroomPanelRequest) aVar).chatroom_name = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106875d = nVar;
        return dispatch(gVar, this.f106876e, this);
    }

    public int getType() {
        return 5072;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiVoteMsg", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f106875d;
        C87412m.m108591d(nVar);
        nVar.onSceneEnd(i2, i3, str, this);
    }
}

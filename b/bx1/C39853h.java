package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMoreChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMoreChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.h */
public class C39853h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106880d;

    /* renamed from: e */
    public final C47350c f106881e;

    public C39853h(String str, Lbs lbs, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetMoreChatroomRequest();
        bVar.f127067b = new GetMoreChatroomResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getmorechatroom";
        bVar.f127069d = 5048;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106881e = a;
        GetMoreChatroomRequest getMoreChatroomRequest = (GetMoreChatroomRequest) a.f127055a.f127080a;
        getMoreChatroomRequest.chatroom_filter = str;
        if (lbs != null) {
            getMoreChatroomRequest.lbs_info = lbs;
        }
        getMoreChatroomRequest.limit = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106880d = nVar;
        return dispatch(gVar, this.f106881e, this);
    }

    public int getType() {
        return 5048;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiGetMoreChatRoom", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106880d.onSceneEnd(i2, i3, str, this);
    }
}

package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetCanJoinChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetCanJoinChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.j */
public class C39855j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106885d;

    /* renamed from: e */
    public final C47350c f106886e;

    public C39855j(Lbs lbs) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetCanJoinChatroomRequest();
        bVar.f127067b = new GetCanJoinChatroomResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getcanjoinchatroom";
        bVar.f127069d = 4631;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106886e = a;
        GetCanJoinChatroomRequest getCanJoinChatroomRequest = (GetCanJoinChatroomRequest) a.f127055a.f127080a;
        if (lbs != null) {
            getCanJoinChatroomRequest.lbs_info = lbs;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106885d = nVar;
        return dispatch(gVar, this.f106886e, this);
    }

    public int getType() {
        return 4631;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiGetRecommendChatRoom", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106885d.onSceneEnd(i2, i3, str, this);
    }
}

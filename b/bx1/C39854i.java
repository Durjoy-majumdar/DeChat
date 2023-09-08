package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMyChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetMyChatroomResponse;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.i */
public class C39854i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106882d;

    /* renamed from: e */
    public final C47350c f106883e;

    /* renamed from: f */
    public int f106884f;

    public C39854i(List<String> list, String str, String str2, int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetMyChatroomRequest();
        bVar.f127067b = new GetMyChatroomResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getmychatroom";
        bVar.f127069d = 4989;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127075j = true;
        bVar.f127076k = 25000;
        this.f106884f = i2;
        C47350c a = bVar.mo72403a();
        this.f106883e = a;
        GetMyChatroomRequest getMyChatroomRequest = (GetMyChatroomRequest) a.f127055a.f127080a;
        Util.isNullOrNil((List) list);
        getMyChatroomRequest.first_chatroom_name = str;
        getMyChatroomRequest.version = str2;
        getMyChatroomRequest.scene_type = i;
        Log.m105925i("GameChatRoom.CgiGetMyChatRoom", "request params, version:%s, scene:%d", str2, Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106882d = nVar;
        return dispatch(gVar, this.f106883e, this);
    }

    public int getType() {
        return 4989;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f106882d.onSceneEnd(i2, i3, str, this);
    }
}

package bx1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.DebugOption;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ExportExternInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.GetChatroomBaseInfoResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C90188n0;

/* renamed from: bx1.c */
public class C39848c extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106869d;

    /* renamed from: e */
    public final C47350c f106870e;

    public C39848c(String str, Lbs lbs, ExportExternInfo exportExternInfo) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new GetChatroomBaseInfoRequest();
        bVar.f127067b = new GetChatroomBaseInfoResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/getchatroombaseinfo";
        bVar.f127069d = 4391;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f106870e = a;
        GetChatroomBaseInfoRequest getChatroomBaseInfoRequest = (GetChatroomBaseInfoRequest) a.f127055a.f127080a;
        getChatroomBaseInfoRequest.chatroom_name = str;
        getChatroomBaseInfoRequest.lbs_info = lbs;
        getChatroomBaseInfoRequest.export_extern_info = exportExternInfo;
        if (C90188n0.f258928V) {
            DebugOption debugOption = new DebugOption();
            debugOption.need_debug = true;
            debugOption.debug_info = "forceShowFirstEnterNotify";
            getChatroomBaseInfoRequest.debug_option = debugOption;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106869d = nVar;
        return dispatch(gVar, this.f106870e, this);
    }

    public int getType() {
        return 4391;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("GameChatRoom.CgiGetChatRoomBaseInfo", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        this.f106869d.onSceneEnd(i2, i3, str, this);
    }
}

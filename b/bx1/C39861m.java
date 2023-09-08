package bx1;

import com.tencent.p014mm.game.report.C40308d;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.game.autogen.chatroom.ExportExternInfo;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JoinChatroomRequest;
import com.tencent.p014mm.plugin.game.autogen.chatroom.JoinChatroomResponse;
import com.tencent.p014mm.plugin.game.autogen.chatroom.Lbs;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;

/* renamed from: bx1.m */
public class C39861m extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f106901d;

    /* renamed from: e */
    public final C47350c f106902e;

    /* renamed from: f */
    public boolean f106903f;

    /* renamed from: g */
    public long f106904g;

    /* renamed from: h */
    public long f106905h;

    public C39861m(String str, Lbs lbs, boolean z, long j, long j2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new JoinChatroomRequest();
        bVar.f127067b = new JoinChatroomResponse();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gamegamelifeappsvr/joinchatroom";
        bVar.f127069d = 4897;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f106903f = z;
        this.f106904g = j;
        this.f106905h = j2;
        C47350c a = bVar.mo72403a();
        this.f106902e = a;
        JoinChatroomRequest joinChatroomRequest = (JoinChatroomRequest) a.f127055a.f127080a;
        joinChatroomRequest.chatroom_name = str;
        if (lbs != null) {
            joinChatroomRequest.lbs_info = lbs;
        }
        ExportExternInfo exportExternInfo = new ExportExternInfo();
        exportExternInfo.sourceid = j2;
        exportExternInfo.ssid = j;
        joinChatroomRequest.extern_info = exportExternInfo;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f106901d = nVar;
        return dispatch(gVar, this.f106902e, this);
    }

    public int getType() {
        return 4897;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        int i4 = i2;
        int i5 = i3;
        String str2 = str;
        Log.m105924i("GameChatRoom.CgiJoinChatRoom", "errType = " + i4 + ", errCode = " + i5 + ", errMsg = " + str2);
        if (i4 == 0 && i5 == 0 && this.f106903f) {
            C40308d.f108375a.mo63003o(1, 14, 0, this.f106904g, this.f106905h);
        }
        this.f106901d.onSceneEnd(i4, i5, str2, this);
    }
}

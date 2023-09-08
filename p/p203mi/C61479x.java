package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49904iv3;
import te3.C64431hv3;
import te3.C77955jv3;

/* renamed from: mi.x */
public class C61479x extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f174807d;

    /* renamed from: e */
    public final C47350c f174808e;

    public C61479x(String str, String str2, String str3, C77955jv3 jv32) {
        Log.m105925i("MicroMsg.roomTodo.NetSceneRoomToolsReplyTodo", "NetSceneRoomToolsReplyTodo chatRoomName:%s creator:%s", Util.nullAs(str, ""), Util.nullAs(str2, ""), Util.nullAs(str3, ""), C76758b0.m92501f(jv32));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/roomtoolsreplytodo";
        bVar.f127069d = 3854;
        bVar.f127066a = new C64431hv3();
        bVar.f127067b = new C49904iv3();
        C47350c a = bVar.mo72403a();
        this.f174808e = a;
        C64431hv3 hv32 = (C64431hv3) a.f127055a.f127080a;
        hv32.f183558d = Util.nullAs(str, "");
        hv32.f183559e = str2;
        hv32.f183560f = str3;
        hv32.f183561g = jv32;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f174807d = nVar;
        return dispatch(gVar, this.f174808e, this);
    }

    public int getType() {
        return 3854;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.roomTodo.NetSceneRoomToolsReplyTodo", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49904iv3 iv32 = (C49904iv3) ((C47350c) uVar).f127056b.f127083a;
        this.f174807d.onSceneEnd(i2, i3, str, this);
    }
}

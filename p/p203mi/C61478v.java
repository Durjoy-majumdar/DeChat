package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49340ev3;
import te3.C64329dv3;
import te3.C77955jv3;

/* renamed from: mi.v */
public class C61478v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f174805d;

    /* renamed from: e */
    public final C47350c f174806e;

    public C61478v(String str, int i, C77955jv3 jv32) {
        Log.m105925i("MicroMsg.roomTodo.NetSceneRoomToolsAlterTodo", "NetSceneRoomToolsAlterTodo chatRoomName:%s op:%s roomToolsTodo%s", Util.nullAs(str, ""), Integer.valueOf(i), C76758b0.m92501f(jv32));
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/roomtoolsaltertodo";
        bVar.f127069d = 3618;
        bVar.f127066a = new C64329dv3();
        bVar.f127067b = new C49340ev3();
        C47350c a = bVar.mo72403a();
        this.f174806e = a;
        C64329dv3 dv32 = (C64329dv3) a.f127055a.f127080a;
        dv32.f182862d = Util.nullAs(str, "");
        dv32.f182863e = i;
        dv32.f182864f = jv32;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f174805d = nVar;
        return dispatch(gVar, this.f174806e, this);
    }

    public int getType() {
        return 3618;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.roomTodo.NetSceneRoomToolsAlterTodo", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49340ev3 ev32 = (C49340ev3) ((C47350c) uVar).f127056b.f127083a;
        this.f174805d.onSceneEnd(i2, i3, str, this);
    }
}

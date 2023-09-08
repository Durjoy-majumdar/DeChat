package p203mi;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C27676kv3;
import te3.C49054cv3;
import te3.C49478fv3;
import te3.C49617gv3;

/* renamed from: mi.w */
public class C47052w extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f126454d;

    /* renamed from: e */
    public final C47350c f126455e;

    public C47052w(String str, LinkedList<C27676kv3> linkedList) {
        Object[] objArr = new Object[2];
        objArr[0] = Util.nullAs(str, "");
        objArr[1] = linkedList != null ? Integer.valueOf(linkedList.size()) : "null";
        Log.m105925i("MicroMsg.roomtools.NetSceneRoomToolsAlterWxApp", "NetSceneRoomToolsAlterWxApp chatRoomName:%s roomToolsWxApps%s", objArr);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127068c = "/cgi-bin/micromsg-bin/roomtoolsalterwxapp";
        bVar.f127069d = 3546;
        bVar.f127066a = new C49478fv3();
        bVar.f127067b = new C49617gv3();
        C47350c a = bVar.mo72403a();
        this.f126455e = a;
        C49478fv3 fv32 = (C49478fv3) a.f127055a.f127080a;
        fv32.f133711d = Util.nullAs(str, "");
        C49054cv3 cv32 = new C49054cv3();
        fv32.f133712e = cv32;
        cv32.f131988d = linkedList.size();
        fv32.f133712e.f131989e = linkedList;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126454d = nVar;
        return dispatch(gVar, this.f126455e, this);
    }

    public int getType() {
        return 3546;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.roomtools.NetSceneRoomToolsAlterWxApp", "onGYNetEnd:[%d,%d,%s]", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49617gv3 gv32 = (C49617gv3) ((C47350c) uVar).f127056b.f127083a;
        this.f126454d.onSceneEnd(i2, i3, str, this);
    }
}

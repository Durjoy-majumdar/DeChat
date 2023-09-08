package rb0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51146rr3;
import te3.C51289sr3;
import te3.C51436tr3;

/* renamed from: rb0.t0 */
public class C36283t0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f96606d;

    /* renamed from: e */
    public C47350c f96607e;

    public C36283t0(LinkedList<C51146rr3> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51289sr3();
        bVar.f127067b = new C51436tr3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/reportcommand";
        bVar.f127069d = 2592;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f96607e = a;
        C51289sr3 sr32 = (C51289sr3) a.f127055a.f127080a;
        if (linkedList != null) {
            sr32.f141708d = linkedList;
        }
        Log.m105925i("MicroMsg.NetSceneReportBrandSession", "reportcommand MsgReport size %d", Integer.valueOf(sr32.f141708d.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f96606d = nVar;
        return dispatch(gVar, this.f96607e, this);
    }

    public int getType() {
        return 2592;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f96606d.onSceneEnd(i2, i3, str, this);
    }
}

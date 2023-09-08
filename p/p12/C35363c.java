package p12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51675vb2;
import te3.C51811wb2;

/* renamed from: p12.c */
public class C35363c extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f94695d = null;

    /* renamed from: e */
    public C51811wb2 f94696e = null;

    /* renamed from: f */
    public C11385n f94697f = null;

    public C35363c() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51675vb2();
        bVar.f127067b = new C51811wb2();
        bVar.f127069d = 746;
        bVar.f127068c = "/cgi-bin/micromsg-bin/getwcocallinfo";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f94695d = a;
        C51675vb2 vb22 = (C51675vb2) a.f127055a.f127080a;
        Log.m105924i("MicroMsg.NetSceneIPCallGetCallInfo", "NetSceneIPCallGetCallInfo");
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f94697f = nVar;
        return dispatch(gVar, this.f94695d, this);
    }

    public int getType() {
        return 746;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneIPCallGetCallInfo", "onGYNetEnd, errType: %d, errCode: %d", Integer.valueOf(i2), Integer.valueOf(i3));
        this.f94696e = (C51811wb2) ((C47350c) uVar).f127056b.f127083a;
        C11385n nVar = this.f94697f;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

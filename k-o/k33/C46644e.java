package k33;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50520nb2;
import te3.C50658ob2;
import te3.C51739vt3;

/* renamed from: k33.e */
public class C46644e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f125578d;

    /* renamed from: e */
    public final C47350c f125579e;

    /* renamed from: f */
    public String f125580f = "";

    /* renamed from: g */
    public int f125581g = 0;

    /* renamed from: h */
    public String f125582h = "";

    public C46644e(int i, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50520nb2();
        bVar.f127067b = new C50658ob2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getvoiceprintresource";
        bVar.f127069d = 611;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f125579e = a;
        C50520nb2 nb22 = (C50520nb2) a.f127055a.f127080a;
        Log.m105925i("MicroMsg.NetSceneGetVoicePrintResource", "sceneType %d %s", Integer.valueOf(i), str);
        nb22.f138525d = i;
        nb22.f138526e = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125578d = nVar;
        return dispatch(gVar, this.f125579e, this);
    }

    public int getType() {
        return 611;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneGetVoicePrintResource", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        C50658ob2 ob22 = (C50658ob2) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 || i3 == 0) {
            C51739vt3 vt32 = ob22.f139082d;
            if (vt32 != null) {
                this.f125580f = new String(vt32.f143693e.f140574f.f257327a);
                int i4 = ob22.f139082d.f143692d;
                this.f125581g = i4;
                Log.m105919d("MicroMsg.NetSceneGetVoicePrintResource", "vertify resid %d mtext %s", Integer.valueOf(i4), this.f125580f);
            } else {
                Log.m105920e("MicroMsg.NetSceneGetVoicePrintResource", "resp ResourceData null ");
            }
            this.f125578d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f125578d.onSceneEnd(i2, i3, str, this);
    }
}

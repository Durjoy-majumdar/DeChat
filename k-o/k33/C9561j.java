package k33;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.ae4;
import te3.be4;

/* renamed from: k33.j */
public class C9561j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f29786d;

    /* renamed from: e */
    public final C47350c f29787e;

    /* renamed from: f */
    public int f29788f;

    /* renamed from: g */
    public int f29789g;

    public C9561j(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ae4();
        bVar.f127067b = new be4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/switchopvoiceprint";
        bVar.f127069d = 615;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f29787e = a;
        ((ae4) a.f127055a.f127080a).f130475d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f29786d = nVar;
        return dispatch(gVar, this.f29787e, this);
    }

    public int getType() {
        return 615;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneSwitchOpVoicePrint", "onGYNetEnd  errType:" + i2 + " errCode:" + i3);
        be4 be4 = (be4) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 || i3 == 0) {
            this.f29788f = be4.f131072e;
            this.f29789g = be4.f131071d;
            this.f29786d.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f29786d.onSceneEnd(i2, i3, str, this);
    }
}

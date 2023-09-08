package qc2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51182s00;
import te3.C51322t00;

/* renamed from: qc2.a */
public class C47801a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128356d;

    /* renamed from: e */
    public C47350c f128357e;

    public C47801a(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51182s00();
        bVar.f127067b = new C51322t00();
        bVar.f127068c = "/cgi-bin/mmpay-bin/cpucardgetconfig2";
        bVar.f127069d = 1561;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128357e = a;
        ((C51182s00) a.f127055a.f127080a).f141244d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128356d = nVar;
        return dispatch(gVar, this.f128357e, this);
    }

    public int getType() {
        return 1561;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneCpuCardGetConfig", "onGYNetEnd errtype:" + i2 + " errcode:" + i3 + " errMsg:" + str);
        this.f128356d.onSceneEnd(i2, i3, str, this);
    }
}

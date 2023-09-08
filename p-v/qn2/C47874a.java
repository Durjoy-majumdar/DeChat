package qn2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52135ym;
import te3.C52282zm;

/* renamed from: qn2.a */
public class C47874a extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f128472d;

    /* renamed from: e */
    public final C47350c f128473e;

    public C47874a(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52135ym();
        bVar.f127067b = new C52282zm();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/card/cancelshakecard";
        bVar.f127069d = 1252;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128473e = a;
        C52135ym ymVar = (C52135ym) a.f127055a.f127080a;
        ymVar.f145391d = str;
        ymVar.f145392e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128472d = nVar;
        return dispatch(gVar, this.f128473e, this);
    }

    public int getType() {
        return 1252;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneCancelShakeCard", "onGYNetEnd, getType = " + 1252 + " errType = " + i2 + " errCode = " + i3);
        this.f128472d.onSceneEnd(i2, i3, str, this);
    }
}

package pd2;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50511n90;
import te3.C50650o90;

/* renamed from: pd2.d */
public class C47462d extends C75123k0 {

    /* renamed from: d */
    public C11385n f127309d;

    /* renamed from: e */
    public C47350c f127310e;

    public C47462d(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50511n90();
        bVar.f127067b = new C50650o90();
        bVar.f127068c = "/cgi-bin/micromsg-bin/evaluateorder";
        bVar.f127069d = 583;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127310e = a;
        C50511n90 n902 = (C50511n90) a.f127055a.f127080a;
        n902.f138491d = str;
        n902.f138492e = str2;
        n902.f138493f = i;
        n902.f138494g = C113146l.m154805c();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127309d = nVar;
        return dispatch(gVar, this.f127310e, this);
    }

    public int getType() {
        return 583;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetSceneEvaluateOrder", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C50650o90 o902 = (C50650o90) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f127309d.onSceneEnd(i2, i3, str, this);
    }
}

package w12;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49444fm2;
import te3.C49580gm2;

/* renamed from: w12.d */
public class C15034d extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f41169d;

    /* renamed from: e */
    public final C47350c f41170e;

    public C15034d(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49444fm2 fm22 = new C49444fm2();
        C49580gm2 gm22 = new C49580gm2();
        bVar.f127066a = fm22;
        bVar.f127067b = gm22;
        bVar.f127068c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
        bVar.f127069d = 973;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        fm22.f133589d = str;
        this.f41170e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f41169d = nVar;
        return dispatch(gVar, this.f41170e, this);
    }

    public int getType() {
        return 973;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f41169d.onSceneEnd(i2, i3, str, this);
    }
}

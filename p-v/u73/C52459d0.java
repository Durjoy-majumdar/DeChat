package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51593us3;
import te3.C51735vs3;

/* renamed from: u73.d0 */
public class C52459d0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146580d;

    /* renamed from: e */
    public C47350c f146581e;

    /* renamed from: f */
    public int f146582f;

    /* renamed from: g */
    public String f146583g;

    public C52459d0(C51593us3 us32) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1523;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/recsearchreport";
        bVar.f127066a = us32;
        bVar.f127067b = new C51735vs3();
        this.f146581e = bVar.mo72403a();
        this.f146582f = us32.f143091d;
        this.f146583g = us32.f143104t;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", Integer.valueOf(this.f146582f));
        C22613h1.m26480f(5);
        C22613h1.m26482h(this.f146582f, 4, 0, 0, this.f146583g);
        this.f146580d = nVar;
        return dispatch(gVar, this.f146581e, this);
    }

    public int getType() {
        return 1523;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f146580d.onSceneEnd(i2, i3, str, this);
            C22613h1.m26480f(6);
            C22613h1.m26482h(this.f146582f, 5, i2, i3, this.f146583g);
            return;
        }
        this.f146580d.onSceneEnd(i2, i3, str, this);
        C22613h1.m26480f(7);
    }
}

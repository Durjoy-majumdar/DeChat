package u73;

import c00.C39883l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51593us3;
import te3.C51735vs3;

/* renamed from: u73.j0 */
public class C52464j0 extends C117747y implements C1311n, C39883l {

    /* renamed from: d */
    public C11385n f146596d;

    /* renamed from: e */
    public C47350c f146597e;

    /* renamed from: f */
    public int f146598f;

    /* renamed from: g */
    public String f146599g;

    public C52464j0(C51593us3 us32) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 1134;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchreport";
        bVar.f127066a = us32;
        bVar.f127067b = new C51735vs3();
        this.f146597e = bVar.mo72403a();
        this.f146598f = us32.f143091d;
        this.f146599g = us32.f143104t;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105925i("MicroMsg.FTS.NetSceneWebSearchReport", "doScene %d", Integer.valueOf(this.f146598f));
        C22613h1.m26480f(5);
        C22613h1.m26482h(this.f146598f, 4, 0, 0, this.f146599g);
        this.f146596d = nVar;
        return dispatch(gVar, this.f146597e, this);
    }

    public int getType() {
        return 1134;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.FTS.NetSceneWebSearchReport", "netId %d | errType %d | errCode %d | errMsg %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f146596d.onSceneEnd(i2, i3, str, this);
            C22613h1.m26480f(6);
            C22613h1.m26482h(this.f146598f, 5, i2, i3, this.f146599g);
            return;
        }
        this.f146596d.onSceneEnd(i2, i3, str, this);
        C22613h1.m26480f(7);
    }
}

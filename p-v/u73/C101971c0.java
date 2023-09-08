package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p213oh.C11412b;
import te3.x25;
import te3.y25;

/* renamed from: u73.c0 */
public class C101971c0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f300222d;

    /* renamed from: e */
    public C47350c f300223e;

    /* renamed from: f */
    public y25 f300224f;

    /* renamed from: g */
    public C101968a0 f300225g;

    public C101971c0(C101968a0 a0Var) {
        this.f300225g = a0Var;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4858;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/mmtagsearch";
        bVar.f127066a = new x25();
        bVar.f127067b = new y25();
        C47350c a = bVar.mo72403a();
        this.f300223e = a;
        a0Var.mo141490a((x25) a.f127055a.f127080a, 6, C101987v0.m134273g(), C101987v0.m134272f());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300222d = nVar;
        return dispatch(gVar, this.f300223e, this);
    }

    public int getType() {
        return 4858;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneTagSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f300224f = (y25) this.f300223e.f127056b.f127083a;
        C11385n nVar = this.f300222d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

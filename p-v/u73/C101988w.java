package u73;

import c00.C39881j;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p213oh.C11412b;
import te3.C48884bn2;
import te3.x25;
import te3.y25;

/* renamed from: u73.w */
public class C101988w extends C117747y implements C1311n, C39881j {

    /* renamed from: d */
    public C11385n f300301d;

    /* renamed from: e */
    public C47350c f300302e;

    /* renamed from: f */
    public x25 f300303f;

    /* renamed from: g */
    public y25 f300304g;

    /* renamed from: h */
    public C101968a0 f300305h;

    public C101988w(C101968a0 a0Var) {
        this.f300305h = a0Var;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 719;
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmwebsearch";
        bVar.f127066a = new x25();
        bVar.f127067b = new y25();
        C47350c a = bVar.mo72403a();
        this.f300302e = a;
        x25 x25 = (x25) a.f127055a.f127080a;
        this.f300303f = x25;
        C101968a0 a0Var2 = this.f300305h;
        x25.f299826e = a0Var2.f300187b;
        x25.f299825d = a0Var2.f300186a;
        x25.f299828g = (long) a0Var2.f300189d;
        x25.f299830i = C101987v0.m134273g();
        x25 x252 = this.f300303f;
        x252.f299827f = this.f300305h.f300188c;
        x252.f299829h = C43471q.m46977a(0);
        x25 x253 = this.f300303f;
        C101968a0 a0Var3 = this.f300305h;
        x253.f299831j = a0Var3.f300190e;
        x253.f299832n = a0Var3.f300191f;
        x253.f299833o = a0Var3.f300192g;
        x253.f299834p = a0Var3.f300193h;
        x253.f299835q = a0Var3.f300194i;
        x253.f299837s = a0Var3.f300196k;
        x253.f299836r = a0Var3.f300195j;
        x253.f299838t = a0Var3.f300197l;
        x253.f299841w = a0Var3.f300200o;
        x253.f299840v = a0Var3.f300199n;
        x253.f299842x = a0Var3.f300201p;
        x253.f299843y = a0Var3.f300203r;
        x253.f299817A = a0Var3.f300207v;
        x253.f299822F = C85875k4.m106211z() ? 1 : 0;
        this.f300303f.f299823G = C101987v0.m134272f();
        x25 x254 = this.f300303f;
        if (x254.f299830i == null) {
            x254.f299830i = new C48884bn2();
            this.f300303f.f299830i.f131226n = C101987v0.m134274h() ^ true ? 1 : 0;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300301d = nVar;
        return dispatch(gVar, this.f300302e, this);
    }

    public int getType() {
        return 719;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneMMWebSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f300304g = (y25) this.f300302e.f127056b.f127083a;
        C11385n nVar = this.f300301d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

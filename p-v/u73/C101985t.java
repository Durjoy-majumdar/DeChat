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

/* renamed from: u73.t */
public class C101985t extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f300291d;

    /* renamed from: e */
    public C47350c f300292e;

    /* renamed from: f */
    public y25 f300293f;

    /* renamed from: g */
    public C101968a0 f300294g;

    public C101985t(C101968a0 a0Var) {
        this.f300294g = a0Var;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4384;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/emojichatsearch";
        bVar.f127066a = new x25();
        bVar.f127067b = new y25();
        C47350c a = bVar.mo72403a();
        this.f300292e = a;
        a0Var.mo141490a((x25) a.f127055a.f127080a, 10, C101987v0.m134273g(), C101987v0.m134272f());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300291d = nVar;
        return dispatch(gVar, this.f300292e, this);
    }

    public int getType() {
        return 4384;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneEmojiSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f300293f = (y25) this.f300292e.f127056b.f127083a;
        C11385n nVar = this.f300291d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

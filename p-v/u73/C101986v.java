package u73;

import android.graphics.Bitmap;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p213oh.C11412b;
import te3.C101806l82;
import te3.C101810m82;

/* renamed from: u73.v */
public class C101986v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f300295d;

    /* renamed from: e */
    public C47350c f300296e;

    /* renamed from: f */
    public C101806l82 f300297f;

    /* renamed from: g */
    public C101810m82 f300298g;

    /* renamed from: h */
    public int f300299h;

    /* renamed from: i */
    public Bitmap f300300i = null;

    public C101986v(C101806l82 l822, int i) {
        this.f300297f = l822;
        this.f300299h = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 4614;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchshare";
        bVar.f127066a = l822;
        bVar.f127067b = new C101810m82();
        this.f300296e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f300295d = nVar;
        return dispatch(gVar, this.f300296e, this);
    }

    public int getType() {
        return 4614;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), str};
        int i4 = C11412b.f33577a;
        Log.m105925i("MicroMsg.WebSearch.NetSceneGetSearchShare", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f300298g = (C101810m82) this.f300296e.f127056b.f127083a;
        C11385n nVar = this.f300295d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

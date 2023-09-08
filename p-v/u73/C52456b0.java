package u73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48884bn2;
import te3.C51465ty3;
import te3.c25;

/* renamed from: u73.b0 */
public class C52456b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f146571d;

    /* renamed from: e */
    public C47350c f146572e;

    /* renamed from: f */
    public long f146573f = System.currentTimeMillis();

    /* renamed from: g */
    public String f146574g;

    /* renamed from: h */
    public int f146575h;

    public C52456b0(String str, String str2, int i) {
        this.f146575h = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127069d = 2975;
        bVar.f127068c = "/cgi-bin/mmsearch-bin/searchwebquery";
        bVar.f127066a = new C51465ty3();
        bVar.f127067b = new c25();
        C47350c a = bVar.mo72403a();
        this.f146572e = a;
        C51465ty3 ty32 = (C51465ty3) a.f127055a.f127080a;
        ty32.f142473d = str2;
        ty32.f142474e = str;
        C48884bn2 g = C101987v0.m134273g();
        ty32.f142476g = g;
        this.f146574g = str;
        if (g == null) {
            C48884bn2 bn22 = new C48884bn2();
            ty32.f142476g = bn22;
            bn22.f131226n = C101987v0.m134274h() ^ true ? 1 : 0;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f146571d = nVar;
        return dispatch(gVar, this.f146572e, this);
    }

    public int getType() {
        return 2975;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.WebSearch.NetSceneSearchWebQuery", "netId %d | errType %d | errCode %d | errMsg %s useTime %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str, Long.valueOf(System.currentTimeMillis() - this.f146573f));
        this.f146571d.onSceneEnd(i2, i3, str, this);
    }
}

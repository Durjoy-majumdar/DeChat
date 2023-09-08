package fx0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48927by3;
import te3.C49066cy3;

/* renamed from: fx0.v */
public class C45842v extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123782d;

    /* renamed from: e */
    public C47350c f123783e;

    /* renamed from: f */
    public String f123784f;

    /* renamed from: g */
    public long f123785g;

    /* renamed from: h */
    public C49066cy3 f123786h;

    /* renamed from: i */
    public int f123787i;

    public C45842v(String str, long j, int i) {
        this.f123784f = str;
        this.f123785g = j;
        this.f123787i = i;
        Log.m105925i("MicroMsg.NetSceneSearchHomePageNew", "Constructors: keyword (%s) , businessType (%d), scene (%d)", str, Long.valueOf(j), Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneSearchHomePageNew", "doScene");
        this.f123782d = nVar;
        if (!Util.isNullOrNil(this.f123784f)) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = WXWebReporter.WXWEB_IDKEY_FR_EXCEL_ID;
            bVar.f127068c = "/cgi-bin/mmbiz-bin/bizsearch/homepage";
            bVar.f127066a = new C48927by3();
            bVar.f127067b = new C49066cy3();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f123783e = a;
            C48927by3 by32 = (C48927by3) a.f127055a.f127080a;
            by32.f131391e = this.f123784f;
            by32.f131392f = C45831k.m51131a();
            long j = this.f123785g;
            by32.f131390d = j;
            by32.f131393g = this.f123787i;
            Log.m105925i("MicroMsg.NetSceneSearchHomePageNew", "businessTypeList is %d", Long.valueOf(j));
            return dispatch(gVar, this.f123783e, this);
        }
        Log.m105920e("MicroMsg.NetSceneSearchHomePageNew", "keyword is unavailable");
        return -1;
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_FR_EXCEL_ID;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47350c cVar;
        Log.m105925i("MicroMsg.NetSceneSearchHomePageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0 && (cVar = this.f123783e) != null) {
            this.f123786h = (C49066cy3) cVar.f127056b.f127083a;
        }
        C11385n nVar = this.f123782d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

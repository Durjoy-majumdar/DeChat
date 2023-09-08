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
import te3.C50607nx3;
import te3.C50750ox3;

/* renamed from: fx0.u */
public class C45841u extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123774d;

    /* renamed from: e */
    public C47350c f123775e;

    /* renamed from: f */
    public C50750ox3 f123776f;

    /* renamed from: g */
    public String f123777g;

    /* renamed from: h */
    public long f123778h;

    /* renamed from: i */
    public int f123779i;

    /* renamed from: j */
    public int f123780j;

    /* renamed from: n */
    public String f123781n;

    public C45841u(String str, long j, int i, int i2, String str2) {
        this.f123777g = str;
        this.f123778h = j;
        this.f123779i = i;
        this.f123780j = i2;
        this.f123781n = str2;
        Log.m105925i("MicroMsg.NetSceneSearchDetailPageNew", "Constructors: keyword = (%s) , LSB exist () , businessType is (%d) , offset is (%d) , scene is (%d), searchId(%s).", str, Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(i2), str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123774d = nVar;
        if (!Util.isNullOrNil(this.f123777g)) {
            C47350c.C47352b bVar = new C47350c.C47352b();
            bVar.f127069d = WXWebReporter.WXWEB_IDKEY_FR_PDF_ID;
            bVar.f127068c = "/cgi-bin/mmbiz-bin/bizsearch/detailpage";
            bVar.f127066a = new C50607nx3();
            bVar.f127067b = new C50750ox3();
            bVar.f127070e = 0;
            bVar.f127071f = 0;
            C47350c a = bVar.mo72403a();
            this.f123775e = a;
            C50607nx3 nx32 = (C50607nx3) a.f127055a.f127080a;
            nx32.f138817g = C45831k.m51131a();
            nx32.f138815e = this.f123777g;
            nx32.f138814d = this.f123778h;
            nx32.f138816f = this.f123779i;
            nx32.f138818h = this.f123780j;
            nx32.f138821n = this.f123781n;
            return dispatch(gVar, this.f123775e, this);
        }
        Log.m105920e("MicroMsg.NetSceneSearchDetailPageNew", "keyword is unavailable.");
        return -1;
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_FR_PDF_ID;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        C47350c cVar;
        Log.m105925i("MicroMsg.NetSceneSearchDetailPageNew", "netId (%d) , errType (%d) , errCode (%d) , errMsg (%s)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0 && (cVar = this.f123775e) != null) {
            this.f123776f = (C50750ox3) cVar.f127056b.f127083a;
        }
        C11385n nVar = this.f123774d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

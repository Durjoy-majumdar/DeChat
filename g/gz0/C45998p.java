package gz0;

import com.tencent.p014mm.sdk.platformtools.Log;
import f40.C86709a0;
import hz0.C46158u;
import ob0.C11385n;
import ob0.C117747y;

/* renamed from: gz0.p */
public class C45998p implements C11385n {

    /* renamed from: d */
    public float f124035d = -85.0f;

    /* renamed from: e */
    public float f124036e = -1000.0f;

    /* renamed from: f */
    public long f124037f = 0;

    /* renamed from: a */
    public void mo71409a(String str, String str2, int i) {
        if ((System.currentTimeMillis() / 1000) - this.f124037f > 1800) {
            this.f124035d = -85.0f;
            this.f124036e = -1000.0f;
            Log.m105924i("MicroMsg.CardReportLBSManager", "checkDataValid time is out");
        }
        if (this.f124035d == -85.0f) {
            Log.m105924i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLatitude ==  LocationGeo.INVALID_LAT");
        }
        if (this.f124036e == -1000.0f) {
            Log.m105924i("MicroMsg.CardReportLBSManager", "checkDataValid lbsLongitude ==  LocationGeo.INVALID_LNG");
        }
        C86709a0.m107529k().f251779b.mo123455a(1253, this);
        C86709a0.m107529k().f251779b.mo123460f(new C46158u(this.f124035d, this.f124036e, str, str2, i));
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105925i("MicroMsg.CardReportLBSManager", "rplbs onGYNetEnd, errType = %d, errCode = %d", Integer.valueOf(i), Integer.valueOf(i2));
        C86709a0.m107529k().f251779b.mo123470p(1253, this);
    }
}

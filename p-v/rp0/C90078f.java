package rp0;

import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C47350c;
import rp0.C90079g;
import te3.C90423kk2;
import te3.C90426lk2;

/* renamed from: rp0.f */
public class C90078f extends C90079g {
    public C90078f(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4, int i5, boolean z, C90079g.C90080a<C90079g> aVar) {
        super(str, str2, str3, i, i2, i3, i4, false, str4, i5, z);
        this.f258744f = aVar;
    }

    /* renamed from: j1 */
    public C47350c.C47352b mo124367j1(boolean z) {
        Log.m105918d("MicroMsg.webview.NetSceneJSOperateImportantWxData", "getReqRespBuidler");
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C90423kk2();
        bVar.f127067b = new C90426lk2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/js-operatewxdata-vip";
        bVar.f127069d = 1912;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        return bVar;
    }
}

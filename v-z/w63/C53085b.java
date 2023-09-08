package w63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51956xc3;
import te3.C52100yc3;

/* renamed from: w63.b */
public class C53085b extends C75123k0 {

    /* renamed from: d */
    public C11385n f148156d;

    /* renamed from: e */
    public C47350c f148157e;

    public C53085b(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51956xc3();
        bVar.f127067b = new C52100yc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payudeluserroll";
        bVar.f127069d = WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f148157e = a;
        C51956xc3 xc32 = (C51956xc3) a.f127055a.f127080a;
        if (!Util.isNullOrNil(str)) {
            xc32.f144590d = str;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f148156d = nVar;
        return dispatch(gVar, this.f148157e, this);
    }

    public int getType() {
        return WXWebReporter.WXWEB_IDKEY_FR_OFFICE_ID;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetScenePayUDelUserRoll", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        this.f148156d.onSceneEnd(i2, i3, str, this);
    }
}

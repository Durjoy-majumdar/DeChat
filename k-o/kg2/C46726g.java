package kg2;

import c63.C67346c;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.appbrand.jsapi.storage.C83018k;
import com.tencent.p014mm.pluginsdk.wallet.PayInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.fd4;
import te3.gd4;

/* renamed from: kg2.g */
public class C46726g extends C75123k0 implements C45119n {

    /* renamed from: d */
    public C11385n f125794d;

    /* renamed from: e */
    public C47350c f125795e;

    /* renamed from: f */
    public PayInfo f125796f;

    /* renamed from: g */
    public String f125797g;

    public C46726g(String str, String str2, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new fd4();
        bVar.f127067b = new gd4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/submitpayproductbuyinfo";
        bVar.f127069d = C83018k.CTRL_INDEX;
        bVar.f127070e = 230;
        bVar.f127071f = 1000000230;
        C47350c a = bVar.mo72403a();
        this.f125795e = a;
        fd4 fd4 = (fd4) a.f127055a.f127080a;
        Log.m105919d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "remark: %s", str4);
        this.f125797g = str;
        fd4.f133440f = str;
        fd4.f133438d = str2;
        fd4.f133439e = str3;
        fd4.f133441g = str4;
        fd4.f133442h = C67346c.m79699b().mo91479c(str2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125794d = nVar;
        return dispatch(gVar, this.f125795e, this);
    }

    public int getType() {
        return C83018k.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        this.f125796f = new PayInfo();
        gd4 gd4 = (gd4) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "resp.ReqKey " + gd4.f133982d);
            PayInfo payInfo = this.f125796f;
            payInfo.f212594o = this.f125797g;
            payInfo.f212595p = gd4.f133983e;
            payInfo.f212592j = gd4.f133982d;
        }
        if (i3 == 0) {
            i3 = gd4.f133984f;
        }
        if (Util.isNullOrNil(str)) {
            str = gd4.f133985g;
        }
        this.f125796f.getClass();
        PayInfo payInfo2 = this.f125796f;
        String str2 = "";
        if (str != null) {
            str2 = str2 + str;
        }
        payInfo2.f212599t = str2;
        Log.m105918d("MicroMsg.NetSceneSubmitPayProductBuyInfo", "errCode " + i3 + ", errMsg " + str);
        this.f125794d.onSceneEnd(i2, i3, str, this);
    }
}

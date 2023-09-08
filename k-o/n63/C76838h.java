package n63;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.opensdk.modelpay.PayReq;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C47350c;
import te3.C64625pb3;
import te3.C77972ob3;

/* renamed from: n63.h */
public class C76838h extends C75123k0 implements C45119n {

    /* renamed from: d */
    public C11385n f224665d;

    /* renamed from: e */
    public C47350c f224666e;

    public C76838h(PayReq payReq, String str, String str2, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77972ob3();
        bVar.f127067b = new C64625pb3();
        bVar.f127068c = getUri();
        bVar.f127069d = getType();
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_MD5_FAILED;
        bVar.f127071f = 1000000188;
        C75228t.m90208A(payReq.prepayId);
        bVar.f127073h = 0;
        C47350c a = bVar.mo72403a();
        this.f224666e = a;
        C77972ob3 ob32 = (C77972ob3) a.f127055a.f127080a;
        ob32.f227906d = payReq.appId;
        ob32.f227907e = payReq.partnerId;
        ob32.f227908f = payReq.prepayId;
        ob32.f227909g = payReq.nonceStr;
        ob32.f227910h = payReq.timeStamp;
        ob32.f227911i = payReq.packageValue;
        ob32.f227912j = payReq.sign;
        ob32.f227913n = payReq.signType;
        ob32.f227914o = str;
        ob32.f227917r = str2;
        ob32.f227918s = str3;
        ob32.f227915p = C113146l.m154805c();
        ob32.f227919t = str4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f224665d = nVar;
        return dispatch(gVar, this.f224666e, this);
    }

    public int getType() {
        return 397;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/payauthapp";
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetScenePayAuthApp", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        this.f224665d.onSceneEnd(i2, i3, str, this);
    }
}

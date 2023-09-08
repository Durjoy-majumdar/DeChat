package n63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C47350c;
import te3.C52014xs1;
import te3.C52163ys1;

/* renamed from: n63.e */
public class C47164e extends C75123k0 {

    /* renamed from: d */
    public C11385n f126700d;

    /* renamed from: e */
    public C47350c f126701e;

    /* renamed from: f */
    public String f126702f;

    /* renamed from: g */
    public String f126703g;

    public C47164e(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52014xs1();
        bVar.f127067b = new C52163ys1();
        bVar.f127068c = "/cgi-bin/mmpay-bin/genmallprepay";
        bVar.f127069d = 2755;
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
        bVar.f127071f = 1000000189;
        C47350c a = bVar.mo72403a();
        this.f126701e = a;
        C52014xs1 xs12 = (C52014xs1) a.f127055a.f127080a;
        xs12.f144917d = str;
        xs12.f144920g = str4;
        xs12.f144918e = str3;
        xs12.f144921h = str5;
        xs12.f144922i = str2;
        xs12.f144919f = str6;
        xs12.f144923j = str7;
        xs12.f144924n = str8;
        xs12.f144925o = i;
        xs12.f144926p = str9;
        if (i2 > 0) {
            xs12.f144927q = i2;
        }
        Log.m105918d("MicroMsg.NetSceneGenMallPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s", new Object[]{str, str4, str3, str5, str2, str6, str7, str8, Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126700d = nVar;
        return dispatch(gVar, this.f126701e, this);
    }

    public int getType() {
        return 2755;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetSceneGenMallPrepay", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        C52163ys1 ys12 = (C52163ys1) ((C47350c) uVar).f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneGenMallPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", Integer.valueOf(ys12.f145494f), ys12.f145495g);
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneGenMallPrepay", "rr " + ys12.f145492d);
            this.f126702f = ys12.f145492d;
            this.f126703g = ys12.f145493e;
        }
        String str2 = ys12.f145495g;
        this.f126700d.onSceneEnd(i2, ys12.f145494f, str2, this);
    }
}

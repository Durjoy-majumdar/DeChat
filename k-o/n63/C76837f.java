package n63;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.xweb.util.WXWebReporter;
import ob0.C11385n;
import ob0.C47350c;
import pv2.C110259i;
import pv2.C110260j;
import te3.C64244at1;
import te3.C78025zs1;
import te3.wy4;

/* renamed from: n63.f */
public class C76837f extends C75123k0 implements C45119n {

    /* renamed from: d */
    public C11385n f224659d;

    /* renamed from: e */
    public C47350c f224660e;

    /* renamed from: f */
    public String f224661f;

    /* renamed from: g */
    public String f224662g;

    /* renamed from: h */
    public wy4 f224663h;

    /* renamed from: i */
    public String f224664i = "";

    public C76837f(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, String str9) {
        String str10 = str;
        String str11 = str2;
        String str12 = str3;
        String str13 = str4;
        String str14 = str5;
        String str15 = str6;
        String str16 = str7;
        String str17 = str8;
        int i4 = i2;
        String str18 = str9;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C78025zs1();
        bVar.f127067b = new C64244at1();
        bVar.f127068c = getUri();
        bVar.f127069d = getType();
        bVar.f127070e = WXWebReporter.WXWEB_IDKEY_FULL_SCREEN_JS_USE_DOWNLOAD;
        bVar.f127071f = 1000000189;
        C75228t.m90208A(str4);
        bVar.f127073h = 0;
        this.f224660e = bVar.mo72403a();
        this.f224664i = str16;
        C110260j a = C110259i.m149874a();
        String str19 = a.f329808a;
        String str20 = a.f329809b;
        C78025zs1 zs12 = (C78025zs1) this.f224660e.f127055a.f127080a;
        zs12.f228751d = str10;
        zs12.f228754g = str13;
        zs12.f228752e = str12;
        zs12.f228755h = str14;
        zs12.f228756i = str11;
        zs12.f228753f = str15;
        zs12.f228757j = str16;
        zs12.f228758n = str17;
        zs12.f228759o = i;
        zs12.f228762r = str19;
        zs12.f228761q = str20;
        zs12.f228763s = C113146l.m154805c();
        if (i4 > 0) {
            zs12.f228764t = i4;
        }
        zs12.f228765u = i3;
        zs12.f228766v = str18;
        Log.m105919d("MicroMsg.NetSceneGenPrepay", "appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,channel:%s,scene:%s,WxAppScene:%s,cookie:%s", str10, str13, str12, str14, str11, str15, str16, str17, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str18);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f224659d = nVar;
        return dispatch(gVar, this.f224660e, this);
    }

    public int getType() {
        return 398;
    }

    public String getUri() {
        return "/cgi-bin/mmpay-bin/genprepay";
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetSceneGenPrepay", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        C64244at1 at12 = (C64244at1) ((C47350c) uVar).f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneGenPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", Integer.valueOf(at12.f182159f), at12.f182160g);
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetSceneGenPrepay", "rr " + at12.f182157d);
            this.f224661f = at12.f182157d;
            this.f224662g = at12.f182158e;
            this.f224663h = at12.f182161h;
        }
        String str2 = at12.f182160g;
        this.f224659d.onSceneEnd(i2, at12.f182159f, str2, this);
    }
}

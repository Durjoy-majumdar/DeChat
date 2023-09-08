package p63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C48699ad3;
import te3.C52247zc3;

/* renamed from: p63.a */
public class C47435a extends C75123k0 {

    /* renamed from: d */
    public C11385n f127248d;

    /* renamed from: e */
    public C47350c f127249e;

    /* renamed from: f */
    public String f127250f;

    /* renamed from: g */
    public String f127251g;

    public C47435a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52247zc3();
        bVar.f127067b = new C48699ad3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/payugenprepay";
        bVar.f127069d = 1521;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f127249e = a;
        C52247zc3 zc32 = (C52247zc3) a.f127055a.f127080a;
        zc32.f145823d = str;
        zc32.f145826g = str4;
        zc32.f145824e = str3;
        zc32.f145827h = str5;
        zc32.f145828i = str2;
        zc32.f145825f = str6;
        zc32.f145829j = str7;
        zc32.f145830n = str8;
        zc32.f145831o = i;
        Log.m105918d("MicroMsg.NetScenePayUGenPrepay", String.format("appid:%s,packageExt:%s,nonceStr:%s,paySignature:%s,signtype:%s,timeStamp:%s,url:%s,bizUsername:%s,", new Object[]{str, str4, str3, str5, str2, str6, str7, str8}));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f127248d = nVar;
        return dispatch(gVar, this.f127249e, this);
    }

    public int getType() {
        return 1521;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetScenePayUGenPrepay", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        C48699ad3 ad32 = (C48699ad3) ((C47350c) uVar).f127056b.f127083a;
        if (i2 == 0 && i3 == 0) {
            Log.m105918d("MicroMsg.NetScenePayUGenPrepay", "rr " + ad32.f130459d);
            this.f127250f = ad32.f130459d;
            this.f127251g = ad32.f130460e;
        }
        this.f127248d.onSceneEnd(i2, i3, ad32.f130462g, this);
    }
}

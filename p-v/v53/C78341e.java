package v53;

import android.net.Uri;
import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C47350c;
import pv2.C110259i;
import pv2.C110260j;
import te3.C64501kv;
import te3.C77954jv;
import vt1.C78473a;

/* renamed from: v53.e */
public class C78341e extends C75123k0 {

    /* renamed from: d */
    public C11385n f229550d;

    /* renamed from: e */
    public C47350c f229551e;

    /* renamed from: f */
    public C64501kv f229552f;

    public C78341e(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77954jv();
        bVar.f127067b = new C64501kv();
        bVar.f127068c = "/cgi-bin/mmpay-bin/checkuserauthjsapi";
        bVar.f127069d = 2728;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f229551e = a;
        C77954jv jvVar = (C77954jv) a.f127055a.f127080a;
        jvVar.f227680d = str;
        jvVar.f227682f = str2;
        jvVar.f227681e = str3;
        jvVar.f227683g = str4;
        jvVar.f227685i = str5;
        jvVar.f227684h = str6;
        jvVar.f227686j = str7;
        jvVar.f227687n = i;
        jvVar.f227688o = C113146l.m154805c();
        jvVar.f227691r = 1;
        jvVar.f227689p = null;
        jvVar.f227690q = null;
        jvVar.f227697x = str8;
        jvVar.f227696w = i2;
        C78473a aVar = (C78473a) C86709a0.m107533q(C78473a.class);
        boolean J3 = aVar.mo107880J3();
        C110260j a2 = C110259i.m149874a();
        String str9 = a2.f329808a;
        String str10 = a2.f329809b;
        jvVar.f227692s = aVar.isRoot() ? 1 : 0;
        jvVar.f227693t = str9;
        jvVar.f227694u = str10;
        jvVar.f227695v = J3 ? 1 : 0;
        Log.m105919d("MicroMsg.NetSceneCheckUserAuthJsapi", "cpu_id: %s, uid: %s", str9, str10);
        Log.m105925i("MicroMsg.NetSceneCheckUserAuthJsapi", "appId: %s, url: %s, jsapiScene: %s, isOpenTouchPay: %b", str, str7, Integer.valueOf(i), Boolean.valueOf(J3));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f229550d = nVar;
        return dispatch(gVar, this.f229551e, this);
    }

    public int getType() {
        return 580;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        String str2;
        int i4 = i2;
        int i5 = i3;
        StringBuilder sb = new StringBuilder();
        sb.append("errType:");
        sb.append(i4);
        sb.append(",errCode:");
        sb.append(i5);
        sb.append(",errMsg");
        String str3 = str;
        sb.append(str3);
        Log.m105918d("MicroMsg.NetSceneCheckUserAuthJsapi", sb.toString());
        if (i4 == 0 && i5 == 0) {
            C47350c cVar = (C47350c) uVar;
            C64501kv kvVar = (C64501kv) cVar.f127056b.f127083a;
            this.f229552f = kvVar;
            C77954jv jvVar = (C77954jv) cVar.f127055a.f127080a;
            String str4 = jvVar.f227686j;
            if (str4 != null) {
                String queryParameter = Uri.parse(str4).getQueryParameter("appid");
                if (queryParameter != jvVar.f227680d) {
                    C115669n.INSTANCE.mo160131h(14954, this.f229552f.f183987h, "", Integer.valueOf(jvVar.f227687n), jvVar.f227697x, jvVar.f227680d, Integer.valueOf(jvVar.f227691r), Integer.valueOf(jvVar.f227696w), jvVar.f227686j, queryParameter);
                } else {
                    C115669n.INSTANCE.mo160131h(14954, this.f229552f.f183987h, "", Integer.valueOf(jvVar.f227687n), jvVar.f227697x, jvVar.f227680d, Integer.valueOf(jvVar.f227691r), Integer.valueOf(jvVar.f227696w), jvVar.f227686j);
                }
            } else if (!(jvVar.f227689p == null || jvVar.f227690q == null)) {
                C115669n.INSTANCE.mo160131h(14954, kvVar.f183987h, "", Integer.valueOf(jvVar.f227687n), jvVar.f227697x, jvVar.f227680d, Integer.valueOf(jvVar.f227691r), Integer.valueOf(jvVar.f227696w), jvVar.f227690q, jvVar.f227689p);
            }
            Log.m105924i("MicroMsg.NetSceneCheckUserAuthJsapi", "CheckUserAuthJsapiResponse resp.ErrCode is " + this.f229552f.f183983d + " resp.ErrMsg is " + this.f229552f.f183984e);
            str2 = this.f229552f.f183984e;
        } else {
            str2 = str3;
        }
        this.f229550d.onSceneEnd(i4, i5, str2, this);
    }
}

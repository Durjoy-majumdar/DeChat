package n63;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.appbrand.jsapi.pay.C1810l;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50877pu1;
import te3.C51014qu1;
import te3.C77987qh2;
import te3.C77991rh2;

/* renamed from: n63.g */
public class C47165g extends C75123k0 {

    /* renamed from: d */
    public C47350c f126704d;

    /* renamed from: e */
    public C11385n f126705e;

    /* renamed from: f */
    public C77987qh2 f126706f;

    /* renamed from: g */
    public C77991rh2 f126707g;

    public C47165g(int i, String str, String str2, String str3, int i2, String str4, int i3, String str5, String str6, String str7, String str8) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50877pu1();
        bVar.f127067b = new C51014qu1();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/boss/getandroidiappackage";
        bVar.f127069d = C1810l.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f126704d = a;
        C50877pu1 pu12 = (C50877pu1) a.f127055a.f127080a;
        pu12.f139984e = str;
        pu12.f139983d = i;
        pu12.f139986g = Integer.parseInt(str2);
        pu12.f139985f = str3;
        pu12.f139988i = i2;
        pu12.f139989j = i3;
        pu12.f139987h = str4;
        pu12.f139990n = str5;
        pu12.f139991o = str6;
        pu12.f139992p = str7;
        pu12.f139994r = str8;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f126705e = nVar;
        return dispatch(gVar, this.f126704d, this);
    }

    public int getType() {
        return C1810l.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105920e("MicroMsg.NetSceneGetAndroidIapPackage", "ErrType:" + i2 + ",errCode:" + i3 + ",errMsg:" + str);
        if (i2 == 0 && i3 == 0) {
            C51014qu1 qu12 = (C51014qu1) this.f126704d.f127056b.f127083a;
            Log.m105920e("MicroMsg.NetSceneGetAndroidIapPackage", "business: errCode:" + qu12.f140555d + ",errMsg:" + qu12.f140556e);
            int i4 = qu12.f140555d;
            String str2 = qu12.f140556e;
            if (i4 == 0) {
                this.f126706f = qu12.f140557f;
                this.f126707g = qu12.f140558g;
            }
            this.f126705e.onSceneEnd(i2, i4, str2, this);
            return;
        }
        this.f126705e.onSceneEnd(i2, i3, str, this);
    }
}

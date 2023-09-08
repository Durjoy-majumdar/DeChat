package pz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83119r;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49625gx1;
import te3.C49766hx1;

/* renamed from: pz0.b */
public class C47717b extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f128194d;

    /* renamed from: e */
    public C11385n f128195e;

    /* renamed from: f */
    public String f128196f;

    /* renamed from: g */
    public String f128197g = "";

    public C47717b(double d, double d2, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49625gx1();
        bVar.f127067b = new C49766hx1();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/card/getcardshomepage";
        bVar.f127069d = C83119r.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128194d = a;
        C49625gx1 gx12 = (C49625gx1) a.f127055a.f127080a;
        gx12.f134341d = d;
        gx12.f134342e = d2;
        gx12.f134343f = str;
        gx12.f134344g = (String) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_CARD_REDOT_BUFF_STRING_SYNC, "");
        Log.m105918d("MicroMsg.NetSceneGetCardsHomePageLayout", "red_buff:" + gx12.f134344g);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128195e = nVar;
        return dispatch(gVar, this.f128194d, this);
    }

    public int getType() {
        return C83119r.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetCardsHomePageLayout", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", Integer.valueOf(C83119r.CTRL_INDEX), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C49766hx1 hx12 = (C49766hx1) this.f128194d.f127056b.f127083a;
            Log.m105926v("MicroMsg.NetSceneGetCardsHomePageLayout", "json:" + hx12.f134936d);
            this.f128196f = hx12.f134936d;
            this.f128197g = hx12.f134937e;
        }
        this.f128195e.onSceneEnd(i2, i3, str, this);
    }
}

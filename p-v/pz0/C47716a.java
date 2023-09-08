package pz0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.webview.C83113m;
import com.tencent.p014mm.sdk.platformtools.Log;
import hz0.C46153l0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49650h30;
import te3.C49791i30;

/* renamed from: pz0.a */
public class C47716a extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f128190d;

    /* renamed from: e */
    public C11385n f128191e;

    /* renamed from: f */
    public int f128192f;

    /* renamed from: g */
    public String f128193g = "";

    public C47716a(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49650h30();
        bVar.f127067b = new C49791i30();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/card/delsharecard";
        bVar.f127069d = C83113m.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f128190d = a;
        ((C49650h30) a.f127055a.f127080a).f134423d = str;
        this.f128193g = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128191e = nVar;
        return dispatch(gVar, this.f128190d, this);
    }

    public int getType() {
        return C83113m.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneDelShareCard", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", Integer.valueOf(C83113m.CTRL_INDEX), Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C49791i30 i302 = (C49791i30) this.f128190d.f127056b.f127083a;
            Log.m105924i("MicroMsg.NetSceneDelShareCard", "ret_code:" + i302.f135073d);
            int i4 = i302.f135073d;
            this.f128192f = i4;
            if (i4 == 0) {
                C47721j Lx0 = C46153l0.Lx0();
                String str2 = this.f128193g;
                Lx0.getClass();
                Lx0.f128213d.execSQL("ShareCardInfo", "delete from ShareCardInfo where card_id = '" + str2 + "'");
            }
        }
        this.f128191e.onSceneEnd(i2, i3, str, this);
    }
}

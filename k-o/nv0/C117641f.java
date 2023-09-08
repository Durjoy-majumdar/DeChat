package nv0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C118432fy1;
import te3.C49350ey1;
import yu0.C102910f;

/* renamed from: nv0.f */
public class C117641f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f351894d;

    /* renamed from: e */
    public final C47350c f351895e;

    public C117641f(String str) {
        Log.m105925i("MicroMsg.NetSceneGetConnectInfo", "summerbak NetSceneGetConnectInfo init, url[%s], stack[%s]", str, Util.getStack());
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49350ey1();
        bVar.f127067b = new C118432fy1();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getconnectinfo";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127069d = 595;
        C47350c a = bVar.mo72403a();
        this.f351895e = a;
        ((C49350ey1) a.f127055a.f127080a).f133170d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f351894d = nVar;
        return dispatch(gVar, this.f351895e, this);
    }

    public int getType() {
        return 595;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetConnectInfo", "errType %d,  errCode %d", Integer.valueOf(i2), Integer.valueOf(i3));
        if (i2 == 0 && i3 == 0) {
            C118432fy1 fy12 = (C118432fy1) this.f351895e.f127056b.f127083a;
            C102910f.f303739h = fy12.f354008e.f140574f.f257327a;
            Log.m105925i("MicroMsg.NetSceneGetConnectInfo", "id:%s  hello:%s, ok:%s, PCName:%s, PCAcctName:%s, scene:%d", fy12.f354007d, fy12.f354009f, fy12.f354010g, fy12.f354015o, fy12.f354016p, Integer.valueOf(fy12.f354018r));
            Log.m105925i("MicroMsg.NetSceneGetConnectInfo", "resource:%s", fy12.f354014n);
            byte[] bArr2 = fy12.f354008e.f140574f.f257327a;
        }
        this.f351894d.onSceneEnd(i2, i3, str, this);
    }
}

package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52138ym3;
import te3.C64886zm3;
import xg0.C78803b;

/* renamed from: zg0.i */
public class C66805i extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f191928d;

    /* renamed from: e */
    public C47350c f191929e;

    public C66805i(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52138ym3();
        bVar.f127067b = new C64886zm3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/rcptinfotouch";
        bVar.f127069d = 419;
        bVar.f127070e = 204;
        bVar.f127071f = 1000000204;
        C47350c a = bVar.mo72403a();
        this.f191929e = a;
        ((C52138ym3) a.f127055a.f127080a).f145402d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f191928d = nVar;
        return dispatch(gVar, this.f191929e, this);
    }

    public int getType() {
        return 419;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRcptInfoTouch", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C64886zm3 zm32 = (C64886zm3) ((C47350c) uVar).f127056b.f127083a;
            if (zm32.f186744d.f185431e != null) {
                Log.m105918d("MicroMsg.NetSceneRcptInfoTouch", "resp.rImpl.rcptinfolist.rcptinfolist " + zm32.f186744d.f185431e.size());
                C78803b.vx0();
                C78803b.xx0().mo183785j(zm32.f186744d.f185431e);
                C78803b.vx0();
                C78803b.xx0().mo183784i();
            }
        }
        this.f191928d.onSceneEnd(i2, i3, str, this);
    }
}

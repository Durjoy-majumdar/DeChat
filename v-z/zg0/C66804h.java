package zg0;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51853wm3;
import te3.C64832xm3;
import xg0.C78803b;

/* renamed from: zg0.h */
public class C66804h extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f191925d;

    /* renamed from: e */
    public C47350c f191926e;

    /* renamed from: f */
    public int f191927f = 0;

    public C66804h(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51853wm3();
        bVar.f127067b = new C64832xm3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/rcptinforemove";
        bVar.f127069d = v2helper.EMethodEhanceHeadsetEC;
        bVar.f127070e = 201;
        bVar.f127071f = 1000000201;
        this.f191926e = bVar.mo72403a();
        this.f191927f = i;
        Log.m105918d("MicroMsg.NetSceneRcptInfoRemove", "remove Id " + i);
        ((C51853wm3) this.f191926e.f127055a.f127080a).f144137d = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f191925d = nVar;
        return dispatch(gVar, this.f191926e, this);
    }

    public int getType() {
        return v2helper.EMethodEhanceHeadsetEC;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneRcptInfoRemove", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            C64832xm3 xm32 = (C64832xm3) ((C47350c) uVar).f127056b.f127083a;
            if (xm32.f186338e.f185431e != null) {
                Log.m105918d("MicroMsg.NetSceneRcptInfoRemove", "resp.rImpl.rcptinfolist.rcptinfolist " + xm32.f186338e.f185431e.size());
                C78803b.vx0();
                C78803b.xx0().mo183785j(xm32.f186338e.f185431e);
                C78803b.vx0();
                C78803b.xx0().mo183784i();
            }
        }
        this.f191925d.onSceneEnd(i2, i3, str, this);
    }
}

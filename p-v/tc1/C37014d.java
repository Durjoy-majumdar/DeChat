package tc1;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.C1713l4;
import com.tencent.p014mm.sdk.platformtools.Log;
import kk0.C88185j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51780w4;
import te3.C51920x4;

/* renamed from: tc1.d */
public class C37014d extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f98133d;

    /* renamed from: e */
    public C11385n f98134e;

    public C37014d(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51780w4();
        bVar.f127067b = new C51920x4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/androidfcmunreg";
        bVar.f127069d = C88185j.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f98133d = a;
        ((C51780w4) a.f127055a.f127080a).f143847d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f98134e = nVar;
        return dispatch(gVar, this.f98133d, this);
    }

    public int getType() {
        return C1713l4.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.FCM.NetSceneFcmUnreg", "onGYNetEnd, errType = " + i2 + " errCode = " + i3);
        this.f98134e.onSceneEnd(i2, i3, str, this);
    }
}

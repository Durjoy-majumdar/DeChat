package fa3;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50101ka0;
import te3.C50234la0;
import yl0.C91496m;

/* renamed from: fa3.e */
public class C8003e extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f26691d;

    /* renamed from: e */
    public int f26692e;

    /* renamed from: f */
    public final C47350c f26693f;

    public C8003e(int i, int i2) {
        this.f26692e = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50101ka0 ka02 = new C50101ka0();
        C50234la0 la02 = new C50234la0();
        bVar.f127066a = ka02;
        bVar.f127067b = la02;
        bVar.f127068c = "/cgi-bin/micromsg-bin/extdevicecontrol";
        bVar.f127069d = C91496m.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        ka02.f136630d = i;
        ka02.f136631e = i2;
        this.f26693f = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f26691d = nVar;
        return dispatch(gVar, this.f26693f, this);
    }

    public int getType() {
        return C91496m.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneExtDeviceControl", "onGYNetEnd  errType:" + i2 + " errCode:" + i3 + " errMsg:" + str);
        C11385n nVar = this.f26691d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

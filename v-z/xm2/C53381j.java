package xm2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52091ya0;
import te3.C52238za0;

/* renamed from: xm2.j */
public class C53381j extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f150203d;

    /* renamed from: e */
    public C47350c f150204e;

    public C53381j(int i, int i2, long j, long j2, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C52091ya0();
        bVar.f127067b = new C52238za0();
        bVar.f127068c = "/cgi-bin/micromsg-bin/extfunctionswitch";
        bVar.f127069d = 4071;
        C47350c a = bVar.mo72403a();
        this.f150204e = a;
        C52091ya0 ya02 = (C52091ya0) a.f127055a.f127080a;
        ya02.f145204e = i;
        ya02.f145203d = i2;
        Log.m105924i("MicroMsg.NetSceneExtFunctionSwitch", "control2 = " + z + "， WhichExtFunctionSwitch = " + j + "， ExtFunctionSwitchValue = " + j2);
        if (z) {
            ya02.f145207h = j;
            ya02.f145208i = j2;
            return;
        }
        ya02.f145205f = j;
        ya02.f145206g = j2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f150203d = nVar;
        return dispatch(gVar, this.f150204e, this);
    }

    public int getType() {
        return 4071;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneExtFunctionSwitch", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        if (i2 == 0 && i3 == 0) {
            Log.m105924i("MicroMsg.NetSceneExtFunctionSwitch", "return is 0.now we parse the json and resetList..");
        }
        this.f150203d.onSceneEnd(i2, i3, str, this);
    }
}

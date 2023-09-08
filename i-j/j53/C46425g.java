package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.xi4;
import te3.yi4;

/* renamed from: j53.g */
public class C46425g extends C75123k0 {

    /* renamed from: d */
    public final C47350c f125027d;

    /* renamed from: e */
    public C11385n f125028e;

    /* renamed from: f */
    public yi4 f125029f;

    public C46425g(int i, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        xi4 xi4 = new xi4();
        xi4.f144693d = i;
        xi4.f144694e = i2;
        bVar.f127066a = xi4;
        bVar.f127067b = new yi4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/transferphonechangeswitch";
        bVar.f127069d = 1724;
        this.f125027d = bVar.mo72403a();
        Log.m105925i("MicroMsg.mobileRemit.NetSceneMobileRemitChangeSwitch", "NetSceneMobileRemitChangeSwitch() switchChangeType:%s", Integer.valueOf(i));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125028e = nVar;
        return dispatch(gVar, this.f125027d, this);
    }

    public int getType() {
        return 1724;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.mobileRemit.NetSceneMobileRemitChangeSwitch", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f125029f = (yi4) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f125028e.onSceneEnd(i2, i3, str, this);
    }
}

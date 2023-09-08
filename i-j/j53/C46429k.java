package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49375f34;
import te3.C49511g34;

/* renamed from: j53.k */
public class C46429k extends C75123k0 {

    /* renamed from: d */
    public C49375f34 f125047d;

    /* renamed from: e */
    public C49511g34 f125048e;

    /* renamed from: f */
    public final C47350c f125049f;

    /* renamed from: g */
    public C11385n f125050g;

    public C46429k(boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C49375f34 f342 = new C49375f34();
        f342.f133273e = System.currentTimeMillis();
        if (z) {
            f342.f133272d = 1;
        } else {
            f342.f133272d = 0;
        }
        this.f125047d = f342;
        bVar.f127066a = f342;
        bVar.f127067b = new C49511g34();
        bVar.f127068c = "/cgi-bin/mmpay-bin/setwalletentrancebalanceswitchstate";
        bVar.f127069d = 2554;
        this.f125049f = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125050g = nVar;
        return dispatch(gVar, this.f125049f, this);
    }

    public int getType() {
        return 2554;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneSetWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f125048e = (C49511g34) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f125050g.onSceneEnd(i2, i3, str, this);
    }
}

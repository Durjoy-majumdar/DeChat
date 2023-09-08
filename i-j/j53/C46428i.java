package j53;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50847pl3;
import te3.C50977ql3;

/* renamed from: j53.i */
public class C46428i extends C75123k0 {

    /* renamed from: d */
    public C50977ql3 f125044d;

    /* renamed from: e */
    public final C47350c f125045e;

    /* renamed from: f */
    public C11385n f125046f;

    public C46428i() {
        C47350c.C47352b bVar = new C47350c.C47352b();
        C50847pl3 pl32 = new C50847pl3();
        pl32.f139826d = System.currentTimeMillis();
        bVar.f127066a = pl32;
        bVar.f127067b = new C50977ql3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/querywalletentrancebalanceswitchstate";
        bVar.f127069d = 2635;
        this.f125045e = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f125046f = nVar;
        return dispatch(gVar, this.f125045e, this);
    }

    public int getType() {
        return 2635;
    }

    /* renamed from: j1 */
    public C50977ql3 mo71829j1() {
        C50977ql3 ql32 = this.f125044d;
        return ql32 == null ? new C50977ql3() : ql32;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105929w("MicroMsg.NetSceneQueryWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f125044d = (C50977ql3) ((C47350c) uVar).f127056b.f127083a;
        }
        this.f125046f.onSceneEnd(i2, i3, str, this);
    }
}

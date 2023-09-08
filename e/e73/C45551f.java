package e73;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.di4;
import te3.ei4;

/* renamed from: e73.f */
public class C45551f extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f123220d;

    /* renamed from: e */
    public C47350c f123221e;

    /* renamed from: f */
    public String f123222f;

    /* renamed from: g */
    public boolean f123223g = false;

    public C45551f(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new di4();
        bVar.f127067b = new ei4();
        bVar.f127068c = "/cgi-bin/mmpay-bin/touchlockgetchallenge";
        bVar.f127069d = 1548;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f123221e = a;
        di4 di4 = (di4) a.f127055a.f127080a;
        di4.f132358d = 1548;
        di4.f132359e = str;
        di4.f132360f = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f123220d = nVar;
        return dispatch(gVar, this.f123221e, this);
    }

    public int getType() {
        return 1548;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch wallet lock challenge errType: %d, errCode: %d, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        ei4 ei4 = (ei4) ((C47350c) uVar).f127056b.f127083a;
        String str2 = ei4.f132948d;
        this.f123222f = str2;
        Log.m105919d("MicroMsg.NetSceneGetTouchWalletLockChallenge", "alvinluo get touch lock challenge: %s", str2);
        if (ei4.f132949e == 1) {
            this.f123223g = true;
        } else {
            this.f123223g = false;
        }
        C11385n nVar = this.f123220d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

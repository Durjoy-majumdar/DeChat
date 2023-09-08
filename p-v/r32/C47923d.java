package r32;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51219sb0;
import te3.C51371tb0;
import te3.C77963l1;

/* renamed from: r32.d */
public class C47923d extends C75123k0 implements C45119n {

    /* renamed from: d */
    public C47350c f128597d;

    /* renamed from: e */
    public C11385n f128598e;

    /* renamed from: f */
    public C51219sb0 f128599f;

    /* renamed from: g */
    public C51371tb0 f128600g;

    /* renamed from: h */
    public String f128601h;

    /* renamed from: i */
    public String f128602i;

    /* renamed from: j */
    public String f128603j;

    public C47923d(int i, int i2, int i3, int i4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51219sb0();
        bVar.f127067b = new C51371tb0();
        bVar.f127069d = 1970;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        bVar.f127068c = "/cgi-bin/mmpay-bin/ftfhb/ffrequestwxhb";
        C47350c a = bVar.mo72403a();
        this.f128597d = a;
        C51219sb0 sb02 = (C51219sb0) a.f127055a.f127080a;
        this.f128599f = sb02;
        sb02.f141414d = i;
        sb02.f141415e = i2;
        sb02.f141416f = i3;
        sb02.f141417g = i4;
        C77963l1 c = C113146l.m154805c();
        if (c != null) {
            C51219sb0 sb03 = this.f128599f;
            sb03.f141418h = c.f227793f;
            sb03.f141419i = c.f227794g;
        }
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f128598e = nVar;
        return dispatch(gVar, this.f128597d, this);
    }

    public int getType() {
        return 1970;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("NetSceneF2FLuckyMoneyPrepare", "errType %d,errCode %d,errMsg %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C51371tb0 tb02 = (C51371tb0) ((C47350c) uVar).f127056b.f127083a;
        this.f128600g = tb02;
        this.f128601h = tb02.f142087g;
        this.f128602i = tb02.f142086f;
        this.f128603j = tb02.f142088h;
        C11385n nVar = this.f128598e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

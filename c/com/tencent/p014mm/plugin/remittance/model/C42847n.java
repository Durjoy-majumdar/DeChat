package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C45119n;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import cr3.C75279d;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49155dk;
import te3.C49294ek;
import te3.C77925f4;
import te3.eh4;

/* renamed from: com.tencent.mm.plugin.remittance.model.n */
public class C42847n extends C75123k0 implements C75279d, C45119n {

    /* renamed from: d */
    public C47350c f116032d;

    /* renamed from: e */
    public C49294ek f116033e;

    /* renamed from: f */
    public C11385n f116034f;

    /* renamed from: g */
    public boolean f116035g = false;

    /* renamed from: h */
    public boolean f116036h = false;

    /* renamed from: i */
    public String f116037i;

    public C42847n(eh4 eh4, C77925f4 f4Var, String str, int i, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49155dk();
        bVar.f127067b = new C49294ek();
        bVar.f127069d = 2682;
        bVar.f127068c = "/cgi-bin/mmpay-bin/busif2fzerocallback";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116032d = a;
        C49155dk dkVar = (C49155dk) a.f127055a.f127080a;
        dkVar.f132371e = f4Var;
        dkVar.f132370d = eh4;
        dkVar.f132372f = str;
        dkVar.f132373g = i;
        dkVar.f132374h = str2;
        this.f116037i = str3;
        Log.m105925i("MicroMsg.NetSceneBusiF2fZeroCallback", "NetSceneBusiF2fZeroCallback, token %s AfterPlaceOrderCommReq %s zero_pay_extend: %s", str2, C70580a.m83108b(f4Var), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116034f = nVar;
        return dispatch(gVar, this.f116032d, this);
    }

    public boolean getHasRetried() {
        return this.f116036h;
    }

    public int getType() {
        return 2682;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        boolean z = false;
        Log.m105925i("MicroMsg.NetSceneBusiF2fZeroCallback", "errType: %s, errCode: %s, errMsg: %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        C49294ek ekVar = (C49294ek) ((C47350c) uVar).f127056b.f127083a;
        this.f116033e = ekVar;
        Log.m105925i("MicroMsg.NetSceneBusiF2fZeroCallback", "ret_code: %s, ret_msg: %s", Integer.valueOf(ekVar.f132966d), this.f116033e.f132967e);
        C11385n nVar = this.f116034f;
        if (nVar != null) {
            if (this.f116033e.f132968f == 1) {
                z = true;
            }
            this.f116035g = z;
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

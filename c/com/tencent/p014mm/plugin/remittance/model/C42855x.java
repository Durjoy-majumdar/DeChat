package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51457tw2;
import te3.C51607uw2;

/* renamed from: com.tencent.mm.plugin.remittance.model.x */
public class C42855x extends C75123k0 {

    /* renamed from: d */
    public C11385n f116056d;

    /* renamed from: e */
    public C47350c f116057e;

    /* renamed from: f */
    public C51457tw2 f116058f;

    /* renamed from: g */
    public C51607uw2 f116059g;

    public C42855x(String str, double d, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51457tw2();
        bVar.f127067b = new C51607uw2();
        bVar.f127069d = 4954;
        bVar.f127068c = "/cgi-bin/mmpay-bin/sjtpaypurchase";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116057e = a;
        C51457tw2 tw22 = (C51457tw2) a.f127055a.f127080a;
        this.f116058f = tw22;
        tw22.f142451d = str;
        tw22.f142452e = (long) C75228t.m90231X(d + "", "100");
        C51457tw2 tw23 = this.f116058f;
        tw23.f142453f = str2;
        tw23.f142455h = str3;
        Log.m105925i("MicroMsg.NetSceneMerchantPayPlaceOrder", "scanId: %s, totalAmount: %s , payerRemark：%s , qrcodeSenderUsername：%s", str, Long.valueOf(tw23.f142452e), str2, str3);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116056d = nVar;
        return dispatch(gVar, this.f116057e, this);
    }

    public int getType() {
        return 4954;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneMerchantPayPlaceOrder", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C51607uw2 uw22 = (C51607uw2) ((C47350c) uVar).f127056b.f127083a;
        this.f116059g = uw22;
        Log.m105925i("MicroMsg.NetSceneMerchantPayPlaceOrder", "retcode: %s, retmsg: %s", Integer.valueOf(uw22.f143161d), this.f116059g.f143162e);
        C11385n nVar = this.f116056d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

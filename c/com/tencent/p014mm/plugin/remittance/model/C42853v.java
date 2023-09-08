package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C50884pw2;
import te3.C51022qw2;

/* renamed from: com.tencent.mm.plugin.remittance.model.v */
public class C42853v extends C75123k0 {

    /* renamed from: d */
    public C11385n f116047d;

    /* renamed from: e */
    public C47350c f116048e;

    /* renamed from: f */
    public C51022qw2 f116049f;

    /* renamed from: g */
    public C50884pw2 f116050g;

    /* renamed from: h */
    public String f116051h;

    /* renamed from: i */
    public int f116052i;

    public C42853v(String str, int i, String str2) {
        this.f116051h = str;
        this.f116052i = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50884pw2();
        bVar.f127067b = new C51022qw2();
        bVar.f127069d = 4839;
        bVar.f127068c = "/cgi-bin/mmpay-bin/sjtpaystate";
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f116048e = a;
        C50884pw2 pw22 = (C50884pw2) a.f127055a.f127080a;
        this.f116050g = pw22;
        String str3 = this.f116051h;
        pw22.f140030d = str3;
        int i2 = this.f116052i;
        pw22.f140031e = i2;
        pw22.f140032f = str2;
        Log.m105925i("MicroMsg.NetSceneMerchantPayCheckPay", "doScene trade_no：%s, pay_stats：%s, scan_id：%s", str3, Integer.valueOf(i2), this.f116050g.f140032f);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116047d = nVar;
        return dispatch(gVar, this.f116048e, this);
    }

    public int getType() {
        return 4708;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneMerchantPayCheckPay", "onGYNetEnd, errType: %s, errCode: %s", Integer.valueOf(i2), Integer.valueOf(i3));
        C51022qw2 qw22 = (C51022qw2) ((C47350c) uVar).f127056b.f127083a;
        this.f116049f = qw22;
        Log.m105925i("MicroMsg.NetSceneMerchantPayCheckPay", "retcode: %s, retmsg: %s", Integer.valueOf(qw22.f140588d), this.f116049f.f140589e);
        C11385n nVar = this.f116047d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

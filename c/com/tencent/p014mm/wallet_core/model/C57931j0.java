package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C47350c;
import te3.C51018qv3;
import te3.dq4;
import te3.eq4;

/* renamed from: com.tencent.mm.wallet_core.model.j0 */
public class C57931j0 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f165794d;

    /* renamed from: e */
    public C11385n f165795e;

    /* renamed from: f */
    public String f165796f = null;

    /* renamed from: g */
    public int f165797g = 0;

    /* renamed from: h */
    public String f165798h;

    /* renamed from: i */
    public int f165799i;

    public C57931j0(String str, int i, int i2, int i3, String str2, String str3, String str4, String str5, String str6) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new dq4();
        bVar.f127067b = new eq4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/verifypurchase";
        bVar.f127069d = 414;
        bVar.f127070e = 215;
        bVar.f127071f = 1000000215;
        C47350c a = bVar.mo72403a();
        this.f165794d = a;
        dq4 dq4 = (dq4) a.f127055a.f127080a;
        this.f165796f = str;
        dq4.f182825e = str;
        dq4.f182826f = i;
        dq4.f182833p = i3;
        dq4.f182827g = i2;
        if (!Util.isNullOrNil(str6)) {
            dq4.f182828h = str6;
            dq4.f182829i = str5;
        }
        dq4.f182830j = str2;
        dq4.f182832o = str4;
        if (str3 != null) {
            byte[] bytes = str3.getBytes();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(bytes);
            dq4.f182824d = qv32;
        } else {
            dq4.f182824d = new C51018qv3();
        }
        dq4.f182831n = (int) Util.nowSecond();
        Log.m105924i("MicroMsg.NetSceneVerifyPurchase", "productId:" + this.f165796f + ",verifyType:" + i + ",palyType:" + i2 + ",payload:" + str2 + ",purchaseData:" + str3 + ",dataSignature:" + str4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f165795e = nVar;
        return dispatch(gVar, this.f165794d, this);
    }

    public int getType() {
        return 414;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105920e("MicroMsg.NetSceneVerifyPurchase", "ErrType:" + i2 + "   errCode:" + i3);
        this.f165799i = 0;
        if (i2 == 0 && i3 == 0) {
            eq4 eq4 = (eq4) ((C47350c) uVar).f127056b.f127083a;
            if (eq4.BaseResponse != null) {
                this.f165797g = eq4.f133077f;
                Log.m105918d("MicroMsg.NetSceneVerifyPurchase", " Get Series ID is " + eq4.f133075d);
                Log.m105918d("MicroMsg.NetSceneVerifyPurchase", " Get Biz Type is " + eq4.f133076e);
                this.f165798h = eq4.f133075d;
            }
            this.f165795e.onSceneEnd(i2, i3, str, this);
            return;
        }
        this.f165799i = -1;
        this.f165795e.onSceneEnd(i2, i3, str, this);
    }

    public C57931j0(String str, int i, String str2, String str3, int i2, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new dq4();
        bVar.f127067b = new eq4();
        bVar.f127068c = "/cgi-bin/micromsg-bin/verifypurchase";
        bVar.f127069d = 414;
        bVar.f127070e = 215;
        bVar.f127071f = 1000000215;
        C47350c a = bVar.mo72403a();
        this.f165794d = a;
        dq4 dq4 = (dq4) a.f127055a.f127080a;
        this.f165796f = str;
        dq4.f182825e = str;
        dq4.f182827g = i;
        if (!Util.isNullOrNil(str3)) {
            dq4.f182828h = str3;
        }
        dq4.f182830j = str2;
        dq4.f182826f = i2;
        if (str4 != null) {
            byte[] bytes = str4.getBytes();
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(bytes);
            dq4.f182824d = qv32;
        } else {
            dq4.f182824d = new C51018qv3();
        }
        dq4.f182831n = (int) Util.nowSecond();
        Log.m105925i("MicroMsg.NetSceneVerifyPurchase", "ProductID:%s, Price:%s, PayType:%s, BillNo:%s", this.f165796f, str3, Integer.valueOf(i), str2);
    }
}

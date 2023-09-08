package com.tencent.p014mm.wallet_core.model;

import b63.C113146l;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.wxmm.v2helper;
import ob0.C11385n;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51527uc3;
import te3.C77998tc3;

/* renamed from: com.tencent.mm.wallet_core.model.h0 */
public class C75119h0 extends C75123k0 {

    /* renamed from: d */
    public C11385n f221050d;

    /* renamed from: e */
    public C47350c f221051e;

    public C75119h0(String str) {
        this(str, (String) null, (String) null, -1, -1, -1);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f221050d = nVar;
        return dispatch(gVar, this.f221051e, this);
    }

    public int getType() {
        return v2helper.EMethodSetPlayerPreCorrectCofOff;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105918d("MicroMsg.NetScenePaySubscribe", "errType:" + i2 + ",errCode:" + i3 + ",errMsg" + str);
        this.f221050d.onSceneEnd(i2, i3, str, this);
    }

    public C75119h0(String str, String str2, String str3, int i, int i2, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C77998tc3();
        bVar.f127067b = new C51527uc3();
        bVar.f127068c = "/cgi-bin/mmpay-bin/paysubscribe";
        bVar.f127069d = v2helper.EMethodSetPlayerPreCorrectCofOff;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C75228t.m90208A(str2);
        bVar.f127073h = 0;
        C47350c a = bVar.mo72403a();
        this.f221051e = a;
        C77998tc3 tc32 = (C77998tc3) a.f127055a.f127080a;
        tc32.f228232d = str;
        tc32.f228238j = C113146l.m154805c();
        tc32.f228233e = str3;
        if (!Util.isNullOrNil(str2)) {
            tc32.f228234f = new C89349b(str2.getBytes());
        }
        if (i >= 0) {
            tc32.f228235g = i;
        }
        if (i2 >= 0) {
            tc32.f228236h = i2;
        }
        if (i3 >= 0) {
            tc32.f228237i = i3;
        }
    }
}

package com.tencent.p014mm.plugin.remittance.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.wallet_core.model.C75123k0;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49734hp;
import te3.C49879ip;

/* renamed from: com.tencent.mm.plugin.remittance.model.o */
public class C42848o extends C75123k0 {

    /* renamed from: d */
    public final C47350c f116038d;

    /* renamed from: e */
    public C11385n f116039e;

    /* renamed from: f */
    public C49879ip f116040f;

    public C42848o(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49734hp();
        bVar.f127067b = new C49879ip();
        bVar.f127069d = 2850;
        bVar.f127068c = "/cgi-bin/mmpay-bin/f2fminiprogramconfirmrcvr";
        C47350c a = bVar.mo72403a();
        this.f116038d = a;
        C49734hp hpVar = (C49734hp) a.f127055a.f127080a;
        hpVar.f134800d = str;
        hpVar.f134801e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f116039e = nVar;
        return dispatch(gVar, this.f116038d, this);
    }

    public int getType() {
        return 2850;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105925i("MicroMsg.NetSceneF2FMinniProgramConfirm", "errType = %s errCode = %s errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            this.f116040f = (C49879ip) ((C47350c) uVar).f127056b.f127083a;
        }
        C11385n nVar = this.f116039e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

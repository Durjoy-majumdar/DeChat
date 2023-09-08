package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import p154fy.C45844i;
import te3.C50865pr2;
import te3.C51002qr2;

/* renamed from: com.tencent.mm.modelsimple.k0 */
public class C40361k0 extends C117747y implements C1311n, C45844i {

    /* renamed from: d */
    public C11385n f108464d;

    /* renamed from: e */
    public final C47350c f108465e;

    public C40361k0(int i, int i2, int i3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50865pr2();
        bVar.f127067b = new C51002qr2();
        bVar.f127068c = "/cgi-bin/micromsg-bin/logoutwebwx";
        bVar.f127069d = 281;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108465e = a;
        C50865pr2 pr22 = (C50865pr2) a.f127055a.f127080a;
        pr22.f139916d = i;
        pr22.f139917e = i2;
        pr22.f139918f = i3;
        Log.m105925i("MicroMsg.NetSceneWebWXLogout", "OpCode:%s, targetDeviceType:%s, targetClientVersion:%s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105918d("MicroMsg.NetSceneWebWXLogout", "doScene");
        this.f108464d = nVar;
        return dispatch(gVar, this.f108465e, this);
    }

    public int getType() {
        return 281;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        if (!(i2 == 0 && i3 == 0)) {
            Log.m105918d("MicroMsg.NetSceneWebWXLogout", "logout Error. ");
        }
        C11385n nVar = this.f108464d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

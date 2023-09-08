package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49348ex3;
import te3.C49485fx3;

/* renamed from: com.tencent.mm.plugin.exdevice.model.d1 */
public class C41123d1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110788d = null;

    /* renamed from: e */
    public C47350c f110789e = null;

    public C41123d1(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49348ex3();
        bVar.f127067b = new C49485fx3();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/searchbleharddevice";
        bVar.f127069d = 1706;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110789e = a;
        C49348ex3 ex32 = (C49348ex3) a.f127055a.f127080a;
        ex32.f133162d = str;
        ex32.f133163e = str2 == null ? "" : str2;
        ex32.f133164f = str3 == null ? "" : str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110788d = nVar;
        return dispatch(gVar, this.f110789e, this);
    }

    public int getType() {
        return 1706;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.exdevice.NetSceneSearchBLEHardDevice", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        this.f110788d.onSceneEnd(i2, i3, str, this);
    }
}

package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.ll4;
import te3.ml4;

/* renamed from: com.tencent.mm.plugin.exdevice.model.j1 */
public class C41137j1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110817d;

    /* renamed from: e */
    public String f110818e;

    /* renamed from: f */
    public String f110819f;

    /* renamed from: g */
    public String f110820g;

    /* renamed from: h */
    public int f110821h;

    public C41137j1(String str, String str2, String str3, int i) {
        this.f110820g = str3;
        this.f110818e = str;
        this.f110819f = str2;
        this.f110821h = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110817d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new ll4();
        bVar.f127067b = new ml4();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/updatemydeviceattr";
        bVar.f127069d = 1263;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        ll4 ll4 = (ll4) a.f127055a.f127080a;
        ll4.f137508f = this.f110820g;
        ll4.f137507e = this.f110818e;
        ll4.f137506d = this.f110819f;
        ll4.f137509g = this.f110821h;
        return dispatch(gVar, a, this);
    }

    public int getType() {
        return 1263;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f110817d.onSceneEnd(i2, i3, str, this);
    }
}

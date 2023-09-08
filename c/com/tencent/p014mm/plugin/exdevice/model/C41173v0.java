package com.tencent.p014mm.plugin.exdevice.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import d81.C45288e;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49697hf2;
import te3.C50245ld;
import te3.C50384md;
import z71.C53753b;

/* renamed from: com.tencent.mm.plugin.exdevice.model.v0 */
public class C41173v0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f110927d;

    /* renamed from: e */
    public C47350c f110928e;

    /* renamed from: f */
    public String f110929f;

    /* renamed from: g */
    public long f110930g;

    /* renamed from: h */
    public String f110931h;

    /* renamed from: i */
    public long f110932i;

    public C41173v0(long j, String str, String str2, long j2) {
        this.f110930g = j;
        this.f110931h = str;
        this.f110929f = str2;
        this.f110932i = j2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f110927d = nVar;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50245ld();
        bVar.f127067b = new C50384md();
        bVar.f127068c = "/cgi-bin/mmoc-bin/hardware/bindunauthdevice";
        bVar.f127069d = 1262;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f110928e = a;
        C50245ld ldVar = (C50245ld) a.f127055a.f127080a;
        ldVar.f137308f = C45288e.m50136g(this.f110930g);
        ldVar.f137307e = this.f110931h;
        ldVar.f137306d = this.f110929f;
        ldVar.f137309g = this.f110932i;
        return dispatch(gVar, this.f110928e, this);
    }

    public int getType() {
        return 1262;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        String str2;
        boolean z;
        Log.m105924i("MicroMsg.NetSceneBindUnauthDevice", "onGYNetEnd netId = " + i + " errType = " + i2 + " errCode = " + i3 + str);
        if (i2 == 0 && i3 == 0) {
            C50384md mdVar = (C50384md) this.f110928e.f127056b.f127083a;
            C49697hf2 hf22 = mdVar.f137954d;
            String str3 = null;
            if (hf22 != null) {
                str3 = hf22.f134597e;
                str2 = hf22.f134596d;
            } else {
                str2 = null;
            }
            Log.m105919d("MicroMsg.NetSceneBindUnauthDevice", "unauth bind deviceId = %s, deviceType = %s", str3, str2);
            if (C41166r1.Bx0().mo74332TE(str2, str3) != null) {
                z = C41166r1.Bx0().mo74336jo(str3, str2);
                Log.m105925i("MicroMsg.NetSceneBindUnauthDevice", "delete local deviceinfo : %s, ret : %b", str2, Boolean.valueOf(z));
            } else {
                z = true;
            }
            C53753b bVar = new C53753b();
            bVar.field_connProto = this.f110929f;
            bVar.field_connStrategy = 1;
            bVar.field_closeStrategy = 1;
            bVar.field_url = "";
            C41175x.m44615a(bVar, hf22, mdVar.f137955e);
            if (bVar.field_mac == 0) {
                Log.m105918d("MicroMsg.NetSceneBindUnauthDevice", "onSceneEnd, mac of hardDeviceAttr is 0 so set a local mac.");
                bVar.field_mac = this.f110930g;
            }
            if (z) {
                C41166r1.Bx0().insert(bVar);
            } else {
                C41166r1.Bx0().mo74338mI(bVar);
            }
        }
        this.f110927d.onSceneEnd(i2, i3, str, this);
    }
}

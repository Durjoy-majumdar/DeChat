package com.tencent.p014mm.wallet_core.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.plugin.appbrand.jsapi.bio.face.JsApiCheckIsSupportFaceDetect;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.wxmm.v2helper;
import ob0.C11385n;
import ob0.C47350c;
import te3.C49147dh3;
import te3.C64286ch3;

/* renamed from: com.tencent.mm.wallet_core.model.i0 */
public class C57930i0 extends C75123k0 {

    /* renamed from: d */
    public final C47350c f165789d;

    /* renamed from: e */
    public C11385n f165790e;

    /* renamed from: f */
    public String f165791f;

    /* renamed from: g */
    public String f165792g;

    /* renamed from: h */
    public String f165793h;

    public C57930i0(String str, String str2, String str3, int i, int i2, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64286ch3();
        bVar.f127067b = new C49147dh3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/preparepurchase";
        bVar.f127069d = v2helper.EMethodOutputVolumeGainEnable;
        bVar.f127070e = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
        bVar.f127071f = 1000000214;
        C47350c a = bVar.mo72403a();
        this.f165789d = a;
        C64286ch3 ch32 = (C64286ch3) a.f127055a.f127080a;
        this.f165791f = str;
        ch32.f182481d = str;
        this.f165793h = str2;
        ch32.f182482e = str2;
        this.f165792g = str3;
        ch32.f182483f = str3;
        ch32.f182484g = i2;
        ch32.f182486i = i;
        ch32.f182485h = str4;
        Log.m105918d("MicroMsg.NetScenePreparePurchase", "productId:" + str + ",price:" + str2 + ",currencyType:" + str3 + ",payType:" + i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f165790e = nVar;
        return dispatch(gVar, this.f165789d, this);
    }

    public int getType() {
        return v2helper.EMethodOutputVolumeGainEnable;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr, long j) {
        Log.m105920e("MicroMsg.NetScenePreparePurchase", "ErrType:" + i2 + ",errCode:" + i3 + ",errMsg:" + str);
        if (i2 == 0 && i3 == 0) {
            this.f165790e.onSceneEnd(i2, i3, str, this);
        } else {
            this.f165790e.onSceneEnd(i2, i3, str, this);
        }
    }

    public C57930i0(String str, String str2, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64286ch3();
        bVar.f127067b = new C49147dh3();
        bVar.f127068c = "/cgi-bin/micromsg-bin/preparepurchase";
        bVar.f127069d = v2helper.EMethodOutputVolumeGainEnable;
        bVar.f127070e = JsApiCheckIsSupportFaceDetect.CTRL_INDEX;
        bVar.f127071f = 1000000214;
        C47350c a = bVar.mo72403a();
        this.f165789d = a;
        C64286ch3 ch32 = (C64286ch3) a.f127055a.f127080a;
        this.f165791f = str;
        ch32.f182481d = str;
        this.f165793h = str2;
        ch32.f182482e = str2;
        ch32.f182484g = i;
        Log.m105918d("MicroMsg.NetScenePreparePurchase", "productId:" + str + ",wecoinPrice:" + str2 + ",payType:" + i);
    }
}

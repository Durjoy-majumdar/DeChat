package com.tencent.p014mm.plugin.webview.model;

import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49620gw1;
import te3.C49761hw1;

/* renamed from: com.tencent.mm.plugin.webview.model.y */
public class C6066y extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f22365d;

    /* renamed from: e */
    public C47350c f22366e;

    public C6066y(String str, String str2, Map<String, Object> map) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49620gw1();
        bVar.f127067b = new C49761hw1();
        bVar.f127068c = "/cgi-bin/mmocbiz-bin/getbizjsapiredirecturl";
        bVar.f127069d = 1393;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22366e = a;
        C49620gw1 gw12 = (C49620gw1) a.f127055a.f127080a;
        gw12.f134319d = str;
        gw12.f134324i = str2;
        gw12.f134320e = (String) map.get("groupId");
        gw12.f134321f = (String) map.get(AppMeasurement.Param.TIMESTAMP);
        gw12.f134322g = (String) map.get("nonceStr");
        gw12.f134323h = (String) map.get("signature");
        gw12.f134325j = map.get("params").toString();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f22365d = nVar;
        Log.m105924i("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "do scene");
        return dispatch(gVar, this.f22366e, this);
    }

    public int getType() {
        return 1393;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetBizJsApiRedirectUrl", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f22365d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.channels.JsApiEcdSaSign;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49432fj2;
import te3.C49568gj2;

/* renamed from: com.tencent.mm.plugin.webview.model.c0 */
public class C6027c0 extends C117747y implements C1311n, C6210c.C6213b {

    /* renamed from: d */
    public final C47350c f22276d;

    /* renamed from: e */
    public C11385n f22277e;

    /* renamed from: f */
    public C6210c.C6211a f22278f;

    /* renamed from: g */
    public String f22279g;

    /* renamed from: h */
    public String f22280h;

    /* renamed from: i */
    public final int f22281i;

    public C6027c0(C6210c.C6211a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, int i, String str9, int i2, int i3) {
        String str10 = str;
        String str11 = str3;
        String str12 = str4;
        String str13 = str5;
        String str14 = str6;
        String str15 = str7;
        String str16 = str8;
        String str17 = str9;
        Log.m105925i("MicroMsg.webview.NetSceneJSAPIAuth", "NetSceneJSAPIAuth doScene appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s], [%s]", str11, str12, str13, str14, str15, str16, Integer.valueOf(i), str17);
        this.f22278f = aVar;
        this.f22279g = str12;
        this.f22280h = str10;
        this.f22281i = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49432fj2();
        bVar.f127067b = new C49568gj2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-auth";
        bVar.f127069d = JsApiEcdSaSign.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22276d = a;
        C49432fj2 fj22 = (C49432fj2) a.f127055a.f127080a;
        fj22.f133537d = str10;
        fj22.f133547q = str2;
        fj22.f133538e = str11;
        fj22.f133539f = str12;
        fj22.f133540g = str13;
        fj22.f133541h = str14;
        fj22.f133542i = str15;
        fj22.f133543j = str16;
        fj22.f133544n = C89349b.m111674a(bArr);
        fj22.f133545o = i;
        fj22.f133546p = str17;
        fj22.f133548r = i3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSAPIAuth", "doScene");
        this.f22277e = nVar;
        return dispatch(gVar, this.f22276d, this);
    }

    /* renamed from: g */
    public int mo6996g() {
        return this.f22281i;
    }

    public int getType() {
        return JsApiEcdSaSign.CTRL_INDEX;
    }

    /* renamed from: j1 */
    public C49568gj2 mo6997j1() {
        C47350c cVar = this.f22276d;
        if (cVar == null) {
            return null;
        }
        return (C49568gj2) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAPIAuth", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22277e.onSceneEnd(i2, i3, str, this);
    }
}

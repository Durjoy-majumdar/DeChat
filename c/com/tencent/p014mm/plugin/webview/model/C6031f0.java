package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C48728ak2;
import te3.C49293ej2;
import te3.C50696ok2;
import te3.C52273zj2;

/* renamed from: com.tencent.mm.plugin.webview.model.f0 */
public class C6031f0 extends C117747y implements C1311n, C6210c.C6213b {

    /* renamed from: d */
    public final C47350c f22292d;

    /* renamed from: e */
    public C11385n f22293e;

    /* renamed from: f */
    public C49293ej2 f22294f;

    /* renamed from: g */
    public final int f22295g;

    public C6031f0(C49293ej2 ej22, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, C89349b bVar, int i, LinkedList<C50696ok2> linkedList, int i2, int i3) {
        String str9 = str;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        Log.m105925i("MicroMsg.webview.NetSceneJSAPISetAuth", "NetSceneJSAPISetAuth doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s], [%s]", str9, str10, str11, str12, str13, str14, str15, Integer.valueOf(i));
        this.f22294f = ej22;
        this.f22295g = i2;
        C47350c.C47352b bVar2 = new C47350c.C47352b();
        bVar2.f127066a = new C52273zj2();
        bVar2.f127067b = new C48728ak2();
        bVar2.f127068c = "/cgi-bin/mmbiz-bin/jsapi-setauth";
        bVar2.f127069d = 1096;
        bVar2.f127070e = 0;
        bVar2.f127071f = 0;
        C47350c a = bVar2.mo72403a();
        this.f22292d = a;
        C52273zj2 zj22 = (C52273zj2) a.f127055a.f127080a;
        zj22.f146027d = str9;
        zj22.f146037q = str2;
        zj22.f146028e = str10;
        zj22.f146029f = str11;
        zj22.f146030g = str12;
        zj22.f146031h = str13;
        zj22.f146032i = str14;
        zj22.f146033j = str15;
        zj22.f146035o = i;
        zj22.f146034n = bVar;
        zj22.f146036p = linkedList;
        zj22.f146038r = i3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSAPISetAuth", "doScene");
        this.f22293e = nVar;
        return dispatch(gVar, this.f22292d, this);
    }

    /* renamed from: g */
    public int mo6996g() {
        return this.f22295g;
    }

    public int getType() {
        return 1096;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAPISetAuth", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22293e.onSceneEnd(i2, i3, str, this);
    }
}

package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.appbrand.jsapi.bluetooth.C82256p;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C51983xj2;
import te3.C52125yj2;

/* renamed from: com.tencent.mm.plugin.webview.model.e0 */
public class C6030e0 extends C117747y implements C1311n, C6210c.C6213b {

    /* renamed from: d */
    public final C47350c f22288d;

    /* renamed from: e */
    public C11385n f22289e;

    /* renamed from: f */
    public C6210c.C6211a f22290f;

    /* renamed from: g */
    public final int f22291g;

    public C6030e0(C6210c.C6211a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, int i, int i2) {
        String str9 = str;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        String str15 = str8;
        Log.m105925i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "NetSceneJSAPIRealtimeVerify doScene url[%s], appid[%s], jsapiName[%s], [%s], [%s], [%s], [%s]", str9, str10, str11, str12, str13, str14, str15);
        this.f22290f = aVar;
        this.f22291g = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51983xj2();
        bVar.f127067b = new C52125yj2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-realtimeverify";
        bVar.f127069d = C82256p.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22288d = a;
        C51983xj2 xj22 = (C51983xj2) a.f127055a.f127080a;
        xj22.f144702d = str9;
        xj22.f144710o = str2;
        xj22.f144703e = str10;
        xj22.f144704f = str11;
        xj22.f144705g = str12;
        xj22.f144706h = str13;
        xj22.f144707i = str14;
        xj22.f144708j = str15;
        xj22.f144709n = C89349b.m111674a(bArr);
        xj22.f144711p = i2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "doScene");
        this.f22289e = nVar;
        return dispatch(gVar, this.f22288d, this);
    }

    /* renamed from: g */
    public int mo6996g() {
        return this.f22291g;
    }

    public int getType() {
        return C82256p.CTRL_INDEX;
    }

    /* renamed from: j1 */
    public C52125yj2 mo6999j1() {
        C47350c cVar = this.f22288d;
        if (cVar == null) {
            return null;
        }
        return (C52125yj2) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAPIRealtimeVerify", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22289e.onSceneEnd(i2, i3, str, this);
    }
}

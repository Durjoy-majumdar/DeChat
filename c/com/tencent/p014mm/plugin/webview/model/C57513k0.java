package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.opensdk.modelmsg.SendAuth;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C50369m83;
import te3.C64301cx3;
import te3.C90407dx3;

/* renamed from: com.tencent.mm.plugin.webview.model.k0 */
public class C57513k0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f164748d;

    /* renamed from: e */
    public C11385n f164749e;

    public C57513k0(String str, SendAuth.Req req, String str2, String str3, String str4, int i, C50369m83 m832) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64301cx3();
        bVar.f127067b = new C90407dx3();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/sdk_oauth_authorize";
        bVar.f127069d = 1388;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f164748d = a;
        C64301cx3 cx32 = (C64301cx3) a.f127055a.f127080a;
        cx32.f182603d = str;
        cx32.f182604e = req.scope;
        cx32.f182605f = req.state;
        cx32.f182609j = req.extData;
        cx32.f182607h = str2;
        cx32.f182608i = str3;
        cx32.f182613q = req.isOption1;
        cx32.f182615s = req.nonAutomatic;
        if (str4 != null) {
            cx32.f182611o = str4;
        }
        cx32.f182612p = i;
        try {
            cx32.f182614r = new C89349b(m832.toByteArray());
        } catch (Exception e) {
            Log.m105921e("MicroMsg.NetSceneSDKOauthAuthorize", "toByteArray ex %s", e.getMessage());
        }
        Log.m105925i("MicroMsg.NetSceneSDKOauthAuthorize", "NetSceneSDKOauthAuthorize isOption1=%b, token=%s, authenticationResult= %d, nonAutomatic=%b", Boolean.valueOf(req.isOption1), cx32.f182611o, Integer.valueOf(i), Boolean.valueOf(cx32.f182615s));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f164749e = nVar;
        return dispatch(gVar, this.f164748d, this);
    }

    public int getType() {
        return 1388;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        this.f164749e.onSceneEnd(i2, i3, str, this);
    }
}

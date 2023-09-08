package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C6210c;
import com.tencent.p014mm.sdk.platformtools.Log;
import fk0.C86911c;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51702vj2;
import te3.C51842wj2;

/* renamed from: com.tencent.mm.plugin.webview.model.d0 */
public class C6029d0 extends C117747y implements C1311n, C6210c.C6213b {

    /* renamed from: d */
    public final C47350c f22283d;

    /* renamed from: e */
    public C11385n f22284e;

    /* renamed from: f */
    public C6210c.C6211a f22285f;

    /* renamed from: g */
    public String f22286g;

    /* renamed from: h */
    public final int f22287h;

    public C6029d0(C6210c.C6211a aVar, String str, String str2, String str3, LinkedList<String> linkedList, LinkedList<String> linkedList2, String str4, String str5, String str6, String str7, int i, String str8, int i2, int i3, int i4) {
        C6210c.C6211a aVar2 = aVar;
        String str9 = str;
        String str10 = str3;
        String str11 = str4;
        String str12 = str5;
        String str13 = str6;
        String str14 = str7;
        Log.m105925i("MicroMsg.webview.NetSceneJSAPIPreVerify", "NetSceneJSAPIPreVerify doScene url[%s], appid[%s], [%s], [%s], [%s], [%s]", str9, str10, str11, str12, str13, str14);
        if (aVar2 == null) {
            Log.m105928w("MicroMsg.webview.NetSceneJSAPIPreVerify", "JSVerifyEnd cb is null");
        }
        this.f22285f = aVar2;
        this.f22286g = str9;
        this.f22287h = i2;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51702vj2();
        bVar.f127067b = new C51842wj2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/jsapi-preverify";
        bVar.f127069d = C86911c.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22283d = a;
        C51702vj2 vj22 = (C51702vj2) a.f127055a.f127080a;
        vj22.f143514d = str9;
        vj22.f143524q = str2;
        vj22.f143515e = str10;
        vj22.f143516f = linkedList;
        vj22.f143523p = linkedList2;
        vj22.f143517g = str11;
        vj22.f143518h = str12;
        vj22.f143519i = str13;
        vj22.f143520j = str14;
        vj22.f143521n = i;
        vj22.f143522o = str8;
        vj22.f143525r = i3;
        vj22.f143526s = i4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.webview.NetSceneJSAPIPreVerify", "doScene");
        this.f22284e = nVar;
        return dispatch(gVar, this.f22283d, this);
    }

    /* renamed from: g */
    public int mo6996g() {
        return this.f22287h;
    }

    public int getType() {
        return C86911c.CTRL_INDEX;
    }

    /* renamed from: j1 */
    public C51842wj2 mo6998j1() {
        C47350c cVar = this.f22283d;
        if (cVar == null) {
            return null;
        }
        return (C51842wj2) cVar.f127056b.f127083a;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.webview.NetSceneJSAPIPreVerify", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22284e.onSceneEnd(i2, i3, str, this);
    }
}

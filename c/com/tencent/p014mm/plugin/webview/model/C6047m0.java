package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import mo0.C88788c;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.li4;
import te3.mi4;

/* renamed from: com.tencent.mm.plugin.webview.model.m0 */
public class C6047m0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f22340d;

    /* renamed from: e */
    public final C47350c f22341e;

    public C6047m0(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new li4();
        bVar.f127067b = new mi4();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/transid";
        bVar.f127069d = C88788c.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f22341e = a;
        li4 li4 = (li4) a.f127055a.f127080a;
        li4.f137445d = str;
        li4.f137447f = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        Log.m105924i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "doScene");
        this.f22340d = nVar;
        return dispatch(gVar, this.f22341e, this);
    }

    public int getType() {
        return C88788c.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "errType = %d, errCode = %d, errMsg = %s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f22340d.onSceneEnd(i2, i3, str, this);
    }
}

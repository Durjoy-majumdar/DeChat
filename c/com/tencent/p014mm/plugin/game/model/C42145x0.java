package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51962xe2;
import te3.C52105ye2;

/* renamed from: com.tencent.mm.plugin.game.model.x0 */
public class C42145x0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113595d;

    /* renamed from: e */
    public final C47350c f113596e;

    public C42145x0(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51962xe2();
        bVar.f127067b = new C52105ye2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/gethvgamemenu";
        bVar.f127069d = 1369;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113596e = a;
        C51962xe2 xe22 = (C51962xe2) a.f127055a.f127080a;
        xe22.f144625e = LocaleUtil.getApplicationLanguage();
        String simCountryCode = Util.getSimCountryCode(MMApplicationContext.getContext());
        xe22.f144626f = simCountryCode;
        xe22.f144624d = str;
        Log.m105925i("MicroMsg.NetSceneHVGameGetMenu", "lang=%s, country=%s, appid=%s", xe22.f144625e, simCountryCode, str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113595d = nVar;
        return dispatch(gVar, this.f113596e, this);
    }

    public int getType() {
        return 1369;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneHVGameGetMenu", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        if (i2 != 0 || i3 != 0) {
            this.f113595d.onSceneEnd(i2, i3, str, this);
        } else if (((C52105ye2) ((C47350c) uVar).f127056b.f127083a) == null) {
            this.f113595d.onSceneEnd(i2, i3, str, this);
        } else {
            this.f113595d.onSceneEnd(i2, i3, str, this);
        }
    }
}

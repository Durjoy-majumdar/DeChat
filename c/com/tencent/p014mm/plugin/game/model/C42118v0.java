package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import py1.C47599i2;
import py1.C47606j2;

/* renamed from: com.tencent.mm.plugin.game.model.v0 */
public class C42118v0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f113437d;

    /* renamed from: e */
    public final C47350c f113438e;

    public C42118v0(int i, int i2, LinkedList<String> linkedList, int i3, boolean z) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C47599i2();
        bVar.f127067b = new C47606j2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/newgetlibgamelist";
        bVar.f127069d = 1218;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f113438e = a;
        C47599i2 i2Var = (C47599i2) a.f127055a.f127080a;
        i2Var.f127779d = i;
        i2Var.f127780e = i2;
        i2Var.f127781f = LocaleUtil.getApplicationLanguage();
        i2Var.f127783h = Util.getSimCountryCode(MMApplicationContext.getContext());
        i2Var.f127784i = i3;
        i2Var.f127782g = linkedList;
        i2Var.f127785j = z;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113437d = nVar;
        return dispatch(gVar, this.f113438e, this);
    }

    public int getType() {
        return 1218;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetLibGameList", "errType = " + i2 + ", errCode = " + i3);
        this.f113437d.onSceneEnd(i2, i3, str, this);
    }
}

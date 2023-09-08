package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.ChannelUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import di3.C86312j;
import java.util.Iterator;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import py1.C47557c2;
import py1.C47564d2;
import py1.C47590h0;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.t0 */
public class C42113t0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f113427d;

    /* renamed from: e */
    public C11385n f113428e;

    public C42113t0(String str, LinkedList<String> linkedList, C42119w wVar, C42119w wVar2, C42119w wVar3, boolean z) {
        Log.m105924i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "lang = " + str + ", installedApp list size: " + linkedList.size());
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            Log.m105925i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "install id:[%s]", it.next());
        }
        C47557c2 c2Var = new C47557c2();
        c2Var.f127618d = str;
        c2Var.f127619e = linkedList;
        String d = C42046d.m45745d(MMApplicationContext.getContext());
        d = !Util.isNullOrNil(C4566p.f19311b) ? C4566p.f19311b : Util.isNullOrNil(d) ? Util.getSimCountryCode(MMApplicationContext.getContext()) : d;
        c2Var.f127620f = d;
        wVar = wVar == null ? wVar2 != null ? wVar2 : wVar3 != null ? wVar3 : null : wVar;
        C47590h0 h0Var = new C47590h0();
        c2Var.f127621g = h0Var;
        if (wVar != null) {
            h0Var.f127746d = wVar.f113491q1.f113527a;
            h0Var.f127747e = wVar.field_appId;
            h0Var.f127749g = wVar.f113472f2;
            h0Var.f127750h = wVar.f113470e2;
        }
        if (wVar2 != null) {
            h0Var.f127748f |= 1;
        }
        if (wVar3 != null) {
            h0Var.f127748f |= 2;
        }
        c2Var.f127622h = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66008kD();
        c2Var.f127623i = z;
        c2Var.f127624j = ChannelUtil.isGPVersion() ? 1 : 0;
        Log.m105925i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "Country Code: %s", d);
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = c2Var;
        bVar.f127067b = new C47564d2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getgameindexdownloadguidance";
        bVar.f127069d = 2586;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f113427d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113428e = nVar;
        return dispatch(gVar, this.f113427d, this);
    }

    public int getType() {
        return 2586;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetGameIndexDownloadGuidance", "errType = " + i2 + ", errCode = " + i3);
        this.f113428e.onSceneEnd(i2, i3, str, this);
    }
}

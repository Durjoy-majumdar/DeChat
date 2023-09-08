package com.tencent.p014mm.plugin.game.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
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
import py1.C47571e2;
import py1.C47578f2;
import py1.C47590h0;
import sw1.C48484q;

/* renamed from: com.tencent.mm.plugin.game.model.u0 */
public class C42115u0 extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f113429d;

    /* renamed from: e */
    public C11385n f113430e;

    public C42115u0(String str, LinkedList<String> linkedList, C42119w wVar, C42119w wVar2, C42119w wVar3, boolean z) {
        String str2 = str;
        Log.m105924i("MicroMsg.NetSceneGetGameIndexForeign", "lang = " + str + ", installedApp list size: " + linkedList.size());
        Iterator<String> it = linkedList.iterator();
        while (it.hasNext()) {
            Log.m105925i("MicroMsg.NetSceneGetGameIndexForeign", "install id:[%s]", it.next());
        }
        C47571e2 e2Var = new C47571e2();
        e2Var.f127662d = str2;
        e2Var.f127663e = linkedList;
        String d = C42046d.m45745d(MMApplicationContext.getContext());
        d = !Util.isNullOrNil(C4566p.f19311b) ? C4566p.f19311b : Util.isNullOrNil(d) ? Util.getSimCountryCode(MMApplicationContext.getContext()) : d;
        e2Var.f127664f = d;
        C42119w wVar4 = null;
        if (wVar != null) {
            wVar4 = wVar;
        } else if (wVar2 != null) {
            wVar4 = wVar2;
        } else if (wVar3 != null) {
            wVar4 = wVar3;
        }
        C47590h0 h0Var = new C47590h0();
        e2Var.f127665g = h0Var;
        if (wVar4 != null) {
            h0Var.f127746d = wVar4.f113491q1.f113527a;
            h0Var.f127747e = wVar4.field_appId;
            h0Var.f127749g = wVar4.f113472f2;
            h0Var.f127750h = wVar4.f113470e2;
        }
        if (wVar2 != null) {
            h0Var.f127748f |= 1;
        }
        if (wVar3 != null) {
            h0Var.f127748f |= 2;
        }
        e2Var.f127666h = ((C48484q) C86312j.m106911c(C48484q.class)).xi0().mo66008kD();
        e2Var.f127667i = z;
        e2Var.f127668j = ChannelUtil.isGPVersion() ? 1 : 0;
        Log.m105925i("MicroMsg.NetSceneGetGameIndexForeign", "Country Code: %s", d);
        if (!Util.isNullOrNil(e2Var.f127664f) && "CN".equalsIgnoreCase(e2Var.f127664f)) {
            C115669n.INSTANCE.idkeyStat(860, 8, 1, false);
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = e2Var;
        bVar.f127067b = new C47578f2();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getgameindexforeign";
        bVar.f127069d = 2855;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        this.f113429d = bVar.mo72403a();
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f113430e = nVar;
        return dispatch(gVar, this.f113429d, this);
    }

    public int getType() {
        return 2855;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105924i("MicroMsg.NetSceneGetGameIndexForeign", "errType = " + i2 + ", errCode = " + i3);
        this.f113430e.onSceneEnd(i2, i3, str, this);
    }
}

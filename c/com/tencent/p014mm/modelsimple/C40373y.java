package com.tencent.p014mm.modelsimple;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49247e82;
import te3.C49393f82;

/* renamed from: com.tencent.mm.modelsimple.y */
public class C40373y extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f108498d;

    /* renamed from: e */
    public C11385n f108499e;

    public C40373y(int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49247e82();
        bVar.f127067b = new C49393f82();
        bVar.f127068c = "/cgi-bin/micromsg-bin/getresourcecontrolinfo";
        bVar.f127069d = 725;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f108498d = a;
        ((C49247e82) a.f127055a.f127080a).f132785d = i;
        Log.m105925i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo type[%d], stack[%s]", Integer.valueOf(i), Util.getStack());
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f108499e = nVar;
        C115669n.INSTANCE.idkeyStat(405, 1, 1, true);
        return dispatch(gVar, this.f108498d, this);
    }

    public int getType() {
        return 725;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105925i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate GetResourceControlInfo onGYNetEnd netId[%d], errType[%d], errCode[%d], errMsg[%s]", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str);
        if (i2 == 0 && i3 == 0) {
            C115669n.INSTANCE.idkeyStat(405, 2, 1, true);
        }
        this.f108499e.onSceneEnd(i2, i3, str, this);
    }
}

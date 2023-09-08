package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import f40.C86709a0;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49465fs2;
import te3.C49604gs2;
import ul0.C90694b;

/* renamed from: com.tencent.mm.pluginsdk.model.app.h1 */
public class C30661h1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f82514d;

    /* renamed from: e */
    public C47350c f82515e;

    public C30661h1(int i, int i2, String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49465fs2();
        bVar.f127067b = new C49604gs2();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/usrmsg/getserviceapplist";
        bVar.f127069d = C90694b.CTRL_INDEX;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f82515e = a;
        C49465fs2 fs22 = (C49465fs2) a.f127055a.f127080a;
        fs22.f133668d = i;
        fs22.f133669e = i2;
        fs22.f133670f = str;
        C86709a0.m107528h();
        int intValue = ((Integer) C86709a0.m107535s().mo121142i().mo119685f(C72994y1.C72995a.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
        fs22.f133671g = intValue + "";
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f82514d = nVar;
        Log.m105924i("MicroMsg.NetSceneGetServiceAppList", "do scene");
        return dispatch(gVar, this.f82515e, this);
    }

    public int getType() {
        return C90694b.CTRL_INDEX;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105919d("MicroMsg.NetSceneGetServiceAppList", "onGYNetEnd code(%d, %d)", Integer.valueOf(i2), Integer.valueOf(i3));
        C11385n nVar = this.f82514d;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
    }
}

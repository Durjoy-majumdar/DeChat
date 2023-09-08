package com.tencent.p014mm.pluginsdk.model.app;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import sf0.C48374j0;
import te3.C50081k5;
import te3.C50216l5;
import te3.C51018qv3;

/* renamed from: com.tencent.mm.pluginsdk.model.app.e1 */
public class C44551e1 extends C117747y implements C1311n {

    /* renamed from: d */
    public C11385n f120815d;

    /* renamed from: e */
    public C47350c f120816e;

    /* renamed from: f */
    public int f120817f;

    /* renamed from: g */
    public C44549d1 f120818g;

    public C44551e1(int i, C44549d1 d1Var) {
        this.f120817f = i;
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C50081k5();
        bVar.f127067b = new C50216l5();
        bVar.f127068c = "/cgi-bin/micromsg-bin/appcenter";
        bVar.f127069d = 452;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f120816e = a;
        C50081k5 k5Var = (C50081k5) a.f127055a.f127080a;
        byte[] c = d1Var.mo69339c();
        if (c != null) {
            C51018qv3 qv32 = new C51018qv3();
            qv32.mo73350k(c);
            k5Var.f136558e = qv32;
        }
        k5Var.f136557d = i;
        this.f120818g = d1Var;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        this.f120815d = nVar;
        return dispatch(gVar, this.f120816e, this);
    }

    public int getType() {
        return 452;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        Log.m105918d("MicroMsg.NetSceneAppCenter", "errType = " + i2 + ", errCode = " + i3);
        if (i2 == 0 && i3 == 0) {
            this.f120818g.mo69337a(C48374j0.m53715d(((C50216l5) this.f120816e.f127056b.f127083a).f137180d));
            this.f120818g.onGYNetEnd(i, i2, i3, str, this.f120816e, bArr);
            this.f120815d.onSceneEnd(i2, i3, str, this);
            return;
        }
        Log.m105920e("MicroMsg.NetSceneAppCenter", "errType = " + i2 + ", errCode = " + i3);
        this.f120815d.onSceneEnd(i2, i3, str, this);
    }
}

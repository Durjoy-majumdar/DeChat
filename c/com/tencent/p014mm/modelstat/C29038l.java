package com.tencent.p014mm.modelstat;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import pe3.C89349b;
import te3.C49081d2;
import te3.C49217e2;
import te3.C50339m2;

/* renamed from: com.tencent.mm.modelstat.l */
public class C29038l extends C117747y implements C1311n {

    /* renamed from: d */
    public final C47350c f79579d;

    /* renamed from: e */
    public C11385n f79580e;

    public C29038l(int i, String str, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49081d2();
        bVar.f127067b = new C49217e2();
        bVar.f127068c = "/cgi-bin/mmoc-bin/ad/addatareport";
        bVar.f127069d = 1295;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f79579d = a;
        C50339m2 m2Var = new C50339m2();
        m2Var.f137758d = i;
        m2Var.f137759e = new C89349b(str.getBytes());
        m2Var.f137760f = (long) i2;
        ((C49081d2) a.f127055a.f127080a).f132072d.add(m2Var);
        Log.m105925i("MicroMsg.NetSceneAdDataReport", "init logId:%d, logStr:%s", Integer.valueOf(i), str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        this.f79580e = nVar;
        int dispatch = dispatch(gVar, this.f79579d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        return 1295;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.modelstat.NetSceneAdDataReport");
        C49217e2 e2Var = (C49217e2) this.f79579d.f127056b.f127083a;
        Log.m105925i("MicroMsg.NetSceneAdDataReport", "onGYNetEnd, errType = %d, errCode = %d, ret=%d, msg=%s", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(e2Var.f132634d), e2Var.f132635e);
        this.f79580e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.modelstat.NetSceneAdDataReport");
    }
}

package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.List;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49822ib;
import te3.C49969jb;

/* renamed from: com.tencent.mm.plugin.sns.model.b0 */
public class C43034b0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116488d;

    /* renamed from: e */
    public C11385n f116489e;

    /* renamed from: f */
    public C49969jb f116490f;

    /* renamed from: g */
    public List<Long> f116491g;

    public C43034b0(List<Long> list) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49822ib();
        bVar.f127067b = new C49969jb();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnsbatchobjectdetail";
        bVar.f127069d = 5987;
        bVar.f127070e = 97;
        bVar.f127071f = 1000000097;
        C47350c a = bVar.mo72403a();
        this.f116488d = a;
        this.f116491g = list;
        ((C49822ib) a.f127055a.f127080a).f135194d.addAll(list);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        this.f116489e = nVar;
        int dispatch = dispatch(gVar, this.f116488d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        return 5987;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
        Log.m105925i("MicroMsg.NetSceneSnsBatchDetail", "errType:%s, errCode:%s, errMsg:%s", Integer.valueOf(i2), Integer.valueOf(i3), str);
        this.f116490f = (C49969jb) ((C47350c) uVar).f127056b.f127083a;
        this.f116489e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsBatchObjectDetail");
    }
}

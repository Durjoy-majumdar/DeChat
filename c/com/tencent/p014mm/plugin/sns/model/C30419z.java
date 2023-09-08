package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.LinkedList;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49081d2;
import te3.C49217e2;
import te3.C50339m2;

/* renamed from: com.tencent.mm.plugin.sns.model.z */
public class C30419z extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f82049d;

    /* renamed from: e */
    public C11385n f82050e;

    public C30419z(LinkedList<C50339m2> linkedList) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49081d2();
        bVar.f127067b = new C49217e2();
        bVar.f127068c = "/cgi-bin/mmoc-bin/ad/addatareport";
        bVar.f127069d = 1295;
        bVar.f127070e = 0;
        bVar.f127071f = 0;
        C47350c a = bVar.mo72403a();
        this.f82049d = a;
        ((C49081d2) a.f127055a.f127080a).f132072d = linkedList;
        Log.m105925i("MicroMsg.NetSceneSnsAdDataReport", "report %d ads", Integer.valueOf(linkedList.size()));
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        this.f82050e = nVar;
        int dispatch = dispatch(gVar, this.f82049d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        return 1295;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
        Log.m105918d("MicroMsg.NetSceneSnsAdDataReport", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        this.f82050e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsAdDataReport");
    }
}

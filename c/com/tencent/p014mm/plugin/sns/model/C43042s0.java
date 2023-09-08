package com.tencent.p014mm.plugin.sns.model;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import os2.C100398c0;
import te3.l94;
import te3.m94;

/* renamed from: com.tencent.mm.plugin.sns.model.s0 */
public class C43042s0 extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f116514d;

    /* renamed from: e */
    public C11385n f116515e;

    public C43042s0(String str, C100398c0 c0Var) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new l94();
        bVar.f127067b = new m94();
        bVar.f127068c = "/cgi-bin/micromsg-bin/mmsnswwlikecover";
        bVar.f127069d = 4051;
        C47350c a = bVar.mo72403a();
        this.f116514d = a;
        l94 l94 = (l94) a.f127055a.f127080a;
        l94.f137271d = str;
        String str2 = c0Var.field_bgUrl;
        l94.f137272e = str2;
        String str3 = c0Var.field_imBGmd5sum;
        l94.f137273f = str3;
        String str4 = c0Var.field_imBGfileid;
        l94.f137274g = str4;
        Log.m105925i("MicroMsg.NetSceneSnsWwLikeCover", "SnsWwLikeCover username:%s, bgUrl:%s, bgMd5:%s, fileId:%s", str, str2, str3, str4);
    }

    public final int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        this.f116515e = nVar;
        int dispatch = dispatch(gVar, this.f116514d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        return 4051;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
        Log.m105924i("MicroMsg.NetSceneSnsWwLikeCover", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str);
        this.f116515e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.model.NetSceneSnsWwLikeCover");
    }
}

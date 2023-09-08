package jp2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C48683a92;
import te3.C64873z82;

/* renamed from: jp2.l */
public class C60886l extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f173456d;

    /* renamed from: e */
    public C11385n f173457e;

    public C60886l(int i, String str, String str2, String str3, String str4, int i2, int i3, int i4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64873z82();
        bVar.f127067b = new C48683a92();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_sns_ad_metric";
        bVar.f127069d = 4342;
        C47350c a = bVar.mo72403a();
        this.f173456d = a;
        C64873z82 z822 = (C64873z82) a.f127055a.f127080a;
        z822.f186638d = i;
        z822.f186639e = str;
        z822.f186640f = str2;
        z822.f186641g = str3;
        z822.f186642h = str4;
        z822.f186643i = i2;
        z822.f186644j = i3;
        z822.f186645n = i4;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        this.f173457e = nVar;
        int dispatch = dispatch(gVar, this.f173456d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        int i = this.f173456d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
        Log.m105924i("NetSceneDynamicAdDataUpdate", "errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f173457e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.ad.model.NetSceneDynamicAdDataUpdate");
    }
}

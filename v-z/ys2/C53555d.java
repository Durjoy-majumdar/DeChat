package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49866il3;
import te3.C50007jl3;

/* renamed from: ys2.d */
public class C53555d extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150523d;

    /* renamed from: e */
    public C11385n f150524e;

    public C53555d(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49866il3();
        bVar.f127067b = new C50007jl3();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/query_ad_redpkt_state";
        bVar.f127069d = 2944;
        C47350c a = bVar.mo72403a();
        this.f150523d = a;
        ((C49866il3) a.f127055a.f127080a).f135471d = str;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetHbCoverState");
        this.f150524e = nVar;
        int dispatch = dispatch(gVar, this.f150523d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetHbCoverState");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetHbCoverState");
        int i = this.f150523d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetHbCoverState");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetHbCoverState");
        Log.m105924i("NetSceneAdGetHbCoverState", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f150524e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetHbCoverState");
    }
}

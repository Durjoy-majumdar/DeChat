package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51626v1;
import te3.C51767w1;

/* renamed from: ys2.a */
public class C53552a extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150517d;

    /* renamed from: e */
    public C11385n f150518e;

    public C53552a(String str, String str2, String str3, int i, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51626v1();
        bVar.f127067b = new C51767w1();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/ad_anti_abuse";
        bVar.f127069d = 4679;
        C47350c a = bVar.mo72403a();
        this.f150517d = a;
        C51626v1 v1Var = (C51626v1) a.f127055a.f127080a;
        v1Var.f143232d = Util.nullAsNil(str);
        v1Var.f143236h = Util.nullAsNil(str2);
        v1Var.f143233e = Util.nullAsNil(str3);
        v1Var.f143234f = i;
        v1Var.f143235g = Util.nullAsNil(str4);
        Log.m105924i("NetSceneAdAntiAbuse", "NetSceneAdAntiAbuse, canvasId=" + str + ", pageId=" + str2 + ", scene=" + i + ", uxInfo=" + str3);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        this.f150518e = nVar;
        int dispatch = dispatch(gVar, this.f150517d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        int i = this.f150517d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
        Log.m105924i("NetSceneAdAntiAbuse", "NetSceneAdAntiAbuse, errType = " + i2 + ", errCode = " + i3 + ", errMsg = " + str);
        C11385n nVar = this.f150518e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdAntiAbuse");
    }
}

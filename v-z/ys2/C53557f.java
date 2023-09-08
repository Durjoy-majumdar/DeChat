package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49681ha2;
import te3.C49820ia2;

/* renamed from: ys2.f */
public class C53557f extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150527d;

    /* renamed from: e */
    public C11385n f150528e;

    public C53557f(String str, String str2, int i, String str3, String str4) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49681ha2();
        bVar.f127067b = new C49820ia2();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_twist_adcard";
        bVar.f127069d = 4729;
        C47350c a = bVar.mo72403a();
        this.f150527d = a;
        C49681ha2 ha22 = (C49681ha2) a.f127055a.f127080a;
        ha22.f134528d = str;
        ha22.f134530f = str2;
        ha22.f134529e = i;
        ha22.f134531g = str3;
        ha22.f134532h = str4;
        Log.m105924i("NetSceneAdGetTwistCard", "snsId=" + str2 + ", scene=" + i + ", canvasId=" + str3 + ", uxInfo=" + str + ", extra=" + str4);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        this.f150528e = nVar;
        int dispatch = dispatch(gVar, this.f150527d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        int i = this.f150527d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
        Log.m105924i("NetSceneAdGetTwistCard", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f150528e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCard");
    }
}

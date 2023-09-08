package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C50103ka2;
import te3.C64462ja2;

/* renamed from: ys2.g */
public class C66695g extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f191732d;

    /* renamed from: e */
    public C11385n f191733e;

    public C66695g(String str, int i, String str2, String str3, String str4, int i2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64462ja2();
        bVar.f127067b = new C50103ka2();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_twist_card_status";
        bVar.f127069d = 4689;
        bVar.f127074i = 5000;
        C47350c a = bVar.mo72403a();
        this.f191732d = a;
        C64462ja2 ja22 = (C64462ja2) a.f127055a.f127080a;
        ja22.f183768d = str;
        ja22.f183769e = i;
        ja22.f183773i = str2;
        ja22.f183770f = str3;
        ja22.f183771g = 0;
        ja22.f183772h = str4;
        ja22.f183774j = i2;
        Log.m105924i("NetSceneAdGetTwistCardStatus", "scene=" + i + ", canvasId=" + str2 + ", cardId=" + str3 + ", giveCardId=" + str4 + ", uxInfo=" + str + ", opType=" + i2);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        this.f191733e = nVar;
        int dispatch = dispatch(gVar, this.f191732d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        int i = this.f191732d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
        Log.m105924i("NetSceneAdGetTwistCardStatus", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f191733e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetTwistCardStatus");
    }
}

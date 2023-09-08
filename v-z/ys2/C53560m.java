package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.gm4;
import te3.hm4;

/* renamed from: ys2.m */
public class C53560m extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150534d;

    /* renamed from: e */
    public C11385n f150535e;

    public C53560m(String str, int i) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new gm4();
        bVar.f127067b = new hm4();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/update_shared_uxinfo";
        bVar.f127069d = 2883;
        C47350c a = bVar.mo72403a();
        this.f150534d = a;
        gm4 gm4 = (gm4) a.f127055a.f127080a;
        gm4.f134126d = str;
        gm4.f134127e = i;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateUxInfo");
        this.f150535e = nVar;
        int dispatch = dispatch(gVar, this.f150534d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateUxInfo");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateUxInfo");
        int i = this.f150534d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateUxInfo");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateUxInfo");
        Log.m105924i("NetSceneUpdateUxInfo", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f150535e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateUxInfo");
    }
}

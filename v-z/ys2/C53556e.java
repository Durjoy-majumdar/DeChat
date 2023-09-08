package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49646h22;
import te3.C49788i22;

/* renamed from: ys2.e */
public class C53556e extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150525d;

    /* renamed from: e */
    public C11385n f150526e;

    public C53556e(long j, int i, String str, String str2, int i2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49646h22();
        bVar.f127067b = new C49788i22();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_landpage_smartphone";
        bVar.f127069d = 2605;
        C47350c a = bVar.mo72403a();
        this.f150525d = a;
        C49646h22 h222 = (C49646h22) a.f127055a.f127080a;
        h222.f134412d = j;
        h222.f134413e = i;
        h222.f134414f = str;
        h222.f134415g = str2;
        h222.f134416h = i2;
        h222.f134417i = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        this.f150526e = nVar;
        int dispatch = dispatch(gVar, this.f150525d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        int i = this.f150525d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
        Log.m105924i("NetSceneAdGetSmartPhoneNumber", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f150526e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetSmartPhoneNumber");
    }
}

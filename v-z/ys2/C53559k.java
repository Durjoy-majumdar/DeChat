package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49079d12;
import te3.C49215e12;
import te3.C49383f53;
import te3.C49518g53;

/* renamed from: ys2.k */
public class C53559k extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150531d;

    /* renamed from: e */
    public C11385n f150532e;

    /* renamed from: f */
    public String f150533f;

    public C53559k(String str, String str2, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49079d12();
        bVar.f127067b = new C49215e12();
        bVar.f127068c = "/cgi-bin/mmgame-bin/getgamecanvasinfo";
        bVar.f127069d = 1337;
        C47350c a = bVar.mo72403a();
        this.f150531d = a;
        C49079d12 d122 = (C49079d12) a.f127055a.f127080a;
        d122.f132065d = str;
        d122.f132066e = str2;
        d122.f132067f = str3;
        Log.m105924i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: shareType:" + str2 + " sharedAppId :" + str);
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        this.f150532e = nVar;
        int dispatch = dispatch(gVar, this.f150531d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        int i = this.f150531d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return i;
    }

    /* renamed from: j1 */
    public String mo74210j1() {
        SnsMethodCalculate.markStartTimeMs("getJsonString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        String str = this.f150533f;
        SnsMethodCalculate.markEndTimeMs("getJsonString", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        return str;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
        Log.m105924i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "netId : " + i + " errType :" + i2 + " errCode: " + i3 + " errMsg :" + str + " sceneType: " + getType());
        if (getType() == 1337) {
            this.f150533f = ((C49215e12) ((C47350c) uVar).f127056b.f127083a).f132620d;
        } else if (getType() == 2721) {
            this.f150533f = ((C49518g53) ((C47350c) uVar).f127056b.f127083a).f133869d;
        }
        this.f150532e.onSceneEnd(i2, i3, str, this);
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneLandingPagesDynamicUpdate");
    }

    public C53559k(String str) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49383f53();
        bVar.f127067b = new C49518g53();
        bVar.f127068c = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_officialsync";
        bVar.f127069d = 2721;
        C47350c a = bVar.mo72403a();
        this.f150531d = a;
        ((C49383f53) a.f127055a.f127080a).f133303d = str;
        Log.m105924i("MicroMsg.NetSceneLandingPagesDynamicUpdate", "Req: syncBuffer:" + str);
    }
}

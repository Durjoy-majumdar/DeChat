package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.rtmp.TXLiveConstants;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C52075y62;
import te3.C64823x62;

/* renamed from: ys2.l */
public class C66698l extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f191739d;

    /* renamed from: e */
    public C11385n f191740e;

    public C66698l(String str, String str2, String str3, String str4, String str5, String str6) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C64823x62();
        bVar.f127067b = new C52075y62();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_qywx_qrcode";
        bVar.f127069d = TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED;
        C47350c a = bVar.mo72403a();
        this.f191739d = a;
        C64823x62 x622 = (C64823x62) a.f127055a.f127080a;
        x622.f186273d = str;
        x622.f186274e = str2;
        x622.f186275f = str3;
        x622.f186276g = str4;
        x622.f186277h = str5;
        x622.f186278i = str6;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        this.f191740e = nVar;
        int dispatch = dispatch(gVar, this.f191739d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        int i = this.f191739d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
        Log.m105924i("NetSceneUpdateQrUrl", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f191740e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneUpdateQrUrl");
    }
}

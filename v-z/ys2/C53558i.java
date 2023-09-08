package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C51186s04;
import te3.C51326t04;

/* renamed from: ys2.i */
public class C53558i extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150529d;

    /* renamed from: e */
    public C11385n f150530e;

    public C53558i(String str, String str2, long j, String str3) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51186s04();
        bVar.f127067b = new C51326t04();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/send_subscription_msg";
        bVar.f127069d = 2810;
        C47350c a = bVar.mo72403a();
        this.f150529d = a;
        C51186s04 s042 = (C51186s04) a.f127055a.f127080a;
        s042.f141254d = str;
        s042.f141255e = str2;
        s042.f141256f = j;
        s042.f141257g = str3;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdSubscribe");
        this.f150530e = nVar;
        int dispatch = dispatch(gVar, this.f150529d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdSubscribe");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdSubscribe");
        int i = this.f150529d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdSubscribe");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdSubscribe");
        Log.m105924i("NetSceneAdSubscribe", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f150530e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdSubscribe");
    }
}

package ys2;

import com.tencent.p014mm.network.C114770g;
import com.tencent.p014mm.network.C114799u;
import com.tencent.p014mm.network.C1311n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C47350c;
import te3.C49124dc2;
import te3.C49263ec2;

/* renamed from: ys2.c */
public class C53554c extends C117747y implements C1311n {

    /* renamed from: d */
    public C47350c f150521d;

    /* renamed from: e */
    public C11385n f150522e;

    public C53554c(String str, String str2) {
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C49124dc2();
        bVar.f127067b = new C49263ec2();
        bVar.f127068c = "/cgi-bin/mmoc-bin/adplayinfo/get_wx_user_name";
        bVar.f127069d = 4353;
        C47350c a = bVar.mo72403a();
        this.f150521d = a;
        C49124dc2 dc22 = (C49124dc2) a.f127055a.f127080a;
        dc22.f132231d = str;
        dc22.f132232e = str2;
    }

    public int doScene(C114770g gVar, C11385n nVar) {
        SnsMethodCalculate.markStartTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetBtnPersonalUserName");
        this.f150522e = nVar;
        int dispatch = dispatch(gVar, this.f150521d, this);
        SnsMethodCalculate.markEndTimeMs("doScene", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetBtnPersonalUserName");
        return dispatch;
    }

    public int getType() {
        SnsMethodCalculate.markStartTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetBtnPersonalUserName");
        int i = this.f150521d.f127058d;
        SnsMethodCalculate.markEndTimeMs("getType", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetBtnPersonalUserName");
        return i;
    }

    public void onGYNetEnd(int i, int i2, int i3, String str, C114799u uVar, byte[] bArr) {
        SnsMethodCalculate.markStartTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetBtnPersonalUserName");
        Log.m105924i("NetSceneAdGetBtnPersonalUserName", "errType=" + i2 + ", errCode=" + i3 + ", errMsg=" + str);
        C11385n nVar = this.f150522e;
        if (nVar != null) {
            nVar.onSceneEnd(i2, i3, str, this);
        }
        SnsMethodCalculate.markEndTimeMs("onGYNetEnd", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.model.NetSceneAdGetBtnPersonalUserName");
    }
}

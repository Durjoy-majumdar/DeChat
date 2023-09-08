package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.os.Bundle;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import vr2.C102251n;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$d */
public class l$$d implements C102251n.C102257c {

    /* renamed from: a */
    public final /* synthetic */ C95136l f276117a;

    public l$$d(C95136l lVar) {
        this.f276117a = lVar;
    }

    /* renamed from: a */
    public void mo131644a(String str, boolean z, String str2, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$14");
        C95136l.m121014I(this.f276117a);
        String str3 = "";
        if (bundle != null) {
            str3 = bundle.getString("jsCallbackId", str3);
        } else {
            Log.m105920e("AdLandingNewH5Comp", "qr onFinish, extParams==null");
        }
        Log.m105924i("AdLandingNewH5Comp", "qr onFinish, isSucc=" + z + ", errMsg=" + str2 + ", url=" + str + ", jsCallbackId=" + str3);
        C95136l.m121015J(this.f276117a, str3, z);
        SnsMethodCalculate.markEndTimeMs("onFinish", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$14");
    }
}

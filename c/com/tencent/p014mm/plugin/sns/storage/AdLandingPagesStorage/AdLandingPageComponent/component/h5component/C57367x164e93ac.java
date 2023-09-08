package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component;

import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import qo3.C101218e0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/h5component/AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$observer$1", "Landroidx/lifecycle/p;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$observer$1 */
public final class C57367x164e93ac implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ C101218e0 f164363d;

    /* renamed from: e */
    public final /* synthetic */ MMActivity f164364e;

    public C57367x164e93ac(C101218e0 e0Var, MMActivity mMActivity) {
        this.f164363d = e0Var;
        this.f164364e = mMActivity;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$observer$1");
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (bVar == C39623j.C39625b.ON_DESTROY) {
            Log.m105924i("AdHfRequestNumberDialogHelper", "handleBindPhoneNumber, ON_DESTROY");
            this.f164363d.mo140680z();
            this.f164364e.getLifecycle().removeObserver(this);
        }
        SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.h5component.AdHfRequestNumberDialogHelper$showRequestPhoneNumDialog$observer$1");
    }
}

package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp;

import android.os.Bundle;
import com.tencent.p014mm.p136ui.widget.MMProcessBar;
import com.tencent.p014mm.plugin.finder.webview.C41647w;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.comp.w */
public final class C43026w implements C41647w.C41649b {

    /* renamed from: a */
    public final /* synthetic */ C94680v f116473a;

    public C43026w(C94680v vVar) {
        this.f116473a = vVar;
    }

    /* renamed from: a */
    public void mo64676a() {
        SnsMethodCalculate.markStartTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onError");
        C115669n.INSTANCE.mo175911u(1970, 9);
        SnsMethodCalculate.markEndTimeMs("onError", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }

    /* renamed from: b */
    public void mo64677b(boolean z, boolean z2, boolean z3) {
        SnsMethodCalculate.markStartTimeMs("onCreateBoxWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onCreateBoxWebViewEnd, enablePreload=" + z + ", useCache=" + z3);
        SnsMethodCalculate.markEndTimeMs("onCreateBoxWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }

    /* renamed from: c */
    public void mo64678c() {
        SnsMethodCalculate.markStartTimeMs("onInitWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onInitWebViewEnd");
        SnsMethodCalculate.markEndTimeMs("onInitWebViewEnd", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }

    /* renamed from: d */
    public void mo64679d() {
        SnsMethodCalculate.markStartTimeMs("onCreateBoxWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onCreateBoxWebViewStart");
        SnsMethodCalculate.markEndTimeMs("onCreateBoxWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }

    /* renamed from: e */
    public void mo64680e() {
        SnsMethodCalculate.markStartTimeMs("onInitWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onInitWebViewStart");
        SnsMethodCalculate.markEndTimeMs("onInitWebViewStart", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }

    /* renamed from: f */
    public void mo64681f(int i, Bundle bundle) {
        SnsMethodCalculate.markStartTimeMs("onExecuteActionCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onExecuteActionCode");
        SnsMethodCalculate.markEndTimeMs("onExecuteActionCode", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }

    /* renamed from: g */
    public void mo64682g() {
        SnsMethodCalculate.markStartTimeMs("onWebViewReady", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
        Log.m105924i("AdLandingHalfEggCardComponent", "--onWebViewReady");
        C94680v vVar = this.f116473a;
        SnsMethodCalculate.markStartTimeMs("access$getMWebLoadingView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        MMProcessBar mMProcessBar = vVar.f273985F;
        SnsMethodCalculate.markEndTimeMs("access$getMWebLoadingView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (mMProcessBar != null) {
            mMProcessBar.setVisibility(4);
        }
        C94680v vVar2 = this.f116473a;
        SnsMethodCalculate.markStartTimeMs("access$getMWebLoadingView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        MMProcessBar mMProcessBar2 = vVar2.f273985F;
        SnsMethodCalculate.markEndTimeMs("access$getMWebLoadingView$p", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent");
        if (mMProcessBar2 != null) {
            mMProcessBar2.mo82304d();
        }
        C115669n.INSTANCE.mo175911u(1970, 8);
        SnsMethodCalculate.markEndTimeMs("onWebViewReady", "com.tencent.mm.plugin.sns.ad.landingpage.component.comp.AdLandingHalfEggCardComponent$doCustomLayout$3");
    }
}

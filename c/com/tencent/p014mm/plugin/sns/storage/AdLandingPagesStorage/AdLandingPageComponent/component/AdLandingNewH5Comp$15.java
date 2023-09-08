package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdNativePageLifecycleEvent;
import com.tencent.p014mm.p136ui.widget.MMWebView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15 */
class AdLandingNewH5Comp$15 extends IListener<SnsAdNativePageLifecycleEvent> {

    /* renamed from: d */
    public final /* synthetic */ C95136l f275831d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingNewH5Comp$15(C95136l lVar, C0125s sVar) {
        super(sVar);
        this.f275831d = lVar;
        this.__eventId = 1181431009;
    }

    public boolean callback(IEvent iEvent) {
        MMWebView mMWebView;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
        SnsAdNativePageLifecycleEvent snsAdNativePageLifecycleEvent = (SnsAdNativePageLifecycleEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
        try {
            C95136l lVar = this.f275831d;
            int i = snsAdNativePageLifecycleEvent.f265125d.f265126a;
            SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            lVar.getClass();
            SnsMethodCalculate.markStartTimeMs("onOwnerActivityLifeCycle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            IListener<SnsAdNativePageLifecycleEvent> iListener = lVar.f276111v;
            if (iListener != null) {
                iListener.dead();
                lVar.f276111v = null;
            }
            if (5 == i && (mMWebView = lVar.f276108s) != null) {
                mMWebView.setCleanOnDetached(true);
            }
            SnsMethodCalculate.markEndTimeMs("onOwnerActivityLifeCycle", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
            SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$15");
        return false;
    }
}

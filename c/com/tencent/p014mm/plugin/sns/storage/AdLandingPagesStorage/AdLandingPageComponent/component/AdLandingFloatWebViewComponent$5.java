package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdWebViewFileResultEvent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$5 */
class AdLandingFloatWebViewComponent$5 extends IListener<SnsAdWebViewFileResultEvent> {

    /* renamed from: d */
    public final /* synthetic */ C43047e f116518d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingFloatWebViewComponent$5(C43047e eVar, C0125s sVar) {
        super(sVar);
        this.f116518d = eVar;
        this.__eventId = -1022821005;
    }

    public boolean callback(IEvent iEvent) {
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$5");
        SnsAdWebViewFileResultEvent snsAdWebViewFileResultEvent = (SnsAdWebViewFileResultEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$5");
        try {
            C43047e.m46680G(this.f116518d, snsAdWebViewFileResultEvent);
        } catch (Throwable unused) {
            Log.m105928w("AdLandingFloatWebView", "resizing layout has wrong!");
        }
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$5");
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingFloatWebViewComponent$5");
        return true;
    }
}

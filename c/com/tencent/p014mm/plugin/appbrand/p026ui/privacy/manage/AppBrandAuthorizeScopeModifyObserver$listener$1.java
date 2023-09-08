package com.tencent.p014mm.plugin.appbrand.p026ui.privacy.manage;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.p026ui.authrize.OnWxaAuthorizeScopeModifyEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/ui/privacy/manage/AppBrandAuthorizeScopeModifyObserver$listener$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/ui/authrize/OnWxaAuthorizeScopeModifyEvent;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.ui.privacy.manage.AppBrandAuthorizeScopeModifyObserver$listener$1 */
public final class AppBrandAuthorizeScopeModifyObserver$listener$1 extends IListener<OnWxaAuthorizeScopeModifyEvent> {

    /* renamed from: d */
    public final /* synthetic */ AppBrandAuthorizeScopeModifyObserver f246783d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppBrandAuthorizeScopeModifyObserver$listener$1(AppBrandAuthorizeScopeModifyObserver appBrandAuthorizeScopeModifyObserver, C40008f fVar) {
        super(fVar);
        this.f246783d = appBrandAuthorizeScopeModifyObserver;
    }

    public boolean callback(IEvent iEvent) {
        OnWxaAuthorizeScopeModifyEvent onWxaAuthorizeScopeModifyEvent = (OnWxaAuthorizeScopeModifyEvent) iEvent;
        C87412m.m108594g(onWxaAuthorizeScopeModifyEvent, "event");
        ((C119157j) C119157j.f356862d).mo183895z(new C84578a(this.f246783d, onWxaAuthorizeScopeModifyEvent));
        return true;
    }
}

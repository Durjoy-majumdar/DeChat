package com.tencent.p014mm.plugin.appbrand.jsapi.finder;

import android.content.Context;
import android.content.Intent;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.C81879g;
import com.tencent.p014mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask;
import com.tencent.p014mm.plugin.appbrand.ipc.C81956c;
import com.tencent.p014mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare;
import com.tencent.p014mm.plugin.appbrand.widget.halfscreen.HalfScreenManger;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import gy3.C87412m;
import kotlin.Metadata;
import li0.C88508b;
import li0.C88509c;
import te3.C64287ci1;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/appbrand/jsapi/finder/JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1$onNavigateResult$1", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/plugin/appbrand/widget/halfscreen/HalfScreenManger$EventOnHalfPageCommonHeaderShareButtonClick;", "plugin-appbrand-integration_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1$onNavigateResult$1 */
public final class C82507x48fd9d26 extends IListener<HalfScreenManger.EventOnHalfPageCommonHeaderShareButtonClick> {

    /* renamed from: d */
    public final /* synthetic */ C81879g f241578d;

    /* renamed from: e */
    public final /* synthetic */ String f241579e;

    /* renamed from: f */
    public final /* synthetic */ C64287ci1 f241580f;

    /* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1$onNavigateResult$1$a */
    public static final class C82508a implements C88509c.C88512b {

        /* renamed from: d */
        public final /* synthetic */ C82507x48fd9d26 f241581d;

        public C82508a(C82507x48fd9d26 jsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1$onNavigateResult$1) {
            this.f241581d = jsApiNavigateToMiniProgramForFinderProductShare$createNavigatorCallback$1$onNavigateResult$1;
        }

        /* renamed from: b */
        public final void mo113102b(String str, C88508b bVar) {
            C87412m.m108594g(bVar, "state");
            int ordinal = bVar.ordinal();
            if (ordinal == 0 || ordinal == 3) {
                this.f241581d.dead();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C82507x48fd9d26(C81879g gVar, String str, C64287ci1 ci12, C40008f fVar) {
        super(fVar);
        this.f241578d = gVar;
        this.f241579e = str;
        this.f241580f = ci12;
        AppBrandRuntime runtime = gVar.getRuntime();
        C87412m.m108591d(runtime);
        runtime.f238113K.mo122978a(new C82508a(this));
    }

    public boolean callback(IEvent iEvent) {
        HalfScreenManger.EventOnHalfPageCommonHeaderShareButtonClick eventOnHalfPageCommonHeaderShareButtonClick = (HalfScreenManger.EventOnHalfPageCommonHeaderShareButtonClick) iEvent;
        C87412m.m108594g(eventOnHalfPageCommonHeaderShareButtonClick, "event");
        if (!C87412m.m108589b(eventOnHalfPageCommonHeaderShareButtonClick.f247576d, this.f241579e)) {
            return false;
        }
        Context context = this.f241578d.getContext();
        C64287ci1 ci12 = this.f241580f;
        C87412m.m108594g(ci12, "shareProductShareObject");
        JsApiNavigateToMiniProgramForFinderProductShare.NotifyClickRequest notifyClickRequest = new JsApiNavigateToMiniProgramForFinderProductShare.NotifyClickRequest();
        notifyClickRequest.f158092d = ci12;
        C81956c.m100675c(context, notifyClickRequest, (AppBrandProxyUIProcessTask.C81943b) null, (Intent) null);
        return true;
    }
}

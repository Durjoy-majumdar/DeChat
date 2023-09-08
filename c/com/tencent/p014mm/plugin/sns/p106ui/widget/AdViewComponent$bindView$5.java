package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.view.View;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C103764p;
import androidx.lifecycle.C39623j;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AdViewComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo182094d2 = {"com/tencent/mm/plugin/sns/ui/widget/AdViewComponent$bindView$5", "Landroidx/lifecycle/p;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$5 */
public final class AdViewComponent$bindView$5 implements C103764p {

    /* renamed from: d */
    public final /* synthetic */ AdViewComponent<Model> f281417d;

    /* renamed from: e */
    public final /* synthetic */ AdViewComponent.C96278a f281418e;

    /* renamed from: f */
    public final /* synthetic */ Model f281419f;

    public AdViewComponent$bindView$5(AdViewComponent<Model> adViewComponent, AdViewComponent.C96278a aVar, Model model) {
        this.f281417d = adViewComponent;
        this.f281418e = aVar;
        this.f281419f = model;
    }

    /* renamed from: k4 */
    public void mo104k4(C0125s sVar, C39623j.C39625b bVar) {
        SnsMethodCalculate.markStartTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$5");
        C87412m.m108594g(sVar, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(bVar, "event");
        if (bVar == C39623j.C39625b.ON_DESTROY) {
            Log.m105924i(this.f281417d.mo133972e(), "onStateChanged() ON_DESTROY");
            AdViewComponent<Model> adViewComponent = this.f281417d;
            SnsMethodCalculate.markStartTimeMs("access$setObserverHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            adViewComponent.f281414h = false;
            SnsMethodCalculate.markEndTimeMs("access$setObserverHasSet$p", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            this.f281417d.mo133415j();
            AdViewComponent<Model> adViewComponent2 = this.f281417d;
            adViewComponent2.getClass();
            SnsMethodCalculate.markStartTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            C0125s sVar2 = adViewComponent2.f281407a;
            SnsMethodCalculate.markEndTimeMs("getLifecycleOwner", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            sVar2.getLifecycle().removeObserver(this);
            AdViewComponent<Model> adViewComponent3 = this.f281417d;
            adViewComponent3.getClass();
            SnsMethodCalculate.markStartTimeMs("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            View view = adViewComponent3.f281408b;
            SnsMethodCalculate.markEndTimeMs("getViewContainer", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.f281418e);
            }
        }
        if (bVar == C39623j.C39625b.ON_RESUME) {
            AdViewComponent<Model> adViewComponent4 = this.f281417d;
            adViewComponent4.getClass();
            SnsMethodCalculate.markStartTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            Model model = adViewComponent4.f281410d;
            SnsMethodCalculate.markEndTimeMs("getModel", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent");
            if (model != null) {
                this.f281417d.mo133888h(this.f281419f);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onStateChanged", "com.tencent.mm.plugin.sns.ui.widget.AdViewComponent$bindView$5");
    }
}

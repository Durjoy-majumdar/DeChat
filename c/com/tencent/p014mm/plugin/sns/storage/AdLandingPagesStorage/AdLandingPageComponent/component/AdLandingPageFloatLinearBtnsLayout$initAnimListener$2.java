package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.C0125s;
import com.tencent.p014mm.autogen.events.SnsAdShowFloatCompEvent;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, mo182094d2 = {"com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout$initAnimListener$2", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/SnsAdShowFloatCompEvent;", "plugin-sns_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2 */
public final class AdLandingPageFloatLinearBtnsLayout$initAnimListener$2 extends IListener<SnsAdShowFloatCompEvent> {

    /* renamed from: d */
    public final /* synthetic */ C95243v0 f275835d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AdLandingPageFloatLinearBtnsLayout$initAnimListener$2(C0125s sVar, C95243v0 v0Var) {
        super(sVar);
        this.f275835d = v0Var;
    }

    public boolean callback(IEvent iEvent) {
        C95243v0 v0Var;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
        SnsAdShowFloatCompEvent snsAdShowFloatCompEvent = (SnsAdShowFloatCompEvent) iEvent;
        SnsMethodCalculate.markStartTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
        C87412m.m108594g(snsAdShowFloatCompEvent, "event");
        SnsAdShowFloatCompEvent.C92573a aVar = snsAdShowFloatCompEvent.f265132d;
        boolean z = true;
        if (aVar != null) {
            int i = aVar.f265133a;
            Context context = aVar.f265134b;
            C95243v0 v0Var2 = this.f275835d;
            SnsMethodCalculate.markStartTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            Context context2 = v0Var2.f276409s;
            SnsMethodCalculate.markEndTimeMs("access$getMContext$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            if (!C87412m.m108589b(context, context2)) {
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
            } else {
                if (i == 0) {
                    C95243v0 v0Var3 = this.f275835d;
                    SnsMethodCalculate.markStartTimeMs("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                    boolean z2 = v0Var3.f276405C;
                    SnsMethodCalculate.markEndTimeMs("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                    if (!z2) {
                        this.f275835d.mo131766H();
                        C95243v0 v0Var4 = this.f275835d;
                        SnsMethodCalculate.markStartTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        v0Var4.f276405C = true;
                        SnsMethodCalculate.markEndTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        C95243v0 v0Var5 = this.f275835d;
                        SnsMethodCalculate.markStartTimeMs("access$willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        v0Var5.mo131767I();
                        SnsMethodCalculate.markEndTimeMs("access$willAppear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                        return z;
                    }
                }
                if (i == 1) {
                    C95243v0 v0Var6 = this.f275835d;
                    SnsMethodCalculate.markStartTimeMs("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                    boolean z3 = v0Var6.f276405C;
                    SnsMethodCalculate.markEndTimeMs("access$isJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                    if (z3) {
                        C95243v0 v0Var7 = this.f275835d;
                        v0Var7.getClass();
                        SnsMethodCalculate.markStartTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        ObjectAnimator objectAnimator = v0Var7.f276407E;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        RoundedCornerFrameLayout roundedCornerFrameLayout = v0Var7.f276408F;
                        if (roundedCornerFrameLayout == null) {
                            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        } else {
                            WeakReference weakReference = new WeakReference(roundedCornerFrameLayout);
                            SnsMethodCalculate.markStartTimeMs("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                            SnsMethodCalculate.markStartTimeMs("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                            ObjectAnimator objectAnimator2 = null;
                            try {
                                View view = (View) weakReference.get();
                                if (view == null) {
                                    SnsMethodCalculate.markEndTimeMs("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                    v0Var = v0Var7;
                                } else {
                                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f});
                                    v0Var = v0Var7;
                                    try {
                                        ofFloat.setDuration(1000);
                                        ofFloat.addListener(new C5440w0(view));
                                        ofFloat.start();
                                        SnsMethodCalculate.markEndTimeMs("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                        objectAnimator2 = ofFloat;
                                    } catch (Exception e) {
                                        e = e;
                                        Log.m105921e("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "startAnimEnter error", e);
                                        SnsMethodCalculate.markEndTimeMs("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                        SnsMethodCalculate.markEndTimeMs("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                        v0Var.f276407E = objectAnimator2;
                                        SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        C95243v0 v0Var8 = this.f275835d;
                                        SnsMethodCalculate.markStartTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        v0Var8.f276405C = false;
                                        SnsMethodCalculate.markEndTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        C95243v0 v0Var9 = this.f275835d;
                                        SnsMethodCalculate.markStartTimeMs("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        v0Var9.mo131768J();
                                        SnsMethodCalculate.markEndTimeMs("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                                        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                                        return z;
                                    }
                                }
                            } catch (Exception e2) {
                                e = e2;
                                v0Var = v0Var7;
                                Log.m105921e("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "startAnimEnter error", e);
                                SnsMethodCalculate.markEndTimeMs("startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                SnsMethodCalculate.markEndTimeMs("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                                v0Var.f276407E = objectAnimator2;
                                SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                C95243v0 v0Var82 = this.f275835d;
                                SnsMethodCalculate.markStartTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                v0Var82.f276405C = false;
                                SnsMethodCalculate.markEndTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                C95243v0 v0Var92 = this.f275835d;
                                SnsMethodCalculate.markStartTimeMs("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                v0Var92.mo131768J();
                                SnsMethodCalculate.markEndTimeMs("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                                return z;
                            }
                            SnsMethodCalculate.markEndTimeMs("access$startAnimExit", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayoutKt");
                            v0Var.f276407E = objectAnimator2;
                            SnsMethodCalculate.markEndTimeMs("hide", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        }
                        C95243v0 v0Var822 = this.f275835d;
                        SnsMethodCalculate.markStartTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        v0Var822.f276405C = false;
                        SnsMethodCalculate.markEndTimeMs("access$setJsShowing$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        C95243v0 v0Var922 = this.f275835d;
                        SnsMethodCalculate.markStartTimeMs("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                        v0Var922.mo131768J();
                        SnsMethodCalculate.markEndTimeMs("access$willDisappear", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                    }
                }
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
                return z;
            }
        } else {
            SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
        }
        z = false;
        SnsMethodCalculate.markEndTimeMs("callback", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$2");
        return z;
    }
}

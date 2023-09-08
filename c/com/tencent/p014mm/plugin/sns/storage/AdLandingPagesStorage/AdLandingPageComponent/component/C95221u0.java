package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C103769x;
import androidx.lifecycle.LiveData;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.lang.ref.WeakReference;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.u0 */
public final class C95221u0 implements C0120a0<Integer> {

    /* renamed from: d */
    public final /* synthetic */ C95243v0 f276316d;

    /* renamed from: e */
    public final /* synthetic */ RoundedCornerFrameLayout f276317e;

    /* renamed from: f */
    public final /* synthetic */ C103769x<Integer> f276318f;

    public C95221u0(C95243v0 v0Var, RoundedCornerFrameLayout roundedCornerFrameLayout, C103769x<Integer> xVar) {
        this.f276316d = v0Var;
        this.f276317e = roundedCornerFrameLayout;
        this.f276318f = xVar;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$observer$1");
        int intValue = ((Number) obj).intValue();
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$observer$1");
        Log.m105918d("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "observer onchange called " + intValue);
        if (intValue == 2) {
            C95243v0 v0Var = this.f276316d;
            v0Var.getClass();
            SnsMethodCalculate.markStartTimeMs("getAnimStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            boolean z = v0Var.f276416z;
            SnsMethodCalculate.markEndTimeMs("getAnimStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            if (!z) {
                C5441x0.m5359a(new WeakReference(this.f276317e));
                this.f276318f.removeObserver(this);
                C103769x<Integer> xVar = this.f276318f;
                C95243v0 v0Var2 = this.f276316d;
                SnsMethodCalculate.markStartTimeMs("access$getEnterAnimStatusData$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                LiveData<Integer> liveData = v0Var2.f276415y;
                SnsMethodCalculate.markEndTimeMs("access$getEnterAnimStatusData$p", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                xVar.removeSource(liveData);
                C95243v0 v0Var3 = this.f276316d;
                v0Var3.getClass();
                SnsMethodCalculate.markStartTimeMs("setAnimStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
                v0Var3.f276416z = true;
                SnsMethodCalculate.markEndTimeMs("setAnimStarted", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$observer$1");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$observer$1");
    }
}

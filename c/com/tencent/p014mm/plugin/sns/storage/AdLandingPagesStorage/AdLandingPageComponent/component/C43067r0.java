package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.view.View;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.r0 */
public final class C43067r0<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ C95243v0 f116573d;

    public C43067r0(C95243v0 v0Var) {
        this.f116573d = v0Var;
    }

    public void onChanged(Object obj) {
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$1");
        Integer num = (Integer) obj;
        SnsMethodCalculate.markStartTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$1");
        if (num != null && num.intValue() == 3) {
            Log.m105918d("MicroMsg.Sns.AdLandingPageFloatLinearBtnsLayout", "contentView set INVISIBLE called");
            View view = this.f116573d.f276586n;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout$initAnimListener$1", "onChanged", "(Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/sns/storage/AdLandingPagesStorage/AdLandingPageComponent/component/AdLandingPageFloatLinearBtnsLayout$initAnimListener$1", "onChanged", "(Ljava/lang/Integer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$1");
        SnsMethodCalculate.markEndTimeMs("onChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageFloatLinearBtnsLayout$initAnimListener$1");
    }
}

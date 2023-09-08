package com.tencent.p014mm.plugin.sns.p106ui.helper;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C43047e;
import qs2.C101262e;

/* renamed from: com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper */
public final class FloatWebViewHelper implements C0124r {

    /* renamed from: d */
    public C101262e f279562d;

    /* renamed from: e */
    public C43047e f279563e;

    /* renamed from: f */
    public ViewGroup f279564f;

    private FloatWebViewHelper(C101262e eVar, ViewGroup viewGroup) {
        this.f279562d = eVar;
        this.f279564f = viewGroup;
    }

    /* renamed from: b */
    public static FloatWebViewHelper m122670b(C101262e eVar, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("newInstance", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        FloatWebViewHelper floatWebViewHelper = new FloatWebViewHelper(eVar, viewGroup);
        SnsMethodCalculate.markEndTimeMs("newInstance", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        return floatWebViewHelper;
    }

    /* renamed from: a */
    public final void mo133259a() {
        View p;
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        C101262e eVar = this.f279562d;
        ViewGroup viewGroup = this.f279564f;
        if (!(viewGroup == null || eVar == null)) {
            this.f279563e = new C43047e(viewGroup.getContext(), eVar, viewGroup);
            SnsMethodCalculate.markStartTimeMs("attachToParent", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
            C43047e eVar2 = this.f279563e;
            if (!(eVar2 == null || (p = eVar2.mo131855p()) == null || this.f279564f == null)) {
                ViewGroup viewGroup2 = (ViewGroup) p.getParent();
                if (viewGroup2 == null) {
                    ViewGroup viewGroup3 = this.f279564f;
                    viewGroup3.addView(p, viewGroup3.getChildCount() - 1);
                } else if (viewGroup2 != this.f279564f) {
                    viewGroup2.removeView(p);
                    ViewGroup viewGroup4 = this.f279564f;
                    viewGroup4.addView(p, viewGroup4.getChildCount() - 1);
                }
            }
            SnsMethodCalculate.markEndTimeMs("attachToParent", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        }
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public void onCreate(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            if (this.f279562d != null) {
                mo133259a();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public void onDestroy(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            C43047e eVar = this.f279563e;
            if (eVar != null) {
                eVar.mo67235C();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public void onPause(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            C43047e eVar = this.f279563e;
            if (eVar != null) {
                eVar.mo124361D();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public void onResume(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
        try {
            C43047e eVar = this.f279563e;
            if (eVar != null) {
                eVar.mo124360B();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ui.helper.FloatWebViewHelper");
    }
}

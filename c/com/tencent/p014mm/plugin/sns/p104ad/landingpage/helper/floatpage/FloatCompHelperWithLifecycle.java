package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.floatpage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.C0124r;
import androidx.lifecycle.C0125s;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import qs2.C101255a0;
import rq2.C101432s;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle */
public abstract class FloatCompHelperWithLifecycle<INFO extends C101255a0, COMP extends C95295z> implements C0124r {

    /* renamed from: d */
    public INFO f274145d;

    /* renamed from: e */
    public COMP f274146e;

    /* renamed from: f */
    public ViewGroup f274147f;

    /* renamed from: g */
    public Context f274148g;

    public FloatCompHelperWithLifecycle(INFO info, ViewGroup viewGroup) {
        this.f274145d = info;
        this.f274147f = viewGroup;
        this.f274148g = viewGroup != null ? viewGroup.getContext() : MMApplicationContext.getContext();
    }

    /* renamed from: a */
    public abstract COMP mo130381a(Context context, INFO info, ViewGroup viewGroup);

    /* renamed from: b */
    public void mo130382b(View view) {
        SnsMethodCalculate.markStartTimeMs("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        SnsMethodCalculate.markEndTimeMs("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
    }

    @C112974b0(C39623j.C39625b.ON_CREATE)
    public final void doCreate(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doCreate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        try {
            onCreate(sVar);
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doCreate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void doDestroy(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        try {
            SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
            COMP comp = this.f274146e;
            if (comp != null) {
                comp.mo67235C();
            }
            SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doDestroy", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
    }

    @C112974b0(C39623j.C39625b.ON_PAUSE)
    public final void doPause(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        try {
            SnsMethodCalculate.markStartTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
            COMP comp = this.f274146e;
            if (comp != null) {
                comp.mo124361D();
            }
            SnsMethodCalculate.markEndTimeMs("onPause", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doPause", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
    }

    @C112974b0(C39623j.C39625b.ON_RESUME)
    public final void doResume(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        try {
            SnsMethodCalculate.markStartTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
            COMP comp = this.f274146e;
            if (comp != null) {
                comp.mo124360B();
            }
            SnsMethodCalculate.markEndTimeMs("onResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("doResume", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
    }

    public void onCreate(C0125s sVar) {
        SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        INFO info = this.f274145d;
        ViewGroup viewGroup = this.f274147f;
        if (info == null || viewGroup == null) {
            Log.m105928w("FloatCompHelperWithLifecycle", "the info or container is null, please check input param");
        } else {
            this.f274146e = mo130381a(viewGroup.getContext(), info, viewGroup);
            SnsMethodCalculate.markStartTimeMs("attachToContainer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
            ViewGroup viewGroup2 = this.f274147f;
            COMP comp = this.f274146e;
            if (viewGroup2 == null || comp == null) {
                Log.m105928w("FloatCompHelperWithLifecycle", "the comp is null, please check config!!!!");
            } else {
                View p = comp.mo131855p();
                if (p != null) {
                    mo130382b(p);
                    C101432s.m133120b(viewGroup2, p, viewGroup2.getChildCount() - 1);
                }
            }
            SnsMethodCalculate.markEndTimeMs("attachToContainer", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
        }
        SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatCompHelperWithLifecycle");
    }
}

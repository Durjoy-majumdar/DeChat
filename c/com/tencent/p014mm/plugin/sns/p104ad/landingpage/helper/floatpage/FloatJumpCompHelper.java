package com.tencent.p014mm.plugin.sns.p104ad.landingpage.helper.floatpage;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.comp.C94646j;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.C95295z;
import com.tencent.p014mm.sdk.platformtools.Log;
import kg3.C76577a;
import qs2.C101255a0;
import so2.C101675j;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper */
public final class FloatJumpCompHelper extends FloatCompHelperWithLifecycle<C101675j, C94646j> {

    /* renamed from: h */
    public int f274149h = -1;

    public FloatJumpCompHelper(C101675j jVar, ViewGroup viewGroup) {
        super(jVar, viewGroup);
    }

    /* renamed from: d */
    public static int m119929d(Context context) {
        SnsMethodCalculate.markStartTimeMs("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            int identifier = Resources.getSystem().getIdentifier("navigation_bar_height", "dimen", Platform.ANDROID);
            if (identifier > 0) {
                int dimensionPixelSize = Resources.getSystem().getDimensionPixelSize(identifier);
                SnsMethodCalculate.markEndTimeMs("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return dimensionPixelSize;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAd.FloatJumpCompHelper", "getSysNavigationBarHeight, exp=" + th.toString());
        }
        int b = C76577a.m92151b(context, 30);
        SnsMethodCalculate.markEndTimeMs("getSysNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return b;
    }

    /* renamed from: a */
    public C95295z mo130381a(Context context, C101255a0 a0Var, ViewGroup viewGroup) {
        SnsMethodCalculate.markStartTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        C101675j jVar = (C101675j) a0Var;
        SnsMethodCalculate.markStartTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        if (!(context == null || jVar == null)) {
            int i = jVar.f297626B;
            if (i <= 0) {
                i = 130;
            }
            this.f274149h = C76577a.m92151b(context, i);
        }
        C94646j jVar2 = new C94646j(context, jVar, viewGroup, this.f274149h);
        SnsMethodCalculate.markEndTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        SnsMethodCalculate.markEndTimeMs("createComponent", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return jVar2;
    }

    /* renamed from: b */
    public void mo130382b(View view) {
        SnsMethodCalculate.markStartTimeMs("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 81;
                layoutParams2.bottomMargin += mo130388c();
            }
        } catch (Throwable unused) {
        }
        SnsMethodCalculate.markEndTimeMs("prepareContentViewLayoutParams", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
    }

    /* renamed from: c */
    public final int mo130388c() {
        SnsMethodCalculate.markStartTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        try {
            Context context = this.f274148g;
            if (context != null) {
                if (mo130389e(context)) {
                    int d = m119929d(context);
                    SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                    return d;
                }
                int b = C76577a.m92151b(context, 12);
                SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return b;
            }
        } catch (Throwable th) {
            Log.m105920e("SnsAd.FloatJumpCompHelper", "the getNavigationBarHeight has something wrong!!, exp=" + th.toString());
        }
        SnsMethodCalculate.markEndTimeMs("getNavigationBarHeight", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return 0;
    }

    /* renamed from: e */
    public final boolean mo130389e(Context context) {
        SnsMethodCalculate.markStartTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        boolean z = false;
        if (context != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
            int min = Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels);
            if (min == 0) {
                Log.m105928w("SnsAd.FloatJumpCompHelper", "the width is zero!!!");
                SnsMethodCalculate.markEndTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
                return true;
            }
            int compare = Float.compare(((float) max) / ((float) min), 1.7777778f);
            Log.m105918d("SnsAd.FloatJumpCompHelper", "shouldMindDeviceNavigationBar value is " + compare);
            if (compare > 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("shouldMindDeviceNavigationBar", "com.tencent.mm.plugin.sns.ad.landingpage.helper.floatpage.FloatJumpCompHelper");
        return false;
    }
}

package com.tencent.p014mm.plugin.appbrand.page;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ViewGroup;
import bt0.C79808b;
import bt0.b$$h;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import rq0.C90082a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.p3 */
public class C83881p3 implements C90082a {

    /* renamed from: a */
    public final C83780d1 f244915a;

    /* renamed from: b */
    public boolean f244916b;

    public C83881p3(C83780d1 d1Var) {
        C87412m.m108594g(d1Var, "page");
        this.f244915a = d1Var;
    }

    /* renamed from: a */
    public final void mo116448a(C79808b bVar) {
        Context context = bVar.getContext();
        AppBrandCapsuleBarPlaceHolderView capsuleView = bVar.getCapsuleView();
        if (capsuleView != null) {
            if (capsuleView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.LayoutParams layoutParams = capsuleView.getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f4057q3);
                if (marginLayoutParams.rightMargin != dimensionPixelSize) {
                    marginLayoutParams.rightMargin = dimensionPixelSize;
                    Log.m105924i("MPPageViewActionBarExtensionImpl", "[applyActionBarSizeProperty] reset capsule rightMargin:" + dimensionPixelSize);
                    capsuleView.requestLayout();
                }
            } else if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                throw new RuntimeException("it is not MarginLayoutParams");
            }
        }
        b$$h navResetStyleListener = bVar.getNavResetStyleListener();
        int a = navResetStyleListener != null ? navResetStyleListener.mo109966a() : C0966R.dimen.f4063q_;
        bVar.mo109944n();
        bVar.setNavContainerMinimumWidth(context.getResources().getDimensionPixelOffset(a));
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(C0966R.dimen.f4058q4);
        bVar.setActionBarHeight(dimensionPixelOffset);
        Log.m105924i("MPPageViewActionBarExtensionImpl", "[applyActionBarSizeProperty] ActionBar height=" + dimensionPixelOffset + "  density=" + context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: b */
    public void mo116449b() {
        this.f244916b = false;
    }

    /* renamed from: c */
    public void mo116450c() {
        this.f244916b = true;
        C79808b bVar = this.f244915a.f244554F;
        C87412m.m108593f(bVar, "page.actionBar");
        mo116448a(bVar);
    }

    /* renamed from: h */
    public void mo116451h(C79808b bVar) {
        C87412m.m108594g(bVar, "actionBar");
        mo116448a(bVar);
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        if (this.f244916b) {
            C79808b bVar = this.f244915a.f244554F;
            C87412m.m108593f(bVar, "page.actionBar");
            mo116448a(bVar);
        }
    }

    public void onDestroy() {
        this.f244916b = false;
    }
}

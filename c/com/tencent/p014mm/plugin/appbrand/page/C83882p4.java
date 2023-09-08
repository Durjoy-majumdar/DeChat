package com.tencent.p014mm.plugin.appbrand.page;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p385u2.C111105a;

/* renamed from: com.tencent.mm.plugin.appbrand.page.p4 */
public class C83882p4 {
    /* renamed from: a */
    public static void m103245a(C83873p2 p2Var, ViewGroup viewGroup) {
        AccessibilityManager accessibilityManager;
        if (BuildInfo.DEBUG && TextUtils.isEmpty(viewGroup.getContentDescription()) && (accessibilityManager = (AccessibilityManager) C111105a.m151502d(MMApplicationContext.getContext(), AccessibilityManager.class)) != null && !accessibilityManager.isTouchExplorationEnabled()) {
            viewGroup.setContentDescription("ScreenCanvasContainer");
        }
        ViewGroup viewGroup2 = p2Var.f244867a;
        if (viewGroup2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            for (int childCount = viewGroup3.getChildCount() - 1; childCount >= 0; childCount--) {
                if (viewGroup3.getChildAt(childCount) == viewGroup2) {
                    viewGroup3.addView(viewGroup, childCount, new ViewGroup.LayoutParams(-1, -1));
                    return;
                }
            }
        }
    }
}

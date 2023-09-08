package com.tencent.p014mm.plugin.appbrand.p026ui;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C24560g0;
import gy3.C24570s;
import gy3.C87412m;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ny3.C89104m;
import p225rc.C89918i;
import sx3.C64197v;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.w0 */
public final class C84701w0 {

    /* renamed from: a */
    public static final C84701w0 f247084a = new C84701w0();

    /* renamed from: b */
    public static final /* synthetic */ C89104m<Object>[] f247085b = {C24560g0.m30726b(new C24570s(C84701w0.class, "isBlockSplashHideForDebug", "isBlockSplashHideForDebug()Z", 0))};

    /* renamed from: c */
    public static final C89918i f247086c = new C89918i(Boolean.FALSE);

    /* renamed from: com.tencent.mm.plugin.appbrand.ui.w0$a */
    public static final class C84702a extends View.AccessibilityDelegate {

        /* renamed from: a */
        public final /* synthetic */ View f247087a;

        public C84702a(View view) {
            this.f247087a = view;
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            if (accessibilityNodeInfo != null && !accessibilityNodeInfo.isSelected()) {
                accessibilityNodeInfo.setTraversalAfter(this.f247087a);
                accessibilityNodeInfo.setTraversalBefore((View) null);
            }
        }
    }

    /* renamed from: a */
    public static final int m104350a(Context context, int i) {
        C87412m.m108594g(context, "<this>");
        return C60641c.m70921b(context.getResources().getDisplayMetrics().density * ((float) i));
    }

    /* renamed from: b */
    public static final void m104351b(C84560k4 k4Var) {
        View view;
        if (k4Var != null && (view = k4Var.getView()) != null) {
            Animation animation = view.getAnimation();
            if (animation != null) {
                animation.cancel();
            }
            view.animate().cancel();
            m104352c(view);
        }
    }

    /* renamed from: c */
    public static final void m104352c(View view) {
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashUtils", "safeDetachFromWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/ui/AppBrandLoadingSplashUtils", "safeDetachFromWindow", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* renamed from: d */
    public static final void m104353d(List<Integer> list, View view) {
        C87412m.m108594g(list, "order");
        C87412m.m108594g(view, "splashView");
        AccessibilityManager accessibilityManager = (AccessibilityManager) MMApplicationContext.getContext().getSystemService("accessibility");
        int i = 0;
        if ((accessibilityManager != null ? accessibilityManager.isEnabled() : false) && Build.VERSION.SDK_INT >= 22) {
            ArrayList arrayList = new ArrayList();
            for (Number intValue : list) {
                View findViewById = view.findViewById(intValue.intValue());
                if (findViewById != null) {
                    arrayList.add(findViewById);
                }
            }
            for (Object next : arrayList) {
                int i2 = i + 1;
                if (i >= 0) {
                    View view2 = (View) next;
                    view2.setAccessibilityTraversalAfter(-1);
                    view2.setAccessibilityTraversalBefore(-1);
                    if (i > 0) {
                        view2.setAccessibilityDelegate(new C84702a((View) arrayList.get(i - 1)));
                    }
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
        }
    }
}

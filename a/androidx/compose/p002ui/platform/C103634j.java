package androidx.compose.p002ui.platform;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.j */
public final class C103634j implements C103627h {
    public C103634j(Context context) {
        C87412m.m108594g(context, "context");
        Object systemService = context.getSystemService("accessibility");
        if (systemService != null) {
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
    }
}

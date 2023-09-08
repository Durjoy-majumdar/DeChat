package at0;

import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: at0.a */
public final class C79630a {
    /* renamed from: a */
    public static final void m96708a(View view) {
        C87412m.m108594g(view, "<this>");
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setDescendantFocusability(131072);
        }
        boolean requestFocus = view.requestFocus();
        Log.m105924i("MicroMsg.AppBrand.AccessibilityExt", "doAccessibilityFocus, focused: " + requestFocus);
    }
}

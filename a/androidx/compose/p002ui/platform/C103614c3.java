package androidx.compose.p002ui.platform;

import android.view.ViewParent;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.c3 */
public final class C103614c3 {

    /* renamed from: a */
    public static final C103614c3 f306066a = new C103614c3();

    /* renamed from: a */
    public final void mo144716a(AndroidComposeView androidComposeView) {
        C87412m.m108594g(androidComposeView, "ownerView");
        ViewParent parent = androidComposeView.getParent();
        if (parent != null) {
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}

package androidx.compose.p002ui.platform;

import android.view.ViewTreeObserver;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$b */
public final /* synthetic */ class AndroidComposeView$$b implements ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a */
    public final /* synthetic */ AndroidComposeView f306025a;

    public /* synthetic */ AndroidComposeView$$b(AndroidComposeView androidComposeView) {
        this.f306025a = androidComposeView;
    }

    public final void onScrollChanged() {
        AndroidComposeView androidComposeView = this.f306025a;
        Class<?> cls = AndroidComposeView.f305954n1;
        C87412m.m108594g(androidComposeView, "this$0");
        androidComposeView.mo144619K();
    }
}

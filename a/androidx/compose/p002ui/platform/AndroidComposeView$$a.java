package androidx.compose.p002ui.platform;

import android.view.ViewTreeObserver;
import gy3.C87412m;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$a */
public final /* synthetic */ class AndroidComposeView$$a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306024d;

    public /* synthetic */ AndroidComposeView$$a(AndroidComposeView androidComposeView) {
        this.f306024d = androidComposeView;
    }

    public final void onGlobalLayout() {
        AndroidComposeView androidComposeView = this.f306024d;
        Class<?> cls = AndroidComposeView.f305954n1;
        C87412m.m108594g(androidComposeView, "this$0");
        androidComposeView.mo144619K();
    }
}

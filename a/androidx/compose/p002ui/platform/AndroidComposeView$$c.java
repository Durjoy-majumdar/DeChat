package androidx.compose.p002ui.platform;

import android.view.ViewTreeObserver;
import gy3.C87412m;
import p1116h1.C108008a;
import p175j0.C108494d2;
import p869y0.C112320k;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$c */
public final /* synthetic */ class AndroidComposeView$$c implements ViewTreeObserver.OnTouchModeChangeListener {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306026d;

    public /* synthetic */ AndroidComposeView$$c(AndroidComposeView androidComposeView) {
        this.f306026d = androidComposeView;
    }

    public final void onTouchModeChanged(boolean z) {
        AndroidComposeView androidComposeView = this.f306026d;
        Class<?> cls = AndroidComposeView.f305954n1;
        C87412m.m108594g(androidComposeView, "this$0");
        ((C108494d2) androidComposeView.f305986Y0.f323454b).setValue(new C108008a(z ? 1 : 2));
        C112320k.m153225b(androidComposeView.f305999h.f336326a);
    }
}

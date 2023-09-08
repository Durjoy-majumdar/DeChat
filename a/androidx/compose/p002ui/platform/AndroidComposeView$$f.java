package androidx.compose.p002ui.platform;

import fy3.C32226l;
import gy3.C87413o;
import p1116h1.C108008a;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$f */
public final class AndroidComposeView$$f extends C87413o implements C32226l<C108008a, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306030d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$$f(AndroidComposeView androidComposeView) {
        super(1);
        this.f306030d = androidComposeView;
    }

    public Object invoke(Object obj) {
        int i = ((C108008a) obj).f323452a;
        boolean z = false;
        if (i == 1) {
            z = this.f306030d.isInTouchMode();
        } else {
            if (i == 2) {
                z = this.f306030d.isInTouchMode() ? this.f306030d.requestFocusFromTouch() : true;
            }
        }
        return Boolean.valueOf(z);
    }
}

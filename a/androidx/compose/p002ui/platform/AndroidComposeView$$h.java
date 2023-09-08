package androidx.compose.p002ui.platform;

import android.view.KeyEvent;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import p869y0.C112307c;
import p904j1.C108522a;
import p904j1.C108523c;
import p904j1.C76379b;

/* renamed from: androidx.compose.ui.platform.AndroidComposeView$$h */
public final class AndroidComposeView$$h extends C87413o implements C32226l<C76379b, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ AndroidComposeView f306032d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$$h(AndroidComposeView androidComposeView) {
        super(1);
        this.f306032d = androidComposeView;
    }

    public Object invoke(Object obj) {
        C112307c cVar;
        KeyEvent keyEvent = ((C76379b) obj).f223658a;
        C87412m.m108594g(keyEvent, LocaleUtil.ITALIAN);
        this.f306032d.getClass();
        long a = C108523c.m147065a(keyEvent);
        boolean z = true;
        if (C108522a.m147064a(a, C108522a.f324855g)) {
            cVar = new C112307c(keyEvent.isShiftPressed() ? 2 : 1);
        } else if (C108522a.m147064a(a, C108522a.f324853e)) {
            cVar = new C112307c(4);
        } else if (C108522a.m147064a(a, C108522a.f324852d)) {
            cVar = new C112307c(3);
        } else if (C108522a.m147064a(a, C108522a.f324850b)) {
            cVar = new C112307c(5);
        } else if (C108522a.m147064a(a, C108522a.f324851c)) {
            cVar = new C112307c(6);
        } else {
            if (C108522a.m147064a(a, C108522a.f324854f) ? true : C108522a.m147064a(a, C108522a.f324856h) ? true : C108522a.m147064a(a, C108522a.f324858j)) {
                cVar = new C112307c(7);
            } else {
                cVar = C108522a.m147064a(a, C108522a.f324849a) ? true : C108522a.m147064a(a, C108522a.f324857i) ? new C112307c(8) : null;
            }
        }
        if (cVar != null) {
            if (C108523c.m147066b(keyEvent) != 2) {
                z = false;
            }
            if (z) {
                return Boolean.valueOf(this.f306032d.getFocusManager().mo90560a(cVar.f336314a));
            }
        }
        return Boolean.FALSE;
    }
}

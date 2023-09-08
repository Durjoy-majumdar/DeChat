package he1;

import android.widget.PopupWindow;

/* renamed from: he1.g */
public final class C59844g implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ PopupWindow.OnDismissListener f170860d;

    public C59844g(PopupWindow.OnDismissListener onDismissListener) {
        this.f170860d = onDismissListener;
    }

    public final void onDismiss() {
        if (!C59842e.f170856b) {
            this.f170860d.onDismiss();
        }
        C59842e.f170855a = null;
    }
}

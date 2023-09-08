package wo1;

import android.widget.PopupWindow;

/* renamed from: wo1.p */
public final class C66159p implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ PopupWindow.OnDismissListener f190159d;

    public C66159p(PopupWindow.OnDismissListener onDismissListener) {
        this.f190159d = onDismissListener;
    }

    public final void onDismiss() {
        this.f190159d.onDismiss();
        C66160q.f190160a = null;
    }
}

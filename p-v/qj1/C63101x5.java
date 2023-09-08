package qj1;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import gy3.C8479f0;

/* renamed from: qj1.x5 */
public final class C63101x5 implements PopupWindow.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ View f179064d;

    /* renamed from: e */
    public final /* synthetic */ C8479f0<Drawable> f179065e;

    public C63101x5(View view, C8479f0<Drawable> f0Var) {
        this.f179064d = view;
        this.f179065e = f0Var;
    }

    public final void onDismiss() {
        this.f179064d.setBackground((Drawable) this.f179065e.f27484d);
    }
}

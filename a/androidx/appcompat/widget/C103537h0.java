package androidx.appcompat.widget;

import android.view.View;
import android.view.Window;
import p1130l.C109056a;

/* renamed from: androidx.appcompat.widget.h0 */
public class C103537h0 implements View.OnClickListener {

    /* renamed from: d */
    public final C109056a f305742d;

    /* renamed from: e */
    public final /* synthetic */ C103539i0 f305743e;

    public C103537h0(C103539i0 i0Var) {
        this.f305743e = i0Var;
        this.f305742d = new C109056a(i0Var.f305747a.getContext(), 0, 16908332, 0, 0, i0Var.f305755i);
    }

    public void onClick(View view) {
        C103539i0 i0Var = this.f305743e;
        Window.Callback callback = i0Var.f305758l;
        if (callback != null && i0Var.f305759m) {
            callback.onMenuItemSelected(0, this.f305742d);
        }
    }
}

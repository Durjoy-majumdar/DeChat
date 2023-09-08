package qk1;

import android.view.inputmethod.InputMethodManager;
import gy3.C87412m;
import qk1.C63257t;

/* renamed from: qk1.z */
public final class C63279z implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C63257t.C63258a f179594d;

    public C63279z(C63257t.C63258a aVar) {
        this.f179594d = aVar;
    }

    public final void run() {
        this.f179594d.f179523D.requestFocus();
        Object systemService = this.f179594d.f179523D.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.f179594d.f179523D, 2);
    }
}

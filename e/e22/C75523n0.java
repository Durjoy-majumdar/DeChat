package e22;

import android.view.inputmethod.InputMethodManager;
import e22.C75516l0;
import gy3.C87412m;

/* renamed from: e22.n0 */
public final class C75523n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C75516l0.C75517a f221903d;

    public C75523n0(C75516l0.C75517a aVar) {
        this.f221903d = aVar;
    }

    public final void run() {
        this.f221903d.mo105836a();
        Object systemService = this.f221903d.mo105836a().getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.f221903d.mo105836a(), 0);
        this.f221903d.mo105836a().setCursorVisible(false);
        this.f221903d.mo105836a().setCursorVisible(true);
    }
}

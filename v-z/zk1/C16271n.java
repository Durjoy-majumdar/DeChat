package zk1;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import gy3.C87412m;

/* renamed from: zk1.n */
public final class C16271n implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16229h f43561d;

    /* renamed from: e */
    public final /* synthetic */ View f43562e;

    public C16271n(C16229h hVar, View view) {
        this.f43561d = hVar;
        this.f43562e = view;
    }

    public final void run() {
        Object systemService = this.f43561d.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f43562e.getWindowToken(), 0);
    }
}

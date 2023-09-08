package yi2;

import android.view.inputmethod.InputMethodManager;
import gy3.C87412m;

/* renamed from: yi2.d */
public final class C16015d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C16018g f43082d;

    public C16015d(C16018g gVar) {
        this.f43082d = gVar;
    }

    public final void run() {
        C16018g gVar = this.f43082d;
        Object systemService = gVar.f43085f.getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(gVar.f43089j, 0);
    }
}

package qk1;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import gy3.C87412m;
import qk1.C12794c1;

/* renamed from: qk1.f1 */
public final class C12800f1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C12794c1.C12795a f36637d;

    /* renamed from: e */
    public final /* synthetic */ EditText f36638e;

    public C12800f1(C12794c1.C12795a aVar, EditText editText) {
        this.f36637d = aVar;
        this.f36638e = editText;
    }

    public final void run() {
        this.f36637d.f36628z.requestFocus();
        Object systemService = this.f36638e.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.f36637d.f36628z, 2);
    }
}

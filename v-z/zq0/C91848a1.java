package zq0;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import gy3.C87412m;

/* renamed from: zq0.a1 */
public final class C91848a1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C91897m0 f262983d;

    public C91848a1(C91897m0 m0Var) {
        this.f262983d = m0Var;
    }

    public final void run() {
        EditText editText = this.f262983d.f263130g;
        if (editText != null) {
            C87412m.m108591d(editText);
            Object systemService = editText.getContext().getSystemService("input_method");
            InputMethodManager inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
            if (inputMethodManager != null) {
                editText.requestFocus();
                inputMethodManager.showSoftInput(editText, 0);
            }
        }
    }
}

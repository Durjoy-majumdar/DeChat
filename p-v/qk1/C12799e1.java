package qk1;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import gy3.C87412m;
import qk1.C12794c1;

/* renamed from: qk1.e1 */
public final class C12799e1 implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C12794c1.C12795a f36635d;

    /* renamed from: e */
    public final /* synthetic */ EditText f36636e;

    public C12799e1(C12794c1.C12795a aVar, EditText editText) {
        this.f36635d = aVar;
        this.f36636e = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 != i) {
            return false;
        }
        this.f36635d.f36628z.clearFocus();
        Object systemService = this.f36636e.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f36635d.f36628z.getWindowToken(), 0);
        return true;
    }
}

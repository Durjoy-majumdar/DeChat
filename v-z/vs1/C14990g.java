package vs1;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import gy3.C87412m;
import vs1.C14974a;
import z04.C112550d0;

/* renamed from: vs1.g */
public final class C14990g implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C14974a f41092d;

    /* renamed from: e */
    public final /* synthetic */ int f41093e;

    /* renamed from: f */
    public final /* synthetic */ EditText f41094f;

    public C14990g(C14974a aVar, int i, EditText editText) {
        this.f41092d = aVar;
        this.f41093e = i;
        this.f41094f = editText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 != i) {
            return false;
        }
        C14974a.C14979e eVar = this.f41092d.f41037e.get(this.f41093e);
        String obj = C112550d0.m153799i0(this.f41094f.getText().toString()).toString();
        eVar.getClass();
        C87412m.m108594g(obj, "<set-?>");
        eVar.f41056a = obj;
        this.f41094f.clearFocus();
        this.f41092d.getClass();
        Object systemService = this.f41094f.getContext().getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f41094f.getWindowToken(), 0);
        return true;
    }
}

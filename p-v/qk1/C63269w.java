package qk1;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import cj1.C54785k6;
import gy3.C87412m;
import qk1.C63257t;
import z04.C112550d0;

/* renamed from: qk1.w */
public final class C63269w implements TextView.OnEditorActionListener {

    /* renamed from: d */
    public final /* synthetic */ C63257t f179564d;

    /* renamed from: e */
    public final /* synthetic */ int f179565e;

    /* renamed from: f */
    public final /* synthetic */ EditText f179566f;

    /* renamed from: g */
    public final /* synthetic */ C63257t.C63258a f179567g;

    public C63269w(C63257t tVar, int i, EditText editText, C63257t.C63258a aVar) {
        this.f179564d = tVar;
        this.f179565e = i;
        this.f179566f = editText;
        this.f179567g = aVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (6 != i) {
            return false;
        }
        C54785k6 k6Var = this.f179564d.f179507g.get(this.f179565e);
        String obj = C112550d0.m153799i0(this.f179566f.getText().toString()).toString();
        k6Var.getClass();
        C87412m.m108594g(obj, "<set-?>");
        k6Var.f153566a = obj;
        C63257t tVar = this.f179564d;
        Context context = this.f179566f.getContext();
        C87412m.m108593f(context, "context");
        if (tVar.mo88161F4(context)) {
            this.f179567g.f179523D.clearFocus();
            Object systemService = this.f179566f.getContext().getSystemService("input_method");
            C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(this.f179567g.f179523D.getWindowToken(), 0);
            this.f179564d.f179516s = false;
        }
        return true;
    }
}

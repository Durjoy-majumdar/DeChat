package yi2;

import android.content.DialogInterface;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import gy3.C87412m;

/* renamed from: yi2.f */
public final class C16017f implements DialogInterface.OnDismissListener {

    /* renamed from: d */
    public final /* synthetic */ C16018g f43084d;

    public C16017f(C16018g gVar) {
        this.f43084d = gVar;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C16018g gVar = this.f43084d;
        Object systemService = gVar.f43085f.getSystemService("input_method");
        C87412m.m108592e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        EditText editText = gVar.f43089j;
        inputMethodManager.hideSoftInputFromWindow(editText != null ? editText.getWindowToken() : null, 0);
    }
}

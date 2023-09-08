package e22;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.tencent.p014mm.plugin.label.p067ui.ContactLabelUI;

/* renamed from: e22.h0 */
public class C75508h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ContactLabelUI f221879d;

    public C75508h0(ContactLabelUI contactLabelUI) {
        this.f221879d = contactLabelUI;
    }

    public void run() {
        this.f221879d.f198651e.f224757M.performClick();
        this.f221879d.f198651e.f224757M.requestFocus();
        EditText editText = this.f221879d.f198651e.f224757M;
        editText.setSelection(editText.getText().length());
        ((InputMethodManager) this.f221879d.getContext().getSystemService("input_method")).showSoftInput(this.f221879d.f198651e.f224757M, 0);
    }
}

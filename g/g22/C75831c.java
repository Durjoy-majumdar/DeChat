package g22;

import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.p136ui.widget.MMEditText;
import com.tencent.p014mm.plugin.label.p067ui.widget.InputClearablePreference;

/* renamed from: g22.c */
public class C75831c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ InputClearablePreference f222445d;

    public C75831c(InputClearablePreference inputClearablePreference) {
        this.f222445d = inputClearablePreference;
    }

    public void run() {
        MMEditText mMEditText = this.f222445d.f198726Q;
        if (mMEditText != null) {
            this.f222445d.f198726Q.requestFocus();
            ((InputMethodManager) mMEditText.getContext().getSystemService("input_method")).showSoftInput(this.f222445d.f198726Q, 0);
            this.f222445d.f198726Q.setCursorVisible(false);
            this.f222445d.f198726Q.setCursorVisible(true);
        }
    }
}

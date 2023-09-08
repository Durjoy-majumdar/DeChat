package zt0;

import android.view.inputmethod.InputMethodManager;
import com.tencent.p014mm.plugin.appbrand.widget.sms.EditVerifyCodeViewNew;

/* renamed from: zt0.e */
public class C79434e implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ EditVerifyCodeViewNew f232964d;

    public C79434e(EditVerifyCodeViewNew editVerifyCodeViewNew) {
        this.f232964d = editVerifyCodeViewNew;
    }

    public void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.f232964d.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f232964d.f197421f.getWindowToken(), 0);
        }
    }
}

package g63;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* renamed from: g63.g */
public class C8238g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Context f27167d;

    /* renamed from: e */
    public final /* synthetic */ EditText f27168e;

    public C8238g(Context context, EditText editText) {
        this.f27167d = context;
        this.f27168e = editText;
    }

    public void run() {
        ((InputMethodManager) this.f27167d.getSystemService("input_method")).showSoftInput(this.f27168e, 2);
    }
}

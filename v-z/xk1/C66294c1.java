package xk1;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.MMActivity;

/* renamed from: xk1.c1 */
public final class C66294c1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C66352v0 f190836d;

    public C66294c1(C66352v0 v0Var) {
        this.f190836d = v0Var;
    }

    public final void run() {
        EditText editText = this.f190836d.f190998j;
        if (editText != null) {
            editText.requestFocus();
        }
        AppCompatActivity activity = this.f190836d.getActivity();
        MMActivity mMActivity = activity instanceof MMActivity ? (MMActivity) activity : null;
        if (mMActivity != null) {
            mMActivity.showVKB();
        }
    }
}

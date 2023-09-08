package gt0;

import android.content.DialogInterface;
import android.view.View;

/* renamed from: gt0.k0 */
public interface C87370k0 extends DialogInterface {

    /* renamed from: gt0.k0$a */
    public interface C87371a extends C87370k0, DialogInterface {
        void setCancelable(boolean z);

        void setCanceledOnTouchOutside(boolean z);

        void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener);
    }

    /* renamed from: A */
    void mo36936A(int i);

    /* renamed from: b */
    void mo36937b();

    View getContentView();

    int getPosition();

    /* renamed from: j */
    void mo36949j(C87375o0 o0Var);

    /* renamed from: k */
    boolean mo36950k();

    /* renamed from: m */
    boolean mo36951m();

    void onCancel();

    /* renamed from: w */
    boolean mo36953w();
}

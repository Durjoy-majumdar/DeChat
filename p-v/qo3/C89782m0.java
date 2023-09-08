package qo3;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85975v4;

/* renamed from: qo3.m0 */
public class C89782m0 extends ProgressDialog {

    /* renamed from: d */
    public Context f258159d;

    /* renamed from: e */
    public View f258160e;

    /* renamed from: f */
    public TextView f258161f;

    public C89782m0(Context context, int i) {
        super(context, i);
        this.f258159d = context;
        View inflate = View.inflate(context, C0966R.C0971layout.bos, (ViewGroup) null);
        this.f258160e = inflate;
        this.f258161f = (TextView) inflate.findViewById(C0966R.C0970id.i7u);
        ProgressBar progressBar = (ProgressBar) this.f258160e.findViewById(C0966R.C0970id.i7t);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: a */
    public static C89782m0 m112251a(Context context, CharSequence charSequence, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        C89782m0 m0Var = new C89782m0(context, C0966R.style.a66);
        m0Var.setMessage(charSequence);
        m0Var.setCancelable(z);
        m0Var.setOnCancelListener(onCancelListener);
        m0Var.setCanceledOnTouchOutside(false);
        return m0Var;
    }

    /* renamed from: c */
    public static C89782m0 m112252c(Context context, CharSequence charSequence, boolean z, DialogInterface.OnCancelListener onCancelListener) {
        C89782m0 a = m112251a(context, charSequence, z, onCancelListener);
        a.show();
        return a;
    }

    public void dismiss() {
        try {
            super.dismiss();
        } catch (Exception e) {
            C85975v4.m106305b("WeUI.WeUIProgresssDialog", "dismiss exception, e = " + e.getMessage(), new Object[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f258160e, new LinearLayout.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        onWindowAttributesChanged(attributes);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }

    public void setMessage(CharSequence charSequence) {
        this.f258161f.setText(charSequence);
    }

    public void show() {
        try {
            super.show();
        } catch (Exception e) {
            C85975v4.m106307d("WeUI.WeUIProgresssDialog", e, "", new Object[0]);
        }
    }
}

package gt0;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.loading.MMProgressLoading;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import gt0.C87370k0;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import qo3.C89782m0;

/* renamed from: gt0.c0 */
public class C87327c0 extends C89782m0 implements C87370k0, C87370k0.C87371a {

    /* renamed from: g */
    public DialogInterface.OnShowListener f253085g;

    /* renamed from: h */
    public DialogInterface.OnDismissListener f253086h;

    /* renamed from: i */
    public DialogInterface.OnCancelListener f253087i;

    /* renamed from: j */
    public boolean f253088j;

    /* renamed from: n */
    public boolean f253089n = true;

    /* renamed from: o */
    public C87375o0 f253090o;

    /* renamed from: p */
    public View f253091p;

    /* renamed from: q */
    public TextView f253092q;

    /* renamed from: r */
    public MMProgressLoading f253093r;

    /* renamed from: gt0.c0$a */
    public class C87328a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ int f253094d;

        public C87328a(int i) {
            this.f253094d = i;
        }

        public void run() {
            C87327c0.this.setProgress(this.f253094d);
        }
    }

    public C87327c0(Context context) {
        super(context, C0966R.style.a66);
        try {
            onCreate((Bundle) null);
        } catch (Exception unused) {
        }
        setContentView((int) C0966R.C0971layout.cj5);
    }

    /* renamed from: A */
    public void mo36936A(int i) {
    }

    /* renamed from: b */
    public void mo36937b() {
    }

    public void dismiss() {
        C87375o0 o0Var = this.f253090o;
        if (o0Var != null) {
            o0Var.mo121777a(this);
            DialogInterface.OnDismissListener onDismissListener = this.f253086h;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(this);
            }
        }
    }

    public View getContentView() {
        return this.f253091p;
    }

    public int getPosition() {
        return 1;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        DialogInterface.OnShowListener onShowListener = this.f253085g;
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
        this.f253090o = o0Var;
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return this.f253088j;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return this.f253089n;
    }

    public void onCancel() {
        DialogInterface.OnCancelListener onCancelListener = this.f253087i;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.f253089n = z;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f253088j = z;
    }

    public void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setMessage(CharSequence charSequence) {
        this.f253092q.setText(charSequence);
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        this.f253087i = onCancelListener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        this.f253086h = onDismissListener;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        this.f253085g = onShowListener;
    }

    public void setProgress(int i) {
        if (!MMHandlerThread.isMainThread()) {
            this.f253091p.post(new C87328a(i));
            return;
        }
        if (this.f253093r == null) {
            MMProgressLoading mMProgressLoading = (MMProgressLoading) this.f253091p.findViewById(C0966R.C0970id.lud);
            this.f253093r = mMProgressLoading;
            mMProgressLoading.setVisibility(0);
            View findViewById = this.f253091p.findViewById(C0966R.C0970id.lub);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view = findViewById;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandProgressDialog", "setProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/appbrand/widget/dialog/AppBrandProgressDialog", "setProgress", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f253093r.setProgress(i);
    }

    public void show() {
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }

    public void setContentView(View view) {
        this.f253091p = view;
        this.f253092q = (TextView) view.findViewById(C0966R.C0970id.luc);
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
        }
        setContentView(view);
    }
}

package gt0;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import at0.C79630a;
import com.tencent.p014mm.C0966R;
import qo3.C77398g;

/* renamed from: gt0.b */
public class C87325b extends C77398g implements C87370k0 {

    /* renamed from: N */
    public DialogInterface.OnShowListener f253073N;

    /* renamed from: P */
    public DialogInterface.OnDismissListener f253074P;

    /* renamed from: Q */
    public DialogInterface.OnCancelListener f253075Q;

    /* renamed from: R */
    public boolean f253076R;

    /* renamed from: S */
    public boolean f253077S = true;

    /* renamed from: T */
    public C87375o0 f253078T;

    /* renamed from: U */
    public View f253079U;

    /* renamed from: V */
    public boolean f253080V = false;

    /* renamed from: W */
    public CharSequence f253081W;

    public C87325b(Context context) {
        super(context, C0966R.style.a66);
        setContentView((View) this.f225691e);
        setCanceledOnTouchOutside(false);
    }

    /* renamed from: A */
    public void mo36936A(int i) {
    }

    /* renamed from: b */
    public void mo36937b() {
        View contentView = getContentView();
        if (contentView != null) {
            C79630a.m96708a(contentView);
        }
    }

    public void dismiss() {
        if (!this.f253080V) {
            this.f253080V = true;
            C87375o0 o0Var = this.f253078T;
            if (o0Var != null) {
                o0Var.mo121777a(this);
                DialogInterface.OnDismissListener onDismissListener = this.f253074P;
                if (onDismissListener != null) {
                    onDismissListener.onDismiss(this);
                }
            }
        }
    }

    public View getContentView() {
        View view = this.f253079U;
        return view != null ? view : this.f225691e;
    }

    public int getPosition() {
        return 1;
    }

    /* renamed from: j */
    public void mo36949j(C87375o0 o0Var) {
        DialogInterface.OnShowListener onShowListener = this.f253073N;
        if (onShowListener != null) {
            onShowListener.onShow(this);
        }
        this.f253078T = o0Var;
    }

    /* renamed from: k */
    public boolean mo36950k() {
        return this.f253076R;
    }

    /* renamed from: m */
    public boolean mo36951m() {
        return this.f253077S;
    }

    public void onCancel() {
        DialogInterface.OnCancelListener onCancelListener = this.f253075Q;
        if (onCancelListener != null) {
            onCancelListener.onCancel(this);
        }
    }

    /* renamed from: r */
    public void mo107533r(CharSequence charSequence) {
        this.f253081W = charSequence;
        super.mo107533r(charSequence);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        this.f253077S = z;
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        this.f253076R = z;
    }

    public void setContentView(int i) {
        setContentView(LayoutInflater.from(getContext()).inflate(i, (ViewGroup) null));
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        this.f253075Q = onCancelListener;
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        this.f253074P = onDismissListener;
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        super.setOnShowListener(onShowListener);
        this.f253073N = onShowListener;
    }

    public void show() {
    }

    /* renamed from: w */
    public boolean mo36953w() {
        return false;
    }

    public void setContentView(View view) {
        if (!(view instanceof C76059a)) {
            view = new C76059a(view.getContext(), view);
        }
        this.f253079U = view;
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            view.setLayoutParams(layoutParams);
        }
        setContentView(view);
    }

    public C87325b(Context context, int i) {
        super(context, i);
    }
}

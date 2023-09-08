package qo3;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.AlertActivity;
import j20.C117292a;
import k20.C9556a;

/* renamed from: qo3.i0 */
public class C89779i0 extends C63299j0 {

    /* renamed from: d */
    public TextView f258146d;

    /* renamed from: e */
    public ProgressBar f258147e;

    /* renamed from: f */
    public View f258148f;

    /* renamed from: g */
    public int f258149g;

    /* renamed from: h */
    public C89780a f258150h;

    /* renamed from: qo3.i0$a */
    public static class C89780a {

        /* renamed from: a */
        public C89779i0 f258151a;

        /* renamed from: b */
        public Context f258152b;

        /* renamed from: c */
        public CharSequence f258153c;

        /* renamed from: d */
        public boolean f258154d;

        /* renamed from: e */
        public int f258155e;

        /* renamed from: f */
        public int f258156f;

        /* renamed from: g */
        public DialogInterface.OnCancelListener f258157g;

        /* renamed from: h */
        public C89781a f258158h = null;

        /* renamed from: qo3.i0$a$a */
        public interface C89781a {
        }

        public C89780a(Context context) {
            this.f258152b = context;
        }

        /* renamed from: a */
        public C89779i0 mo124065a() {
            C89779i0 i0Var = new C89779i0(this.f258152b, this.f258156f, this.f258155e);
            i0Var.setMessage(this.f258153c);
            i0Var.setCancelable(this.f258154d);
            i0Var.setOnCancelListener(this.f258157g);
            i0Var.setCanceledOnTouchOutside(false);
            i0Var.f258150h = this;
            this.f258151a = i0Var;
            return i0Var;
        }

        /* renamed from: b */
        public final boolean mo124066b(Context context) {
            if (context instanceof Activity) {
                return true;
            }
            if (context instanceof ContextWrapper) {
                return mo124066b(((ContextWrapper) context).getBaseContext());
            }
            return false;
        }
    }

    public C89779i0(Context context, int i, int i2) {
        super(context, i);
        this.f258149g = i2;
        int i3 = C0966R.C0971layout.bfd;
        if (i2 != 0 && i2 == 1) {
            i3 = C0966R.C0971layout.bfe;
        }
        View inflate = View.inflate(getContext(), i3, (ViewGroup) null);
        this.f258148f = inflate;
        TextView textView = (TextView) inflate.findViewById(C0966R.C0970id.gvj);
        this.f258146d = textView;
        textView.getViewTreeObserver().addOnGlobalLayoutListener(new C47876h0(this));
        this.f258147e = (ProgressBar) this.f258148f.findViewById(C0966R.C0970id.gvi);
        setCanceledOnTouchOutside(true);
    }

    /* renamed from: a */
    public static C89779i0 m112245a(Context context, CharSequence charSequence, boolean z, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        if (i2 <= 0) {
            i2 = (i == 0 || i == 1 || i == 2) ? C0966R.style.a66 : C0966R.style.a6a;
        }
        C89780a aVar = new C89780a(context);
        aVar.f258153c = charSequence;
        aVar.f258155e = i;
        aVar.f258156f = i2;
        aVar.f258154d = z;
        aVar.f258157g = onCancelListener;
        return aVar.mo124065a();
    }

    /* renamed from: c */
    public static C89779i0 m112246c(Context context, CharSequence charSequence, boolean z, int i, DialogInterface.OnCancelListener onCancelListener) {
        return m112245a(context, charSequence, z, i, -1, onCancelListener);
    }

    /* renamed from: d */
    public static C89779i0 m112247d(Context context, CharSequence charSequence, boolean z, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        C89779i0 a = m112245a(context, charSequence, z, i, i2, onCancelListener);
        C89780a aVar = a.f258150h;
        if (aVar.mo124066b(aVar.f258152b)) {
            if (aVar.f258151a == null) {
                aVar.f258151a = aVar.mo124065a();
            }
            aVar.f258151a.show();
        } else {
            AlertActivity.f284190p = aVar;
            Intent intent = new Intent(aVar.f258152b, AlertActivity.class);
            intent.setFlags(335544320);
            intent.putExtra("dialog_scene", 4);
            Context context2 = aVar.f258152b;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(intent);
            Context context3 = context2;
            C117292a.m165358d(context3, aVar2.mo10232b(), "com/tencent/mm/ui/widget/dialog/MMProgressDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context2.startActivity((Intent) aVar2.mo10231a(0));
            C117292a.m165359e(context3, "com/tencent/mm/ui/widget/dialog/MMProgressDialog$Builder", "show", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return a;
    }

    /* renamed from: e */
    public static C89779i0 m112248e(Context context, CharSequence charSequence, boolean z, int i, DialogInterface.OnCancelListener onCancelListener) {
        return m112247d(context, charSequence, z, i, -1, onCancelListener);
    }

    public void dismiss() {
        C89780a.C89781a aVar;
        try {
            C89780a aVar2 = this.f258150h;
            if (!(aVar2 == null || (aVar = aVar2.f258158h) == null || aVar2.f258151a == this)) {
                AlertActivity.C85809h hVar = (AlertActivity.C85809h) aVar;
                if (hVar.f249915a.isShowing()) {
                    hVar.f249915a.dismiss();
                }
                AlertActivity.this.finish();
            }
            super.dismiss();
        } catch (Exception unused) {
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(this.f258148f, new LinearLayout.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -2;
        attributes.height = -2;
        if (this.f258149g == 2) {
            getWindow().addFlags(2);
            attributes.dimAmount = 0.65f;
        }
        onWindowAttributesChanged(attributes);
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        setCanceledOnTouchOutside(z);
    }

    public void setMessage(CharSequence charSequence) {
        this.f258146d.setText(charSequence);
    }

    public void setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        C89780a.C89781a aVar;
        super.setOnCancelListener(onCancelListener);
        C89780a aVar2 = this.f258150h;
        if (aVar2 != null && (aVar = aVar2.f258158h) != null && aVar2.f258151a != this) {
            ((AlertActivity.C85809h) aVar).f249915a.setOnCancelListener(onCancelListener);
        }
    }

    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        C89780a.C89781a aVar;
        super.setOnDismissListener(onDismissListener);
        C89780a aVar2 = this.f258150h;
        if (aVar2 != null && (aVar = aVar2.f258158h) != null && aVar2.f258151a != this) {
            ((AlertActivity.C85809h) aVar).f249915a.setOnDismissListener(onDismissListener);
        }
    }

    public void setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        C89780a.C89781a aVar;
        super.setOnKeyListener(onKeyListener);
        C89780a aVar2 = this.f258150h;
        if (aVar2 != null && (aVar = aVar2.f258158h) != null && aVar2.f258151a != this) {
            ((AlertActivity.C85809h) aVar).mo119712a(onKeyListener);
        }
    }

    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        C89780a.C89781a aVar;
        super.setOnShowListener(onShowListener);
        C89780a aVar2 = this.f258150h;
        if (aVar2 != null && (aVar = aVar2.f258158h) != null && aVar2.f258151a != this) {
            ((AlertActivity.C85809h) aVar).mo119713b(onShowListener);
        }
    }

    public void show() {
        C89780a.C89781a aVar;
        try {
            C89780a aVar2 = this.f258150h;
            if (!(aVar2 == null || (aVar = aVar2.f258158h) == null || aVar2.f258151a == this)) {
                AlertActivity.C85809h hVar = (AlertActivity.C85809h) aVar;
                if (!hVar.f249915a.isShowing()) {
                    hVar.f249915a.show();
                }
            }
            super.show();
        } catch (Exception unused) {
        }
    }
}

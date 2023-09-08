package hl3;

import android.content.Context;
import android.content.DialogInterface;
import com.tencent.p014mm.C0966R;
import nj3.C76879j;
import qo3.C89779i0;

/* renamed from: hl3.e */
public class C8606e {

    /* renamed from: a */
    public Context f27709a;

    /* renamed from: b */
    public C89779i0 f27710b = null;

    /* renamed from: hl3.e$a */
    public class C8607a implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f27711d;

        public C8607a(C8606e eVar, Runnable runnable) {
            this.f27711d = runnable;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Runnable runnable = this.f27711d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    /* renamed from: hl3.e$b */
    public class C8608b implements DialogInterface.OnCancelListener {

        /* renamed from: d */
        public final /* synthetic */ Runnable f27712d;

        public C8608b(C8606e eVar, Runnable runnable) {
            this.f27712d = runnable;
        }

        public void onCancel(DialogInterface dialogInterface) {
            Runnable runnable = this.f27712d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public C8606e(Context context) {
        this.f27709a = context;
    }

    /* renamed from: a */
    public void mo9466a(Runnable runnable) {
        Context context = this.f27709a;
        this.f27710b = C76879j.m92723Q(context, context.getResources().getString(C0966R.string.a3h), this.f27709a.getResources().getString(C0966R.string.f7435g7), true, false, new C8607a(this, runnable));
    }

    /* renamed from: b */
    public void mo9467b(Runnable runnable, Runnable runnable2) {
        runnable.run();
        Context context = this.f27709a;
        this.f27710b = C76879j.m92723Q(context, context.getResources().getString(C0966R.string.a3h), this.f27709a.getResources().getString(C0966R.string.f7439ga), true, false, new C8608b(this, runnable2));
    }

    /* renamed from: c */
    public void mo9468c() {
        C89779i0 i0Var = this.f27710b;
        if (i0Var != null) {
            i0Var.dismiss();
            this.f27710b = null;
        }
    }
}

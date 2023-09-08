package gk0;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import gt0.C87327c0;
import gt0.C87375o0;
import hp3.C87581a;
import lp3.C46888b;
import lp3.C88643g;

/* renamed from: gk0.g */
public final class C87242g<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ C87237e f252933a;

    /* renamed from: b */
    public final /* synthetic */ C87327c0 f252934b;

    /* renamed from: c */
    public final /* synthetic */ C83780d1 f252935c;

    public C87242g(C87237e eVar, C87327c0 c0Var, C83780d1 d1Var) {
        this.f252933a = eVar;
        this.f252934b = c0Var;
        this.f252935c = d1Var;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        C87237e eVar = this.f252933a;
        C87327c0 c0Var = this.f252934b;
        C83780d1 d1Var = this.f252935c;
        eVar.getClass();
        C46888b b = C88643g.m110544b();
        c0Var.setMessage(d1Var.getContext().getString(C0966R.string.f360120a81));
        c0Var.setOnCancelListener(new C87239e0(b));
        C87375o0 dialogContainer = d1Var.getDialogContainer();
        if (dialogContainer != null) {
            dialogContainer.mo121778b(c0Var);
        }
        return new Object();
    }
}

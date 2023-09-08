package au3;

import a14.C53873d2;
import a14.C53896h0;
import a14.C53927n1;
import gy3.C87412m;
import java.util.concurrent.RejectedExecutionException;
import wx3.C66212f;

/* renamed from: au3.g */
public abstract class C54334g extends C53896h0 {

    /* renamed from: e */
    public final C53896h0 f152467e = C54330c.f152464a;

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C87412m.m108595h(fVar, "context");
        C87412m.m108595h(runnable, "block");
        try {
            execute(new C28134f(runnable, ((C54332e) fVar.get(C54332e.f152466d)) == null));
        } catch (RejectedExecutionException e) {
            C53873d2.m60390b(fVar, C53927n1.m60552a("The task was rejected", e));
            C53896h0 h0Var = this.f152467e;
            if (h0Var != null) {
                h0Var.mo74497S(fVar, runnable);
            }
        }
    }

    public abstract void execute(Runnable runnable);
}

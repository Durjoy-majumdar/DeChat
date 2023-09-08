package p864t5;

import a14.C53916l;
import d24.C106982e;
import d24.C20387b0;
import d24.C20401f;
import fy3.C32226l;
import gy3.C87412m;
import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;

/* renamed from: t5.f */
public final class C110907f implements C20401f, C32226l<Throwable, C13598b0> {

    /* renamed from: d */
    public final C106982e f331714d;

    /* renamed from: e */
    public final C53916l<C20387b0> f331715e;

    public C110907f(C106982e eVar, C53916l<? super C20387b0> lVar) {
        C87412m.m108594g(eVar, "call");
        C87412m.m108594g(lVar, "continuation");
        this.f331714d = eVar;
        this.f331715e = lVar;
    }

    /* renamed from: a */
    public void mo31908a(C106982e eVar, IOException iOException) {
        C87412m.m108594g(eVar, "call");
        C87412m.m108594g(iOException, "e");
        if (!eVar.isCanceled()) {
            C53916l<C20387b0> lVar = this.f331715e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(iOException)));
        }
    }

    /* renamed from: b */
    public void mo31909b(C106982e eVar, C20387b0 b0Var) {
        C87412m.m108594g(eVar, "call");
        C87412m.m108594g(b0Var, "response");
        this.f331715e.resumeWith(Result.m168114constructorimpl(b0Var));
    }

    public Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        try {
            this.f331714d.cancel();
        } catch (Throwable unused) {
        }
        return C13598b0.f38549a;
    }
}

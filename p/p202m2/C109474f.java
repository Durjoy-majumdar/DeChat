package p202m2;

import a14.C53916l;
import gy3.C87412m;
import java.util.concurrent.ExecutionException;
import kotlin.Result;
import kotlin.ResultKt;
import p1167z8.C112608f;

/* renamed from: m2.f */
public final class C109474f<T> implements Runnable {

    /* renamed from: d */
    public final C112608f<T> f327680d;

    /* renamed from: e */
    public final C53916l<T> f327681e;

    public C109474f(C112608f<T> fVar, C53916l<? super T> lVar) {
        C87412m.m108595h(fVar, "futureToObserve");
        C87412m.m108595h(lVar, "continuation");
        this.f327680d = fVar;
        this.f327681e = lVar;
    }

    public void run() {
        if (this.f327680d.isCancelled()) {
            C53916l.C53917a.m60514a(this.f327681e, (Throwable) null, 1, (Object) null);
            return;
        }
        try {
            C53916l<T> lVar = this.f327681e;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(C117502a.m165740f(this.f327680d)));
        } catch (ExecutionException e) {
            C53916l<T> lVar2 = this.f327681e;
            Throwable cause = e.getCause();
            if (cause != null) {
                Result.Companion companion2 = Result.Companion;
                lVar2.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(cause)));
                return;
            }
            C87412m.m108601n();
            throw null;
        }
    }
}

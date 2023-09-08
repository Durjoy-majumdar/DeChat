package c14;

import a14.C53916l;
import a14.C53926n;
import a14.C53942r0;
import f14.C58872c0;
import f14.C58891n;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;

/* renamed from: c14.c0 */
public class C54617c0<E> extends C54610a0 {

    /* renamed from: g */
    public final E f153131g;

    /* renamed from: h */
    public final C53916l<C13598b0> f153132h;

    public C54617c0(E e, C53916l<? super C13598b0> lVar) {
        this.f153131g = e;
        this.f153132h = lVar;
    }

    /* renamed from: t */
    public void mo75530t() {
        this.f153132h.mo74592K(C53926n.f151180a);
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + C53942r0.m60572a(this) + '(' + this.f153131g + ')';
    }

    /* renamed from: u */
    public E mo75531u() {
        return this.f153131g;
    }

    /* renamed from: v */
    public void mo75532v(C54634n<?> nVar) {
        C53916l<C13598b0> lVar = this.f153132h;
        Result.Companion companion = Result.Companion;
        Throwable th = nVar.f153155g;
        if (th == null) {
            th = new C54636p("Channel was closed");
        }
        lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
    }

    /* renamed from: w */
    public C58872c0 mo75533w(C58891n.C58893b bVar) {
        if (this.f153132h.mo74593Q(C13598b0.f38549a, (Object) null) == null) {
            return null;
        }
        return C53926n.f151180a;
    }
}

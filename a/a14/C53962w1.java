package a14;

import fy3.C32226l;
import rx3.C13598b0;

/* renamed from: a14.w1 */
public final class C53962w1 extends C53904j {

    /* renamed from: d */
    public final C32226l<Throwable, C13598b0> f151201d;

    public C53962w1(C32226l<? super Throwable, C13598b0> lVar) {
        this.f151201d = lVar;
    }

    /* renamed from: a */
    public void mo74490a(Throwable th) {
        this.f151201d.invoke(th);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74490a((Throwable) obj);
        return C13598b0.f38549a;
    }

    public String toString() {
        return "InvokeOnCancel[" + this.f151201d.getClass().getSimpleName() + '@' + C53942r0.m60572a(this) + ']';
    }
}

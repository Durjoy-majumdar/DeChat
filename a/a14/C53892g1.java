package a14;

import rx3.C13598b0;

/* renamed from: a14.g1 */
public final class C53892g1 extends C53904j {

    /* renamed from: d */
    public final C53883f1 f151140d;

    public C53892g1(C53883f1 f1Var) {
        this.f151140d = f1Var;
    }

    /* renamed from: a */
    public void mo74490a(Throwable th) {
        this.f151140d.dispose();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74490a((Throwable) obj);
        return C13598b0.f38549a;
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f151140d + ']';
    }
}

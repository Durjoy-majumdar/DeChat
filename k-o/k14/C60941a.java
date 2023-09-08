package k14;

import a14.C53904j;
import f14.C58908z;
import rx3.C13598b0;

/* renamed from: k14.a */
public final class C60941a extends C53904j {

    /* renamed from: d */
    public final C60954j f173572d;

    /* renamed from: e */
    public final int f173573e;

    public C60941a(C60954j jVar, int i) {
        this.f173572d = jVar;
        this.f173573e = i;
    }

    /* renamed from: a */
    public void mo74490a(Throwable th) {
        C60954j jVar = this.f173572d;
        int i = this.f173573e;
        jVar.getClass();
        jVar.f173603e.set(i, C60953i.f173601e);
        if (C58908z.f168561d.incrementAndGet(jVar) == C60953i.f173602f && !jVar.mo84059c()) {
            jVar.mo84060d();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo74490a((Throwable) obj);
        return C13598b0.f38549a;
    }

    public String toString() {
        return "CancelSemaphoreAcquisitionHandler[" + this.f173572d + ", " + this.f173573e + ']';
    }
}

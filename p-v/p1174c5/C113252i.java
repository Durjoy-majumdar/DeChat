package p1174c5;

/* renamed from: c5.i */
public class C113252i<TResult> {

    /* renamed from: a */
    public final C113248f<TResult> f338862a = new C113248f<>();

    /* renamed from: a */
    public void mo165796a(Exception exc) {
        boolean z;
        C113248f<TResult> fVar = this.f338862a;
        synchronized (fVar.f338849a) {
            z = false;
            if (!fVar.f338850b) {
                fVar.f338850b = true;
                fVar.f338852d = exc;
                fVar.f338849a.notifyAll();
                fVar.mo165792c();
                z = true;
            }
        }
        if (!z) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }
}

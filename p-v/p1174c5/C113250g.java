package p1174c5;

import java.util.concurrent.CancellationException;

/* renamed from: c5.g */
public final class C113250g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C113252i f338857d;

    /* renamed from: e */
    public final /* synthetic */ C113246d f338858e;

    /* renamed from: f */
    public final /* synthetic */ C113248f f338859f;

    public C113250g(C113245c cVar, C113252i iVar, C113246d dVar, C113248f fVar) {
        this.f338857d = iVar;
        this.f338858e = dVar;
        this.f338859f = fVar;
    }

    public void run() {
        try {
            if (!this.f338857d.f338862a.mo165793d(this.f338858e.mo165790a(this.f338859f))) {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            C113248f<TResult> fVar = this.f338857d.f338862a;
            synchronized (fVar.f338849a) {
                boolean z = true;
                if (fVar.f338850b) {
                    z = false;
                } else {
                    fVar.f338850b = true;
                    fVar.f338849a.notifyAll();
                    fVar.mo165792c();
                }
                if (!z) {
                    throw new IllegalStateException("Cannot cancel a completed task.");
                }
            }
        } catch (Exception e) {
            this.f338857d.mo165796a(e);
        }
    }
}

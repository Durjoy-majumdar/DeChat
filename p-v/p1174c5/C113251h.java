package p1174c5;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;

/* renamed from: c5.h */
public final class C113251h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C113252i f338860d;

    /* renamed from: e */
    public final /* synthetic */ Callable f338861e;

    public C113251h(C113245c cVar, C113252i iVar, Callable callable) {
        this.f338860d = iVar;
        this.f338861e = callable;
    }

    public void run() {
        try {
            C113252i iVar = this.f338860d;
            if (!iVar.f338862a.mo165793d(this.f338861e.call())) {
                throw new IllegalStateException("Cannot set the result of a completed task.");
            }
        } catch (CancellationException unused) {
            C113248f<TResult> fVar = this.f338860d.f338862a;
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
            this.f338860d.mo165796a(e);
        }
    }
}

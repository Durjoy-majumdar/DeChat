package j14;

import a14.C53935p1;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import wx3.C66212f;

/* renamed from: j14.f */
public class C60723f extends C53935p1 {

    /* renamed from: e */
    public C60716a f172959e;

    public C60723f(int i, int i2, long j, String str) {
        this.f172959e = new C60716a(i, i2, j, str);
    }

    /* renamed from: S */
    public void mo74497S(C66212f fVar, Runnable runnable) {
        C60716a aVar = this.f172959e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C60716a.f172930n;
        aVar.mo85643b(runnable, C60729l.f172969f, false);
    }

    /* renamed from: f0 */
    public void mo74564f0(C66212f fVar, Runnable runnable) {
        C60716a aVar = this.f172959e;
        AtomicLongFieldUpdater atomicLongFieldUpdater = C60716a.f172930n;
        aVar.mo85643b(runnable, C60729l.f172969f, true);
    }

    /* renamed from: i0 */
    public Executor mo74625i0() {
        return this.f172959e;
    }
}

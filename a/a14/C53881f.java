package a14;

import gy3.C87412m;
import java.util.concurrent.locks.LockSupport;
import wx3.C66212f;

/* renamed from: a14.f */
public final class C53881f<T> extends C53851a<T> {

    /* renamed from: f */
    public final Thread f151126f;

    /* renamed from: g */
    public final C53906j1 f151127g;

    public C53881f(C66212f fVar, Thread thread, C53906j1 j1Var) {
        super(fVar, true, true);
        this.f151126f = thread;
        this.f151127g = j1Var;
    }

    /* renamed from: x */
    public void mo74511x(Object obj) {
        if (!C87412m.m108589b(Thread.currentThread(), this.f151126f)) {
            LockSupport.unpark(this.f151126f);
        }
    }
}

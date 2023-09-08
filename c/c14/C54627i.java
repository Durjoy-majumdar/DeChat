package c14;

import a14.C53851a;
import a14.C53854a2;
import fy3.C32226l;
import java.util.concurrent.CancellationException;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: c14.i */
public class C54627i<E> extends C53851a<C13598b0> implements C54625h<E> {

    /* renamed from: f */
    public final C54625h<E> f153151f;

    public C54627i(C66212f fVar, C54625h<E> hVar, boolean z, boolean z2) {
        super(fVar, z, z2);
        this.f153151f = hVar;
    }

    /* renamed from: D */
    public void mo74514D(Throwable th) {
        CancellationException cancellationException = null;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException == null) {
            cancellationException = new C53854a2(mo74465H(), th, this);
        }
        this.f153151f.mo75512b(cancellationException);
        mo74513C(cancellationException);
    }

    /* renamed from: b */
    public final void mo74528b(CancellationException cancellationException) {
        if (!isCancelled()) {
            if (cancellationException == null) {
                cancellationException = new C53854a2(mo74465H(), (Throwable) null, this);
            }
            mo74514D(cancellationException);
        }
    }

    /* renamed from: f */
    public Object mo75513f(C15601d<? super C54630l<? extends E>> dVar) {
        return this.f153151f.mo75513f(dVar);
    }

    /* renamed from: g */
    public Object mo75514g(C15601d<? super E> dVar) {
        return this.f153151f.mo75514g(dVar);
    }

    /* renamed from: h */
    public boolean mo75535h() {
        return this.f153151f.mo75535h();
    }

    public C54628j<E> iterator() {
        return this.f153151f.iterator();
    }

    /* renamed from: m */
    public boolean mo75516m() {
        return this.f153151f.mo75516m();
    }

    /* renamed from: o */
    public Object mo75536o(E e, C15601d<? super C13598b0> dVar) {
        return this.f153151f.mo75536o(e, dVar);
    }

    public boolean offer(E e) {
        return this.f153151f.offer(e);
    }

    /* renamed from: p */
    public void mo75538p(C32226l<? super Throwable, C13598b0> lVar) {
        this.f153151f.mo75538p(lVar);
    }

    /* renamed from: t */
    public Object mo75539t(E e) {
        return this.f153151f.mo75539t(e);
    }

    /* renamed from: u */
    public Object mo75518u() {
        return this.f153151f.mo75518u();
    }

    /* renamed from: w */
    public boolean mo75540w(Throwable th) {
        return this.f153151f.mo75540w(th);
    }
}

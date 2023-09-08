package c14;

import a14.C53926n;
import a14.C53942r0;
import f14.C58872c0;
import f14.C58891n;

/* renamed from: c14.n */
public final class C54634n<E> extends C54610a0 implements C54650y<E> {

    /* renamed from: g */
    public final Throwable f153155g;

    public C54634n(Throwable th) {
        this.f153155g = th;
    }

    /* renamed from: c */
    public Object mo75566c() {
        return this;
    }

    /* renamed from: d */
    public C58872c0 mo75525d(E e, C58891n.C58893b bVar) {
        return C53926n.f151180a;
    }

    /* renamed from: f */
    public void mo75526f(E e) {
    }

    /* renamed from: t */
    public void mo75530t() {
    }

    public String toString() {
        return "Closed@" + C53942r0.m60572a(this) + '[' + this.f153155g + ']';
    }

    /* renamed from: u */
    public Object mo75531u() {
        return this;
    }

    /* renamed from: v */
    public void mo75532v(C54634n<?> nVar) {
    }

    /* renamed from: w */
    public C58872c0 mo75533w(C58891n.C58893b bVar) {
        return C53926n.f151180a;
    }

    /* renamed from: y */
    public final Throwable mo75567y() {
        Throwable th = this.f153155g;
        return th == null ? new C54635o("Channel was closed") : th;
    }
}

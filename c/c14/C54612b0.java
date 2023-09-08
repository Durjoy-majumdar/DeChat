package c14;

import fy3.C32226l;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: c14.b0 */
public interface C54612b0<E> {

    /* renamed from: c14.b0$a */
    public static final class C54613a {
        /* renamed from: a */
        public static /* synthetic */ boolean m61404a(C54612b0 b0Var, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return b0Var.mo75540w(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: close");
        }
    }

    /* renamed from: h */
    boolean mo75535h();

    /* renamed from: o */
    Object mo75536o(E e, C15601d<? super C13598b0> dVar);

    boolean offer(E e);

    /* renamed from: p */
    void mo75538p(C32226l<? super Throwable, C13598b0> lVar);

    /* renamed from: t */
    Object mo75539t(E e);

    /* renamed from: w */
    boolean mo75540w(Throwable th);
}

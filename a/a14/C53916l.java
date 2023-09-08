package a14;

import fy3.C32226l;
import rx3.C13598b0;
import wx3.C15601d;

/* renamed from: a14.l */
public interface C53916l<T> extends C15601d<T> {

    /* renamed from: a14.l$a */
    public static final class C53917a {
        /* renamed from: a */
        public static /* synthetic */ boolean m60514a(C53916l lVar, Throwable th, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    th = null;
                }
                return lVar.mo74591G(th);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

    /* renamed from: G */
    boolean mo74591G(Throwable th);

    /* renamed from: K */
    void mo74592K(Object obj);

    /* renamed from: Q */
    Object mo74593Q(T t, Object obj);

    /* renamed from: U */
    Object mo74594U(T t, Object obj, C32226l<? super Throwable, C13598b0> lVar);

    /* renamed from: V */
    Object mo74595V(Throwable th);

    /* renamed from: X */
    void mo74596X(T t, C32226l<? super Throwable, C13598b0> lVar);

    /* renamed from: a */
    boolean mo74597a();

    /* renamed from: c */
    boolean mo74598c();

    /* renamed from: v */
    void mo74599v(C32226l<? super Throwable, C13598b0> lVar);

    /* renamed from: y */
    void mo74600y(C53896h0 h0Var, T t);
}

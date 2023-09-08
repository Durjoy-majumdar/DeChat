package c14;

import a14.C53875e;
import a14.C53916l;
import a14.C53921m;
import a14.C53926n;
import a14.C53929o;
import a14.C53942r0;
import c14.C54630l;
import f14.C31874j;
import f14.C58872c0;
import f14.C58889l;
import f14.C58890m;
import f14.C58891n;
import f14.C58902t;
import f14.C58905w;
import f14.C7971b0;
import fy3.C32226l;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: c14.a */
public abstract class C54602a<E> extends C54614c<E> implements C54625h<E> {

    /* renamed from: c14.a$a */
    public static final class C54603a<E> implements C54628j<E> {

        /* renamed from: a */
        public final C54602a<E> f153107a;

        /* renamed from: b */
        public Object f153108b = C54611b.f153123d;

        public C54603a(C54602a<E> aVar) {
            this.f153107a = aVar;
        }

        /* renamed from: a */
        public Object mo75523a(C15601d<? super Boolean> dVar) {
            Object obj = this.f153108b;
            C58872c0 c0Var = C54611b.f153123d;
            boolean z = false;
            if (obj != c0Var) {
                if (obj instanceof C54634n) {
                    C54634n nVar = (C54634n) obj;
                    if (nVar.f153155g != null) {
                        Throwable y = nVar.mo75567y();
                        int i = C7971b0.f26651a;
                        throw y;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            Object B = this.f153107a.mo75510B();
            this.f153108b = B;
            if (B != c0Var) {
                if (B instanceof C54634n) {
                    C54634n nVar2 = (C54634n) B;
                    if (nVar2.f153155g != null) {
                        Throwable y2 = nVar2.mo75567y();
                        int i2 = C7971b0.f26651a;
                        throw y2;
                    }
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            C53921m<? super Boolean> a = C53929o.m60553a(C66447b.m78392b(dVar));
            C54606d dVar2 = new C54606d(this, a);
            while (true) {
                if (this.f153107a.mo75519v(dVar2)) {
                    C54602a<E> aVar = this.f153107a;
                    aVar.getClass();
                    a.mo74599v(new C54607e(dVar2));
                    break;
                }
                Object B2 = this.f153107a.mo75510B();
                this.f153108b = B2;
                if (B2 instanceof C54634n) {
                    C54634n nVar3 = (C54634n) B2;
                    if (nVar3.f153155g == null) {
                        Result.Companion companion = Result.Companion;
                        a.resumeWith(Result.m168114constructorimpl(Boolean.FALSE));
                    } else {
                        Result.Companion companion2 = Result.Companion;
                        a.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(nVar3.mo75567y())));
                    }
                } else if (B2 != C54611b.f153123d) {
                    Boolean bool = Boolean.TRUE;
                    C32226l<E, C13598b0> lVar = this.f153107a.f153127d;
                    a.mo74596X(bool, lVar != null ? new C58902t(lVar, B2, a.f151173h) : null);
                }
            }
            return a.mo74608o();
        }

        public E next() {
            E e = this.f153108b;
            if (!(e instanceof C54634n)) {
                E e2 = C54611b.f153123d;
                if (e != e2) {
                    this.f153108b = e2;
                    return e;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            Throwable y = ((C54634n) e).mo75567y();
            int i = C7971b0.f26651a;
            throw y;
        }
    }

    /* renamed from: c14.a$b */
    public static class C54604b<E> extends C54648w<E> {

        /* renamed from: g */
        public final C53916l<Object> f153109g;

        /* renamed from: h */
        public final int f153110h;

        public C54604b(C53916l<Object> lVar, int i) {
            this.f153109g = lVar;
            this.f153110h = i;
        }

        /* renamed from: d */
        public C58872c0 mo75525d(E e, C58891n.C58893b bVar) {
            if (this.f153109g.mo74594U(this.f153110h == 1 ? new C54630l(e) : e, (Object) null, mo75528t(e)) == null) {
                return null;
            }
            return C53926n.f151180a;
        }

        /* renamed from: f */
        public void mo75526f(E e) {
            this.f153109g.mo74592K(C53926n.f151180a);
        }

        public String toString() {
            return "ReceiveElement@" + C53942r0.m60572a(this) + "[receiveMode=" + this.f153110h + ']';
        }

        /* renamed from: u */
        public void mo75527u(C54634n<?> nVar) {
            if (this.f153110h == 1) {
                this.f153109g.resumeWith(Result.m168114constructorimpl(new C54630l(new C54630l.C54631a(nVar.f153155g))));
                return;
            }
            C53916l<Object> lVar = this.f153109g;
            Result.Companion companion = Result.Companion;
            lVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(nVar.mo75567y())));
        }
    }

    /* renamed from: c14.a$c */
    public static final class C54605c<E> extends C54604b<E> {

        /* renamed from: i */
        public final C32226l<E, C13598b0> f153111i;

        public C54605c(C53916l<Object> lVar, int i, C32226l<? super E, C13598b0> lVar2) {
            super(lVar, i);
            this.f153111i = lVar2;
        }

        /* renamed from: t */
        public C32226l<Throwable, C13598b0> mo75528t(E e) {
            return new C58902t(this.f153111i, e, this.f153109g.getContext());
        }
    }

    /* renamed from: c14.a$d */
    public static class C54606d<E> extends C54648w<E> {

        /* renamed from: g */
        public final C54603a<E> f153112g;

        /* renamed from: h */
        public final C53916l<Boolean> f153113h;

        public C54606d(C54603a<E> aVar, C53916l<? super Boolean> lVar) {
            this.f153112g = aVar;
            this.f153113h = lVar;
        }

        /* renamed from: d */
        public C58872c0 mo75525d(E e, C58891n.C58893b bVar) {
            if (this.f153113h.mo74594U(Boolean.TRUE, (Object) null, mo75528t(e)) == null) {
                return null;
            }
            return C53926n.f151180a;
        }

        /* renamed from: f */
        public void mo75526f(E e) {
            this.f153112g.f153108b = e;
            this.f153113h.mo74592K(C53926n.f151180a);
        }

        /* renamed from: t */
        public C32226l<Throwable, C13598b0> mo75528t(E e) {
            C32226l<E, C13598b0> lVar = this.f153112g.f153107a.f153127d;
            if (lVar != null) {
                return new C58902t(lVar, e, this.f153113h.getContext());
            }
            return null;
        }

        public String toString() {
            return "ReceiveHasNext@" + C53942r0.m60572a(this);
        }

        /* renamed from: u */
        public void mo75527u(C54634n<?> nVar) {
            Object Q = nVar.f153155g == null ? this.f153113h.mo74593Q(Boolean.FALSE, (Object) null) : this.f153113h.mo74595V(nVar.mo75567y());
            if (Q != null) {
                this.f153112g.f153108b = nVar;
                this.f153113h.mo74592K(Q);
            }
        }
    }

    /* renamed from: c14.a$e */
    public final class C54607e extends C53875e {

        /* renamed from: d */
        public final C54648w<?> f153114d;

        public C54607e(C54648w<?> wVar) {
            this.f153114d = wVar;
        }

        /* renamed from: a */
        public void mo74490a(Throwable th) {
            if (this.f153114d.mo75558q()) {
                C54602a.this.getClass();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74490a((Throwable) obj);
            return C13598b0.f38549a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f153114d + ']';
        }
    }

    /* renamed from: c14.a$f */
    public static final class C54608f extends C58891n.C58892a {

        /* renamed from: d */
        public final /* synthetic */ C54602a f153116d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54608f(C58891n nVar, C54602a aVar) {
            super(nVar);
            this.f153116d = aVar;
        }

        /* renamed from: d */
        public Object mo74562d(Object obj) {
            C58891n nVar = (C58891n) obj;
            if (this.f153116d.mo75521y()) {
                return null;
            }
            return C58890m.f168540a;
        }
    }

    @C91590f(mo125468c = "kotlinx.coroutines.channels.AbstractChannel", mo125469f = "AbstractChannel.kt", mo125470l = {633}, mo125471m = "receiveCatching-JP2dKIU")
    /* renamed from: c14.a$g */
    public static final class C54609g extends C66704d {

        /* renamed from: d */
        public /* synthetic */ Object f153117d;

        /* renamed from: e */
        public final /* synthetic */ C54602a<E> f153118e;

        /* renamed from: f */
        public int f153119f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54609g(C54602a<E> aVar, C15601d<? super C54609g> dVar) {
            super(dVar);
            this.f153118e = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f153117d = obj;
            this.f153119f |= Integer.MIN_VALUE;
            Object f = this.f153118e.mo75513f(this);
            return f == C15911a.COROUTINE_SUSPENDED ? f : new C54630l(f);
        }
    }

    public C54602a(C32226l<? super E, C13598b0> lVar) {
        super(lVar);
    }

    /* renamed from: A */
    public void mo75509A(Object obj, C54634n<?> nVar) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((C54610a0) obj).mo75532v(nVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 < size) {
                ((C54610a0) arrayList.get(size)).mo75532v(nVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: B */
    public Object mo75510B() {
        while (true) {
            C54610a0 s = mo75549s();
            if (s == null) {
                return C54611b.f153123d;
            }
            if (s.mo75533w((C58891n.C58893b) null) != null) {
                s.mo75530t();
                return s.mo75531u();
            }
            s.mo75534x();
        }
    }

    /* renamed from: C */
    public final <R> Object mo75511C(int i, C15601d<? super R> dVar) {
        C53921m<? super R> a = C53929o.m60553a(C66447b.m78392b(dVar));
        C54604b bVar = this.f153127d == null ? new C54604b(a, i) : new C54605c(a, i, this.f153127d);
        while (true) {
            if (mo75519v(bVar)) {
                a.mo74599v(new C54607e(bVar));
                break;
            }
            Object B = mo75510B();
            if (B instanceof C54634n) {
                bVar.mo75527u((C54634n) B);
                break;
            } else if (B != C54611b.f153123d) {
                a.mo74596X(bVar.f153110h == 1 ? new C54630l(B) : B, bVar.mo75528t(B));
            }
        }
        return a.mo74608o();
    }

    /* renamed from: b */
    public final void mo75512b(CancellationException cancellationException) {
        if (!mo75516m()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
            }
            mo75522z(mo75540w(cancellationException));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo75513f(wx3.C15601d<? super c14.C54630l<? extends E>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof c14.C54602a.C54609g
            if (r0 == 0) goto L_0x0013
            r0 = r5
            c14.a$g r0 = (c14.C54602a.C54609g) r0
            int r1 = r0.f153119f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f153119f = r1
            goto L_0x0018
        L_0x0013:
            c14.a$g r0 = new c14.a$g
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f153117d
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f153119f
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x0052
        L_0x0027:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L_0x002f:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.mo75510B()
            f14.c0 r2 = c14.C54611b.f153123d
            if (r5 == r2) goto L_0x0049
            boolean r0 = r5 instanceof c14.C54634n
            if (r0 == 0) goto L_0x0048
            c14.n r5 = (c14.C54634n) r5
            java.lang.Throwable r5 = r5.f153155g
            c14.l$a r0 = new c14.l$a
            r0.<init>(r5)
            r5 = r0
        L_0x0048:
            return r5
        L_0x0049:
            r0.f153119f = r3
            java.lang.Object r5 = r4.mo75511C(r3, r0)
            if (r5 != r1) goto L_0x0052
            return r1
        L_0x0052:
            c14.l r5 = (c14.C54630l) r5
            java.lang.Object r5 = r5.f153153a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c14.C54602a.mo75513f(wx3.d):java.lang.Object");
    }

    /* renamed from: g */
    public final Object mo75514g(C15601d<? super E> dVar) {
        Object B = mo75510B();
        return (B == C54611b.f153123d || (B instanceof C54634n)) ? mo75511C(0, dVar) : B;
    }

    public final C54628j<E> iterator() {
        return new C54603a(this);
    }

    /* renamed from: m */
    public boolean mo75516m() {
        return mo75543i() != null && mo75521y();
    }

    /* renamed from: r */
    public C54650y<E> mo75517r() {
        C54650y<E> r = super.mo75517r();
        if (r != null) {
            boolean z = r instanceof C54634n;
        }
        return r;
    }

    /* renamed from: u */
    public final Object mo75518u() {
        Object B = mo75510B();
        return B == C54611b.f153123d ? C54630l.f153152b : B instanceof C54634n ? new C54630l.C54631a(((C54634n) B).f153155g) : B;
    }

    /* renamed from: v */
    public boolean mo75519v(C54648w<? super E> wVar) {
        int s;
        C58891n n;
        if (mo75520x()) {
            C58889l lVar = this.f153128e;
            do {
                n = lVar.mo84080n();
                if (!(!(n instanceof C54610a0))) {
                    return false;
                }
            } while (!n.mo84075h(wVar, lVar));
        } else {
            C58889l lVar2 = this.f153128e;
            C54608f fVar = new C54608f(wVar, this);
            do {
                C58891n n2 = lVar2.mo84080n();
                if (!(!(n2 instanceof C54610a0))) {
                    return false;
                }
                s = n2.mo84083s(wVar, lVar2, fVar);
                if (s != 1) {
                }
            } while (s != 2);
            return false;
        }
        return true;
    }

    /* renamed from: x */
    public abstract boolean mo75520x();

    /* renamed from: y */
    public abstract boolean mo75521y();

    /* renamed from: z */
    public void mo75522z(boolean z) {
        C54634n<?> j = mo75544j();
        if (j != null) {
            Object obj = null;
            while (true) {
                C58891n n = j.mo84080n();
                if (n instanceof C58889l) {
                    mo75509A(obj, j);
                    return;
                } else if (!n.mo75558q()) {
                    ((C58905w) n.mo84078l()).f168559a.mo84081o();
                } else {
                    obj = C31874j.m39570a(obj, (C54610a0) n);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }
}

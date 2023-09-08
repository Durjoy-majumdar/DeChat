package c14;

import a14.C53921m;
import a14.C53926n;
import a14.C53929o;
import a14.C53936p2;
import a14.C53942r0;
import c14.C54630l;
import f14.C31874j;
import f14.C58872c0;
import f14.C58887j0;
import f14.C58889l;
import f14.C58890m;
import f14.C58891n;
import f14.C58903u;
import f14.C58905w;
import f14.C7971b0;
import fy3.C32226l;
import gy3.C24564k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import rx3.C13598b0;
import rx3.C90107a;
import wx3.C15601d;
import xx3.C15911a;
import xx3.C66447b;

/* renamed from: c14.c */
public abstract class C54614c<E> implements C54612b0<E> {

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f153126f = AtomicReferenceFieldUpdater.newUpdater(C54614c.class, Object.class, "onCloseHandler");

    /* renamed from: d */
    public final C32226l<E, C13598b0> f153127d;

    /* renamed from: e */
    public final C58889l f153128e = new C58889l();
    private volatile /* synthetic */ Object onCloseHandler = null;

    /* renamed from: c14.c$a */
    public static final class C54615a<E> extends C54610a0 {

        /* renamed from: g */
        public final E f153129g;

        public C54615a(E e) {
            this.f153129g = e;
        }

        /* renamed from: t */
        public void mo75530t() {
        }

        public String toString() {
            return "SendBuffered@" + C53942r0.m60572a(this) + '(' + this.f153129g + ')';
        }

        /* renamed from: u */
        public Object mo75531u() {
            return this.f153129g;
        }

        /* renamed from: v */
        public void mo75532v(C54634n<?> nVar) {
        }

        /* renamed from: w */
        public C58872c0 mo75533w(C58891n.C58893b bVar) {
            return C53926n.f151180a;
        }
    }

    /* renamed from: c14.c$b */
    public static final class C54616b extends C58891n.C58892a {

        /* renamed from: d */
        public final /* synthetic */ C54614c f153130d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54616b(C58891n nVar, C54614c cVar) {
            super(nVar);
            this.f153130d = cVar;
        }

        /* renamed from: d */
        public Object mo74562d(Object obj) {
            C58891n nVar = (C58891n) obj;
            if (this.f153130d.mo75547n()) {
                return null;
            }
            return C58890m.f168540a;
        }
    }

    public C54614c(C32226l<? super E, C13598b0> lVar) {
        this.f153127d = lVar;
    }

    /* renamed from: a */
    public static final void m61405a(C54614c cVar, C15601d dVar, Object obj, C54634n nVar) {
        C58887j0 a;
        cVar.mo75545k(nVar);
        Throwable th = nVar.f153155g;
        if (th == null) {
            th = new C54636p("Channel was closed");
        }
        C32226l<E, C13598b0> lVar = cVar.f153127d;
        if (lVar == null || (a = C58903u.m68763a(lVar, obj, (C58887j0) null)) == null) {
            Result.Companion companion = Result.Companion;
            dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(th)));
            return;
        }
        C90107a.m112735a(a, th);
        Result.Companion companion2 = Result.Companion;
        dVar.resumeWith(Result.m168114constructorimpl(ResultKt.createFailure(a)));
    }

    /* renamed from: c */
    public Object mo75541c(C54610a0 a0Var) {
        boolean z;
        C58891n n;
        if (mo75546l()) {
            C58889l lVar = this.f153128e;
            do {
                n = lVar.mo84080n();
                if (n instanceof C54650y) {
                    return n;
                }
            } while (!n.mo84075h(a0Var, lVar));
            return null;
        }
        C58889l lVar2 = this.f153128e;
        C54616b bVar = new C54616b(a0Var, this);
        while (true) {
            C58891n n2 = lVar2.mo84080n();
            if (!(n2 instanceof C54650y)) {
                int s = n2.mo84083s(a0Var, lVar2, bVar);
                z = true;
                if (s != 1) {
                    if (s == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return n2;
            }
        }
        if (!z) {
            return C54611b.f153124e;
        }
        return null;
    }

    /* renamed from: d */
    public String mo75542d() {
        return "";
    }

    /* renamed from: h */
    public final boolean mo75535h() {
        return mo75544j() != null;
    }

    /* renamed from: i */
    public final C54634n<?> mo75543i() {
        C58891n m = this.f153128e.mo84079m();
        C54634n<?> nVar = m instanceof C54634n ? (C54634n) m : null;
        if (nVar == null) {
            return null;
        }
        mo75545k(nVar);
        return nVar;
    }

    /* renamed from: j */
    public final C54634n<?> mo75544j() {
        C58891n n = this.f153128e.mo84080n();
        C54634n<?> nVar = n instanceof C54634n ? (C54634n) n : null;
        if (nVar == null) {
            return null;
        }
        mo75545k(nVar);
        return nVar;
    }

    /* renamed from: k */
    public final void mo75545k(C54634n<?> nVar) {
        Object obj = null;
        while (true) {
            C58891n n = nVar.mo84080n();
            C54648w wVar = n instanceof C54648w ? (C54648w) n : null;
            if (wVar == null) {
                break;
            } else if (!wVar.mo75558q()) {
                ((C58905w) wVar.mo84078l()).f168559a.mo84081o();
            } else {
                obj = C31874j.m39570a(obj, wVar);
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((C54648w) obj).mo75527u(nVar);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((C54648w) arrayList.get(size)).mo75527u(nVar);
        }
    }

    /* renamed from: l */
    public abstract boolean mo75546l();

    /* renamed from: n */
    public abstract boolean mo75547n();

    /* renamed from: o */
    public final Object mo75536o(E e, C15601d<? super C13598b0> dVar) {
        if (mo75548q(e) == C54611b.f153121b) {
            return C13598b0.f38549a;
        }
        C53921m<? super C13598b0> a = C53929o.m60553a(C66447b.m78392b(dVar));
        while (true) {
            if (!(this.f153128e.mo84079m() instanceof C54650y) && mo75547n()) {
                C54610a0 c0Var = this.f153127d == null ? new C54617c0(e, a) : new C54620d0(e, a, this.f153127d);
                Object c = mo75541c(c0Var);
                if (c == null) {
                    a.mo74599v(new C53936p2(c0Var));
                    break;
                } else if (c instanceof C54634n) {
                    m61405a(this, a, e, (C54634n) c);
                    break;
                } else if (c != C54611b.f153124e && !(c instanceof C54648w)) {
                    throw new IllegalStateException(("enqueueSend returned " + c).toString());
                }
            }
            Object q = mo75548q(e);
            if (q == C54611b.f153121b) {
                Result.Companion companion = Result.Companion;
                a.resumeWith(Result.m168114constructorimpl(C13598b0.f38549a));
                break;
            } else if (q != C54611b.f153122c) {
                if (q instanceof C54634n) {
                    m61405a(this, a, e, (C54634n) q);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + q).toString());
                }
            }
        }
        Object o = a.mo74608o();
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        if (o != aVar) {
            o = C13598b0.f38549a;
        }
        return o == aVar ? o : C13598b0.f38549a;
    }

    public boolean offer(E e) {
        C58887j0 a;
        try {
            Object t = mo75539t(e);
            if (!(t instanceof C54630l.C54632b)) {
                return true;
            }
            C54630l.C54631a aVar = t instanceof C54630l.C54631a ? (C54630l.C54631a) t : null;
            Throwable th = aVar != null ? aVar.f153154a : null;
            if (th == null) {
                return false;
            }
            int i = C7971b0.f26651a;
            throw th;
        } catch (Throwable th4) {
            C32226l<E, C13598b0> lVar = this.f153127d;
            if (lVar == null || (a = C58903u.m68763a(lVar, e, (C58887j0) null)) == null) {
                throw th4;
            }
            C90107a.m112735a(a, th4);
            throw a;
        }
    }

    /* renamed from: p */
    public void mo75538p(C32226l<? super Throwable, C13598b0> lVar) {
        boolean z;
        boolean z2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153126f;
        while (true) {
            z = false;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, (Object) null, lVar)) {
                if (atomicReferenceFieldUpdater.get(this) != null) {
                    z2 = false;
                    break;
                }
            } else {
                z2 = true;
                break;
            }
        }
        if (!z2) {
            Object obj = this.onCloseHandler;
            if (obj == C54611b.f153125f) {
                throw new IllegalStateException("Another handler was already registered and successfully invoked");
            }
            throw new IllegalStateException("Another handler was already registered: " + obj);
        }
        C54634n<?> j = mo75544j();
        if (j != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f153126f;
            C58872c0 c0Var = C54611b.f153125f;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, lVar, c0Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != lVar) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                lVar.invoke(j.f153155g);
            }
        }
    }

    /* renamed from: q */
    public Object mo75548q(E e) {
        C54650y r;
        do {
            r = mo75517r();
            if (r == null) {
                return C54611b.f153122c;
            }
        } while (r.mo75525d(e, (C58891n.C58893b) null) == null);
        r.mo75526f(e);
        return r.mo75566c();
    }

    /* renamed from: r */
    public C54650y<E> mo75517r() {
        C58891n nVar;
        C58891n r;
        C58889l lVar = this.f153128e;
        while (true) {
            nVar = (C58891n) lVar.mo84078l();
            if (nVar != lVar && (nVar instanceof C54650y)) {
                if (((((C54650y) nVar) instanceof C54634n) && !nVar.mo84074p()) || (r = nVar.mo84082r()) == null) {
                    break;
                }
                r.mo84081o();
            }
        }
        nVar = null;
        return (C54650y) nVar;
    }

    /* renamed from: s */
    public final C54610a0 mo75549s() {
        C58891n nVar;
        C58891n r;
        C58889l lVar = this.f153128e;
        while (true) {
            nVar = (C58891n) lVar.mo84078l();
            if (nVar != lVar && (nVar instanceof C54610a0)) {
                if (((((C54610a0) nVar) instanceof C54634n) && !nVar.mo84074p()) || (r = nVar.mo84082r()) == null) {
                    break;
                }
                r.mo84081o();
            }
        }
        nVar = null;
        return (C54610a0) nVar;
    }

    /* renamed from: t */
    public final Object mo75539t(E e) {
        C54630l.C54631a aVar;
        Object q = mo75548q(e);
        if (q == C54611b.f153121b) {
            return C13598b0.f38549a;
        }
        if (q == C54611b.f153122c) {
            C54634n<?> j = mo75544j();
            if (j == null) {
                return C54630l.f153152b;
            }
            mo75545k(j);
            Throwable th = j.f153155g;
            if (th == null) {
                th = new C54636p("Channel was closed");
            }
            aVar = new C54630l.C54631a(th);
        } else if (q instanceof C54634n) {
            C54634n nVar = (C54634n) q;
            mo75545k(nVar);
            Throwable th4 = nVar.f153155g;
            if (th4 == null) {
                th4 = new C54636p("Channel was closed");
            }
            aVar = new C54630l.C54631a(th4);
        } else {
            throw new IllegalStateException(("trySend returned " + q).toString());
        }
        return aVar;
    }

    public String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(C53942r0.m60572a(this));
        sb.append('{');
        C58891n m = this.f153128e.mo84079m();
        if (m == this.f153128e) {
            str = "EmptyQueue";
        } else {
            if (m instanceof C54634n) {
                str2 = m.toString();
            } else if (m instanceof C54648w) {
                str2 = "ReceiveQueued";
            } else if (m instanceof C54610a0) {
                str2 = "SendQueued";
            } else {
                str2 = "UNEXPECTED:" + m;
            }
            C58891n n = this.f153128e.mo84080n();
            if (n != m) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str2);
                sb4.append(",queueSize=");
                C58889l lVar = this.f153128e;
                int i = 0;
                for (C58891n nVar = (C58891n) lVar.mo84078l(); !C87412m.m108589b(nVar, lVar); nVar = nVar.mo84079m()) {
                    if (nVar instanceof C58891n) {
                        i++;
                    }
                }
                sb4.append(i);
                str = sb4.toString();
                if (n instanceof C54634n) {
                    str = str + ",closedForSend=" + n;
                }
            } else {
                str = str2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(mo75542d());
        return sb.toString();
    }

    /* renamed from: w */
    public boolean mo75540w(Throwable th) {
        boolean z;
        boolean z2;
        Object obj;
        C58872c0 c0Var;
        C54634n nVar = new C54634n(th);
        C58889l lVar = this.f153128e;
        while (true) {
            C58891n n = lVar.mo84080n();
            z = false;
            if (!(n instanceof C54634n)) {
                if (n.mo84075h(nVar, lVar)) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (!z2) {
            nVar = (C54634n) this.f153128e.mo84080n();
        }
        mo75545k(nVar);
        if (!(!z2 || (obj = this.onCloseHandler) == null || obj == (c0Var = C54611b.f153125f))) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f153126f;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                C24564k0.m30741e(obj, 1);
                ((C32226l) obj).invoke(th);
            }
        }
        return z2;
    }
}

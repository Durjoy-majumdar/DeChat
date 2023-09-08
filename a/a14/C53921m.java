package a14;

import a14.C53973z1;
import f14.C58872c0;
import f14.C58883h;
import fy3.C32226l;
import gy3.C8480h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import rx3.C13598b0;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66705e;

/* renamed from: a14.m */
public class C53921m<T> extends C53853a1<T> implements C53916l<T>, C66705e {

    /* renamed from: j */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f151170j = AtomicIntegerFieldUpdater.newUpdater(C53921m.class, "_decision");

    /* renamed from: n */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f151171n = AtomicReferenceFieldUpdater.newUpdater(C53921m.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision = 0;
    private volatile /* synthetic */ Object _state = C53856b.f151098d;

    /* renamed from: g */
    public final C15601d<T> f151172g;

    /* renamed from: h */
    public final C66212f f151173h;

    /* renamed from: i */
    public C53883f1 f151174i;

    public C53921m(C15601d<? super T> dVar, int i) {
        super(i);
        this.f151172g = dVar;
        this.f151173h = dVar.getContext();
    }

    /* renamed from: G */
    public boolean mo74591G(Throwable th) {
        Object obj;
        boolean z;
        boolean z2;
        do {
            obj = this._state;
            z = false;
            if (obj instanceof C53928n2) {
                z2 = obj instanceof C53904j;
                C53933p pVar = new C53933p(this, th, z2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151171n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, pVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                return false;
            }
        } while (!z);
        C53904j jVar = z2 ? (C53904j) obj : null;
        if (jVar != null) {
            mo74603i(jVar, th);
        }
        if (!mo74611r()) {
            mo74606l();
        }
        mo74607m(this.f151095f);
        return true;
    }

    /* renamed from: K */
    public void mo74592K(Object obj) {
        mo74607m(this.f151095f);
    }

    /* renamed from: Q */
    public Object mo74593Q(T t, Object obj) {
        return mo74617z(t, obj, (C32226l<? super Throwable, C13598b0>) null);
    }

    /* renamed from: U */
    public Object mo74594U(T t, Object obj, C32226l<? super Throwable, C13598b0> lVar) {
        return mo74617z(t, obj, lVar);
    }

    /* renamed from: V */
    public Object mo74595V(Throwable th) {
        return mo74617z(new C53969y(th, false, 2, (C8480h) null), (Object) null, (C32226l<? super Throwable, C13598b0>) null);
    }

    /* renamed from: X */
    public void mo74596X(T t, C32226l<? super Throwable, C13598b0> lVar) {
        mo74615w(t, this.f151095f, lVar);
    }

    /* renamed from: a */
    public boolean mo74597a() {
        return this._state instanceof C53928n2;
    }

    /* renamed from: b */
    public void mo74475b(Object obj, Throwable th) {
        Throwable th4 = th;
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof C53928n2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C53969y)) {
                boolean z = false;
                if (obj2 instanceof C53964x) {
                    C53964x xVar = (C53964x) obj2;
                    if (!(xVar.f151206e != null)) {
                        C53964x a = C53964x.m60605a(xVar, (Object) null, (C53904j) null, (C32226l) null, (Object) null, th, 15, (Object) null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151171n;
                        while (true) {
                            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, a)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            C53904j jVar = xVar.f151203b;
                            if (jVar != null) {
                                mo74603i(jVar, th4);
                            }
                            C32226l<Throwable, C13598b0> lVar = xVar.f151204c;
                            if (lVar != null) {
                                mo74605k(lVar, th4);
                                return;
                            }
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f151171n;
                    C53964x xVar2 = new C53964x(obj2, (C53904j) null, (C32226l) null, (Object) null, th, 14, (C8480h) null);
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, xVar2)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public boolean mo74598c() {
        return !(this._state instanceof C53928n2);
    }

    /* renamed from: d */
    public final C15601d<T> mo74476d() {
        return this.f151172g;
    }

    /* renamed from: e */
    public Throwable mo74477e(Object obj) {
        Throwable e = super.mo74477e(obj);
        if (e != null) {
            return e;
        }
        return null;
    }

    /* renamed from: f */
    public <T> T mo74478f(Object obj) {
        return obj instanceof C53964x ? ((C53964x) obj).f151202a : obj;
    }

    public C66705e getCallerFrame() {
        C15601d<T> dVar = this.f151172g;
        if (dVar instanceof C66705e) {
            return (C66705e) dVar;
        }
        return null;
    }

    public C66212f getContext() {
        return this.f151173h;
    }

    /* renamed from: h */
    public Object mo74480h() {
        return this._state;
    }

    /* renamed from: i */
    public final void mo74603i(C53904j jVar, Throwable th) {
        try {
            jVar.mo74490a(th);
        } catch (Throwable th4) {
            C66212f fVar = this.f151173h;
            C53918l0.m60515a(fVar, new C53857b0("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    /* renamed from: j */
    public final void mo74604j(C32226l<? super Throwable, C13598b0> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th4) {
            C66212f fVar = this.f151173h;
            C53918l0.m60515a(fVar, new C53857b0("Exception in invokeOnCancellation handler for " + this, th4));
        }
    }

    /* renamed from: k */
    public final void mo74605k(C32226l<? super Throwable, C13598b0> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th4) {
            C66212f fVar = this.f151173h;
            C53918l0.m60515a(fVar, new C53857b0("Exception in resume onCancellation handler for " + this, th4));
        }
    }

    /* renamed from: l */
    public final void mo74606l() {
        C53883f1 f1Var = this.f151174i;
        if (f1Var != null) {
            f1Var.dispose();
            this.f151174i = C53925m2.f151179d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74607m(int r7) {
        /*
            r6 = this;
        L_0x0000:
            int r0 = r6._decision
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 != r3) goto L_0x000b
            r0 = 0
            goto L_0x0020
        L_0x000b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x0017:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f151170j
            boolean r0 = r0.compareAndSet(r6, r2, r1)
            if (r0 == 0) goto L_0x0000
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x0023
            return
        L_0x0023:
            wx3.d<T> r0 = r6.f151172g
            r4 = 4
            if (r7 != r4) goto L_0x002a
            r4 = 1
            goto L_0x002b
        L_0x002a:
            r4 = 0
        L_0x002b:
            if (r4 != 0) goto L_0x0082
            boolean r5 = r0 instanceof f14.C58883h
            if (r5 == 0) goto L_0x0082
            if (r7 == r3) goto L_0x0038
            if (r7 != r1) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r7 = 0
            goto L_0x0039
        L_0x0038:
            r7 = 1
        L_0x0039:
            int r5 = r6.f151095f
            if (r5 == r3) goto L_0x003f
            if (r5 != r1) goto L_0x0040
        L_0x003f:
            r2 = 1
        L_0x0040:
            if (r7 != r2) goto L_0x0082
            r7 = r0
            f14.h r7 = (f14.C58883h) r7
            a14.h0 r7 = r7.f168525g
            wx3.f r0 = r0.getContext()
            boolean r1 = r7.mo74565h0(r0)
            if (r1 == 0) goto L_0x0055
            r7.mo74497S(r0, r6)
            goto L_0x0085
        L_0x0055:
            a14.x2 r7 = a14.C53968x2.f151211a
            a14.j1 r7 = r7.mo74642a()
            boolean r0 = r7.mo74572l0()
            if (r0 == 0) goto L_0x0065
            r7.mo74570j0(r6)
            goto L_0x0085
        L_0x0065:
            r7.mo74571k0(r3)
            wx3.d<T> r0 = r6.f151172g     // Catch:{ all -> 0x0074 }
            a14.C53858b1.m60372a(r6, r0, r3)     // Catch:{ all -> 0x0074 }
        L_0x006d:
            boolean r0 = r7.mo74574o0()     // Catch:{ all -> 0x0074 }
            if (r0 != 0) goto L_0x006d
            goto L_0x0079
        L_0x0074:
            r0 = move-exception
            r1 = 0
            r6.mo74479g(r0, r1)     // Catch:{ all -> 0x007d }
        L_0x0079:
            r7.mo74569i0(r3)
            goto L_0x0085
        L_0x007d:
            r0 = move-exception
            r7.mo74569i0(r3)
            throw r0
        L_0x0082:
            a14.C53858b1.m60372a(r6, r0, r4)
        L_0x0085:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53921m.mo74607m(int):void");
    }

    /* renamed from: n */
    public Throwable mo74550n(C53973z1 z1Var) {
        return z1Var.mo74526Z();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [wx3.d<T>] */
    /* JADX WARNING: type inference failed for: r0v9, types: [wx3.d<T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74608o() {
        /*
            r6 = this;
            boolean r0 = r6.mo74611r()
        L_0x0004:
            int r1 = r6._decision
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x000f
            r1 = 0
            goto L_0x0024
        L_0x000f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x001b:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f151170j
            boolean r1 = r1.compareAndSet(r6, r3, r4)
            if (r1 == 0) goto L_0x0004
            r1 = 1
        L_0x0024:
            r5 = 0
            if (r1 == 0) goto L_0x004b
            a14.f1 r1 = r6.f151174i
            if (r1 != 0) goto L_0x002e
            r6.mo74610q()
        L_0x002e:
            if (r0 == 0) goto L_0x0048
            wx3.d<T> r0 = r6.f151172g
            boolean r1 = r0 instanceof f14.C58883h
            if (r1 == 0) goto L_0x0039
            r5 = r0
            f14.h r5 = (f14.C58883h) r5
        L_0x0039:
            if (r5 == 0) goto L_0x0048
            java.lang.Throwable r0 = r5.mo84071m(r6)
            if (r0 != 0) goto L_0x0042
            goto L_0x0048
        L_0x0042:
            r6.mo74606l()
            r6.mo74591G(r0)
        L_0x0048:
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            return r0
        L_0x004b:
            if (r0 == 0) goto L_0x0065
            wx3.d<T> r0 = r6.f151172g
            boolean r1 = r0 instanceof f14.C58883h
            if (r1 == 0) goto L_0x0056
            r5 = r0
            f14.h r5 = (f14.C58883h) r5
        L_0x0056:
            if (r5 == 0) goto L_0x0065
            java.lang.Throwable r0 = r5.mo84071m(r6)
            if (r0 != 0) goto L_0x005f
            goto L_0x0065
        L_0x005f:
            r6.mo74606l()
            r6.mo74591G(r0)
        L_0x0065:
            java.lang.Object r0 = r6._state
            boolean r1 = r0 instanceof a14.C53969y
            if (r1 != 0) goto L_0x0094
            int r1 = r6.f151095f
            if (r1 == r4) goto L_0x0071
            if (r1 != r2) goto L_0x0072
        L_0x0071:
            r3 = 1
        L_0x0072:
            if (r3 == 0) goto L_0x008f
            wx3.f r1 = r6.f151173h
            a14.z1$b r2 = a14.C53973z1.C0004b.f3d
            wx3.f$b r1 = r1.get(r2)
            a14.z1 r1 = (a14.C53973z1) r1
            if (r1 == 0) goto L_0x008f
            boolean r2 = r1.mo74466a()
            if (r2 == 0) goto L_0x0087
            goto L_0x008f
        L_0x0087:
            java.util.concurrent.CancellationException r1 = r1.mo74526Z()
            r6.mo74475b(r0, r1)
            throw r1
        L_0x008f:
            java.lang.Object r0 = r6.mo74478f(r0)
            return r0
        L_0x0094:
            a14.y r0 = (a14.C53969y) r0
            java.lang.Throwable r0 = r0.f151214a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53921m.mo74608o():java.lang.Object");
    }

    /* renamed from: p */
    public void mo74609p() {
        C53883f1 q = mo74610q();
        if (q != null && mo74598c()) {
            q.dispose();
            this.f151174i = C53925m2.f151179d;
        }
    }

    /* renamed from: q */
    public final C53883f1 mo74610q() {
        C66212f fVar = this.f151173h;
        int i = C53973z1.f151221b0;
        C53973z1 z1Var = (C53973z1) fVar.get(C53973z1.C0004b.f3d);
        if (z1Var == null) {
            return null;
        }
        C53883f1 b = C53973z1.C53974a.m60624b(z1Var, true, false, new C53937q(this), 2, (Object) null);
        this.f151174i = b;
        return b;
    }

    /* renamed from: r */
    public final boolean mo74611r() {
        return (this.f151095f == 2) && ((C58883h) this.f151172g).mo84068j();
    }

    public void resumeWith(Object obj) {
        Throwable r0 = Result.m168117exceptionOrNullimpl(obj);
        if (r0 != null) {
            obj = new C53969y(r0, false, 2, (C8480h) null);
        }
        mo74615w(obj, this.f151095f, (C32226l<? super Throwable, C13598b0>) null);
    }

    /* renamed from: s */
    public final void mo74612s(C32226l<? super Throwable, C13598b0> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    /* renamed from: t */
    public String mo74551t() {
        return "CancellableContinuation";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo74551t());
        sb.append('(');
        sb.append(C53942r0.m60573b(this.f151172g));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof C53928n2 ? "Active" : obj instanceof C53933p ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(C53942r0.m60572a(this));
        return sb.toString();
    }

    /* renamed from: u */
    public final boolean mo74614u() {
        Object obj = this._state;
        if (!(obj instanceof C53964x) || ((C53964x) obj).f151205d == null) {
            this._decision = 0;
            this._state = C53856b.f151098d;
            return true;
        }
        mo74606l();
        return false;
    }

    /* renamed from: v */
    public void mo74599v(C32226l<? super Throwable, C13598b0> lVar) {
        C53904j w1Var = lVar instanceof C53904j ? (C53904j) lVar : new C53962w1(lVar);
        while (true) {
            Object obj = this._state;
            boolean z = false;
            if (obj instanceof C53856b) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151171n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, w1Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else {
                Throwable th = null;
                if (!(obj instanceof C53904j)) {
                    boolean z2 = obj instanceof C53969y;
                    if (z2) {
                        C53969y yVar = (C53969y) obj;
                        yVar.getClass();
                        if (!C53969y.f151213b.compareAndSet(yVar, 0, 1)) {
                            mo74612s(lVar, obj);
                            throw null;
                        } else if (obj instanceof C53933p) {
                            if (!z2) {
                                yVar = null;
                            }
                            if (yVar != null) {
                                th = yVar.f151214a;
                            }
                            mo74604j(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof C53964x) {
                        C53964x xVar = (C53964x) obj;
                        if (xVar.f151203b != null) {
                            mo74612s(lVar, obj);
                            throw null;
                        } else if (!(w1Var instanceof C53875e)) {
                            Throwable th4 = xVar.f151206e;
                            if (th4 != null) {
                                mo74604j(lVar, th4);
                                return;
                            }
                            C53964x a = C53964x.m60605a(xVar, (Object) null, w1Var, (C32226l) null, (Object) null, (Throwable) null, 29, (Object) null);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f151171n;
                            while (true) {
                                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, a)) {
                                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                                        break;
                                    }
                                } else {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(w1Var instanceof C53875e)) {
                        C53964x xVar2 = new C53964x(obj, w1Var, (C32226l) null, (Object) null, (Throwable) null, 28, (C8480h) null);
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f151171n;
                        while (true) {
                            if (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, xVar2)) {
                                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                                    break;
                                }
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    mo74612s(lVar, obj);
                    throw null;
                }
            }
        }
    }

    /* renamed from: w */
    public final void mo74615w(Object obj, int i, C32226l<? super Throwable, C13598b0> lVar) {
        boolean z;
        do {
            Object obj2 = this._state;
            z = false;
            if (obj2 instanceof C53928n2) {
                Object x = mo74616x((C53928n2) obj2, obj, i, lVar, (Object) null);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151171n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, x)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else {
                if (obj2 instanceof C53933p) {
                    C53933p pVar = (C53933p) obj2;
                    pVar.getClass();
                    if (C53933p.f151182c.compareAndSet(pVar, 0, 1)) {
                        if (lVar != null) {
                            mo74605k(lVar, pVar.f151214a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
        } while (!z);
        if (!mo74611r()) {
            mo74606l();
        }
        mo74607m(i);
    }

    /* renamed from: x */
    public final Object mo74616x(C53928n2 n2Var, Object obj, int i, C32226l<? super Throwable, C13598b0> lVar, Object obj2) {
        if (obj instanceof C53969y) {
            return obj;
        }
        boolean z = true;
        if (!(i == 1 || i == 2)) {
            z = false;
        }
        if (!z && obj2 == null) {
            return obj;
        }
        if (lVar == null && ((!(n2Var instanceof C53904j) || (n2Var instanceof C53875e)) && obj2 == null)) {
            return obj;
        }
        return new C53964x(obj, n2Var instanceof C53904j ? (C53904j) n2Var : null, lVar, obj2, (Throwable) null, 16, (C8480h) null);
    }

    /* renamed from: y */
    public void mo74600y(C53896h0 h0Var, T t) {
        C15601d<T> dVar = this.f151172g;
        C58883h hVar = dVar instanceof C58883h ? (C58883h) dVar : null;
        mo74615w(t, (hVar != null ? hVar.f168525g : null) == h0Var ? 4 : this.f151095f, (C32226l<? super Throwable, C13598b0>) null);
    }

    /* renamed from: z */
    public final C58872c0 mo74617z(Object obj, Object obj2, C32226l<? super Throwable, C13598b0> lVar) {
        boolean z;
        do {
            Object obj3 = this._state;
            if (obj3 instanceof C53928n2) {
                Object x = mo74616x((C53928n2) obj3, obj, this.f151095f, lVar, obj2);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151171n;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, x)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        z = true;
                        continue;
                        break;
                    }
                }
            } else if (!(obj3 instanceof C53964x) || obj2 == null || ((C53964x) obj3).f151205d != obj2) {
                return null;
            } else {
                return C53926n.f151180a;
            }
        } while (!z);
        if (!mo74611r()) {
            mo74606l();
        }
        return C53926n.f151180a;
    }
}

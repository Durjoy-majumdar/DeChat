package a14;

import a14.C53973z1;
import f14.C58891n;
import f14.C58904v;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx3.C13598b0;
import rx3.C90107a;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C66447b;

/* renamed from: a14.f2 */
public class C53884f2 implements C53973z1, C53948t, C53932o2 {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f151129d = AtomicReferenceFieldUpdater.newUpdater(C53884f2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* renamed from: a14.f2$a */
    public static final class C53885a<T> extends C53921m<T> {

        /* renamed from: o */
        public final C53884f2 f151130o;

        public C53885a(C15601d<? super T> dVar, C53884f2 f2Var) {
            super(dVar, 1);
            this.f151130o = f2Var;
        }

        /* renamed from: n */
        public Throwable mo74550n(C53973z1 z1Var) {
            Throwable d;
            Object d0 = this.f151130o.mo74531d0();
            return (!(d0 instanceof C53887c) || (d = ((C53887c) d0).mo74553d()) == null) ? d0 instanceof C53969y ? ((C53969y) d0).f151214a : z1Var.mo74526Z() : d;
        }

        /* renamed from: t */
        public String mo74551t() {
            return "AwaitContinuation";
        }
    }

    /* renamed from: a14.f2$b */
    public static final class C53886b extends C53879e2 {

        /* renamed from: h */
        public final C53884f2 f151131h;

        /* renamed from: i */
        public final C53887c f151132i;

        /* renamed from: j */
        public final C53945s f151133j;

        /* renamed from: n */
        public final Object f151134n;

        public C53886b(C53884f2 f2Var, C53887c cVar, C53945s sVar, Object obj) {
            this.f151131h = f2Var;
            this.f151132i = cVar;
            this.f151133j = sVar;
            this.f151134n = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74474t((Throwable) obj);
            return C13598b0.f38549a;
        }

        /* renamed from: t */
        public void mo74474t(Throwable th) {
            C53884f2 f2Var = this.f151131h;
            C53887c cVar = this.f151132i;
            C53945s sVar = this.f151133j;
            Object obj = this.f151134n;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C53884f2.f151129d;
            C53945s m0 = f2Var.mo74539m0(sVar);
            if (m0 == null || !f2Var.mo74548u0(cVar, m0, obj)) {
                f2Var.mo74511x(f2Var.mo74522P(cVar, obj));
            }
        }
    }

    /* renamed from: a14.f2$c */
    public static final class C53887c implements C53954u1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: d */
        public final C53920l2 f151135d;

        public C53887c(C53920l2 l2Var, boolean z, Throwable th) {
            this.f151135d = l2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: a */
        public boolean mo74502a() {
            return ((Throwable) this._rootCause) == null;
        }

        /* renamed from: b */
        public C53920l2 mo74503b() {
            return this.f151135d;
        }

        /* renamed from: c */
        public final void mo74552c(Throwable th) {
            Throwable th4 = (Throwable) this._rootCause;
            if (th4 == null) {
                this._rootCause = th;
            } else if (th != th4) {
                Object obj = this._exceptionsHolder;
                if (obj == null) {
                    this._exceptionsHolder = th;
                } else if (obj instanceof Throwable) {
                    if (th != obj) {
                        ArrayList arrayList = new ArrayList(4);
                        arrayList.add(obj);
                        arrayList.add(th);
                        this._exceptionsHolder = arrayList;
                    }
                } else if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th);
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
        }

        /* renamed from: d */
        public final Throwable mo74553d() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: e */
        public final boolean mo74554e() {
            return ((Throwable) this._rootCause) != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [boolean, int] */
        /* renamed from: f */
        public final boolean mo74555f() {
            return this._isCompleting;
        }

        /* renamed from: g */
        public final boolean mo74556g() {
            return this._exceptionsHolder == C53899h2.f151149e;
        }

        /* renamed from: h */
        public final List<Throwable> mo74557h(Throwable th) {
            ArrayList arrayList;
            Object obj = this._exceptionsHolder;
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            Throwable th4 = (Throwable) this._rootCause;
            if (th4 != null) {
                arrayList.add(0, th4);
            }
            if (th != null && !C87412m.m108589b(th, th4)) {
                arrayList.add(th);
            }
            this._exceptionsHolder = C53899h2.f151149e;
            return arrayList;
        }

        /* renamed from: i */
        public final void mo74558i(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* JADX WARNING: type inference failed for: r1v3, types: [boolean, int] */
        public String toString() {
            return "Finishing[cancelling=" + mo74554e() + ", completing=" + this._isCompleting + ", rootCause=" + ((Throwable) this._rootCause) + ", exceptions=" + this._exceptionsHolder + ", list=" + this.f151135d + ']';
        }
    }

    public C53884f2(boolean z) {
        this._state = z ? C53899h2.f151151g : C53899h2.f151150f;
        this._parentHandle = null;
    }

    /* renamed from: B */
    public final void mo74512B(C53932o2 o2Var) {
        mo74513C(o2Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00f8, code lost:
        r0 = r11;
     */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00c5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0040 A[SYNTHETIC] */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo74513C(java.lang.Object r11) {
        /*
            r10 = this;
            f14.c0 r0 = a14.C53899h2.f151145a
            boolean r1 = r10.mo74496W()
            r2 = 0
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x003b
        L_0x000c:
            java.lang.Object r0 = r10.mo74531d0()
            boolean r1 = r0 instanceof a14.C53954u1
            if (r1 == 0) goto L_0x0034
            boolean r1 = r0 instanceof a14.C53884f2.C53887c
            if (r1 == 0) goto L_0x0022
            r1 = r0
            a14.f2$c r1 = (a14.C53884f2.C53887c) r1
            boolean r1 = r1.mo74555f()
            if (r1 == 0) goto L_0x0022
            goto L_0x0034
        L_0x0022:
            a14.y r1 = new a14.y
            java.lang.Throwable r6 = r10.mo74520N(r11)
            r1.<init>(r6, r4, r3, r2)
            java.lang.Object r0 = r10.mo74546t0(r0, r1)
            f14.c0 r1 = a14.C53899h2.f151147c
            if (r0 == r1) goto L_0x000c
            goto L_0x0036
        L_0x0034:
            f14.c0 r0 = a14.C53899h2.f151145a
        L_0x0036:
            f14.c0 r1 = a14.C53899h2.f151146b
            if (r0 != r1) goto L_0x003b
            return r5
        L_0x003b:
            f14.c0 r1 = a14.C53899h2.f151145a
            if (r0 != r1) goto L_0x00f9
            r0 = r2
        L_0x0040:
            java.lang.Object r1 = r10.mo74531d0()
            boolean r6 = r1 instanceof a14.C53884f2.C53887c
            if (r6 == 0) goto L_0x008b
            monitor-enter(r1)
            r3 = r1
            a14.f2$c r3 = (a14.C53884f2.C53887c) r3     // Catch:{ all -> 0x0088 }
            boolean r3 = r3.mo74556g()     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0057
            f14.c0 r11 = a14.C53899h2.f151148d     // Catch:{ all -> 0x0088 }
            monitor-exit(r1)
            goto L_0x00f8
        L_0x0057:
            r3 = r1
            a14.f2$c r3 = (a14.C53884f2.C53887c) r3     // Catch:{ all -> 0x0088 }
            boolean r3 = r3.mo74554e()     // Catch:{ all -> 0x0088 }
            if (r11 != 0) goto L_0x0062
            if (r3 != 0) goto L_0x006e
        L_0x0062:
            if (r0 != 0) goto L_0x0068
            java.lang.Throwable r0 = r10.mo74520N(r11)     // Catch:{ all -> 0x0088 }
        L_0x0068:
            r11 = r1
            a14.f2$c r11 = (a14.C53884f2.C53887c) r11     // Catch:{ all -> 0x0088 }
            r11.mo74552c(r0)     // Catch:{ all -> 0x0088 }
        L_0x006e:
            r11 = r1
            a14.f2$c r11 = (a14.C53884f2.C53887c) r11     // Catch:{ all -> 0x0088 }
            java.lang.Throwable r11 = r11.mo74553d()     // Catch:{ all -> 0x0088 }
            r0 = r3 ^ 1
            if (r0 == 0) goto L_0x007a
            r2 = r11
        L_0x007a:
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0084
            a14.f2$c r1 = (a14.C53884f2.C53887c) r1
            a14.l2 r11 = r1.f151135d
            r10.mo74540n0(r11, r2)
        L_0x0084:
            f14.c0 r11 = a14.C53899h2.f151145a
            goto L_0x00f8
        L_0x0088:
            r11 = move-exception
            monitor-exit(r1)
            throw r11
        L_0x008b:
            boolean r6 = r1 instanceof a14.C53954u1
            if (r6 == 0) goto L_0x00f6
            if (r0 != 0) goto L_0x0095
            java.lang.Throwable r0 = r10.mo74520N(r11)
        L_0x0095:
            r6 = r1
            a14.u1 r6 = (a14.C53954u1) r6
            boolean r7 = r6.mo74502a()
            if (r7 == 0) goto L_0x00c8
            a14.l2 r7 = r10.mo74525Y(r6)
            if (r7 != 0) goto L_0x00a5
            goto L_0x00bd
        L_0x00a5:
            a14.f2$c r8 = new a14.f2$c
            r8.<init>(r7, r4, r0)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f151129d
        L_0x00ac:
            boolean r1 = r9.compareAndSet(r10, r6, r8)
            if (r1 == 0) goto L_0x00b4
            r1 = 1
            goto L_0x00bb
        L_0x00b4:
            java.lang.Object r1 = r9.get(r10)
            if (r1 == r6) goto L_0x00ac
            r1 = 0
        L_0x00bb:
            if (r1 != 0) goto L_0x00bf
        L_0x00bd:
            r1 = 0
            goto L_0x00c3
        L_0x00bf:
            r10.mo74540n0(r7, r0)
            r1 = 1
        L_0x00c3:
            if (r1 == 0) goto L_0x0040
            f14.c0 r11 = a14.C53899h2.f151145a
            goto L_0x00f8
        L_0x00c8:
            a14.y r6 = new a14.y
            r6.<init>(r0, r4, r3, r2)
            java.lang.Object r6 = r10.mo74546t0(r1, r6)
            f14.c0 r7 = a14.C53899h2.f151145a
            if (r6 == r7) goto L_0x00db
            f14.c0 r1 = a14.C53899h2.f151147c
            if (r6 == r1) goto L_0x0040
            r0 = r6
            goto L_0x00f9
        L_0x00db:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Cannot happen in "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            throw r11
        L_0x00f6:
            f14.c0 r11 = a14.C53899h2.f151148d
        L_0x00f8:
            r0 = r11
        L_0x00f9:
            f14.c0 r11 = a14.C53899h2.f151145a
            if (r0 != r11) goto L_0x00ff
        L_0x00fd:
            r4 = 1
            goto L_0x010d
        L_0x00ff:
            f14.c0 r11 = a14.C53899h2.f151146b
            if (r0 != r11) goto L_0x0104
            goto L_0x00fd
        L_0x0104:
            f14.c0 r11 = a14.C53899h2.f151148d
            if (r0 != r11) goto L_0x0109
            goto L_0x010d
        L_0x0109:
            r10.mo74511x(r0)
            goto L_0x00fd
        L_0x010d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74513C(java.lang.Object):boolean");
    }

    /* renamed from: D */
    public void mo74514D(Throwable th) {
        mo74513C(th);
    }

    /* renamed from: E */
    public final C53883f1 mo74515E(C32226l<? super Throwable, C13598b0> lVar) {
        return mo74533g0(false, true, lVar);
    }

    /* renamed from: F */
    public final boolean mo74516F(Throwable th) {
        if (mo74535i0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C53941r rVar = (C53941r) this._parentHandle;
        return (rVar == null || rVar == C53925m2.f151179d) ? z : rVar.mo74621e(th) || z;
    }

    /* renamed from: H */
    public String mo74465H() {
        return "Job was cancelled";
    }

    /* renamed from: I */
    public boolean mo74517I(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return mo74513C(th) && mo74495T();
    }

    /* renamed from: J */
    public final void mo74518J(C53954u1 u1Var, Object obj) {
        C53941r rVar = (C53941r) this._parentHandle;
        if (rVar != null) {
            rVar.dispose();
            this._parentHandle = C53925m2.f151179d;
        }
        C53857b0 b0Var = null;
        C53969y yVar = obj instanceof C53969y ? (C53969y) obj : null;
        Throwable th = yVar != null ? yVar.f151214a : null;
        if (u1Var instanceof C53879e2) {
            try {
                ((C53879e2) u1Var).mo74474t(th);
            } catch (Throwable th4) {
                mo74467f0(new C53857b0("Exception in completion handler " + u1Var + " for " + this, th4));
            }
        } else {
            C53920l2 b = u1Var.mo74503b();
            if (b != null) {
                for (C58891n nVar = (C58891n) b.mo84078l(); !C87412m.m108589b(nVar, b); nVar = nVar.mo84079m()) {
                    if (nVar instanceof C53879e2) {
                        C53879e2 e2Var = (C53879e2) nVar;
                        try {
                            e2Var.mo74474t(th);
                        } catch (Throwable th5) {
                            if (b0Var != null) {
                                C90107a.m112735a(b0Var, th5);
                            } else {
                                b0Var = new C53857b0("Exception in completion handler " + e2Var + " for " + this, th5);
                                C13598b0 b0Var2 = C13598b0.f38549a;
                            }
                        }
                    }
                }
                if (b0Var != null) {
                    mo74467f0(b0Var);
                }
            }
        }
    }

    /* renamed from: M */
    public final C53941r mo74519M(C53948t tVar) {
        return (C53941r) C53973z1.C53974a.m60624b(this, true, false, new C53945s(tVar), 2, (Object) null);
    }

    /* renamed from: N */
    public final Throwable mo74520N(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C53854a2(mo74465H(), (Throwable) null, this) : th;
        } else if (obj != null) {
            return ((C53932o2) obj).mo74529b0();
        } else {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: O */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74521O(wx3.C15601d<? super rx3.C13598b0> r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo74531d0()
            boolean r1 = r0 instanceof a14.C53954u1
            r2 = 1
            if (r1 != 0) goto L_0x000b
            r0 = 0
            goto L_0x0012
        L_0x000b:
            int r0 = r3.mo74543r0(r0)
            if (r0 < 0) goto L_0x0000
            r0 = 1
        L_0x0012:
            if (r0 != 0) goto L_0x001e
            wx3.f r4 = r4.getContext()
            a14.C53873d2.m60392d(r4)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            return r4
        L_0x001e:
            a14.m r0 = new a14.m
            wx3.d r4 = xx3.C66447b.m78392b(r4)
            r0.<init>(r4, r2)
            r0.mo74609p()
            a14.r2 r4 = new a14.r2
            r4.<init>(r0)
            a14.f1 r4 = r3.mo74515E(r4)
            a14.g1 r1 = new a14.g1
            r1.<init>(r4)
            r0.mo74599v(r1)
            java.lang.Object r4 = r0.mo74608o()
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            if (r4 != r0) goto L_0x0044
            goto L_0x0046
        L_0x0044:
            rx3.b0 r4 = rx3.C13598b0.f38549a
        L_0x0046:
            if (r4 != r0) goto L_0x0049
            return r4
        L_0x0049:
            rx3.b0 r4 = rx3.C13598b0.f38549a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74521O(wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x009d A[LOOP:1: B:46:0x009d->B:49:0x00a8, LOOP_START] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74522P(a14.C53884f2.C53887c r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof a14.C53969y
            r1 = 0
            if (r0 == 0) goto L_0x0009
            r0 = r10
            a14.y r0 = (a14.C53969y) r0
            goto L_0x000a
        L_0x0009:
            r0 = r1
        L_0x000a:
            if (r0 == 0) goto L_0x000f
            java.lang.Throwable r0 = r0.f151214a
            goto L_0x0010
        L_0x000f:
            r0 = r1
        L_0x0010:
            monitor-enter(r9)
            r9.mo74554e()     // Catch:{ all -> 0x00ae }
            java.util.List r2 = r9.mo74557h(r0)     // Catch:{ all -> 0x00ae }
            java.lang.Throwable r3 = r8.mo74524S(r9, r2)     // Catch:{ all -> 0x00ae }
            r4 = 1
            if (r3 == 0) goto L_0x0055
            int r5 = r2.size()     // Catch:{ all -> 0x00ae }
            if (r5 > r4) goto L_0x0026
            goto L_0x0055
        L_0x0026:
            int r5 = r2.size()     // Catch:{ all -> 0x00ae }
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap     // Catch:{ all -> 0x00ae }
            r6.<init>(r5)     // Catch:{ all -> 0x00ae }
            java.util.Set r5 = java.util.Collections.newSetFromMap(r6)     // Catch:{ all -> 0x00ae }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0037:
            boolean r6 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            if (r6 == 0) goto L_0x0055
            java.lang.Object r6 = r2.next()     // Catch:{ all -> 0x00ae }
            java.lang.Throwable r6 = (java.lang.Throwable) r6     // Catch:{ all -> 0x00ae }
            if (r6 == r3) goto L_0x0037
            if (r6 == r3) goto L_0x0037
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException     // Catch:{ all -> 0x00ae }
            if (r7 != 0) goto L_0x0037
            boolean r7 = r5.add(r6)     // Catch:{ all -> 0x00ae }
            if (r7 == 0) goto L_0x0037
            rx3.C90107a.m112735a(r3, r6)     // Catch:{ all -> 0x00ae }
            goto L_0x0037
        L_0x0055:
            monitor-exit(r9)
            r2 = 0
            if (r3 != 0) goto L_0x005a
            goto L_0x0063
        L_0x005a:
            if (r3 != r0) goto L_0x005d
            goto L_0x0063
        L_0x005d:
            a14.y r10 = new a14.y
            r0 = 2
            r10.<init>(r3, r2, r0, r1)
        L_0x0063:
            if (r3 == 0) goto L_0x008a
            boolean r0 = r8.mo74516F(r3)
            if (r0 != 0) goto L_0x0074
            boolean r0 = r8.mo74532e0(r3)
            if (r0 == 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            r0 = 0
            goto L_0x0075
        L_0x0074:
            r0 = 1
        L_0x0075:
            if (r0 == 0) goto L_0x008a
            if (r10 == 0) goto L_0x0082
            r0 = r10
            a14.y r0 = (a14.C53969y) r0
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = a14.C53969y.f151213b
            r1.compareAndSet(r0, r2, r4)
            goto L_0x008a
        L_0x0082:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally"
            r9.<init>(r10)
            throw r9
        L_0x008a:
            r8.mo74469o0(r10)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f151129d
            boolean r1 = r10 instanceof a14.C53954u1
            if (r1 == 0) goto L_0x009c
            a14.v1 r1 = new a14.v1
            r2 = r10
            a14.u1 r2 = (a14.C53954u1) r2
            r1.<init>(r2)
            goto L_0x009d
        L_0x009c:
            r1 = r10
        L_0x009d:
            boolean r2 = r0.compareAndSet(r8, r9, r1)
            if (r2 == 0) goto L_0x00a4
            goto L_0x00aa
        L_0x00a4:
            java.lang.Object r2 = r0.get(r8)
            if (r2 == r9) goto L_0x009d
        L_0x00aa:
            r8.mo74518J(r9, r10)
            return r10
        L_0x00ae:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74522P(a14.f2$c, java.lang.Object):java.lang.Object");
    }

    /* renamed from: R */
    public final Object mo74523R() {
        Object d0 = mo74531d0();
        if (!(!(d0 instanceof C53954u1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(d0 instanceof C53969y)) {
            return C53899h2.m60476a(d0);
        } else {
            throw ((C53969y) d0).f151214a;
        }
    }

    /* renamed from: S */
    public final Throwable mo74524S(C53887c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th4 = (Throwable) list.get(0);
            if (th4 instanceof C53975z2) {
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    T next = it4.next();
                    Throwable th5 = (Throwable) next;
                    if (th5 == th4 || !(th5 instanceof C53975z2)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th6 = (Throwable) t2;
                if (th6 != null) {
                    return th6;
                }
            }
            return th4;
        } else if (cVar.mo74554e()) {
            return new C53854a2(mo74465H(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: T */
    public boolean mo74495T() {
        return true;
    }

    /* renamed from: W */
    public boolean mo74496W() {
        return this instanceof C53956v;
    }

    /* renamed from: Y */
    public final C53920l2 mo74525Y(C53954u1 u1Var) {
        C53920l2 b = u1Var.mo74503b();
        if (b != null) {
            return b;
        }
        if (u1Var instanceof C53902i1) {
            return new C53920l2();
        }
        if (u1Var instanceof C53879e2) {
            mo74542q0((C53879e2) u1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + u1Var).toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.concurrent.CancellationException} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.CancellationException mo74526Z() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.mo74531d0()
            boolean r1 = r0 instanceof a14.C53884f2.C53887c
            r2 = 0
            java.lang.String r3 = "Job is still new or active: "
            if (r1 == 0) goto L_0x005a
            a14.f2$c r0 = (a14.C53884f2.C53887c) r0
            java.lang.Throwable r0 = r0.mo74553d()
            if (r0 == 0) goto L_0x0041
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " is cancelling"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            boolean r3 = r0 instanceof java.util.concurrent.CancellationException
            if (r3 == 0) goto L_0x0033
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x0033:
            if (r2 != 0) goto L_0x0099
            a14.a2 r2 = new a14.a2
            if (r1 != 0) goto L_0x003d
            java.lang.String r1 = r4.mo74465H()
        L_0x003d:
            r2.<init>(r1, r0, r4)
            goto L_0x0099
        L_0x0041:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x005a:
            boolean r1 = r0 instanceof a14.C53954u1
            if (r1 != 0) goto L_0x009a
            boolean r1 = r0 instanceof a14.C53969y
            if (r1 == 0) goto L_0x007a
            a14.y r0 = (a14.C53969y) r0
            java.lang.Throwable r0 = r0.f151214a
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L_0x006d
            r2 = r0
            java.util.concurrent.CancellationException r2 = (java.util.concurrent.CancellationException) r2
        L_0x006d:
            if (r2 != 0) goto L_0x0099
            a14.a2 r1 = new a14.a2
            java.lang.String r2 = r4.mo74465H()
            r1.<init>(r2, r0, r4)
            r2 = r1
            goto L_0x0099
        L_0x007a:
            a14.a2 r0 = new a14.a2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r3 = r4.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r1.append(r3)
            java.lang.String r3 = " has completed normally"
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r2, r4)
            r2 = r0
        L_0x0099:
            return r2
        L_0x009a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74526Z():java.util.concurrent.CancellationException");
    }

    /* renamed from: a */
    public boolean mo74466a() {
        Object d0 = mo74531d0();
        return (d0 instanceof C53954u1) && ((C53954u1) d0).mo74502a();
    }

    /* renamed from: a0 */
    public final C53941r mo74527a0() {
        return (C53941r) this._parentHandle;
    }

    /* renamed from: b */
    public void mo74528b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C53854a2(mo74465H(), (Throwable) null, this);
        }
        mo74514D(cancellationException);
    }

    /* renamed from: b0 */
    public CancellationException mo74529b0() {
        Throwable th;
        Object d0 = mo74531d0();
        CancellationException cancellationException = null;
        if (d0 instanceof C53887c) {
            th = ((C53887c) d0).mo74553d();
        } else if (d0 instanceof C53969y) {
            th = ((C53969y) d0).f151214a;
        } else if (!(d0 instanceof C53954u1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + d0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new C53854a2("Parent job is " + mo74544s0(d0), th, this);
    }

    /* renamed from: c */
    public final boolean mo74530c() {
        return !(mo74531d0() instanceof C53954u1);
    }

    /* renamed from: d0 */
    public final Object mo74531d0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C58904v)) {
                return obj;
            }
            ((C58904v) obj).mo84055b(this);
        }
    }

    /* renamed from: e0 */
    public boolean mo74532e0(Throwable th) {
        return false;
    }

    /* renamed from: f0 */
    public void mo74467f0(Throwable th) {
        throw th;
    }

    public <R> R fold(R r, C32227p<? super R, ? super C66212f.C66215b, ? extends R> pVar) {
        C87412m.m108594g(pVar, "operation");
        return pVar.invoke(r, this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x005e A[LOOP:2: B:32:0x005e->B:35:0x0069, LOOP_START] */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final a14.C53883f1 mo74533g0(boolean r11, boolean r12, fy3.C32226l<? super java.lang.Throwable, rx3.C13598b0> r13) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x0014
            boolean r1 = r13 instanceof a14.C53859b2
            if (r1 == 0) goto L_0x000b
            r1 = r13
            a14.b2 r1 = (a14.C53859b2) r1
            goto L_0x000c
        L_0x000b:
            r1 = r0
        L_0x000c:
            if (r1 != 0) goto L_0x0025
            a14.x1 r1 = new a14.x1
            r1.<init>(r13)
            goto L_0x0025
        L_0x0014:
            boolean r1 = r13 instanceof a14.C53879e2
            if (r1 == 0) goto L_0x001c
            r1 = r13
            a14.e2 r1 = (a14.C53879e2) r1
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            if (r1 == 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            a14.y1 r1 = new a14.y1
            r1.<init>(r13)
        L_0x0025:
            r1.f151124g = r10
        L_0x0027:
            java.lang.Object r2 = r10.mo74531d0()
            boolean r3 = r2 instanceof a14.C53902i1
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x006c
            r3 = r2
            a14.i1 r3 = (a14.C53902i1) r3
            boolean r6 = r3.f151154d
            if (r6 == 0) goto L_0x004b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f151129d
        L_0x003a:
            boolean r3 = r6.compareAndSet(r10, r2, r1)
            if (r3 == 0) goto L_0x0042
            r4 = 1
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r6.get(r10)
            if (r3 == r2) goto L_0x003a
        L_0x0048:
            if (r4 == 0) goto L_0x0027
            return r1
        L_0x004b:
            a14.l2 r2 = new a14.l2
            r2.<init>()
            boolean r4 = r3.f151154d
            if (r4 == 0) goto L_0x0056
            r6 = r2
            goto L_0x005c
        L_0x0056:
            a14.t1 r4 = new a14.t1
            r4.<init>(r2)
            r6 = r4
        L_0x005c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f151129d
        L_0x005e:
            boolean r2 = r7.compareAndSet(r10, r3, r6)
            if (r2 == 0) goto L_0x0065
            goto L_0x0027
        L_0x0065:
            java.lang.Object r2 = r7.get(r10)
            if (r2 == r3) goto L_0x005e
            goto L_0x0027
        L_0x006c:
            boolean r3 = r2 instanceof a14.C53954u1
            if (r3 == 0) goto L_0x00ee
            r3 = r2
            a14.u1 r3 = (a14.C53954u1) r3
            a14.l2 r3 = r3.mo74503b()
            if (r3 != 0) goto L_0x0089
            if (r2 == 0) goto L_0x0081
            a14.e2 r2 = (a14.C53879e2) r2
            r10.mo74542q0(r2)
            goto L_0x0027
        L_0x0081:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.String r12 = "null cannot be cast to non-null type kotlinx.coroutines.JobNode"
            r11.<init>(r12)
            throw r11
        L_0x0089:
            a14.m2 r6 = a14.C53925m2.f151179d
            r7 = 2
            if (r11 == 0) goto L_0x00cf
            boolean r8 = r2 instanceof a14.C53884f2.C53887c
            if (r8 == 0) goto L_0x00cf
            monitor-enter(r2)
            r8 = r2
            a14.f2$c r8 = (a14.C53884f2.C53887c) r8     // Catch:{ all -> 0x00cc }
            java.lang.Throwable r8 = r8.mo74553d()     // Catch:{ all -> 0x00cc }
            if (r8 == 0) goto L_0x00a9
            boolean r9 = r13 instanceof a14.C53945s     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x00c8
            r9 = r2
            a14.f2$c r9 = (a14.C53884f2.C53887c) r9     // Catch:{ all -> 0x00cc }
            boolean r9 = r9.mo74555f()     // Catch:{ all -> 0x00cc }
            if (r9 != 0) goto L_0x00c8
        L_0x00a9:
            a14.g2 r6 = new a14.g2     // Catch:{ all -> 0x00cc }
            r6.<init>(r1, r10, r2)     // Catch:{ all -> 0x00cc }
        L_0x00ae:
            f14.n r9 = r3.mo84080n()     // Catch:{ all -> 0x00cc }
            int r9 = r9.mo84083s(r1, r3, r6)     // Catch:{ all -> 0x00cc }
            if (r9 == r5) goto L_0x00bd
            if (r9 == r7) goto L_0x00bb
            goto L_0x00ae
        L_0x00bb:
            r6 = 0
            goto L_0x00be
        L_0x00bd:
            r6 = 1
        L_0x00be:
            if (r6 != 0) goto L_0x00c3
            monitor-exit(r2)
            goto L_0x0027
        L_0x00c3:
            if (r8 != 0) goto L_0x00c7
            monitor-exit(r2)
            return r1
        L_0x00c7:
            r6 = r1
        L_0x00c8:
            rx3.b0 r9 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00cc }
            monitor-exit(r2)
            goto L_0x00d0
        L_0x00cc:
            r11 = move-exception
            monitor-exit(r2)
            throw r11
        L_0x00cf:
            r8 = r0
        L_0x00d0:
            if (r8 == 0) goto L_0x00d8
            if (r12 == 0) goto L_0x00d7
            r13.invoke(r8)
        L_0x00d7:
            return r6
        L_0x00d8:
            a14.g2 r6 = new a14.g2
            r6.<init>(r1, r10, r2)
        L_0x00dd:
            f14.n r2 = r3.mo84080n()
            int r2 = r2.mo84083s(r1, r3, r6)
            if (r2 == r5) goto L_0x00ea
            if (r2 == r7) goto L_0x00eb
            goto L_0x00dd
        L_0x00ea:
            r4 = 1
        L_0x00eb:
            if (r4 == 0) goto L_0x0027
            return r1
        L_0x00ee:
            if (r12 == 0) goto L_0x00ff
            boolean r11 = r2 instanceof a14.C53969y
            if (r11 == 0) goto L_0x00f7
            a14.y r2 = (a14.C53969y) r2
            goto L_0x00f8
        L_0x00f7:
            r2 = r0
        L_0x00f8:
            if (r2 == 0) goto L_0x00fc
            java.lang.Throwable r0 = r2.f151214a
        L_0x00fc:
            r13.invoke(r0)
        L_0x00ff:
            a14.m2 r11 = a14.C53925m2.f151179d
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74533g0(boolean, boolean, fy3.l):a14.f1");
    }

    public <E extends C66212f.C66215b> E get(C66212f.C15602c<E> cVar) {
        return C66212f.C66215b.C66216a.m78145a(this, cVar);
    }

    public final C66212f.C15602c<?> getKey() {
        return C53973z1.C0004b.f3d;
    }

    /* renamed from: h0 */
    public final void mo74534h0(C53973z1 z1Var) {
        if (z1Var == null) {
            this._parentHandle = C53925m2.f151179d;
            return;
        }
        z1Var.start();
        C53941r M = z1Var.mo74519M(this);
        this._parentHandle = M;
        if (mo74530c()) {
            M.dispose();
            this._parentHandle = C53925m2.f151179d;
        }
    }

    /* renamed from: i0 */
    public boolean mo74535i0() {
        return this instanceof C53881f;
    }

    public final boolean isCancelled() {
        Object d0 = mo74531d0();
        return (d0 instanceof C53969y) || ((d0 instanceof C53887c) && ((C53887c) d0).mo74554e());
    }

    /* renamed from: j0 */
    public final boolean mo74537j0(Object obj) {
        Object t0;
        do {
            t0 = mo74546t0(mo74531d0(), obj);
            if (t0 == C53899h2.f151145a) {
                return false;
            }
            if (t0 == C53899h2.f151146b) {
                return true;
            }
        } while (t0 == C53899h2.f151147c);
        mo74511x(t0);
        return true;
    }

    /* renamed from: k0 */
    public final Object mo74538k0(Object obj) {
        Object t0;
        do {
            t0 = mo74546t0(mo74531d0(), obj);
            if (t0 == C53899h2.f151145a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                Throwable th = null;
                C53969y yVar = obj instanceof C53969y ? (C53969y) obj : null;
                if (yVar != null) {
                    th = yVar.f151214a;
                }
                throw new IllegalStateException(str, th);
            }
        } while (t0 == C53899h2.f151147c);
        return t0;
    }

    /* renamed from: l0 */
    public String mo74468l0() {
        return getClass().getSimpleName();
    }

    /* renamed from: m0 */
    public final C53945s mo74539m0(C58891n nVar) {
        while (nVar.mo84074p()) {
            nVar = nVar.mo84080n();
        }
        while (true) {
            nVar = nVar.mo84079m();
            if (!nVar.mo84074p()) {
                if (nVar instanceof C53945s) {
                    return (C53945s) nVar;
                }
                if (nVar instanceof C53920l2) {
                    return null;
                }
            }
        }
    }

    public C66212f minusKey(C66212f.C15602c<?> cVar) {
        return C66212f.C66215b.C66216a.m78146b(this, cVar);
    }

    /* renamed from: n0 */
    public final void mo74540n0(C53920l2 l2Var, Throwable th) {
        C53857b0 b0Var = null;
        for (C58891n nVar = (C58891n) l2Var.mo84078l(); !C87412m.m108589b(nVar, l2Var); nVar = nVar.mo84079m()) {
            if (nVar instanceof C53859b2) {
                C53879e2 e2Var = (C53879e2) nVar;
                try {
                    e2Var.mo74474t(th);
                } catch (Throwable th4) {
                    if (b0Var != null) {
                        C90107a.m112735a(b0Var, th4);
                    } else {
                        b0Var = new C53857b0("Exception in completion handler " + e2Var + " for " + this, th4);
                        C13598b0 b0Var2 = C13598b0.f38549a;
                    }
                }
            }
        }
        if (b0Var != null) {
            mo74467f0(b0Var);
        }
        mo74516F(th);
    }

    /* renamed from: o0 */
    public void mo74469o0(Object obj) {
    }

    /* renamed from: p0 */
    public void mo74541p0() {
    }

    public C66212f plus(C66212f fVar) {
        C87412m.m108594g(fVar, "context");
        return C66212f.C66213a.m78144a(this, fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[LOOP:2: B:12:0x0035->B:15:0x0040, LOOP_START] */
    /* renamed from: q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74542q0(a14.C53879e2 r5) {
        /*
            r4 = this;
            a14.l2 r0 = new a14.l2
            r0.<init>()
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14.C58891n.f168542e
            r1.lazySet(r0, r5)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14.C58891n.f168541d
            r1.lazySet(r0, r5)
        L_0x0012:
            java.lang.Object r1 = r5.mo84078l()
            r2 = 0
            if (r1 == r5) goto L_0x001a
            goto L_0x002f
        L_0x001a:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f14.C58891n.f168541d
        L_0x001c:
            boolean r3 = r1.compareAndSet(r5, r5, r0)
            if (r3 == 0) goto L_0x0024
            r2 = 1
            goto L_0x002a
        L_0x0024:
            java.lang.Object r3 = r1.get(r5)
            if (r3 == r5) goto L_0x001c
        L_0x002a:
            if (r2 == 0) goto L_0x0012
            r0.mo84077k(r5)
        L_0x002f:
            f14.n r1 = r5.mo84079m()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f151129d
        L_0x0035:
            boolean r0 = r2.compareAndSet(r4, r5, r1)
            if (r0 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            java.lang.Object r0 = r2.get(r4)
            if (r0 == r5) goto L_0x0035
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74542q0(a14.e2):void");
    }

    /* renamed from: r0 */
    public final int mo74543r0(Object obj) {
        boolean z = false;
        if (obj instanceof C53902i1) {
            if (((C53902i1) obj).f151154d) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f151129d;
            C53902i1 i1Var = C53899h2.f151151g;
            while (true) {
                if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, i1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo74541p0();
            return 1;
        } else if (!(obj instanceof C53950t1)) {
            return 0;
        } else {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f151129d;
            C53920l2 l2Var = ((C53950t1) obj).f151199d;
            while (true) {
                if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, l2Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                } else {
                    z = true;
                    break;
                }
            }
            if (!z) {
                return -1;
            }
            mo74541p0();
            return 1;
        }
    }

    /* renamed from: s0 */
    public final String mo74544s0(Object obj) {
        if (!(obj instanceof C53887c)) {
            return obj instanceof C53954u1 ? ((C53954u1) obj).mo74502a() ? "Active" : "New" : obj instanceof C53969y ? "Cancelled" : "Completed";
        }
        C53887c cVar = (C53887c) obj;
        return cVar.mo74554e() ? "Cancelling" : cVar.mo74555f() ? "Completing" : "Active";
    }

    public final boolean start() {
        int r0;
        do {
            r0 = mo74543r0(mo74531d0());
            if (r0 == 0) {
                return false;
            }
        } while (r0 != 1);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00bf, code lost:
        if (r6 == null) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00c1, code lost:
        mo74540n0(r0, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x00c6, code lost:
        if ((r9 instanceof a14.C53945s) == false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x00c8, code lost:
        r0 = (a14.C53945s) r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00cc, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x00cd, code lost:
        if (r0 != null) goto L_0x00da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x00cf, code lost:
        r9 = r9.mo74503b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x00d3, code lost:
        if (r9 == null) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x00d5, code lost:
        r4 = mo74539m0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x00da, code lost:
        r4 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x00db, code lost:
        if (r4 == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x00e1, code lost:
        if (mo74548u0(r3, r4, r10) == false) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        return mo74522P(r3, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:?, code lost:
        return a14.C53899h2.f151146b;
     */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo74546t0(java.lang.Object r9, java.lang.Object r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof a14.C53954u1
            if (r0 != 0) goto L_0x0007
            f14.c0 r9 = a14.C53899h2.f151145a
            return r9
        L_0x0007:
            boolean r0 = r9 instanceof a14.C53902i1
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0011
            boolean r0 = r9 instanceof a14.C53879e2
            if (r0 == 0) goto L_0x004c
        L_0x0011:
            boolean r0 = r9 instanceof a14.C53945s
            if (r0 != 0) goto L_0x004c
            boolean r0 = r10 instanceof a14.C53969y
            if (r0 != 0) goto L_0x004c
            r0 = r9
            a14.u1 r0 = (a14.C53954u1) r0
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = f151129d
            boolean r9 = r10 instanceof a14.C53954u1
            if (r9 == 0) goto L_0x002c
            a14.v1 r9 = new a14.v1
            r4 = r10
            a14.u1 r4 = (a14.C53954u1) r4
            r9.<init>(r4)
            r4 = r9
            goto L_0x002d
        L_0x002c:
            r4 = r10
        L_0x002d:
            boolean r9 = r3.compareAndSet(r8, r0, r4)
            if (r9 == 0) goto L_0x0035
            r9 = 1
            goto L_0x003c
        L_0x0035:
            java.lang.Object r9 = r3.get(r8)
            if (r9 == r0) goto L_0x002d
            r9 = 0
        L_0x003c:
            if (r9 != 0) goto L_0x003f
            goto L_0x0046
        L_0x003f:
            r8.mo74469o0(r10)
            r8.mo74518J(r0, r10)
            r1 = 1
        L_0x0046:
            if (r1 == 0) goto L_0x0049
            return r10
        L_0x0049:
            f14.c0 r9 = a14.C53899h2.f151147c
            return r9
        L_0x004c:
            a14.u1 r9 = (a14.C53954u1) r9
            a14.l2 r0 = r8.mo74525Y(r9)
            if (r0 != 0) goto L_0x0058
            f14.c0 r9 = a14.C53899h2.f151147c
            goto L_0x00ea
        L_0x0058:
            boolean r3 = r9 instanceof a14.C53884f2.C53887c
            r4 = 0
            if (r3 == 0) goto L_0x0061
            r3 = r9
            a14.f2$c r3 = (a14.C53884f2.C53887c) r3
            goto L_0x0062
        L_0x0061:
            r3 = r4
        L_0x0062:
            if (r3 != 0) goto L_0x0069
            a14.f2$c r3 = new a14.f2$c
            r3.<init>(r0, r1, r4)
        L_0x0069:
            gy3.f0 r5 = new gy3.f0
            r5.<init>()
            monitor-enter(r3)
            boolean r6 = r3.mo74555f()     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x007a
            f14.c0 r9 = a14.C53899h2.f151145a     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            goto L_0x00ea
        L_0x007a:
            r3.mo74558i(r2)     // Catch:{ all -> 0x00eb }
            if (r3 == r9) goto L_0x0095
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f151129d     // Catch:{ all -> 0x00eb }
        L_0x0081:
            boolean r7 = r6.compareAndSet(r8, r9, r3)     // Catch:{ all -> 0x00eb }
            if (r7 == 0) goto L_0x0089
            r1 = 1
            goto L_0x008f
        L_0x0089:
            java.lang.Object r7 = r6.get(r8)     // Catch:{ all -> 0x00eb }
            if (r7 == r9) goto L_0x0081
        L_0x008f:
            if (r1 != 0) goto L_0x0095
            f14.c0 r9 = a14.C53899h2.f151147c     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            goto L_0x00ea
        L_0x0095:
            boolean r1 = r3.mo74554e()     // Catch:{ all -> 0x00eb }
            boolean r6 = r10 instanceof a14.C53969y     // Catch:{ all -> 0x00eb }
            if (r6 == 0) goto L_0x00a1
            r6 = r10
            a14.y r6 = (a14.C53969y) r6     // Catch:{ all -> 0x00eb }
            goto L_0x00a2
        L_0x00a1:
            r6 = r4
        L_0x00a2:
            if (r6 == 0) goto L_0x00a9
            java.lang.Throwable r6 = r6.f151214a     // Catch:{ all -> 0x00eb }
            r3.mo74552c(r6)     // Catch:{ all -> 0x00eb }
        L_0x00a9:
            java.lang.Throwable r6 = r3.mo74553d()     // Catch:{ all -> 0x00eb }
            r1 = r1 ^ r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x00eb }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x00eb }
            if (r1 == 0) goto L_0x00b9
            goto L_0x00ba
        L_0x00b9:
            r6 = r4
        L_0x00ba:
            r5.f27484d = r6     // Catch:{ all -> 0x00eb }
            rx3.b0 r1 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00eb }
            monitor-exit(r3)
            if (r6 == 0) goto L_0x00c4
            r8.mo74540n0(r0, r6)
        L_0x00c4:
            boolean r0 = r9 instanceof a14.C53945s
            if (r0 == 0) goto L_0x00cc
            r0 = r9
            a14.s r0 = (a14.C53945s) r0
            goto L_0x00cd
        L_0x00cc:
            r0 = r4
        L_0x00cd:
            if (r0 != 0) goto L_0x00da
            a14.l2 r9 = r9.mo74503b()
            if (r9 == 0) goto L_0x00db
            a14.s r4 = r8.mo74539m0(r9)
            goto L_0x00db
        L_0x00da:
            r4 = r0
        L_0x00db:
            if (r4 == 0) goto L_0x00e6
            boolean r9 = r8.mo74548u0(r3, r4, r10)
            if (r9 == 0) goto L_0x00e6
            f14.c0 r9 = a14.C53899h2.f151146b
            goto L_0x00ea
        L_0x00e6:
            java.lang.Object r9 = r8.mo74522P(r3, r10)
        L_0x00ea:
            return r9
        L_0x00eb:
            r9 = move-exception
            monitor-exit(r3)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a14.C53884f2.mo74546t0(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo74468l0() + '{' + mo74544s0(mo74531d0()) + '}');
        sb.append('@');
        sb.append(C53942r0.m60572a(this));
        return sb.toString();
    }

    /* renamed from: u0 */
    public final boolean mo74548u0(C53887c cVar, C53945s sVar, Object obj) {
        while (C53973z1.C53974a.m60624b(sVar.f151193h, false, false, new C53886b(this, cVar, sVar, obj), 1, (Object) null) == C53925m2.f151179d) {
            sVar = mo74539m0(sVar);
            if (sVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: x */
    public void mo74511x(Object obj) {
    }

    /* renamed from: z */
    public final Object mo74549z(C15601d<Object> dVar) {
        Object d0;
        do {
            d0 = mo74531d0();
            if (!(d0 instanceof C53954u1)) {
                if (!(d0 instanceof C53969y)) {
                    return C53899h2.m60476a(d0);
                }
                throw ((C53969y) d0).f151214a;
            }
        } while (mo74543r0(d0) < 0);
        C53885a aVar = new C53885a(C66447b.m78392b(dVar), this);
        aVar.mo74609p();
        aVar.mo74599v(new C53892g1(mo74515E(new C53940q2(aVar))));
        return aVar.mo74608o();
    }
}

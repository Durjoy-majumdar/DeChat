package k14;

import a14.C53883f1;
import a14.C53916l;
import a14.C53926n;
import f14.C58871c;
import f14.C58889l;
import f14.C58891n;
import f14.C58904v;
import f14.C58905w;
import fy3.C32226l;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx3.C13598b0;

/* renamed from: k14.d */
public final class C60942d implements C99088c {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f173574a = AtomicReferenceFieldUpdater.newUpdater(C60942d.class, Object.class, "_state");
    public volatile /* synthetic */ Object _state;

    /* renamed from: k14.d$a */
    public final class C60943a extends C60945b {

        /* renamed from: i */
        public final C53916l<C13598b0> f173575i;

        /* renamed from: k14.d$a$a */
        public static final class C60944a extends C87413o implements C32226l<Throwable, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C60942d f173577d;

            /* renamed from: e */
            public final /* synthetic */ C60943a f173578e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60944a(C60942d dVar, C60943a aVar) {
                super(1);
                this.f173577d = dVar;
                this.f173578e = aVar;
            }

            public Object invoke(Object obj) {
                Throwable th = (Throwable) obj;
                this.f173577d.mo85909c(this.f173578e.f173580g);
                return C13598b0.f38549a;
            }
        }

        public C60943a(Object obj, C53916l<? super C13598b0> lVar) {
            super(C60942d.this, obj);
            this.f173575i = lVar;
        }

        /* renamed from: t */
        public void mo85912t() {
            this.f173575i.mo74592K(C53926n.f151180a);
        }

        public String toString() {
            return "LockCont[" + this.f173580g + ", " + this.f173575i + "] for " + C60942d.this;
        }

        /* renamed from: u */
        public boolean mo85913u() {
            return C60945b.f173579h.compareAndSet(this, 0, 1) && this.f173575i.mo74594U(C13598b0.f38549a, (Object) null, new C60944a(C60942d.this, this)) != null;
        }
    }

    /* renamed from: k14.d$b */
    public abstract class C60945b extends C58891n implements C53883f1 {

        /* renamed from: h */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f173579h = AtomicIntegerFieldUpdater.newUpdater(C60945b.class, "isTaken");

        /* renamed from: g */
        public final Object f173580g;
        private volatile /* synthetic */ int isTaken = 0;

        public C60945b(C60942d dVar, Object obj) {
            this.f173580g = obj;
        }

        public final void dispose() {
            mo75558q();
        }

        /* renamed from: t */
        public abstract void mo85912t();

        /* renamed from: u */
        public abstract boolean mo85913u();
    }

    /* renamed from: k14.d$c */
    public static final class C60946c extends C58889l {
        public volatile Object owner;

        public C60946c(Object obj) {
            this.owner = obj;
        }

        public String toString() {
            return "LockedQueue[" + this.owner + ']';
        }
    }

    /* renamed from: k14.d$d */
    public static final class C60947d extends C58871c<C60942d> {

        /* renamed from: b */
        public final C60946c f173581b;

        public C60947d(C60946c cVar) {
            this.f173581b = cVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:5:0x000b A[LOOP:0: B:5:0x000b->B:8:0x0016, LOOP_START] */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo84056c(java.lang.Object r3, java.lang.Object r4) {
            /*
                r2 = this;
                k14.d r3 = (k14.C60942d) r3
                if (r4 != 0) goto L_0x0007
                k14.b r4 = k14.C60949f.f173588e
                goto L_0x0009
            L_0x0007:
                k14.d$c r4 = r2.f173581b
            L_0x0009:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = k14.C60942d.f173574a
            L_0x000b:
                boolean r1 = r0.compareAndSet(r3, r2, r4)
                if (r1 == 0) goto L_0x0012
                goto L_0x0018
            L_0x0012:
                java.lang.Object r1 = r0.get(r3)
                if (r1 == r2) goto L_0x000b
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: k14.C60942d.C60947d.mo84056c(java.lang.Object, java.lang.Object):void");
        }

        /* renamed from: d */
        public Object mo74562d(Object obj) {
            C60942d dVar = (C60942d) obj;
            C60946c cVar = this.f173581b;
            if (cVar.mo84078l() == cVar) {
                return null;
            }
            return C60949f.f173584a;
        }
    }

    public C60942d(boolean z) {
        this._state = z ? C60949f.f173587d : C60949f.f173588e;
    }

    /* renamed from: a */
    public boolean mo85907a() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C33813b) {
                return ((C33813b) obj).f91414a != C60949f.f173586c;
            }
            if (obj instanceof C60946c) {
                return true;
            }
            if (obj instanceof C58904v) {
                ((C58904v) obj).mo84055b(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0030 A[LOOP:1: B:10:0x0030->B:13:0x003b, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo85908b(java.lang.Object r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r7.mo85910d(r8)
            if (r0 == 0) goto L_0x0009
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        L_0x0009:
            wx3.d r9 = xx3.C66447b.m78392b(r9)
            a14.m r9 = a14.C53929o.m60553a(r9)
            k14.d$a r0 = new k14.d$a
            r0.<init>(r8, r9)
        L_0x0016:
            java.lang.Object r1 = r7._state
            boolean r2 = r1 instanceof k14.C33813b
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0065
            r2 = r1
            k14.b r2 = (k14.C33813b) r2
            java.lang.Object r5 = r2.f91414a
            f14.c0 r6 = k14.C60949f.f173586c
            if (r5 == r6) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f173574a
            k14.d$c r6 = new k14.d$c
            java.lang.Object r2 = r2.f91414a
            r6.<init>(r2)
        L_0x0030:
            boolean r2 = r5.compareAndSet(r7, r1, r6)
            if (r2 == 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r2 = r5.get(r7)
            if (r2 == r1) goto L_0x0030
            goto L_0x0016
        L_0x003e:
            if (r8 != 0) goto L_0x0043
            k14.b r2 = k14.C60949f.f173587d
            goto L_0x0048
        L_0x0043:
            k14.b r2 = new k14.b
            r2.<init>(r8)
        L_0x0048:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = f173574a
        L_0x004a:
            boolean r6 = r5.compareAndSet(r7, r1, r2)
            if (r6 == 0) goto L_0x0051
            goto L_0x0058
        L_0x0051:
            java.lang.Object r6 = r5.get(r7)
            if (r6 == r1) goto L_0x004a
            r3 = 0
        L_0x0058:
            if (r3 == 0) goto L_0x0016
            rx3.b0 r0 = rx3.C13598b0.f38549a
            k14.e r1 = new k14.e
            r1.<init>(r7, r8)
            r9.mo74596X(r0, r1)
            goto L_0x009a
        L_0x0065:
            boolean r2 = r1 instanceof k14.C60942d.C60946c
            if (r2 == 0) goto L_0x00c6
            r2 = r1
            k14.d$c r2 = (k14.C60942d.C60946c) r2
            java.lang.Object r5 = r2.owner
            if (r5 == r8) goto L_0x0072
            r5 = 1
            goto L_0x0073
        L_0x0072:
            r5 = 0
        L_0x0073:
            if (r5 == 0) goto L_0x00ab
        L_0x0075:
            f14.n r5 = r2.mo84080n()
            boolean r5 = r5.mo84075h(r0, r2)
            if (r5 == 0) goto L_0x0075
            java.lang.Object r2 = r7._state
            if (r2 == r1) goto L_0x0092
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = k14.C60942d.C60945b.f173579h
            boolean r1 = r1.compareAndSet(r0, r4, r3)
            if (r1 != 0) goto L_0x008c
            goto L_0x0092
        L_0x008c:
            k14.d$a r0 = new k14.d$a
            r0.<init>(r8, r9)
            goto L_0x0016
        L_0x0092:
            a14.p2 r8 = new a14.p2
            r8.<init>(r0)
            r9.mo74599v(r8)
        L_0x009a:
            java.lang.Object r8 = r9.mo74608o()
            xx3.a r9 = xx3.C15911a.COROUTINE_SUSPENDED
            if (r8 != r9) goto L_0x00a3
            goto L_0x00a5
        L_0x00a3:
            rx3.b0 r8 = rx3.C13598b0.f38549a
        L_0x00a5:
            if (r8 != r9) goto L_0x00a8
            return r8
        L_0x00a8:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        L_0x00ab:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Already locked by "
            r9.append(r0)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x00c6:
            boolean r2 = r1 instanceof f14.C58904v
            if (r2 == 0) goto L_0x00d1
            f14.v r1 = (f14.C58904v) r1
            r1.mo84055b(r7)
            goto L_0x0016
        L_0x00d1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Illegal state "
            r9.append(r0)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: k14.C60942d.mo85908b(java.lang.Object, wx3.d):java.lang.Object");
    }

    /* renamed from: c */
    public void mo85909c(Object obj) {
        C58891n nVar;
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            if (obj2 instanceof C33813b) {
                if (obj == null) {
                    if (!(((C33813b) obj2).f91414a != C60949f.f173586c)) {
                        throw new IllegalStateException("Mutex is not locked".toString());
                    }
                } else {
                    C33813b bVar = (C33813b) obj2;
                    if (!(bVar.f91414a == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + bVar.f91414a + " but expected " + obj).toString());
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f173574a;
                C33813b bVar2 = C60949f.f173588e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar2)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    return;
                }
            } else if (obj2 instanceof C58904v) {
                ((C58904v) obj2).mo84055b(this);
            } else if (obj2 instanceof C60946c) {
                if (obj != null) {
                    C60946c cVar = (C60946c) obj2;
                    if (!(cVar.owner == obj)) {
                        throw new IllegalStateException(("Mutex is locked by " + cVar.owner + " but expected " + obj).toString());
                    }
                }
                C60946c cVar2 = (C60946c) obj2;
                while (true) {
                    nVar = (C58891n) cVar2.mo84078l();
                    if (nVar == cVar2) {
                        nVar = null;
                        break;
                    } else if (nVar.mo75558q()) {
                        break;
                    } else {
                        ((C58905w) nVar.mo84078l()).f168559a.mo84081o();
                    }
                }
                if (nVar == null) {
                    C60947d dVar = new C60947d(cVar2);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f173574a;
                    while (true) {
                        if (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, dVar)) {
                            if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (z && dVar.mo84055b(this) == null) {
                        return;
                    }
                } else {
                    C60945b bVar3 = (C60945b) nVar;
                    if (bVar3.mo85913u()) {
                        Object obj3 = bVar3.f173580g;
                        if (obj3 == null) {
                            obj3 = C60949f.f173585b;
                        }
                        cVar2.owner = obj3;
                        bVar3.mo85912t();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    /* renamed from: d */
    public boolean mo85910d(Object obj) {
        while (true) {
            Object obj2 = this._state;
            boolean z = true;
            boolean z2 = false;
            if (obj2 instanceof C33813b) {
                if (((C33813b) obj2).f91414a != C60949f.f173586c) {
                    return false;
                }
                C33813b bVar = obj == null ? C60949f.f173587d : new C33813b(obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f173574a;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, bVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    } else {
                        z2 = true;
                        break;
                    }
                }
                if (z2) {
                    return true;
                }
            } else if (obj2 instanceof C60946c) {
                if (((C60946c) obj2).owner == obj) {
                    z = false;
                }
                if (z) {
                    return false;
                }
                throw new IllegalStateException(("Already locked by " + obj).toString());
            } else if (obj2 instanceof C58904v) {
                ((C58904v) obj2).mo84055b(this);
            } else {
                throw new IllegalStateException(("Illegal state " + obj2).toString());
            }
        }
    }

    public String toString() {
        while (true) {
            Object obj = this._state;
            if (obj instanceof C33813b) {
                return "Mutex[" + ((C33813b) obj).f91414a + ']';
            } else if (obj instanceof C58904v) {
                ((C58904v) obj).mo84055b(this);
            } else if (obj instanceof C60946c) {
                return "Mutex[" + ((C60946c) obj).owner + ']';
            } else {
                throw new IllegalStateException(("Illegal state " + obj).toString());
            }
        }
    }
}

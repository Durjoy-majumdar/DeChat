package f14;

import a14.C53942r0;
import gy3.C24573w;
import gy3.C87412m;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f14.n */
public class C58891n {

    /* renamed from: d */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168541d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168542e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168543f;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object _removedRef = null;

    /* renamed from: f14.n$a */
    public static abstract class C58892a extends C58871c<C58891n> {

        /* renamed from: b */
        public final C58891n f168544b;

        /* renamed from: c */
        public C58891n f168545c;

        public C58892a(C58891n nVar) {
            this.f168544b = nVar;
        }

        /* renamed from: c */
        public void mo84056c(Object obj, Object obj2) {
            C58891n nVar = (C58891n) obj;
            boolean z = false;
            boolean z2 = obj2 == null;
            C58891n nVar2 = z2 ? this.f168544b : this.f168545c;
            if (nVar2 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C58891n.f168541d;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(nVar, this, nVar2)) {
                        if (atomicReferenceFieldUpdater.get(nVar) != this) {
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
                if (z && z2) {
                    C58891n nVar3 = this.f168544b;
                    C58891n nVar4 = this.f168545c;
                    C87412m.m108591d(nVar4);
                    nVar3.mo84077k(nVar4);
                }
            }
        }
    }

    /* renamed from: f14.n$b */
    public static final class C58893b extends C58904v {
    }

    /* renamed from: f14.n$c */
    public /* synthetic */ class C58894c extends C24573w {
        public C58894c(Object obj) {
            super(obj, C53942r0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1);
        }

        public Object get() {
            return this.receiver.getClass().getSimpleName();
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C58891n> cls2 = C58891n.class;
        f168541d = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f168542e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f168543f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    /* renamed from: h */
    public final boolean mo84075h(C58891n nVar, C58891n nVar2) {
        boolean z;
        f168542e.lazySet(nVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168541d;
        atomicReferenceFieldUpdater.lazySet(nVar, nVar2);
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, nVar2, nVar)) {
                if (atomicReferenceFieldUpdater.get(this) != nVar2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return false;
        }
        nVar.mo84077k(nVar2);
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: f14.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: f14.n} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        r7 = f168541d;
        r4 = ((f14.C58905w) r4).f168559a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r7.compareAndSet(r3, r2, r4) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r7.get(r3) == r2) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0061, code lost:
        if (r5 != false) goto L_0x0064;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f14.C58891n mo84076j(f14.C58904v r11) {
        /*
            r10 = this;
        L_0x0000:
            java.lang.Object r0 = r10._prev
            f14.n r0 = (f14.C58891n) r0
            r1 = 0
            r2 = r0
        L_0x0006:
            r3 = r1
        L_0x0007:
            java.lang.Object r4 = r2._next
            r5 = 0
            r6 = 1
            if (r4 != r10) goto L_0x0024
            if (r0 != r2) goto L_0x0010
            return r2
        L_0x0010:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f168542e
        L_0x0012:
            boolean r1 = r7.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L_0x001a
            r5 = 1
            goto L_0x0020
        L_0x001a:
            java.lang.Object r1 = r7.get(r10)
            if (r1 == r0) goto L_0x0012
        L_0x0020:
            if (r5 != 0) goto L_0x0023
            goto L_0x0000
        L_0x0023:
            return r2
        L_0x0024:
            boolean r7 = r10.mo84074p()
            if (r7 == 0) goto L_0x002b
            return r1
        L_0x002b:
            if (r4 != r11) goto L_0x002e
            return r2
        L_0x002e:
            boolean r7 = r4 instanceof f14.C58904v
            if (r7 == 0) goto L_0x0047
            if (r11 == 0) goto L_0x0041
            r0 = r4
            f14.v r0 = (f14.C58904v) r0
            f14.c r1 = r11.mo84054a()
            if (r1 != 0) goto L_0x003e
            goto L_0x0041
        L_0x003e:
            r0.mo84054a()
        L_0x0041:
            f14.v r4 = (f14.C58904v) r4
            r4.mo84055b(r2)
            goto L_0x0000
        L_0x0047:
            boolean r7 = r4 instanceof f14.C58905w
            if (r7 == 0) goto L_0x006b
            if (r3 == 0) goto L_0x0066
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = f168541d
            f14.w r4 = (f14.C58905w) r4
            f14.n r4 = r4.f168559a
        L_0x0053:
            boolean r8 = r7.compareAndSet(r3, r2, r4)
            if (r8 == 0) goto L_0x005b
            r5 = 1
            goto L_0x0061
        L_0x005b:
            java.lang.Object r8 = r7.get(r3)
            if (r8 == r2) goto L_0x0053
        L_0x0061:
            if (r5 != 0) goto L_0x0064
            goto L_0x0000
        L_0x0064:
            r2 = r3
            goto L_0x0006
        L_0x0066:
            java.lang.Object r2 = r2._prev
            f14.n r2 = (f14.C58891n) r2
            goto L_0x0007
        L_0x006b:
            r3 = r4
            f14.n r3 = (f14.C58891n) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto L_0x0007
        */
        throw new UnsupportedOperationException("Method not decompiled: f14.C58891n.mo84076j(f14.v):f14.n");
    }

    /* renamed from: k */
    public final void mo84077k(C58891n nVar) {
        boolean z;
        do {
            C58891n nVar2 = (C58891n) nVar._prev;
            if (mo84078l() == nVar) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168542e;
                while (true) {
                    if (!atomicReferenceFieldUpdater.compareAndSet(nVar, nVar2, this)) {
                        if (atomicReferenceFieldUpdater.get(nVar) != nVar2) {
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
            } else {
                return;
            }
        } while (!z);
        if (mo84074p()) {
            nVar.mo84076j((C58904v) null);
        }
    }

    /* renamed from: l */
    public final Object mo84078l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C58904v)) {
                return obj;
            }
            ((C58904v) obj).mo84055b(this);
        }
    }

    /* renamed from: m */
    public final C58891n mo84079m() {
        C58891n nVar;
        Object l = mo84078l();
        C58905w wVar = l instanceof C58905w ? (C58905w) l : null;
        return (wVar == null || (nVar = wVar.f168559a) == null) ? (C58891n) l : nVar;
    }

    /* renamed from: n */
    public final C58891n mo84080n() {
        C58891n j = mo84076j((C58904v) null);
        if (j == null) {
            Object obj = this._prev;
            while (true) {
                j = (C58891n) obj;
                if (!j.mo84074p()) {
                    break;
                }
                obj = j._prev;
            }
        }
        return j;
    }

    /* renamed from: o */
    public final void mo84081o() {
        C58891n nVar = this;
        while (true) {
            Object l = nVar.mo84078l();
            if (l instanceof C58905w) {
                nVar = ((C58905w) l).f168559a;
            } else {
                nVar.mo84076j((C58904v) null);
                return;
            }
        }
    }

    /* renamed from: p */
    public boolean mo84074p() {
        return mo84078l() instanceof C58905w;
    }

    /* renamed from: q */
    public boolean mo75558q() {
        return mo84082r() == null;
    }

    /* renamed from: r */
    public final C58891n mo84082r() {
        C58891n nVar;
        boolean z;
        do {
            Object l = mo84078l();
            if (!(l instanceof C58905w)) {
                if (l != this) {
                    nVar = (C58891n) l;
                    C58905w wVar = (C58905w) nVar._removedRef;
                    if (wVar == null) {
                        wVar = new C58905w(nVar);
                        f168543f.lazySet(nVar, wVar);
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168541d;
                    while (true) {
                        if (!atomicReferenceFieldUpdater.compareAndSet(this, l, wVar)) {
                            if (atomicReferenceFieldUpdater.get(this) != l) {
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
                } else {
                    return (C58891n) l;
                }
            } else {
                return ((C58905w) l).f168559a;
            }
        } while (!z);
        nVar.mo84076j((C58904v) null);
        return null;
    }

    /* renamed from: s */
    public final int mo84083s(C58891n nVar, C58891n nVar2, C58892a aVar) {
        boolean z;
        f168542e.lazySet(nVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f168541d;
        atomicReferenceFieldUpdater.lazySet(nVar, nVar2);
        aVar.f168545c = nVar2;
        while (true) {
            if (!atomicReferenceFieldUpdater.compareAndSet(this, nVar2, aVar)) {
                if (atomicReferenceFieldUpdater.get(this) != nVar2) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return 0;
        }
        return aVar.mo84055b(this) == null ? 1 : 2;
    }

    public String toString() {
        return new C58894c(this) + '@' + C53942r0.m60572a(this);
    }
}

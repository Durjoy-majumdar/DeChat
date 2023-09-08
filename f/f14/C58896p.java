package f14;

import gy3.C8480h;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: f14.p */
public final class C58896p<E> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f168547e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f168548f;

    /* renamed from: g */
    public static final C58872c0 f168549g = new C58872c0("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    public final int f168550a;

    /* renamed from: b */
    public final boolean f168551b;

    /* renamed from: c */
    public final int f168552c;

    /* renamed from: d */
    public /* synthetic */ AtomicReferenceArray f168553d;

    /* renamed from: f14.p$a */
    public static final class C58897a {
        public C58897a(C8480h hVar) {
        }
    }

    /* renamed from: f14.p$b */
    public static final class C58898b {

        /* renamed from: a */
        public final int f168554a;

        public C58898b(int i) {
            this.f168554a = i;
        }
    }

    static {
        Class<C58896p> cls = C58896p.class;
        new C58897a((C8480h) null);
        f168547e = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f168548f = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C58896p(int i, boolean z) {
        this.f168550a = i;
        this.f168551b = z;
        int i2 = i - 1;
        this.f168552c = i2;
        this.f168553d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: a */
    public final int mo84088a(E e) {
        E e2 = e;
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f168552c;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (this.f168551b || this.f168553d.get(i2 & i3) == null) {
                if (f168548f.compareAndSet(this, j, (-1152921503533105153L & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                    this.f168553d.set(i2 & i3, e2);
                    C58896p pVar = this;
                    while ((pVar._state & 1152921504606846976L) != 0) {
                        pVar = pVar.mo84092e();
                        Object obj = pVar.f168553d.get(pVar.f168552c & i2);
                        if (!(obj instanceof C58898b) || ((C58898b) obj).f168554a != i2) {
                            pVar = null;
                            continue;
                        } else {
                            pVar.f168553d.set(pVar.f168552c & i2, e2);
                            continue;
                        }
                        if (pVar == null) {
                            break;
                        }
                    }
                    return 0;
                }
            } else {
                int i4 = this.f168550a;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            }
        }
        return 1;
    }

    /* renamed from: b */
    public final boolean mo84089b() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f168548f.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: c */
    public final int mo84090c() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: d */
    public final boolean mo84091d() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:3: B:16:0x0067->B:19:0x0072, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final f14.C58896p<E> mo84092e() {
        /*
            r10 = this;
        L_0x0000:
            long r2 = r10._state
            r0 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r4 = r2 & r0
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            long r6 = r2 | r0
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f168548f
            r1 = r10
            r4 = r6
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            r2 = r6
        L_0x001a:
            java.lang.Object r0 = r10._next
            f14.p r0 = (f14.C58896p) r0
            if (r0 == 0) goto L_0x0021
            return r0
        L_0x0021:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f168547e
            r1 = 0
            f14.p r4 = new f14.p
            int r5 = r10.f168550a
            int r5 = r5 * 2
            boolean r6 = r10.f168551b
            r4.<init>(r5, r6)
            r5 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r5 = r5 & r2
            r7 = 0
            long r5 = r5 >> r7
            int r6 = (int) r5
            r7 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r7 = r7 & r2
            r5 = 30
            long r7 = r7 >> r5
            int r5 = (int) r7
        L_0x0040:
            int r7 = r10.f168552c
            r8 = r6 & r7
            r7 = r7 & r5
            if (r8 == r7) goto L_0x005f
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r10.f168553d
            java.lang.Object r7 = r7.get(r8)
            if (r7 != 0) goto L_0x0054
            f14.p$b r7 = new f14.p$b
            r7.<init>(r6)
        L_0x0054:
            java.util.concurrent.atomic.AtomicReferenceArray r8 = r4.f168553d
            int r9 = r4.f168552c
            r9 = r9 & r6
            r8.set(r9, r7)
            int r6 = r6 + 1
            goto L_0x0040
        L_0x005f:
            r5 = -1152921504606846977(0xefffffffffffffff, double:-3.1050361846014175E231)
            long r5 = r5 & r2
            r4._state = r5
        L_0x0067:
            boolean r5 = r0.compareAndSet(r10, r1, r4)
            if (r5 == 0) goto L_0x006e
            goto L_0x001a
        L_0x006e:
            java.lang.Object r5 = r0.get(r10)
            if (r5 == 0) goto L_0x0067
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: f14.C58896p.mo84092e():f14.p");
    }

    /* renamed from: f */
    public final Object mo84093f() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f168549g;
            }
            int i = (int) ((j & 1073741823) >> 0);
            int i2 = this.f168552c;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f168553d.get(i4);
            if (obj == null) {
                if (this.f168551b) {
                    return null;
                }
            } else if (obj instanceof C58898b) {
                return null;
            } else {
                long j2 = ((long) ((i + 1) & 1073741823)) << 0;
                Object obj2 = obj;
                if (f168548f.compareAndSet(this, j, (j & -1073741824) | j2)) {
                    this.f168553d.set(this.f168552c & i, (Object) null);
                    return obj2;
                } else if (this.f168551b) {
                    C58896p pVar = this;
                    while (true) {
                        long j3 = pVar._state;
                        int i5 = (int) ((j3 & 1073741823) >> 0);
                        if ((j3 & 1152921504606846976L) != 0) {
                            pVar = pVar.mo84092e();
                        } else {
                            if (f168548f.compareAndSet(pVar, j3, (j3 & -1073741824) | j2)) {
                                pVar.f168553d.set(pVar.f168552c & i5, (Object) null);
                                pVar = null;
                            } else {
                                continue;
                            }
                        }
                        if (pVar == null) {
                            return obj2;
                        }
                    }
                }
            }
        }
    }
}

package k14;

import fy3.C32226l;
import gy3.C87413o;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rx3.C13598b0;

/* renamed from: k14.h */
public final class C60951h implements C60950g {

    /* renamed from: c */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f173589c;

    /* renamed from: d */
    public static final /* synthetic */ AtomicLongFieldUpdater f173590d;

    /* renamed from: e */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f173591e;

    /* renamed from: f */
    public static final /* synthetic */ AtomicLongFieldUpdater f173592f;

    /* renamed from: g */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f173593g;
    public volatile /* synthetic */ int _availablePermits;

    /* renamed from: a */
    public final int f173594a;

    /* renamed from: b */
    public final C32226l<Throwable, C13598b0> f173595b;
    private volatile /* synthetic */ long deqIdx = 0;
    private volatile /* synthetic */ long enqIdx = 0;
    private volatile /* synthetic */ Object head;
    private volatile /* synthetic */ Object tail;

    /* renamed from: k14.h$a */
    public static final class C60952a extends C87413o implements C32226l<Throwable, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60951h f173596d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60952a(C60951h hVar) {
            super(1);
            this.f173596d = hVar;
        }

        public Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            this.f173596d.release();
            return C13598b0.f38549a;
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<C60951h> cls2 = C60951h.class;
        f173589c = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "head");
        f173590d = AtomicLongFieldUpdater.newUpdater(cls2, "deqIdx");
        f173591e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "tail");
        f173592f = AtomicLongFieldUpdater.newUpdater(cls2, "enqIdx");
        f173593g = AtomicIntegerFieldUpdater.newUpdater(cls2, "_availablePermits");
    }

    public C60951h(int i, int i2) {
        this.f173594a = i;
        boolean z = true;
        if (i > 0) {
            if ((i2 < 0 || i2 > i) ? false : z) {
                C60954j jVar = new C60954j(0, (C60954j) null, 2);
                this.head = jVar;
                this.tail = jVar;
                this._availablePermits = i - i2;
                this.f173595b = new C60952a(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v2, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: k14.j} */
    /* JADX WARNING: type inference failed for: r8v12, types: [f14.z] */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0079, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x007a, code lost:
        continue;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x00e1 A[EDGE_INSN: B:87:0x00e1->B:65:0x00e1 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object mo85914a(wx3.C15601d<? super rx3.C13598b0> r17) {
        /*
            r16 = this;
            r0 = r16
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = f173593g
            int r1 = r1.getAndDecrement(r0)
            if (r1 <= 0) goto L_0x000d
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x000d:
            wx3.d r1 = xx3.C66447b.m78392b(r17)
            a14.m r1 = a14.C53929o.m60553a(r1)
        L_0x0015:
            java.lang.Object r2 = r0.tail
            k14.j r2 = (k14.C60954j) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f173592f
            long r3 = r3.getAndIncrement(r0)
            int r5 = k14.C60953i.f173602f
            long r5 = (long) r5
            long r5 = r3 / r5
        L_0x0024:
            r7 = r2
        L_0x0025:
            long r8 = r7.f168562c
            r10 = 0
            int r13 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r13 < 0) goto L_0x0032
            boolean r8 = r7.mo84058b()
            if (r8 == 0) goto L_0x003b
        L_0x0032:
            java.lang.Object r8 = f14.C58877f.m68710a(r7)
            f14.c0 r9 = f14.C58875e.f168512a
            if (r8 != r9) goto L_0x00f2
            r7 = r9
        L_0x003b:
            f14.c0 r8 = f14.C58875e.f168512a
            if (r7 != r8) goto L_0x0041
            r8 = 1
            goto L_0x0042
        L_0x0041:
            r8 = 0
        L_0x0042:
            if (r8 != 0) goto L_0x0087
            f14.z r8 = f14.C58869a0.m68703a(r7)
        L_0x0048:
            java.lang.Object r9 = r0.tail
            f14.z r9 = (f14.C58908z) r9
            long r13 = r9.f168562c
            long r11 = r8.f168562c
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 < 0) goto L_0x0055
            goto L_0x0079
        L_0x0055:
            boolean r11 = r8.mo84104g()
            if (r11 != 0) goto L_0x005d
            r8 = 0
            goto L_0x007a
        L_0x005d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = f173591e
        L_0x005f:
            boolean r12 = r11.compareAndSet(r0, r9, r8)
            if (r12 == 0) goto L_0x0067
            r11 = 1
            goto L_0x006e
        L_0x0067:
            java.lang.Object r12 = r11.get(r0)
            if (r12 == r9) goto L_0x005f
            r11 = 0
        L_0x006e:
            if (r11 == 0) goto L_0x007d
            boolean r8 = r9.mo84102e()
            if (r8 == 0) goto L_0x0079
            r9.mo84060d()
        L_0x0079:
            r8 = 1
        L_0x007a:
            if (r8 == 0) goto L_0x0024
            goto L_0x0087
        L_0x007d:
            boolean r9 = r8.mo84102e()
            if (r9 == 0) goto L_0x0048
            r8.mo84060d()
            goto L_0x0048
        L_0x0087:
            f14.z r2 = f14.C58869a0.m68703a(r7)
            r9 = r2
            k14.j r9 = (k14.C60954j) r9
            int r2 = k14.C60953i.f173602f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r11 = (int) r3
            java.util.concurrent.atomic.AtomicReferenceArray r12 = r9.f173603e
        L_0x0095:
            boolean r2 = r12.compareAndSet(r11, r10, r1)
            if (r2 == 0) goto L_0x009d
            r2 = 1
            goto L_0x00a4
        L_0x009d:
            java.lang.Object r2 = r12.get(r11)
            if (r2 == 0) goto L_0x0095
            r2 = 0
        L_0x00a4:
            if (r2 == 0) goto L_0x00af
            k14.a r2 = new k14.a
            r2.<init>(r9, r11)
            r1.mo74599v(r2)
            goto L_0x00cd
        L_0x00af:
            f14.c0 r2 = k14.C60953i.f173598b
            f14.c0 r3 = k14.C60953i.f173599c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r9.f173603e
        L_0x00b5:
            boolean r5 = r4.compareAndSet(r11, r2, r3)
            if (r5 == 0) goto L_0x00bd
            r2 = 1
            goto L_0x00c4
        L_0x00bd:
            java.lang.Object r5 = r4.get(r11)
            if (r5 == r2) goto L_0x00b5
            r2 = 0
        L_0x00c4:
            if (r2 == 0) goto L_0x00cf
            rx3.b0 r2 = rx3.C13598b0.f38549a
            fy3.l<java.lang.Throwable, rx3.b0> r3 = r0.f173595b
            r1.mo74596X(r2, r3)
        L_0x00cd:
            r11 = 1
            goto L_0x00d0
        L_0x00cf:
            r11 = 0
        L_0x00d0:
            if (r11 != 0) goto L_0x00e1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = f173593g
            int r2 = r2.getAndDecrement(r0)
            if (r2 <= 0) goto L_0x0015
            rx3.b0 r2 = rx3.C13598b0.f38549a
            fy3.l<java.lang.Throwable, rx3.b0> r3 = r0.f173595b
            r1.mo74596X(r2, r3)
        L_0x00e1:
            java.lang.Object r1 = r1.mo74608o()
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            if (r1 != r2) goto L_0x00ea
            goto L_0x00ec
        L_0x00ea:
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x00ec:
            if (r1 != r2) goto L_0x00ef
            return r1
        L_0x00ef:
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        L_0x00f2:
            f14.f r8 = (f14.C58877f) r8
            f14.z r8 = (f14.C58908z) r8
            if (r8 == 0) goto L_0x00fb
            r7 = r8
            goto L_0x0025
        L_0x00fb:
            long r8 = r7.f168562c
            r11 = 1
            long r8 = r8 + r11
            r11 = r7
            k14.j r11 = (k14.C60954j) r11
            k14.j r12 = new k14.j
            r13 = 0
            r12.<init>(r8, r11, r13)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = f14.C58877f.f168514a
        L_0x010b:
            boolean r9 = r8.compareAndSet(r7, r10, r12)
            if (r9 == 0) goto L_0x0113
            r11 = 1
            goto L_0x011a
        L_0x0113:
            java.lang.Object r9 = r8.get(r7)
            if (r9 == 0) goto L_0x010b
            r11 = 0
        L_0x011a:
            if (r11 == 0) goto L_0x0025
            boolean r8 = r7.mo84058b()
            if (r8 == 0) goto L_0x0125
            r7.mo84060d()
        L_0x0125:
            r7 = r12
            goto L_0x0025
        */
        throw new UnsupportedOperationException("Method not decompiled: k14.C60951h.mo85914a(wx3.d):java.lang.Object");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v19, resolved type: k14.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: k14.j} */
    /* JADX WARNING: type inference failed for: r9v13, types: [f14.z] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r17 = this;
            r0 = r17
        L_0x0002:
            int r1 = r0._availablePermits
            int r2 = r0.f173594a
            r3 = 0
            r4 = 1
            if (r1 >= r2) goto L_0x000c
            r2 = 1
            goto L_0x000d
        L_0x000c:
            r2 = 0
        L_0x000d:
            if (r2 == 0) goto L_0x0126
            int r2 = r1 + 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r5 = f173593g
            boolean r2 = r5.compareAndSet(r0, r1, r2)
            if (r2 == 0) goto L_0x0002
            if (r1 < 0) goto L_0x001c
            return
        L_0x001c:
            java.lang.Object r1 = r0.head
            k14.j r1 = (k14.C60954j) r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f173590d
            long r5 = r2.getAndIncrement(r0)
            int r2 = k14.C60953i.f173602f
            long r7 = (long) r2
            long r7 = r5 / r7
        L_0x002b:
            r2 = r1
        L_0x002c:
            long r9 = r2.f168562c
            r11 = 0
            int r12 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r12 < 0) goto L_0x0039
            boolean r9 = r2.mo84058b()
            if (r9 == 0) goto L_0x0042
        L_0x0039:
            java.lang.Object r9 = f14.C58877f.m68710a(r2)
            f14.c0 r10 = f14.C58875e.f168512a
            if (r9 != r10) goto L_0x00f1
            r2 = r10
        L_0x0042:
            f14.c0 r9 = f14.C58875e.f168512a
            if (r2 != r9) goto L_0x0048
            r9 = 1
            goto L_0x0049
        L_0x0048:
            r9 = 0
        L_0x0049:
            if (r9 != 0) goto L_0x008e
            f14.z r9 = f14.C58869a0.m68703a(r2)
        L_0x004f:
            java.lang.Object r10 = r0.head
            f14.z r10 = (f14.C58908z) r10
            long r12 = r10.f168562c
            long r14 = r9.f168562c
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 < 0) goto L_0x005c
            goto L_0x0080
        L_0x005c:
            boolean r12 = r9.mo84104g()
            if (r12 != 0) goto L_0x0064
            r9 = 0
            goto L_0x0081
        L_0x0064:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = f173589c
        L_0x0066:
            boolean r13 = r12.compareAndSet(r0, r10, r9)
            if (r13 == 0) goto L_0x006e
            r12 = 1
            goto L_0x0075
        L_0x006e:
            java.lang.Object r13 = r12.get(r0)
            if (r13 == r10) goto L_0x0066
            r12 = 0
        L_0x0075:
            if (r12 == 0) goto L_0x0084
            boolean r9 = r10.mo84102e()
            if (r9 == 0) goto L_0x0080
            r10.mo84060d()
        L_0x0080:
            r9 = 1
        L_0x0081:
            if (r9 == 0) goto L_0x002b
            goto L_0x008e
        L_0x0084:
            boolean r10 = r9.mo84102e()
            if (r10 == 0) goto L_0x004f
            r9.mo84060d()
            goto L_0x004f
        L_0x008e:
            f14.z r1 = f14.C58869a0.m68703a(r2)
            k14.j r1 = (k14.C60954j) r1
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f14.C58877f.f168515b
            r2.lazySet(r1, r11)
            long r9 = r1.f168562c
            int r2 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x00a0
            goto L_0x00ee
        L_0x00a0:
            int r2 = k14.C60953i.f173602f
            long r7 = (long) r2
            long r5 = r5 % r7
            int r2 = (int) r5
            f14.c0 r5 = k14.C60953i.f173598b
            java.util.concurrent.atomic.AtomicReferenceArray r6 = r1.f173603e
            java.lang.Object r5 = r6.getAndSet(r2, r5)
            if (r5 != 0) goto L_0x00d8
            int r5 = k14.C60953i.f173597a
            r6 = 0
        L_0x00b2:
            if (r6 >= r5) goto L_0x00c2
            java.util.concurrent.atomic.AtomicReferenceArray r7 = r1.f173603e
            java.lang.Object r7 = r7.get(r2)
            f14.c0 r8 = k14.C60953i.f173599c
            if (r7 != r8) goto L_0x00bf
            goto L_0x00ed
        L_0x00bf:
            int r6 = r6 + 1
            goto L_0x00b2
        L_0x00c2:
            f14.c0 r6 = k14.C60953i.f173598b
            f14.c0 r7 = k14.C60953i.f173600d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.f173603e
        L_0x00c8:
            boolean r5 = r1.compareAndSet(r2, r6, r7)
            if (r5 == 0) goto L_0x00d0
            r3 = 1
            goto L_0x00d6
        L_0x00d0:
            java.lang.Object r5 = r1.get(r2)
            if (r5 == r6) goto L_0x00c8
        L_0x00d6:
            r3 = r3 ^ r4
            goto L_0x00ee
        L_0x00d8:
            f14.c0 r1 = k14.C60953i.f173601e
            if (r5 != r1) goto L_0x00dd
            goto L_0x00ee
        L_0x00dd:
            a14.l r5 = (a14.C53916l) r5
            rx3.b0 r1 = rx3.C13598b0.f38549a
            fy3.l<java.lang.Throwable, rx3.b0> r2 = r0.f173595b
            java.lang.Object r1 = r5.mo74594U(r1, r11, r2)
            if (r1 != 0) goto L_0x00ea
            goto L_0x00ee
        L_0x00ea:
            r5.mo74592K(r1)
        L_0x00ed:
            r3 = 1
        L_0x00ee:
            if (r3 == 0) goto L_0x0002
            return
        L_0x00f1:
            f14.f r9 = (f14.C58877f) r9
            f14.z r9 = (f14.C58908z) r9
            if (r9 == 0) goto L_0x00fa
            r2 = r9
            goto L_0x002c
        L_0x00fa:
            long r9 = r2.f168562c
            r12 = 1
            long r9 = r9 + r12
            r12 = r2
            k14.j r12 = (k14.C60954j) r12
            k14.j r13 = new k14.j
            r13.<init>(r9, r12, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9 = f14.C58877f.f168514a
        L_0x0109:
            boolean r10 = r9.compareAndSet(r2, r11, r13)
            if (r10 == 0) goto L_0x0111
            r9 = 1
            goto L_0x0118
        L_0x0111:
            java.lang.Object r10 = r9.get(r2)
            if (r10 == 0) goto L_0x0109
            r9 = 0
        L_0x0118:
            if (r9 == 0) goto L_0x002c
            boolean r9 = r2.mo84058b()
            if (r9 == 0) goto L_0x0123
            r2.mo84060d()
        L_0x0123:
            r2 = r13
            goto L_0x002c
        L_0x0126:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r0.f173594a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: k14.C60951h.release():void");
    }
}

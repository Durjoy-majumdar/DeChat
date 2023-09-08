package p241t0;

import fy3.C32227p;
import gy3.C87412m;
import hy3.C33145a;
import java.util.ArrayList;
import java.util.Iterator;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C110821n;
import sx3.C36907w;
import wx3.C15601d;
import xx3.C66447b;
import y04.C66485i;
import y04.C66486j;
import yx3.C91590f;
import yx3.C91593i;

/* renamed from: t0.k */
public final class C110860k implements Iterable<Integer>, C33145a {

    /* renamed from: h */
    public static final C110860k f331631h = new C110860k(0, 0, 0, (int[]) null);

    /* renamed from: d */
    public final long f331632d;

    /* renamed from: e */
    public final long f331633e;

    /* renamed from: f */
    public final int f331634f;

    /* renamed from: g */
    public final int[] f331635g;

    @C91590f(mo125468c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", mo125469f = "SnapshotIdSet.kt", mo125470l = {295, 300, 307}, mo125471m = "invokeSuspend")
    /* renamed from: t0.k$a */
    public static final class C110861a extends C91593i implements C32227p<C66486j<? super Integer>, C15601d<? super C13598b0>, Object> {

        /* renamed from: e */
        public Object f331636e;

        /* renamed from: f */
        public int f331637f;

        /* renamed from: g */
        public int f331638g;

        /* renamed from: h */
        public int f331639h;

        /* renamed from: i */
        public /* synthetic */ Object f331640i;

        /* renamed from: j */
        public final /* synthetic */ C110860k f331641j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C110861a(C110860k kVar, C15601d<? super C110861a> dVar) {
            super(2, dVar);
            this.f331641j = kVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C110861a aVar = new C110861a(this.f331641j, dVar);
            aVar.f331640i = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C110861a) create((C66486j) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0060  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0087  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00b2  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00bb  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00c0  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f331639h
                r3 = 0
                r4 = 1
                r6 = 3
                r7 = 2
                r8 = 64
                r10 = 0
                r12 = 1
                if (r2 == 0) goto L_0x004b
                if (r2 == r12) goto L_0x003a
                if (r2 == r7) goto L_0x002e
                if (r2 != r6) goto L_0x0026
                int r2 = r0.f331637f
                java.lang.Object r7 = r0.f331640i
                y04.j r7 = (y04.C66486j) r7
                kotlin.ResultKt.throwOnFailure(r20)
                r9 = r2
                r13 = 3
                r2 = r0
                goto L_0x00e6
            L_0x0026:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x002e:
                int r2 = r0.f331637f
                java.lang.Object r13 = r0.f331640i
                y04.j r13 = (y04.C66486j) r13
                kotlin.ResultKt.throwOnFailure(r20)
                r9 = r0
                goto L_0x00af
            L_0x003a:
                int r2 = r0.f331638g
                int r13 = r0.f331637f
                java.lang.Object r14 = r0.f331636e
                int[] r14 = (int[]) r14
                java.lang.Object r15 = r0.f331640i
                y04.j r15 = (y04.C66486j) r15
                kotlin.ResultKt.throwOnFailure(r20)
                r9 = r0
                goto L_0x0078
            L_0x004b:
                kotlin.ResultKt.throwOnFailure(r20)
                java.lang.Object r2 = r0.f331640i
                y04.j r2 = (y04.C66486j) r2
                t0.k r13 = r0.f331641j
                int[] r13 = r13.f331635g
                if (r13 == 0) goto L_0x007e
                int r14 = r13.length
                r9 = r0
                r15 = r2
                r2 = r14
                r14 = r13
                r13 = 0
            L_0x005e:
                if (r13 >= r2) goto L_0x007c
                r6 = r14[r13]
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                r9.f331640i = r15
                r9.f331636e = r14
                r9.f331637f = r13
                r9.f331638g = r2
                r9.f331639h = r12
                java.lang.Object r6 = r15.mo90571e(r7, r9)
                if (r6 != r1) goto L_0x0078
                return r1
            L_0x0078:
                int r13 = r13 + r12
                r6 = 3
                r7 = 2
                goto L_0x005e
            L_0x007c:
                r2 = r15
                goto L_0x007f
            L_0x007e:
                r9 = r0
            L_0x007f:
                t0.k r6 = r9.f331641j
                long r6 = r6.f331633e
                int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r13 == 0) goto L_0x00b3
                r13 = r2
                r2 = 0
            L_0x0089:
                if (r2 >= r8) goto L_0x00b2
                t0.k r6 = r9.f331641j
                long r14 = r6.f331633e
                long r17 = r4 << r2
                long r14 = r14 & r17
                int r7 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
                if (r7 == 0) goto L_0x00af
                int r6 = r6.f331634f
                int r6 = r6 + r2
                java.lang.Integer r7 = new java.lang.Integer
                r7.<init>(r6)
                r9.f331640i = r13
                r9.f331636e = r3
                r9.f331637f = r2
                r6 = 2
                r9.f331639h = r6
                java.lang.Object r7 = r13.mo90571e(r7, r9)
                if (r7 != r1) goto L_0x00b0
                return r1
            L_0x00af:
                r6 = 2
            L_0x00b0:
                int r2 = r2 + r12
                goto L_0x0089
            L_0x00b2:
                r2 = r13
            L_0x00b3:
                t0.k r6 = r9.f331641j
                long r6 = r6.f331632d
                int r13 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r13 == 0) goto L_0x00e8
                r7 = r2
                r2 = r9
                r9 = 0
            L_0x00be:
                if (r9 >= r8) goto L_0x00e8
                t0.k r6 = r2.f331641j
                long r13 = r6.f331632d
                long r15 = r4 << r9
                long r13 = r13 & r15
                int r15 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
                if (r15 == 0) goto L_0x00e5
                int r13 = r9 + 64
                int r6 = r6.f331634f
                int r13 = r13 + r6
                java.lang.Integer r6 = new java.lang.Integer
                r6.<init>(r13)
                r2.f331640i = r7
                r2.f331636e = r3
                r2.f331637f = r9
                r13 = 3
                r2.f331639h = r13
                java.lang.Object r6 = r7.mo90571e(r6, r2)
                if (r6 != r1) goto L_0x00e6
                return r1
            L_0x00e5:
                r13 = 3
            L_0x00e6:
                int r9 = r9 + r12
                goto L_0x00be
            L_0x00e8:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p241t0.C110860k.C110861a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C110860k(long j, long j2, int i, int[] iArr) {
        this.f331632d = j;
        this.f331633e = j2;
        this.f331634f = i;
        this.f331635g = iArr;
    }

    /* renamed from: f */
    public final C110860k mo162505f(C110860k kVar) {
        int[] iArr;
        C87412m.m108594g(kVar, "bits");
        C110860k kVar2 = f331631h;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        int i = kVar.f331634f;
        int i2 = this.f331634f;
        if (i == i2 && kVar.f331635g == (iArr = this.f331635g)) {
            return new C110860k(this.f331632d & (~kVar.f331632d), this.f331633e & (~kVar.f331633e), i2, iArr);
        }
        Iterator it = kVar.iterator();
        C110860k kVar3 = this;
        while (it.hasNext()) {
            kVar3 = kVar3.mo162506i(((Number) it.next()).intValue());
        }
        return kVar3;
    }

    /* renamed from: i */
    public final C110860k mo162506i(int i) {
        int[] iArr;
        int b;
        int i2 = i;
        int i3 = this.f331634f;
        int i4 = i2 - i3;
        if (i4 >= 0 && i4 < 64) {
            long j = 1 << i4;
            long j2 = this.f331633e;
            if ((j2 & j) != 0) {
                return new C110860k(this.f331632d, j2 & (~j), i3, this.f331635g);
            }
        } else if (i4 >= 64 && i4 < 128) {
            long j3 = 1 << (i4 - 64);
            long j4 = this.f331632d;
            if ((j4 & j3) != 0) {
                return new C110860k(j4 & (~j3), this.f331633e, i3, this.f331635g);
            }
        } else if (i4 < 0 && (iArr = this.f331635g) != null && (b = C110863l.m151125b(iArr, i2)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new C110860k(this.f331632d, this.f331633e, this.f331634f, (int[]) null);
            }
            int[] iArr2 = new int[length];
            if (b > 0) {
                C110821n.m150962i(iArr, iArr2, 0, 0, b);
            }
            if (b < length) {
                C110821n.m150962i(iArr, iArr2, b, b + 1, length + 1);
            }
            return new C110860k(this.f331632d, this.f331633e, this.f331634f, iArr2);
        }
        return this;
    }

    public Iterator<Integer> iterator() {
        C110861a aVar = new C110861a(this, (C15601d<? super C110861a>) null);
        C66485i iVar = new C66485i();
        iVar.f191267f = C66447b.m78391a(aVar, iVar, iVar);
        return iVar;
    }

    /* renamed from: k */
    public final boolean mo162508k(int i) {
        int[] iArr;
        int i2 = i - this.f331634f;
        boolean z = true;
        if (i2 >= 0 && i2 < 64) {
            return ((1 << i2) & this.f331633e) != 0;
        }
        if (i2 >= 64 && i2 < 128) {
            return ((1 << (i2 - 64)) & this.f331632d) != 0;
        }
        if (i2 > 0 || (iArr = this.f331635g) == null) {
            return false;
        }
        if (C110863l.m151125b(iArr, i) < 0) {
            z = false;
        }
        return z;
    }

    /* renamed from: l */
    public final C110860k mo162509l(C110860k kVar) {
        int[] iArr;
        C87412m.m108594g(kVar, "bits");
        C110860k kVar2 = f331631h;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        int i = kVar.f331634f;
        int i2 = this.f331634f;
        if (i == i2 && kVar.f331635g == (iArr = this.f331635g)) {
            return new C110860k(this.f331632d | kVar.f331632d, this.f331633e | kVar.f331633e, i2, iArr);
        }
        if (this.f331635g == null) {
            Iterator it = iterator();
            while (it.hasNext()) {
                kVar = kVar.mo162510m(((Number) it.next()).intValue());
            }
            return kVar;
        }
        Iterator it4 = kVar.iterator();
        C110860k kVar3 = this;
        while (it4.hasNext()) {
            kVar3 = kVar3.mo162510m(((Number) it4.next()).intValue());
        }
        return kVar3;
    }

    /* renamed from: m */
    public final C110860k mo162510m(int i) {
        int i2;
        int i3 = i;
        int i4 = this.f331634f;
        int i5 = i3 - i4;
        long j = 0;
        if (i5 >= 0 && i5 < 64) {
            long j2 = 1 << i5;
            long j3 = this.f331633e;
            if ((j3 & j2) == 0) {
                return new C110860k(this.f331632d, j3 | j2, i4, this.f331635g);
            }
        } else if (i5 >= 64 && i5 < 128) {
            long j4 = 1 << (i5 - 64);
            long j5 = this.f331632d;
            if ((j5 & j4) == 0) {
                return new C110860k(j5 | j4, this.f331633e, i4, this.f331635g);
            }
        } else if (i5 < 128) {
            int[] iArr = this.f331635g;
            if (iArr == null) {
                return new C110860k(this.f331632d, this.f331633e, i4, new int[]{i3});
            }
            int b = C110863l.m151125b(iArr, i3);
            if (b < 0) {
                int i6 = -(b + 1);
                int length = iArr.length + 1;
                int[] iArr2 = new int[length];
                C110821n.m150962i(iArr, iArr2, 0, 0, i6);
                C110821n.m150962i(iArr, iArr2, i6 + 1, i6, length - 1);
                iArr2[i6] = i3;
                return new C110860k(this.f331632d, this.f331633e, this.f331634f, iArr2);
            }
        } else if (!mo162508k(i)) {
            long j6 = this.f331632d;
            long j7 = this.f331633e;
            int i7 = this.f331634f;
            ArrayList arrayList = null;
            int i8 = ((i3 + 1) / 64) * 64;
            long j8 = j7;
            long j9 = j6;
            while (true) {
                if (i7 >= i8) {
                    i2 = i7;
                    break;
                }
                if (j8 != j) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        int[] iArr3 = this.f331635g;
                        if (iArr3 != null) {
                            for (int valueOf : iArr3) {
                                arrayList.add(Integer.valueOf(valueOf));
                            }
                        }
                    }
                    for (int i9 = 0; i9 < 64; i9++) {
                        if (((1 << i9) & j8) != 0) {
                            arrayList.add(Integer.valueOf(i9 + i7));
                        }
                    }
                    j = 0;
                }
                if (j9 == j) {
                    j8 = j;
                    i2 = i8;
                    break;
                }
                i7 += 64;
                j8 = j9;
                j9 = j;
            }
            return new C110860k(j9, j8, i2, arrayList != null ? C110818d0.m150952x0(arrayList) : this.f331635g).mo162510m(i3);
        }
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(" [");
        ArrayList arrayList = new ArrayList(C36907w.m41090l(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb4.append(", ");
            }
            if (obj != null) {
                z = obj instanceof CharSequence;
            }
            if (z) {
                sb4.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb4.append(((Character) obj).charValue());
            } else {
                sb4.append(String.valueOf(obj));
            }
        }
        sb4.append("");
        String sb5 = sb4.toString();
        C87412m.m108593f(sb5, "fastJoinTo(StringBuilder…form)\n        .toString()");
        sb.append(sb5);
        sb.append(']');
        return sb.toString();
    }
}

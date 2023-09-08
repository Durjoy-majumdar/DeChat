package fz3;

import fy3.C32226l;
import gy3.C87412m;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import nz3.C25269j;
import nz3.C25270k;
import sx3.C110818d0;
import vz3.C22826c;

/* renamed from: fz3.b */
public abstract class C24496b<TAnnotation> {
    @Deprecated

    /* renamed from: c */
    public static final Map<String, C24498c> f70006c;

    /* renamed from: a */
    public final C24494a0 f70007a;

    /* renamed from: b */
    public final ConcurrentHashMap<Object, TAnnotation> f70008b = new ConcurrentHashMap<>();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C24498c cVar : C24498c.values()) {
            String str = cVar.f70016d;
            if (linkedHashMap.get(str) == null) {
                linkedHashMap.put(str, cVar);
            }
        }
        f70006c = linkedHashMap;
    }

    public C24496b(C24494a0 a0Var) {
        C87412m.m108594g(a0Var, "javaTypeEnhancementState");
        this.f70007a = a0Var;
    }

    /* renamed from: a */
    public abstract Iterable<String> mo51181a(TAnnotation tannotation, boolean z);

    /* JADX WARNING: Removed duplicated region for block: B:108:0x001f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018b  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final fz3.C24497b0 mo51182b(fz3.C24497b0 r24, java.lang.Iterable<? extends TAnnotation> r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            fz3.k0 r2 = fz3.C24507k0.WARN
            fz3.k0 r3 = fz3.C24507k0.IGNORE
            java.lang.String r4 = "annotations"
            r5 = r25
            gy3.C87412m.m108594g(r5, r4)
            fz3.a0 r4 = r0.f70007a
            boolean r4 = r4.f70004c
            if (r4 == 0) goto L_0x0016
            return r1
        L_0x0016:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r25.iterator()
        L_0x001f:
            boolean r6 = r5.hasNext()
            r8 = 1
            if (r6 == 0) goto L_0x0190
            java.lang.Object r6 = r5.next()
            fz3.a0 r9 = r0.f70007a
            boolean r9 = r9.f70004c
            r10 = 0
            if (r9 == 0) goto L_0x0032
            goto L_0x008e
        L_0x0032:
            java.util.Map<vz3.c, fz3.u> r9 = fz3.C24500d.f70024g
            vz3.c r11 = r0.mo51185e(r6)
            java.util.LinkedHashMap r9 = (java.util.LinkedHashMap) r9
            java.lang.Object r9 = r9.get(r11)
            fz3.u r9 = (fz3.C24516u) r9
            if (r9 == 0) goto L_0x008e
            vz3.c r11 = r0.mo51185e(r6)
            if (r11 == 0) goto L_0x005b
            java.util.Map<vz3.c, fz3.u> r12 = fz3.C24500d.f70023f
            boolean r12 = r12.containsKey(r11)
            if (r12 == 0) goto L_0x005b
            fz3.a0 r12 = r0.f70007a
            fy3.l<vz3.c, fz3.k0> r12 = r12.f70003b
            java.lang.Object r11 = r12.invoke(r11)
            fz3.k0 r11 = (fz3.C24507k0) r11
            goto L_0x0068
        L_0x005b:
            fz3.k0 r11 = r0.mo51190j(r6)
            if (r11 == 0) goto L_0x0062
            goto L_0x0068
        L_0x0062:
            fz3.a0 r11 = r0.f70007a
            fz3.d0 r11 = r11.f70002a
            fz3.k0 r11 = r11.f70026a
        L_0x0068:
            if (r11 == r3) goto L_0x006c
            r12 = 1
            goto L_0x006d
        L_0x006c:
            r12 = 0
        L_0x006d:
            if (r12 == 0) goto L_0x0070
            goto L_0x0071
        L_0x0070:
            r11 = r10
        L_0x0071:
            if (r11 != 0) goto L_0x0074
            goto L_0x008e
        L_0x0074:
            nz3.k r12 = r9.f70073a
            if (r11 != r2) goto L_0x007a
            r11 = 1
            goto L_0x007b
        L_0x007a:
            r11 = 0
        L_0x007b:
            nz3.k r11 = nz3.C25270k.m32202a(r12, r10, r11, r8, r10)
            java.util.Collection<fz3.c> r12 = r9.f70074b
            boolean r9 = r9.f70075c
            java.lang.String r13 = "qualifierApplicabilityTypes"
            gy3.C87412m.m108594g(r12, r13)
            fz3.u r13 = new fz3.u
            r13.<init>(r11, r12, r9)
            goto L_0x008f
        L_0x008e:
            r13 = r10
        L_0x008f:
            if (r13 == 0) goto L_0x0094
            r10 = r13
            goto L_0x0189
        L_0x0094:
            fz3.a0 r9 = r0.f70007a
            fz3.d0 r9 = r9.f70002a
            boolean r9 = r9.f70029d
            if (r9 == 0) goto L_0x009d
            goto L_0x00c7
        L_0x009d:
            vz3.c r9 = fz3.C24500d.f70020c
            java.lang.Object r9 = r0.mo51184d(r6, r9)
            if (r9 != 0) goto L_0x00a6
            goto L_0x00c7
        L_0x00a6:
            java.lang.Iterable r11 = r0.mo51187g(r6)
            java.util.Iterator r11 = r11.iterator()
        L_0x00ae:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00c4
            java.lang.Object r12 = r11.next()
            java.lang.Object r13 = r0.mo51191k(r12)
            if (r13 == 0) goto L_0x00c0
            r13 = 1
            goto L_0x00c1
        L_0x00c0:
            r13 = 0
        L_0x00c1:
            if (r13 == 0) goto L_0x00ae
            goto L_0x00c5
        L_0x00c4:
            r12 = r10
        L_0x00c5:
            if (r12 != 0) goto L_0x00ca
        L_0x00c7:
            r9 = r10
            goto L_0x013f
        L_0x00ca:
            java.lang.Iterable r9 = r0.mo51181a(r9, r8)
            java.util.LinkedHashSet r11 = new java.util.LinkedHashSet
            r11.<init>()
            java.util.Iterator r9 = r9.iterator()
        L_0x00d7:
            boolean r13 = r9.hasNext()
            if (r13 == 0) goto L_0x00f3
            java.lang.Object r13 = r9.next()
            java.lang.String r13 = (java.lang.String) r13
            java.util.Map<java.lang.String, fz3.c> r14 = f70006c
            java.util.LinkedHashMap r14 = (java.util.LinkedHashMap) r14
            java.lang.Object r13 = r14.get(r13)
            fz3.c r13 = (fz3.C24498c) r13
            if (r13 == 0) goto L_0x00d7
            r11.add(r13)
            goto L_0x00d7
        L_0x00f3:
            rx3.l r9 = new rx3.l
            fz3.c r13 = fz3.C24498c.TYPE_USE
            boolean r13 = r11.contains(r13)
            if (r13 == 0) goto L_0x013c
            fz3.c[] r13 = fz3.C24498c.values()
            java.util.Set r13 = sx3.C110823p.m151004d0(r13)
            fz3.c r14 = fz3.C24498c.TYPE_PARAMETER_BOUNDS
            java.util.LinkedHashSet r15 = new java.util.LinkedHashSet
            int r16 = r13.size()
            int r7 = sx3.C90363p0.m113142a(r16)
            r15.<init>(r7)
            java.util.Iterator r7 = r13.iterator()
            r13 = 0
        L_0x0119:
            boolean r16 = r7.hasNext()
            if (r16 == 0) goto L_0x0138
            java.lang.Object r8 = r7.next()
            if (r13 != 0) goto L_0x012f
            boolean r17 = gy3.C87412m.m108589b(r8, r14)
            if (r17 == 0) goto L_0x012f
            r13 = 1
            r17 = 0
            goto L_0x0131
        L_0x012f:
            r17 = 1
        L_0x0131:
            if (r17 == 0) goto L_0x0136
            r15.add(r8)
        L_0x0136:
            r8 = 1
            goto L_0x0119
        L_0x0138:
            java.util.Set r11 = sx3.C48501y0.m53872g(r15, r11)
        L_0x013c:
            r9.<init>(r12, r11)
        L_0x013f:
            if (r9 != 0) goto L_0x0142
            goto L_0x0189
        L_0x0142:
            A r7 = r9.f38555d
            B r8 = r9.f38556e
            r19 = r8
            java.util.Set r19 = (java.util.Set) r19
            fz3.k0 r6 = r0.mo51190j(r6)
            if (r6 != 0) goto L_0x015d
            fz3.k0 r6 = r0.mo51190j(r7)
            if (r6 == 0) goto L_0x0157
            goto L_0x015d
        L_0x0157:
            fz3.a0 r6 = r0.f70007a
            fz3.d0 r6 = r6.f70002a
            fz3.k0 r6 = r6.f70026a
        L_0x015d:
            r6.getClass()
            if (r6 != r3) goto L_0x0164
            r8 = 1
            goto L_0x0165
        L_0x0164:
            r8 = 0
        L_0x0165:
            if (r8 == 0) goto L_0x0168
            goto L_0x0189
        L_0x0168:
            fz3.a r8 = fz3.C8222a.f27148d
            nz3.k r7 = r0.mo51183c(r7, r8)
            if (r7 != 0) goto L_0x0171
            goto L_0x0189
        L_0x0171:
            fz3.u r8 = new fz3.u
            if (r6 != r2) goto L_0x0177
            r6 = 1
            goto L_0x0178
        L_0x0177:
            r6 = 0
        L_0x0178:
            r9 = 1
            nz3.k r18 = nz3.C25270k.m32202a(r7, r10, r6, r9, r10)
            r20 = 0
            r21 = 4
            r22 = 0
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22)
            r10 = r8
        L_0x0189:
            if (r10 == 0) goto L_0x001f
            r4.add(r10)
            goto L_0x001f
        L_0x0190:
            r9 = 1
            boolean r2 = r4.isEmpty()
            if (r2 == 0) goto L_0x0198
            return r1
        L_0x0198:
            if (r1 == 0) goto L_0x01a4
            java.util.EnumMap<fz3.c, fz3.u> r2 = r1.f70009a
            if (r2 == 0) goto L_0x01a4
            java.util.EnumMap r3 = new java.util.EnumMap
            r3.<init>(r2)
            goto L_0x01ab
        L_0x01a4:
            java.util.EnumMap r3 = new java.util.EnumMap
            java.lang.Class<fz3.c> r2 = fz3.C24498c.class
            r3.<init>(r2)
        L_0x01ab:
            java.util.Iterator r2 = r4.iterator()
            r7 = 0
        L_0x01b0:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01d3
            java.lang.Object r4 = r2.next()
            fz3.u r4 = (fz3.C24516u) r4
            java.util.Collection<fz3.c> r5 = r4.f70074b
            java.util.Iterator r5 = r5.iterator()
        L_0x01c2:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x01b0
            java.lang.Object r6 = r5.next()
            fz3.c r6 = (fz3.C24498c) r6
            r3.put(r6, r4)
            r7 = 1
            goto L_0x01c2
        L_0x01d3:
            if (r7 != 0) goto L_0x01d6
            goto L_0x01db
        L_0x01d6:
            fz3.b0 r1 = new fz3.b0
            r1.<init>(r3)
        L_0x01db:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fz3.C24496b.mo51182b(fz3.b0, java.lang.Iterable):fz3.b0");
    }

    /* renamed from: c */
    public final C25270k mo51183c(TAnnotation tannotation, C32226l<? super TAnnotation, Boolean> lVar) {
        C25270k i;
        C25270k i2 = mo51189i(tannotation, lVar.invoke(tannotation).booleanValue());
        if (i2 != null) {
            return i2;
        }
        Object k = mo51191k(tannotation);
        if (k == null) {
            return null;
        }
        C24507k0 j = mo51190j(tannotation);
        if (j == null) {
            j = this.f70007a.f70002a.f70026a;
        }
        j.getClass();
        boolean z = false;
        if ((j == C24507k0.IGNORE) || (i = mo51189i(k, lVar.invoke(k).booleanValue())) == null) {
            return null;
        }
        if (j == C24507k0.WARN) {
            z = true;
        }
        return C25270k.m32202a(i, (C25269j) null, z, 1, (Object) null);
    }

    /* renamed from: d */
    public final TAnnotation mo51184d(TAnnotation tannotation, C22826c cVar) {
        for (TAnnotation next : mo51187g(tannotation)) {
            if (C87412m.m108589b(mo51185e(next), cVar)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: e */
    public abstract C22826c mo51185e(TAnnotation tannotation);

    /* renamed from: f */
    public abstract Object mo51186f(TAnnotation tannotation);

    /* renamed from: g */
    public abstract Iterable<TAnnotation> mo51187g(TAnnotation tannotation);

    /* renamed from: h */
    public final boolean mo51188h(TAnnotation tannotation, C22826c cVar) {
        Iterable<Object> g = mo51187g(tannotation);
        if ((g instanceof Collection) && ((Collection) g).isEmpty()) {
            return false;
        }
        for (Object e : g) {
            if (C87412m.m108589b(mo51185e(e), cVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0071, code lost:
        if (r10.equals("ALWAYS") != false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r10.equals("UNKNOWN") == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r10.equals("NEVER") == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
        if (r10.equals("MAYBE") == false) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x008e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bc  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nz3.C25270k mo51189i(TAnnotation r10, boolean r11) {
        /*
            r9 = this;
            nz3.j r0 = nz3.C25269j.FORCE_FLEXIBILITY
            nz3.j r1 = nz3.C25269j.NOT_NULL
            nz3.j r2 = nz3.C25269j.NULLABLE
            vz3.c r3 = r9.mo51185e(r10)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            fz3.a0 r5 = r9.f70007a
            fy3.l<vz3.c, fz3.k0> r5 = r5.f70003b
            java.lang.Object r5 = r5.invoke(r3)
            fz3.k0 r5 = (fz3.C24507k0) r5
            r5.getClass()
            fz3.k0 r6 = fz3.C24507k0.IGNORE
            r7 = 1
            r8 = 0
            if (r5 != r6) goto L_0x0023
            r6 = 1
            goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            if (r6 == 0) goto L_0x0027
            return r4
        L_0x0027:
            java.util.List<vz3.c> r6 = fz3.C24504g0.f70050d
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x0031
            goto L_0x00b3
        L_0x0031:
            java.util.List<vz3.c> r6 = fz3.C24504g0.f70053g
            boolean r6 = r6.contains(r3)
            if (r6 == 0) goto L_0x003b
            goto L_0x00a9
        L_0x003b:
            vz3.c r6 = fz3.C24504g0.f70047a
            boolean r6 = gy3.C87412m.m108589b(r3, r6)
            if (r6 == 0) goto L_0x0045
            goto L_0x00b3
        L_0x0045:
            vz3.c r6 = fz3.C24504g0.f70048b
            boolean r6 = gy3.C87412m.m108589b(r3, r6)
            if (r6 == 0) goto L_0x004f
            goto L_0x00b4
        L_0x004f:
            vz3.c r6 = fz3.C24504g0.f70051e
            boolean r6 = gy3.C87412m.m108589b(r3, r6)
            if (r6 == 0) goto L_0x008f
            java.lang.Iterable r10 = r9.mo51181a(r10, r8)
            java.lang.Object r10 = sx3.C110818d0.m150915M(r10)
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x00a9
            int r3 = r10.hashCode()
            switch(r3) {
                case 73135176: goto L_0x0086;
                case 74175084: goto L_0x007d;
                case 433141802: goto L_0x0074;
                case 1933739535: goto L_0x006b;
                default: goto L_0x006a;
            }
        L_0x006a:
            goto L_0x008e
        L_0x006b:
            java.lang.String r0 = "ALWAYS"
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x008e
            goto L_0x00a9
        L_0x0074:
            java.lang.String r1 = "UNKNOWN"
            boolean r10 = r10.equals(r1)
            if (r10 != 0) goto L_0x00b4
            goto L_0x008e
        L_0x007d:
            java.lang.String r0 = "NEVER"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00b3
            goto L_0x008e
        L_0x0086:
            java.lang.String r0 = "MAYBE"
            boolean r10 = r10.equals(r0)
            if (r10 != 0) goto L_0x00b3
        L_0x008e:
            return r4
        L_0x008f:
            vz3.c r10 = fz3.C24504g0.f70054h
            boolean r10 = gy3.C87412m.m108589b(r3, r10)
            if (r10 == 0) goto L_0x0098
            goto L_0x00b3
        L_0x0098:
            vz3.c r10 = fz3.C24504g0.f70055i
            boolean r10 = gy3.C87412m.m108589b(r3, r10)
            if (r10 == 0) goto L_0x00a1
            goto L_0x00a9
        L_0x00a1:
            vz3.c r10 = fz3.C24504g0.f70057k
            boolean r10 = gy3.C87412m.m108589b(r3, r10)
            if (r10 == 0) goto L_0x00ab
        L_0x00a9:
            r0 = r1
            goto L_0x00b4
        L_0x00ab:
            vz3.c r10 = fz3.C24504g0.f70056j
            boolean r10 = gy3.C87412m.m108589b(r3, r10)
            if (r10 == 0) goto L_0x00c7
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            nz3.k r10 = new nz3.k
            fz3.k0 r1 = fz3.C24507k0.WARN
            if (r5 != r1) goto L_0x00bc
            r1 = 1
            goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            if (r1 != 0) goto L_0x00c3
            if (r11 == 0) goto L_0x00c2
            goto L_0x00c3
        L_0x00c2:
            r7 = 0
        L_0x00c3:
            r10.<init>(r0, r7)
            return r10
        L_0x00c7:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: fz3.C24496b.mo51189i(java.lang.Object, boolean):nz3.k");
    }

    /* renamed from: j */
    public final C24507k0 mo51190j(TAnnotation tannotation) {
        Iterable a;
        String str;
        C24507k0 k0Var = this.f70007a.f70002a.f70028c.get(mo51185e(tannotation));
        if (k0Var != null) {
            return k0Var;
        }
        Object d = mo51184d(tannotation, C24500d.f70021d);
        if (d == null || (a = mo51181a(d, false)) == null || (str = (String) C110818d0.m150915M(a)) == null) {
            return null;
        }
        C24507k0 k0Var2 = this.f70007a.f70002a.f70027b;
        if (k0Var2 != null) {
            return k0Var2;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return C24507k0.WARN;
                }
                return null;
            } else if (!str.equals("STRICT")) {
                return null;
            } else {
                return C24507k0.STRICT;
            }
        } else if (!str.equals("IGNORE")) {
            return null;
        } else {
            return C24507k0.IGNORE;
        }
    }

    /* renamed from: k */
    public final TAnnotation mo51191k(TAnnotation tannotation) {
        TAnnotation tannotation2;
        C87412m.m108594g(tannotation, "annotation");
        if (this.f70007a.f70002a.f70029d) {
            return null;
        }
        if (C110818d0.m150903D(C24500d.f70025h, mo51185e(tannotation)) || mo51188h(tannotation, C24500d.f70019b)) {
            return tannotation;
        }
        if (!mo51188h(tannotation, C24500d.f70018a)) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f70008b;
        Object f = mo51186f(tannotation);
        TAnnotation tannotation3 = concurrentHashMap.get(f);
        if (tannotation3 != null) {
            return tannotation3;
        }
        Iterator it = mo51187g(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = mo51191k(it.next());
            if (tannotation2 != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(f, tannotation2);
        return putIfAbsent == null ? tannotation2 : putIfAbsent;
    }
}

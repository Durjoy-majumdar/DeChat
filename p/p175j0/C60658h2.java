package p175j0;

import c14.C54625h;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import d14.C45253g;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.Set;
import p241t0.C110849h;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", mo125469f = "SnapshotFlow.kt", mo125470l = {134, 138, 160}, mo125471m = "invokeSuspend")
/* renamed from: j0.h2 */
public final class C60658h2 extends C91594j implements C32227p<C45253g<Object>, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f172773d;

    /* renamed from: e */
    public Object f172774e;

    /* renamed from: f */
    public Object f172775f;

    /* renamed from: g */
    public Object f172776g;

    /* renamed from: h */
    public Object f172777h;

    /* renamed from: i */
    public int f172778i;

    /* renamed from: j */
    public /* synthetic */ Object f172779j;

    /* renamed from: n */
    public final /* synthetic */ C32224a<Object> f172780n;

    /* renamed from: j0.h2$a */
    public static final class C60659a extends C87413o implements C32226l<Object, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Set<Object> f172781d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60659a(Set<Object> set) {
            super(1);
            this.f172781d = set;
        }

        public Object invoke(Object obj) {
            C87412m.m108594g(obj, LocaleUtil.ITALIAN);
            this.f172781d.add(obj);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: j0.h2$b */
    public static final class C60660b extends C87413o implements C32227p<Set<? extends Object>, C110849h, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C54625h<Set<Object>> f172782d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60660b(C54625h<Set<Object>> hVar) {
            super(2);
            this.f172782d = hVar;
        }

        public Object invoke(Object obj, Object obj2) {
            Set set = (Set) obj;
            C87412m.m108594g(set, "changed");
            C87412m.m108594g((C110849h) obj2, "<anonymous parameter 1>");
            this.f172782d.mo75539t(set);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60658h2(C32224a<Object> aVar, C15601d<? super C60658h2> dVar) {
        super(2, dVar);
        this.f172780n = aVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C60658h2 h2Var = new C60658h2(this.f172780n, dVar);
        h2Var.f172779j = obj;
        return h2Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60658h2) create((C45253g) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v3, resolved type: d14.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: java.util.Set} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x012a A[EDGE_INSN: B:111:0x012a->B:70:0x012a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ca A[Catch:{ all -> 0x0175 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1 A[Catch:{ all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0117 A[Catch:{ all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0123 A[Catch:{ all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0124 A[Catch:{ all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012c A[Catch:{ all -> 0x0175 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0172 A[LOOP:0: B:38:0x00cf->B:95:0x0172, LOOP_END] */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r1 = r16
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r1.f172778i
            r3 = 0
            r4 = 2
            r5 = 3
            r6 = 1
            if (r2 == 0) goto L_0x0053
            if (r2 == r6) goto L_0x0039
            if (r2 == r4) goto L_0x001b
            if (r2 != r5) goto L_0x0013
            goto L_0x0039
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x001b:
            java.lang.Object r2 = r1.f172777h
            java.lang.Object r7 = r1.f172776g
            t0.e r7 = (p241t0.C64198e) r7
            java.lang.Object r8 = r1.f172775f
            c14.h r8 = (c14.C54625h) r8
            java.lang.Object r9 = r1.f172774e
            fy3.l r9 = (fy3.C32226l) r9
            java.lang.Object r10 = r1.f172773d
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.f172779j
            d14.g r11 = (d14.C45253g) r11
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x0175 }
            r13 = r17
            r12 = r1
            goto L_0x00cb
        L_0x0039:
            java.lang.Object r2 = r1.f172777h
            java.lang.Object r7 = r1.f172776g
            t0.e r7 = (p241t0.C64198e) r7
            java.lang.Object r8 = r1.f172775f
            c14.h r8 = (c14.C54625h) r8
            java.lang.Object r9 = r1.f172774e
            fy3.l r9 = (fy3.C32226l) r9
            java.lang.Object r10 = r1.f172773d
            java.util.Set r10 = (java.util.Set) r10
            java.lang.Object r11 = r1.f172779j
            d14.g r11 = (d14.C45253g) r11
            kotlin.ResultKt.throwOnFailure(r17)     // Catch:{ all -> 0x0175 }
            goto L_0x00b5
        L_0x0053:
            kotlin.ResultKt.throwOnFailure(r17)
            java.lang.Object r2 = r1.f172779j
            r11 = r2
            d14.g r11 = (d14.C45253g) r11
            java.util.LinkedHashSet r10 = new java.util.LinkedHashSet
            r10.<init>()
            j0.h2$a r9 = new j0.h2$a
            r9.<init>(r10)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r7 = 6
            c14.h r8 = c14.C54629k.m61479a(r2, r3, r3, r7, r3)
            j0.h2$b r2 = new j0.h2$b
            r2.<init>(r8)
            fy3.l<t0.k, rx3.b0> r7 = p241t0.C110865n.f331649a
            p241t0.C110865n.m151143f(r7)
            java.lang.Object r7 = p241t0.C110865n.f331651c
            monitor-enter(r7)
            java.util.List<fy3.p<java.util.Set<? extends java.lang.Object>, t0.h, rx3.b0>> r12 = p241t0.C110865n.f331655g     // Catch:{ all -> 0x0186 }
            java.util.ArrayList r12 = (java.util.ArrayList) r12     // Catch:{ all -> 0x0186 }
            r12.add(r2)     // Catch:{ all -> 0x0186 }
            monitor-exit(r7)
            t0.g r7 = new t0.g
            r7.<init>(r2)
            t0.h r2 = p241t0.C110865n.m151146i()     // Catch:{ all -> 0x0175 }
            t0.h r2 = r2.mo162428r(r9)     // Catch:{ all -> 0x0175 }
            fy3.a<java.lang.Object> r12 = r1.f172780n     // Catch:{ all -> 0x0175 }
            t0.h r13 = r2.mo162465i()     // Catch:{ all -> 0x017d }
            java.lang.Object r12 = r12.invoke()     // Catch:{ all -> 0x0177 }
            r2.mo162466o(r13)     // Catch:{ all -> 0x017d }
            r2.mo162424c()     // Catch:{ all -> 0x0175 }
            r1.f172779j = r11     // Catch:{ all -> 0x0175 }
            r1.f172773d = r10     // Catch:{ all -> 0x0175 }
            r1.f172774e = r9     // Catch:{ all -> 0x0175 }
            r1.f172775f = r8     // Catch:{ all -> 0x0175 }
            r1.f172776g = r7     // Catch:{ all -> 0x0175 }
            r1.f172777h = r12     // Catch:{ all -> 0x0175 }
            r1.f172778i = r6     // Catch:{ all -> 0x0175 }
            java.lang.Object r2 = r11.emit(r12, r1)     // Catch:{ all -> 0x0175 }
            if (r2 != r0) goto L_0x00b4
            return r0
        L_0x00b4:
            r2 = r12
        L_0x00b5:
            r12 = r1
        L_0x00b6:
            r12.f172779j = r11     // Catch:{ all -> 0x0175 }
            r12.f172773d = r10     // Catch:{ all -> 0x0175 }
            r12.f172774e = r9     // Catch:{ all -> 0x0175 }
            r12.f172775f = r8     // Catch:{ all -> 0x0175 }
            r12.f172776g = r7     // Catch:{ all -> 0x0175 }
            r12.f172777h = r2     // Catch:{ all -> 0x0175 }
            r12.f172778i = r4     // Catch:{ all -> 0x0175 }
            java.lang.Object r13 = r8.mo75514g(r12)     // Catch:{ all -> 0x0175 }
            if (r13 != r0) goto L_0x00cb
            return r0
        L_0x00cb:
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0175 }
            r14 = 0
            r15 = 0
        L_0x00cf:
            if (r15 != 0) goto L_0x011a
            int r15 = r10.size()     // Catch:{ all -> 0x0175 }
            int r3 = r13.size()     // Catch:{ all -> 0x0175 }
            if (r15 >= r3) goto L_0x00f7
            boolean r3 = r10.isEmpty()     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x00e2
            goto L_0x0114
        L_0x00e2:
            java.util.Iterator r3 = r10.iterator()     // Catch:{ all -> 0x0175 }
        L_0x00e6:
            boolean r15 = r3.hasNext()     // Catch:{ all -> 0x0175 }
            if (r15 == 0) goto L_0x0114
            java.lang.Object r15 = r3.next()     // Catch:{ all -> 0x0175 }
            boolean r15 = r13.contains(r15)     // Catch:{ all -> 0x0175 }
            if (r15 == 0) goto L_0x00e6
            goto L_0x0112
        L_0x00f7:
            boolean r3 = r13.isEmpty()     // Catch:{ all -> 0x0175 }
            if (r3 == 0) goto L_0x00fe
            goto L_0x0114
        L_0x00fe:
            java.util.Iterator r3 = r13.iterator()     // Catch:{ all -> 0x0175 }
        L_0x0102:
            boolean r13 = r3.hasNext()     // Catch:{ all -> 0x0175 }
            if (r13 == 0) goto L_0x0114
            java.lang.Object r13 = r3.next()     // Catch:{ all -> 0x0175 }
            boolean r13 = r10.contains(r13)     // Catch:{ all -> 0x0175 }
            if (r13 == 0) goto L_0x0102
        L_0x0112:
            r3 = 1
            goto L_0x0115
        L_0x0114:
            r3 = 0
        L_0x0115:
            if (r3 == 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r15 = 0
            goto L_0x011b
        L_0x011a:
            r15 = 1
        L_0x011b:
            java.lang.Object r3 = r8.mo75518u()     // Catch:{ all -> 0x0175 }
            boolean r13 = r3 instanceof c14.C54630l.C54632b     // Catch:{ all -> 0x0175 }
            if (r13 != 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r3 = 0
        L_0x0125:
            r13 = r3
            java.util.Set r13 = (java.util.Set) r13     // Catch:{ all -> 0x0175 }
            if (r13 != 0) goto L_0x0172
            if (r15 == 0) goto L_0x016f
            r10.clear()     // Catch:{ all -> 0x0175 }
            t0.h r3 = p241t0.C110865n.m151146i()     // Catch:{ all -> 0x0175 }
            t0.h r3 = r3.mo162428r(r9)     // Catch:{ all -> 0x0175 }
            fy3.a<java.lang.Object> r13 = r12.f172780n     // Catch:{ all -> 0x0175 }
            t0.h r14 = r3.mo162465i()     // Catch:{ all -> 0x016a }
            java.lang.Object r13 = r13.invoke()     // Catch:{ all -> 0x0164 }
            r3.mo162466o(r14)     // Catch:{ all -> 0x016a }
            r3.mo162424c()     // Catch:{ all -> 0x0175 }
            boolean r3 = gy3.C87412m.m108589b(r13, r2)     // Catch:{ all -> 0x0175 }
            if (r3 != 0) goto L_0x016f
            r12.f172779j = r11     // Catch:{ all -> 0x0175 }
            r12.f172773d = r10     // Catch:{ all -> 0x0175 }
            r12.f172774e = r9     // Catch:{ all -> 0x0175 }
            r12.f172775f = r8     // Catch:{ all -> 0x0175 }
            r12.f172776g = r7     // Catch:{ all -> 0x0175 }
            r12.f172777h = r13     // Catch:{ all -> 0x0175 }
            r12.f172778i = r5     // Catch:{ all -> 0x0175 }
            java.lang.Object r2 = r11.emit(r13, r12)     // Catch:{ all -> 0x0175 }
            if (r2 != r0) goto L_0x0162
            return r0
        L_0x0162:
            r2 = r13
            goto L_0x016f
        L_0x0164:
            r0 = move-exception
            r2 = r0
            r3.mo162466o(r14)     // Catch:{ all -> 0x016a }
            throw r2     // Catch:{ all -> 0x016a }
        L_0x016a:
            r0 = move-exception
            r3.mo162424c()     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x016f:
            r3 = 0
            goto L_0x00b6
        L_0x0172:
            r3 = 0
            goto L_0x00cf
        L_0x0175:
            r0 = move-exception
            goto L_0x0182
        L_0x0177:
            r0 = move-exception
            r3 = r0
            r2.mo162466o(r13)     // Catch:{ all -> 0x017d }
            throw r3     // Catch:{ all -> 0x017d }
        L_0x017d:
            r0 = move-exception
            r2.mo162424c()     // Catch:{ all -> 0x0175 }
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0182:
            r7.dispose()
            throw r0
        L_0x0186:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p175j0.C60658h2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

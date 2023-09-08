package p463c0;

import a14.C0000n0;
import a14.C53930o0;
import a14.C53973z1;
import fy3.C32227p;
import gy3.C87412m;
import p1140p1.C110098d;
import p1140p1.C110100f;
import p1166z0.C112541g;
import p631o1.C109857o;
import rx3.C13598b0;
import rx3.C13604l;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: c0.m */
public final class C104202m extends C104190b implements C110098d<C104192d>, C104192d {

    /* renamed from: g */
    public C104200k f308472g;

    /* renamed from: h */
    public C13604l<C112541g, ? extends C53973z1> f308473h;

    /* renamed from: i */
    public C13604l<C112541g, ? extends C53973z1> f308474i;

    @C91590f(mo125468c = "androidx.compose.foundation.relocation.BringIntoViewResponderModifier$bringChildIntoView$2", mo125469f = "BringIntoViewResponder.kt", mo125470l = {214, 223, 230}, mo125471m = "invokeSuspend")
    /* renamed from: c0.m$a */
    public static final class C104203a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f308475d;

        /* renamed from: e */
        public Object f308476e;

        /* renamed from: f */
        public int f308477f;

        /* renamed from: g */
        public /* synthetic */ Object f308478g;

        /* renamed from: h */
        public final /* synthetic */ C104202m f308479h;

        /* renamed from: i */
        public final /* synthetic */ C109857o f308480i;

        /* renamed from: j */
        public final /* synthetic */ C112541g f308481j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C104203a(C104202m mVar, C109857o oVar, C112541g gVar, C15601d<? super C104203a> dVar) {
            super(2, dVar);
            this.f308479h = mVar;
            this.f308480i = oVar;
            this.f308481j = gVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C104203a aVar = new C104203a(this.f308479h, this.f308480i, this.f308481j, dVar);
            aVar.f308478g = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C104203a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:58:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x00f1  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x010e  */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x0112  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f308477f
                r2 = 0
                r3 = 1
                r4 = 3
                r5 = 2
                if (r1 == 0) goto L_0x0041
                if (r1 == r3) goto L_0x0035
                if (r1 == r5) goto L_0x0021
                if (r1 != r4) goto L_0x0019
                java.lang.Object r0 = r13.f308478g
                rx3.l r0 = (rx3.C13604l) r0
                kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x003e }
                goto L_0x00e4
            L_0x0019:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x0021:
                java.lang.Object r1 = r13.f308476e
                rx3.l r1 = (rx3.C13604l) r1
                java.lang.Object r3 = r13.f308475d
                rx3.l r3 = (rx3.C13604l) r3
                java.lang.Object r5 = r13.f308478g
                o1.o r5 = (p631o1.C109857o) r5
                kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x0032 }
                goto L_0x00ce
            L_0x0032:
                r14 = move-exception
                goto L_0x00f6
            L_0x0035:
                java.lang.Object r0 = r13.f308478g
                rx3.l r0 = (rx3.C13604l) r0
                kotlin.ResultKt.throwOnFailure(r14)     // Catch:{ all -> 0x003e }
                goto L_0x0104
            L_0x003e:
                r14 = move-exception
                goto L_0x0115
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f308478g
                a14.n0 r14 = (a14.C0000n0) r14
                c0.m r1 = r13.f308479h
                o1.o r1 = r1.f308456f
                if (r1 == 0) goto L_0x0055
                boolean r6 = r1.mo161183y()
                if (r6 == 0) goto L_0x0055
                goto L_0x0056
            L_0x0055:
                r1 = r2
            L_0x0056:
                if (r1 != 0) goto L_0x005b
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x005b:
                o1.o r6 = r13.f308480i
                boolean r6 = r6.mo161183y()
                if (r6 != 0) goto L_0x0066
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x0066:
                o1.o r6 = r13.f308480i
                z0.g r7 = r13.f308481j
                r8 = 0
                z0.g r6 = r1.mo161179X(r6, r8)
                float r9 = r6.f336961a
                float r6 = r6.f336962b
                long r9 = p1166z0.C112540f.m153745a(r9, r6)
                z0.g r6 = r7.mo164263d(r9)
                wx3.f r14 = r14.getCoroutineContext()
                a14.z1 r14 = a14.C53873d2.m60393e(r14)
                rx3.l r7 = new rx3.l
                r7.<init>(r6, r14)
                c0.m r14 = r13.f308479h
                rx3.l<z0.g, ? extends a14.z1> r9 = r14.f308473h
                r14.f308473h = r7
                if (r9 == 0) goto L_0x00f8
                A r10 = r9.f38555d     // Catch:{ all -> 0x0117 }
                z0.g r10 = (p1166z0.C112541g) r10     // Catch:{ all -> 0x0117 }
                float r11 = r10.f336961a     // Catch:{ all -> 0x0117 }
                float r12 = r6.f336961a     // Catch:{ all -> 0x0117 }
                int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r11 > 0) goto L_0x00b5
                float r11 = r10.f336962b     // Catch:{ all -> 0x0117 }
                float r12 = r6.f336962b     // Catch:{ all -> 0x0117 }
                int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r11 > 0) goto L_0x00b5
                float r11 = r10.f336963c     // Catch:{ all -> 0x0117 }
                float r12 = r6.f336963c     // Catch:{ all -> 0x0117 }
                int r11 = (r11 > r12 ? 1 : (r11 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x00b5
                float r10 = r10.f336964d     // Catch:{ all -> 0x0117 }
                float r6 = r6.f336964d     // Catch:{ all -> 0x0117 }
                int r6 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r6 < 0) goto L_0x00b5
                r8 = 1
            L_0x00b5:
                if (r8 != 0) goto L_0x00b8
                goto L_0x00f8
            L_0x00b8:
                B r14 = r9.f38556e     // Catch:{ all -> 0x0117 }
                a14.z1 r14 = (a14.C53973z1) r14     // Catch:{ all -> 0x0117 }
                r13.f308478g = r1     // Catch:{ all -> 0x0117 }
                r13.f308475d = r7     // Catch:{ all -> 0x0117 }
                r13.f308476e = r9     // Catch:{ all -> 0x0117 }
                r13.f308477f = r5     // Catch:{ all -> 0x0117 }
                java.lang.Object r14 = r14.mo74521O(r13)     // Catch:{ all -> 0x0117 }
                if (r14 != r0) goto L_0x00cb
                return r0
            L_0x00cb:
                r5 = r1
                r3 = r7
                r1 = r9
            L_0x00ce:
                c0.m r14 = r13.f308479h     // Catch:{ all -> 0x0032 }
                rx3.l<z0.g, ? extends a14.z1> r6 = r14.f308474i     // Catch:{ all -> 0x0032 }
                if (r6 != r1) goto L_0x00e5
                r13.f308478g = r3     // Catch:{ all -> 0x0032 }
                r13.f308475d = r2     // Catch:{ all -> 0x0032 }
                r13.f308476e = r2     // Catch:{ all -> 0x0032 }
                r13.f308477f = r4     // Catch:{ all -> 0x0032 }
                java.lang.Object r14 = p463c0.C104202m.m139021d(r14, r3, r5, r13)     // Catch:{ all -> 0x0032 }
                if (r14 != r0) goto L_0x00e3
                return r0
            L_0x00e3:
                r0 = r3
            L_0x00e4:
                r3 = r0
            L_0x00e5:
                c0.m r14 = r13.f308479h
                rx3.l<z0.g, ? extends a14.z1> r0 = r14.f308474i
                rx3.l<z0.g, ? extends a14.z1> r1 = r14.f308473h
                if (r0 != r1) goto L_0x00ef
                r14.f308474i = r2
            L_0x00ef:
                if (r1 != r3) goto L_0x00f3
                r14.f308473h = r2
            L_0x00f3:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            L_0x00f6:
                r7 = r3
                goto L_0x0118
            L_0x00f8:
                r13.f308478g = r7     // Catch:{ all -> 0x0117 }
                r13.f308477f = r3     // Catch:{ all -> 0x0117 }
                java.lang.Object r14 = p463c0.C104202m.m139021d(r14, r7, r1, r13)     // Catch:{ all -> 0x0117 }
                if (r14 != r0) goto L_0x0103
                return r0
            L_0x0103:
                r0 = r7
            L_0x0104:
                rx3.b0 r14 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x003e }
                c0.m r1 = r13.f308479h
                rx3.l<z0.g, ? extends a14.z1> r3 = r1.f308474i
                rx3.l<z0.g, ? extends a14.z1> r4 = r1.f308473h
                if (r3 != r4) goto L_0x0110
                r1.f308474i = r2
            L_0x0110:
                if (r4 != r0) goto L_0x0114
                r1.f308473h = r2
            L_0x0114:
                return r14
            L_0x0115:
                r7 = r0
                goto L_0x0118
            L_0x0117:
                r14 = move-exception
            L_0x0118:
                c0.m r0 = r13.f308479h
                rx3.l<z0.g, ? extends a14.z1> r1 = r0.f308474i
                rx3.l<z0.g, ? extends a14.z1> r3 = r0.f308473h
                if (r1 != r3) goto L_0x0122
                r0.f308474i = r2
            L_0x0122:
                if (r3 != r7) goto L_0x0126
                r0.f308473h = r2
            L_0x0126:
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p463c0.C104202m.C104203a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104202m(C104192d dVar) {
        super(dVar);
        C87412m.m108594g(dVar, "defaultParent");
    }

    /* renamed from: d */
    public static final Object m139021d(C104202m mVar, C13604l lVar, C109857o oVar, C15601d dVar) {
        mVar.f308474i = lVar;
        C112541g gVar = (C112541g) lVar.f38555d;
        C104200k kVar = mVar.f308472g;
        if (kVar != null) {
            Object f = C53930o0.m60559f(new C104204n(mVar, kVar.mo145812d(gVar), oVar, gVar, (C15601d<? super C104204n>) null), dVar);
            return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
        }
        C87412m.m108603p("responder");
        throw null;
    }

    /* renamed from: b */
    public Object mo145807b(C112541g gVar, C109857o oVar, C15601d<? super C13598b0> dVar) {
        Object f = C53930o0.m60559f(new C104203a(this, oVar, gVar, (C15601d<? super C104203a>) null), dVar);
        return f == C15911a.COROUTINE_SUSPENDED ? f : C13598b0.f38549a;
    }

    public C110100f<C104192d> getKey() {
        return C104191c.f308457a;
    }

    public Object getValue() {
        return this;
    }
}

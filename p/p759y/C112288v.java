package p759y;

import a14.C0000n0;
import c14.C54625h;
import fy3.C32227p;
import gy3.C8479f0;
import p175j0.C60667k2;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2", mo125469f = "Draggable.kt", mo125470l = {235, 237, 239, 249, 251, 255}, mo125471m = "invokeSuspend")
/* renamed from: y.v */
public final class C112288v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f336235d;

    /* renamed from: e */
    public Object f336236e;

    /* renamed from: f */
    public int f336237f;

    /* renamed from: g */
    public /* synthetic */ Object f336238g;

    /* renamed from: h */
    public final /* synthetic */ C54625h<C112236i> f336239h;

    /* renamed from: i */
    public final /* synthetic */ C112252k0 f336240i;

    /* renamed from: j */
    public final /* synthetic */ C60667k2<C112267o> f336241j;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DraggableKt$draggable$9$2$2", mo125469f = "Draggable.kt", mo125470l = {244}, mo125471m = "invokeSuspend")
    /* renamed from: y.v$a */
    public static final class C112289a extends C91594j implements C32227p<C112250j0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f336242d;

        /* renamed from: e */
        public int f336243e;

        /* renamed from: f */
        public /* synthetic */ Object f336244f;

        /* renamed from: g */
        public final /* synthetic */ C8479f0<C112236i> f336245g;

        /* renamed from: h */
        public final /* synthetic */ C54625h<C112236i> f336246h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112289a(C8479f0<C112236i> f0Var, C54625h<C112236i> hVar, C15601d<? super C112289a> dVar) {
            super(2, dVar);
            this.f336245g = f0Var;
            this.f336246h = hVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112289a aVar = new C112289a(this.f336245g, this.f336246h, dVar);
            aVar.f336244f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112289a) create((C112250j0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(T r9) {
            /*
                r8 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r8.f336243e
                r2 = 1
                if (r1 == 0) goto L_0x0021
                if (r1 != r2) goto L_0x0019
                java.lang.Object r1 = r8.f336242d
                gy3.f0 r1 = (gy3.C8479f0) r1
                java.lang.Object r3 = r8.f336244f
                y.j0 r3 = (p759y.C112250j0) r3
                kotlin.ResultKt.throwOnFailure(r9)
                r4 = r3
                r3 = r1
                r1 = r0
                r0 = r8
                goto L_0x005e
            L_0x0019:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L_0x0021:
                kotlin.ResultKt.throwOnFailure(r9)
                java.lang.Object r9 = r8.f336244f
                y.j0 r9 = (p759y.C112250j0) r9
                r3 = r9
                r9 = r8
            L_0x002a:
                gy3.f0<y.i> r1 = r9.f336245g
                T r1 = r1.f27484d
                boolean r4 = r1 instanceof p759y.C112236i.C112240d
                if (r4 != 0) goto L_0x0064
                boolean r4 = r1 instanceof p759y.C112236i.C112237a
                if (r4 != 0) goto L_0x0064
                boolean r4 = r1 instanceof p759y.C112236i.C112238b
                if (r4 == 0) goto L_0x003d
                y.i$b r1 = (p759y.C112236i.C112238b) r1
                goto L_0x003e
            L_0x003d:
                r1 = 0
            L_0x003e:
                if (r1 == 0) goto L_0x0047
                float r4 = r1.f336062a
                long r5 = r1.f336063b
                r3.mo164034a(r4, r5)
            L_0x0047:
                gy3.f0<y.i> r1 = r9.f336245g
                c14.h<y.i> r4 = r9.f336246h
                r9.f336244f = r3
                r9.f336242d = r1
                r9.f336243e = r2
                java.lang.Object r4 = r4.mo75514g(r9)
                if (r4 != r0) goto L_0x0058
                return r0
            L_0x0058:
                r7 = r0
                r0 = r9
                r9 = r4
                r4 = r3
                r3 = r1
                r1 = r7
            L_0x005e:
                r3.f27484d = r9
                r9 = r0
                r0 = r1
                r3 = r4
                goto L_0x002a
            L_0x0064:
                rx3.b0 r9 = rx3.C13598b0.f38549a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p759y.C112288v.C112289a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112288v(C54625h<C112236i> hVar, C112252k0 k0Var, C60667k2<C112267o> k2Var, C15601d<? super C112288v> dVar) {
        super(2, dVar);
        this.f336239h = hVar;
        this.f336240i = k0Var;
        this.f336241j = k2Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112288v vVar = new C112288v(this.f336239h, this.f336240i, this.f336241j, dVar);
        vVar.f336238g = obj;
        return vVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112288v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v18, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v12, resolved type: a14.n0} */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:37|12|38|39|(2:44|(2:46|(1:48)))(2:41|(1:43))|21|(1:56)(0)) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0061, code lost:
        r9 = r8;
        r4 = r1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0111 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0117  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(T r9) {
        /*
            r8 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r8.f336237f
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0044;
                case 2: goto L_0x0034;
                case 3: goto L_0x0020;
                case 4: goto L_0x0018;
                case 5: goto L_0x0018;
                case 6: goto L_0x0010;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L_0x0010:
            java.lang.Object r1 = r8.f336238g
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0061
        L_0x0018:
            java.lang.Object r1 = r8.f336238g
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x0030 }
            goto L_0x0061
        L_0x0020:
            java.lang.Object r1 = r8.f336235d
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r3 = r8.f336238g
            a14.n0 r3 = (a14.C0000n0) r3
            kotlin.ResultKt.throwOnFailure(r9)     // Catch:{ CancellationException -> 0x002f }
            r9 = r8
        L_0x002c:
            r4 = r3
            goto L_0x00c9
        L_0x002f:
            r1 = r3
        L_0x0030:
            r9 = r8
            r4 = r1
            goto L_0x00fc
        L_0x0034:
            java.lang.Object r1 = r8.f336235d
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r3 = r8.f336238g
            a14.n0 r3 = (a14.C0000n0) r3
            kotlin.ResultKt.throwOnFailure(r9)
            r4 = r1
            r1 = r0
            r0 = r8
            goto L_0x00ab
        L_0x0044:
            java.lang.Object r1 = r8.f336236e
            gy3.f0 r1 = (gy3.C8479f0) r1
            java.lang.Object r3 = r8.f336235d
            gy3.f0 r3 = (gy3.C8479f0) r3
            java.lang.Object r4 = r8.f336238g
            a14.n0 r4 = (a14.C0000n0) r4
            kotlin.ResultKt.throwOnFailure(r9)
            r5 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r8
            goto L_0x0086
        L_0x0059:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.Object r9 = r8.f336238g
            r1 = r9
            a14.n0 r1 = (a14.C0000n0) r1
        L_0x0061:
            r9 = r8
            r4 = r1
        L_0x0063:
            boolean r1 = a14.C53930o0.m60560g(r4)
            if (r1 == 0) goto L_0x0117
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            c14.h<y.i> r3 = r9.f336239h
            r9.f336238g = r4
            r9.f336235d = r1
            r9.f336236e = r1
            r5 = 1
            r9.f336237f = r5
            java.lang.Object r3 = r3.mo75514g(r9)
            if (r3 != r0) goto L_0x0080
            return r0
        L_0x0080:
            r5 = r4
            r4 = r1
            r1 = r0
            r0 = r9
            r9 = r3
            r3 = r4
        L_0x0086:
            r3.f27484d = r9
            T r9 = r4.f27484d
            boolean r9 = r9 instanceof p759y.C112236i.C112239c
            if (r9 == 0) goto L_0x0112
            j0.k2<y.o> r9 = r0.f336241j
            java.lang.Object r9 = r9.getValue()
            y.o r9 = (p759y.C112267o) r9
            T r3 = r4.f27484d
            y.i$c r3 = (p759y.C112236i.C112239c) r3
            r0.f336238g = r5
            r0.f336235d = r4
            r0.f336236e = r2
            r6 = 2
            r0.f336237f = r6
            java.lang.Object r9 = r9.mo164038b(r5, r3, r0)
            if (r9 != r1) goto L_0x00aa
            return r1
        L_0x00aa:
            r3 = r5
        L_0x00ab:
            y.k0 r9 = r0.f336240i     // Catch:{ CancellationException -> 0x00f9 }
            x.u1 r5 = p267x.C38426u1.UserInput     // Catch:{ CancellationException -> 0x00f9 }
            y.v$a r6 = new y.v$a     // Catch:{ CancellationException -> 0x00f9 }
            c14.h<y.i> r7 = r0.f336239h     // Catch:{ CancellationException -> 0x00f9 }
            r6.<init>(r4, r7, r2)     // Catch:{ CancellationException -> 0x00f9 }
            r0.f336238g = r3     // Catch:{ CancellationException -> 0x00f9 }
            r0.f336235d = r4     // Catch:{ CancellationException -> 0x00f9 }
            r7 = 3
            r0.f336237f = r7     // Catch:{ CancellationException -> 0x00f9 }
            java.lang.Object r9 = r9.mo164035b(r5, r6, r0)     // Catch:{ CancellationException -> 0x00f9 }
            if (r9 != r1) goto L_0x00c4
            return r1
        L_0x00c4:
            r9 = r0
            r0 = r1
            r1 = r4
            goto L_0x002c
        L_0x00c9:
            j0.k2<y.o> r3 = r9.f336241j     // Catch:{ CancellationException -> 0x00fc }
            java.lang.Object r3 = r3.getValue()     // Catch:{ CancellationException -> 0x00fc }
            y.o r3 = (p759y.C112267o) r3     // Catch:{ CancellationException -> 0x00fc }
            T r1 = r1.f27484d     // Catch:{ CancellationException -> 0x00fc }
            boolean r5 = r1 instanceof p759y.C112236i.C112240d     // Catch:{ CancellationException -> 0x00fc }
            if (r5 == 0) goto L_0x00e7
            y.i$d r1 = (p759y.C112236i.C112240d) r1     // Catch:{ CancellationException -> 0x00fc }
            r9.f336238g = r4     // Catch:{ CancellationException -> 0x00fc }
            r9.f336235d = r2     // Catch:{ CancellationException -> 0x00fc }
            r5 = 4
            r9.f336237f = r5     // Catch:{ CancellationException -> 0x00fc }
            java.lang.Object r1 = r3.mo164039c(r4, r1, r9)     // Catch:{ CancellationException -> 0x00fc }
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x00e7:
            boolean r1 = r1 instanceof p759y.C112236i.C112237a     // Catch:{ CancellationException -> 0x00fc }
            if (r1 == 0) goto L_0x0063
            r9.f336238g = r4     // Catch:{ CancellationException -> 0x00fc }
            r9.f336235d = r2     // Catch:{ CancellationException -> 0x00fc }
            r1 = 5
            r9.f336237f = r1     // Catch:{ CancellationException -> 0x00fc }
            java.lang.Object r1 = r3.mo164037a(r4, r9)     // Catch:{ CancellationException -> 0x00fc }
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x00f9:
            r9 = r0
            r0 = r1
            r4 = r3
        L_0x00fc:
            j0.k2<y.o> r1 = r9.f336241j
            java.lang.Object r1 = r1.getValue()
            y.o r1 = (p759y.C112267o) r1
            r9.f336238g = r4
            r9.f336235d = r2
            r3 = 6
            r9.f336237f = r3
            java.lang.Object r1 = r1.mo164037a(r4, r9)
            if (r1 != r0) goto L_0x0063
            return r0
        L_0x0112:
            r9 = r0
            r0 = r1
            r4 = r5
            goto L_0x0063
        L_0x0117:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112288v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

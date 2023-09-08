package p759y;

import a14.C0000n0;
import fy3.C32228q;
import gy3.C87412m;
import p1165z.C112515b;
import p1165z.C112527l;
import p1166z0.C112539e;
import p175j0.C60690y0;
import p759y.C112236i;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: y.o */
public final class C112267o {

    /* renamed from: a */
    public final C32228q<C0000n0, C112539e, C15601d<? super C13598b0>, Object> f336164a;

    /* renamed from: b */
    public final C32228q<C0000n0, Float, C15601d<? super C13598b0>, Object> f336165b;

    /* renamed from: c */
    public final C60690y0<C112515b> f336166c;

    /* renamed from: d */
    public final C112527l f336167d;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragLogic", mo125469f = "Draggable.kt", mo125470l = {400, 403}, mo125471m = "processDragCancel")
    /* renamed from: y.o$a */
    public static final class C112268a extends C66704d {

        /* renamed from: d */
        public Object f336168d;

        /* renamed from: e */
        public Object f336169e;

        /* renamed from: f */
        public /* synthetic */ Object f336170f;

        /* renamed from: g */
        public final /* synthetic */ C112267o f336171g;

        /* renamed from: h */
        public int f336172h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112268a(C112267o oVar, C15601d<? super C112268a> dVar) {
            super(dVar);
            this.f336171g = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336170f = obj;
            this.f336172h |= Integer.MIN_VALUE;
            return this.f336171g.mo164037a((C0000n0) null, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragLogic", mo125469f = "Draggable.kt", mo125470l = {382, 385, 387}, mo125471m = "processDragStart")
    /* renamed from: y.o$b */
    public static final class C112269b extends C66704d {

        /* renamed from: d */
        public Object f336173d;

        /* renamed from: e */
        public Object f336174e;

        /* renamed from: f */
        public Object f336175f;

        /* renamed from: g */
        public Object f336176g;

        /* renamed from: h */
        public /* synthetic */ Object f336177h;

        /* renamed from: i */
        public final /* synthetic */ C112267o f336178i;

        /* renamed from: j */
        public int f336179j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112269b(C112267o oVar, C15601d<? super C112269b> dVar) {
            super(dVar);
            this.f336178i = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336177h = obj;
            this.f336179j |= Integer.MIN_VALUE;
            return this.f336178i.mo164038b((C0000n0) null, (C112236i.C112239c) null, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragLogic", mo125469f = "Draggable.kt", mo125470l = {392, 395}, mo125471m = "processDragStop")
    /* renamed from: y.o$c */
    public static final class C112270c extends C66704d {

        /* renamed from: d */
        public Object f336180d;

        /* renamed from: e */
        public Object f336181e;

        /* renamed from: f */
        public Object f336182f;

        /* renamed from: g */
        public /* synthetic */ Object f336183g;

        /* renamed from: h */
        public final /* synthetic */ C112267o f336184h;

        /* renamed from: i */
        public int f336185i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112270c(C112267o oVar, C15601d<? super C112270c> dVar) {
            super(dVar);
            this.f336184h = oVar;
        }

        public final Object invokeSuspend(Object obj) {
            this.f336183g = obj;
            this.f336185i |= Integer.MIN_VALUE;
            return this.f336184h.mo164039c((C0000n0) null, (C112236i.C112240d) null, this);
        }
    }

    public C112267o(C32228q<? super C0000n0, ? super C112539e, ? super C15601d<? super C13598b0>, ? extends Object> qVar, C32228q<? super C0000n0, ? super Float, ? super C15601d<? super C13598b0>, ? extends Object> qVar2, C60690y0<C112515b> y0Var, C112527l lVar) {
        C87412m.m108594g(qVar, "onDragStarted");
        C87412m.m108594g(qVar2, "onDragStopped");
        C87412m.m108594g(y0Var, "dragStartInteraction");
        this.f336164a = qVar;
        this.f336165b = qVar2;
        this.f336166c = y0Var;
        this.f336167d = lVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164037a(a14.C0000n0 r8, wx3.C15601d<? super rx3.C13598b0> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p759y.C112267o.C112268a
            if (r0 == 0) goto L_0x0013
            r0 = r9
            y.o$a r0 = (p759y.C112267o.C112268a) r0
            int r1 = r0.f336172h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336172h = r1
            goto L_0x0018
        L_0x0013:
            y.o$a r0 = new y.o$a
            r0.<init>(r7, r9)
        L_0x0018:
            java.lang.Object r9 = r0.f336170f
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336172h
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x007f
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            java.lang.Object r8 = r0.f336169e
            a14.n0 r8 = (a14.C0000n0) r8
            java.lang.Object r2 = r0.f336168d
            y.o r2 = (p759y.C112267o) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0063
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r9)
            j0.y0<z.b> r9 = r7.f336166c
            java.lang.Object r9 = r9.getValue()
            z.b r9 = (p1165z.C112515b) r9
            if (r9 == 0) goto L_0x0069
            z.l r2 = r7.f336167d
            if (r2 == 0) goto L_0x0062
            z.a r6 = new z.a
            r6.<init>(r9)
            r0.f336168d = r7
            r0.f336169e = r8
            r0.f336172h = r4
            java.lang.Object r9 = r2.mo164252a(r6, r0)
            if (r9 != r1) goto L_0x0062
            return r1
        L_0x0062:
            r2 = r7
        L_0x0063:
            j0.y0<z.b> r9 = r2.f336166c
            r9.setValue(r5)
            goto L_0x006a
        L_0x0069:
            r2 = r7
        L_0x006a:
            fy3.q<a14.n0, java.lang.Float, wx3.d<? super rx3.b0>, java.lang.Object> r9 = r2.f336165b
            r2 = 0
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r2)
            r0.f336168d = r5
            r0.f336169e = r5
            r0.f336172h = r3
            java.lang.Object r8 = r9.invoke(r8, r4, r0)
            if (r8 != r1) goto L_0x007f
            return r1
        L_0x007f:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112267o.mo164037a(a14.n0, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164038b(a14.C0000n0 r9, p759y.C112236i.C112239c r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p759y.C112267o.C112269b
            if (r0 == 0) goto L_0x0013
            r0 = r11
            y.o$b r0 = (p759y.C112267o.C112269b) r0
            int r1 = r0.f336179j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336179j = r1
            goto L_0x0018
        L_0x0013:
            y.o$b r0 = new y.o$b
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f336177h
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336179j
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x005d
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00c3
        L_0x002e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0036:
            java.lang.Object r9 = r0.f336176g
            z.b r9 = (p1165z.C112515b) r9
            java.lang.Object r10 = r0.f336175f
            y.i$c r10 = (p759y.C112236i.C112239c) r10
            java.lang.Object r2 = r0.f336174e
            a14.n0 r2 = (a14.C0000n0) r2
            java.lang.Object r4 = r0.f336173d
            y.o r4 = (p759y.C112267o) r4
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a0
        L_0x004a:
            java.lang.Object r9 = r0.f336175f
            y.i$c r9 = (p759y.C112236i.C112239c) r9
            java.lang.Object r10 = r0.f336174e
            a14.n0 r10 = (a14.C0000n0) r10
            java.lang.Object r2 = r0.f336173d
            y.o r2 = (p759y.C112267o) r2
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x0083
        L_0x005d:
            kotlin.ResultKt.throwOnFailure(r11)
            j0.y0<z.b> r11 = r8.f336166c
            java.lang.Object r11 = r11.getValue()
            z.b r11 = (p1165z.C112515b) r11
            if (r11 == 0) goto L_0x0082
            z.l r2 = r8.f336167d
            if (r2 == 0) goto L_0x0082
            z.a r6 = new z.a
            r6.<init>(r11)
            r0.f336173d = r8
            r0.f336174e = r9
            r0.f336175f = r10
            r0.f336179j = r5
            java.lang.Object r11 = r2.mo164252a(r6, r0)
            if (r11 != r1) goto L_0x0082
            return r1
        L_0x0082:
            r2 = r8
        L_0x0083:
            z.b r11 = new z.b
            r11.<init>()
            z.l r5 = r2.f336167d
            if (r5 == 0) goto L_0x00a3
            r0.f336173d = r2
            r0.f336174e = r9
            r0.f336175f = r10
            r0.f336176g = r11
            r0.f336179j = r4
            java.lang.Object r4 = r5.mo164252a(r11, r0)
            if (r4 != r1) goto L_0x009d
            return r1
        L_0x009d:
            r4 = r2
            r2 = r9
            r9 = r11
        L_0x00a0:
            r11 = r9
            r9 = r2
            r2 = r4
        L_0x00a3:
            j0.y0<z.b> r4 = r2.f336166c
            r4.setValue(r11)
            fy3.q<a14.n0, z0.e, wx3.d<? super rx3.b0>, java.lang.Object> r11 = r2.f336164a
            long r4 = r10.f336064a
            z0.e r10 = new z0.e
            r10.<init>(r4)
            r2 = 0
            r0.f336173d = r2
            r0.f336174e = r2
            r0.f336175f = r2
            r0.f336176g = r2
            r0.f336179j = r3
            java.lang.Object r9 = r11.invoke(r9, r10, r0)
            if (r9 != r1) goto L_0x00c3
            return r1
        L_0x00c3:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112267o.mo164038b(a14.n0, y.i$c, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo164039c(a14.C0000n0 r9, p759y.C112236i.C112240d r10, wx3.C15601d<? super rx3.C13598b0> r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof p759y.C112267o.C112270c
            if (r0 == 0) goto L_0x0013
            r0 = r11
            y.o$c r0 = (p759y.C112267o.C112270c) r0
            int r1 = r0.f336185i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f336185i = r1
            goto L_0x0018
        L_0x0013:
            y.o$c r0 = new y.o$c
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f336183g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f336185i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0046
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x008b
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            java.lang.Object r9 = r0.f336182f
            y.i$d r9 = (p759y.C112236i.C112240d) r9
            java.lang.Object r10 = r0.f336181e
            a14.n0 r10 = (a14.C0000n0) r10
            java.lang.Object r2 = r0.f336180d
            y.o r2 = (p759y.C112267o) r2
            kotlin.ResultKt.throwOnFailure(r11)
            r7 = r10
            r10 = r9
            r9 = r7
            goto L_0x006c
        L_0x0046:
            kotlin.ResultKt.throwOnFailure(r11)
            j0.y0<z.b> r11 = r8.f336166c
            java.lang.Object r11 = r11.getValue()
            z.b r11 = (p1165z.C112515b) r11
            if (r11 == 0) goto L_0x0072
            z.l r2 = r8.f336167d
            if (r2 == 0) goto L_0x006b
            z.c r6 = new z.c
            r6.<init>(r11)
            r0.f336180d = r8
            r0.f336181e = r9
            r0.f336182f = r10
            r0.f336185i = r4
            java.lang.Object r11 = r2.mo164252a(r6, r0)
            if (r11 != r1) goto L_0x006b
            return r1
        L_0x006b:
            r2 = r8
        L_0x006c:
            j0.y0<z.b> r11 = r2.f336166c
            r11.setValue(r5)
            goto L_0x0073
        L_0x0072:
            r2 = r8
        L_0x0073:
            fy3.q<a14.n0, java.lang.Float, wx3.d<? super rx3.b0>, java.lang.Object> r11 = r2.f336165b
            float r10 = r10.f336065a
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r10)
            r0.f336180d = r5
            r0.f336181e = r5
            r0.f336182f = r5
            r0.f336185i = r3
            java.lang.Object r9 = r11.invoke(r9, r2, r0)
            if (r9 != r1) goto L_0x008b
            return r1
        L_0x008b:
            rx3.b0 r9 = rx3.C13598b0.f38549a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112267o.mo164039c(a14.n0, y.i$d, wx3.d):java.lang.Object");
    }
}

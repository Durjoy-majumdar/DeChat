package p759y;

import fy3.C32228q;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p190l1.C109085c;
import p190l1.C109108n;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: y.c1 */
public final class C112205c1 {

    /* renamed from: a */
    public static final C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> f335940a = new C91356a((C15601d<? super C91356a>) null);

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", mo125469f = "TapGestureDetector.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: y.c1$a */
    public static final class C91356a extends C91594j implements C32228q<C112255l0, C112539e, C15601d<? super C13598b0>, Object> {
        public C91356a(C15601d<? super C91356a> dVar) {
            super(3, dVar);
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C112255l0 l0Var = (C112255l0) obj;
            long j = ((C112539e) obj2).f336959a;
            new C91356a((C15601d) obj3);
            C13598b0 b0Var = C13598b0.f38549a;
            ResultKt.throwOnFailure(b0Var);
            return b0Var;
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo125469f = "TapGestureDetector.kt", mo125470l = {242}, mo125471m = "awaitFirstDownOnPass")
    /* renamed from: y.c1$b */
    public static final class C112206b extends C66704d {

        /* renamed from: d */
        public Object f335941d;

        /* renamed from: e */
        public Object f335942e;

        /* renamed from: f */
        public boolean f335943f;

        /* renamed from: g */
        public /* synthetic */ Object f335944g;

        /* renamed from: h */
        public int f335945h;

        public C112206b(C15601d<? super C112206b> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f335944g = obj;
            this.f335945h |= Integer.MIN_VALUE;
            return C112205c1.m153110b((C109085c) null, (C109108n) null, false, this);
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", mo125469f = "TapGestureDetector.kt", mo125470l = {260, 275}, mo125471m = "waitForUpOrCancellation")
    /* renamed from: y.c1$c */
    public static final class C112207c extends C66704d {

        /* renamed from: d */
        public Object f335946d;

        /* renamed from: e */
        public /* synthetic */ Object f335947e;

        /* renamed from: f */
        public int f335948f;

        public C112207c(C15601d<? super C112207c> dVar) {
            super(dVar);
        }

        public final Object invokeSuspend(Object obj) {
            this.f335947e = obj;
            this.f335948f |= Integer.MIN_VALUE;
            return C112205c1.m153111c((C109085c) null, this);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004e A[LOOP:0: B:16:0x004c->B:17:0x004e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072 A[EDGE_INSN: B:27:0x0072->B:24:0x0072 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    public static final java.lang.Object m153109a(p190l1.C109085c r8, wx3.C15601d r9) {
        /*
            boolean r0 = r9 instanceof p759y.C112216e1
            if (r0 == 0) goto L_0x0013
            r0 = r9
            y.e1 r0 = (p759y.C112216e1) r0
            int r1 = r0.f335976f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335976f = r1
            goto L_0x0018
        L_0x0013:
            y.e1 r0 = new y.e1
            r0.<init>(r9)
        L_0x0018:
            java.lang.Object r9 = r0.f335975e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335976f
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            java.lang.Object r8 = r0.f335974d
            l1.c r8 = (p190l1.C109085c) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0042
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r9)
        L_0x0036:
            r0.f335974d = r8
            r0.f335976f = r3
            r9 = 0
            java.lang.Object r9 = p190l1.C109085c.C109086a.m148099a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L_0x0042
            goto L_0x0076
        L_0x0042:
            l1.l r9 = (p190l1.C109106l) r9
            java.util.List<l1.s> r2 = r9.f326709a
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L_0x004c:
            if (r6 >= r4) goto L_0x005a
            java.lang.Object r7 = r2.get(r6)
            l1.s r7 = (p190l1.C109111s) r7
            r7.mo160354a()
            int r6 = r6 + 1
            goto L_0x004c
        L_0x005a:
            java.util.List<l1.s> r9 = r9.f326709a
            int r2 = r9.size()
            r4 = 0
        L_0x0061:
            if (r4 >= r2) goto L_0x0072
            java.lang.Object r6 = r9.get(r4)
            l1.s r6 = (p190l1.C109111s) r6
            boolean r6 = r6.f326720d
            if (r6 == 0) goto L_0x006f
            r5 = 1
            goto L_0x0072
        L_0x006f:
            int r4 = r4 + 1
            goto L_0x0061
        L_0x0072:
            if (r5 != 0) goto L_0x0036
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0076:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112205c1.m153109a(l1.c, wx3.d):java.lang.Object");
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0084 A[SYNTHETIC] */
    /* renamed from: b */
    public static final java.lang.Object m153110b(p190l1.C109085c r10, p190l1.C109108n r11, boolean r12, wx3.C15601d<? super p190l1.C109111s> r13) {
        /*
            boolean r0 = r13 instanceof p759y.C112205c1.C112206b
            if (r0 == 0) goto L_0x0013
            r0 = r13
            y.c1$b r0 = (p759y.C112205c1.C112206b) r0
            int r1 = r0.f335945h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335945h = r1
            goto L_0x0018
        L_0x0013:
            y.c1$b r0 = new y.c1$b
            r0.<init>(r13)
        L_0x0018:
            java.lang.Object r13 = r0.f335944g
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335945h
            r3 = 1
            if (r2 == 0) goto L_0x003c
            if (r2 != r3) goto L_0x0034
            boolean r10 = r0.f335943f
            java.lang.Object r11 = r0.f335942e
            l1.n r11 = (p190l1.C109108n) r11
            java.lang.Object r12 = r0.f335941d
            l1.c r12 = (p190l1.C109085c) r12
            kotlin.ResultKt.throwOnFailure(r13)
            r9 = r12
            r12 = r10
            r10 = r9
            goto L_0x004e
        L_0x0034:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x003c:
            kotlin.ResultKt.throwOnFailure(r13)
        L_0x003f:
            r0.f335941d = r10
            r0.f335942e = r11
            r0.f335943f = r12
            r0.f335945h = r3
            java.lang.Object r13 = r10.mo160333e0(r11, r0)
            if (r13 != r1) goto L_0x004e
            return r1
        L_0x004e:
            l1.l r13 = (p190l1.C109106l) r13
            java.util.List<l1.s> r2 = r13.f326709a
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L_0x0058:
            if (r6 >= r4) goto L_0x0084
            java.lang.Object r7 = r2.get(r6)
            l1.s r7 = (p190l1.C109111s) r7
            if (r12 == 0) goto L_0x0079
            java.lang.String r8 = "<this>"
            gy3.C87412m.m108594g(r7, r8)
            boolean r8 = r7.mo160355b()
            if (r8 != 0) goto L_0x0077
            boolean r8 = r7.f326723g
            if (r8 != 0) goto L_0x0077
            boolean r7 = r7.f326720d
            if (r7 == 0) goto L_0x0077
            r7 = 1
            goto L_0x007d
        L_0x0077:
            r7 = 0
            goto L_0x007d
        L_0x0079:
            boolean r7 = p190l1.C109107m.m148148a(r7)
        L_0x007d:
            if (r7 != 0) goto L_0x0081
            r2 = 0
            goto L_0x0085
        L_0x0081:
            int r6 = r6 + 1
            goto L_0x0058
        L_0x0084:
            r2 = 1
        L_0x0085:
            if (r2 == 0) goto L_0x003f
            java.util.List<l1.s> r10 = r13.f326709a
            java.lang.Object r10 = r10.get(r5)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112205c1.m153110b(l1.c, l1.n, boolean, wx3.d):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x007f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00e4 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m153111c(p190l1.C109085c r13, wx3.C15601d<? super p190l1.C109111s> r14) {
        /*
            boolean r0 = r14 instanceof p759y.C112205c1.C112207c
            if (r0 == 0) goto L_0x0013
            r0 = r14
            y.c1$c r0 = (p759y.C112205c1.C112207c) r0
            int r1 = r0.f335948f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.f335948f = r1
            goto L_0x0018
        L_0x0013:
            y.c1$c r0 = new y.c1$c
            r0.<init>(r14)
        L_0x0018:
            java.lang.Object r14 = r0.f335947e
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f335948f
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L_0x0041
            if (r2 == r6) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            java.lang.Object r13 = r0.f335946d
            l1.c r13 = (p190l1.C109085c) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x00c8
        L_0x0031:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x0039:
            java.lang.Object r13 = r0.f335946d
            l1.c r13 = (p190l1.C109085c) r13
            kotlin.ResultKt.throwOnFailure(r14)
            goto L_0x0051
        L_0x0041:
            kotlin.ResultKt.throwOnFailure(r14)
        L_0x0044:
            l1.n r14 = p190l1.C109108n.Main
            r0.f335946d = r13
            r0.f335948f = r6
            java.lang.Object r14 = r13.mo160333e0(r14, r0)
            if (r14 != r1) goto L_0x0051
            return r1
        L_0x0051:
            l1.l r14 = (p190l1.C109106l) r14
            java.util.List<l1.s> r2 = r14.f326709a
            int r7 = r2.size()
            r8 = 0
        L_0x005a:
            if (r8 >= r7) goto L_0x007f
            java.lang.Object r9 = r2.get(r8)
            l1.s r9 = (p190l1.C109111s) r9
            java.lang.String r10 = "<this>"
            gy3.C87412m.m108594g(r9, r10)
            boolean r10 = r9.mo160355b()
            if (r10 != 0) goto L_0x0077
            boolean r10 = r9.f326723g
            if (r10 == 0) goto L_0x0077
            boolean r9 = r9.f326720d
            if (r9 != 0) goto L_0x0077
            r9 = 1
            goto L_0x0078
        L_0x0077:
            r9 = 0
        L_0x0078:
            if (r9 != 0) goto L_0x007c
            r2 = 0
            goto L_0x0080
        L_0x007c:
            int r8 = r8 + 1
            goto L_0x005a
        L_0x007f:
            r2 = 1
        L_0x0080:
            if (r2 == 0) goto L_0x0089
            java.util.List<l1.s> r13 = r14.f326709a
            java.lang.Object r13 = r13.get(r5)
            return r13
        L_0x0089:
            java.util.List<l1.s> r14 = r14.f326709a
            int r2 = r14.size()
            r7 = 0
        L_0x0090:
            if (r7 >= r2) goto L_0x00b7
            java.lang.Object r8 = r14.get(r7)
            l1.s r8 = (p190l1.C109111s) r8
            boolean r9 = r8.mo160355b()
            if (r9 != 0) goto L_0x00af
            long r9 = r13.mo160332b()
            long r11 = r13.mo160335p0()
            boolean r8 = p190l1.C109107m.m148151d(r8, r9, r11)
            if (r8 == 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r8 = 0
            goto L_0x00b0
        L_0x00af:
            r8 = 1
        L_0x00b0:
            if (r8 == 0) goto L_0x00b4
            r14 = 1
            goto L_0x00b8
        L_0x00b4:
            int r7 = r7 + 1
            goto L_0x0090
        L_0x00b7:
            r14 = 0
        L_0x00b8:
            if (r14 == 0) goto L_0x00bb
            return r3
        L_0x00bb:
            l1.n r14 = p190l1.C109108n.Final
            r0.f335946d = r13
            r0.f335948f = r4
            java.lang.Object r14 = r13.mo160333e0(r14, r0)
            if (r14 != r1) goto L_0x00c8
            return r1
        L_0x00c8:
            l1.l r14 = (p190l1.C109106l) r14
            java.util.List<l1.s> r14 = r14.f326709a
            int r2 = r14.size()
            r7 = 0
        L_0x00d1:
            if (r7 >= r2) goto L_0x00e4
            java.lang.Object r8 = r14.get(r7)
            l1.s r8 = (p190l1.C109111s) r8
            boolean r8 = r8.mo160355b()
            if (r8 == 0) goto L_0x00e1
            r14 = 1
            goto L_0x00e5
        L_0x00e1:
            int r7 = r7 + 1
            goto L_0x00d1
        L_0x00e4:
            r14 = 0
        L_0x00e5:
            if (r14 == 0) goto L_0x0044
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112205c1.m153111c(l1.c, wx3.d):java.lang.Object");
    }
}

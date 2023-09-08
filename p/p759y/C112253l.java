package p759y;

import a14.C0000n0;
import fy3.C32227p;
import gy3.C8479f0;
import kotlin.ResultKt;
import p190l1.C109085c;
import p190l1.C109111s;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2", mo125469f = "DragGestureDetector.kt", mo125470l = {755}, mo125471m = "invokeSuspend")
/* renamed from: y.l */
public final class C112253l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f336115d;

    /* renamed from: e */
    public final /* synthetic */ C109119z f336116e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<C109111s> f336117f;

    /* renamed from: g */
    public final /* synthetic */ C8479f0<C109111s> f336118g;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$awaitLongPressOrCancellation$2$1", mo125469f = "DragGestureDetector.kt", mo125470l = {758, 775}, mo125471m = "invokeSuspend")
    /* renamed from: y.l$a */
    public static final class C112254a extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

        /* renamed from: e */
        public Object f336119e;

        /* renamed from: f */
        public int f336120f;

        /* renamed from: g */
        public int f336121g;

        /* renamed from: h */
        public /* synthetic */ Object f336122h;

        /* renamed from: i */
        public final /* synthetic */ C8479f0<C109111s> f336123i;

        /* renamed from: j */
        public final /* synthetic */ C8479f0<C109111s> f336124j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112254a(C8479f0<C109111s> f0Var, C8479f0<C109111s> f0Var2, C15601d<? super C112254a> dVar) {
            super(2, dVar);
            this.f336123i = f0Var;
            this.f336124j = f0Var2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112254a aVar = new C112254a(this.f336123i, this.f336124j, dVar);
            aVar.f336122h = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112254a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:16:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0082  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x00ab  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00bd  */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00de  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00ed  */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x011c  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0075 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:75:0x00a8 A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x00db A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f336121g
                r3 = 2
                r4 = 0
                r6 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 == r6) goto L_0x0029
                if (r2 != r3) goto L_0x0021
                int r2 = r0.f336120f
                java.lang.Object r7 = r0.f336119e
                l1.l r7 = (p190l1.C109106l) r7
                java.lang.Object r8 = r0.f336122h
                l1.c r8 = (p190l1.C109085c) r8
                kotlin.ResultKt.throwOnFailure(r18)
                r4 = r18
                r5 = r0
                goto L_0x00bf
            L_0x0021:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0029:
                int r2 = r0.f336120f
                java.lang.Object r7 = r0.f336122h
                l1.c r7 = (p190l1.C109085c) r7
                kotlin.ResultKt.throwOnFailure(r18)
                r9 = r18
                r8 = r7
                r7 = r0
                goto L_0x0059
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r2 = r0.f336122h
                l1.c r2 = (p190l1.C109085c) r2
                r8 = r0
                r7 = r2
                r2 = 0
            L_0x0041:
                if (r2 != 0) goto L_0x014a
                l1.n r9 = p190l1.C109108n.Main
                r8.f336122h = r7
                r8.f336119e = r4
                r8.f336120f = r2
                r8.f336121g = r6
                java.lang.Object r9 = r7.mo160333e0(r9, r8)
                if (r9 != r1) goto L_0x0054
                return r1
            L_0x0054:
                r16 = r8
                r8 = r7
                r7 = r16
            L_0x0059:
                l1.l r9 = (p190l1.C109106l) r9
                java.util.List<l1.s> r10 = r9.f326709a
                int r11 = r10.size()
                r12 = 0
            L_0x0062:
                if (r12 >= r11) goto L_0x0075
                java.lang.Object r13 = r10.get(r12)
                l1.s r13 = (p190l1.C109111s) r13
                boolean r13 = p190l1.C109107m.m148149b(r13)
                if (r13 != 0) goto L_0x0072
                r10 = 0
                goto L_0x0076
            L_0x0072:
                int r12 = r12 + 1
                goto L_0x0062
            L_0x0075:
                r10 = 1
            L_0x0076:
                if (r10 == 0) goto L_0x0079
                r2 = 1
            L_0x0079:
                java.util.List<l1.s> r10 = r9.f326709a
                int r11 = r10.size()
                r12 = 0
            L_0x0080:
                if (r12 >= r11) goto L_0x00a8
                java.lang.Object r13 = r10.get(r12)
                l1.s r13 = (p190l1.C109111s) r13
                boolean r14 = r13.mo160355b()
                if (r14 != 0) goto L_0x009f
                long r14 = r8.mo160332b()
                long r4 = r8.mo160335p0()
                boolean r4 = p190l1.C109107m.m148151d(r13, r14, r4)
                if (r4 == 0) goto L_0x009d
                goto L_0x009f
            L_0x009d:
                r4 = 0
                goto L_0x00a0
            L_0x009f:
                r4 = 1
            L_0x00a0:
                if (r4 == 0) goto L_0x00a4
                r4 = 1
                goto L_0x00a9
            L_0x00a4:
                int r12 = r12 + 1
                r4 = 0
                goto L_0x0080
            L_0x00a8:
                r4 = 0
            L_0x00a9:
                if (r4 == 0) goto L_0x00ac
                r2 = 1
            L_0x00ac:
                l1.n r4 = p190l1.C109108n.Final
                r7.f336122h = r8
                r7.f336119e = r9
                r7.f336120f = r2
                r7.f336121g = r3
                java.lang.Object r4 = r8.mo160333e0(r4, r7)
                if (r4 != r1) goto L_0x00bd
                return r1
            L_0x00bd:
                r5 = r7
                r7 = r9
            L_0x00bf:
                l1.l r4 = (p190l1.C109106l) r4
                java.util.List<l1.s> r4 = r4.f326709a
                int r9 = r4.size()
                r10 = 0
            L_0x00c8:
                if (r10 >= r9) goto L_0x00db
                java.lang.Object r11 = r4.get(r10)
                l1.s r11 = (p190l1.C109111s) r11
                boolean r11 = r11.mo160355b()
                if (r11 == 0) goto L_0x00d8
                r4 = 1
                goto L_0x00dc
            L_0x00d8:
                int r10 = r10 + 1
                goto L_0x00c8
            L_0x00db:
                r4 = 0
            L_0x00dc:
                if (r4 == 0) goto L_0x00df
                r2 = 1
            L_0x00df:
                gy3.f0<l1.s> r4 = r5.f336123i
                T r4 = r4.f27484d
                l1.s r4 = (p190l1.C109111s) r4
                long r9 = r4.f326717a
                boolean r4 = p759y.C112242j.m153147h(r7, r9)
                if (r4 != 0) goto L_0x011c
                gy3.f0<l1.s> r4 = r5.f336124j
                java.util.List<l1.s> r7 = r7.f326709a
                gy3.f0<l1.s> r9 = r5.f336123i
                int r10 = r7.size()
                r11 = 0
            L_0x00f8:
                if (r11 >= r10) goto L_0x0118
                java.lang.Object r12 = r7.get(r11)
                r13 = r12
                l1.s r13 = (p190l1.C109111s) r13
                long r13 = r13.f326717a
                T r15 = r9.f27484d
                l1.s r15 = (p190l1.C109111s) r15
                r18 = r7
                long r6 = r15.f326717a
                boolean r6 = p190l1.C109110r.m148153a(r13, r6)
                if (r6 == 0) goto L_0x0112
                goto L_0x0119
            L_0x0112:
                int r11 = r11 + 1
                r7 = r18
                r6 = 1
                goto L_0x00f8
            L_0x0118:
                r12 = 0
            L_0x0119:
                r4.f27484d = r12
                goto L_0x0141
            L_0x011c:
                java.util.List<l1.s> r4 = r7.f326709a
                int r6 = r4.size()
                r7 = 0
            L_0x0123:
                if (r7 >= r6) goto L_0x0134
                java.lang.Object r9 = r4.get(r7)
                r10 = r9
                l1.s r10 = (p190l1.C109111s) r10
                boolean r10 = r10.f326720d
                if (r10 == 0) goto L_0x0131
                goto L_0x0135
            L_0x0131:
                int r7 = r7 + 1
                goto L_0x0123
            L_0x0134:
                r9 = 0
            L_0x0135:
                l1.s r9 = (p190l1.C109111s) r9
                if (r9 == 0) goto L_0x0147
                gy3.f0<l1.s> r4 = r5.f336123i
                r4.f27484d = r9
                gy3.f0<l1.s> r4 = r5.f336124j
                r4.f27484d = r9
            L_0x0141:
                r7 = r8
            L_0x0142:
                r4 = 0
                r6 = 1
                r8 = r5
                goto L_0x0041
            L_0x0147:
                r7 = r8
                r2 = 1
                goto L_0x0142
            L_0x014a:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p759y.C112253l.C112254a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112253l(C109119z zVar, C8479f0<C109111s> f0Var, C8479f0<C109111s> f0Var2, C15601d<? super C112253l> dVar) {
        super(2, dVar);
        this.f336116e = zVar;
        this.f336117f = f0Var;
        this.f336118g = f0Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112253l(this.f336116e, this.f336117f, this.f336118g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112253l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f336115d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C109119z zVar = this.f336116e;
            C112254a aVar2 = new C112254a(this.f336117f, this.f336118g, (C15601d<? super C112254a>) null);
            this.f336115d = 1;
            if (zVar.mo160337A(aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C13598b0.f38549a;
    }
}

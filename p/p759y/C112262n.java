package p759y;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import java.util.List;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p190l1.C109085c;
import p190l1.C109107m;
import p190l1.C109108n;
import p190l1.C109111s;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5", mo125469f = "DragGestureDetector.kt", mo125470l = {276, 280, 284}, mo125471m = "invokeSuspend")
/* renamed from: y.n */
public final class C112262n extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f336149d;

    /* renamed from: e */
    public /* synthetic */ Object f336150e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C112539e, C13598b0> f336151f;

    /* renamed from: g */
    public final /* synthetic */ C32224a<C13598b0> f336152g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f336153h;

    /* renamed from: i */
    public final /* synthetic */ C32227p<C109111s, C112539e, C13598b0> f336154i;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$1", mo125469f = "DragGestureDetector.kt", mo125470l = {286}, mo125471m = "invokeSuspend")
    /* renamed from: y.n$a */
    public static final class C112263a extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

        /* renamed from: e */
        public int f336155e;

        /* renamed from: f */
        public /* synthetic */ Object f336156f;

        /* renamed from: g */
        public final /* synthetic */ C109111s f336157g;

        /* renamed from: h */
        public final /* synthetic */ C32224a<C13598b0> f336158h;

        /* renamed from: i */
        public final /* synthetic */ C32224a<C13598b0> f336159i;

        /* renamed from: j */
        public final /* synthetic */ C32227p<C109111s, C112539e, C13598b0> f336160j;

        /* renamed from: y.n$a$a */
        public static final class C112264a extends C87413o implements C32226l<C109111s, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32227p<C109111s, C112539e, C13598b0> f336161d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112264a(C32227p<? super C109111s, ? super C112539e, C13598b0> pVar) {
                super(1);
                this.f336161d = pVar;
            }

            public Object invoke(Object obj) {
                C109111s sVar = (C109111s) obj;
                C87412m.m108594g(sVar, LocaleUtil.ITALIAN);
                this.f336161d.invoke(sVar, new C112539e(C109107m.m148152e(sVar, false)));
                sVar.mo160354a();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112263a(C109111s sVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32227p<? super C109111s, ? super C112539e, C13598b0> pVar, C15601d<? super C112263a> dVar) {
            super(2, dVar);
            this.f336157g = sVar;
            this.f336158h = aVar;
            this.f336159i = aVar2;
            this.f336160j = pVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112263a aVar = new C112263a(this.f336157g, this.f336158h, this.f336159i, this.f336160j, dVar);
            aVar.f336156f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112263a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C109085c cVar;
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336155e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C109085c cVar2 = (C109085c) this.f336156f;
                long j = this.f336157g.f326717a;
                C112264a aVar2 = new C112264a(this.f336160j);
                this.f336156f = cVar2;
                this.f336155e = 1;
                Object f = C112242j.m153145f(cVar2, j, aVar2, this);
                if (f == aVar) {
                    return aVar;
                }
                cVar = cVar2;
                obj = f;
            } else if (i == 1) {
                cVar = (C109085c) this.f336156f;
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            if (((Boolean) obj).booleanValue()) {
                List<C109111s> list = cVar.mo160330P().f326709a;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C109111s sVar = list.get(i2);
                    C87412m.m108594g(sVar, "<this>");
                    if (!sVar.mo160355b() && sVar.f326723g && !sVar.f326720d) {
                        sVar.mo160354a();
                    }
                }
                this.f336158h.invoke();
            } else {
                this.f336159i.invoke();
            }
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGesturesAfterLongPress$5$down$1", mo125469f = "DragGestureDetector.kt", mo125470l = {277}, mo125471m = "invokeSuspend")
    /* renamed from: y.n$b */
    public static final class C112265b extends C91593i implements C32227p<C109085c, C15601d<? super C109111s>, Object> {

        /* renamed from: e */
        public int f336162e;

        /* renamed from: f */
        public /* synthetic */ Object f336163f;

        public C112265b(C15601d<? super C112265b> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112265b bVar = new C112265b(dVar);
            bVar.f336163f = obj;
            return bVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112265b) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f336162e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f336162e = 1;
                obj = C112205c1.m153110b((C109085c) this.f336163f, C109108n.Main, false, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112262n(C32226l<? super C112539e, C13598b0> lVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C32227p<? super C109111s, ? super C112539e, C13598b0> pVar, C15601d<? super C112262n> dVar) {
        super(2, dVar);
        this.f336151f = lVar;
        this.f336152g = aVar;
        this.f336153h = aVar2;
        this.f336154i = pVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112262n nVar = new C112262n(this.f336151f, this.f336152g, this.f336153h, this.f336154i, dVar);
        nVar.f336150e = obj;
        return nVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112262n) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005a A[Catch:{ CancellationException -> 0x0014 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r11.f336149d
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x002e
            if (r1 == r5) goto L_0x0026
            if (r1 == r4) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ CancellationException -> 0x0014 }
            goto L_0x007e
        L_0x0014:
            r12 = move-exception
            goto L_0x0081
        L_0x0016:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001e:
            java.lang.Object r1 = r11.f336150e
            l1.z r1 = (p190l1.C109119z) r1
            kotlin.ResultKt.throwOnFailure(r12)     // Catch:{ CancellationException -> 0x0014 }
            goto L_0x0055
        L_0x0026:
            java.lang.Object r1 = r11.f336150e
            l1.z r1 = (p190l1.C109119z) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0048
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f336150e
            l1.z r12 = (p190l1.C109119z) r12
            y.n$b r1 = new y.n$b
            r1.<init>(r2)
            r11.f336150e = r12
            r11.f336149d = r5
            java.lang.Object r1 = r12.mo160337A(r1, r11)
            if (r1 != r0) goto L_0x0045
            return r0
        L_0x0045:
            r10 = r1
            r1 = r12
            r12 = r10
        L_0x0048:
            l1.s r12 = (p190l1.C109111s) r12
            r11.f336150e = r1     // Catch:{ CancellationException -> 0x0014 }
            r11.f336149d = r4     // Catch:{ CancellationException -> 0x0014 }
            java.lang.Object r12 = p759y.C112242j.m153140a(r1, r12, r11)     // Catch:{ CancellationException -> 0x0014 }
            if (r12 != r0) goto L_0x0055
            return r0
        L_0x0055:
            r5 = r12
            l1.s r5 = (p190l1.C109111s) r5     // Catch:{ CancellationException -> 0x0014 }
            if (r5 == 0) goto L_0x007e
            fy3.l<z0.e, rx3.b0> r12 = r11.f336151f     // Catch:{ CancellationException -> 0x0014 }
            long r6 = r5.f326719c     // Catch:{ CancellationException -> 0x0014 }
            z0.e r4 = new z0.e     // Catch:{ CancellationException -> 0x0014 }
            r4.<init>(r6)     // Catch:{ CancellationException -> 0x0014 }
            r12.invoke(r4)     // Catch:{ CancellationException -> 0x0014 }
            y.n$a r12 = new y.n$a     // Catch:{ CancellationException -> 0x0014 }
            fy3.a<rx3.b0> r6 = r11.f336153h     // Catch:{ CancellationException -> 0x0014 }
            fy3.a<rx3.b0> r7 = r11.f336152g     // Catch:{ CancellationException -> 0x0014 }
            fy3.p<l1.s, z0.e, rx3.b0> r8 = r11.f336154i     // Catch:{ CancellationException -> 0x0014 }
            r9 = 0
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ CancellationException -> 0x0014 }
            r11.f336150e = r2     // Catch:{ CancellationException -> 0x0014 }
            r11.f336149d = r3     // Catch:{ CancellationException -> 0x0014 }
            java.lang.Object r12 = r1.mo160337A(r12, r11)     // Catch:{ CancellationException -> 0x0014 }
            if (r12 != r0) goto L_0x007e
            return r0
        L_0x007e:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        L_0x0081:
            fy3.a<rx3.b0> r0 = r11.f336152g
            r0.invoke()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112262n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

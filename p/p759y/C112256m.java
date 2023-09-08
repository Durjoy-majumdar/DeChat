package p759y;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C45983e0;
import gy3.C87412m;
import gy3.C87413o;
import kotlin.ResultKt;
import p1166z0.C112539e;
import p190l1.C109085c;
import p190l1.C109107m;
import p190l1.C109111s;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5", mo125469f = "DragGestureDetector.kt", mo125470l = {224}, mo125471m = "invokeSuspend")
/* renamed from: y.m */
public final class C112256m extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f336125d;

    /* renamed from: e */
    public /* synthetic */ Object f336126e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<C112539e, C13598b0> f336127f;

    /* renamed from: g */
    public final /* synthetic */ C32227p<C109111s, C112539e, C13598b0> f336128g;

    /* renamed from: h */
    public final /* synthetic */ C32224a<C13598b0> f336129h;

    /* renamed from: i */
    public final /* synthetic */ C32224a<C13598b0> f336130i;

    @C91590f(mo125468c = "androidx.compose.foundation.gestures.DragGestureDetectorKt$detectDragGestures$5$1", mo125469f = "DragGestureDetector.kt", mo125470l = {225, 229, 241}, mo125471m = "invokeSuspend")
    /* renamed from: y.m$a */
    public static final class C112257a extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

        /* renamed from: e */
        public Object f336131e;

        /* renamed from: f */
        public Object f336132f;

        /* renamed from: g */
        public int f336133g;

        /* renamed from: h */
        public /* synthetic */ Object f336134h;

        /* renamed from: i */
        public final /* synthetic */ C32226l<C112539e, C13598b0> f336135i;

        /* renamed from: j */
        public final /* synthetic */ C32227p<C109111s, C112539e, C13598b0> f336136j;

        /* renamed from: n */
        public final /* synthetic */ C32224a<C13598b0> f336137n;

        /* renamed from: o */
        public final /* synthetic */ C32224a<C13598b0> f336138o;

        /* renamed from: y.m$a$a */
        public static final class C112258a extends C87413o implements C32227p<C109111s, C112539e, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C45983e0 f336139d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112258a(C45983e0 e0Var) {
                super(2);
                this.f336139d = e0Var;
            }

            public Object invoke(Object obj, Object obj2) {
                C109111s sVar = (C109111s) obj;
                long j = ((C112539e) obj2).f336959a;
                C87412m.m108594g(sVar, "change");
                sVar.mo160354a();
                this.f336139d.f124000d = j;
                return C13598b0.f38549a;
            }
        }

        /* renamed from: y.m$a$b */
        public static final class C112259b extends C87413o implements C32226l<C109111s, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C32227p<C109111s, C112539e, C13598b0> f336140d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C112259b(C32227p<? super C109111s, ? super C112539e, C13598b0> pVar) {
                super(1);
                this.f336140d = pVar;
            }

            public Object invoke(Object obj) {
                C109111s sVar = (C109111s) obj;
                C87412m.m108594g(sVar, LocaleUtil.ITALIAN);
                this.f336140d.invoke(sVar, new C112539e(C109107m.m148152e(sVar, false)));
                sVar.mo160354a();
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C112257a(C32226l<? super C112539e, C13598b0> lVar, C32227p<? super C109111s, ? super C112539e, C13598b0> pVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C15601d<? super C112257a> dVar) {
            super(2, dVar);
            this.f336135i = lVar;
            this.f336136j = pVar;
            this.f336137n = aVar;
            this.f336138o = aVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C112257a aVar = new C112257a(this.f336135i, this.f336136j, this.f336137n, this.f336138o, dVar);
            aVar.f336134h = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C112257a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: l1.c} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x0084  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0086  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x00c1  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00c7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
                int r1 = r13.f336133g
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 == 0) goto L_0x0036
                if (r1 == r4) goto L_0x002e
                if (r1 == r2) goto L_0x001d
                if (r1 != r3) goto L_0x0015
                kotlin.ResultKt.throwOnFailure(r14)
                r11 = r13
                goto L_0x00b9
            L_0x0015:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L_0x001d:
                java.lang.Object r1 = r13.f336132f
                gy3.e0 r1 = (gy3.C45983e0) r1
                java.lang.Object r4 = r13.f336131e
                l1.s r4 = (p190l1.C109111s) r4
                java.lang.Object r5 = r13.f336134h
                l1.c r5 = (p190l1.C109085c) r5
                kotlin.ResultKt.throwOnFailure(r14)
                r11 = r13
                goto L_0x0079
            L_0x002e:
                java.lang.Object r1 = r13.f336134h
                l1.c r1 = (p190l1.C109085c) r1
                kotlin.ResultKt.throwOnFailure(r14)
                goto L_0x004c
            L_0x0036:
                kotlin.ResultKt.throwOnFailure(r14)
                java.lang.Object r14 = r13.f336134h
                r1 = r14
                l1.c r1 = (p190l1.C109085c) r1
                r14 = 0
                r13.f336134h = r1
                r13.f336133g = r4
                l1.n r4 = p190l1.C109108n.Main
                java.lang.Object r14 = p759y.C112205c1.m153110b(r1, r4, r14, r13)
                if (r14 != r0) goto L_0x004c
                return r0
            L_0x004c:
                l1.s r14 = (p190l1.C109111s) r14
                gy3.e0 r4 = new gy3.e0
                r4.<init>()
                long r5 = p1166z0.C112539e.f336955b
                r4.f124000d = r5
                r11 = r13
                r12 = r4
                r4 = r14
                r14 = r1
                r1 = r12
            L_0x005c:
                long r6 = r4.f326717a
                int r8 = r4.f326724h
                y.m$a$a r9 = new y.m$a$a
                r9.<init>(r1)
                r11.f336134h = r14
                r11.f336131e = r4
                r11.f336132f = r1
                r11.f336133g = r2
                r5 = r14
                r10 = r11
                java.lang.Object r5 = p759y.C112242j.m153143d(r5, r6, r8, r9, r10)
                if (r5 != r0) goto L_0x0076
                return r0
            L_0x0076:
                r12 = r5
                r5 = r14
                r14 = r12
            L_0x0079:
                l1.s r14 = (p190l1.C109111s) r14
                if (r14 == 0) goto L_0x0086
                boolean r6 = r14.mo160355b()
                if (r6 == 0) goto L_0x0084
                goto L_0x0086
            L_0x0084:
                r14 = r5
                goto L_0x005c
            L_0x0086:
                if (r14 == 0) goto L_0x00cc
                fy3.l<z0.e, rx3.b0> r2 = r11.f336135i
                long r6 = r14.f326719c
                z0.e r4 = new z0.e
                r4.<init>(r6)
                r2.invoke(r4)
                fy3.p<l1.s, z0.e, rx3.b0> r2 = r11.f336136j
                long r6 = r1.f124000d
                z0.e r1 = new z0.e
                r1.<init>(r6)
                r2.invoke(r14, r1)
                long r1 = r14.f326717a
                y.m$a$b r14 = new y.m$a$b
                fy3.p<l1.s, z0.e, rx3.b0> r4 = r11.f336136j
                r14.<init>(r4)
                r4 = 0
                r11.f336134h = r4
                r11.f336131e = r4
                r11.f336132f = r4
                r11.f336133g = r3
                java.lang.Object r14 = p759y.C112242j.m153145f(r5, r1, r14, r11)
                if (r14 != r0) goto L_0x00b9
                return r0
            L_0x00b9:
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 != 0) goto L_0x00c7
                fy3.a<rx3.b0> r14 = r11.f336137n
                r14.invoke()
                goto L_0x00cc
            L_0x00c7:
                fy3.a<rx3.b0> r14 = r11.f336138o
                r14.invoke()
            L_0x00cc:
                rx3.b0 r14 = rx3.C13598b0.f38549a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: p759y.C112256m.C112257a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112256m(C32226l<? super C112539e, C13598b0> lVar, C32227p<? super C109111s, ? super C112539e, C13598b0> pVar, C32224a<C13598b0> aVar, C32224a<C13598b0> aVar2, C15601d<? super C112256m> dVar) {
        super(2, dVar);
        this.f336127f = lVar;
        this.f336128g = pVar;
        this.f336129h = aVar;
        this.f336130i = aVar2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112256m mVar = new C112256m(this.f336127f, this.f336128g, this.f336129h, this.f336130i, dVar);
        mVar.f336126e = obj;
        return mVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112256m) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f336125d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C112257a aVar2 = new C112257a(this.f336127f, this.f336128g, this.f336129h, this.f336130i, (C15601d<? super C112257a>) null);
            this.f336125d = 1;
            if (((C109119z) this.f336126e).mo160337A(aVar2, this) == aVar) {
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

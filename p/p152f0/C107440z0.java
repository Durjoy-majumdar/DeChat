package p152f0;

import fy3.C32227p;
import kotlin.ResultKt;
import p190l1.C109085c;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2", mo125469f = "LongPressTextDragObserver.kt", mo125470l = {98}, mo125471m = "invokeSuspend")
/* renamed from: f0.z0 */
public final class C107440z0 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f321451d;

    /* renamed from: e */
    public /* synthetic */ Object f321452e;

    /* renamed from: f */
    public final /* synthetic */ C107351i1 f321453f;

    @C91590f(mo125468c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2$1", mo125469f = "LongPressTextDragObserver.kt", mo125470l = {99, 103}, mo125471m = "invokeSuspend")
    /* renamed from: f0.z0$a */
    public static final class C107441a extends C91593i implements C32227p<C109085c, C15601d<? super C13598b0>, Object> {

        /* renamed from: e */
        public Object f321454e;

        /* renamed from: f */
        public int f321455f;

        /* renamed from: g */
        public /* synthetic */ Object f321456g;

        /* renamed from: h */
        public final /* synthetic */ C107351i1 f321457h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C107441a(C107351i1 i1Var, C15601d<? super C107441a> dVar) {
            super(2, dVar);
            this.f321457h = i1Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C107441a aVar = new C107441a(this.f321457h, dVar);
            aVar.f321456g = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C107441a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x005f A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x006c  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x008c  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x008a A[EDGE_INSN: B:30:0x008a->B:26:0x008a ?: BREAK  , SYNTHETIC] */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f321455f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L_0x002f
                if (r2 == r4) goto L_0x0025
                if (r2 != r3) goto L_0x001d
                java.lang.Object r2 = r0.f321454e
                l1.s r2 = (p190l1.C109111s) r2
                java.lang.Object r5 = r0.f321456g
                l1.c r5 = (p190l1.C109085c) r5
                kotlin.ResultKt.throwOnFailure(r18)
                r7 = r18
                r6 = r0
                goto L_0x0060
            L_0x001d:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0025:
                java.lang.Object r2 = r0.f321456g
                l1.c r2 = (p190l1.C109085c) r2
                kotlin.ResultKt.throwOnFailure(r18)
                r5 = r18
                goto L_0x0043
            L_0x002f:
                kotlin.ResultKt.throwOnFailure(r18)
                java.lang.Object r2 = r0.f321456g
                l1.c r2 = (p190l1.C109085c) r2
                r0.f321456g = r2
                r0.f321455f = r4
                l1.n r5 = p190l1.C109108n.f326713e
                java.lang.Object r5 = p759y.C112205c1.m153110b(r2, r5, r4, r0)
                if (r5 != r1) goto L_0x0043
                return r1
            L_0x0043:
                l1.s r5 = (p190l1.C109111s) r5
                f0.i1 r6 = r0.f321457h
                long r7 = r5.f326719c
                r6.mo157799c(r7)
                r6 = r0
                r16 = r5
                r5 = r2
                r2 = r16
            L_0x0052:
                r7 = 0
                r6.f321456g = r5
                r6.f321454e = r2
                r6.f321455f = r3
                java.lang.Object r7 = p190l1.C109085c.C109086a.m148099a(r5, r7, r6, r4, r7)
                if (r7 != r1) goto L_0x0060
                return r1
            L_0x0060:
                l1.l r7 = (p190l1.C109106l) r7
                java.util.List<l1.s> r7 = r7.f326709a
                int r8 = r7.size()
                r9 = 0
                r10 = 0
            L_0x006a:
                if (r10 >= r8) goto L_0x008a
                java.lang.Object r11 = r7.get(r10)
                l1.s r11 = (p190l1.C109111s) r11
                long r12 = r11.f326717a
                long r14 = r2.f326717a
                boolean r12 = p190l1.C109110r.m148153a(r12, r14)
                if (r12 == 0) goto L_0x0082
                boolean r11 = r11.f326720d
                if (r11 == 0) goto L_0x0082
                r11 = 1
                goto L_0x0083
            L_0x0082:
                r11 = 0
            L_0x0083:
                if (r11 == 0) goto L_0x0087
                r9 = 1
                goto L_0x008a
            L_0x0087:
                int r10 = r10 + 1
                goto L_0x006a
            L_0x008a:
                if (r9 != 0) goto L_0x0052
                f0.i1 r1 = r6.f321457h
                r1.mo157798b()
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p152f0.C107440z0.C107441a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107440z0(C107351i1 i1Var, C15601d<? super C107440z0> dVar) {
        super(2, dVar);
        this.f321453f = i1Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C107440z0 z0Var = new C107440z0(this.f321453f, dVar);
        z0Var.f321452e = obj;
        return z0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C107440z0) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f321451d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C107441a aVar2 = new C107441a(this.f321453f, (C15601d<? super C107441a>) null);
            this.f321451d = 1;
            if (((C109119z) this.f321452e).mo160337A(aVar2, this) == aVar) {
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

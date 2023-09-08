package p267x;

import fy3.C32227p;
import kotlin.ResultKt;
import p1165z.C112521g;
import p1165z.C112527l;
import p175j0.C60690y0;
import p190l1.C109085c;
import p190l1.C109106l;
import p190l1.C109108n;
import p190l1.C109119z;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91593i;
import yx3.C91594j;

@C91590f(mo125468c = "androidx.compose.foundation.HoverableKt$hoverable$2$3", mo125469f = "Hoverable.kt", mo125470l = {100, 102, 103}, mo125471m = "invokeSuspend")
/* renamed from: x.z0 */
public final class C111973z0 extends C91594j implements C32227p<C109119z, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f335220d;

    /* renamed from: e */
    public int f335221e;

    /* renamed from: f */
    public /* synthetic */ Object f335222f;

    /* renamed from: g */
    public final /* synthetic */ C112527l f335223g;

    /* renamed from: h */
    public final /* synthetic */ C60690y0<C112521g> f335224h;

    @C91590f(mo125468c = "androidx.compose.foundation.HoverableKt$hoverable$2$3$event$1", mo125469f = "Hoverable.kt", mo125470l = {100}, mo125471m = "invokeSuspend")
    /* renamed from: x.z0$a */
    public static final class C111974a extends C91593i implements C32227p<C109085c, C15601d<? super C109106l>, Object> {

        /* renamed from: e */
        public int f335225e;

        /* renamed from: f */
        public /* synthetic */ Object f335226f;

        public C111974a(C15601d<? super C111974a> dVar) {
            super(2, dVar);
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C111974a aVar = new C111974a(dVar);
            aVar.f335226f = obj;
            return aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C111974a) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f335225e;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f335225e = 1;
                obj = C109085c.C109086a.m148099a((C109085c) this.f335226f, (C109108n) null, this, 1, (Object) null);
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
    public C111973z0(C112527l lVar, C60690y0<C112521g> y0Var, C15601d<? super C111973z0> dVar) {
        super(2, dVar);
        this.f335223g = lVar;
        this.f335224h = y0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C111973z0 z0Var = new C111973z0(this.f335223g, this.f335224h, dVar);
        z0Var.f335222f = obj;
        return z0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C111973z0) create((C109119z) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f335221e
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L_0x0032
            if (r1 == r4) goto L_0x0025
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            goto L_0x0018
        L_0x0010:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x0018:
            java.lang.Object r1 = r10.f335220d
            wx3.f r1 = (wx3.C66212f) r1
            java.lang.Object r5 = r10.f335222f
            l1.z r5 = (p190l1.C109119z) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r11 = r5
            goto L_0x003d
        L_0x0025:
            java.lang.Object r1 = r10.f335220d
            wx3.f r1 = (wx3.C66212f) r1
            java.lang.Object r5 = r10.f335222f
            l1.z r5 = (p190l1.C109119z) r5
            kotlin.ResultKt.throwOnFailure(r11)
            r6 = r10
            goto L_0x005b
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f335222f
            l1.z r11 = (p190l1.C109119z) r11
            wx3.f r1 = r10.getContext()
        L_0x003d:
            r5 = r10
        L_0x003e:
            boolean r6 = a14.C53873d2.m60394f(r1)
            if (r6 == 0) goto L_0x0093
            x.z0$a r6 = new x.z0$a
            r7 = 0
            r6.<init>(r7)
            r5.f335222f = r11
            r5.f335220d = r1
            r5.f335221e = r4
            java.lang.Object r6 = r11.mo160337A(r6, r5)
            if (r6 != r0) goto L_0x0057
            return r0
        L_0x0057:
            r9 = r5
            r5 = r11
            r11 = r6
            r6 = r9
        L_0x005b:
            l1.l r11 = (p190l1.C109106l) r11
            int r11 = r11.f326711c
            r7 = 4
            r8 = 0
            if (r11 != r7) goto L_0x0065
            r7 = 1
            goto L_0x0066
        L_0x0065:
            r7 = 0
        L_0x0066:
            if (r7 == 0) goto L_0x0079
            z.l r11 = r6.f335223g
            j0.y0<z.g> r7 = r6.f335224h
            r6.f335222f = r5
            r6.f335220d = r1
            r6.f335221e = r3
            java.lang.Object r11 = p267x.C111892c1.m152612a(r11, r7, r6)
            if (r11 != r0) goto L_0x0090
            return r0
        L_0x0079:
            r7 = 5
            if (r11 != r7) goto L_0x007d
            r8 = 1
        L_0x007d:
            if (r8 == 0) goto L_0x0090
            j0.y0<z.g> r11 = r6.f335224h
            z.l r7 = r6.f335223g
            r6.f335222f = r5
            r6.f335220d = r1
            r6.f335221e = r2
            java.lang.Object r11 = p267x.C111892c1.m152613b(r11, r7, r6)
            if (r11 != r0) goto L_0x0090
            return r0
        L_0x0090:
            r11 = r5
            r5 = r6
            goto L_0x003e
        L_0x0093:
            rx3.b0 r11 = rx3.C13598b0.f38549a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p267x.C111973z0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

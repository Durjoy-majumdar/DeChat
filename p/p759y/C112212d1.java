package p759y;

import fy3.C32227p;
import p190l1.C109085c;
import p190l1.C109111s;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91593i;

@C91590f(mo125468c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$awaitSecondDown$2", mo125469f = "TapGestureDetector.kt", mo125470l = {189}, mo125471m = "invokeSuspend")
/* renamed from: y.d1 */
public final class C112212d1 extends C91593i implements C32227p<C109085c, C15601d<? super C109111s>, Object> {

    /* renamed from: e */
    public long f335958e;

    /* renamed from: f */
    public int f335959f;

    /* renamed from: g */
    public /* synthetic */ Object f335960g;

    /* renamed from: h */
    public final /* synthetic */ C109111s f335961h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112212d1(C109111s sVar, C15601d<? super C112212d1> dVar) {
        super(2, dVar);
        this.f335961h = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C112212d1 d1Var = new C112212d1(this.f335961h, dVar);
        d1Var.f335960g = obj;
        return d1Var;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112212d1) create((C109085c) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r10.f335959f
            r2 = 1
            if (r1 == 0) goto L_0x001f
            if (r1 != r2) goto L_0x0017
            long r3 = r10.f335958e
            java.lang.Object r1 = r10.f335960g
            l1.c r1 = (p190l1.C109085c) r1
            kotlin.ResultKt.throwOnFailure(r11)
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            goto L_0x004a
        L_0x0017:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L_0x001f:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.f335960g
            l1.c r11 = (p190l1.C109085c) r11
            l1.s r1 = r10.f335961h
            long r3 = r1.f326718b
            androidx.compose.ui.platform.i2 r1 = r11.getViewConfiguration()
            long r5 = r1.mo144727c()
            long r3 = r3 + r5
            r1 = r11
            r11 = r10
        L_0x0035:
            r11.f335960g = r1
            r11.f335958e = r3
            r11.f335959f = r2
            l1.n r5 = p190l1.C109108n.Main
            java.lang.Object r5 = p759y.C112205c1.m153110b(r1, r5, r2, r11)
            if (r5 != r0) goto L_0x0044
            return r0
        L_0x0044:
            r9 = r0
            r0 = r11
            r11 = r5
            r4 = r3
            r3 = r1
            r1 = r9
        L_0x004a:
            l1.s r11 = (p190l1.C109111s) r11
            long r6 = r11.f326718b
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 < 0) goto L_0x0053
            return r11
        L_0x0053:
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: p759y.C112212d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

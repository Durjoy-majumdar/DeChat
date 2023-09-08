package x70;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.media.camera.camerakit.CameraKitOperate$switchCamera$1", mo125469f = "CameraKitOperate.kt", mo125470l = {47, 48}, mo125471m = "invokeSuspend")
/* renamed from: x70.p */
public final class C112062p extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f335476d;

    /* renamed from: e */
    public final /* synthetic */ C112065s f335477e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112062p(C112065s sVar, C15601d<? super C112062p> dVar) {
        super(2, dVar);
        this.f335477e = sVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C112062p(this.f335477e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C112062p) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r6.f335476d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 == r3) goto L_0x0018
            if (r1 != r2) goto L_0x0010
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x0069
        L_0x0010:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L_0x0018:
            kotlin.ResultKt.throwOnFailure(r7)
            goto L_0x005c
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r7)
            x70.s r7 = r6.f335477e
            a80.c r7 = r7.f335420e
            if (r7 == 0) goto L_0x006c
            e80.c r7 = r7.mo143116v()
            if (r7 != 0) goto L_0x002c
            goto L_0x006c
        L_0x002c:
            x70.s r1 = r6.f335477e
            a80.c r1 = r1.f335420e
            r4 = 0
            if (r1 == 0) goto L_0x0038
            boolean r1 = r1.mo143109n()
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            x70.s r5 = r6.f335477e
            a80.c r5 = r5.f335420e
            if (r5 == 0) goto L_0x0043
            boolean r4 = r5.mo143110o()
        L_0x0043:
            boolean r7 = r7.f320908c
            if (r7 == 0) goto L_0x0049
            if (r4 != 0) goto L_0x004d
        L_0x0049:
            if (r7 != 0) goto L_0x0069
            if (r1 == 0) goto L_0x0069
        L_0x004d:
            x70.s r7 = r6.f335477e
            a80.c r7 = r7.f335420e
            if (r7 == 0) goto L_0x005e
            r6.f335476d = r3
            java.lang.Object r7 = r7.mo143129x(r6)
            if (r7 != r0) goto L_0x005c
            return r0
        L_0x005c:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
        L_0x005e:
            x70.s r7 = r6.f335477e
            r6.f335476d = r2
            java.lang.Object r7 = x70.C112065s.m152791r(r7, r6)
            if (r7 != r0) goto L_0x0069
            return r0
        L_0x0069:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        L_0x006c:
            rx3.b0 r7 = rx3.C13598b0.f38549a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: x70.C112062p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

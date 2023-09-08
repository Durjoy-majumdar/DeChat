package il1;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveVisitorLikeWidget$startUpLoadLike$1", mo125469f = "FinderLiveVisitorLikeWidget.kt", mo125470l = {192, 196}, mo125471m = "invokeSuspend")
/* renamed from: il1.q8 */
public final class C60498q8 extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f172447d;

    /* renamed from: e */
    public final /* synthetic */ C60424h8 f172448e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60498q8(C60424h8 h8Var, C15601d<? super C60498q8> dVar) {
        super(2, dVar);
        this.f172448e = h8Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C60498q8(this.f172448e, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C60498q8) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r11.f172447d
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r4) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r0
            r0 = r11
            goto L_0x008d
        L_0x0014:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L_0x001c:
            kotlin.ResultKt.throwOnFailure(r12)
            r1 = r0
            r0 = r11
            goto L_0x005a
        L_0x0022:
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
        L_0x0026:
            il1.h8 r1 = r12.f172448e
            int r5 = r1.f172276A
            r6 = 0
            r1.f172276A = r6
            java.lang.String r1 = r1.f172287r
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "[startUpLoadLike] upload count = "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r6)
            il1.h8 r1 = r12.f172448e
            qj1.c r1 = r1.f172286q
            cj1.n5 r1 = r1.mo14476D0()
            if (r1 == 0) goto L_0x005d
            r12.f172447d = r4
            java.lang.Object r1 = r1.mo75730d0(r5, r4, r12)
            if (r1 != r0) goto L_0x0056
            return r0
        L_0x0056:
            r10 = r0
            r0 = r12
            r12 = r1
            r1 = r10
        L_0x005a:
            te3.pr0 r12 = (te3.C50863pr0) r12
            goto L_0x0060
        L_0x005d:
            r1 = r0
            r0 = r12
            r12 = r3
        L_0x0060:
            if (r12 == 0) goto L_0x0090
            il1.h8 r5 = r0.f172448e
            int r12 = r12.f139910e
            if (r12 >= r4) goto L_0x0069
            r12 = 1
        L_0x0069:
            long r6 = (long) r12
            r8 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 * r8
            java.lang.String r12 = r5.f172287r
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "[startUpLoadLike] delay = "
            r5.append(r8)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r5)
            r0.f172447d = r2
            java.lang.Object r12 = a14.C53965x0.m60607b(r6, r0)
            if (r12 != r1) goto L_0x008d
            return r1
        L_0x008d:
            r12 = r0
            r0 = r1
            goto L_0x009a
        L_0x0090:
            il1.h8 r12 = r0.f172448e
            a14.z1 r12 = r12.f172284I
            if (r12 == 0) goto L_0x008d
            a14.C53973z1.C53974a.m60623a(r12, r3, r4, r3)
            goto L_0x008d
        L_0x009a:
            il1.h8 r1 = r12.f172448e
            int r5 = r1.f172276A
            if (r5 > 0) goto L_0x0026
            java.lang.String r0 = r1.f172287r
            java.lang.String r1 = "[startUpLoadLike] stop"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            il1.h8 r12 = r12.f172448e
            a14.z1 r12 = r12.f172284I
            if (r12 == 0) goto L_0x00b0
            a14.C53973z1.C53974a.m60623a(r12, r3, r4, r3)
        L_0x00b0:
            rx3.b0 r12 = rx3.C13598b0.f38549a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C60498q8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

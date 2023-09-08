package nj2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wj2.C66132f;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.RingBackHelper$getCallingRingBackMediaInfo$2", mo125469f = "RingBackHelper.kt", mo125470l = {134, 137, 142}, mo125471m = "invokeSuspend")
/* renamed from: nj2.l */
public final class C61764l extends C91594j implements C32227p<C0000n0, C15601d<? super C66132f>, Object> {

    /* renamed from: d */
    public Object f175565d;

    /* renamed from: e */
    public int f175566e;

    /* renamed from: f */
    public final /* synthetic */ String f175567f;

    /* renamed from: g */
    public final /* synthetic */ boolean f175568g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61764l(String str, boolean z, C15601d<? super C61764l> dVar) {
        super(2, dVar);
        this.f175567f = str;
        this.f175568g = z;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C61764l(this.f175567f, this.f175568g, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61764l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r7.f175566e
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L_0x002d
            if (r1 == r4) goto L_0x0029
            if (r1 == r3) goto L_0x0021
            if (r1 != r2) goto L_0x0019
            java.lang.Object r0 = r7.f175565d
            gy3.f0 r0 = (gy3.C8479f0) r0
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x00af
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0021:
            java.lang.Object r1 = r7.f175565d
            gy3.f0 r1 = (gy3.C8479f0) r1
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x008f
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0066
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "getCallingRingBackMediaInfo, username:"
            r8.append(r1)
            java.lang.String r1 = r7.f175567f
            r8.append(r1)
            java.lang.String r1 = ", isOutCall:"
            r8.append(r1)
            boolean r1 = r7.f175568g
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            java.lang.String r1 = "MicroMsg.RingBackHelper"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r8)
            java.lang.String r8 = r7.f175567f
            boolean r1 = r7.f175568g
            r7.f175566e = r4
            a14.h0 r4 = a14.C53872d1.f151119c
            nj2.d r6 = new nj2.d
            r6.<init>(r8, r1, r5)
            java.lang.Object r8 = a14.C53895h.m60469g(r4, r6, r7)
            if (r8 != r0) goto L_0x0066
            return r0
        L_0x0066:
            rx3.l r8 = (rx3.C13604l) r8
            gy3.f0 r1 = new gy3.f0
            r1.<init>()
            A r4 = r8.f38555d
            r1.f27484d = r4
            B r8 = r8.f38556e
            oj2.b r8 = (oj2.C62035b) r8
            wj2.e r6 = wj2.C53183e.UNKNOWN
            if (r4 != r6) goto L_0x0091
            boolean r4 = r7.f175568g
            if (r4 != 0) goto L_0x0091
            r7.f175565d = r1
            r7.f175566e = r3
            a14.h0 r8 = a14.C53872d1.f151119c
            yj2.e r3 = new yj2.e
            r3.<init>(r5)
            java.lang.Object r8 = a14.C53895h.m60469g(r8, r3, r7)
            if (r8 != r0) goto L_0x008f
            return r0
        L_0x008f:
            oj2.b r8 = (oj2.C62035b) r8
        L_0x0091:
            if (r8 != 0) goto L_0x009a
            wj2.h$a r8 = wj2.C66135h.f190107E
            wj2.f r8 = r8.mo90187b()
            goto L_0x00b2
        L_0x009a:
            r7.f175565d = r1
            r7.f175566e = r2
            nj2.o r2 = nj2.C61767o.f175575a
            a14.h0 r2 = a14.C53872d1.f151119c
            nj2.n r3 = new nj2.n
            r3.<init>(r8, r5)
            java.lang.Object r8 = a14.C53895h.m60469g(r2, r3, r7)
            if (r8 != r0) goto L_0x00ae
            return r0
        L_0x00ae:
            r0 = r1
        L_0x00af:
            wj2.f r8 = (wj2.C66132f) r8
            r1 = r0
        L_0x00b2:
            java.lang.String r0 = r8.mo90176g()
            java.lang.String r2 = "voip_default_sound"
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 != 0) goto L_0x00cf
            T r0 = r1.f27484d
            wj2.e r3 = wj2.C53183e.UNKNOWN
            if (r0 == r3) goto L_0x00cf
            wj2.e r0 = (wj2.C53183e) r0
            java.lang.String r1 = "<set-?>"
            gy3.C87412m.m108594g(r0, r1)
            r8.f190090m = r0
            goto L_0x00e8
        L_0x00cf:
            java.lang.String r0 = r8.mo90176g()
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x00e4
            T r0 = r1.f27484d
            wj2.e r1 = wj2.C53183e.UNKNOWN
            if (r0 == r1) goto L_0x00e4
            wj2.e r0 = wj2.C53183e.DEFAULT
            r8.f190090m = r0
            goto L_0x00e8
        L_0x00e4:
            wj2.e r0 = wj2.C53183e.UNKNOWN
            r8.f190090m = r0
        L_0x00e8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.C61764l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package nj2;

import a14.C0000n0;
import fy3.C32227p;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.ringtone.RingtoneManager$postCheckRingtone$1", mo125469f = "RingtoneManager.kt", mo125470l = {326, 328}, mo125471m = "invokeSuspend")
/* renamed from: nj2.q */
public final class C61770q extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f175605d;

    /* renamed from: e */
    public /* synthetic */ Object f175606e;

    /* renamed from: f */
    public final /* synthetic */ String f175607f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61770q(String str, C15601d<? super C61770q> dVar) {
        super(2, dVar);
        this.f175607f = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C61770q qVar = new C61770q(this.f175607f, dVar);
        qVar.f175606e = obj;
        return qVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C61770q) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: a14.n0} */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106451l(r2.mo90177h()) != 0) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0100, code lost:
        if (com.tencent.p014mm.vfs.C86013q1.m106451l(r2.mo90177h()) != 0) goto L_0x0117;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            xx3.a r0 = xx3.C15911a.COROUTINE_SUSPENDED
            int r1 = r12.f175605d
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L_0x0023
            if (r1 == r4) goto L_0x001b
            if (r1 != r5) goto L_0x0013
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x011c
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001b:
            java.lang.Object r1 = r12.f175606e
            a14.n0 r1 = (a14.C0000n0) r1
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x0041
        L_0x0023:
            kotlin.ResultKt.throwOnFailure(r13)
            java.lang.Object r13 = r12.f175606e
            r1 = r13
            a14.n0 r1 = (a14.C0000n0) r1
            java.lang.String r13 = r12.f175607f
            r12.f175606e = r1
            r12.f175605d = r4
            nj2.o r6 = nj2.C61767o.f175575a
            a14.h0 r6 = a14.C53872d1.f151119c
            nj2.l r7 = new nj2.l
            r7.<init>(r13, r3, r2)
            java.lang.Object r13 = a14.C53895h.m60469g(r6, r7, r12)
            if (r13 != r0) goto L_0x0041
            return r0
        L_0x0041:
            wj2.f r13 = (wj2.C66132f) r13
            boolean r1 = a14.C53930o0.m60560g(r1)
            if (r1 == 0) goto L_0x011c
            nj2.p r1 = nj2.C61768p.f175586a
            java.lang.String r6 = r12.f175607f
            r12.f175606e = r2
            r12.f175605d = r5
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "checkIfRingtoneSetup toUser:"
            r7.append(r8)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.RingtoneManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r7)
            int r7 = r6.length()
            if (r7 != 0) goto L_0x006f
            r7 = 1
            goto L_0x0070
        L_0x006f:
            r7 = 0
        L_0x0070:
            if (r7 == 0) goto L_0x0076
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0119
        L_0x0076:
            wj2.e r7 = r13.f190090m
            int r7 = r7.ordinal()
            java.lang.String r9 = ""
            if (r7 == r4) goto L_0x010c
            r10 = 0
            if (r7 == r5) goto L_0x00c9
            r2 = 3
            if (r7 == r2) goto L_0x0089
            goto L_0x0117
        L_0x0089:
            java.lang.String r2 = "checkIfRingtoneSetup reset exclusive"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r2)
            wj2.f r2 = nj2.C61768p.m72481i(r6)
            if (r2 == 0) goto L_0x00bf
            boolean r5 = r2.mo90170a()
            if (r5 == 0) goto L_0x00bf
            java.lang.String r5 = r2.mo90176g()
            java.lang.String r7 = r13.mo90176g()
            boolean r5 = gy3.C87412m.m108589b(r5, r7)
            if (r5 == 0) goto L_0x00bf
            d03.a r5 = r2.f190078a
            if (r5 == 0) goto L_0x00b1
            boolean r5 = r5.f165933e
            if (r5 != r4) goto L_0x00b1
            r3 = 1
        L_0x00b1:
            if (r3 == 0) goto L_0x00bf
            java.lang.String r2 = r2.mo90177h()
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0117
        L_0x00bf:
            java.lang.Object r13 = r1.mo86689a(r6, r13, r4, r12)
            if (r13 != r0) goto L_0x00c6
            goto L_0x0119
        L_0x00c6:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0119
        L_0x00c9:
            java.lang.String r5 = "checkIfRingtoneSetup reset global"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r5)
            nj2.C61768p.m72484l(r6, r2)
            wj2.f r2 = nj2.C61768p.m72481i(r9)
            if (r2 == 0) goto L_0x0102
            boolean r5 = r2.mo90170a()
            if (r5 == 0) goto L_0x0102
            java.lang.String r5 = r2.mo90176g()
            java.lang.String r6 = r13.mo90176g()
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x0102
            d03.a r5 = r2.f190078a
            if (r5 == 0) goto L_0x00f4
            boolean r5 = r5.f165933e
            if (r5 != r4) goto L_0x00f4
            r3 = 1
        L_0x00f4:
            if (r3 == 0) goto L_0x0102
            java.lang.String r2 = r2.mo90177h()
            long r2 = com.tencent.p014mm.vfs.C86013q1.m106451l(r2)
            int r5 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r5 != 0) goto L_0x0117
        L_0x0102:
            java.lang.Object r13 = r1.mo86689a(r9, r13, r4, r12)
            if (r13 != r0) goto L_0x0109
            goto L_0x0119
        L_0x0109:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            goto L_0x0119
        L_0x010c:
            java.lang.String r13 = "checkIfRingtoneSetup reset default"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r13)
            nj2.C61768p.m72484l(r6, r2)
            nj2.C61768p.m72484l(r9, r2)
        L_0x0117:
            rx3.b0 r13 = rx3.C13598b0.f38549a
        L_0x0119:
            if (r13 != r0) goto L_0x011c
            return r0
        L_0x011c:
            rx3.b0 r13 = rx3.C13598b0.f38549a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: nj2.C61770q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

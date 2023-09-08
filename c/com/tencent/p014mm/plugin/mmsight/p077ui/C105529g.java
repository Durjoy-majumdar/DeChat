package com.tencent.p014mm.plugin.mmsight.p077ui;

import a14.C0000n0;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.mmsight.ui.ImproveProgressHandlerAnimator$startProgressJob$1", mo125469f = "ImproveProgressHandlerAnimator.kt", mo125470l = {51, 54, 59}, mo125471m = "invokeSuspend")
/* renamed from: com.tencent.mm.plugin.mmsight.ui.g */
public final class C105529g extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f313925d;

    /* renamed from: e */
    public /* synthetic */ Object f313926e;

    /* renamed from: f */
    public final /* synthetic */ C105534i f313927f;

    @C91590f(mo125468c = "com.tencent.mm.plugin.mmsight.ui.ImproveProgressHandlerAnimator$startProgressJob$1$1", mo125469f = "ImproveProgressHandlerAnimator.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: com.tencent.mm.plugin.mmsight.ui.g$a */
    public static final class C105530a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public final /* synthetic */ C105534i f313928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C105530a(C105534i iVar, C15601d<? super C105530a> dVar) {
            super(2, dVar);
            this.f313928d = iVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C105530a(this.f313928d, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C105530a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C105516a aVar = this.f313928d.f313942k;
            if (aVar == null) {
                return null;
            }
            aVar.onAnimationEnd();
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105529g(C105534i iVar, C15601d<? super C105529g> dVar) {
        super(2, dVar);
        this.f313927f = iVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        C105529g gVar = new C105529g(this.f313927f, dVar);
        gVar.f313926e = obj;
        return gVar;
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C105529g) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x01ef A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
            int r2 = r0.f313925d
            r3 = 3
            r4 = 2
            r5 = 1
            java.lang.String r7 = "MicroMsg.ImproveProgressHandlerAnimator"
            if (r2 == 0) goto L_0x0039
            if (r2 == r5) goto L_0x002e
            if (r2 == r4) goto L_0x0029
            if (r2 != r3) goto L_0x0021
            java.lang.Object r2 = r0.f313926e
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r19)
            r8 = r0
            r4 = r7
            r0 = 3
            r3 = 2
            r5 = 0
            goto L_0x0200
        L_0x0021:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0029:
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x0208
        L_0x002e:
            java.lang.Object r2 = r0.f313926e
            a14.n0 r2 = (a14.C0000n0) r2
            kotlin.ResultKt.throwOnFailure(r19)
            r8 = r0
            r4 = r7
            goto L_0x01aa
        L_0x0039:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.f313926e
            a14.n0 r2 = (a14.C0000n0) r2
            java.lang.String r8 = "isStartProgress"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            r8 = r0
        L_0x0046:
            boolean r9 = a14.C53930o0.m60560g(r2)
            if (r9 == 0) goto L_0x0208
            com.tencent.mm.plugin.mmsight.ui.i r9 = r8.f313927f
            boolean r10 = r9.f313941j
            if (r10 != 0) goto L_0x005b
            java.lang.String r1 = java.lang.String.valueOf(r10)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r1)
            goto L_0x0208
        L_0x005b:
            r8.f313926e = r2
            r8.f313925d = r5
            r9.getClass()
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = r9.f313938g
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L_0x0076
            java.lang.String r9 = "updateProgress >> timestamp is no change"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r9)
            rx3.b0 r9 = rx3.C13598b0.f38549a
            r4 = r7
            goto L_0x01a7
        L_0x0076:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "updateProgress >> lastTimeStamp = "
            r12.append(r13)
            long r14 = r9.f313938g
            r12.append(r14)
            java.lang.String r14 = ", isVarSpeed = "
            r12.append(r14)
            boolean r15 = r9.f313936e
            r12.append(r15)
            java.lang.String r15 = ",currentProgress = "
            r12.append(r15)
            float r5 = r9.f313937f
            r12.append(r5)
            java.lang.String r5 = ", varFastStopStamp = "
            r12.append(r5)
            long r3 = r9.f313939h
            r12.append(r3)
            java.lang.String r3 = ", varFastProgress = "
            r12.append(r3)
            float r4 = r9.f313940i
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r4)
            boolean r4 = r9.f313936e
            java.lang.String r12 = ", time = "
            if (r4 == 0) goto L_0x0161
            float r4 = r9.f313937f
            r16 = 1181376512(0x466a6000, float:15000.0)
            r17 = 1112014848(0x42480000, float:50.0)
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 >= 0) goto L_0x0111
            r4 = r7
            long r6 = r9.f313938g
            long r6 = r10 - r6
            float r0 = (float) r6
            float r0 = r0 / r16
            float r0 = r0 * r17
            r9.f313937f = r0
            r9.f313940i = r0
            r9.f313939h = r10
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            long r10 = r9.f313938g
            r0.append(r10)
            r0.append(r14)
            boolean r10 = r9.f313936e
            r0.append(r10)
            r0.append(r15)
            float r10 = r9.f313937f
            r0.append(r10)
            r0.append(r5)
            long r10 = r9.f313939h
            r0.append(r10)
            r0.append(r3)
            float r3 = r9.f313940i
            r0.append(r3)
            r0.append(r12)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0199
        L_0x0111:
            r4 = r7
            long r6 = r9.f313939h
            long r10 = r10 - r6
            float r0 = (float) r10
            float r6 = r9.f313933b
            float r6 = r6 - r16
            float r0 = r0 / r6
            r6 = 100
            float r6 = (float) r6
            float r7 = r9.f313940i
            float r6 = r6 - r7
            float r0 = r0 * r6
            float r0 = r0 + r7
            r9.f313937f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            long r6 = r9.f313938g
            r0.append(r6)
            r0.append(r14)
            boolean r6 = r9.f313936e
            r0.append(r6)
            r0.append(r15)
            float r6 = r9.f313937f
            r0.append(r6)
            r0.append(r5)
            long r5 = r9.f313939h
            r0.append(r5)
            r0.append(r3)
            float r3 = r9.f313940i
            r0.append(r3)
            r0.append(r12)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            goto L_0x0199
        L_0x0161:
            r4 = r7
            long r5 = r9.f313938g
            long r10 = r10 - r5
            float r0 = (float) r10
            float r3 = r9.f313933b
            float r0 = r0 / r3
            r3 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r3
            r9.f313937f = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r13)
            long r5 = r9.f313938g
            r0.append(r5)
            r0.append(r14)
            boolean r3 = r9.f313936e
            r0.append(r3)
            r0.append(r15)
            float r3 = r9.f313937f
            r0.append(r3)
            r0.append(r12)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
        L_0x0199:
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r0 = f14.C58901s.f168555a
            com.tencent.mm.plugin.mmsight.ui.h r3 = new com.tencent.mm.plugin.mmsight.ui.h
            r5 = 0
            r3.<init>(r9, r5)
            java.lang.Object r9 = a14.C53895h.m60469g(r0, r3, r8)
        L_0x01a7:
            if (r9 != r1) goto L_0x01aa
            return r1
        L_0x01aa:
            com.tencent.mm.plugin.mmsight.ui.i r0 = r8.f313927f
            float r3 = r0.f313937f
            float r0 = r0.f313932a
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x01f0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "is reach maxProgress "
            r0.append(r2)
            com.tencent.mm.plugin.mmsight.ui.i r2 = r8.f313927f
            float r2 = r2.f313937f
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            com.tencent.mm.plugin.mmsight.ui.i r2 = r8.f313927f
            float r2 = r2.f313932a
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            a14.h0 r0 = a14.C53872d1.f151117a
            a14.k2 r0 = f14.C58901s.f168555a
            com.tencent.mm.plugin.mmsight.ui.g$a r2 = new com.tencent.mm.plugin.mmsight.ui.g$a
            com.tencent.mm.plugin.mmsight.ui.i r3 = r8.f313927f
            r5 = 0
            r2.<init>(r3, r5)
            r8.f313926e = r5
            r3 = 2
            r8.f313925d = r3
            java.lang.Object r0 = a14.C53895h.m60469g(r0, r2, r8)
            if (r0 != r1) goto L_0x0208
            return r1
        L_0x01f0:
            r3 = 2
            r5 = 0
            r6 = 20
            r8.f313926e = r2
            r0 = 3
            r8.f313925d = r0
            java.lang.Object r6 = a14.C53965x0.m60607b(r6, r8)
            if (r6 != r1) goto L_0x0200
            return r1
        L_0x0200:
            r0 = r18
            r7 = r4
            r3 = 3
            r4 = 2
            r5 = 1
            goto L_0x0046
        L_0x0208:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.mmsight.p077ui.C105529g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

package ou2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58085t0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import os2.C62176t;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1", mo125469f = "IpInteractScheduleVideoController.kt", mo125470l = {214, 223}, mo125471m = "invokeSuspend")
/* renamed from: ou2.n */
public final class C100539n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f294567d;

    /* renamed from: e */
    public /* synthetic */ Object f294568e;

    /* renamed from: f */
    public final /* synthetic */ C62176t f294569f;

    /* renamed from: g */
    public final /* synthetic */ C100511m f294570g;

    /* renamed from: h */
    public final /* synthetic */ int f294571h;

    /* renamed from: i */
    public final /* synthetic */ C58085t0<Boolean> f294572i;

    /* renamed from: ou2.n$a */
    public static final class C100540a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C100511m f294573d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100540a(C100511m mVar) {
            super(0);
            this.f294573d = mVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            C100509l f = this.f294573d.mo139955f();
            Long valueOf = Long.valueOf(f != null ? f.getCurrentPosInMills() : 0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            return valueOf;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100539n(C62176t tVar, C100511m mVar, int i, C58085t0<Boolean> t0Var, C15601d<? super C100539n> dVar) {
        super(2, dVar);
        this.f294569f = tVar;
        this.f294570g = mVar;
        this.f294571h = i;
        this.f294572i = t0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        C100539n nVar = new C100539n(this.f294569f, this.f294570g, this.f294571h, this.f294572i, dVar);
        nVar.f294568e = obj;
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return nVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        Object invokeSuspend = ((C100539n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return invokeSuspend;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: a14.n0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            r27 = this;
            r12 = r27
            java.lang.String r13 = "invokeSuspend"
            java.lang.String r14 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r14)
            xx3.a r15 = xx3.C15911a.COROUTINE_SUSPENDED
            int r0 = r12.f294567d
            java.lang.String r11 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController"
            java.lang.String r10 = "access$getTAG$cp"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.IpInteractScheduleVideoController$Companion"
            java.lang.String r8 = "getTAG"
            r7 = 2
            r1 = 1
            java.lang.String r6 = "IpInteractScheduleVideoController"
            if (r0 == 0) goto L_0x0043
            if (r0 == r1) goto L_0x0031
            if (r0 != r7) goto L_0x0026
            kotlin.ResultKt.throwOnFailure(r28)
            r2 = r12
            goto L_0x0131
        L_0x0026:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            throw r0
        L_0x0031:
            java.lang.Object r0 = r12.f294568e
            a14.n0 r0 = (a14.C0000n0) r0
            kotlin.ResultKt.throwOnFailure(r28)
            r23 = r6
            r24 = r8
            r25 = r9
            r26 = r10
            r12 = r11
            goto L_0x00ce
        L_0x0043:
            kotlin.ResultKt.throwOnFailure(r28)
            java.lang.Object r0 = r12.f294568e
            r4 = r0
            a14.n0 r4 = (a14.C0000n0) r4
            os2.t r0 = r12.f294569f
            if (r0 != 0) goto L_0x007c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r11)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "reseekBreakVideo playState is null!!! currentState = "
            r0.append(r1)
            ou2.m r1 = r12.f294570g
            int r1 = ou2.C100511m.m131543m(r1)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r0
        L_0x007c:
            ou2.m r0 = r12.f294570g
            ou2.n$a r2 = new ou2.n$a
            r2.<init>(r0)
            os2.t r3 = r12.f294569f
            r3.getClass()
            java.lang.String r5 = "getSectionEnd"
            java.lang.String r7 = "com.tencent.mm.plugin.sns.storage.PlayState"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r5, r7)
            float r3 = r3.f176781c
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r5, r7)
            r28 = r2
            long r1 = (long) r3
            r16 = 50
            r7 = 0
            r18 = 5
            r19 = 0
            r20 = 40
            r21 = 0
            r12.f294568e = r4
            r3 = 1
            r12.f294567d = r3
            r2 = r1
            r1 = r28
            r22 = r4
            r4 = r16
            r23 = r6
            r6 = r7
            r7 = r18
            r24 = r8
            r8 = r19
            r25 = r9
            r9 = r27
            r26 = r10
            r10 = r20
            r12 = r11
            r11 = r21
            java.lang.Object r0 = ou2.C100462a.m131484c(r0, r1, r2, r4, r6, r7, r8, r9, r10, r11)
            if (r0 != r15) goto L_0x00cc
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r15
        L_0x00cc:
            r0 = r22
        L_0x00ce:
            r2 = r24
            r1 = r25
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r1)
            r3 = r26
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r12)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reseekBreakVideo delay end "
            r1.append(r2)
            boolean r0 = a14.C53930o0.m60560g(r0)
            r1.append(r0)
            r0 = 32
            r1.append(r0)
            r2 = r27
            int r3 = r2.f294571h
            r1.append(r3)
            r1.append(r0)
            ou2.m r0 = r2.f294570g
            int r0 = ou2.C100511m.m131543m(r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r23
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            int r0 = r2.f294571h
            ou2.m r1 = r2.f294570g
            int r1 = ou2.C100511m.m131543m(r1)
            if (r0 != r1) goto L_0x0131
            d14.t0<java.lang.Boolean> r0 = r2.f294572i
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3 = 0
            r2.f294568e = r3
            r3 = 2
            r2.f294567d = r3
            java.lang.Object r0 = r0.emit(r1, r2)
            if (r0 != r15) goto L_0x0131
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r15
        L_0x0131:
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100539n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}

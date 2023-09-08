package ou2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p104ad.adxml.AdClickActionInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import d14.C58085t0;
import fy3.C32224a;
import fy3.C32228q;
import gy3.C87412m;
import jp2.C98963o;
import os2.C100397a;
import os2.C100413l;
import ou2.C100464b;
import rx3.C13598b0;
import te3.C101804kv2;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

/* renamed from: ou2.a */
public abstract class C100462a {

    /* renamed from: a */
    public final C100509l f294289a;

    /* renamed from: b */
    public final C100508k f294290b;

    /* renamed from: c */
    public final C100509l f294291c;

    /* renamed from: d */
    public final C0000n0 f294292d;

    /* renamed from: e */
    public final C58085t0<Boolean> f294293e;

    /* renamed from: f */
    public final C58085t0<C100464b.C100466b> f294294f;

    /* renamed from: g */
    public final SnsInfo f294295g;

    /* renamed from: h */
    public final C32228q<C100397a, AdClickActionInfo, SnsInfo, C13598b0> f294296h;

    /* renamed from: i */
    public final C100413l f294297i;

    /* renamed from: j */
    public final C101804kv2 f294298j;

    /* renamed from: k */
    public final C98963o f294299k;

    /* renamed from: l */
    public Object f294300l;

    @C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController", mo125469f = "AbstractScheduleVideoController.kt", mo125470l = {69, 78}, mo125471m = "delayForAdjust")
    /* renamed from: ou2.a$a */
    public static final class C100463a extends C66704d {

        /* renamed from: d */
        public Object f294301d;

        /* renamed from: e */
        public Object f294302e;

        /* renamed from: f */
        public long f294303f;

        /* renamed from: g */
        public long f294304g;

        /* renamed from: h */
        public int f294305h;

        /* renamed from: i */
        public int f294306i;

        /* renamed from: j */
        public int f294307j;

        /* renamed from: n */
        public /* synthetic */ Object f294308n;

        /* renamed from: o */
        public final /* synthetic */ C100462a f294309o;

        /* renamed from: p */
        public int f294310p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100463a(C100462a aVar, C15601d<? super C100463a> dVar) {
            super(dVar);
            this.f294309o = aVar;
        }

        public final Object invokeSuspend(Object obj) {
            SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController$delayForAdjust$1");
            this.f294308n = obj;
            this.f294310p |= Integer.MIN_VALUE;
            Object b = this.f294309o.mo139952b((C32224a<Long>) null, 0, 0, 0, 0, 0, this);
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController$delayForAdjust$1");
            return b;
        }
    }

    public C100462a(C100509l lVar, C100508k kVar, C100509l lVar2, C0000n0 n0Var, C58085t0<Boolean> t0Var, C58085t0<C100464b.C100466b> t0Var2, SnsInfo snsInfo, C32228q<? super C100397a, ? super AdClickActionInfo, ? super SnsInfo, C13598b0> qVar, C100413l lVar3, C101804kv2 kv22, C98963o oVar, Object obj) {
        C87412m.m108594g(t0Var, "restartPlayFlow");
        C87412m.m108594g(t0Var2, "playCommandFlow");
        C87412m.m108594g(qVar, "setClickArea");
        this.f294289a = lVar;
        this.f294290b = kVar;
        this.f294291c = lVar2;
        this.f294292d = n0Var;
        this.f294293e = t0Var;
        this.f294294f = t0Var2;
        this.f294295g = snsInfo;
        this.f294296h = qVar;
        this.f294297i = lVar3;
        this.f294298j = kv22;
        this.f294299k = oVar;
        this.f294300l = obj;
    }

    /* renamed from: c */
    public static /* synthetic */ Object m131484c(C100462a aVar, C32224a aVar2, long j, long j2, int i, int i2, int i3, C15601d dVar, int i4, Object obj) {
        SnsMethodCalculate.markStartTimeMs("delayForAdjust$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        if (obj == null) {
            Object b = aVar.mo139952b(aVar2, j, (i4 & 4) != 0 ? 0 : j2, (i4 & 8) != 0 ? 0 : i, (i4 & 16) != 0 ? 4 : i2, (i4 & 32) != 0 ? 50 : i3, dVar);
            SnsMethodCalculate.markEndTimeMs("delayForAdjust$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
            return b;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delayForAdjust");
        SnsMethodCalculate.markEndTimeMs("delayForAdjust$default", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        throw unsupportedOperationException;
    }

    /* renamed from: a */
    public abstract void mo139951a(C100413l lVar);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0107 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x003c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo139952b(fy3.C32224a<java.lang.Long> r23, long r24, long r26, int r28, int r29, int r30, wx3.C15601d<? super rx3.C13598b0> r31) {
        /*
            r22 = this;
            r0 = r24
            r2 = r26
            r4 = r28
            r5 = r29
            r6 = r30
            r7 = r31
            java.lang.String r8 = "delayForAdjust"
            java.lang.String r9 = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r8, r9)
            boolean r10 = r7 instanceof ou2.C100462a.C100463a
            if (r10 == 0) goto L_0x0028
            r10 = r7
            ou2.a$a r10 = (ou2.C100462a.C100463a) r10
            int r11 = r10.f294310p
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            r13 = r11 & r12
            if (r13 == 0) goto L_0x0028
            int r11 = r11 - r12
            r10.f294310p = r11
            r11 = r22
            goto L_0x002f
        L_0x0028:
            ou2.a$a r10 = new ou2.a$a
            r11 = r22
            r10.<init>(r11, r7)
        L_0x002f:
            java.lang.Object r7 = r10.f294308n
            xx3.a r12 = xx3.C15911a.COROUTINE_SUSPENDED
            int r13 = r10.f294310p
            java.lang.String r14 = "delayForAdjust() called with: targetTime = "
            java.lang.String r15 = "AbstractScheduleVideoController"
            r11 = 1
            if (r13 == 0) goto L_0x0081
            if (r13 == r11) goto L_0x006a
            r0 = 2
            if (r13 != r0) goto L_0x005f
            int r0 = r10.f294307j
            int r1 = r10.f294306i
            int r2 = r10.f294305h
            long r3 = r10.f294304g
            long r5 = r10.f294303f
            java.lang.Object r13 = r10.f294302e
            gy3.e0 r13 = (gy3.C45983e0) r13
            java.lang.Object r11 = r10.f294301d
            fy3.a r11 = (fy3.C32224a) r11
            kotlin.ResultKt.throwOnFailure(r7)
            r18 = r0
            r7 = r10
            r0 = 2
            r10 = r8
            r8 = r14
        L_0x005c:
            r14 = 1
            goto L_0x015b
        L_0x005f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            throw r0
        L_0x006a:
            int r0 = r10.f294306i
            int r1 = r10.f294305h
            long r2 = r10.f294304g
            long r4 = r10.f294303f
            java.lang.Object r6 = r10.f294301d
            fy3.a r6 = (fy3.C32224a) r6
            kotlin.ResultKt.throwOnFailure(r7)
            r7 = r14
            r20 = r4
            r4 = r0
            r5 = r1
            r0 = r20
            goto L_0x00d6
        L_0x0081:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r14)
            r7.append(r0)
            java.lang.String r11 = ", leadTime = "
            r7.append(r11)
            r7.append(r2)
            java.lang.String r11 = ", firstDelayTime = "
            r7.append(r11)
            r7.append(r4)
            java.lang.String r11 = ", maxDelayTime = "
            r7.append(r11)
            r7.append(r5)
            java.lang.String r11 = ", maxGap = "
            r7.append(r11)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r7)
            r7 = r14
            long r13 = (long) r4
            r4 = r23
            r10.f294301d = r4
            r10.f294303f = r0
            r10.f294304g = r2
            r10.f294305h = r5
            r10.f294306i = r6
            r11 = 1
            r10.f294310p = r11
            java.lang.Object r11 = a14.C53965x0.m60607b(r13, r10)
            if (r11 != r12) goto L_0x00d1
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r8, r9)
            return r12
        L_0x00d1:
            r20 = r6
            r6 = r4
            r4 = r20
        L_0x00d6:
            gy3.e0 r11 = new gy3.e0
            r11.<init>()
            r13 = 0
            r13 = r11
            r11 = r6
            r20 = r0
            r1 = r4
            r3 = r2
            r2 = r5
            r0 = 0
            r5 = r20
        L_0x00e6:
            java.lang.Object r14 = r11.invoke()
            java.lang.Number r14 = (java.lang.Number) r14
            r18 = r7
            r17 = r8
            long r7 = r14.longValue()
            r13.f124000d = r7
            rx3.b0 r7 = rx3.C13598b0.f38549a
            long r7 = r14.longValue()
            long r7 = r5 - r7
            r14 = r9
            r23 = r10
            long r9 = (long) r1
            long r9 = r9 + r3
            int r19 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r19 <= 0) goto L_0x0166
            if (r0 >= r2) goto L_0x0166
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = r18
            r7.append(r8)
            r7.append(r5)
            java.lang.String r9 = ", cTime = "
            r7.append(r9)
            long r9 = r13.f124000d
            r7.append(r9)
            java.lang.String r9 = ", tryTimes = "
            r7.append(r9)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r7)
            long r9 = r13.f124000d
            long r9 = r5 - r9
            long r9 = r9 - r3
            r7 = r23
            r7.f294301d = r11
            r7.f294302e = r13
            r7.f294303f = r5
            r7.f294304g = r3
            r7.f294305h = r2
            r7.f294306i = r1
            r7.f294307j = r0
            r18 = r0
            r0 = 2
            r7.f294310p = r0
            java.lang.Object r9 = a14.C53965x0.m60607b(r9, r7)
            if (r9 != r12) goto L_0x0156
            r9 = r14
            r10 = r17
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            return r12
        L_0x0156:
            r9 = r14
            r10 = r17
            goto L_0x005c
        L_0x015b:
            int r16 = r18 + 1
            r0 = r16
            r20 = r10
            r10 = r7
            r7 = r8
            r8 = r20
            goto L_0x00e6
        L_0x0166:
            r9 = r14
            r10 = r17
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "delayForAdjust end "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r0)
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ou2.C100462a.mo139952b(fy3.a, long, long, int, int, int, wx3.d):java.lang.Object");
    }

    /* renamed from: d */
    public final C100413l mo139953d() {
        SnsMethodCalculate.markStartTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        C100413l lVar = this.f294297i;
        SnsMethodCalculate.markEndTimeMs("getAlphaVideoInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return lVar;
    }

    /* renamed from: e */
    public final C0000n0 mo139954e() {
        SnsMethodCalculate.markStartTimeMs("getBizScope", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        C0000n0 n0Var = this.f294292d;
        SnsMethodCalculate.markEndTimeMs("getBizScope", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return n0Var;
    }

    /* renamed from: f */
    public final C100509l mo139955f() {
        SnsMethodCalculate.markStartTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        C100509l lVar = this.f294289a;
        SnsMethodCalculate.markEndTimeMs("getBreakVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return lVar;
    }

    /* renamed from: g */
    public final C100509l mo139956g() {
        SnsMethodCalculate.markStartTimeMs("getFullCardVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        C100509l lVar = this.f294291c;
        SnsMethodCalculate.markEndTimeMs("getFullCardVideoControl", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return lVar;
    }

    /* renamed from: h */
    public final C98963o mo139957h() {
        SnsMethodCalculate.markStartTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        C98963o oVar = this.f294299k;
        SnsMethodCalculate.markEndTimeMs("getMSnsAdstatistic", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return oVar;
    }

    /* renamed from: i */
    public final SnsInfo mo139958i() {
        SnsMethodCalculate.markStartTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        SnsInfo snsInfo = this.f294295g;
        SnsMethodCalculate.markEndTimeMs("getSnsInfo", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AbstractScheduleVideoController");
        return snsInfo;
    }

    /* renamed from: j */
    public abstract void mo139959j();

    /* renamed from: k */
    public abstract void mo139960k(SnsInfo snsInfo);

    /* renamed from: l */
    public abstract void mo139961l();
}

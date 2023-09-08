package ou2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C58085t0;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C59741c0;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {102, 109}, mo125471m = "invokeSuspend")
/* renamed from: ou2.j */
public final class C100506j extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f294459d;

    /* renamed from: e */
    public final /* synthetic */ C100486h f294460e;

    /* renamed from: f */
    public final /* synthetic */ C59741c0 f294461f;

    /* renamed from: g */
    public final /* synthetic */ float f294462g;

    /* renamed from: h */
    public final /* synthetic */ C58085t0<Boolean> f294463h;

    /* renamed from: ou2.j$a */
    public static final class C100507a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C100486h f294464d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100507a(C100486h hVar) {
            super(0);
            this.f294464d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            C100509l f = this.f294464d.mo139955f();
            Long valueOf = Long.valueOf(f != null ? f.getCurrentPosInMills() : 0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1$1");
            return valueOf;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100506j(C100486h hVar, C59741c0 c0Var, float f, C58085t0<Boolean> t0Var, C15601d<? super C100506j> dVar) {
        super(2, dVar);
        this.f294460e = hVar;
        this.f294461f = c0Var;
        this.f294462g = f;
        this.f294463h = t0Var;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        C100506j jVar = new C100506j(this.f294460e, this.f294461f, this.f294462g, this.f294463h, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return jVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        Object invokeSuspend = ((C100506j) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f294459d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C100486h hVar = this.f294460e;
            C100507a aVar2 = new C100507a(hVar);
            float f = this.f294461f.f170634d;
            long j = (long) f;
            int min = Math.min((int) (f - this.f294462g), 2000);
            this.f294459d = 1;
            if (C100462a.m131484c(hVar, aVar2, j, 50, min, 0, 0, this, 48, (Object) null) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            C13598b0 b0Var = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
            return b0Var;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
            throw illegalStateException;
        }
        C58085t0<Boolean> t0Var = this.f294463h;
        Boolean bool = Boolean.TRUE;
        this.f294459d = 2;
        if (t0Var.emit(bool, this) == aVar) {
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
            return aVar;
        }
        C13598b0 b0Var2 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$reseekBreakVideo$1");
        return b0Var2;
    }
}

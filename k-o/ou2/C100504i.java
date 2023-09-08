package ou2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87413o;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1", mo125469f = "CycleScheduleVideoController.kt", mo125470l = {207}, mo125471m = "invokeSuspend")
/* renamed from: ou2.i */
public final class C100504i extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f294455d;

    /* renamed from: e */
    public final /* synthetic */ C100486h f294456e;

    /* renamed from: f */
    public final /* synthetic */ float f294457f;

    /* renamed from: ou2.i$a */
    public static final class C100505a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C100486h f294458d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C100505a(C100486h hVar) {
            super(0);
            this.f294458d = hVar;
        }

        public Object invoke() {
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1$1");
            SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1$1");
            C100509l g = this.f294458d.mo139956g();
            Long valueOf = Long.valueOf(g != null ? g.getCurrentPosInMills() : 0);
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1$1");
            SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1$1");
            return valueOf;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100504i(C100486h hVar, float f, C15601d<? super C100504i> dVar) {
        super(2, dVar);
        this.f294456e = hVar;
        this.f294457f = f;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        C100504i iVar = new C100504i(this.f294456e, this.f294457f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        return iVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        Object invokeSuspend = ((C100504i) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f294455d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C100486h hVar = this.f294456e;
            this.f294455d = 1;
            if (C100462a.m131484c(hVar, new C100505a(hVar), (long) this.f294457f, 0, 0, 0, 0, this, 48, (Object) null) == aVar) {
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
                return aVar;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
            throw illegalStateException;
        }
        C100509l f = this.f294456e.mo139955f();
        if (f != null) {
            f.start();
        }
        C100486h hVar2 = this.f294456e;
        SnsMethodCalculate.markStartTimeMs("access$getVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        int i2 = hVar2.f294390q;
        SnsMethodCalculate.markEndTimeMs("access$getVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        SnsMethodCalculate.markStartTimeMs("access$setVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        hVar2.f294390q = i2 + 1;
        SnsMethodCalculate.markEndTimeMs("access$setVideoPlayCount$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        C100486h hVar3 = this.f294456e;
        SnsMethodCalculate.markStartTimeMs("access$setHasBreakVideoStarted$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        hVar3.f294388o = true;
        SnsMethodCalculate.markEndTimeMs("access$setHasBreakVideoStarted$p", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController");
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.CycleScheduleVideoController$startProcessCommandFlow$playOrPauseJob$1$firstPlayBreakVideo$1");
        return b0Var;
    }
}

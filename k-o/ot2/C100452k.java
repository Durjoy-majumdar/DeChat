package ot2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.videocomposition.play.VideoCompositionPlayView;
import di3.C86312j;
import fy3.C32227p;
import hf3.C98449c;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1", mo125469f = "SnsFakeVideoPlayUIC.kt", mo125470l = {97, 101}, mo125471m = "invokeSuspend")
/* renamed from: ot2.k */
public final class C100452k extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public Object f294277d;

    /* renamed from: e */
    public int f294278e;

    /* renamed from: f */
    public final /* synthetic */ C100448j f294279f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C100452k(C100448j jVar, C15601d<? super C100452k> dVar) {
        super(2, dVar);
        this.f294279f = jVar;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        C100452k kVar = new C100452k(this.f294279f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        return kVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        Object invokeSuspend = ((C100452k) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        C100448j jVar;
        Object obj2;
        C100448j jVar2;
        Object obj3;
        Class cls = C98449c.class;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f294278e;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C100448j jVar3 = this.f294279f;
            SnsMethodCalculate.markStartTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            boolean z = jVar3.f294267g;
            SnsMethodCalculate.markEndTimeMs("access$isPreview$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            if (z) {
                jVar2 = this.f294279f;
                C100448j jVar4 = this.f294279f;
                SnsMethodCalculate.markStartTimeMs("access$getWorkTagId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                String str = jVar4.f294268h;
                SnsMethodCalculate.markEndTimeMs("access$getWorkTagId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                VideoCompositionPlayView c3 = C100448j.m131469c3(this.f294279f);
                this.f294277d = jVar2;
                this.f294278e = 1;
                obj3 = ((C98449c) C86312j.m106911c(cls)).Wr0(str, c3, this);
                if (obj3 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
                    return aVar;
                }
            } else {
                jVar = this.f294279f;
                C100448j jVar5 = this.f294279f;
                SnsMethodCalculate.markStartTimeMs("access$getSnsLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                int i2 = jVar5.f294269i;
                SnsMethodCalculate.markEndTimeMs("access$getSnsLocalId$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                VideoCompositionPlayView c35 = C100448j.m131469c3(this.f294279f);
                C100448j jVar6 = this.f294279f;
                SnsMethodCalculate.markStartTimeMs("access$getMutePlay$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                boolean z2 = jVar6.f294271n;
                SnsMethodCalculate.markEndTimeMs("access$getMutePlay$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                C100448j jVar7 = this.f294279f;
                SnsMethodCalculate.markStartTimeMs("access$getSnsCreateTime$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                int i3 = jVar7.f294270j;
                SnsMethodCalculate.markEndTimeMs("access$getSnsCreateTime$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                this.f294277d = jVar;
                this.f294278e = 2;
                obj2 = ((C98449c) C86312j.m106911c(cls)).mo136676Sa(i2, c35, z2, i3, this);
                if (obj2 == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
                    return aVar;
                }
                long longValue = ((Number) obj2).longValue();
                SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                jVar.f294265e = longValue;
                SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                StringBuilder sb = new StringBuilder();
                sb.append("no preview initViewToPlayFakeVideo >> key: ");
                C100448j jVar8 = this.f294279f;
                SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                long j = jVar8.f294265e;
                SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
                sb.append(j);
                Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", sb.toString());
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
                return b0Var;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
            jVar2 = (C100448j) this.f294277d;
            obj3 = obj;
        } else if (i == 2) {
            ResultKt.throwOnFailure(obj);
            jVar = (C100448j) this.f294277d;
            obj2 = obj;
            long longValue2 = ((Number) obj2).longValue();
            SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            jVar.f294265e = longValue2;
            SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            StringBuilder sb4 = new StringBuilder();
            sb4.append("no preview initViewToPlayFakeVideo >> key: ");
            C100448j jVar82 = this.f294279f;
            SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            long j2 = jVar82.f294265e;
            SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
            sb4.append(j2);
            Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", sb4.toString());
            C13598b0 b0Var2 = C13598b0.f38549a;
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
            return b0Var2;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
            throw illegalStateException;
        }
        long longValue3 = ((Number) obj3).longValue();
        SnsMethodCalculate.markStartTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        jVar2.f294265e = longValue3;
        SnsMethodCalculate.markEndTimeMs("access$setPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        StringBuilder sb5 = new StringBuilder();
        sb5.append("preview initViewToPlayFakeVideo >> key: ");
        C100448j jVar9 = this.f294279f;
        SnsMethodCalculate.markStartTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        long j3 = jVar9.f294265e;
        SnsMethodCalculate.markEndTimeMs("access$getPlayerKey$p", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC");
        sb5.append(j3);
        Log.m105924i("MicroMsg.SnsFakeVideoPlayUIC", sb5.toString());
        C13598b0 b0Var22 = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.fake.SnsFakeVideoPlayUIC$playVideo$1");
        return b0Var22;
    }
}

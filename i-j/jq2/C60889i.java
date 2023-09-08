package jq2;

import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import d14.C45253g;
import d14.C58063m0;
import d14.C58072n1;
import d14.C58087u0;
import fy3.C32228q;
import gy3.C87412m;
import jq2.C98985g;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1", mo125469f = "AdMediaDownloadHelper.kt", mo125470l = {245}, mo125471m = "invokeSuspend")
/* renamed from: jq2.i */
public final class C60889i extends C91594j implements C32228q<C45253g<? super C98985g.C98987b>, Throwable, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f173461d;

    /* renamed from: e */
    public /* synthetic */ Object f173462e;

    /* renamed from: f */
    public final /* synthetic */ String f173463f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60889i(String str, C15601d<? super C60889i> dVar) {
        super(3, dVar);
        this.f173463f = str;
    }

    public Object invoke(Object obj, Object obj2, Object obj3) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        Throwable th = (Throwable) obj2;
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        C60889i iVar = new C60889i(this.f173463f, (C15601d) obj3);
        iVar.f173462e = (C45253g) obj;
        Object invokeSuspend = iVar.invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        int i = this.f173461d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            C45253g gVar = (C45253g) this.f173462e;
            String str = this.f173463f;
            C87412m.m108593f(str, "cacheName");
            C58087u0<C98985g.C98987b> b = C98985g.m128891b(str);
            this.f173461d = 1;
            if (!(gVar instanceof C58072n1)) {
                Object a = b.mo31880a(new C58063m0.C58064a(gVar), this);
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a != aVar) {
                    a = C13598b0.f38549a;
                }
                if (a == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
                    return aVar;
                }
            } else {
                throw ((C58072n1) gVar).f166092d;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
            throw illegalStateException;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.timeline.helper.AdMediaDownloadHelper$getThumbDownloadFlow$flow$1");
        return b0Var;
    }
}

package lo2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.model.AdLandingPagesProxy;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2", mo125469f = "FollowRequestHelper.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: lo2.o0 */
public final class C61325o0 extends C91594j implements C32227p<C0000n0, C15601d<? super Boolean>, Object> {

    /* renamed from: d */
    public final /* synthetic */ String f174448d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61325o0(String str, C15601d<? super C61325o0> dVar) {
        super(2, dVar);
        this.f174448d = str;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        C61325o0 o0Var = new C61325o0(this.f174448d, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        return o0Var;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        Object invokeSuspend = ((C61325o0) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        ResultKt.throwOnFailure(obj);
        Boolean valueOf = Boolean.valueOf(AdLandingPagesProxy.getInstance().isBrandAdded(this.f174448d));
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ad.helper.FollowRequestHelper$getBrandFollowStatus$2");
        return valueOf;
    }
}

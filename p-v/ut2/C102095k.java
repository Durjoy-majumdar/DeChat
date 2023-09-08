package ut2;

import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveMainUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import wx3.C15601d;
import yx3.C66704d;
import yx3.C91590f;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC", mo125469f = "ImproveMainUIC.kt", mo125470l = {435}, mo125471m = "handleLoadMore")
/* renamed from: ut2.k */
public final class C102095k extends C66704d {

    /* renamed from: d */
    public Object f300636d;

    /* renamed from: e */
    public /* synthetic */ Object f300637e;

    /* renamed from: f */
    public final /* synthetic */ ImproveMainUIC f300638f;

    /* renamed from: g */
    public int f300639g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102095k(ImproveMainUIC improveMainUIC, C15601d<? super C102095k> dVar) {
        super(dVar);
        this.f300638f = improveMainUIC;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleLoadMore$1");
        this.f300637e = obj;
        this.f300639g |= Integer.MIN_VALUE;
        Object c3 = ImproveMainUIC.m122708c3(this.f300638f, this);
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$handleLoadMore$1");
        return c3;
    }
}

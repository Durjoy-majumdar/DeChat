package ut2;

import a14.C0000n0;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1", mo125469f = "ImproveMainUIC.kt", mo125470l = {238}, mo125471m = "invokeSuspend")
/* renamed from: ut2.l */
public final class C102096l extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f300640d;

    /* renamed from: e */
    public final /* synthetic */ UIComponent f300641e;

    /* renamed from: f */
    public final /* synthetic */ RecyclerView f300642f;

    /* renamed from: g */
    public final /* synthetic */ C102104r f300643g;

    /* renamed from: h */
    public final /* synthetic */ int f300644h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102096l(UIComponent uIComponent, RecyclerView recyclerView, C102104r rVar, int i, C15601d<? super C102096l> dVar) {
        super(2, dVar);
        this.f300641e = uIComponent;
        this.f300642f = recyclerView;
        this.f300643g = rVar;
        this.f300644h = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        C102096l lVar = new C102096l(this.f300641e, this.f300642f, this.f300643g, this.f300644h, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        return lVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        Object invokeSuspend = ((C102096l) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        C15911a aVar = C15911a.COROUTINE_SUSPENDED;
        int i = this.f300640d;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            UIComponent uIComponent = this.f300641e;
            if (uIComponent instanceof C102084a) {
                RecyclerView recyclerView = this.f300642f;
                C102104r rVar = this.f300643g;
                int i2 = this.f300644h;
                this.f300640d = 1;
                if (((C102084a) uIComponent).onScrollStateChanged(recyclerView, rVar, i2, this) == aVar) {
                    SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
                    return aVar;
                }
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
            throw illegalStateException;
        }
        C13598b0 b0Var = C13598b0.f38549a;
        SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveMainUIC$onScrollStateChanged$1$1");
        return b0Var;
    }
}

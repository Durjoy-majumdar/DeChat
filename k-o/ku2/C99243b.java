package ku2;

import a14.C0000n0;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveContentView;
import com.tencent.p014mm.plugin.sns.p106ui.improve.view.ImproveTextView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import fy3.C32227p;
import gy3.C87412m;
import kotlin.ResultKt;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2", mo125469f = "ImproveContentView.kt", mo125470l = {}, mo125471m = "invokeSuspend")
/* renamed from: ku2.b */
public final class C99243b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public final /* synthetic */ ImproveContentView f290983d;

    /* renamed from: e */
    public final /* synthetic */ boolean f290984e;

    /* renamed from: f */
    public final /* synthetic */ int f290985f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99243b(ImproveContentView improveContentView, boolean z, int i, C15601d<? super C99243b> dVar) {
        super(2, dVar);
        this.f290983d = improveContentView;
        this.f290984e = z;
        this.f290985f = i;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        SnsMethodCalculate.markStartTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        C99243b bVar = new C99243b(this.f290983d, this.f290984e, this.f290985f, dVar);
        SnsMethodCalculate.markEndTimeMs("create", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        return bVar;
    }

    public Object invoke(Object obj, Object obj2) {
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        Object invokeSuspend = ((C99243b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        return invokeSuspend;
    }

    public final Object invokeSuspend(Object obj) {
        SnsMethodCalculate.markStartTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
        ResultKt.throwOnFailure(obj);
        ImproveContentView improveContentView = this.f290983d;
        int i = ImproveContentView.f279844z;
        SnsMethodCalculate.markStartTimeMs("access$getSingleTv$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        ImproveTextView improveTextView = improveContentView.f279848p;
        SnsMethodCalculate.markEndTimeMs("access$getSingleTv$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
        if (improveTextView != null) {
            int i2 = 8;
            improveTextView.setVisibility(8);
            this.f290983d.getContentTv().setVisibility(0);
            if (this.f290984e) {
                ImproveContentView improveContentView2 = this.f290983d;
                SnsMethodCalculate.markStartTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                improveContentView2.mo133357o();
                SnsMethodCalculate.markEndTimeMs("access$shrinkContent", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            }
            ImproveContentView improveContentView3 = this.f290983d;
            SnsMethodCalculate.markStartTimeMs("access$getOpTv$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            ImproveTextView improveTextView2 = improveContentView3.f279850r;
            SnsMethodCalculate.markEndTimeMs("access$getOpTv$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
            if (improveTextView2 != null) {
                if (this.f290985f > 6) {
                    i2 = 0;
                }
                improveTextView2.setVisibility(i2);
                ImproveTextView contentTv = this.f290983d.getContentTv();
                ImproveContentView improveContentView4 = this.f290983d;
                SnsMethodCalculate.markStartTimeMs("access$getContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                CharSequence charSequence = improveContentView4.f279853u;
                SnsMethodCalculate.markEndTimeMs("access$getContent$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                contentTv.setText(charSequence);
                C13598b0 b0Var = C13598b0.f38549a;
                SnsMethodCalculate.markEndTimeMs("invokeSuspend", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView$showNormal$2");
                return b0Var;
            }
            C87412m.m108603p("opTv");
            throw null;
        }
        C87412m.m108603p("singleTv");
        throw null;
    }
}

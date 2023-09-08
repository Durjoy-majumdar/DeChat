package ut2;

import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.SnsCommentFooter;
import com.tencent.p014mm.plugin.sns.p106ui.improve.component.ImproveInputUIC;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import gy3.C8478d0;

/* renamed from: ut2.g */
public final class C102092g implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ImproveInputUIC f300626d;

    /* renamed from: e */
    public final /* synthetic */ C8478d0 f300627e;

    /* renamed from: f */
    public final /* synthetic */ C8478d0 f300628f;

    /* renamed from: g */
    public final /* synthetic */ SnsCommentFooter f300629g;

    /* renamed from: h */
    public final /* synthetic */ View f300630h;

    public C102092g(ImproveInputUIC improveInputUIC, C8478d0 d0Var, C8478d0 d0Var2, SnsCommentFooter snsCommentFooter, View view) {
        this.f300626d = improveInputUIC;
        this.f300627e = d0Var;
        this.f300628f = d0Var2;
        this.f300629g = snsCommentFooter;
        this.f300630h = view;
    }

    public void run() {
        SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
        if (this.f300626d.getActivity().isDestroyed() || this.f300626d.getActivity().isFinishing()) {
            SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
            return;
        }
        Log.m105924i("MicroMsg.Improve.InputUIC", "scrollRecyclerViewToInputView index:" + this.f300627e.f27483d + " lastFooterBottom:" + this.f300628f.f27483d + " currBottom:" + this.f300629g.getCurrBottom());
        if (this.f300628f.f27483d != this.f300629g.getCurrBottom()) {
            C8478d0 d0Var = this.f300627e;
            int i = d0Var.f27483d;
            d0Var.f27483d = i - 1;
            if (i > 0) {
                this.f300628f.f27483d = this.f300629g.getCurrBottom();
                new MMHandler().postDelayed(this, 10);
                SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
                return;
            }
        }
        ImproveInputUIC improveInputUIC = this.f300626d;
        View view = this.f300630h;
        SnsCommentFooter snsCommentFooter = this.f300629g;
        SnsMethodCalculate.markStartTimeMs("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        int l3 = improveInputUIC.mo133291l3(view);
        SnsMethodCalculate.markEndTimeMs("access$getViewBottomRawY", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markStartTimeMs("access$scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        improveInputUIC.mo133293n3(view, snsCommentFooter, l3);
        SnsMethodCalculate.markEndTimeMs("access$scrollToViewBottom", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC");
        SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveInputUIC$scrollRecyclerViewToInputView$runnable$1");
    }
}

package rf2;

import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTopicFlowView;
import ht1.C20999i5;
import kg3.C76577a;

/* renamed from: rf2.d */
public final class C22239d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ BizProfileTopicFlowView f63026d;

    /* renamed from: e */
    public final /* synthetic */ C20999i5 f63027e;

    /* renamed from: f */
    public final /* synthetic */ boolean f63028f;

    public C22239d(BizProfileTopicFlowView bizProfileTopicFlowView, C20999i5 i5Var, boolean z) {
        this.f63026d = bizProfileTopicFlowView;
        this.f63027e = i5Var;
        this.f63028f = z;
    }

    public final void run() {
        this.f63026d.setFoldHeight(this.f63027e.mo23641k() + C76577a.m92151b(this.f63026d.getContext(), 8));
        BizProfileTopicFlowView bizProfileTopicFlowView = this.f63026d;
        if (this.f63028f) {
            bizProfileTopicFlowView.mo24113d(0, bizProfileTopicFlowView.f53187j, 0.0f, 1.0f);
        } else {
            bizProfileTopicFlowView.mo24113d(bizProfileTopicFlowView.f53187j, 0, 1.0f, 0.0f);
        }
    }
}

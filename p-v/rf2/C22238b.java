package rf2;

import android.view.View;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.profile.p088ui.tab.view.BizProfileTopicFlowView;
import fy3.C32226l;
import j20.C117292a;
import java.util.ArrayList;
import rx3.C13598b0;

/* renamed from: rf2.b */
public final class C22238b implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BizProfileTopicFlowView f63024d;

    /* renamed from: e */
    public final /* synthetic */ WeImageView f63025e;

    public C22238b(BizProfileTopicFlowView bizProfileTopicFlowView, WeImageView weImageView) {
        this.f63024d = bizProfileTopicFlowView;
        this.f63025e = weImageView;
    }

    public final void onClick(View view) {
        C32226l<? super Boolean, C13598b0> lVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f63024d.f53188n) {
            this.f63025e.setScaleY(1.0f);
        } else {
            this.f63025e.setScaleY(-1.0f);
        }
        BizProfileTopicFlowView bizProfileTopicFlowView = this.f63024d;
        bizProfileTopicFlowView.setFold(!bizProfileTopicFlowView.f53188n);
        C48023a presenter = this.f63024d.getPresenter();
        if (!(presenter == null || (lVar = presenter.f128821g) == null)) {
            lVar.invoke(Boolean.valueOf(this.f63024d.f53188n));
        }
        BizProfileTopicFlowView bizProfileTopicFlowView2 = this.f63024d;
        BizProfileTopicFlowView.m20003a(bizProfileTopicFlowView2, bizProfileTopicFlowView2.f53188n);
        C117292a.m165361g(this, "com/tencent/mm/plugin/profile/ui/tab/view/BizProfileTopicFlowView$refreshArrow$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

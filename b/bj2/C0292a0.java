package bj2;

import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.repairer.p099ui.demo.RepairerPullDownWidgetDemoUI;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C76912y0;

/* renamed from: bj2.a0 */
public final class C0292a0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ RepairerPullDownWidgetDemoUI f858d;

    public C0292a0(RepairerPullDownWidgetDemoUI repairerPullDownWidgetDemoUI) {
        this.f858d = repairerPullDownWidgetDemoUI;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$bindViewAndFakeData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C76912y0.m92769h(this.f858d.getContext(), "已设置", 0);
        FrameLayout frameLayout = this.f858d.f20491d;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
            C117292a.m165361g(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPullDownWidgetDemoUI$bindViewAndFakeData$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("layoutContainer");
        throw null;
    }
}

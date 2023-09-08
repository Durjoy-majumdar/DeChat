package ce1;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import bl3.C54492n;
import com.tencent.p014mm.plugin.finder.activity.uic.FinderTopicContentUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import kf1.C9965rb;

/* renamed from: ce1.h0 */
public final class C0471h0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicContentUIC f1157d;

    public C0471h0(FinderTopicContentUIC finderTopicContentUIC) {
        this.f1157d = finderTopicContentUIC;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Log.m105924i(C54492n.TAG, "progressBar FinderActivityContentUIC visible");
        FrameLayout frameLayout = this.f1157d.f12528t;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ProgressBar progressBar = this.f1157d.f12529u;
        if (progressBar != null) {
            progressBar.setVisibility(0);
        }
        C9965rb rbVar = this.f1157d.f12525q;
        if (rbVar != null) {
            rbVar.mo10286V0();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/activity/uic/FinderTopicContentUIC$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}

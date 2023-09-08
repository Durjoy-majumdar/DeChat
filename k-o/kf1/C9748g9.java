package kf1;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: kf1.g9 */
public final class C9748g9 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C9673c9 f30208d;

    public C9748g9(C9673c9 c9Var) {
        this.f30208d = c9Var;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderSelectContract$SelectViewCallback$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ProgressBar progressBar = this.f30208d.f30054j;
        if (progressBar != null) {
            progressBar.setVisibility(0);
            TextView textView = this.f30208d.f30055n;
            if (textView != null) {
                textView.setVisibility(8);
                this.f30208d.f30050f.mo2589e(false);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderSelectContract$SelectViewCallback$initView$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            C87412m.m108603p("retryTextView");
            throw null;
        }
        C87412m.m108603p("progressBar");
        throw null;
    }
}

package ko1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.profile.filter.FinderTopicFilterView;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: ko1.e */
public final class C10372e implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderTopicFilterView f31580d;

    /* renamed from: e */
    public final /* synthetic */ TextView f31581e;

    public C10372e(FinderTopicFilterView finderTopicFilterView, TextView textView) {
        this.f31580d = finderTopicFilterView;
        this.f31581e = textView;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView$refreshArrow$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        FinderTopicFilterView finderTopicFilterView = this.f31580d;
        finderTopicFilterView.setFold(!finderTopicFilterView.f16136n);
        FinderTopicFilterView finderTopicFilterView2 = this.f31580d;
        if (finderTopicFilterView2.f16136n) {
            this.f31581e.setText(finderTopicFilterView2.getContext().getString(C0966R.string.mcn));
        } else {
            this.f31581e.setText(finderTopicFilterView2.getContext().getString(C0966R.string.mco));
        }
        FinderTopicFilterView finderTopicFilterView3 = this.f31580d;
        FinderTopicFilterView.m3551b(finderTopicFilterView3, finderTopicFilterView3.f16136n);
        FinderTopicFilterView finderTopicFilterView4 = this.f31580d;
        FinderTopicFilterView.m3550a(finderTopicFilterView4, true, finderTopicFilterView4.f16136n);
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/profile/filter/FinderTopicFilterView$refreshArrow$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

package vf1;

import android.view.View;
import com.tencent.p014mm.p136ui.search.FTSSearchView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI40;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;

/* renamed from: vf1.b6 */
public final class C52868b6 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ OccupyFinderUI40 f147667d;

    public C52868b6(OccupyFinderUI40 occupyFinderUI40) {
        this.f147667d = occupyFinderUI40;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        OccupyFinderUI40 occupyFinderUI40 = this.f147667d;
        FTSSearchView fTSSearchView = occupyFinderUI40.f111592v;
        if (fTSSearchView != null) {
            occupyFinderUI40.mo64539Q7(fTSSearchView.getFtsEditText().getEditText().getText().toString());
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI40$initViews$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C87412m.m108603p("searchView");
        throw null;
    }
}

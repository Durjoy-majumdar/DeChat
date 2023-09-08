package ve1;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import er1.C58684b;
import j20.C117292a;
import java.util.ArrayList;
import up1.C37521f;

/* renamed from: ve1.o1 */
public final class C14583o1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderFeedFullConvert<BaseFinderFeed> f40401d;

    public C14583o1(FinderFeedFullConvert<BaseFinderFeed> finderFeedFullConvert) {
        this.f40401d = finderFeedFullConvert;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        MMActivity activity = this.f40401d.f12564e.getActivity();
        if (activity != null) {
            ((C58684b) C86312j.m106911c(C58684b.class)).qy0(activity, C37521f.f99374d.mo61188n() ? ".ui.FinderHomeAffinityUI" : ".ui.FinderHomeUI");
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

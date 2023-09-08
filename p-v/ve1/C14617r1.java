package ve1;

import android.view.View;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import di3.C86312j;
import j20.C117292a;
import java.util.ArrayList;
import p599lr.C61381b;

/* renamed from: ve1.r1 */
public final class C14617r1 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ BaseFinderFeed f40456d;

    public C14617r1(BaseFinderFeed baseFinderFeed) {
        this.f40456d = baseFinderFeed;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12413f(this.f40456d.mo3513o());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$refreshPostProgress$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

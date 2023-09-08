package com.tencent.p014mm.plugin.finder.view;

import androidx.lifecycle.C0124r;
import androidx.lifecycle.C112974b0;
import androidx.lifecycle.C39623j;
import com.tencent.p014mm.p136ui.MMActivity;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo182094d2 = {"com/tencent/mm/plugin/finder/view/FinderTipsBubbleWindow$2", "Landroidx/lifecycle/r;", "Lrx3/b0;", "onDestroy", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderTipsBubbleWindow$2 */
public final class FinderTipsBubbleWindow$2 implements C0124r {

    /* renamed from: d */
    public final /* synthetic */ C4105m5<Object> f17968d;

    public FinderTipsBubbleWindow$2(C4105m5<Object> m5Var) {
        this.f17968d = m5Var;
    }

    @C112974b0(C39623j.C39625b.ON_DESTROY)
    public final void onDestroy() {
        this.f17968d.dismiss();
        ((MMActivity) this.f17968d.f18259f).getLifecycle().removeObserver(this);
    }
}

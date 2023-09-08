package qj1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.p014mm.plugin.finder.live.plugin.FinderLiveAnchorAfterPlugin;
import com.tencent.p014mm.plugin.report.service.C115669n;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import tf0.C13883o1;
import zc1.C66785b;

/* renamed from: qj1.k0 */
public final class C12481k0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveAnchorAfterPlugin f35904d;

    public C12481k0(FinderLiveAnchorAfterPlugin finderLiveAnchorAfterPlugin) {
        this.f35904d = finderLiveAnchorAfterPlugin;
    }

    public final void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$setLiveTaskInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C7335d c = C86312j.m106911c(C13883o1.class);
        C87412m.m108593f(c, "getService(IActivityRouter::class.java)");
        Context context = this.f35904d.f166287d.getContext();
        C87412m.m108593f(context, "root.context");
        ((C13883o1) c).mo13279ch(context, (Intent) null, 3, (String) null);
        C115669n.INSTANCE.mo160131h(22748, 3, 2, Long.valueOf(C31543z5.m39453c()), C66785b.f191882e.mo90662O5());
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorAfterPlugin$setLiveTaskInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

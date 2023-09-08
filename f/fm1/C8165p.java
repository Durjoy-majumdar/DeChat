package fm1;

import android.app.Activity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOperationUI;
import com.tencent.p014mm.plugin.finder.nearby.NearbyUI;
import com.tencent.p014mm.plugin.finder.nearby.live.square.find.FinderLiveFindPageUI;
import com.tencent.p014mm.plugin.finder.nearby.live.square.more.NearbyLiveMoreUI;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86301e;
import ei3.C86522b;
import gy3.C87412m;
import pt1.C12006c;

@C86522b
/* renamed from: fm1.p */
public final class C8165p extends C86301e implements C12006c {
    /* renamed from: Tt */
    public boolean mo9221Tt(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return activity instanceof FinderLiveFindPageUI;
    }

    /* renamed from: Vz */
    public boolean mo9222Vz(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return (activity instanceof NearbyLiveMoreUI) || (activity instanceof FinderLiveOperationUI);
    }

    /* renamed from: cq */
    public boolean mo9223cq(Activity activity) {
        C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        return activity instanceof NearbyUI;
    }
}

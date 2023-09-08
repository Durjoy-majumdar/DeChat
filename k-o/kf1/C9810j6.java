package kf1;

import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import te3.C51270sn1;

/* renamed from: kf1.j6 */
public final class C9810j6 {

    /* renamed from: a */
    public final MMActivity f30347a;

    public C9810j6(MMActivity mMActivity, RefreshLoadMoreLayout refreshLoadMoreLayout) {
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
        this.f30347a = mMActivity;
    }

    /* renamed from: a */
    public final void mo10389a(C51270sn1 sn12) {
        Log.m105924i("Finder.FinderNewsTopicHelper", "refreshHeader " + sn12);
        if (sn12 != null) {
            int i = sn12.f141622i;
            Log.m105924i("Finder.FinderNewsTopicHelper", "setViewFollowed topicHeader null");
            Log.m105924i("Finder.FinderNewsTopicHelper", "setFollowView topicHeader null");
        }
        if (sn12 == null) {
            if (sn12 != null) {
                int i2 = sn12.f141622i;
            }
            Log.m105924i("Finder.FinderNewsTopicHelper", "setViewFollowed topicHeader null");
            Log.m105924i("Finder.FinderNewsTopicHelper", "setFollowView topicHeader null");
        }
    }
}

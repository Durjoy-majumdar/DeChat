package kf1;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.event.recyclerview.FinderRecyclerView;
import com.tencent.p014mm.plugin.finder.feed.FinderRingtoneTimelineContract$Presenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import java.util.ArrayList;
import tr1.C78080i;

/* renamed from: kf1.z8 */
public final class C10069z8 extends C9854m5 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10069z8(MMActivity mMActivity, FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter, int i, int i2) {
        super(mMActivity, finderRingtoneTimelineContract$Presenter, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(finderRingtoneTimelineContract$Presenter, "presenter");
    }

    /* renamed from: F0 */
    public void mo5181F0() {
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setItemAnimator(new C78080i());
        recyclerView.setHasFixedSize(true);
        C9640c cVar = this.f30123e;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract.Presenter");
        FinderRingtoneTimelineContract$Presenter finderRingtoneTimelineContract$Presenter = (FinderRingtoneTimelineContract$Presenter) cVar;
        BaseFinderFeed baseFinderFeed = finderRingtoneTimelineContract$Presenter.f13215y;
        if (baseFinderFeed != null) {
            Log.m105924i("Finder.FinderFeedDetailRelUIContract.ViewCallback", "cache exist!,show cache first");
            ArrayList<C0740i2> n = finderRingtoneTimelineContract$Presenter.mo2492n();
            if (n != null) {
                n.clear();
            }
            ArrayList<C0740i2> n2 = finderRingtoneTimelineContract$Presenter.mo2492n();
            if (n2 != null) {
                n2.add(baseFinderFeed);
            }
            mo10312p().notifyDataSetChanged();
        }
        super.mo5181F0();
    }

    /* renamed from: k0 */
    public void mo9301k0(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        super.mo9301k0(arrayList);
        C9640c cVar = this.f30123e;
        C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderRingtoneTimelineContract.Presenter");
        if (((FinderRingtoneTimelineContract$Presenter) cVar).f13210t) {
            RefreshLoadMoreLayout D = mo10308D();
            View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
            C87412m.m108593f(inflate, "getInflater(context).inf…d_more_footer_dark, null)");
            D.setLoadMoreFooter(inflate);
        }
        View findViewById = this.f30122d.findViewById(C0966R.C0970id.i6k);
        C87412m.m108593f(findViewById, "context.findViewById(R.id.profile_recycler_view)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (recyclerView instanceof FinderRecyclerView) {
            FinderRecyclerView finderRecyclerView = (FinderRecyclerView) recyclerView;
            if (finderRecyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView.LayoutManager layoutManager = finderRecyclerView.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                FinderRecyclerView.m63293z1(finderRecyclerView, (LinearLayoutManager) layoutManager, (String) null, 2, (Object) null);
            }
        }
    }

    /* renamed from: x */
    public View mo5184x() {
        return null;
    }
}

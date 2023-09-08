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
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import gy3.C87412m;
import java.util.ArrayList;
import tr1.C78080i;
import zp3.C16389w;

/* renamed from: kf1.c2 */
public class C9662c2 extends C9854m5 {

    /* renamed from: q */
    public final boolean f30021q;

    /* renamed from: r */
    public C16389w f30022r = new C9663a(this);

    /* renamed from: kf1.c2$a */
    public static final class C9663a implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout f30023d;

        /* renamed from: e */
        public final /* synthetic */ C9662c2 f30024e;

        public C9663a(C9662c2 c2Var) {
            this.f30024e = c2Var;
            this.f30023d = c2Var.mo10308D();
        }

        public void onChanged() {
            C9662c2 c2Var = this.f30024e;
            if (c2Var.f30021q) {
                c2Var.mo10308D().onChanged();
            }
        }

        public void onItemRangeChanged(int i, int i2) {
            RefreshLoadMoreLayout D = this.f30024e.mo10308D();
            this.f30024e.getClass();
            D.onItemRangeChanged(i + 0, i2);
        }

        public void onItemRangeInserted(int i, int i2) {
            RefreshLoadMoreLayout D = this.f30024e.mo10308D();
            this.f30024e.getClass();
            D.onItemRangeInserted(i + 0, i2);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            RefreshLoadMoreLayout D = this.f30024e.mo10308D();
            this.f30024e.getClass();
            this.f30024e.getClass();
            D.onItemRangeMoved(i + 0, i2 + 0, i3);
        }

        public void onItemRangeRemoved(int i, int i2) {
            RefreshLoadMoreLayout D = this.f30024e.mo10308D();
            this.f30024e.getClass();
            D.onItemRangeRemoved(i + 0, i2);
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30023d;
            refreshLoadMoreLayout.getClass();
            refreshLoadMoreLayout.mo82441G(cVar);
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30023d.onPreFinishLoadMoreSmooth(cVar);
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30023d.onPreFinishRefresh(cVar);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            RefreshLoadMoreLayout D = this.f30024e.mo10308D();
            this.f30024e.getClass();
            D.onItemRangeChanged(i + 0, i2, obj);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9662c2(MMActivity mMActivity, C10037x1 x1Var, int i, int i2, boolean z) {
        super(mMActivity, x1Var, i, i2);
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(x1Var, "presenter");
        this.f30021q = z;
    }

    /* renamed from: E0 */
    public void mo10282E0(int i) {
        MMActivity mMActivity = this.f30122d;
        if (mMActivity instanceof FinderShareFeedRelUI) {
            ((FinderShareFeedRelUI) mMActivity).mo4130c8();
        }
    }

    /* renamed from: F0 */
    public void mo5181F0() {
        RecyclerView recyclerView = getRecyclerView();
        recyclerView.setItemAnimator(new C78080i());
        boolean z = true;
        recyclerView.setHasFixedSize(true);
        String stringExtra = this.f30122d.getIntent().getStringExtra("FLOAT_BALL_KEY");
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            z = false;
        }
        if (!z) {
            C9640c cVar = this.f30123e;
            C10037x1 x1Var = cVar instanceof C10037x1 ? (C10037x1) cVar : null;
            if (x1Var != null) {
                x1Var.mo2565s1();
                return;
            }
            return;
        }
        C9640c cVar2 = this.f30123e;
        C87412m.m108592e(cVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.FinderFeedDetailRelUIContract.Presenter");
        C10037x1 x1Var2 = (C10037x1) cVar2;
        if (x1Var2.f30761C != null) {
            Log.m105924i("Finder.FinderFeedDetailRelUIContract.ViewCallback", "cache exit!,show cache first");
            ArrayList<C0740i2> n = x1Var2.mo2492n();
            if (n != null) {
                n.clear();
            }
            ArrayList<C0740i2> n2 = x1Var2.mo2492n();
            if (n2 != null) {
                BaseFinderFeed baseFinderFeed = x1Var2.f30761C;
                C87412m.m108591d(baseFinderFeed);
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
        RefreshLoadMoreLayout D = mo10308D();
        View inflate = C85868k2.m106137b(this.f30122d).inflate(C0966R.C0971layout.azx, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(context).inf…b_load_more_footer, null)");
        D.setLoadMoreFooter(inflate);
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

    /* renamed from: x0 */
    public C16389w mo10283x0() {
        return this.f30022r;
    }
}

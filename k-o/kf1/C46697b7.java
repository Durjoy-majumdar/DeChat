package kf1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderPoiManageUI;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fo1.C8178c;
import gy3.C87412m;
import uo3.C78253a;

/* renamed from: kf1.b7 */
public final class C46697b7 implements C8178c<C46704t6> {

    /* renamed from: d */
    public final FinderPoiManageUI f125715d;

    /* renamed from: e */
    public final C46704t6 f125716e;

    /* renamed from: f */
    public RefreshLoadMoreLayout f125717f;

    /* renamed from: g */
    public C78253a f125718g;

    /* renamed from: h */
    public WxRecyclerAdapter<?> f125719h;

    public C46697b7(FinderPoiManageUI finderPoiManageUI, C46704t6 t6Var) {
        C87412m.m108594g(finderPoiManageUI, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(t6Var, "presenter");
        this.f125715d = finderPoiManageUI;
        this.f125716e = t6Var;
    }

    /* renamed from: p */
    public static final void m52000p(C46697b7 b7Var, boolean z) {
        View findViewById = b7Var.f125715d.findViewById(C0966R.C0970id.cjg);
        if (findViewById != null) {
            WeImageView weImageView = (WeImageView) findViewById.findViewById(C0966R.C0970id.is7);
            if (z) {
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                    weImageView.setOnClickListener(new C10042x6(findViewById));
                }
            } else if (weImageView != null) {
                weImageView.setVisibility(8);
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f125715d;
    }

    /* renamed from: v */
    public final void mo71950v(boolean z, int i, int i2) {
        if (i < 0 || i2 <= 0) {
            WxRecyclerAdapter<?> wxRecyclerAdapter = this.f125719h;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.notifyDataSetChanged();
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        } else {
            WxRecyclerAdapter<?> wxRecyclerAdapter2 = this.f125719h;
            if (wxRecyclerAdapter2 != null) {
                wxRecyclerAdapter2.notifyItemRangeInserted(i, i2);
            } else {
                C87412m.m108603p("adapter");
                throw null;
            }
        }
        if (z) {
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
            cVar.f24951f = this.f125716e.f125736o;
            cVar.f24953h = i2;
            if (i2 > 0) {
                cVar.f24952g = false;
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f125717f;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.onPreFinishLoadMoreSmooth(cVar);
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        } else {
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f125717f;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.mo82442H(0);
                if (!this.f125716e.f125736o) {
                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f125717f;
                    if (refreshLoadMoreLayout3 != null) {
                        RefreshLoadMoreLayout.m66896C(refreshLoadMoreLayout3, (RefreshLoadMoreLayout.C7080c) null, 1, (Object) null);
                    } else {
                        C87412m.m108603p("rlLayout");
                        throw null;
                    }
                }
            } else {
                C87412m.m108603p("rlLayout");
                throw null;
            }
        }
    }
}

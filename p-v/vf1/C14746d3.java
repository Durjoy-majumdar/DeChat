package vf1;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.plugin.finder.order.OrderTabFragment;
import com.tencent.p014mm.plugin.finder.order.p054ui.OrderTabView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import er1.C58739j4;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import sx3.C110818d0;
import tn1.C14057l;
import wn1.C15556f;

/* renamed from: vf1.d3 */
public final class C14746d3 implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveOrderUI f40718d;

    public C14746d3(FinderLiveOrderUI finderLiveOrderUI) {
        this.f40718d = finderLiveOrderUI;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        WxRecyclerView wxRecyclerView;
        ArrayList<C14057l> a;
        int i3 = i;
        OrderTabView orderTabView = this.f40718d.f14530p;
        LinearLayoutManager linearLayoutManager = null;
        if (orderTabView != null) {
            WxRecyclerView wxRecyclerView2 = orderTabView.f15855f;
            RecyclerView.LayoutManager layoutManager = wxRecyclerView2 != null ? wxRecyclerView2.getLayoutManager() : null;
            if (layoutManager instanceof LinearLayoutManager) {
                linearLayoutManager = (LinearLayoutManager) layoutManager;
            }
            if (linearLayoutManager != null) {
                int C = linearLayoutManager.mo16957C();
                int E = linearLayoutManager.mo16959E();
                C15556f fVar = orderTabView.f15854e;
                int size = (fVar == null || (a = fVar.mo13887a()) == null) ? 0 : a.size();
                if (C58739j4.f168176a.mo83692U()) {
                    String str = orderTabView.f15853d;
                    Log.m105924i(str, "scroll firstVisibleItemPos:" + C + ",lastVisibleItemPos:" + E + ",dataSize:" + size + ",index:" + i3 + ",positionOffset:" + f + ",positionOffsetPixels:" + i2 + '!');
                }
                boolean z = true;
                if (!(C <= i3 && i3 <= E)) {
                    if (i3 < 0 || i3 >= size) {
                        z = false;
                    }
                    if (z && (wxRecyclerView = orderTabView.f15855f) != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(Integer.valueOf(i));
                        WxRecyclerView wxRecyclerView3 = wxRecyclerView;
                        C117292a.m165358d(wxRecyclerView3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/order/ui/OrderTabView", "scroll", "(IFI)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        wxRecyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(wxRecyclerView3, "com/tencent/mm/plugin/finder/order/ui/OrderTabView", "scroll", "(IFI)V", "Undefined", "smoothScrollToPosition", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C87412m.m108603p("tabView");
        throw null;
    }

    public void onPageSelected(int i) {
        ArrayList<C14057l> a;
        RecyclerView.C16613e adapter;
        OrderTabView orderTabView = this.f40718d.f14530p;
        String str = null;
        if (orderTabView != null) {
            C15556f fVar = orderTabView.f15854e;
            if (fVar != null && (a = fVar.mo13887a()) != null && a.size() > i && i >= 0) {
                for (C14057l lVar : a) {
                    lVar.f39435g = false;
                }
                C14057l lVar2 = (C14057l) C110818d0.m150917O(a, i);
                if (lVar2 != null) {
                    lVar2.f39435g = true;
                }
                String str2 = orderTabView.f15853d;
                StringBuilder sb = new StringBuilder();
                sb.append("select ");
                sb.append(i);
                sb.append(", title:");
                C14057l lVar3 = (C14057l) C110818d0.m150917O(a, i);
                if (lVar3 != null) {
                    str = lVar3.f39433e;
                }
                sb.append(str);
                Log.m105924i(str2, sb.toString());
                WxRecyclerView wxRecyclerView = orderTabView.f15855f;
                if (!(wxRecyclerView == null || (adapter = wxRecyclerView.getAdapter()) == null)) {
                    adapter.notifyDataSetChanged();
                }
            }
            OrderTabFragment orderTabFragment = (OrderTabFragment) C110818d0.m150917O(this.f40718d.f14537w, i);
            if (orderTabFragment != null) {
                orderTabFragment.mo2202O();
            }
            if (orderTabFragment == null) {
                Log.m105920e("Finder.FinderLiveOrderUI", "onPageSelected position:" + i + ", size:" + this.f40718d.f14537w.size());
                return;
            }
            return;
        }
        C87412m.m108603p("tabView");
        throw null;
    }
}

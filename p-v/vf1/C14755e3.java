package vf1;

import androidx.fragment.app.C112968x;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.plugin.finder.order.OrderTabFragment;
import gy3.C87412m;

/* renamed from: vf1.e3 */
public final class C14755e3 extends C112968x {

    /* renamed from: i */
    public final /* synthetic */ FinderLiveOrderUI f40729i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14755e3(FinderLiveOrderUI finderLiveOrderUI, FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f40729i = finderLiveOrderUI;
    }

    public int getCount() {
        return this.f40729i.f14537w.size();
    }

    public Fragment getItem(int i) {
        OrderTabFragment orderTabFragment = this.f40729i.f14537w.get(i);
        C87412m.m108593f(orderTabFragment, "fragments[position]");
        return orderTabFragment;
    }
}

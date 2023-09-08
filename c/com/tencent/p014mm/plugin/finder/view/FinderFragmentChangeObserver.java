package com.tencent.p014mm.plugin.finder.view;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60204t3;
import ht1.C8777j5;
import java.util.List;
import kotlin.Metadata;
import l31.C61212e;
import sx3.C64197v;
import t91.C64208c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0012"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver;", "Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;", "Lcom/tencent/mm/plugin/finder/view/v2;", "Lcom/tencent/mm/ui/MMActivity;", "activity", "Lcom/tencent/mm/ui/MMActivity;", "getActivity", "()Lcom/tencent/mm/ui/MMActivity;", "", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "fragments", "Ljava/util/List;", "", "lastIndex", "I", "lastType", "Companion", "a", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver */
public abstract class FinderFragmentChangeObserver implements ViewPager.OnPageChangeListener, C4194v2 {
    public static final C3956a Companion = new C3956a((C8480h) null);
    public static final String TAG = "Finder.FragmentChangeObserver";
    private final MMActivity activity;
    private final List<FinderHomeTabFragment> fragments;
    private int lastIndex = -1;
    private int lastType = -1;

    /* renamed from: com.tencent.mm.plugin.finder.view.FinderFragmentChangeObserver$a */
    public static final class C3956a {
        public C3956a(C8480h hVar) {
        }
    }

    public FinderFragmentChangeObserver(MMActivity mMActivity, List<? extends FinderHomeTabFragment> list) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(list, "fragments");
        this.activity = mMActivity;
        this.fragments = list;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        Class cls = C61212e.class;
        if (i >= 0 && i < this.fragments.size()) {
            MMActivity mMActivity = this.activity;
            FinderProfileUI finderProfileUI = mMActivity instanceof FinderProfileUI ? (FinderProfileUI) mMActivity : null;
            boolean N7 = finderProfileUI != null ? finderProfileUI.mo3097N7() : false;
            String name = this.fragments.get(i).getClass().getName();
            String str = ((C8777j5) C86312j.m106911c(C8777j5.class)).getConfig().f151431M.get(name);
            if (!N7 && str != null) {
                C64208c.f181960j = name;
            }
        }
        if (this.lastIndex != i) {
            FinderHomeTabFragment finderHomeTabFragment = null;
            int i2 = 0;
            for (T next : this.fragments) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    FinderHomeTabFragment finderHomeTabFragment2 = (FinderHomeTabFragment) next;
                    if (i == i2) {
                        finderHomeTabFragment = finderHomeTabFragment2;
                    } else if (this.lastIndex == i2) {
                        finderHomeTabFragment2.mo3550P();
                        mo5078v(false, i2, finderHomeTabFragment2);
                    }
                    if (i != i2) {
                        ((C61212e) C86312j.m106911c(cls)).mo86135F4(finderHomeTabFragment2);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo5077k(this.lastIndex, i, this.lastType, this.fragments.get(i).f17334o);
            if (finderHomeTabFragment != null) {
                FragmentActivity activity2 = finderHomeTabFragment.getActivity();
                if (activity2 != null) {
                    if (this.lastIndex == -1) {
                        Object ub02 = ((C60204t3) C86312j.m106911c(C60204t3.class)).ub0();
                        if (ub02 == null) {
                            ub02 = finderHomeTabFragment.getActivity();
                        }
                        if (C87412m.m108589b(activity2, ub02)) {
                            ((C61212e) C86312j.m106911c(cls)).mo86143M0(finderHomeTabFragment);
                        }
                    } else {
                        ((C61212e) C86312j.m106911c(cls)).mo86143M0(finderHomeTabFragment);
                    }
                }
                finderHomeTabFragment.mo2202O();
                mo5078v(true, i, finderHomeTabFragment);
            }
        }
        this.lastIndex = i;
        this.lastType = this.fragments.get(i).f17334o;
    }
}

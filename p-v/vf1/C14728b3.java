package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderUI;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import tn1.C14057l;
import wn1.C15556f;

/* renamed from: vf1.b3 */
public final class C14728b3 implements C15556f {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveOrderUI f40694a;

    public C14728b3(FinderLiveOrderUI finderLiveOrderUI) {
        this.f40694a = finderLiveOrderUI;
    }

    /* renamed from: a */
    public ArrayList<C14057l> mo13887a() {
        return this.f40694a.f14536v;
    }

    /* renamed from: b */
    public void mo13888b(C14057l lVar) {
        C87412m.m108594g(lVar, "tab");
        Iterator<C14057l> it = this.f40694a.f14536v.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().f39432d == lVar.f39432d) {
                break;
            }
            i++;
        }
        Log.m105924i("Finder.FinderLiveOrderUI", "onSelectTab title:" + lVar.f39433e + ", index:" + i + ", count:" + lVar.f39434f);
        FinderViewPager finderViewPager = this.f40694a.f14529o;
        if (finderViewPager == null) {
            C87412m.m108603p("viewPager");
            throw null;
        } else if (finderViewPager.getCurrentItem() != i) {
            FinderViewPager finderViewPager2 = this.f40694a.f14529o;
            if (finderViewPager2 != null) {
                finderViewPager2.setCurrentItem(i, false);
            } else {
                C87412m.m108603p("viewPager");
                throw null;
            }
        }
    }
}

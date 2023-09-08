package vf1;

import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveWhiteListUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import qk1.C12846x2;
import rx3.C13598b0;

/* renamed from: vf1.x3 */
public final class C14847x3 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLiveWhiteListUI f40859d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14847x3(FinderLiveWhiteListUI finderLiveWhiteListUI) {
        super(0);
        this.f40859d = finderLiveWhiteListUI;
    }

    public Object invoke() {
        FinderLiveWhiteListUI finderLiveWhiteListUI = this.f40859d;
        int i = FinderLiveWhiteListUI.f14607w;
        finderLiveWhiteListUI.getClass();
        Log.m105924i("Finder.FinderLiveWhiteListUI", "before updateChooseList size:" + finderLiveWhiteListUI.f14614u.size());
        finderLiveWhiteListUI.f14614u.clear();
        for (C12846x2.C12848b bVar : finderLiveWhiteListUI.f14615v) {
            if (bVar.f36762a) {
                finderLiveWhiteListUI.f14614u.add(bVar.f36763b);
            }
        }
        Log.m105924i("Finder.FinderLiveWhiteListUI", "after updateChooseList size:" + finderLiveWhiteListUI.f14614u.size());
        return C13598b0.f38549a;
    }
}

package ve1;

import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.convert.FinderFeedFullConvert;
import com.tencent.p014mm.plugin.finder.feed.FinderCommentDrawerPresenter;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderCommentDrawer;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import rs1.C13562z2;
import up1.C65426w0;

/* renamed from: ve1.g1 */
public final class C14528g1 implements C13562z2.C13563a {

    /* renamed from: a */
    public final /* synthetic */ FinderFeedFullConvert<BaseFinderFeed> f40271a;

    /* renamed from: b */
    public final /* synthetic */ C60905o f40272b;

    /* renamed from: c */
    public final /* synthetic */ BaseFinderFeed f40273c;

    public C14528g1(FinderFeedFullConvert<BaseFinderFeed> finderFeedFullConvert, C60905o oVar, BaseFinderFeed baseFinderFeed) {
        this.f40271a = finderFeedFullConvert;
        this.f40272b = oVar;
        this.f40273c = baseFinderFeed;
    }

    /* renamed from: a */
    public void mo12960a() {
        FinderFeedFullConvert.m2150a0(this.f40271a, this.f40272b, this.f40273c, false, 0, (C65426w0) null, 0, 0, false, 0, 0, 0, 2044, (Object) null);
    }

    /* renamed from: b */
    public void mo12961b(boolean z) {
        View D = this.f40272b.mo85812D(C0966R.C0970id.d97);
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(0.3f));
            View view = D;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            D.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            return;
        }
        C9556a aVar2 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar2.mo10233c(Float.valueOf(1.0f));
        View view2 = D;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        D.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$addShareSnsToCommentCallback$1", "onShowTips", "(Z)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    /* renamed from: c */
    public void mo12962c(String str) {
        FinderCommentDrawer finderCommentDrawer;
        FinderCommentDrawerPresenter finderCommentDrawerPresenter;
        C87412m.m108594g(str, "desc");
        C56597e1 r5 = this.f40271a.f12564e.mo2579r5();
        if (r5 != null && (finderCommentDrawer = r5.f162255a) != null && (finderCommentDrawerPresenter = finderCommentDrawer.f162045T) != null) {
            finderCommentDrawerPresenter.mo77319L0(finderCommentDrawer.f162030D, new ArrayList(), str);
        }
    }
}

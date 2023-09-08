package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import ur1.C65468g;

/* renamed from: com.tencent.mm.plugin.finder.feed.h */
public final class C2646h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f13498d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2646h(FinderCommentDrawerPresenter finderCommentDrawerPresenter) {
        super(0);
        this.f13498d = finderCommentDrawerPresenter;
    }

    public Object invoke() {
        View view;
        C65468g gVar = this.f13498d.f158622n;
        if (gVar != null) {
            view = gVar.f188412t;
            if (view == null) {
                C87412m.m108603p("headerErrTip");
                throw null;
            }
        } else {
            view = null;
        }
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return C13598b0.f38549a;
    }
}

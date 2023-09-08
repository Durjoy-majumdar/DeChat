package com.tencent.p014mm.plugin.finder.feed;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.autogen.events.FinderCommentErrorEvent;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import rx3.C13598b0;
import ur1.C65468g;

/* renamed from: com.tencent.mm.plugin.finder.feed.g */
public final class C2644g extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderCommentDrawerPresenter f13495d;

    /* renamed from: e */
    public final /* synthetic */ FinderCommentErrorEvent f13496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2644g(FinderCommentDrawerPresenter finderCommentDrawerPresenter, FinderCommentErrorEvent finderCommentErrorEvent) {
        super(0);
        this.f13495d = finderCommentDrawerPresenter;
        this.f13496e = finderCommentErrorEvent;
    }

    public Object invoke() {
        View view;
        TextView textView;
        C65468g gVar = this.f13495d.f158622n;
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
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderCommentDrawerPresenter$commentErrorListener$1$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C65468g gVar2 = this.f13495d.f158622n;
        if (gVar2 != null) {
            textView = gVar2.f188413u;
            if (textView == null) {
                C87412m.m108603p("headerErrTv");
                throw null;
            }
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText(this.f13496e.f9188d.f9190b);
        }
        FinderCommentDrawerPresenter finderCommentDrawerPresenter = this.f13495d;
        C65468g gVar3 = finderCommentDrawerPresenter.f158622n;
        if (gVar3 != null) {
            View view2 = gVar3.f188412t;
            if (view2 != null) {
                view2.setOnClickListener(new C2639f(finderCommentDrawerPresenter));
            } else {
                C87412m.m108603p("headerErrTip");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}

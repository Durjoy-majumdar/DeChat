package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.TextView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9983t2;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.a */
public final class C3102a extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ IResponse<C0740i2> f14961d;

    /* renamed from: e */
    public final /* synthetic */ FinderFollowTimelineUI f14962e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3102a(IResponse<C0740i2> iResponse, FinderFollowTimelineUI finderFollowTimelineUI) {
        super(0);
        this.f14961d = iResponse;
        this.f14962e = finderFollowTimelineUI;
    }

    public Object invoke() {
        TextView textView;
        TextView textView2;
        if (!this.f14961d.getHasMore()) {
            C9983t2 t2Var = this.f14962e.f14321t;
            View view = null;
            if (t2Var != null) {
                View loadMoreFooter = t2Var.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C9983t2 t2Var2 = this.f14962e.f14321t;
                if (t2Var2 != null) {
                    View loadMoreFooter2 = t2Var2.mo10308D().getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView.setTextColor(this.f14962e.getResources().getColor(C0966R.color.FG_2));
                    }
                    C9983t2 t2Var3 = this.f14962e.f14321t;
                    if (t2Var3 != null) {
                        View loadMoreFooter3 = t2Var3.mo10308D().getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                        C9983t2 t2Var4 = this.f14962e.f14321t;
                        if (t2Var4 != null) {
                            View loadMoreFooter4 = t2Var4.mo10308D().getLoadMoreFooter();
                            if (loadMoreFooter4 != null) {
                                view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(0);
                                View view2 = view;
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderFollowTimelineUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}

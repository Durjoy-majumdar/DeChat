package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import kf1.C9924p3;
import rx3.C13598b0;

/* renamed from: com.tencent.mm.plugin.finder.feed.ui.h */
public final class C3109h extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FinderLbsStreamListUI f14971d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3109h(FinderLbsStreamListUI finderLbsStreamListUI) {
        super(0);
        this.f14971d = finderLbsStreamListUI;
    }

    public Object invoke() {
        TextView textView;
        TextView textView2;
        C9924p3 p3Var = this.f14971d.f14473t;
        View view = null;
        if (p3Var != null) {
            View loadMoreFooter = p3Var.mo10308D().getLoadMoreFooter();
            if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView2.setText(C0966R.string.eat);
            }
            C9924p3 p3Var2 = this.f14971d.f14473t;
            if (p3Var2 != null) {
                View loadMoreFooter2 = p3Var2.mo10308D().getLoadMoreFooter();
                if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setTextColor(this.f14971d.getResources().getColor(C0966R.color.FG_2));
                }
                C9924p3 p3Var3 = this.f14971d.f14473t;
                if (p3Var3 != null) {
                    View loadMoreFooter3 = p3Var3.mo10308D().getLoadMoreFooter();
                    TextView textView3 = loadMoreFooter3 != null ? (TextView) loadMoreFooter3.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    C9924p3 p3Var4 = this.f14971d.f14473t;
                    if (p3Var4 != null) {
                        View loadMoreFooter4 = p3Var4.mo10308D().getLoadMoreFooter();
                        if (loadMoreFooter4 != null) {
                            view = loadMoreFooter4.findViewById(C0966R.C0970id.g2s);
                        }
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(0);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLbsStreamListUI$initOnCreate$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }
}

package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import gy3.C87412m;
import j20.C117292a;
import je1.C9319i3;
import k20.C60958c;
import k20.C9556a;

/* renamed from: com.tencent.mm.plugin.finder.ui.c2 */
public final class C3777c2 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderPostAtUI f17250a;

    public C3777c2(FinderPostAtUI finderPostAtUI) {
        this.f17250a = finderPostAtUI;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        int i2 = FinderPostAtUI.f17001w;
        Log.m105924i("Finder.FinderPostAtUI", "onLoadMoreBegin");
        FinderPostAtUI finderPostAtUI = this.f17250a;
        View view = null;
        if (finderPostAtUI.f17009v == null) {
            C87412m.m108603p("recyclerView");
            throw null;
        } else if (finderPostAtUI.f17006s) {
            C86709a0.m107524d().mo123460f(new C9319i3(finderPostAtUI.f17005r));
            RefreshLoadMoreLayout refreshLoadMoreLayout = finderPostAtUI.f17008u;
            if (refreshLoadMoreLayout != null) {
                View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eas);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderPostAtUI.f17008u;
                if (refreshLoadMoreLayout2 != null) {
                    View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                    TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView3 != null) {
                        textView3.setVisibility(0);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderPostAtUI.f17008u;
                    if (refreshLoadMoreLayout3 != null) {
                        View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                        if (loadMoreFooter3 != null) {
                            view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                        }
                        if (view != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        } else {
            RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderPostAtUI.f17008u;
            if (refreshLoadMoreLayout4 != null) {
                View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderPostAtUI.f17008u;
                if (refreshLoadMoreLayout5 != null) {
                    View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                    TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderPostAtUI.f17008u;
                    if (refreshLoadMoreLayout6 != null) {
                        View loadMoreFooter6 = refreshLoadMoreLayout6.getLoadMoreFooter();
                        if (loadMoreFooter6 != null) {
                            view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
                        }
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view3 = view;
                            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/ui/FinderPostAtUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }
}

package hp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchIncludeFollowUI;
import com.tencent.p014mm.plugin.finder.search.FinderTopicSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import je1.C9320i4;
import k20.C60958c;
import k20.C9556a;
import pe3.C89349b;
import te3.C49712hj1;

/* renamed from: hp1.z0 */
public final class C8708z0 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderTopicSearchUI f27937a;

    public C8708z0(FinderTopicSearchUI finderTopicSearchUI) {
        this.f27937a = finderTopicSearchUI;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        int i2 = FinderContactSearchIncludeFollowUI.f16400B;
        Log.m105924i("Finder.FinderContactSearchIncludeFollowUI", "onLoadMoreBegin");
        FinderTopicSearchUI finderTopicSearchUI = this.f27937a;
        String str = finderTopicSearchUI.f16607e;
        if (str != null) {
            View view = null;
            if (finderTopicSearchUI.f16609g == 1) {
                C9320i4 i4Var = r2;
                C9320i4 i4Var2 = new C9320i4(str, finderTopicSearchUI.f16608f, finderTopicSearchUI.f16612j, finderTopicSearchUI.f16610h, finderTopicSearchUI.f16613n, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, false, 0, 2016, (C8480h) null);
                finderTopicSearchUI.f16622w = i4Var;
                C86709a0.m107524d().mo123460f(finderTopicSearchUI.f16622w);
                C86709a0.m107524d().mo123455a(3820, finderTopicSearchUI);
                RefreshLoadMoreLayout refreshLoadMoreLayout = finderTopicSearchUI.f16618s;
                if (refreshLoadMoreLayout != null) {
                    View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eas);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderTopicSearchUI.f16618s;
                    if (refreshLoadMoreLayout2 != null) {
                        View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderTopicSearchUI.f16618s;
                        if (refreshLoadMoreLayout3 != null) {
                            View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                            if (loadMoreFooter3 != null) {
                                view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                            }
                            View view2 = view;
                            if (view2 != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                View view3 = view2;
                                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderTopicSearchUI.f16618s;
            if (refreshLoadMoreLayout4 != null) {
                View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderTopicSearchUI.f16618s;
                if (refreshLoadMoreLayout5 != null) {
                    View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                    TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderTopicSearchUI.f16618s;
                    if (refreshLoadMoreLayout6 != null) {
                        View loadMoreFooter6 = refreshLoadMoreLayout6.getLoadMoreFooter();
                        if (loadMoreFooter6 != null) {
                            view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
                        }
                        View view4 = view;
                        if (view4 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view5 = view4;
                            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/search/FinderTopicSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

package hp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.search.FinderFansSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import f40.C86709a0;
import gy3.C8480h;
import gy3.C87412m;
import j20.C117292a;
import je1.C46507a3;
import k20.C60958c;
import k20.C9556a;
import te3.C49712hj1;

/* renamed from: hp1.k */
public final class C46089k extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderFansSearchUI f124245a;

    public C46089k(FinderFansSearchUI finderFansSearchUI) {
        this.f124245a = finderFansSearchUI;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        Log.m105924i("Finder.FinderFansSearchUI", "onLoadMoreBegin");
        FinderFansSearchUI finderFansSearchUI = this.f124245a;
        String str = finderFansSearchUI.f111711p;
        if (str != null) {
            View view = null;
            if (finderFansSearchUI.f111713r == 1) {
                finderFansSearchUI.f111706A = new C46507a3(str, finderFansSearchUI.f111712q, (C49712hj1) null, 4, (C8480h) null);
                C86709a0.m107524d().mo123460f(finderFansSearchUI.f111706A);
                C86709a0.m107524d().mo123455a(6665, finderFansSearchUI);
                RefreshLoadMoreLayout refreshLoadMoreLayout = finderFansSearchUI.f111718w;
                if (refreshLoadMoreLayout != null) {
                    View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eas);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderFansSearchUI.f111718w;
                    if (refreshLoadMoreLayout2 != null) {
                        View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderFansSearchUI.f111718w;
                        if (refreshLoadMoreLayout3 != null) {
                            View loadMoreFooter3 = refreshLoadMoreLayout3.getLoadMoreFooter();
                            if (loadMoreFooter3 != null) {
                                view = loadMoreFooter3.findViewById(C0966R.C0970id.g2s);
                            }
                            if (view != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(8);
                                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderFansSearchUI.f111718w;
            if (refreshLoadMoreLayout4 != null) {
                View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderFansSearchUI.f111718w;
                if (refreshLoadMoreLayout5 != null) {
                    View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                    TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderFansSearchUI.f111718w;
                    if (refreshLoadMoreLayout6 != null) {
                        View loadMoreFooter6 = refreshLoadMoreLayout6.getLoadMoreFooter();
                        if (loadMoreFooter6 != null) {
                            view = loadMoreFooter6.findViewById(C0966R.C0970id.g2s);
                        }
                        if (view != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderFansSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

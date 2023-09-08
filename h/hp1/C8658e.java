package hp1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.search.FinderContactSearchUI;
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

/* renamed from: hp1.e */
public final class C8658e extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderContactSearchUI f27820a;

    public C8658e(FinderContactSearchUI finderContactSearchUI) {
        this.f27820a = finderContactSearchUI;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        Log.m105924i(this.f27820a.f16440o, "onLoadMoreBegin");
        FinderContactSearchUI finderContactSearchUI = this.f27820a;
        String str = finderContactSearchUI.f16442q;
        if (str != null) {
            View view = null;
            if (finderContactSearchUI.f16444s == 1) {
                C9320i4 i4Var = r2;
                C9320i4 i4Var2 = new C9320i4(str, finderContactSearchUI.f16443r, finderContactSearchUI.f16448w, finderContactSearchUI.f16445t, finderContactSearchUI.f16449x, (C49712hj1) null, (C89349b) null, (C89349b) null, (C89349b) null, false, 0, 2016, (C8480h) null);
                finderContactSearchUI.f16437K = i4Var;
                C86709a0.m107524d().mo123460f(finderContactSearchUI.f16437K);
                C86709a0.m107524d().mo123455a(3820, finderContactSearchUI);
                RefreshLoadMoreLayout refreshLoadMoreLayout = finderContactSearchUI.f16429C;
                if (refreshLoadMoreLayout != null) {
                    View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eas);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = finderContactSearchUI.f16429C;
                    if (refreshLoadMoreLayout2 != null) {
                        View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = finderContactSearchUI.f16429C;
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
                                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderContactSearchUI.f16429C;
            if (refreshLoadMoreLayout4 != null) {
                View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
                if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout5 = finderContactSearchUI.f16429C;
                if (refreshLoadMoreLayout5 != null) {
                    View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                    TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout6 = finderContactSearchUI.f16429C;
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
                            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/search/FinderContactSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

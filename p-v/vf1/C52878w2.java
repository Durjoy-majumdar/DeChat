package vf1;

import android.view.View;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveOrderSearchUI;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import tn1.C52358i;
import tn1.C52360k;

/* renamed from: vf1.w2 */
public final class C52878w2 extends RefreshLoadMoreLayout.C57879a {

    /* renamed from: a */
    public final /* synthetic */ FinderLiveOrderSearchUI f147679a;

    public C52878w2(FinderLiveOrderSearchUI finderLiveOrderSearchUI) {
        this.f147679a = finderLiveOrderSearchUI;
    }

    /* renamed from: b */
    public void mo2561b(int i) {
        TextView textView;
        TextView textView2;
        Log.m105924i("MicroMsg.UIComponentFragment", "onLoadMoreBegin");
        FinderLiveOrderSearchUI finderLiveOrderSearchUI = this.f147679a;
        View view = null;
        if (finderLiveOrderSearchUI.f111531u) {
            C52360k kVar = finderLiveOrderSearchUI.f111530t;
            if (kVar != null) {
                C61926c.m72668M(new C52358i(kVar));
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f147679a.f111525o;
                if (refreshLoadMoreLayout != null) {
                    View loadMoreFooter = refreshLoadMoreLayout.getLoadMoreFooter();
                    if (!(loadMoreFooter == null || (textView2 = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView2.setText(C0966R.string.eas);
                    }
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f147679a.f111525o;
                    if (refreshLoadMoreLayout2 != null) {
                        View loadMoreFooter2 = refreshLoadMoreLayout2.getLoadMoreFooter();
                        TextView textView3 = loadMoreFooter2 != null ? (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t) : null;
                        if (textView3 != null) {
                            textView3.setVisibility(0);
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f147679a.f111525o;
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
                                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            C87412m.m108603p("feedLoader");
            throw null;
        }
        RefreshLoadMoreLayout refreshLoadMoreLayout4 = finderLiveOrderSearchUI.f111525o;
        if (refreshLoadMoreLayout4 != null) {
            View loadMoreFooter4 = refreshLoadMoreLayout4.getLoadMoreFooter();
            if (!(loadMoreFooter4 == null || (textView = (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t)) == null)) {
                textView.setText(C0966R.string.eat);
            }
            RefreshLoadMoreLayout refreshLoadMoreLayout5 = this.f147679a.f111525o;
            if (refreshLoadMoreLayout5 != null) {
                View loadMoreFooter5 = refreshLoadMoreLayout5.getLoadMoreFooter();
                TextView textView4 = loadMoreFooter5 != null ? (TextView) loadMoreFooter5.findViewById(C0966R.C0970id.g2t) : null;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                RefreshLoadMoreLayout refreshLoadMoreLayout6 = this.f147679a.f111525o;
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
                        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveOrderSearchUI$initContentView$2", "onLoadMoreBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

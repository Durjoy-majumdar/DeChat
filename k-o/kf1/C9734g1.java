package kf1;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de1.C7267b;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C58417y0;
import dp1.C7450q;
import ef1.C58556f;
import er1.C58684b;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Arrays;
import jm2.C117361f;
import jq3.C60898l;
import k20.C60958c;
import k20.C9556a;
import rs1.C13442s8;
import te3.C49712hj1;
import wp1.C15587j;
import zt3.C119157j;

/* renamed from: kf1.g1 */
public class C9734g1 extends C9753h {

    /* renamed from: u */
    public final Fragment f30179u;

    /* renamed from: v */
    public final String f30180v;

    /* renamed from: kf1.g1$a */
    public static final class C9735a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f30181d;

        /* renamed from: e */
        public final /* synthetic */ C9734g1 f30182e;

        /* renamed from: kf1.g1$a$a */
        public static final class C9736a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9734g1 f30183d;

            public C9736a(C9734g1 g1Var) {
                this.f30183d = g1Var;
            }

            public final void run() {
                this.f30183d.mo10348I0().requestRefresh();
            }
        }

        public C9735a(View view, C9734g1 g1Var) {
            this.f30181d = view;
            this.f30182e = g1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback$handleRefreshEnd$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback$handleRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback$handleRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View findViewById = this.f30181d.findViewById(C0966R.C0970id.i7j);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                View view3 = findViewById;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback$handleRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback$handleRefreshEnd$1$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            ((C119157j) C119157j.f356862d).mo183875f(new C9736a(this.f30182e));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback$handleRefreshEnd$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C9734g1(com.tencent.p014mm.p136ui.MMActivity r9, androidx.fragment.app.Fragment r10, int r11, int r12, boolean r13, int r14, gy3.C8480h r15) {
        /*
            r8 = this;
            r14 = r14 & 16
            if (r14 == 0) goto L_0x0007
            r13 = 0
            r4 = 0
            goto L_0x0008
        L_0x0007:
            r4 = r13
        L_0x0008:
            java.lang.String r13 = "context"
            gy3.C87412m.m108594g(r9, r13)
            java.lang.String r13 = "fragment"
            gy3.C87412m.m108594g(r10, r13)
            r5 = 0
            r6 = 16
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r8.f30179u = r10
            java.lang.String r9 = "Finder.FinderFavFeedUIContract.FavFeedViewCallback"
            r8.f30180v = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9734g1.<init>(com.tencent.mm.ui.MMActivity, androidx.fragment.app.Fragment, int, int, boolean, int, gy3.h):void");
    }

    /* renamed from: F0 */
    public View mo9289F0() {
        return null;
    }

    /* renamed from: G0 */
    public RecyclerView.C0129l mo9290G0() {
        ((FinderStaggeredConfig) this.f30224q).getClass();
        return new FinderStaggeredConfig.C3631b();
    }

    /* renamed from: H0 */
    public RecyclerView.LayoutManager mo9291H0(Context context) {
        C87412m.m108594g(context, "context");
        return this.f30224q.mo3666d(context);
    }

    /* renamed from: J0 */
    public CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        int dimension = (int) this.f30214d.getResources().getDimension(C0966R.dimen.f3743cv);
        C58784w3 w3Var = C58784w3.f168295a;
        MMActivity mMActivity = this.f30214d;
        String string = mMActivity.getString(C0966R.string.fnn);
        C87412m.m108593f(string, "context.getString(com.te…ring.finder_fav_feed_new)");
        return w3Var.mo83957q1(mMActivity, string, '#', C0966R.raw.icons_outlined_star_new_bold, C0966R.color.FG_0, dimension, dimension);
    }

    /* renamed from: K0 */
    public void mo10332K0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        if (!cVar.f24951f) {
            mo10336b1();
        }
    }

    /* renamed from: L0 */
    public void mo10333L0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        RefreshLoadMoreLayout.C7080c<Object> cVar2 = cVar;
        C87412m.m108594g(cVar2, TPReportKeys.PlayerStep.PLAYER_REASON);
        View m0 = mo9299m0();
        if (m0 != null) {
            RecyclerView.C16613e adapter = getRecyclerView().getAdapter();
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            if (cVar2.f24947b != -1) {
                if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) <= 0) {
                    mo10335Z0();
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30220j;
                    if (refreshLoadMoreLayout != null) {
                        refreshLoadMoreLayout.setVisibility(0);
                        return;
                    }
                    return;
                }
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f30220j;
                if (refreshLoadMoreLayout2 != null) {
                    refreshLoadMoreLayout2.setVisibility(0);
                }
                if (!cVar2.f24951f) {
                    mo10336b1();
                    View loadMoreFooter = this.f30220j.getLoadMoreFooter();
                    if (loadMoreFooter != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(0);
                        C117292a.m165358d(loadMoreFooter, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        loadMoreFooter.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                return;
            }
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(0);
            View view = m0;
            C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) m0.findViewById(C0966R.C0970id.cj7);
            if (textView != null) {
                textView.setVisibility(8);
            }
            TextView textView2 = (TextView) m0.findViewById(C0966R.C0970id.is_);
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            View findViewById = m0.findViewById(C0966R.C0970id.i7j);
            if (findViewById != null) {
                C9556a aVar4 = new C9556a();
                aVar4.mo10233c(8);
                C117292a.m165358d(findViewById, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "handleRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = m0.findViewById(C0966R.C0970id.is_);
            if (findViewById2 != null) {
                findViewById2.setOnClickListener(new C9735a(m0, this));
            }
            BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
            DataBuffer dataList = ((FinderFavFeedLoader) baseFinderFeedLoader).getDataList();
            if (!dataList.isEmpty()) {
                dataList.clear();
                mo10348I0().f30175e.onDataChanged();
            }
        }
    }

    /* renamed from: M0 */
    public boolean mo10334M0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return true;
    }

    /* renamed from: Q0 */
    public void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i) {
        RecyclerView.C16613e<?> eVar2 = eVar;
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(eVar2);
        arrayList.add(view2);
        arrayList.add(Integer.valueOf(i));
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V", this, array);
        C87412m.m108594g(eVar2, "adapter");
        C87412m.m108594g(view2, "view");
        C117361f.INSTANCE.mo182041q(540999706);
        int c6 = i - ((C60898l) eVar2).mo85796c6();
        if (c6 >= 0 && c6 < mo10348I0().f30175e.getSize()) {
            C0740i2 i2Var = (C0740i2) mo10348I0().f30175e.getDataListJustForAdapter().get(c6);
            if (!(i2Var instanceof BaseFinderFeed)) {
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V");
                return;
            }
            String str = this.f30180v;
            StringBuilder sb = new StringBuilder();
            sb.append("onClick ");
            sb.append(c6);
            sb.append(" id:");
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) i2Var;
            sb.append(baseFinderFeed.mo3513o().getId());
            sb.append(", pos:");
            sb.append(c6);
            Log.m105924i(str, sb.toString());
            Intent intent = new Intent();
            BaseFeedLoader.saveCache$default(mo10348I0().f30175e, intent, c6, (C2780c) null, 4, (Object) null);
            BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
            FinderFavFeedLoader finderFavFeedLoader = baseFinderFeedLoader instanceof FinderFavFeedLoader ? (FinderFavFeedLoader) baseFinderFeedLoader : null;
            intent.putExtra("key_active_topic_id", finderFavFeedLoader != null ? finderFavFeedLoader.f13522j : 0);
            C7287o.m7447c(intent, view, 0, false, false, C7267b.Ax0(C7267b.f25328d, getRecyclerView(), baseFinderFeed.mo3513o().getId(), mo10348I0().f30175e.getDataListJustForAdapter(), (C32226l) null, 8, (Object) null), 14, (Object) null);
            ((C58684b) C86312j.m106911c(C58684b.class)).zx0(this.f30214d, intent, 10001);
            C49712hj1 q3 = ((C13442s8) C39818r.f106831a.mo62445d(this.f30179u).mo75002a(C13442s8.class)).mo12861q3();
            C7335d c = C86312j.m106911c(C58417y0.class);
            C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
            C58417y0.Qx0((C58417y0) c, q3, i2Var.getItemId(), this.f30220j.getRecyclerView(), 0, (String) null, 24, (Object) null);
            C7450q.f25643a.mo8594b(q3, i2Var, 18);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallbackcom/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "onGridItemClick", "(Landroidx/recyclerview/widget/RecyclerView$Adapter;Landroid/view/View;I)V");
    }

    /* renamed from: R0 */
    public void mo9295R0() {
        if (mo10348I0().f30175e.getSize() <= this.f30219i * 3) {
            BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
            if (((FinderFavFeedLoader) baseFinderFeedLoader).f13520h) {
                RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30220j;
                int i = RefreshLoadMoreLayout.f165599Q0;
                refreshLoadMoreLayout.mo82438D(false);
            }
        }
        BaseFinderFeedLoader baseFinderFeedLoader2 = mo10348I0().f30175e;
        C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
        FinderFavFeedLoader finderFavFeedLoader = (FinderFavFeedLoader) baseFinderFeedLoader2;
        int i2 = finderFavFeedLoader.f13519g - 1;
        finderFavFeedLoader.f13519g = i2;
        View view = this.f30225r;
        TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.f357845c22) : null;
        if (textView != null) {
            textView.setText(this.f30214d.getResources().getString(C0966R.string.d8j, new Object[]{Integer.valueOf(i2)}));
        }
    }

    /* renamed from: Z0 */
    public void mo10335Z0() {
        View m0 = mo9299m0();
        if (m0 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            TextView textView = (TextView) m0.findViewById(C0966R.C0970id.cj7);
            if (textView != null) {
                textView.setVisibility(0);
            }
            View findViewById = m0.findViewById(C0966R.C0970id.i7j);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = m0.findViewById(C0966R.C0970id.is_);
            if (findViewById2 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                View view = findViewById2;
                C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: b1 */
    public final void mo10336b1() {
        TextView textView;
        String str;
        BaseFinderFeedLoader baseFinderFeedLoader = mo10348I0().f30175e;
        C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
        boolean z = ((FinderFavFeedLoader) baseFinderFeedLoader).f13522j == 0;
        View loadMoreFooter = this.f30220j.getLoadMoreFooter();
        int i = 8;
        View view = null;
        if (!(loadMoreFooter == null || (textView = (TextView) loadMoreFooter.findViewById(C0966R.C0970id.g2t)) == null)) {
            if (z) {
                BaseFinderFeedLoader baseFinderFeedLoader2 = mo10348I0().f30175e;
                C87412m.m108592e(baseFinderFeedLoader2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader");
                int i2 = ((FinderFavFeedLoader) baseFinderFeedLoader2).f13519g;
                String b = C15587j.f42215a.mo14350b("FinderObjectDynamicItemKey_FinderFavFeedFooterHint");
                if (b != null) {
                    str = String.format(b, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                    C87412m.m108593f(str, "format(format, *args)");
                } else {
                    str = null;
                }
                if (str == null) {
                    str = textView.getContext().getResources().getString(C0966R.string.d8c, new Object[]{Integer.valueOf(i2)});
                }
                textView.setText(str);
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        View loadMoreFooter2 = this.f30220j.getLoadMoreFooter();
        if (loadMoreFooter2 != null) {
            view = loadMoreFooter2.findViewById(C0966R.C0970id.g2s);
        }
        if (view != null) {
            if (!z) {
                i = 0;
            }
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderFavFeedUIContract$FavFeedViewCallback", "refreshFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: d */
    public void mo9297d(ArrayList<C0740i2> arrayList) {
        C58556f j3;
        C87412m.m108594g(arrayList, "data");
        super.mo9297d(arrayList);
        TextView textView = (TextView) mo10357y(C0966R.C0970id.cj7);
        if (textView != null) {
            String b = C15587j.f42215a.mo14350b("FinderObjectDynamicItemKey_FinderFavEmptyTips");
            if (b == null) {
                b = this.f30214d.getString(C0966R.string.d89);
            }
            textView.setText(b);
        }
        C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(this.f30179u).mo62449e(C13442s8.class);
        if (s8Var != null && (j3 = s8Var.mo12854j3(-1)) != null) {
            j3.mo83455c(getRecyclerView());
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f30214d;
    }

    /* renamed from: k0 */
    public String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        E e = cVar.f24949d;
        if (e == null || !(e instanceof Integer)) {
            return null;
        }
        Resources resources = this.f30214d.getResources();
        E e2 = cVar.f24949d;
        C87412m.m108592e(e2, "null cannot be cast to non-null type kotlin.Int");
        return resources.getString(C0966R.string.d8j, new Object[]{(Integer) e2});
    }

    /* renamed from: m0 */
    public View mo9299m0() {
        View y = mo10357y(C0966R.C0970id.cjg);
        if (y instanceof View) {
            return y;
        }
        return null;
    }
}

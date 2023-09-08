package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IListener;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kf1.C10040x3;
import kf1.C10054y3;
import kf1.C9732g;
import kf1.C9753h;
import kotlin.Metadata;
import rs1.C13317l7;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110826x0;
import tf1.C13908i;
import tf1.C13913l;
import vp1.C14937o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lkf1/y3;", "Lkf1/x3;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment */
public final class FinderLikeFeedGridFragment extends FinderBaseGridFeedFragment<C10054y3, C10040x3> {

    /* renamed from: r */
    public C10040x3 f17336r;

    /* renamed from: s */
    public C10054y3 f17337s;

    /* renamed from: t */
    public FinderLikedFeedLoader f17338t;

    /* renamed from: u */
    public final int f17339u = 2;

    /* renamed from: v */
    public IListener<FeedUpdateEvent> f17340v;

    /* renamed from: w */
    public HashSet<Long> f17341w;

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment$a */
    public static final class C3818a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderLikeFeedGridFragment f17342a;

        public C3818a(FinderLikeFeedGridFragment finderLikeFeedGridFragment) {
            this.f17342a = finderLikeFeedGridFragment;
        }

        public void call(int i) {
            C10054y3 y3Var = this.f17342a.f17337s;
            if (y3Var != null) {
                View m0 = y3Var.mo9299m0();
                if (m0 != null) {
                    FinderLikeFeedGridFragment finderLikeFeedGridFragment = this.f17342a;
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C10054y3 y3Var2 = finderLikeFeedGridFragment.f17337s;
                    if (y3Var2 != null) {
                        RecyclerView recyclerView = y3Var2.getRecyclerView();
                        if (recyclerView != null) {
                            recyclerView.setVisibility(0);
                        }
                        new FeedUpdateEvent().publish();
                        return;
                    }
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment$b */
    public static final class C3819b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeFeedGridFragment f17343d;

        /* renamed from: e */
        public final /* synthetic */ FinderLikedFeedLoader f17344e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3819b(FinderLikeFeedGridFragment finderLikeFeedGridFragment, FinderLikedFeedLoader finderLikedFeedLoader) {
            super(0);
            this.f17343d = finderLikeFeedGridFragment;
            this.f17344e = finderLikedFeedLoader;
        }

        public Object invoke() {
            TextView textView;
            FinderLikeFeedGridFragment finderLikeFeedGridFragment = this.f17343d;
            C10054y3 y3Var = finderLikeFeedGridFragment.f17337s;
            if (y3Var != null) {
                y3Var.f30220j.setEnableLoadMore(finderLikeFeedGridFragment.mo4183d0().getSize() > 10);
                if (this.f17344e.f13708e > 0) {
                    C10054y3 y3Var2 = this.f17343d.f17337s;
                    if (y3Var2 != null) {
                        View loadMoreFooter = y3Var2.f30220j.getLoadMoreFooter();
                        View findViewById = loadMoreFooter != null ? loadMoreFooter.findViewById(C0966R.C0970id.g2s) : null;
                        if (findViewById != null) {
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view = findViewById;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C10054y3 y3Var3 = this.f17343d.f17337s;
                        if (y3Var3 != null) {
                            View loadMoreFooter2 = y3Var3.f30220j.getLoadMoreFooter();
                            if (!(loadMoreFooter2 == null || (textView = (TextView) loadMoreFooter2.findViewById(C0966R.C0970id.g2t)) == null)) {
                                FinderLikedFeedLoader finderLikedFeedLoader = this.f17344e;
                                textView.setVisibility(0);
                                textView.setText(textView.getContext().getResources().getString(C0966R.string.n_i, new Object[]{Integer.valueOf(finderLikedFeedLoader.f13708e)}));
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
                    C10054y3 y3Var4 = this.f17343d.f17337s;
                    if (y3Var4 != null) {
                        View loadMoreFooter3 = y3Var4.f30220j.getLoadMoreFooter();
                        View findViewById2 = loadMoreFooter3 != null ? loadMoreFooter3.findViewById(C0966R.C0970id.g2s) : null;
                        if (findViewById2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = findViewById2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/ui/fragment/FinderLikeFeedGridFragment$initOnCreate$1$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        C10054y3 y3Var5 = this.f17343d.f17337s;
                        if (y3Var5 != null) {
                            View loadMoreFooter4 = y3Var5.f30220j.getLoadMoreFooter();
                            TextView textView2 = loadMoreFooter4 != null ? (TextView) loadMoreFooter4.findViewById(C0966R.C0970id.g2t) : null;
                            if (textView2 != null) {
                                textView2.setVisibility(8);
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
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment$c */
    public static final class C3820c extends C87413o implements C32226l<FinderLikedFeedLoader.C2712b, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeFeedGridFragment f17345d;

        /* renamed from: e */
        public final /* synthetic */ FinderLikedFeedLoader f17346e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3820c(FinderLikeFeedGridFragment finderLikeFeedGridFragment, FinderLikedFeedLoader finderLikedFeedLoader) {
            super(1);
            this.f17345d = finderLikeFeedGridFragment;
            this.f17346e = finderLikedFeedLoader;
        }

        /* JADX WARNING: type inference failed for: r6v13, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r6) {
            /*
                r5 = this;
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader$b r6 = (com.tencent.p014mm.plugin.finder.feed.model.FinderLikedFeedLoader.C2712b) r6
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r6, r0)
                int r6 = r6.f13713a
                if (r6 == 0) goto L_0x0056
                com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment r6 = r5.f17345d
                kf1.y3 r6 = r6.f17337s
                r0 = 0
                if (r6 == 0) goto L_0x004f
                android.view.View r6 = r6.f30225r
                if (r6 == 0) goto L_0x0020
                r0 = 2131300828(0x7f0911dc, float:1.8219697E38)
                android.view.View r6 = r6.findViewById(r0)
                r0 = r6
                android.widget.TextView r0 = (android.widget.TextView) r0
            L_0x0020:
                if (r0 != 0) goto L_0x0023
                goto L_0x0045
            L_0x0023:
                com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment r6 = r5.f17345d
                com.tencent.mm.ui.MMActivity r6 = r6.mo4171V()
                android.content.res.Resources r6 = r6.getResources()
                r1 = 2131826531(0x7f111763, float:1.928595E38)
                r2 = 1
                java.lang.Object[] r2 = new java.lang.Object[r2]
                r3 = 0
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader r4 = r5.f17346e
                int r4 = r4.f13708e
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r2[r3] = r4
                java.lang.String r6 = r6.getString(r1, r2)
                r0.setText(r6)
            L_0x0045:
                com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment r6 = r5.f17345d
                com.tencent.mm.plugin.finder.feed.model.FinderLikedFeedLoader r0 = r5.f17346e
                int r0 = r0.f13708e
                r6.mo4175a0(r0)
                goto L_0x0056
            L_0x004f:
                java.lang.String r6 = "viewCallback"
                gy3.C87412m.m108603p(r6)
                throw r0
            L_0x0056:
                rx3.b0 r6 = rx3.C13598b0.f38549a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderLikeFeedGridFragment.C3820c.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment$d */
    public static final class C3821d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLikeFeedGridFragment f17347d;

        public C3821d(FinderLikeFeedGridFragment finderLikeFeedGridFragment) {
            this.f17347d = finderLikeFeedGridFragment;
        }

        /* JADX WARNING: type inference failed for: r14v4, types: [com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onMenuItemClick(android.view.MenuItem r14) {
            /*
                r13 = this;
                com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment r14 = r13.f17347d
                kf1.x3 r14 = r14.f17336r
                r0 = 0
                if (r14 == 0) goto L_0x0049
                com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r14 = r14.f30175e
                boolean r1 = r14 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader
                if (r1 == 0) goto L_0x0010
                r0 = r14
                com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r0 = (com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader) r0
            L_0x0010:
                if (r0 == 0) goto L_0x0016
                java.util.ArrayList<te3.sn1> r14 = r0.f13523n
                if (r14 != 0) goto L_0x001b
            L_0x0016:
                java.util.ArrayList r14 = new java.util.ArrayList
                r14.<init>()
            L_0x001b:
                android.content.Intent r12 = new android.content.Intent
                r12.<init>()
                rs1.s8$a r0 = rs1.C13442s8.f38060Q0
                com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment r1 = r13.f17347d
                com.tencent.mm.ui.MMActivity r1 = r1.mo4171V()
                r3 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 252(0xfc, float:3.53E-43)
                r11 = 0
                r2 = r12
                rs1.C13442s8.C13443a.m12791e(r0, r1, r2, r3, r5, r6, r7, r8, r9, r10, r11)
                java.lang.Class<er1.b> r0 = er1.C58684b.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                er1.b r0 = (er1.C58684b) r0
                com.tencent.mm.plugin.finder.ui.fragment.FinderLikeFeedGridFragment r1 = r13.f17347d
                com.tencent.mm.ui.MMActivity r1 = r1.mo4171V()
                r2 = 1
                r0.Mx0(r1, r12, r2, r14)
                return r2
            L_0x0049:
                java.lang.String r14 = "presenter"
                gy3.C87412m.m108603p(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderLikeFeedGridFragment.C3821d.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    public FinderLikeFeedGridFragment() {
        this.f17334o = 102;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C13317l7.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        return 35;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4178T() {
        /*
            r14 = this;
            kf1.x3 r0 = r14.f17336r
            r1 = 0
            if (r0 == 0) goto L_0x0043
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r0.f30175e
            boolean r2 = r0 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader
            if (r2 == 0) goto L_0x000e
            r1 = r0
            com.tencent.mm.plugin.finder.feed.model.FinderFavFeedLoader r1 = (com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader) r1
        L_0x000e:
            if (r1 == 0) goto L_0x0014
            java.util.ArrayList<te3.sn1> r0 = r1.f13523n
            if (r0 != 0) goto L_0x0019
        L_0x0014:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0019:
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            rs1.s8$a r1 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r2 = r14.mo4171V()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 252(0xfc, float:3.53E-43)
            r12 = 0
            r3 = r13
            rs1.C13442s8.C13443a.m12791e(r1, r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            java.lang.Class<er1.b> r1 = er1.C58684b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            er1.b r1 = (er1.C58684b) r1
            com.tencent.mm.ui.MMActivity r2 = r14.mo4171V()
            r3 = 4
            r1.Mx0(r2, r13, r3, r0)
            return
        L_0x0043:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderLikeFeedGridFragment.mo4178T():void");
    }

    /* renamed from: U */
    public int mo4179U() {
        return 3;
    }

    /* renamed from: X */
    public C9732g mo4172X() {
        C10040x3 x3Var = this.f17336r;
        if (x3Var != null) {
            return x3Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: Y */
    public C9753h mo4173Y() {
        C10054y3 y3Var = this.f17337s;
        if (y3Var != null) {
            return y3Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: Z */
    public void mo4174Z(View view) {
        C87412m.m108594g(view, "view");
        this.f17341w = new HashSet<>();
        mo4175a0(0);
        FinderLikedFeedLoader finderLikedFeedLoader = new FinderLikedFeedLoader(false, C13908i.FEED_LIKED_TIMELINE, ((C13442s8) C39818r.f106831a.mo62444c(mo4171V()).mo75002a(C13442s8.class)).mo12861q3());
        finderLikedFeedLoader.setInitDone(new C3818a(this));
        finderLikedFeedLoader.f13710g = new C3819b(this, finderLikedFeedLoader);
        finderLikedFeedLoader.f13711h = new C3820c(this, finderLikedFeedLoader);
        this.f17338t = finderLikedFeedLoader;
        MMActivity V = mo4171V();
        int i = this.f17339u;
        MMActivity V2 = mo4171V();
        MMFinderUI mMFinderUI = V2 instanceof MMFinderUI ? (MMFinderUI) V2 : null;
        this.f17336r = new C10040x3(V, this, i, mMFinderUI != null ? mMFinderUI.mo2194I7() : 0, mo4183d0());
        MMActivity V3 = mo4171V();
        int i2 = this.f17339u;
        MMActivity V4 = mo4171V();
        MMFinderUI mMFinderUI2 = V4 instanceof MMFinderUI ? (MMFinderUI) V4 : null;
        C10054y3 y3Var = new C10054y3(V3, this, i2, mMFinderUI2 != null ? mMFinderUI2.mo2194I7() : 0, false, 16, (C8480h) null);
        this.f17337s = y3Var;
        C10040x3 x3Var = this.f17336r;
        if (x3Var != null) {
            y3Var.mo10355Y0(x3Var);
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.cj7);
            if (textView != null) {
                textView.setText(mo4171V().getString(C0966R.string.fo8));
            }
            FinderLikeFeedGridFragment$initOnCreate$2 finderLikeFeedGridFragment$initOnCreate$2 = new FinderLikeFeedGridFragment$initOnCreate$2(this, C40008f.f107254d);
            this.f17340v = finderLikeFeedGridFragment$initOnCreate$2;
            finderLikeFeedGridFragment$initOnCreate$2.alive();
            mo4171V().addIconOptionMenu(0, (int) C0966R.string.m_x, (int) C0966R.raw.icons_outlined_search, (MenuItem.OnMenuItemClickListener) new C3821d(this));
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: a0 */
    public void mo4175a0(int i) {
        if (i > 0) {
            int dimension = (int) getResources().getDimension(C0966R.dimen.f3743cv);
            C58784w3 w3Var = C58784w3.f168295a;
            Integer b0 = w3Var.mo83917b0(1, true);
            int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
            MMActivity V = mo4171V();
            String string = mo4171V().getResources().getString(C0966R.string.fob, new Object[]{String.valueOf(i)});
            C87412m.m108593f(string, "activity.resources.getSt…le_new, count.toString())");
            mo4171V().setMMTitle(w3Var.mo83957q1(V, string, '#', intValue, C0966R.color.FG_0, dimension, dimension));
        } else {
            int dimension2 = (int) getResources().getDimension(C0966R.dimen.f3743cv);
            C58784w3 w3Var2 = C58784w3.f168295a;
            Integer b05 = w3Var2.mo83917b0(1, true);
            int intValue2 = b05 != null ? b05.intValue() : C0966R.raw.icons_filled_channels_like_bold;
            MMActivity V2 = mo4171V();
            String string2 = mo4171V().getResources().getString(C0966R.string.foc);
            C87412m.m108593f(string2, "activity.resources.getSt…like_feed_title_zero_new)");
            mo4171V().setMMTitle(w3Var2.mo83957q1(V2, string2, '#', intValue2, C0966R.color.FG_0, dimension2, dimension2));
        }
        TextView mMTitleView = mo4171V().getMMTitleView();
        if (mMTitleView != null) {
            mMTitleView.setContentDescription(mo4171V().getString(C0966R.string.ee9));
        }
        super.mo4175a0(i);
    }

    /* renamed from: d0 */
    public final FinderLikedFeedLoader mo4183d0() {
        FinderLikedFeedLoader finderLikedFeedLoader = this.f17338t;
        if (finderLikedFeedLoader != null) {
            return finderLikedFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adh;
    }

    public void onDestroy() {
        IListener<FeedUpdateEvent> iListener = this.f17340v;
        if (iListener != null) {
            iListener.dead();
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        HashSet<Long> hashSet = this.f17341w;
        if (hashSet != null) {
            for (Number longValue : hashSet) {
                long longValue2 = longValue.longValue();
                mo4183d0().remove(longValue2, true);
                C14937o.f40972a.mo13984e(longValue2, 2);
                if (mo4183d0().getSize() == 0) {
                    C10054y3 y3Var = this.f17337s;
                    if (y3Var != null) {
                        y3Var.mo10335Z0();
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
            }
        }
        mo4175a0(mo4183d0().f13708e);
    }
}

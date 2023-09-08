package com.tencent.p014mm.plugin.finder.p056ui.fragment;

import android.graphics.Bitmap;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FeedUpdateEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.FinderFavFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import er1.C58784w3;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import j20.C117292a;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import kf1.C9712f1;
import kf1.C9732g;
import kf1.C9734g1;
import kf1.C9753h;
import kotlin.Metadata;
import l60.C99344b;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import r60.C101350i;
import rs1.C13317l7;
import rs1.C13442s8;
import rx3.C13598b0;
import sx3.C110826x0;
import t60.C64207e;
import te3.C48996cf1;
import tf1.C13913l;
import up1.C27696y;
import up1.C37521f;
import vp1.C14937o;
import wp1.C15587j;
import x60.C102564a;
import zc1.C66785b;
import zt3.C119157j;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderBaseGridFeedFragment;", "Lkf1/g1;", "Lkf1/f1;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment */
public final class FinderFavFeedFragment extends FinderBaseGridFeedFragment<C9734g1, C9712f1> {

    /* renamed from: r */
    public C9712f1 f17312r;

    /* renamed from: s */
    public C9734g1 f17313s;

    /* renamed from: t */
    public FinderFavFeedLoader f17314t;

    /* renamed from: u */
    public final int f17315u = 2;

    /* renamed from: v */
    public IListener<FeedUpdateEvent> f17316v;

    /* renamed from: w */
    public HashSet<Long> f17317w;

    /* renamed from: x */
    public boolean f17318x;

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$a */
    public static final class C3809a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderFavFeedFragment f17319a;

        /* renamed from: b */
        public final /* synthetic */ FinderFavFeedLoader f17320b;

        public C3809a(FinderFavFeedFragment finderFavFeedFragment, FinderFavFeedLoader finderFavFeedLoader) {
            this.f17319a = finderFavFeedFragment;
            this.f17320b = finderFavFeedLoader;
        }

        public void call(int i) {
            try {
                C9734g1 g1Var = this.f17319a.f17313s;
                if (g1Var != null) {
                    View m0 = g1Var.mo9299m0();
                    if (m0 != null) {
                        FinderFavFeedFragment finderFavFeedFragment = this.f17319a;
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment$initOnCreate$1$1", "call", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        C9734g1 g1Var2 = finderFavFeedFragment.f17313s;
                        if (g1Var2 != null) {
                            RecyclerView recyclerView = g1Var2.getRecyclerView();
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
            } catch (IllegalStateException e) {
                Log.printErrStackTrace(this.f17320b.getTAG(), e, "view illegal stat", new Object[0]);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$b */
    public static final class C3810b extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFavFeedFragment f17321d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3810b(FinderFavFeedFragment finderFavFeedFragment) {
            super(1);
            this.f17321d = finderFavFeedFragment;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            if (this.f17321d.mo4180d0().f13519g != 0) {
                C9734g1 g1Var = this.f17321d.f17313s;
                if (g1Var != null) {
                    View view = g1Var.f30225r;
                    TextView textView = view != null ? (TextView) view.findViewById(C0966R.C0970id.f357845c22) : null;
                    if (textView != null) {
                        textView.setText(this.f17321d.mo4171V().getResources().getString(C0966R.string.d8j, new Object[]{Integer.valueOf(this.f17321d.mo4180d0().f13519g)}));
                    }
                    FinderFavFeedFragment finderFavFeedFragment = this.f17321d;
                    finderFavFeedFragment.mo4175a0(finderFavFeedFragment.mo4180d0().f13519g);
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            if (!((FinderFavFeedLoader.C2659b) iResponse).getHasMore()) {
                C9734g1 g1Var2 = this.f17321d.f17313s;
                if (g1Var2 != null) {
                    g1Var2.mo10336b1();
                    this.f17321d.f17318x = true;
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$c */
    public static final class C3811c extends C9734g1 {

        /* renamed from: w */
        public final /* synthetic */ View f17322w;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3811c(FinderFavFeedFragment finderFavFeedFragment, View view, MMActivity mMActivity, int i, int i2) {
            super(mMActivity, finderFavFeedFragment, i, i2, false, 16, (C8480h) null);
            this.f17322w = view;
        }

        /* renamed from: b */
        public View mo4181b() {
            return this.f17322w;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$d */
    public static final class C3812d implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderFavFeedFragment f17323d;

        public C3812d(FinderFavFeedFragment finderFavFeedFragment) {
            this.f17323d = finderFavFeedFragment;
        }

        /* JADX WARNING: type inference failed for: r14v4, types: [com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onMenuItemClick(android.view.MenuItem r14) {
            /*
                r13 = this;
                com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment r14 = r13.f17323d
                kf1.f1 r14 = r14.f17312r
                r0 = 0
                if (r14 == 0) goto L_0x004a
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
                com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment r1 = r13.f17323d
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
                com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment r1 = r13.f17323d
                com.tencent.mm.ui.MMActivity r1 = r1.mo4171V()
                r2 = 2
                r0.Mx0(r1, r12, r2, r14)
                r14 = 1
                return r14
            L_0x004a:
                java.lang.String r14 = "presenter"
                gy3.C87412m.m108603p(r14)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFavFeedFragment.C3812d.onMenuItemClick(android.view.MenuItem):boolean");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$e */
    public static final class C3813e<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ FinderFavFeedFragment f17324a;

        /* renamed from: b */
        public final /* synthetic */ int f17325b;

        public C3813e(FinderFavFeedFragment finderFavFeedFragment, int i) {
            this.f17324a = finderFavFeedFragment;
            this.f17325b = i;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C3824b((Bitmap) obj, this.f17324a, this.f17325b));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.fragment.FinderFavFeedFragment$f */
    public static final class C3814f<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ FinderFavFeedFragment f17326a;

        public C3814f(FinderFavFeedFragment finderFavFeedFragment) {
            this.f17326a = finderFavFeedFragment;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            ((C119157j) C119157j.f356862d).mo183895z(new C3825c((Bitmap) obj, this.f17326a));
        }
    }

    public FinderFavFeedFragment() {
        this.f17334o = 100;
    }

    /* renamed from: L */
    public Set<Class<? extends UIComponent>> mo2201L() {
        return C110826x0.m151017e(C13442s8.class, C13317l7.class);
    }

    /* renamed from: R */
    public int mo2203R() {
        C37521f.f99374d.getClass();
        return C37521f.f99504r6.mo60266n().intValue() == 1 ? 163 : 24;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo4178T() {
        /*
            r14 = this;
            kf1.f1 r0 = r14.f17312r
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFavFeedFragment.mo4178T():void");
    }

    /* renamed from: U */
    public int mo4179U() {
        return 3;
    }

    /* renamed from: X */
    public C9732g mo4172X() {
        C9712f1 f1Var = this.f17312r;
        if (f1Var != null) {
            return f1Var;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: Y */
    public C9753h mo4173Y() {
        C9734g1 g1Var = this.f17313s;
        if (g1Var != null) {
            return g1Var;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    /* renamed from: Z */
    public void mo4174Z(View view) {
        C87412m.m108594g(view, "view");
        this.f17317w = new HashSet<>();
        mo4175a0(0);
        FinderFavFeedLoader finderFavFeedLoader = new FinderFavFeedLoader(C66785b.f191882e.mo90662O5(), ((C13442s8) C39818r.f106831a.mo62444c(mo4171V()).mo75002a(C13442s8.class)).mo12861q3(), false);
        finderFavFeedLoader.setInitDone(new C3809a(this, finderFavFeedLoader));
        finderFavFeedLoader.f13518f = new C3810b(this);
        this.f17314t = finderFavFeedLoader;
        MMActivity V = mo4171V();
        int i = this.f17315u;
        MMActivity V2 = mo4171V();
        MMFinderUI mMFinderUI = V2 instanceof MMFinderUI ? (MMFinderUI) V2 : null;
        this.f17312r = new C9712f1(V, this, i, mMFinderUI != null ? mMFinderUI.mo2194I7() : 0, mo4180d0());
        MMActivity V3 = mo4171V();
        int i2 = this.f17315u;
        MMActivity V4 = mo4171V();
        MMFinderUI mMFinderUI2 = V4 instanceof MMFinderUI ? (MMFinderUI) V4 : null;
        C3811c cVar = new C3811c(this, view, V3, i2, mMFinderUI2 != null ? mMFinderUI2.mo2194I7() : 0);
        this.f17313s = cVar;
        C9712f1 f1Var = this.f17312r;
        if (f1Var != null) {
            cVar.mo10355Y0(f1Var);
            FinderFavFeedFragment$initOnCreate$3 finderFavFeedFragment$initOnCreate$3 = new FinderFavFeedFragment$initOnCreate$3(this, C40008f.f107254d);
            this.f17316v = finderFavFeedFragment$initOnCreate$3;
            finderFavFeedFragment$initOnCreate$3.alive();
            mo4171V().addIconOptionMenu(0, (int) C0966R.string.m_x, (int) C0966R.raw.icons_outlined_search, (MenuItem.OnMenuItemClickListener) new C3812d(this));
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: a0 */
    public void mo4175a0(int i) {
        String str;
        C11978e0.C11979a aVar = C11978e0.C11979a.FAV_ICON;
        C27696y yVar = C27696y.RAW_IMAGE;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C48996cf1 a = C15587j.f42215a.mo14349a("FinderObjectDynamicImageKey_FinderFavOffBoldIcon");
        if (a == null || (str = a.f131694e) == null) {
            str = "";
        }
        if (i > 0) {
            if (Util.isNullOrNil(str)) {
                int dimension = (int) mo4171V().getResources().getDimension(C0966R.dimen.f3743cv);
                C58784w3 w3Var = C58784w3.f168295a;
                MMActivity V = mo4171V();
                String string = mo4171V().getString(C0966R.string.fno, new Object[]{Integer.valueOf(i)});
                C87412m.m108593f(string, "activity.getString(R.str…v_feed_title2_new, count)");
                mo4171V().setMMTitle(w3Var.mo83957q1(V, string, '#', C0966R.raw.icons_outlined_star_new_bold, C0966R.color.FG_0, dimension, dimension));
            } else {
                C99344b<C100810g0, Bitmap> b = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, yVar), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
                C3813e eVar = new C3813e(this, i);
                b.getClass();
                b.f291320d = eVar;
                b.mo85953c();
            }
        } else if (Util.isNullOrNil(str)) {
            int dimension2 = (int) mo4171V().getResources().getDimension(C0966R.dimen.f3743cv);
            C58784w3 w3Var2 = C58784w3.f168295a;
            MMActivity V2 = mo4171V();
            String string2 = mo4171V().getString(C0966R.string.fnn);
            C87412m.m108593f(string2, "activity.getString(com.t…ring.finder_fav_feed_new)");
            mo4171V().setMMTitle(w3Var2.mo83957q1(V2, string2, '#', C0966R.raw.icons_outlined_star_new_bold, C0966R.color.FG_0, dimension2, dimension2));
        } else {
            C99344b<C100810g0, Bitmap> b2 = ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str, yVar), ((C11990s0) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            C3814f fVar = new C3814f(this);
            b2.getClass();
            b2.f291320d = fVar;
            b2.mo85953c();
        }
        TextView mMTitleView = mo4171V().getMMTitleView();
        if (mMTitleView != null) {
            mMTitleView.setContentDescription(mo4171V().getString(C0966R.string.d8g));
        }
        super.mo4175a0(i);
    }

    /* renamed from: d0 */
    public final FinderFavFeedLoader mo4180d0() {
        FinderFavFeedLoader finderFavFeedLoader = this.f17314t;
        if (finderFavFeedLoader != null) {
            return finderFavFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_u;
    }

    public void onDestroy() {
        IListener<FeedUpdateEvent> iListener = this.f17316v;
        if (iListener != null) {
            iListener.dead();
        }
        super.onDestroy();
    }

    public void onResume() {
        super.onResume();
        HashSet<Long> hashSet = this.f17317w;
        int i = 0;
        if (hashSet != null) {
            for (Number longValue : hashSet) {
                long longValue2 = longValue.longValue();
                mo4180d0().remove(longValue2, true);
                C14937o.f40972a.mo13984e(longValue2, 10);
                if (mo4180d0().getSize() == 0) {
                    C9734g1 g1Var = this.f17313s;
                    if (g1Var != null) {
                        g1Var.mo10335Z0();
                        C9734g1 g1Var2 = this.f17313s;
                        if (g1Var2 != null) {
                            View loadMoreFooter = g1Var2.f30220j.getLoadMoreFooter();
                            if (loadMoreFooter != null) {
                                C9556a aVar = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar.mo10233c(4);
                                C117292a.m165358d(loadMoreFooter, aVar.mo10232b(), "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment", "checkEmptyOnUnFav", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                loadMoreFooter.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                C117292a.m165359e(loadMoreFooter, "com/tencent/mm/plugin/finder/ui/fragment/FinderFavFeedFragment", "checkEmptyOnUnFav", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            }
        }
        HashSet<Long> hashSet2 = this.f17317w;
        if (hashSet2 != null) {
            i = hashSet2.size();
        }
        if (i > 0) {
            C9734g1 g1Var3 = this.f17313s;
            if (g1Var3 != null) {
                g1Var3.mo10336b1();
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
        mo4175a0(mo4180d0().f13519g);
        if (this.f17318x) {
            C9734g1 g1Var4 = this.f17313s;
            if (g1Var4 != null) {
                g1Var4.mo10336b1();
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }
}

package hp1;

import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import com.google.android.material.appbar.AppBarLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.search.FinderMixSearchPresenter;
import com.tencent.p014mm.plugin.finder.search.p055ui.FinderMixSearchFeedFragment;
import com.tencent.p014mm.plugin.finder.view.FinderRefreshLayout;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.view.refreshloader.FinderLoaderMoreFooter;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import ef1.C58556f;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60191o5;
import ip1.C60571a;
import j20.C117292a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jp1.C9485a;
import k20.C60958c;
import k20.C9556a;
import oq3.C21804c;
import qq3.C63318b;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C64186f0;
import te3.C48868bk1;
import ve1.C14663v7;

/* renamed from: hp1.r0 */
public final class C8684r0 implements C8676n0 {

    /* renamed from: d */
    public MMActivity f27878d;

    /* renamed from: e */
    public C8674m0 f27879e;

    /* renamed from: f */
    public int f27880f;

    /* renamed from: g */
    public final String f27881g = "Finder.FinderMixSearchViewCallback";

    /* renamed from: h */
    public FinderRefreshLayout f27882h;

    /* renamed from: i */
    public FinderRefreshLayout f27883i;

    /* renamed from: j */
    public TextView f27884j;

    /* renamed from: n */
    public View f27885n;

    /* renamed from: o */
    public View f27886o;

    /* renamed from: p */
    public final C13601g f27887p;

    /* renamed from: q */
    public View f27888q;

    /* renamed from: r */
    public RecyclerView f27889r;

    /* renamed from: s */
    public RecyclerView f27890s;

    /* renamed from: hp1.r0$b */
    public final class C8686b extends RecyclerView.C0129l {

        /* renamed from: d */
        public final int f27893d;

        public C8686b(int i) {
            this.f27893d = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x007e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0089  */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo21g(android.graphics.Rect r8, android.view.View r9, androidx.recyclerview.widget.RecyclerView r10, androidx.recyclerview.widget.RecyclerView.C16628w r11) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                r0.add(r9)
                r0.add(r10)
                r0.add(r11)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$SpacesItemDecoration"
                java.lang.String r2 = "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$SpacesItemDecorationandroidx/recyclerview/widget/RecyclerView$ItemDecoration"
                java.lang.String r3 = "getItemOffsets"
                java.lang.String r4 = "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.String r0 = "outRect"
                gy3.C87412m.m108594g(r8, r0)
                java.lang.String r0 = "view"
                gy3.C87412m.m108594g(r9, r0)
                java.lang.String r0 = "parent"
                gy3.C87412m.m108594g(r10, r0)
                java.lang.String r0 = "state"
                gy3.C87412m.m108594g(r11, r0)
                int r9 = r10.mo17029N0(r9)
                hp1.r0 r10 = hp1.C8684r0.this
                androidx.recyclerview.widget.RecyclerView r10 = r10.f27889r
                r11 = 0
                if (r10 == 0) goto L_0x004a
                androidx.recyclerview.widget.RecyclerView$e r10 = r10.getAdapter()
                goto L_0x004b
            L_0x004a:
                r10 = r11
            L_0x004b:
                gy3.C87412m.m108591d(r10)
                int r10 = r10.getItemCount()
                int r10 = r10 + -1
                r0 = 0
                if (r9 == r10) goto L_0x0070
                hp1.r0 r10 = hp1.C8684r0.this
                androidx.recyclerview.widget.RecyclerView r10 = r10.f27889r
                if (r10 == 0) goto L_0x0061
                androidx.recyclerview.widget.RecyclerView$e r11 = r10.getAdapter()
            L_0x0061:
                gy3.C87412m.m108591d(r11)
                int r10 = r11.getItemCount()
                int r10 = r10 + -2
                if (r9 != r10) goto L_0x006d
                goto L_0x0070
            L_0x006d:
                r8.bottom = r0
                goto L_0x0076
            L_0x0070:
                int r10 = r7.f27893d
                int r10 = r10 * 2
                r8.bottom = r10
            L_0x0076:
                hp1.r0 r10 = hp1.C8684r0.this
                int r10 = hp1.C8684r0.m8518p(r10)
                if (r10 != 0) goto L_0x0089
                if (r9 != 0) goto L_0x0099
                r8.right = r0
                r8.top = r0
                r8.left = r0
                r8.bottom = r0
                goto L_0x0099
            L_0x0089:
                hp1.r0 r10 = hp1.C8684r0.this
                int r10 = hp1.C8684r0.m8518p(r10)
                if (r9 > r10) goto L_0x0099
                r8.right = r0
                r8.top = r0
                r8.left = r0
                r8.bottom = r0
            L_0x0099:
                java.lang.String r8 = "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$SpacesItemDecoration"
                java.lang.String r9 = "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$SpacesItemDecorationandroidx/recyclerview/widget/RecyclerView$ItemDecoration"
                java.lang.String r10 = "getItemOffsets"
                java.lang.String r11 = "(Landroid/graphics/Rect;Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$State;)V"
                j20.C117292a.m165361g(r7, r8, r9, r10, r11)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hp1.C8684r0.C8686b.mo21g(android.graphics.Rect, android.view.View, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$w):void");
        }
    }

    /* renamed from: hp1.r0$c */
    public static final class C8687c extends C87413o implements C32224a<AppBarLayout> {

        /* renamed from: d */
        public final /* synthetic */ C8684r0 f27895d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8687c(C8684r0 r0Var) {
            super(0);
            this.f27895d = r0Var;
        }

        public Object invoke() {
            return (AppBarLayout) this.f27895d.f27878d.findViewById(C0966R.C0970id.f6070wg);
        }
    }

    /* renamed from: hp1.r0$d */
    public static final class C8688d implements C63318b {

        /* renamed from: a */
        public final /* synthetic */ C8684r0 f27896a;

        public C8688d(C8684r0 r0Var) {
            this.f27896a = r0Var;
        }

        /* renamed from: a */
        public void mo3374a(boolean z) {
        }

        public void onLoadMore() {
            View view;
            View view2;
            View view3;
            TextView textView;
            View view4;
            View view5;
            View view6;
            TextView textView2;
            View view7;
            View view8;
            View view9;
            TextView textView3;
            View view10;
            View view11;
            View view12;
            TextView textView4;
            C13604l<Boolean, Boolean> R0 = this.f27896a.f27879e.mo3907R0(-1);
            boolean booleanValue = ((Boolean) R0.f38555d).booleanValue();
            if (((Boolean) R0.f38556e).booleanValue()) {
                if (booleanValue) {
                    C21804c loadMoreFooter = this.f27896a.f27882h.getLoadMoreFooter();
                    View view13 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
                    if (view13 != null) {
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(0);
                        C117292a.m165358d(view13, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view13.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C21804c loadMoreFooter2 = this.f27896a.f27882h.getLoadMoreFooter();
                    if (!(loadMoreFooter2 == null || (view12 = loadMoreFooter2.getView()) == null || (textView4 = (TextView) view12.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView4.setText(C0966R.string.eas);
                    }
                    C21804c loadMoreFooter3 = this.f27896a.f27882h.getLoadMoreFooter();
                    TextView textView5 = (loadMoreFooter3 == null || (view11 = loadMoreFooter3.getView()) == null) ? null : (TextView) view11.findViewById(C0966R.C0970id.g2t);
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                    C21804c loadMoreFooter4 = this.f27896a.f27882h.getLoadMoreFooter();
                    View findViewById = (loadMoreFooter4 == null || (view10 = loadMoreFooter4.getView()) == null) ? null : view10.findViewById(C0966R.C0970id.g2s);
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view14 = findViewById;
                        C117292a.m165358d(view14, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C21804c loadMoreFooter5 = this.f27896a.f27883i.getLoadMoreFooter();
                    View view15 = loadMoreFooter5 != null ? loadMoreFooter5.getView() : null;
                    if (view15 != null) {
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                        aVar3.mo10233c(0);
                        View view16 = view15;
                        C117292a.m165358d(view16, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view15.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C21804c loadMoreFooter6 = this.f27896a.f27883i.getLoadMoreFooter();
                    if (!(loadMoreFooter6 == null || (view9 = loadMoreFooter6.getView()) == null || (textView3 = (TextView) view9.findViewById(C0966R.C0970id.g2t)) == null)) {
                        textView3.setText(C0966R.string.eas);
                    }
                    C21804c loadMoreFooter7 = this.f27896a.f27883i.getLoadMoreFooter();
                    TextView textView6 = (loadMoreFooter7 == null || (view8 = loadMoreFooter7.getView()) == null) ? null : (TextView) view8.findViewById(C0966R.C0970id.g2t);
                    if (textView6 != null) {
                        textView6.setVisibility(0);
                    }
                    C21804c loadMoreFooter8 = this.f27896a.f27883i.getLoadMoreFooter();
                    View findViewById2 = (loadMoreFooter8 == null || (view7 = loadMoreFooter8.getView()) == null) ? null : view7.findViewById(C0966R.C0970id.g2s);
                    if (findViewById2 != null) {
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                        aVar4.mo10233c(8);
                        View view17 = findViewById2;
                        C117292a.m165358d(view17, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(view17, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    return;
                }
                C21804c loadMoreFooter9 = this.f27896a.f27882h.getLoadMoreFooter();
                View view18 = loadMoreFooter9 != null ? loadMoreFooter9.getView() : null;
                if (view18 != null) {
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    View view19 = view18;
                    C117292a.m165358d(view19, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view18.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(view19, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C21804c loadMoreFooter10 = this.f27896a.f27882h.getLoadMoreFooter();
                if (!(loadMoreFooter10 == null || (view6 = loadMoreFooter10.getView()) == null || (textView2 = (TextView) view6.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView2.setText(C0966R.string.eat);
                }
                C21804c loadMoreFooter11 = this.f27896a.f27882h.getLoadMoreFooter();
                TextView textView7 = (loadMoreFooter11 == null || (view5 = loadMoreFooter11.getView()) == null) ? null : (TextView) view5.findViewById(C0966R.C0970id.g2t);
                if (textView7 != null) {
                    textView7.setVisibility(8);
                }
                C21804c loadMoreFooter12 = this.f27896a.f27882h.getLoadMoreFooter();
                View findViewById3 = (loadMoreFooter12 == null || (view4 = loadMoreFooter12.getView()) == null) ? null : view4.findViewById(C0966R.C0970id.g2s);
                if (findViewById3 != null) {
                    C9556a aVar6 = new C9556a();
                    ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
                    aVar6.mo10233c(0);
                    C117292a.m165358d(findViewById3, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C21804c loadMoreFooter13 = this.f27896a.f27883i.getLoadMoreFooter();
                View view20 = loadMoreFooter13 != null ? loadMoreFooter13.getView() : null;
                if (view20 != null) {
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
                    aVar7.mo10233c(0);
                    C117292a.m165358d(view20, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view20.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view20, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                C21804c loadMoreFooter14 = this.f27896a.f27883i.getLoadMoreFooter();
                if (!(loadMoreFooter14 == null || (view3 = loadMoreFooter14.getView()) == null || (textView = (TextView) view3.findViewById(C0966R.C0970id.g2t)) == null)) {
                    textView.setText(C0966R.string.eat);
                }
                C21804c loadMoreFooter15 = this.f27896a.f27883i.getLoadMoreFooter();
                TextView textView8 = (loadMoreFooter15 == null || (view2 = loadMoreFooter15.getView()) == null) ? null : (TextView) view2.findViewById(C0966R.C0970id.g2t);
                if (textView8 != null) {
                    textView8.setVisibility(8);
                }
                C21804c loadMoreFooter16 = this.f27896a.f27883i.getLoadMoreFooter();
                View findViewById4 = (loadMoreFooter16 == null || (view = loadMoreFooter16.getView()) == null) ? null : view.findViewById(C0966R.C0970id.g2s);
                if (findViewById4 != null) {
                    C9556a aVar8 = new C9556a();
                    ThreadLocal<C9556a> threadLocal8 = C60958c.f173611a;
                    aVar8.mo10233c(0);
                    View view21 = findViewById4;
                    C117292a.m165358d(view21, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                    C117292a.m165359e(view21, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback$refreshAction$1", "onLoadMore", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        }
    }

    public C8684r0(MMActivity mMActivity, C8674m0 m0Var, int i) {
        float f;
        C13442s8 f2;
        C58556f j3;
        C13442s8 f3;
        C58556f j35;
        C87412m.m108594g(mMActivity, "context");
        C87412m.m108594g(m0Var, "presenter");
        this.f27878d = mMActivity;
        this.f27879e = m0Var;
        this.f27880f = i;
        this.f27882h = (FinderRefreshLayout) mMActivity.findViewById(C0966R.C0970id.ivb);
        this.f27883i = (FinderRefreshLayout) this.f27878d.findViewById(C0966R.C0970id.mlj);
        this.f27884j = (TextView) this.f27878d.findViewById(C0966R.C0970id.hgr);
        this.f27885n = this.f27878d.findViewById(C0966R.C0970id.g3e);
        this.f27886o = this.f27878d.findViewById(C0966R.C0970id.iyj);
        this.f27887p = C36568h.m40985a(new C8687c(this));
        this.f27888q = this.f27878d.findViewById(C0966R.C0970id.gkz);
        this.f27889r = this.f27882h.getRecyclerView();
        this.f27890s = this.f27883i.getRecyclerView();
        if (mo9531v()) {
            View findViewById = this.f27878d.findViewById(C0966R.C0970id.gkz);
            C87412m.m108592e(findViewById, "null cannot be cast to non-null type android.view.View");
            this.f27882h.setBackgroundColor(this.f27878d.getResources().getColor(C0966R.color.f2947a4));
            this.f27883i.setBackgroundColor(this.f27878d.getResources().getColor(C0966R.color.f2947a4));
            findViewById.setBackgroundColor(this.f27878d.getResources().getColor(C0966R.color.f2947a4));
        }
        RecyclerView recyclerView = this.f27889r;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new FinderStaggeredGridLayoutManager(2, 1));
        }
        RecyclerView recyclerView2 = this.f27890s;
        if (recyclerView2 != null) {
            recyclerView2.setLayoutManager(new FinderStaggeredGridLayoutManager(2, 1));
        }
        C8685a aVar = new C8685a(mo9531v());
        RecyclerView recyclerView3 = this.f27889r;
        if (recyclerView3 != null) {
            recyclerView3.setAdapter(aVar);
        }
        RecyclerView recyclerView4 = this.f27890s;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(aVar);
        }
        if (mo9531v()) {
            Resources resources = this.f27878d.getResources();
            C87412m.m108591d(resources);
            f = resources.getDimension(C0966R.dimen.f3723cd);
        } else {
            Resources resources2 = this.f27878d.getResources();
            C87412m.m108591d(resources2);
            f = resources2.getDimension(C0966R.dimen.f3703bv);
        }
        C8686b bVar = new C8686b((int) f);
        RecyclerView recyclerView5 = this.f27889r;
        if (recyclerView5 != null) {
            recyclerView5.mo17085h0(bVar);
        }
        RecyclerView recyclerView6 = this.f27890s;
        if (recyclerView6 != null) {
            recyclerView6.mo17085h0(bVar);
        }
        FinderLoaderMoreFooter finderLoaderMoreFooter = new FinderLoaderMoreFooter(this.f27878d, (AttributeSet) null);
        boolean v = mo9531v();
        int i2 = C0966R.C0971layout.b7v;
        finderLoaderMoreFooter.mo79990j(v ? C0966R.C0971layout.b7v : C0966R.C0971layout.b7t);
        this.f27882h.mo26641y(finderLoaderMoreFooter);
        FinderLoaderMoreFooter finderLoaderMoreFooter2 = new FinderLoaderMoreFooter(this.f27878d, (AttributeSet) null);
        finderLoaderMoreFooter2.mo79990j(!mo9531v() ? C0966R.C0971layout.b7t : i2);
        this.f27883i.mo26641y(finderLoaderMoreFooter2);
        C8688d dVar = new C8688d(this);
        this.f27882h.setOnSimpleAction(dVar);
        this.f27883i.setOnSimpleAction(dVar);
        RecyclerView recyclerView7 = this.f27889r;
        if (!(recyclerView7 == null || (f3 = C13442s8.f38060Q0.mo12873f(this.f27878d)) == null || (j35 = f3.mo12854j3(-1)) == null)) {
            j35.mo83455c(recyclerView7);
        }
        RecyclerView recyclerView8 = this.f27890s;
        if (recyclerView8 != null && (f2 = C13442s8.f38060Q0.mo12873f(this.f27878d)) != null && (j3 = f2.mo12854j3(-1)) != null) {
            j3.mo83455c(recyclerView8);
        }
    }

    /* renamed from: p */
    public static final int m8518p(C8684r0 r0Var) {
        int size = r0Var.f27879e.mo3911m().size();
        boolean m0 = r0Var.f27879e.mo3912m0();
        if (size > 3 && m0) {
            return 4;
        }
        if (size > 0) {
            return size + 1;
        }
        return 0;
    }

    /* renamed from: G */
    public void mo9526G(int i, boolean z, List<FinderMixSearchPresenter.C3571a> list) {
        FinderMixSearchPresenter finderMixSearchPresenter;
        Map<Integer, C9485a> map;
        T t;
        Map<Integer, C9485a> map2;
        Map<Integer, C9485a> map3;
        boolean z2;
        RecyclerView.C16613e adapter;
        RecyclerView.C16613e adapter2;
        int i2 = i;
        C87412m.m108594g(list, "tabChangeOpList");
        int size = this.f27879e.mo3911m().size();
        mo9532x();
        boolean z3 = !Util.isNullOrNil(this.f27879e.mo3915o0());
        Map<Integer, C9485a> J = this.f27879e.mo3906J();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : J.entrySet()) {
            if (!((C9485a) next.getValue()).f29653c.isEmpty()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        boolean isEmpty = linkedHashMap.isEmpty();
        if (size > 0 || !isEmpty) {
            this.f27884j.setVisibility(8);
            View view = this.f27885n;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view3 = this.f27888q;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view4 = view3;
            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else if (z3) {
            this.f27884j.setVisibility(0);
            View view5 = this.f27885n;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view6 = view5;
            C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view7 = this.f27888q;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            this.f27884j.setVisibility(0);
            View view9 = this.f27885n;
            C9556a aVar5 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view11 = this.f27888q;
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(8);
            View view12 = view11;
            C117292a.m165358d(view12, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view11.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(view12, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i2 == 0) {
            RecyclerView recyclerView = this.f27889r;
            if (!(recyclerView == null || (adapter2 = recyclerView.getAdapter()) == null)) {
                adapter2.notifyDataSetChanged();
            }
        } else {
            int i3 = 4;
            int i4 = (i2 <= 3 || !z) ? i2 > 0 ? i2 + 1 : 0 : 4;
            boolean m0 = this.f27879e.mo3912m0();
            if (size <= 3 || !m0) {
                i3 = size > 0 ? size + 1 : 0;
            }
            int i5 = i3 - i4;
            int i6 = i4 + (z3 ? 1 : 0);
            RecyclerView recyclerView2 = this.f27889r;
            if (!(recyclerView2 == null || (adapter = recyclerView2.getAdapter()) == null)) {
                adapter.notifyItemRangeInserted(i6, i5);
            }
        }
        C60571a aVar7 = (C60571a) C39818r.f106831a.mo62444c(this.f27878d).mo62449e(C60571a.class);
        if (aVar7 != null && (finderMixSearchPresenter = aVar7.f172650x) != null && (map = finderMixSearchPresenter.f16581n) != null) {
            aVar7.f172651y = map.size() == 1 && ((LinkedHashMap) map).get(-1) != null;
            for (FinderHomeTabFragment finderHomeTabFragment : aVar7.mo80061o3()) {
                if ((finderHomeTabFragment instanceof FinderMixSearchFeedFragment) && !((LinkedHashMap) map).keySet().contains(Integer.valueOf(finderHomeTabFragment.f17334o))) {
                    FinderTabUIC.m65392W3(aVar7, finderHomeTabFragment.f17334o, 0, 2, (Object) null);
                }
            }
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    aVar7.mo78525l3();
                    break;
                }
                FinderMixSearchPresenter.C3571a aVar8 = (FinderMixSearchPresenter.C3571a) it.next();
                Iterator<T> it4 = aVar7.mo80061o3().iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it4.next();
                    if (((FinderHomeTabFragment) t).f17334o == aVar8.f16591a) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (z2) {
                        break;
                    }
                }
                FinderMixSearchFeedFragment finderMixSearchFeedFragment = t instanceof FinderMixSearchFeedFragment ? (FinderMixSearchFeedFragment) t : null;
                if (finderMixSearchFeedFragment == null) {
                    FinderMixSearchPresenter finderMixSearchPresenter2 = aVar7.f172650x;
                    if (finderMixSearchPresenter2 == null || (map3 = finderMixSearchPresenter2.f16581n) == null) {
                        break;
                    }
                    C9485a aVar9 = (C9485a) ((LinkedHashMap) map3).get(Integer.valueOf(aVar8.f16591a));
                    if (aVar9 == null) {
                        break;
                    } else if (!Util.isNullOrNil((List) aVar9.f29653c)) {
                        FinderTabUIC.m65395f3(aVar7, new C60571a.C9233b(aVar9.f29652b), new FinderMixSearchFeedFragment(aVar9, aVar7.f172646t, aVar7.f172650x), false, 4, (Object) null);
                    }
                } else {
                    C87412m.m108594g(aVar8, "op");
                    FinderMixSearchPresenter finderMixSearchPresenter3 = finderMixSearchFeedFragment.f16655r;
                    if (!(finderMixSearchPresenter3 == null || (map2 = finderMixSearchPresenter3.f16581n) == null)) {
                        C9485a aVar10 = (C9485a) ((LinkedHashMap) map2).get(Integer.valueOf(finderMixSearchFeedFragment.f17334o));
                        if (aVar10 != null && !Util.isNullOrNil((List) aVar10.f29653c)) {
                            finderMixSearchFeedFragment.f16656s = aVar10.f29653c;
                            if (aVar8.f16592b == 0) {
                                RecyclerView.C16613e adapter3 = finderMixSearchFeedFragment.mo3951V().getAdapter();
                                if (adapter3 != null) {
                                    adapter3.notifyDataSetChanged();
                                }
                            } else {
                                RecyclerView.C16613e adapter4 = finderMixSearchFeedFragment.mo3951V().getAdapter();
                                if (adapter4 != null) {
                                    adapter4.notifyItemRangeInserted(aVar8.f16592b, aVar8.f16593c);
                                }
                            }
                            finderMixSearchFeedFragment.mo3952X().mo26580f(true);
                            finderMixSearchFeedFragment.mo3952X().mo26642z(aVar10.f29654d == 0);
                        }
                    }
                }
            }
        }
        this.f27882h.mo26580f(true);
        this.f27883i.mo26580f(true);
        this.f27882h.mo26642z(this.f27879e.mo3912m0() || !this.f27879e.mo3917r0());
        this.f27883i.mo26642z(this.f27879e.mo3912m0() || !this.f27879e.mo3917r0());
        View findViewById = this.f27878d.findViewById(C0966R.C0970id.iyj);
        if (!this.f27879e.mo3912m0()) {
            if (findViewById != null) {
                C9556a aVar11 = new C9556a();
                ThreadLocal<C9556a> threadLocal4 = C60958c.f173611a;
                aVar11.mo10233c(8);
                View view13 = findViewById;
                C117292a.m165358d(view13, aVar11.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar11.mo10231a(0)).intValue());
                C117292a.m165359e(view13, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = this.f27878d.findViewById(C0966R.C0970id.l89);
            if (findViewById2 != null) {
                C9556a aVar12 = new C9556a();
                ThreadLocal<C9556a> threadLocal5 = C60958c.f173611a;
                aVar12.mo10233c(8);
                View view14 = findViewById2;
                C117292a.m165358d(view14, aVar12.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar12.mo10231a(0)).intValue());
                C117292a.m165359e(view14, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            this.f27883i.setVisibility(0);
            this.f27882h.setVisibility(8);
            return;
        }
        if (findViewById != null) {
            C9556a aVar13 = new C9556a();
            ThreadLocal<C9556a> threadLocal6 = C60958c.f173611a;
            aVar13.mo10233c(0);
            View view15 = findViewById;
            C117292a.m165358d(view15, aVar13.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((Integer) aVar13.mo10231a(0)).intValue());
            C117292a.m165359e(view15, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        View findViewById3 = this.f27878d.findViewById(C0966R.C0970id.l89);
        if (findViewById3 != null) {
            C9556a aVar14 = new C9556a();
            ThreadLocal<C9556a> threadLocal7 = C60958c.f173611a;
            aVar14.mo10233c(0);
            View view16 = findViewById3;
            C117292a.m165358d(view16, aVar14.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((Integer) aVar14.mo10231a(0)).intValue());
            C117292a.m165359e(view16, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onSearchCallback", "(IZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f27883i.setVisibility(8);
        this.f27882h.setVisibility(0);
    }

    /* renamed from: Q */
    public void mo9527Q() {
        View view = this.f27888q;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f27884j.setVisibility(8);
        View view2 = this.f27885n;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        C21804c loadMoreFooter = this.f27882h.getLoadMoreFooter();
        View view4 = loadMoreFooter != null ? loadMoreFooter.getView() : null;
        if (view4 != null) {
            C9556a aVar3 = new C9556a();
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C21804c loadMoreFooter2 = this.f27883i.getLoadMoreFooter();
        View view6 = loadMoreFooter2 != null ? loadMoreFooter2.getView() : null;
        if (view6 != null) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(8);
            View view7 = view6;
            C117292a.m165358d(view7, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view7, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ViewGroup.LayoutParams layoutParams = ((AppBarLayout) ((C36570n) this.f27887p).getValue()).getLayoutParams();
        CoordinatorLayout.C103717e eVar = layoutParams instanceof CoordinatorLayout.C103717e ? (CoordinatorLayout.C103717e) layoutParams : null;
        CoordinatorLayout.Behavior behavior = eVar != null ? eVar.f306328a : null;
        AppBarLayout.Behavior behavior2 = behavior instanceof AppBarLayout.Behavior ? (AppBarLayout.Behavior) behavior : null;
        if (!(behavior2 == null || behavior2.mo146259w() == 0)) {
            behavior2.mo146260y(0);
            ((AppBarLayout) ((C36570n) this.f27887p).getValue()).mo146163d(true, false, true);
        }
        RecyclerView recyclerView = this.f27889r;
        if (recyclerView != null) {
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(0);
            RecyclerView recyclerView2 = recyclerView;
            C117292a.m165358d(recyclerView2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.mo17115r1(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        RecyclerView recyclerView3 = this.f27890s;
        if (recyclerView3 != null) {
            C9556a aVar6 = new C9556a();
            aVar6.mo10233c(0);
            RecyclerView recyclerView4 = recyclerView3;
            C117292a.m165358d(recyclerView4, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
            recyclerView3.mo17115r1(((Integer) aVar6.mo10231a(0)).intValue());
            C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
        }
        for (FinderHomeTabFragment finderHomeTabFragment : ((C60571a) C39818r.f106831a.mo62444c(this.f27878d).mo75002a(C60571a.class)).mo80061o3()) {
            FinderMixSearchFeedFragment finderMixSearchFeedFragment = finderHomeTabFragment instanceof FinderMixSearchFeedFragment ? (FinderMixSearchFeedFragment) finderHomeTabFragment : null;
            if (finderMixSearchFeedFragment != null) {
                C21804c loadMoreFooter3 = finderMixSearchFeedFragment.mo3952X().getLoadMoreFooter();
                View view8 = loadMoreFooter3 != null ? loadMoreFooter3.getView() : null;
                if (view8 != null) {
                    C9556a aVar7 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar7.mo10233c(8);
                    View view9 = view8;
                    C117292a.m165358d(view9, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view8.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                    C117292a.m165359e(view9, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                RecyclerView V = finderMixSearchFeedFragment.mo3951V();
                C9556a aVar8 = new C9556a();
                ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                aVar8.mo10233c(0);
                RecyclerView recyclerView5 = V;
                C117292a.m165358d(recyclerView5, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
                V.mo17115r1(((Integer) aVar8.mo10231a(0)).intValue());
                C117292a.m165359e(recyclerView5, "com/tencent/mm/plugin/finder/search/ui/FinderMixSearchFeedFragment", "onStartSearch", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
        }
    }

    public MMFragmentActivity getActivity() {
        return this.f27878d;
    }

    public void notifyItemChanged(int i) {
        RecyclerView.C16613e adapter;
        RecyclerView recyclerView = this.f27889r;
        if (recyclerView != null && (adapter = recyclerView.getAdapter()) != null) {
            adapter.notifyItemChanged(i);
        }
    }

    /* renamed from: v */
    public final boolean mo9531v() {
        return this.f27880f == 13;
    }

    /* renamed from: x */
    public final void mo9532x() {
        View view = this.f27886o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view2 = this.f27888q;
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view3 = view2;
        C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/search/FinderMixSearchViewCallback", "showSearchResult", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: hp1.r0$a */
    public final class C8685a extends RecyclerView.C16613e<RecyclerView.C16631z> implements C60191o5 {

        /* renamed from: d */
        public final boolean f27891d;

        public C8685a(boolean z) {
            this.f27891d = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
            r9 = r9.username;
         */
        /* renamed from: F4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void m8523F4(hp1.C8684r0.C8685a r18, androidx.recyclerview.widget.RecyclerView.C16631z r19, int r20, int r21, boolean r22, int r23, java.lang.Object r24) {
            /*
                r0 = r18
                r1 = r19
                r2 = r20
                r3 = r21
                r18.getClass()
                java.lang.Class<l31.e> r4 = l31.C61212e.class
                r5 = 0
                r6 = 0
                r7 = 1
                r9 = 8
                if (r3 == r7) goto L_0x0111
                r10 = 2
                if (r3 == r10) goto L_0x003b
                if (r3 == r9) goto L_0x0111
                r2 = 9
                if (r3 == r2) goto L_0x001f
                goto L_0x01f6
            L_0x001f:
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchSafetyHintHolder"
                gy3.C87412m.m108592e(r1, r2)
                hp1.h0 r1 = (hp1.C8667h0) r1
                hp1.r0 r0 = hp1.C8684r0.this
                hp1.m0 r0 = r0.f27879e
                java.lang.String r0 = r0.mo3915o0()
                java.lang.String r2 = "safetyHint"
                gy3.C87412m.m108594g(r0, r2)
                android.widget.TextView r1 = r1.f27855A
                r1.setText(r0)
                goto L_0x01f6
            L_0x003b:
                hp1.r0 r3 = hp1.C8684r0.this
                hp1.m0 r3 = r3.f27879e
                java.util.List r3 = r3.mo3911m()
                int r13 = r2 + -1
                java.lang.Object r3 = r3.get(r13)
                hp1.r0 r9 = hp1.C8684r0.this
                hp1.m0 r11 = r9.f27879e
                te3.bk1 r3 = (te3.C48868bk1) r3
                com.tencent.mm.protocal.protobuf.FinderContact r9 = r3.f131162d
                java.lang.String r15 = ""
                if (r9 == 0) goto L_0x005c
                java.lang.String r9 = r9.username
                if (r9 != 0) goto L_0x005a
                goto L_0x005c
            L_0x005a:
                r12 = r9
                goto L_0x005d
            L_0x005c:
                r12 = r15
            L_0x005d:
                r14 = 1
                r9 = 0
                r16 = 0
                r8 = r15
                r15 = r9
                r11.mo3910e0(r12, r13, r14, r15, r16)
                java.lang.String r9 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactItemHolder"
                gy3.C87412m.m108592e(r1, r9)
                r9 = r1
                hp1.f0 r9 = (hp1.C8661f0) r9
                hp1.p0 r11 = new hp1.p0
                hp1.r0 r0 = hp1.C8684r0.this
                r11.<init>(r2, r0)
                int r0 = hp1.C8661f0.f27826W
                r9.mo9518y(r3, r11, r5, r7)
                android.view.View r0 = r1.f44854d
                r1 = 2131304082(0x7f091e92, float:1.8226297E38)
                android.view.View r1 = r0.findViewById(r1)
                java.lang.String r2 = "it.findViewById(R.id.finder_live_onlive_widget)"
                gy3.C87412m.m108593f(r1, r2)
                com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget r1 = (com.tencent.p014mm.plugin.finder.view.FinderLiveOnliveWidget) r1
                di3.d r2 = di3.C86312j.m106911c(r4)
                l31.e r2 = (l31.C61212e) r2
                java.lang.String r9 = "living_label"
                r2.o30(r1, r9)
                com.tencent.mm.protocal.protobuf.FinderContact r2 = r3.f131162d
                if (r2 == 0) goto L_0x009f
                int r2 = r2.liveStatus
                if (r2 != r7) goto L_0x009f
                r2 = 1
                goto L_0x00a0
            L_0x009f:
                r2 = 0
            L_0x00a0:
                if (r2 == 0) goto L_0x01f6
                di3.d r2 = di3.C86312j.m106911c(r4)
                l31.e r2 = (l31.C61212e) r2
                r3 = 40
                r9 = 26236(0x667c, float:3.6764E-41)
                r2.mo86175pO(r1, r3, r9)
                java.lang.Object r0 = r0.getTag()
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchInfo"
                gy3.C87412m.m108592e(r0, r2)
                te3.bk1 r0 = (te3.C48868bk1) r0
                di3.d r2 = di3.C86312j.m106911c(r4)
                l31.e r2 = (l31.C61212e) r2
                r3 = 5
                rx3.l[] r3 = new rx3.C13604l[r3]
                rx3.l r9 = new rx3.l
                java.lang.String r11 = "feed_id"
                r9.<init>(r11, r8)
                r3[r6] = r9
                rx3.l r6 = new rx3.l
                java.lang.String r9 = "live_id"
                r6.<init>(r9, r8)
                r3[r7] = r6
                rx3.l r6 = new rx3.l
                java.lang.String r7 = "comment_scene"
                java.lang.String r8 = "23"
                r6.<init>(r7, r8)
                r3[r10] = r6
                com.tencent.mm.protocal.protobuf.FinderContact r0 = r0.f131162d
                if (r0 == 0) goto L_0x00e6
                java.lang.String r5 = r0.username
            L_0x00e6:
                rx3.l r0 = new rx3.l
                java.lang.String r6 = "finder_username"
                r0.<init>(r6, r5)
                r5 = 3
                r3[r5] = r0
                r0 = 4
                rx3.l r5 = new rx3.l
                java.lang.String r6 = "session_buffer"
                java.lang.String r7 = " "
                r5.<init>(r6, r7)
                r3[r0] = r5
                java.util.Map r0 = sx3.C90364q0.m113147f(r3)
                r2.mo86149PM(r1, r0)
                di3.d r0 = di3.C86312j.m106911c(r4)
                l31.e r0 = (l31.C61212e) r0
                hp1.q0 r2 = hp1.C8682q0.f27874a
                r0.E60(r1, r2)
                goto L_0x01f6
            L_0x0111:
                java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.search.FinderMixSearchContactHeaderHolder"
                gy3.C87412m.m108592e(r1, r2)
                hp1.e0 r1 = (hp1.C8659e0) r1
                hp1.r0 r2 = hp1.C8684r0.this
                hp1.m0 r3 = r2.f27879e
                java.util.List r3 = r3.mo3911m()
                int r3 = r3.size()
                r4 = 3
                if (r3 <= r4) goto L_0x0130
                hp1.m0 r2 = r2.f27879e
                boolean r2 = r2.mo3912m0()
                if (r2 == 0) goto L_0x0130
                goto L_0x0131
            L_0x0130:
                r7 = 0
            L_0x0131:
                hp1.o0 r2 = new hp1.o0
                hp1.r0 r0 = hp1.C8684r0.this
                r2.<init>(r0)
                if (r7 == 0) goto L_0x0195
                android.widget.TextView r0 = r1.f27821A
                r0.setVisibility(r6)
                android.view.View r0 = r1.f27822B
                k20.a r3 = new k20.a
                r3.<init>()
                java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
                java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
                r3.mo10233c(r4)
                java.lang.Object[] r8 = r3.mo10232b()
                java.lang.String r9 = "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder"
                java.lang.String r10 = "onBindView"
                java.lang.String r11 = "(ZLandroid/view/View$OnClickListener;)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                r7 = r0
                j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
                java.lang.Object r3 = r3.mo10231a(r6)
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r3 = r3.intValue()
                r0.setVisibility(r3)
                java.lang.String r3 = "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder"
                java.lang.String r4 = "onBindView"
                java.lang.String r5 = "(ZLandroid/view/View$OnClickListener;)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r18 = r0
                r19 = r3
                r20 = r4
                r21 = r5
                r22 = r6
                r23 = r7
                r24 = r8
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.view.View r0 = r1.f44854d
                r0.setOnClickListener(r2)
                goto L_0x01ef
            L_0x0195:
                android.widget.TextView r0 = r1.f27821A
                r0.setVisibility(r9)
                android.view.View r0 = r1.f27822B
                k20.a r2 = new k20.a
                r2.<init>()
                java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
                r2.mo10233c(r3)
                java.lang.Object[] r11 = r2.mo10232b()
                java.lang.String r12 = "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder"
                java.lang.String r13 = "onBindView"
                java.lang.String r14 = "(ZLandroid/view/View$OnClickListener;)V"
                java.lang.String r15 = "android/view/View_EXEC_"
                java.lang.String r16 = "setVisibility"
                java.lang.String r17 = "(I)V"
                r10 = r0
                j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
                java.lang.Object r2 = r2.mo10231a(r6)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.setVisibility(r2)
                java.lang.String r2 = "com/tencent/mm/plugin/finder/search/FinderMixSearchContactHeaderHolder"
                java.lang.String r3 = "onBindView"
                java.lang.String r4 = "(ZLandroid/view/View$OnClickListener;)V"
                java.lang.String r6 = "android/view/View_EXEC_"
                java.lang.String r7 = "setVisibility"
                java.lang.String r8 = "(I)V"
                r18 = r0
                r19 = r2
                r20 = r3
                r21 = r4
                r22 = r6
                r23 = r7
                r24 = r8
                j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
                android.view.View r0 = r1.f44854d
                r0.setOnClickListener(r5)
            L_0x01ef:
                android.widget.TextView r0 = r1.f27823C
                java.lang.String r1 = r1.f27824z
                r0.setText(r1)
            L_0x01f6:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: hp1.C8684r0.C8685a.m8523F4(hp1.r0$a, androidx.recyclerview.widget.RecyclerView$z, int, int, boolean, int, java.lang.Object):void");
        }

        /* renamed from: G4 */
        public final int mo9533G4(int i) {
            boolean z = !Util.isNullOrNil(C8684r0.this.f27879e.mo3915o0());
            if (!z || i != 0) {
                return z ? i - 1 : i;
            }
            return 0;
        }

        public List<BaseFinderFeed> getData() {
            return C64186f0.f181907d;
        }

        public int getItemCount() {
            return C8684r0.m8518p(C8684r0.this) + (Util.isNullOrNil(C8684r0.this.f27879e.mo3915o0()) ^ true ? 1 : 0);
        }

        public int getItemViewType(int i) {
            int p = C8684r0.m8518p(C8684r0.this);
            boolean z = !Util.isNullOrNil(C8684r0.this.f27879e.mo3915o0());
            int G4 = mo9533G4(i);
            Log.m105924i(C8684r0.this.f27881g, "getItemViewType adapterPosition: " + i + "  position:" + G4);
            if (i == 0 && z) {
                return 9;
            }
            if (G4 >= p) {
                return 1;
            }
            if (G4 == 0) {
                return C8684r0.this.mo9531v() ? 8 : 1;
            }
            return 2;
        }

        /* renamed from: m */
        public List<C48868bk1> mo3956m() {
            return C8684r0.this.f27879e.mo3911m();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List<Object> list) {
            C87412m.m108594g(zVar, "holder");
            C87412m.m108594g(list, "payloads");
            String str = C8684r0.this.f27881g;
            Log.m105924i(str, "onBindViewHolder position:" + i);
            m8523F4(this, zVar, mo9533G4(i), getItemViewType(i), false, 8, (Object) null);
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C8659e0 e0Var;
            C87412m.m108594g(viewGroup, "parent");
            String str = C8684r0.this.f27881g;
            Log.m105924i(str, "onCreateViewHolder viewType: " + i);
            int i2 = C0966R.C0971layout.alu;
            if (i == 1) {
                MMActivity mMActivity = C8684r0.this.f27878d;
                C87412m.m108591d(mMActivity);
                LayoutInflater layoutInflater = mMActivity.getLayoutInflater();
                if (!this.f27891d) {
                    i2 = C0966R.C0971layout.alt;
                }
                View inflate = layoutInflater.inflate(i2, viewGroup, false);
                C87412m.m108593f(inflate, "headerLayout");
                String string = viewGroup.getResources().getString(C0966R.string.f360772en2);
                C87412m.m108593f(string, "parent.resources.getStri…der_search_contact_title)");
                e0Var = new C8659e0(inflate, string);
            } else if (i == 2) {
                MMActivity mMActivity2 = C8684r0.this.f27878d;
                C87412m.m108591d(mMActivity2);
                View inflate2 = mMActivity2.getLayoutInflater().inflate(this.f27891d ? C0966R.C0971layout.a9w : C0966R.C0971layout.a9v, viewGroup, false);
                C87412m.m108593f(inflate2, "contactLayout");
                return new C8661f0(inflate2, false, false, 6, (C8480h) null);
            } else if (i == 8) {
                MMActivity mMActivity3 = C8684r0.this.f27878d;
                C87412m.m108591d(mMActivity3);
                LayoutInflater layoutInflater2 = mMActivity3.getLayoutInflater();
                if (!this.f27891d) {
                    i2 = C0966R.C0971layout.alt;
                }
                View inflate3 = layoutInflater2.inflate(i2, viewGroup, false);
                C87412m.m108593f(inflate3, "headerLayout");
                String string2 = viewGroup.getResources().getString(C0966R.string.end);
                C87412m.m108593f(string2, "parent.resources.getStri…earch_live_contact_title)");
                e0Var = new C8659e0(inflate3, string2);
            } else if (i != 9) {
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.alv, viewGroup, false);
                C87412m.m108593f(inflate4, "convertView");
                return new C14663v7(inflate4);
            } else {
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C0966R.C0971layout.abf, viewGroup, false);
                C87412m.m108593f(inflate5, "convertView");
                return new C8667h0(inflate5);
            }
            return e0Var;
        }

        public void onViewAttachedToWindow(RecyclerView.C16631z zVar) {
            C87412m.m108594g(zVar, "holder");
            super.onViewAttachedToWindow(zVar);
            ViewGroup.LayoutParams layoutParams = zVar.f44854d.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                StaggeredGridLayoutManager.LayoutParams layoutParams2 = (StaggeredGridLayoutManager.LayoutParams) layoutParams;
                int i = zVar.f44859i;
                boolean z = true;
                if (!(i == 1 || i == 8 || i == 2 || i == 9)) {
                    z = false;
                }
                layoutParams2.f44911i = z;
            }
        }

        /* renamed from: y1 */
        public int mo3957y1(int i) {
            return i;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C87412m.m108594g(zVar, "holder");
            m8523F4(this, zVar, mo9533G4(i), getItemViewType(i), false, 8, (Object) null);
        }
    }
}

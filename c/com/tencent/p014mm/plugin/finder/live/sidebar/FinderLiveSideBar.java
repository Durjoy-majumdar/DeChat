package com.tencent.p014mm.plugin.finder.live.sidebar;

import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import di3.C86312j;
import dk1.C58307a;
import dk1.C58310d;
import dk1.C58311f;
import dk1.C58312g;
import eb0.C31543z5;
import ff1.C58985a;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60172g4;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C60906r;
import jq3.C60907t;
import js1.C60909a;
import js1.C60915b;
import js1.C60916c;
import js1.C60917d;
import js1.C60918e;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import zp3.C23555k;
import zp3.C23564m;

/* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar */
public final class FinderLiveSideBar {

    /* renamed from: a */
    public final View f159509a;

    /* renamed from: b */
    public final String f159510b = "Finder.FinderLiveSideBar";

    /* renamed from: c */
    public C60909a f159511c;

    /* renamed from: d */
    public boolean f159512d;

    /* renamed from: e */
    public final HashSet<String> f159513e = new HashSet<>();

    /* renamed from: f */
    public C55962a f159514f;

    /* renamed from: g */
    public WxRecyclerView f159515g;

    /* renamed from: h */
    public Context f159516h;

    /* renamed from: i */
    public final ArrayList<C58307a> f159517i = new ArrayList<>();

    /* renamed from: j */
    public int f159518j;

    /* renamed from: k */
    public C89349b f159519k;

    /* renamed from: l */
    public boolean f159520l;

    /* renamed from: m */
    public final FinderLiveSideBarConfig f159521m = new FinderLiveSideBarConfig();

    /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig */
    public final class FinderLiveSideBarConfig extends C60909a.C60912c {

        /* renamed from: a */
        public boolean f159522a;

        /* renamed from: b */
        public TextView f159523b;

        /* renamed from: c */
        public ImageView f159524c;

        /* renamed from: d */
        public View f159525d;

        /* renamed from: e */
        public View f159526e;

        /* renamed from: f */
        public View f159527f;

        /* renamed from: g */
        public boolean f159528g;

        /* renamed from: h */
        public View f159529h;

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$a */
        public static final class C55954a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveSideBar f159531d;

            public C55954a(FinderLiveSideBar finderLiveSideBar) {
                this.f159531d = finderLiveSideBar;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildBody$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                Log.m105924i(this.f159531d.f159510b, "click close btn");
                ((C58312g) C39818r.f106831a.mo62443b(this.f159531d.mo77735b()).mo75002a(C58312g.class)).f166971i.f166979h = 1;
                this.f159531d.mo77737d();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildBody$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$b */
        public static final class C55955b implements C60898l.C9502b<C60905o> {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveSideBar f159532d;

            public C55955b(FinderLiveSideBar finderLiveSideBar) {
                this.f159532d = finderLiveSideBar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x010b, code lost:
                r3 = (r3 = r8.f166953d).f151977d;
             */
            /* renamed from: q */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r7, android.view.View r8, int r9, androidx.recyclerview.widget.RecyclerView.C16631z r10) {
                /*
                    r6 = this;
                    jq3.o r10 = (jq3.C60905o) r10
                    java.lang.Class<dk1.g> r0 = dk1.C58312g.class
                    java.lang.String r1 = "adapter"
                    gy3.C87412m.m108594g(r7, r1)
                    java.lang.String r7 = "view"
                    gy3.C87412m.m108594g(r8, r7)
                    java.lang.String r7 = "holder"
                    gy3.C87412m.m108594g(r10, r7)
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r7 = r6.f159532d
                    java.lang.String r7 = r7.f159510b
                    java.lang.StringBuilder r8 = new java.lang.StringBuilder
                    r8.<init>()
                    java.lang.String r10 = "itemclick position:"
                    r8.append(r10)
                    r8.append(r9)
                    java.lang.String r10 = ", sideBarDataList.size:"
                    r8.append(r10)
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r10 = r6.f159532d
                    java.util.ArrayList<dk1.a> r10 = r10.f159517i
                    int r10 = r10.size()
                    r8.append(r10)
                    java.lang.String r10 = ", curPosition:"
                    r8.append(r10)
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r10 = r6.f159532d
                    int r10 = r10.f159518j
                    r8.append(r10)
                    java.lang.String r8 = r8.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
                    if (r9 < 0) goto L_0x014c
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r7 = r6.f159532d
                    java.util.ArrayList<dk1.a> r7 = r7.f159517i
                    int r7 = r7.size()
                    if (r9 > r7) goto L_0x014c
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r7 = r6.f159532d
                    int r8 = r7.f159518j
                    if (r8 != r9) goto L_0x005c
                    goto L_0x014c
                L_0x005c:
                    bl3.r r8 = bl3.C39818r.f106831a
                    android.content.Context r7 = r7.mo77735b()
                    bl3.r$a r7 = r8.mo62443b(r7)
                    androidx.lifecycle.i0 r7 = r7.mo75002a(r0)
                    dk1.g r7 = (dk1.C58312g) r7
                    dk1.g$a r7 = r7.f166971i
                    r7.f166975d = r9
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r7 = r6.f159532d
                    android.content.Context r7 = r7.mo77735b()
                    bl3.r$a r7 = r8.mo62443b(r7)
                    androidx.lifecycle.i0 r7 = r7.mo75002a(r0)
                    dk1.g r7 = (dk1.C58312g) r7
                    dk1.g$a r7 = r7.f166971i
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r8 = r6.f159532d
                    java.util.ArrayList<dk1.a> r8 = r8.f159517i
                    java.lang.Object r8 = sx3.C110818d0.m150917O(r8, r9)
                    dk1.a r8 = (dk1.C58307a) r8
                    r7.getClass()
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>()
                    java.lang.String r10 = "banner_type"
                    java.lang.String r0 = "common_recmd"
                    r2.put(r10, r0)
                    int r10 = r7.f166972a
                    java.lang.String r10 = java.lang.String.valueOf(r10)
                    java.lang.String r0 = "active_id"
                    r2.put(r0, r10)
                    java.lang.String r10 = java.lang.String.valueOf(r9)
                    java.lang.String r0 = "active_index"
                    r2.put(r0, r10)
                    if (r8 == 0) goto L_0x00cf
                    al1.h r10 = r8.f166953d
                    com.tencent.mm.live.api.LiveConfig r10 = r10.f151977d
                    long r0 = r10.f157064e
                    java.lang.String r10 = o40.C61926c.m72691p(r0)
                    java.lang.String r0 = "liveId"
                    r2.put(r0, r10)
                    al1.h r10 = r8.f166953d
                    com.tencent.mm.live.api.LiveConfig r10 = r10.f151977d
                    long r0 = r10.f157075s
                    java.lang.String r10 = o40.C61926c.m72691p(r0)
                    java.lang.String r0 = "feedId"
                    r2.put(r0, r10)
                L_0x00cf:
                    java.lang.Class<ak1.o> r10 = ak1.C54108o.class
                    di3.d r10 = di3.C86312j.m106911c(r10)
                    java.lang.String r0 = "getService(HellLiveReport::class.java)"
                    gy3.C87412m.m108593f(r10, r0)
                    r0 = r10
                    ht1.j5 r0 = (ht1.C8777j5) r0
                    ak1.f0$m r1 = ak1.C54067f0.C0064m.SIDEBAR_CARD
                    r3 = 0
                    r4 = 4
                    r5 = 0
                    ht1.C8777j5.C8778a.m8606g(r0, r1, r2, r3, r4, r5)
                    dk1.g r10 = dk1.C58312g.this
                    java.lang.String r10 = r10.f166966d
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "report reportSideBarItemClick "
                    r0.append(r1)
                    int r7 = r7.f166972a
                    r0.append(r7)
                    java.lang.String r7 = ", "
                    r0.append(r7)
                    r0.append(r9)
                    r0.append(r7)
                    r1 = 0
                    if (r8 == 0) goto L_0x0112
                    al1.h r3 = r8.f166953d
                    if (r3 == 0) goto L_0x0112
                    com.tencent.mm.live.api.LiveConfig r3 = r3.f151977d
                    if (r3 == 0) goto L_0x0112
                    long r3 = r3.f157064e
                    goto L_0x0113
                L_0x0112:
                    r3 = r1
                L_0x0113:
                    java.lang.String r3 = o40.C61926c.m72691p(r3)
                    r0.append(r3)
                    r0.append(r7)
                    if (r8 == 0) goto L_0x0129
                    al1.h r7 = r8.f166953d
                    if (r7 == 0) goto L_0x0129
                    com.tencent.mm.live.api.LiveConfig r7 = r7.f151977d
                    if (r7 == 0) goto L_0x0129
                    long r1 = r7.f157075s
                L_0x0129:
                    java.lang.String r7 = o40.C61926c.m72691p(r1)
                    r0.append(r7)
                    r7 = 32
                    r0.append(r7)
                    java.lang.String r7 = r0.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r7)
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r7 = r6.f159532d
                    int r8 = r7.f159518j
                    r7.mo77739f(r9)
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar r7 = r6.f159532d
                    com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$a r7 = r7.f159514f
                    if (r7 == 0) goto L_0x014c
                    r7.mo77526a(r9, r8)
                L_0x014c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.live.sidebar.FinderLiveSideBar.FinderLiveSideBarConfig.C55955b.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$c */
        public static final class C55956c implements C60907t {

            /* renamed from: a */
            public final /* synthetic */ FinderLiveSideBarConfig f159533a;

            /* renamed from: b */
            public final /* synthetic */ FinderLiveSideBar f159534b;

            /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$c$a */
            public static final class C55957a extends C87413o implements C32224a<C13598b0> {

                /* renamed from: d */
                public final /* synthetic */ RecyclerView f159535d;

                /* renamed from: e */
                public final /* synthetic */ FinderLiveSideBarConfig f159536e;

                /* renamed from: f */
                public final /* synthetic */ FinderLiveSideBar f159537f;

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                public C55957a(RecyclerView recyclerView, FinderLiveSideBarConfig finderLiveSideBarConfig, FinderLiveSideBar finderLiveSideBar) {
                    super(0);
                    this.f159535d = recyclerView;
                    this.f159536e = finderLiveSideBarConfig;
                    this.f159537f = finderLiveSideBar;
                }

                public Object invoke() {
                    RecyclerView.LayoutManager layoutManager = this.f159535d.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager != null) {
                        FinderLiveSideBarConfig finderLiveSideBarConfig = this.f159536e;
                        FinderLiveSideBar finderLiveSideBar = this.f159537f;
                        int z = linearLayoutManager.mo17004z();
                        int D = linearLayoutManager.mo16958D();
                        View view = finderLiveSideBarConfig.f159526e;
                        int i = 8;
                        if (view != null) {
                            int i2 = D != finderLiveSideBar.f159517i.size() + -1 ? 0 : 8;
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(Integer.valueOf(i2));
                            View view2 = view;
                            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$2$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$2$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                        View view3 = finderLiveSideBarConfig.f159525d;
                        if (view3 != null) {
                            if (z != 0) {
                                i = 0;
                            }
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(Integer.valueOf(i));
                            View view4 = view3;
                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$2$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$2$2$onScrollStatsChanged$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            public C55956c(FinderLiveSideBarConfig finderLiveSideBarConfig, FinderLiveSideBar finderLiveSideBar) {
                this.f159533a = finderLiveSideBarConfig;
                this.f159534b = finderLiveSideBar;
            }

            /* renamed from: a */
            public void mo2587a(RecyclerView recyclerView, C60906r rVar) {
                C87412m.m108594g(recyclerView, "recyclerView");
                C87412m.m108594g(rVar, "data");
                C61926c.m72668M(new C55957a(recyclerView, this.f159533a, this.f159534b));
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$d */
        public static final class C55958d extends RecyclerView.C0129l {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveSideBar f159538d;

            public C55958d(FinderLiveSideBar finderLiveSideBar) {
                this.f159538d = finderLiveSideBar;
            }

            /* renamed from: g */
            public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
                C87412m.m108594g(rect, "outRect");
                C87412m.m108594g(view, "view");
                C87412m.m108594g(recyclerView, "parent");
                C87412m.m108594g(wVar, "state");
                RecyclerView.C16631z F0 = this.f159538d.mo77736c().mo17021F0(view);
                int dimension = ((int) view.getContext().getResources().getDimension(C0966R.dimen.f3723cd)) - C76577a.m92151b(view.getContext(), 2);
                if (F0 != null && F0.mo17363j() == 0) {
                    rect.left = dimension;
                    rect.right = dimension;
                    rect.bottom = 0;
                    rect.top = 0;
                    return;
                }
                rect.left = dimension;
                rect.right = dimension;
                rect.bottom = 0;
                rect.top = dimension;
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$e */
        public static final class C55959e extends C23555k.C23558c {

            /* renamed from: a */
            public final /* synthetic */ FinderLiveSideBar f159539a;

            public C55959e(FinderLiveSideBar finderLiveSideBar) {
                this.f159539a = finderLiveSideBar;
            }

            /* renamed from: d */
            public boolean mo777d() {
                return true;
            }

            /* renamed from: e */
            public void mo778e(View view, List<? extends RecyclerView.C16631z> list) {
                C87412m.m108594g(view, "parent");
                C87412m.m108594g(list, "exposedHolders");
                FinderLiveSideBar finderLiveSideBar = this.f159539a;
                if (finderLiveSideBar.f159520l) {
                    C58312g.C58313a aVar = ((C58312g) C39818r.f106831a.mo62443b(finderLiveSideBar.mo77735b()).mo75002a(C58312g.class)).f166971i;
                    ArrayList<C58307a> arrayList = this.f159539a.f159517i;
                    aVar.getClass();
                    C87412m.m108594g(arrayList, "sideBarDataList");
                    HashSet hashSet = new HashSet();
                    RecyclerView.C16631z zVar = (RecyclerView.C16631z) C110818d0.m150916N(list);
                    int j = zVar != null ? zVar.mo17363j() : 1000;
                    int i = -1;
                    for (RecyclerView.C16631z zVar2 : list) {
                        if (zVar2.mo17363j() > i && zVar2.mo17363j() >= 0) {
                            i = zVar2.mo17363j();
                        }
                        if (zVar2.mo17363j() < j && zVar2.mo17363j() >= 0) {
                            j = zVar2.mo17363j();
                        }
                    }
                    if (j <= i) {
                        while (true) {
                            hashSet.add(Integer.valueOf(j));
                            if (j == i) {
                                break;
                            }
                            j++;
                        }
                    }
                    C61926c.m72657B("SideBarReport", true, new C58310d(hashSet, aVar, C58312g.this, arrayList));
                }
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$f */
        public static final class C55960f extends RecyclerView.C0130p {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveSideBar f159540d;

            public C55960f(FinderLiveSideBar finderLiveSideBar) {
                this.f159540d = finderLiveSideBar;
            }

            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                FinderLiveSideBar finderLiveSideBar;
                C55962a aVar;
                ArrayList arrayList = new ArrayList();
                arrayList.add(recyclerView);
                arrayList.add(Integer.valueOf(i));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
                C87412m.m108594g(recyclerView, "recyclerView");
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    RecyclerView.LayoutManager layoutManager = this.f159540d.mo77736c().getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    int E = linearLayoutManager != null ? linearLayoutManager.mo16959E() : 0;
                    if (E == this.f159540d.f159517i.size() - 1 && (aVar = finderLiveSideBar.f159514f) != null) {
                        aVar.mo77530e(E, (finderLiveSideBar = this.f159540d).f159517i.size());
                    }
                }
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            }

            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(recyclerView);
                arrayList.add(Integer.valueOf(i));
                arrayList.add(Integer.valueOf(i2));
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
                super.onScrolled(recyclerView, i, i2);
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$5", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
            }
        }

        /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$g */
        public static final class C55961g extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderLiveSideBar f159541d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C55961g(FinderLiveSideBar finderLiveSideBar) {
                super(0);
                this.f159541d = finderLiveSideBar;
            }

            public Object invoke() {
                this.f159541d.f159520l = true;
                return C13598b0.f38549a;
            }
        }

        public FinderLiveSideBarConfig() {
        }

        /* renamed from: a */
        public void mo77743a(ConstraintLayout constraintLayout) {
            C87412m.m108594g(constraintLayout, "bodyRoot");
            ViewParent parent = FinderLiveSideBar.this.f159509a.getParent();
            C87412m.m108592e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(FinderLiveSideBar.this.f159509a);
            constraintLayout.addView(FinderLiveSideBar.this.f159509a, 0, new ConstraintLayout.LayoutParams(-1, -1));
            this.f159529h = constraintLayout;
            View findViewById = constraintLayout.findViewById(C0966R.C0970id.g0g);
            this.f159527f = findViewById;
            if (findViewById != null) {
                findViewById.setOnClickListener(new C55954a(FinderLiveSideBar.this));
            }
        }

        /* renamed from: b */
        public void mo77744b(ConstraintLayout constraintLayout) {
            C87412m.m108594g(constraintLayout, "footer");
        }

        /* renamed from: c */
        public void mo77745c(ConstraintLayout constraintLayout) {
            C87412m.m108594g(constraintLayout, "header");
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            ((ConstraintLayout.LayoutParams) layoutParams).height = C76577a.m92151b(constraintLayout.getContext(), 64) + C75044y4.m89994f(constraintLayout.getContext());
            this.f159523b = (TextView) constraintLayout.findViewById(C0966R.C0970id.fsq);
            this.f159524c = (ImageView) constraintLayout.findViewById(C0966R.C0970id.mfm);
            TextView textView = this.f159523b;
            if (textView != null) {
                textView.setAlpha(0.0f);
            }
        }

        /* renamed from: d */
        public void mo77746d(ConstraintLayout constraintLayout) {
            ConstraintLayout constraintLayout2 = constraintLayout;
            C87412m.m108594g(constraintLayout2, "sideBarRoot");
            this.f159525d = constraintLayout2.findViewById(C0966R.C0970id.jkm);
            this.f159526e = constraintLayout2.findViewById(C0966R.C0970id.jkl);
            View view = this.f159525d;
            if (view != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View view2 = this.f159526e;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            FinderLiveSideBar finderLiveSideBar = FinderLiveSideBar.this;
            View findViewById = constraintLayout2.findViewById(C0966R.C0970id.fu8);
            C87412m.m108593f(findViewById, "sideBarRoot.findViewById(R.id.live_group_rv)");
            finderLiveSideBar.getClass();
            finderLiveSideBar.f159515g = (WxRecyclerView) findViewById;
            WxRecyclerView c = FinderLiveSideBar.this.mo77736c();
            Context context = constraintLayout.getContext();
            C87412m.m108593f(context, "sideBarRoot.context");
            c.setLayoutManager(new FinderLinearLayoutManager(context));
            WxRecyclerView c2 = FinderLiveSideBar.this.mo77736c();
            WxRecyclerAdapter wxRecyclerAdapter = new WxRecyclerAdapter(new FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$1(), FinderLiveSideBar.this.f159517i, true);
            FinderLiveSideBar finderLiveSideBar2 = FinderLiveSideBar.this;
            wxRecyclerAdapter.f173488o = new C55955b(finderLiveSideBar2);
            wxRecyclerAdapter.f165737C = new C55956c(this, finderLiveSideBar2);
            c2.setAdapter(wxRecyclerAdapter);
            FinderLiveSideBar.this.mo77736c().mo17085h0(new C55958d(FinderLiveSideBar.this));
            C23564m.m28137g(FinderLiveSideBar.this.mo77736c(), new C55959e(FinderLiveSideBar.this));
            FinderLiveSideBar.this.mo77736c().mo17043c(new C55960f(FinderLiveSideBar.this));
        }

        /* renamed from: e */
        public long mo77747e() {
            return 300;
        }

        /* renamed from: f */
        public void mo77748f(boolean z) {
            boolean z2;
            FinderLiveSideBarConfig finderLiveSideBarConfig;
            boolean z3 = z;
            C54067f0.C54076o0 o0Var = C54067f0.C54076o0.SIDE_BAR;
            Class cls = C54116w.class;
            Class cls2 = C60172g4.class;
            C39818r rVar = C39818r.f106831a;
            C39622i0 a = rVar.mo62443b(FinderLiveSideBar.this.mo77735b()).mo75002a(C58312g.class);
            C87412m.m108593f(a, "UICProvider.of(context).…veSideBarUIC::class.java)");
            C58312g gVar = (C58312g) a;
            if (!z3 || this.f159528g) {
                String str = ", ";
                if (!z3) {
                    finderLiveSideBarConfig = this;
                    if (finderLiveSideBarConfig.f159528g) {
                        C58312g.C58313a aVar = gVar.f166971i;
                        aVar.getClass();
                        long c = C31543z5.m39453c() - aVar.f166973b;
                        String a2 = aVar.mo83063a(aVar.mo83063a(aVar.mo83063a(aVar.mo83063a(((C60172g4) rVar.mo62443b(C58312g.this.getContext()).mo62447c(cls2)).mo12868z3(), "event_type", "2"), "model_operat_type", String.valueOf(aVar.f166979h)), "model_stay_time", String.valueOf(c)), "active_id", String.valueOf(aVar.f166972a));
                        C54116w wVar = (C54116w) C86312j.m106911c(cls);
                        wVar.getClass();
                        C87412m.m108594g(a2, "chnlExtra");
                        String str2 = str;
                        C54116w.Ex0(wVar, o0Var, "", 0, (String) null, "temp_33", a2, (String) null, (String) null, 204, (Object) null);
                        String str3 = C58312g.this.f166966d;
                        Log.m105924i(str3, C58312g.this.f166971i.hashCode() + "report reportExitSideBar " + aVar.f166979h + str2 + c + str2 + a2);
                        aVar.f166979h = 2;
                        aVar.f166980i.clear();
                        z2 = false;
                        FinderLiveSideBar.this.f159520l = false;
                    } else {
                        z2 = false;
                    }
                } else {
                    z2 = false;
                    finderLiveSideBarConfig = this;
                }
                z3 = z;
            } else {
                C58312g.C58313a aVar2 = gVar.f166971i;
                WxRecyclerView c2 = FinderLiveSideBar.this.mo77736c();
                FinderLiveSideBar finderLiveSideBar = FinderLiveSideBar.this;
                ArrayList<C58307a> arrayList = finderLiveSideBar.f159517i;
                C55961g gVar2 = new C55961g(finderLiveSideBar);
                aVar2.getClass();
                C87412m.m108594g(arrayList, "sideBarDataList");
                RecyclerView.LayoutManager layoutManager = c2.getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int C = ((LinearLayoutManager) layoutManager).mo16957C();
                RecyclerView.LayoutManager layoutManager2 = c2.getLayoutManager();
                C87412m.m108592e(layoutManager2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                C61926c.m72657B("SideBarReport", true, new C58311f(C, ((LinearLayoutManager) layoutManager2).mo16959E(), aVar2, arrayList, gVar2));
                C58312g.C58313a aVar3 = gVar.f166971i;
                aVar3.getClass();
                aVar3.f166973b = C31543z5.m39453c();
                String a3 = aVar3.mo83063a(aVar3.mo83063a(aVar3.mo83063a(((C60172g4) rVar.mo62443b(C58312g.this.getContext()).mo62447c(cls2)).mo12868z3(), "event_type", "1"), "model_operat_type", String.valueOf(aVar3.f166978g)), "active_id", String.valueOf(aVar3.f166972a));
                C54116w wVar2 = (C54116w) C86312j.m106911c(cls);
                wVar2.getClass();
                C87412m.m108594g(a3, "chnlExtra");
                C54116w.Ex0(wVar2, o0Var, "", 0, (String) null, "temp_33", a3, (String) null, (String) null, 204, (Object) null);
                String str4 = C58312g.this.f166966d;
                Log.m105924i(str4, C58312g.this.f166971i.hashCode() + "report reportEnterSideBar " + aVar3.f166978g + ", " + a3);
                aVar3.f166978g = 2;
                aVar3.f166980i.clear();
                z2 = false;
                finderLiveSideBarConfig = this;
            }
            gVar.mo83061c3(z3);
            int i = 8;
            if (z3) {
                ImageView imageView = finderLiveSideBarConfig.f159524c;
                if (imageView != null) {
                    if (finderLiveSideBarConfig.f159522a) {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                }
            } else {
                finderLiveSideBarConfig.f159522a = z2;
                ImageView imageView2 = finderLiveSideBarConfig.f159524c;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
            }
            C55962a aVar4 = FinderLiveSideBar.this.f159514f;
            if (aVar4 != null) {
                aVar4.mo77527b(z3);
            }
        }

        /* renamed from: g */
        public void mo77749g(float f) {
            TextView textView = this.f159523b;
            if (textView != null) {
                textView.setAlpha(f);
            }
            View view = this.f159529h;
            Integer num = null;
            ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            View view2 = this.f159529h;
            ViewParent parent = view2 != null ? view2.getParent() : null;
            View view3 = parent instanceof View ? (View) parent : null;
            if (view3 != null) {
                num = Integer.valueOf(view3.getHeight());
            }
            int i = 0;
            int i2 = layoutParams2 != null ? layoutParams2.width : 0;
            if (!(num == null || layoutParams2 == null)) {
                i = (num.intValue() - layoutParams2.topMargin) - layoutParams2.bottomMargin;
            }
            C55962a aVar = FinderLiveSideBar.this.f159514f;
            if (aVar != null) {
                aVar.mo77528c(f, i2, i);
            }
        }

        /* renamed from: h */
        public void mo77750h(boolean z) {
            Class cls = C58312g.class;
            C39818r rVar = C39818r.f106831a;
            this.f159528g = ((C58312g) rVar.mo62443b(FinderLiveSideBar.this.mo77735b()).mo75002a(cls)).f166967e;
            ((C58312g) rVar.mo62443b(FinderLiveSideBar.this.mo77735b()).mo75002a(cls)).mo83061c3(true);
            C55962a aVar = FinderLiveSideBar.this.f159514f;
            if (aVar != null) {
                aVar.mo77529d(z);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$a */
    public interface C55962a {
        /* renamed from: a */
        void mo77526a(int i, int i2);

        /* renamed from: b */
        void mo77527b(boolean z);

        /* renamed from: c */
        void mo77528c(float f, int i, int i2);

        /* renamed from: d */
        void mo77529d(boolean z);

        /* renamed from: e */
        void mo77530e(int i, int i2);
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$b */
    public static final class C55963b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderLiveSideBar f159542d;

        public C55963b(FinderLiveSideBar finderLiveSideBar) {
            this.f159542d = finderLiveSideBar;
        }

        public final void run() {
            Context context = this.f159542d.mo77736c().getContext();
            C87412m.m108593f(context, "sideBarRv.context");
            C58985a aVar = new C58985a(context);
            FinderLiveSideBar finderLiveSideBar = this.f159542d;
            aVar.f44872a = finderLiveSideBar.f159518j;
            RecyclerView.LayoutManager layoutManager = finderLiveSideBar.mo77736c().getLayoutManager();
            if (layoutManager != null) {
                layoutManager.startSmoothScroll(aVar);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$c */
    public static final class C55964c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C32224a<C13598b0> f159543d;

        public C55964c(C32224a<C13598b0> aVar) {
            this.f159543d = aVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f159543d;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$show$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    public FinderLiveSideBar(View view) {
        C87412m.m108594g(view, "liveContainer");
        this.f159509a = view;
    }

    /* renamed from: a */
    public final void mo77734a(String str) {
        C87412m.m108594g(str, "sceneId");
        String str2 = this.f159510b;
        Log.m105924i(str2, "addDragBarrier " + str);
        this.f159513e.add(str);
        C60909a aVar = this.f159511c;
        if (aVar != null) {
            aVar.f173522h.post(new C60917d(aVar));
        } else {
            C87412m.m108603p("finderSideBar");
            throw null;
        }
    }

    /* renamed from: b */
    public final Context mo77735b() {
        Context context = this.f159516h;
        if (context != null) {
            return context;
        }
        C87412m.m108603p("context");
        throw null;
    }

    /* renamed from: c */
    public final WxRecyclerView mo77736c() {
        WxRecyclerView wxRecyclerView = this.f159515g;
        if (wxRecyclerView != null) {
            return wxRecyclerView;
        }
        C87412m.m108603p("sideBarRv");
        throw null;
    }

    /* renamed from: d */
    public final void mo77737d() {
        Log.m105924i(this.f159510b, "hide");
        C60909a aVar = this.f159511c;
        if (aVar != null) {
            aVar.f173519e.f312948A = 0;
            aVar.f173521g.mo77750h(false);
            aVar.mo85824d(aVar.f173519e, 0.0f, 1.0f, new C60915b(aVar));
            return;
        }
        C87412m.m108603p("finderSideBar");
        throw null;
    }

    /* renamed from: e */
    public final void mo77738e(String str) {
        C87412m.m108594g(str, "sceneId");
        String str2 = this.f159510b;
        Log.m105924i(str2, "removeDragBarrier " + str);
        this.f159513e.remove(str);
        mo77742i(this.f159512d);
    }

    /* renamed from: f */
    public final void mo77739f(int i) {
        String str = this.f159510b;
        Log.m105924i(str, "select position:" + i + ", sideBarDataList.size:" + this.f159517i.size() + ", curPosition:" + this.f159518j);
        if (i >= 0 && i < this.f159517i.size() && this.f159518j != i) {
            this.f159518j = i;
            int i2 = 0;
            for (T next : this.f159517i) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    ((C58307a) next).f166954e = i2 == i;
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            RecyclerView.C16613e adapter = mo77736c().getAdapter();
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
            mo77736c().post(new C55963b(this));
        }
    }

    /* renamed from: g */
    public final void mo77740g(int i) {
        View view = this.f159521m.f159527f;
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i));
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar", "setHideBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar", "setHideBtnVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* renamed from: h */
    public final void mo77741h(boolean z, C32224a<C13598b0> aVar) {
        String str = this.f159510b;
        Log.m105924i(str, "show isShowExitBtn=" + z);
        ((C58312g) C39818r.f106831a.mo62443b(mo77735b()).mo75002a(C58312g.class)).f166971i.f166978g = 1;
        if (this.f159517i.size() > 0) {
            FinderLiveSideBarConfig finderLiveSideBarConfig = this.f159521m;
            finderLiveSideBarConfig.f159522a = z;
            ImageView imageView = finderLiveSideBarConfig.f159524c;
            if (imageView != null) {
                imageView.setOnClickListener(new C55964c(aVar));
            }
            C60909a aVar2 = this.f159511c;
            if (aVar2 != null) {
                aVar2.f173519e.f312948A = 0;
                aVar2.f173521g.mo77750h(true);
                aVar2.mo85824d(aVar2.f173519e, 0.0f, 1.0f, new C60916c(aVar2));
                return;
            }
            C87412m.m108603p("finderSideBar");
            throw null;
        }
        Log.m105928w(this.f159510b, "sideBar list is empty, cannot show");
    }

    /* renamed from: i */
    public final void mo77742i(boolean z) {
        String str = this.f159510b;
        Log.m105924i(str, "toggleSideBar from:" + z + ", to:" + z + ", barrierSet size:" + this.f159513e.size());
        this.f159512d = z;
        if (!z || !this.f159513e.isEmpty()) {
            C60909a aVar = this.f159511c;
            if (aVar != null) {
                aVar.f173522h.post(new C60917d(aVar));
            } else {
                C87412m.m108603p("finderSideBar");
                throw null;
            }
        } else {
            C60909a aVar2 = this.f159511c;
            if (aVar2 != null) {
                aVar2.f173522h.post(new C60918e(aVar2));
            } else {
                C87412m.m108603p("finderSideBar");
                throw null;
            }
        }
    }
}

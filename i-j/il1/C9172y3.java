package il1;

import a14.C53872d1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C0696x;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveFansClubAnnouncementView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import er1.C7919x;
import fj1.C45795b;
import fy3.C32224a;
import gg1.C32444a;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CancellationException;
import jl1.C9466a;
import jl1.C9468c;
import jq3.C60898l;
import jq3.C60905o;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import ok1.C62042e;
import p629ny.C76979h;
import qj1.C62660c;
import qo3.C12925w;
import qo3.C77407n;
import qo3.C89779i0;
import qo3.w$$c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C50326ly0;
import te3.C50689oj;
import te3.C50767p11;
import wx3.C15601d;

/* renamed from: il1.y3 */
public final class C9172y3 extends C9120u0 {

    /* renamed from: y */
    public static final /* synthetic */ int f28869y = 0;

    /* renamed from: h */
    public C32224a<C13598b0> f28870h;

    /* renamed from: i */
    public View f28871i;

    /* renamed from: j */
    public final TextView f28872j;

    /* renamed from: n */
    public final C9466a f28873n;

    /* renamed from: o */
    public C9143v3 f28874o;

    /* renamed from: p */
    public C9048l3 f28875p;

    /* renamed from: q */
    public C9030k2 f28876q;

    /* renamed from: r */
    public C12925w f28877r;

    /* renamed from: s */
    public FinderLiveFansClubAnnouncementView f28878s;

    /* renamed from: t */
    public C77407n f28879t;

    /* renamed from: u */
    public final int f28880u = 1;

    /* renamed from: v */
    public final int f28881v = 2;

    /* renamed from: w */
    public C53973z1 f28882w;

    /* renamed from: x */
    public final C13601g f28883x = C36568h.m40985a(new C9181g(this));

    /* renamed from: il1.y3$a */
    public static final class C9173a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28884d;

        public C9173a(C9172y3 y3Var) {
            this.f28884d = y3Var;
        }

        public final void onClick(View view) {
            C13598b0 b0Var;
            C9143v3 v3Var;
            C9143v3 v3Var2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9172y3 y3Var = this.f28884d;
            if (y3Var.f28874o == null) {
                Context context = y3Var.getContext();
                C87412m.m108593f(context, "context");
                C9143v3 v3Var3 = new C9143v3(context);
                v3Var3.setBackClickListener(new C8959d4(y3Var));
                y3Var.f28874o = v3Var3;
            }
            C62660c basePlugin = y3Var.getBasePlugin();
            if (basePlugin == null || (v3Var2 = y3Var.f28874o) == null) {
                b0Var = null;
            } else {
                v3Var2.mo9935a(basePlugin);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null && (v3Var = y3Var.f28874o) != null) {
                v3Var.setScope(y3Var.getScope());
            }
            C9143v3 v3Var4 = y3Var.f28874o;
            if (v3Var4 != null) {
                v3Var4.mo9957c(y3Var.f28877r);
            }
            Class cls = C54108o.class;
            C54991o oVar = (C54991o) FinderLiveService.f159376d.mo77630e(C54991o.class);
            boolean z = true;
            if (oVar == null || !oVar.mo75999e4()) {
                z = false;
            }
            if (z) {
                ((C54108o) C86312j.m106911c(cls)).mo9619wD(C0073g0.FANS_CLUB, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, (String) null);
            } else {
                ((C54108o) C86312j.m106911c(cls)).tw0(27, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, (String) null);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.y3$b */
    public static final class C9174b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28885d;

        public C9174b(C9172y3 y3Var) {
            this.f28885d = y3Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C12925w wVar = this.f28885d.getModifyBottomPage().f36949a;
            if (wVar != null) {
                wVar.mo5085n();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.y3$c */
    public static final class C9175c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28886d;

        public C9175c(C9172y3 y3Var) {
            this.f28886d = y3Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9172y3 y3Var = this.f28886d;
            y3Var.getClass();
            y3Var.postDelayed(new C8937b4(y3Var), 300);
            C32224a<C13598b0> aVar = y3Var.f28870h;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.y3$d */
    public static final class C9176d extends RecyclerView.C0129l {

        /* renamed from: d */
        public final /* synthetic */ Context f28887d;

        public C9176d(Context context) {
            this.f28887d = context;
        }

        /* renamed from: g */
        public void mo21g(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
            C87412m.m108594g(rect, "outRect");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(recyclerView, "parent");
            C87412m.m108594g(wVar, "state");
            rect.bottom = this.f28887d.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        }
    }

    /* renamed from: il1.y3$e */
    public static final class C9177e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28888d;

        /* renamed from: il1.y3$e$a */
        public static final class C9178a implements C11182m0 {

            /* renamed from: d */
            public final /* synthetic */ C9172y3 f28889d;

            public C9178a(C9172y3 y3Var) {
                this.f28889d = y3Var;
            }

            public final void onCreateMMMenu(C76874e0 e0Var) {
                C77407n nVar = this.f28889d.f28879t;
                if (nVar != null) {
                    nVar.mo107567l((View) null);
                }
                e0Var.clear();
                C9172y3 y3Var = this.f28889d;
                e0Var.mo107142f(y3Var.f28881v, y3Var.getRoot().getContext().getString(C0966R.string.mfn));
                C9172y3 y3Var2 = this.f28889d;
                e0Var.mo107140d(y3Var2.f28880u, y3Var2.getRoot().getContext().getResources().getColor(C0966R.color.f356948a24), this.f28889d.getRoot().getContext().getString(C0966R.string.mf9));
            }
        }

        /* renamed from: il1.y3$e$b */
        public static final class C9179b implements C11184p0 {

            /* renamed from: d */
            public final /* synthetic */ C9172y3 f28890d;

            /* renamed from: e */
            public final /* synthetic */ C50689oj f28891e;

            public C9179b(C9172y3 y3Var, C50689oj ojVar) {
                this.f28890d = y3Var;
                this.f28891e = ojVar;
            }

            public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C55908a viewScope;
                int itemId = menuItem.getItemId();
                C9172y3 y3Var = this.f28890d;
                if (itemId == y3Var.f28880u) {
                    C53973z1 z1Var = y3Var.f28882w;
                    C53973z1 z1Var2 = null;
                    if (z1Var != null) {
                        C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                    }
                    C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
                    C50326ly0 ly02 = xVar != null ? xVar.f1644g : null;
                    if (ly02 != null) {
                        C8479f0 f0Var = new C8479f0();
                        f0Var.f27484d = C89779i0.m112248e(y3Var.f28871i.getContext(), y3Var.f28871i.getContext().getString(C0966R.string.gat), true, 3, (DialogInterface.OnCancelListener) null);
                        C56032b bVar = FinderLiveService.f159379g;
                        if (!(bVar == null || (viewScope = bVar.getViewScope()) == null)) {
                            z1Var2 = C53895h.m60466d(viewScope, C53872d1.f151119c, (C53934p0) null, new C9187z3(ly02, y3Var, f0Var, (C15601d<? super C9187z3>) null), 2, (Object) null);
                        }
                        y3Var.f28882w = z1Var2;
                        C89779i0 i0Var = (C89779i0) f0Var.f27484d;
                        if (i0Var != null) {
                            i0Var.setOnDismissListener(new C8932a4(y3Var));
                        }
                        C89779i0 i0Var2 = (C89779i0) f0Var.f27484d;
                        if (i0Var2 != null) {
                            i0Var2.show();
                        }
                    }
                } else if (itemId == y3Var.f28881v) {
                    C9172y3.m8836c(y3Var, this.f28891e);
                }
            }
        }

        public C9177e(C9172y3 y3Var) {
            this.f28888d = y3Var;
        }

        /* JADX WARNING: Removed duplicated region for block: B:32:0x00a4  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r9) {
            /*
                r8 = this;
                java.lang.Class<cl1.x> r0 = cl1.C0696x.class
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r1.add(r9)
                java.lang.Object[] r7 = r1.toArray()
                r1.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$5"
                java.lang.String r3 = "android/view/View$OnClickListener"
                java.lang.String r4 = "onClick"
                java.lang.String r5 = "(Landroid/view/View;)V"
                r6 = r8
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                java.lang.String r9 = "6"
                java.lang.Class<ak1.o> r1 = ak1.C54108o.class
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.o> r3 = cl1.C54991o.class
                androidx.lifecycle.i0 r2 = r2.mo77630e(r3)
                cl1.o r2 = (cl1.C54991o) r2
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L_0x0037
                boolean r2 = r2.mo75999e4()
                if (r2 != r4) goto L_0x0037
                r2 = 1
                goto L_0x0038
            L_0x0037:
                r2 = 0
            L_0x0038:
                r5 = 0
                if (r2 == 0) goto L_0x0047
                di3.d r1 = di3.C86312j.m106911c(r1)
                ak1.o r1 = (ak1.C54108o) r1
                ak1.g0 r2 = ak1.C0073g0.FANS_CLUB
                r1.mo9619wD(r2, r9, r5)
                goto L_0x0052
            L_0x0047:
                di3.d r1 = di3.C86312j.m106911c(r1)
                ak1.o r1 = (ak1.C54108o) r1
                r6 = 27
                r1.tw0(r6, r9, r5)
            L_0x0052:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                androidx.lifecycle.i0 r1 = r9.mo77630e(r0)
                cl1.x r1 = (cl1.C0696x) r1
                if (r1 == 0) goto L_0x00a1
                te3.ly0 r1 = r1.f1644g
                if (r1 == 0) goto L_0x00a1
                te3.oj r1 = r1.f137713n
                if (r1 == 0) goto L_0x00a1
                java.lang.String r2 = r1.f139210e
                if (r2 == 0) goto L_0x006a
                r2 = 1
                goto L_0x006b
            L_0x006a:
                r2 = 0
            L_0x006b:
                if (r2 == 0) goto L_0x006e
                goto L_0x006f
            L_0x006e:
                r1 = r5
            L_0x006f:
                if (r1 == 0) goto L_0x00a1
                il1.y3 r2 = r8.f28888d
                qo3.n r6 = new qo3.n
                android.view.View r7 = r2.getRoot()
                android.content.Context r7 = r7.getContext()
                r6.<init>((android.content.Context) r7, (int) r4, (boolean) r3)
                r2.f28879t = r6
                r6.mo107570o(r4)
                qo3.n r3 = r2.f28879t
                if (r3 == 0) goto L_0x0090
                il1.y3$e$a r4 = new il1.y3$e$a
                r4.<init>(r2)
                r3.f225771i = r4
            L_0x0090:
                if (r3 == 0) goto L_0x0099
                il1.y3$e$b r4 = new il1.y3$e$b
                r4.<init>(r2, r1)
                r3.f225782p = r4
            L_0x0099:
                if (r3 == 0) goto L_0x00a1
                r3.mo107573q()
                rx3.b0 r1 = rx3.C13598b0.f38549a
                goto L_0x00a2
            L_0x00a1:
                r1 = r5
            L_0x00a2:
                if (r1 != 0) goto L_0x00b7
                il1.y3 r1 = r8.f28888d
                androidx.lifecycle.i0 r9 = r9.mo77630e(r0)
                cl1.x r9 = (cl1.C0696x) r9
                if (r9 == 0) goto L_0x00b4
                te3.ly0 r9 = r9.f1644g
                if (r9 == 0) goto L_0x00b4
                te3.oj r5 = r9.f137713n
            L_0x00b4:
                il1.C9172y3.m8836c(r1, r5)
            L_0x00b7:
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansModifySettingWidget$5"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r8, r9, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C9172y3.C9177e.onClick(android.view.View):void");
        }
    }

    /* renamed from: il1.y3$f */
    public final class C9180f extends w$$c {
        public C9180f() {
        }

        /* renamed from: a */
        public View mo4781a(Context context) {
            C87412m.m108594g(context, "context");
            return C9172y3.this;
        }

        /* renamed from: c */
        public void mo4873c() {
        }
    }

    /* renamed from: il1.y3$g */
    public static final class C9181g extends C87413o implements C32224a<C9180f> {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28893d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9181g(C9172y3 y3Var) {
            super(0);
            this.f28893d = y3Var;
        }

        public Object invoke() {
            return new C9180f();
        }
    }

    /* renamed from: il1.y3$h */
    public static final class C9182h implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C9172y3 f28894d;

        public C9182h(C9172y3 y3Var) {
            this.f28894d = y3Var;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C50767p11 p112;
            C9172y3 y3Var;
            C9048l3 l3Var;
            C9048l3 l3Var2;
            T t;
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g(oVar, "holder");
            C9468c cVar = (C9468c) oVar.f173503E;
            C87412m.m108593f(cVar, "feed");
            C13598b0 b0Var = null;
            if (cVar.f29539e == null) {
                LinkedList<C50767p11> linkedList = cVar.f29538d.f133738h;
                C87412m.m108593f(linkedList, "gift.gifts");
                p112 = (C50767p11) C110818d0.m150916N(linkedList);
            } else {
                LinkedList<C50767p11> linkedList2 = cVar.f29538d.f133738h;
                if (linkedList2 != null) {
                    Iterator<T> it = linkedList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            t = null;
                            break;
                        }
                        t = it.next();
                        if (C87412m.m108589b(((C50767p11) t).f139507d, cVar.f29539e.f138322e)) {
                            break;
                        }
                    }
                    p112 = (C50767p11) t;
                } else {
                    p112 = null;
                }
            }
            if (p112 == null) {
                Log.m105920e("Finder.FinderLiveFansModifySettingWidget", "gift null, do nothing");
                return;
            }
            C9172y3 y3Var2 = this.f28894d;
            if (y3Var2.f28875p == null) {
                Context context = this.f28894d.getContext();
                C87412m.m108593f(context, "context");
                C9048l3 l3Var3 = new C9048l3(context);
                l3Var3.setBackClickListener(new C8965e4(this.f28894d));
                y3Var2.f28875p = l3Var3;
            }
            C62660c basePlugin = this.f28894d.getBasePlugin();
            if (!(basePlugin == null || (l3Var2 = this.f28894d.f28875p) == null)) {
                l3Var2.mo9935a(basePlugin);
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null && (l3Var = y3Var.f28875p) != null) {
                l3Var.setScope((y3Var = this.f28894d).getScope());
            }
            C9172y3 y3Var3 = this.f28894d;
            C9048l3 l3Var4 = y3Var3.f28875p;
            if (l3Var4 != null) {
                l3Var4.mo9878h(y3Var3.f28877r, cVar.f29538d, p112, cVar.f29539e);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9172y3(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.csy, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ng_widget_ui, this, true)");
        this.f28871i = inflate;
        this.f28872j = (TextView) inflate.findViewById(C0966R.C0970id.mpw);
        WxRecyclerView wxRecyclerView = (WxRecyclerView) this.f28871i.findViewById(C0966R.C0970id.mpu);
        C9466a aVar = new C9466a(new ArrayList());
        this.f28873n = aVar;
        View findViewById = this.f28871i.findViewById(C0966R.C0970id.myt);
        C87412m.m108593f(findViewById, "root.findViewById<Finder…nnouncement_content_root)");
        this.f28878s = (FinderLiveFansClubAnnouncementView) findViewById;
        View findViewById2 = this.f28871i.findViewById(C0966R.C0970id.cti);
        C87412m.m108593f(findViewById2, "root.findViewById<TextVi….id.fans_modify_title_tv)");
        C7919x.m8091a((TextView) findViewById2);
        this.f28871i.findViewById(C0966R.C0970id.mpv).setOnClickListener(new C9173a(this));
        this.f28871i.findViewById(C0966R.C0970id.cte).setOnClickListener(new C9174b(this));
        this.f28871i.findViewById(C0966R.C0970id.ctg).setOnClickListener(new C9175c(this));
        wxRecyclerView.setAdapter(aVar);
        wxRecyclerView.setLayoutManager(new LinearLayoutManager(context));
        wxRecyclerView.mo17085h0(new C9176d(context));
        this.f28878s.setOnClickListener(new C9177e(this));
    }

    /* renamed from: c */
    public static final void m8836c(C9172y3 y3Var, C50689oj ojVar) {
        C9030k2 k2Var;
        C9030k2 k2Var2;
        if (y3Var.f28876q == null) {
            Context context = y3Var.getContext();
            C87412m.m108593f(context, "context");
            C9030k2 k2Var3 = new C9030k2(context);
            k2Var3.setBackClickListener(new C8941c4(y3Var));
            y3Var.f28876q = k2Var3;
        }
        C62660c basePlugin = y3Var.getBasePlugin();
        C13598b0 b0Var = null;
        if (!(basePlugin == null || (k2Var2 = y3Var.f28876q) == null)) {
            k2Var2.mo9935a(basePlugin);
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null && (k2Var = y3Var.f28876q) != null) {
            k2Var.setScope(y3Var.getScope());
        }
        C9030k2 k2Var4 = y3Var.f28876q;
        if (k2Var4 != null) {
            k2Var4.mo9852g(y3Var.f28877r, ojVar);
        }
    }

    /* access modifiers changed from: private */
    public final C9180f getModifyBottomPage() {
        return (C9180f) ((C36570n) this.f28883x).getValue();
    }

    /* renamed from: d */
    public final void mo9986d(C12925w wVar) {
        C50326ly0 ly02;
        C50326ly0 ly03;
        Class cls = C0696x.class;
        this.f28877r = wVar;
        C62042e eVar = C62042e.f176370a;
        eVar.mo87010H1(this);
        if (wVar != null) {
            wVar.mo12468h(getModifyBottomPage());
        }
        mo9988f();
        mo9987e();
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        eVar.getClass();
        Integer n = C32444a.f86208v2.mo60266n();
        boolean z = false;
        C50689oj ojVar = null;
        if (!(n.intValue() != -1)) {
            n = null;
        }
        Integer num = n;
        if (num != null) {
            int intValue = num.intValue();
            Log.m105924i("FinderLiveUtil", "[isFansAnnouncementOpen] config = " + intValue);
            if (intValue == 1) {
                z = true;
            }
        } else {
            Boolean valueOf = (bVar == null || (ly03 = ((C0696x) bVar.mo71262a(cls)).f1644g) == null) ? null : Boolean.valueOf(ly03.f137714o);
            Log.m105924i("FinderLiveUtil", "[isFansAnnouncementOpen] svr = " + valueOf);
            z = C87412m.m108589b(valueOf, Boolean.TRUE);
        }
        if (z) {
            FinderLiveFansClubAnnouncementView finderLiveFansClubAnnouncementView = this.f28878s;
            C0696x xVar = (C0696x) finderLiveService.mo77630e(cls);
            if (!(xVar == null || (ly02 = xVar.f1644g) == null)) {
                ojVar = ly02.f137713n;
            }
            finderLiveFansClubAnnouncementView.mo3264b(ojVar);
            return;
        }
        this.f28878s.setVisibility(8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0016, code lost:
        r3 = r3.f1647j;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9987e() {
        /*
            r9 = this;
            java.lang.Class<cl1.x> r0 = cl1.C0696x.class
            jl1.a r1 = r9.f28873n
            java.util.List r1 = r1.getData()
            r1.clear()
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r3 = r2.mo77630e(r0)
            cl1.x r3 = (cl1.C0696x) r3
            r4 = 0
            if (r3 == 0) goto L_0x001d
            te3.ks0 r3 = r3.f1647j
            if (r3 == 0) goto L_0x001d
            java.util.LinkedList<te3.n10> r3 = r3.f137022d
            goto L_0x001e
        L_0x001d:
            r3 = r4
        L_0x001e:
            androidx.lifecycle.i0 r0 = r2.mo77630e(r0)
            cl1.x r0 = (cl1.C0696x) r0
            if (r0 == 0) goto L_0x0066
            java.util.List<te3.fy0> r0 = r0.f1646i
            if (r0 == 0) goto L_0x0066
            java.util.Iterator r0 = r0.iterator()
        L_0x002e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0066
            java.lang.Object r2 = r0.next()
            te3.fy0 r2 = (te3.C49486fy0) r2
            if (r3 == 0) goto L_0x005c
            java.util.Iterator r5 = r3.iterator()
        L_0x0040:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0058
            java.lang.Object r6 = r5.next()
            r7 = r6
            te3.n10 r7 = (te3.C50477n10) r7
            java.lang.String r7 = r7.f138321d
            java.lang.String r8 = r2.f133734d
            boolean r7 = gy3.C87412m.m108589b(r7, r8)
            if (r7 == 0) goto L_0x0040
            goto L_0x0059
        L_0x0058:
            r6 = r4
        L_0x0059:
            te3.n10 r6 = (te3.C50477n10) r6
            goto L_0x005d
        L_0x005c:
            r6 = r4
        L_0x005d:
            jl1.c r5 = new jl1.c
            r5.<init>(r2, r6)
            r1.add(r5)
            goto L_0x002e
        L_0x0066:
            jl1.a r0 = r9.f28873n
            r0.notifyDataSetChanged()
            jl1.a r0 = r9.f28873n
            il1.y3$h r1 = new il1.y3$h
            r1.<init>(r9)
            r0.f173488o = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C9172y3.mo9987e():void");
    }

    /* renamed from: f */
    public final void mo9988f() {
        String str;
        C50326ly0 ly02;
        TextView textView = this.f28872j;
        C76979h hVar = (C76979h) C86312j.m106911c(C76979h.class);
        Context context = getContext();
        C0696x xVar = (C0696x) FinderLiveService.f159376d.mo77630e(C0696x.class);
        if (xVar == null || (ly02 = xVar.f1644g) == null || (str = ly02.f137706d) == null) {
            str = "";
        }
        textView.setText(hVar.mo107057T1(context, str));
    }

    public final C9466a getAdapter() {
        return this.f28873n;
    }

    public final C32224a<C13598b0> getBackClickListener() {
        return this.f28870h;
    }

    public final View getRoot() {
        return this.f28871i;
    }

    public final void setBackClickListener(C32224a<C13598b0> aVar) {
        this.f28870h = aVar;
    }

    public final void setRoot(View view) {
        C87412m.m108594g(view, "<set-?>");
        this.f28871i = view;
    }
}

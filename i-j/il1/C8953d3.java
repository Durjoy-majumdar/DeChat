package il1;

import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54108o;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cl1.C0696x;
import cl1.C54991o;
import cl1.C55001u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.LiveBottomSheetPanel;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.WCWebUpdater;
import di3.C86312j;
import fy3.C32224a;
import fy3.C32226l;
import gg1.C32444a;
import gy3.C87412m;
import gy3.C87413o;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import o40.C61937h;
import ob0.C89132b;
import ok1.C62042e;
import pe3.C89349b;
import qg1.C12227k;
import qj1.C62660c;
import qk1.C12850y0;
import qo3.C12925w;
import qo3.w$$c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49486fy0;
import te3.C49712hj1;
import te3.C49765hx0;
import te3.C52188yz0;
import te3.C64273c21;

/* renamed from: il1.d3 */
public final class C8953d3 extends C9120u0 implements View.OnClickListener {

    /* renamed from: H */
    public static final /* synthetic */ int f28273H = 0;

    /* renamed from: A */
    public C9143v3 f28274A;

    /* renamed from: B */
    public C9172y3 f28275B;

    /* renamed from: C */
    public C53973z1 f28276C;

    /* renamed from: D */
    public C12850y0 f28277D;

    /* renamed from: E */
    public C52188yz0 f28278E;

    /* renamed from: F */
    public boolean f28279F;

    /* renamed from: G */
    public boolean f28280G;

    /* renamed from: h */
    public C12925w f28281h;

    /* renamed from: i */
    public C12925w f28282i;

    /* renamed from: j */
    public final C13601g f28283j = C36568h.m40985a(new C8956c(this));

    /* renamed from: n */
    public int f28284n;

    /* renamed from: o */
    public final View f28285o;

    /* renamed from: p */
    public final View f28286p;

    /* renamed from: q */
    public final LiveBottomSheetPanel f28287q;

    /* renamed from: r */
    public final View f28288r;

    /* renamed from: s */
    public final View f28289s;

    /* renamed from: t */
    public final View f28290t;

    /* renamed from: u */
    public final WeImageView f28291u;

    /* renamed from: v */
    public final TextView f28292v;

    /* renamed from: w */
    public final TextView f28293w;

    /* renamed from: x */
    public final TextView f28294x;

    /* renamed from: y */
    public final TextView f28295y;

    /* renamed from: z */
    public final RecyclerView f28296z;

    /* renamed from: il1.d3$a */
    public final class C8954a extends w$$c {
        public C8954a() {
        }

        /* renamed from: a */
        public View mo4781a(Context context) {
            C87412m.m108594g(context, "context");
            return C8953d3.this;
        }
    }

    /* renamed from: il1.d3$b */
    public static final class C8955b extends C87413o implements C32226l<C49765hx0, C13598b0> {

        /* renamed from: d */
        public static final C8955b f28298d = new C8955b();

        public C8955b() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            C49765hx0 hx02 = (C49765hx0) obj;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.d3$c */
    public static final class C8956c extends C87413o implements C32224a<C8954a> {

        /* renamed from: d */
        public final /* synthetic */ C8953d3 f28299d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8956c(C8953d3 d3Var) {
            super(0);
            this.f28299d = d3Var;
        }

        public Object invoke() {
            return new C8954a();
        }
    }

    /* renamed from: il1.d3$d */
    public static final class C8957d<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ C32226l<C89132b.C89134c<C52188yz0>, C13598b0> f28300a;

        public C8957d(C32226l<? super C89132b.C89134c<C52188yz0>, C13598b0> lVar) {
            this.f28300a = lVar;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            C32226l<C89132b.C89134c<C52188yz0>, C13598b0> lVar = this.f28300a;
            C87412m.m108593f(cVar, LocaleUtil.ITALIAN);
            lVar.invoke(cVar);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: il1.d3$e */
    public static final class C8958e extends C87413o implements C32226l<C89132b.C89134c<C52188yz0>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C8953d3 f28301d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8958e(C8953d3 d3Var) {
            super(1);
            this.f28301d = d3Var;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ad, code lost:
            if (r10 != null) goto L_0x00c8;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Object invoke(java.lang.Object r10) {
            /*
                r9 = this;
                ob0.b$c r10 = (ob0.C89132b.C89134c) r10
                java.lang.String r0 = "it"
                gy3.C87412m.m108594g(r10, r0)
                int r0 = r10.f256793a
                r1 = 0
                r2 = 1
                if (r0 != 0) goto L_0x00f0
                int r0 = r10.f256794b
                if (r0 != 0) goto L_0x00f0
                il1.d3 r0 = r9.f28301d
                T r3 = r10.f256796d
                te3.yz0 r3 = (te3.C52188yz0) r3
                r0.setResp(r3)
                il1.d3 r0 = r9.f28301d
                T r10 = r10.f256796d
                java.lang.String r3 = "it.resp"
                gy3.C87412m.m108593f(r10, r3)
                te3.yz0 r10 = (te3.C52188yz0) r10
                qk1.y0 r3 = r0.f28277D
                java.util.LinkedList<te3.my0> r4 = r10.f145588g
                int r5 = r10.f145587f
                java.util.ArrayList<qk1.y0$d> r6 = r3.f36767d
                r6.clear()
                r3.f36768e = r5
                if (r4 == 0) goto L_0x003d
                boolean r5 = r4.isEmpty()
                if (r5 == 0) goto L_0x003b
                goto L_0x003d
            L_0x003b:
                r5 = 0
                goto L_0x003e
            L_0x003d:
                r5 = 1
            L_0x003e:
                r6 = 0
                if (r5 != 0) goto L_0x0074
                java.util.ArrayList<qk1.y0$d> r5 = r3.f36767d
                qk1.y0$d r7 = new qk1.y0$d
                r7.<init>(r6, r1)
                r5.add(r7)
                java.util.ArrayList<qk1.y0$d> r3 = r3.f36767d
                java.util.ArrayList r5 = new java.util.ArrayList
                r7 = 10
                int r7 = sx3.C36907w.m41090l(r4, r7)
                r5.<init>(r7)
                java.util.Iterator r4 = r4.iterator()
            L_0x005c:
                boolean r7 = r4.hasNext()
                if (r7 == 0) goto L_0x0071
                java.lang.Object r7 = r4.next()
                te3.my0 r7 = (te3.C50465my0) r7
                qk1.y0$d r8 = new qk1.y0$d
                r8.<init>(r7, r2)
                r5.add(r8)
                goto L_0x005c
            L_0x0071:
                r3.addAll(r5)
            L_0x0074:
                android.widget.TextView r3 = r0.f28294x
                java.util.LinkedList<te3.my0> r10 = r10.f145588g
                if (r10 == 0) goto L_0x00b0
                java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
                te3.my0 r10 = (te3.C50465my0) r10
                if (r10 == 0) goto L_0x00b0
                te3.hx0 r10 = r10.f138283d
                if (r10 == 0) goto L_0x00b0
                java.util.LinkedList<te3.aw0> r10 = r10.f134930r
                if (r10 == 0) goto L_0x00b0
                java.util.Iterator r10 = r10.iterator()
            L_0x008e:
                boolean r4 = r10.hasNext()
                if (r4 == 0) goto L_0x00a6
                java.lang.Object r4 = r10.next()
                r5 = r4
                te3.aw0 r5 = (te3.C48770aw0) r5
                int r5 = r5.f130789d
                r7 = 4
                if (r5 != r7) goto L_0x00a2
                r5 = 1
                goto L_0x00a3
            L_0x00a2:
                r5 = 0
            L_0x00a3:
                if (r5 == 0) goto L_0x008e
                goto L_0x00a7
            L_0x00a6:
                r4 = r6
            L_0x00a7:
                te3.aw0 r4 = (te3.C48770aw0) r4
                if (r4 == 0) goto L_0x00b0
                java.lang.String r10 = r4.f130793h
                if (r10 == 0) goto L_0x00b0
                goto L_0x00c8
            L_0x00b0:
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.x> r2 = cl1.C0696x.class
                androidx.lifecycle.i0 r10 = r10.mo77630e(r2)
                cl1.x r10 = (cl1.C0696x) r10
                if (r10 == 0) goto L_0x00c2
                te3.ly0 r10 = r10.f1644g
                if (r10 == 0) goto L_0x00c2
                java.lang.String r6 = r10.f137706d
            L_0x00c2:
                if (r6 == 0) goto L_0x00c6
                r10 = r6
                goto L_0x00c8
            L_0x00c6:
                java.lang.String r10 = ""
            L_0x00c8:
                r3.setText(r10)
                qk1.y0 r10 = r0.f28277D
                int r10 = r10.getItemCount()
                r2 = 8
                if (r10 > 0) goto L_0x00e0
                android.widget.TextView r10 = r0.f28295y
                r10.setVisibility(r1)
                androidx.recyclerview.widget.RecyclerView r10 = r0.f28296z
                r10.setVisibility(r2)
                goto L_0x011a
            L_0x00e0:
                android.widget.TextView r10 = r0.f28295y
                r10.setVisibility(r2)
                androidx.recyclerview.widget.RecyclerView r10 = r0.f28296z
                r10.setVisibility(r1)
                qk1.y0 r10 = r0.f28277D
                r10.notifyDataSetChanged()
                goto L_0x011a
            L_0x00f0:
                java.lang.String r0 = r10.f256795c
                if (r0 == 0) goto L_0x00fa
                int r0 = r0.length()
                if (r0 != 0) goto L_0x00fb
            L_0x00fa:
                r1 = 1
            L_0x00fb:
                if (r1 == 0) goto L_0x010f
                il1.d3 r10 = r9.f28301d
                android.content.Context r10 = r10.getContext()
                android.content.res.Resources r10 = r10.getResources()
                r0 = 2131827367(0x7f111aa7, float:1.9287645E38)
                java.lang.String r10 = r10.getString(r0)
                goto L_0x0111
            L_0x010f:
                java.lang.String r10 = r10.f256795c
            L_0x0111:
                il1.d3 r0 = r9.f28301d
                android.content.Context r0 = r0.getContext()
                nj3.C76912y0.m92767f(r0, r10)
            L_0x011a:
                rx3.b0 r10 = rx3.C13598b0.f38549a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C8953d3.C8958e.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8953d3(Context context) {
        super(context);
        float f;
        C87412m.m108594g(context, "context");
        boolean z = context.getResources().getConfiguration().orientation == 2;
        if (z) {
            float height = getHEIGHT();
            float width = getWIDTH();
            f = (height > width ? width : height) - ((float) MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3743cv));
        } else {
            f = getHEIGHT() * (((float) C32444a.f86121a.mo58621b()) / 100.0f);
        }
        this.f28284n = (int) f;
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.ag9, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…st_widget_ui, this, true)");
        this.f28285o = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.csx);
        this.f28286p = findViewById;
        LiveBottomSheetPanel liveBottomSheetPanel = (LiveBottomSheetPanel) inflate.findViewById(C0966R.C0970id.csy);
        this.f28287q = liveBottomSheetPanel;
        ProgressBar progressBar = (ProgressBar) liveBottomSheetPanel.findViewById(C0966R.C0970id.ct4);
        this.f28288r = liveBottomSheetPanel.findViewById(C0966R.C0970id.ct8);
        this.f28289s = liveBottomSheetPanel.findViewById(C0966R.C0970id.f357978ct3);
        View findViewById2 = liveBottomSheetPanel.findViewById(C0966R.C0970id.f357977ct2);
        this.f28290t = findViewById2;
        this.f28291u = (WeImageView) liveBottomSheetPanel.findViewById(C0966R.C0970id.mck);
        this.f28292v = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.ct9);
        TextView textView = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.ct5);
        this.f28293w = textView;
        this.f28294x = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.ct6);
        this.f28295y = (TextView) liveBottomSheetPanel.findViewById(C0966R.C0970id.f357976ct0);
        RecyclerView recyclerView = (RecyclerView) liveBottomSheetPanel.findViewById(C0966R.C0970id.csz);
        this.f28296z = recyclerView;
        C12850y0 y0Var = new C12850y0();
        y0Var.f36769f = C8955b.f28298d;
        this.f28277D = y0Var;
        liveBottomSheetPanel.getLayoutParams().height = this.f28284n;
        liveBottomSheetPanel.setOnVisibilityListener(new C8974f3(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(inflate.getContext()));
        recyclerView.setAdapter(this.f28277D);
        recyclerView.mo17043c(new C8990g3(this));
        findViewById.setOnClickListener(this);
        liveBottomSheetPanel.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        textView.setOnClickListener(this);
        Log.m105924i("FinderLiveFansListWidget", "init isLand:" + z + ", DEFAULT_PANEL_HEIGHT:" + this.f28284n);
    }

    private final C8954a getListBottomPage() {
        return (C8954a) ((C36570n) this.f28283j).getValue();
    }

    /* access modifiers changed from: private */
    public final void setResp(C52188yz0 yz02) {
        Log.m105924i("FinderLiveFansListWidget", String.valueOf(C61937h.m72709h(yz02 == null ? "" : yz02)));
        this.f28278E = yz02;
    }

    private final void setShowModify(boolean z) {
        Log.m105924i("FinderLiveFansListWidget", "showModify:" + z);
        this.f28279F = z;
    }

    /* renamed from: c */
    public final void mo9757c() {
        if (this.f28282i == null) {
            C12925w wVar = this.f28281h;
            if (wVar != null) {
                wVar.mo5085n();
            }
            this.f28281h = null;
        } else {
            C12925w wVar2 = getListBottomPage().f36949a;
            if (wVar2 != null) {
                wVar2.mo5085n();
            }
            this.f28282i = null;
        }
        this.f28287q.setTranslationY(0.0f);
    }

    /* renamed from: d */
    public final void mo9758d(C32226l<? super C89132b.C89134c<C52188yz0>, C13598b0> lVar) {
        C64273c21 c212;
        Class cls = C55001u.class;
        int i = C62042e.f176370a.mo87027N0() ? 1 : 2;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        C55001u uVar = (C55001u) finderLiveService.mo77630e(cls);
        C89349b a = C89349b.m111674a(uVar != null ? uVar.f154417n : null);
        C55001u uVar2 = (C55001u) finderLiveService.mo77630e(cls);
        long j = (uVar2 == null || (c212 = uVar2.f154420q) == null) ? 0 : c212.f182392d;
        C55001u uVar3 = (C55001u) finderLiveService.mo77630e(cls);
        long j2 = uVar3 != null ? uVar3.f154416j : 0;
        C52188yz0 yz02 = this.f28278E;
        C12227k kVar = new C12227k(a, j, j2, yz02 != null ? yz02.f145585d : null, i, (C49712hj1) null);
        Context context = this.f28285o.getContext();
        C87412m.m108593f(context, "root.context");
        kVar.mo85582k(context, this.f28285o.getContext().getResources().getString(C0966R.string.ett), 1000);
        kVar.mo9225i().mo123420E(new C8957d(lVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x01a7, code lost:
        if (r3.mo75999e4() == true) goto L_0x01ab;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9759e(qo3.C12925w r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r0.setShowModify(r2)
            r0.f28282i = r1
            java.lang.Class<cl1.x> r2 = cl1.C0696x.class
            a14.z1 r3 = r0.f28276C
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0016
            a14.C53973z1.C53974a.m60623a(r3, r5, r4, r5)
        L_0x0016:
            boolean r3 = r0.f28279F
            r6 = 8
            r7 = 0
            if (r3 == 0) goto L_0x00a5
            android.widget.TextView r3 = r0.f28293w
            r3.setVisibility(r7)
            android.view.View r3 = r0.f28289s
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r15.mo10233c(r8)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget"
            java.lang.String r11 = "adjustShowModifyView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r3
            r4 = r15
            r15 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r4 = r4.mo10231a(r7)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget"
            java.lang.String r10 = "adjustShowModifyView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.TextView r3 = r0.f28292v
            r3.setVisibility(r6)
            android.widget.TextView r3 = r0.f28293w
            java.lang.String r4 = ""
            r3.setText(r4)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            androidx.lifecycle.i0 r4 = r3.mo77630e(r2)
            cl1.x r4 = (cl1.C0696x) r4
            if (r4 == 0) goto L_0x0086
            java.util.List<te3.fy0> r4 = r4.f1646i
            if (r4 == 0) goto L_0x0086
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r4.clear()
        L_0x0086:
            androidx.lifecycle.i0 r2 = r3.mo77630e(r2)
            cl1.x r2 = (cl1.C0696x) r2
            if (r2 != 0) goto L_0x008f
            goto L_0x0091
        L_0x008f:
            r2.f1647j = r5
        L_0x0091:
            a14.n0 r8 = r17.getScope()
            r9 = 0
            r10 = 0
            il1.e3 r11 = new il1.e3
            r11.<init>(r0, r5)
            r12 = 3
            r13 = 0
            a14.z1 r2 = a14.C53895h.m60466d(r8, r9, r10, r11, r12, r13)
            r0.f28276C = r2
            goto L_0x00f1
        L_0x00a5:
            android.widget.TextView r2 = r0.f28293w
            r2.setVisibility(r6)
            android.view.View r2 = r0.f28289s
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3.mo10233c(r4)
            java.lang.Object[] r9 = r3.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget"
            java.lang.String r11 = "adjustShowModifyView"
            java.lang.String r12 = "()V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            r8 = r2
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r3 = r3.mo10231a(r7)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget"
            java.lang.String r10 = "adjustShowModifyView"
            java.lang.String r11 = "()V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            android.widget.TextView r2 = r0.f28292v
            r2.setVisibility(r7)
        L_0x00f1:
            androidx.recyclerview.widget.RecyclerView r2 = r0.f28296z
            android.view.View r3 = r0.f28288r
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            if (r3 == 0) goto L_0x00fe
            int r3 = r3.height
            goto L_0x010d
        L_0x00fe:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r3 = r3.getDimensionPixelOffset(r4)
        L_0x010d:
            android.view.View r4 = r0.f28285o
            android.content.Context r4 = r4.getContext()
            int r4 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r4)
            android.view.View r6 = r0.f28289s
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x0135
            android.view.View r6 = r0.f28289s
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            if (r6 == 0) goto L_0x012a
            int r6 = r6.height
            goto L_0x0136
        L_0x012a:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r8 = 1125515264(0x43160000, float:150.0)
            int r6 = zp3.C79406f.m96347a(r6, r8)
            goto L_0x0136
        L_0x0135:
            r6 = 0
        L_0x0136:
            android.view.ViewGroup$LayoutParams r8 = r2.getLayoutParams()
            int r9 = r0.f28284n
            int r9 = r9 - r4
            int r9 = r9 - r3
            int r9 = r9 - r6
            r8.height = r9
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            java.lang.String r3 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r2, r3)
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            int r3 = r2.bottomMargin
            int r3 = r3 + r4
            r2.bottomMargin = r3
            r17.mo9761g()
            if (r1 != 0) goto L_0x017e
            qo3.w r1 = new qo3.w
            android.view.View r2 = r0.f28285o
            android.content.Context r2 = r2.getContext()
            r1.<init>(r2)
            ok1.e r2 = ok1.C62042e.f176370a
            android.view.View r3 = r0.f28285o
            r2.mo87010H1(r3)
            android.view.View r2 = r0.f28285o
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            android.view.ViewGroup r4 = r1.f36921B
            r4.addView(r2, r7, r3)
            r1.mo12461a()
            r1.mo5086o()
            r0.f28281h = r1
            goto L_0x018a
        L_0x017e:
            ok1.e r2 = ok1.C62042e.f176370a
            r2.mo87010H1(r0)
            il1.d3$a r2 = r17.getListBottomPage()
            r1.mo12468h(r2)
        L_0x018a:
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r1 = r1.mo87027N0()
            if (r1 == 0) goto L_0x01c4
            java.lang.String r1 = "4"
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            java.lang.Class<cl1.o> r4 = cl1.C54991o.class
            androidx.lifecycle.i0 r3 = r3.mo77630e(r4)
            cl1.o r3 = (cl1.C54991o) r3
            if (r3 == 0) goto L_0x01aa
            boolean r3 = r3.mo75999e4()
            r4 = 1
            if (r3 != r4) goto L_0x01aa
            goto L_0x01ab
        L_0x01aa:
            r4 = 0
        L_0x01ab:
            if (r4 == 0) goto L_0x01b9
            di3.d r2 = di3.C86312j.m106911c(r2)
            ak1.o r2 = (ak1.C54108o) r2
            ak1.g0 r3 = ak1.C0073g0.FANS_CLUB
            r2.mo9619wD(r3, r1, r5)
            goto L_0x01c4
        L_0x01b9:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ak1.o r2 = (ak1.C54108o) r2
            r3 = 27
            r2.tw0(r3, r1, r5)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: il1.C8953d3.mo9759e(qo3.w, boolean):void");
    }

    /* renamed from: f */
    public void mo9760f() {
        this.f28738f = null;
        mo9757c();
        C9143v3 v3Var = this.f28274A;
        if (v3Var != null) {
            v3Var.f28738f = null;
        }
        C9172y3 y3Var = this.f28275B;
        if (y3Var != null) {
            y3Var.f28738f = null;
            C9143v3 v3Var2 = y3Var.f28874o;
            if (v3Var2 != null) {
                v3Var2.f28738f = null;
            }
        }
        this.f28287q.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
        C53973z1 z1Var = this.f28276C;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    /* renamed from: g */
    public final void mo9761g() {
        mo9758d(new C8958e(this));
        if (this.f28282i == null) {
            this.f28291u.setRotation(90.0f);
        } else {
            this.f28290t.setRotation(180.0f);
        }
    }

    public void onClick(View view) {
        C9172y3 y3Var;
        C9172y3 y3Var2;
        C13598b0 b0Var;
        C9143v3 v3Var;
        C9143v3 v3Var2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C13598b0 b0Var2 = null;
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.csx) {
            mo9757c();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f357977ct2) {
            if (this.f28282i == null) {
                mo9757c();
            } else {
                getListBottomPage().mo12476d();
                this.f28282i = null;
                this.f28287q.setTranslationY(0.0f);
            }
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.ct5) {
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C0696x xVar = (C0696x) finderLiveService.mo77630e(C0696x.class);
            List<C49486fy0> list = xVar != null ? xVar.f1646i : null;
            boolean z = false;
            if (list == null || list.isEmpty()) {
                if (this.f28274A == null) {
                    Context context = getContext();
                    C87412m.m108593f(context, "context");
                    C9143v3 v3Var3 = new C9143v3(context);
                    v3Var3.setBackClickListener(new C9011h3(this));
                    this.f28274A = v3Var3;
                }
                C62660c basePlugin = getBasePlugin();
                if (basePlugin == null || (v3Var2 = this.f28274A) == null) {
                    b0Var = null;
                } else {
                    v3Var2.mo9935a(basePlugin);
                    b0Var = C13598b0.f38549a;
                }
                if (b0Var == null && (v3Var = this.f28274A) != null) {
                    v3Var.setScope(getScope());
                }
                C9143v3 v3Var4 = this.f28274A;
                if (v3Var4 != null) {
                    v3Var4.mo9957c(this.f28281h);
                }
                Class cls = C54108o.class;
                C54991o oVar = (C54991o) finderLiveService.mo77630e(C54991o.class);
                if (oVar != null && oVar.mo75999e4()) {
                    z = true;
                }
                if (z) {
                    ((C54108o) C86312j.m106911c(cls)).mo9619wD(C0073g0.FANS_CLUB, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, (String) null);
                } else {
                    ((C54108o) C86312j.m106911c(cls)).tw0(27, WCWebUpdater.XWEB_UPDATER_START_CHECK_TYPE_CONFIG_ONLY, (String) null);
                }
            } else {
                if (this.f28275B == null) {
                    Context context2 = getContext();
                    C87412m.m108593f(context2, "context");
                    C9172y3 y3Var3 = new C9172y3(context2);
                    y3Var3.setBackClickListener(new C9019i3(this));
                    this.f28275B = y3Var3;
                }
                C62660c basePlugin2 = getBasePlugin();
                if (!(basePlugin2 == null || (y3Var2 = this.f28275B) == null)) {
                    y3Var2.mo9935a(basePlugin2);
                    b0Var2 = C13598b0.f38549a;
                }
                if (b0Var2 == null && (y3Var = this.f28275B) != null) {
                    y3Var.setScope(getScope());
                }
                C9172y3 y3Var4 = this.f28275B;
                if (y3Var4 != null) {
                    y3Var4.mo9986d(this.f28281h);
                }
            }
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansListWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}

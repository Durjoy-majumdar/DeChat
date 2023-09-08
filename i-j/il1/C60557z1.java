package il1;

import a14.C0000n0;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C0073g0;
import ak1.C54108o;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b50.C54405b;
import b50.C54412f;
import bl3.C39818r;
import c50.C54655b;
import cl1.C54991o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C7335d;
import di3.C86312j;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import ht1.C60200t1;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import org.json.JSONObject;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C64186f0;
import te3.C64807wo2;
import up1.C27696y;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C66704d;
import yx3.C91590f;
import zp3.C23564m;

/* renamed from: il1.z1 */
public final class C60557z1 {

    /* renamed from: i */
    public static final C64807wo2 f172604i;

    /* renamed from: a */
    public final RelativeLayout f172605a;

    /* renamed from: b */
    public C0000n0 f172606b;

    /* renamed from: c */
    public final RecyclerView f172607c;

    /* renamed from: d */
    public C60561d f172608d = new C60561d();

    /* renamed from: e */
    public final ArrayList<C64807wo2> f172609e = new ArrayList<>();

    /* renamed from: f */
    public C60565f f172610f = new C60565f(f172604i, "");

    /* renamed from: g */
    public C60562e f172611g;

    /* renamed from: h */
    public C32224a<C13598b0> f172612h;

    /* renamed from: il1.z1$a */
    public static final class C60558a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60557z1 f172613d;

        public C60558a(C60557z1 z1Var) {
            this.f172613d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f172613d.f172612h;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.z1$b */
    public static final class C60559b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C60557z1 f172614d;

        public C60559b(C60557z1 z1Var) {
            this.f172614d = z1Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> aVar = this.f172614d.f172612h;
            if (aVar != null) {
                aVar.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: il1.z1$c */
    public static final class C60560c {
        public C60560c(C8480h hVar) {
        }
    }

    /* renamed from: il1.z1$d */
    public final class C60561d extends RecyclerView.C16613e<C60562e> {
        public C60561d() {
        }

        public int getItemCount() {
            return C60557z1.this.f172609e.size();
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i) {
            C64807wo2 wo22;
            int i2 = i;
            C60562e eVar = (C60562e) zVar;
            Class cls = C11990s0.class;
            Class<C60200t1> cls2 = C60200t1.class;
            C87412m.m108594g(eVar, "holder");
            C53973z1 z1Var = eVar.f172624H;
            if (z1Var != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            eVar.f172626z.setVisibility(8);
            eVar.f172617A.setVisibility(8);
            ViewGroup.LayoutParams layoutParams = eVar.f172622F.getLayoutParams();
            RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof RelativeLayout.LayoutParams ? (RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMargins(C74942w4.m89784a(eVar.f44854d.getContext(), i2 == 0 ? 32 : 16), 0, 0, 0);
            }
            C64807wo2 wo23 = C60557z1.this.f172609e.get(i2);
            C87412m.m108593f(wo23, "elementDataList[position]");
            C64807wo2 wo24 = wo23;
            C60557z1 z1Var2 = C60557z1.this;
            C60565f fVar = z1Var2.f172610f;
            boolean b = C87412m.m108589b((fVar == null || (wo22 = fVar.f172639a) == null) ? null : wo22.f186145d, z1Var2.f172609e.get(i2).f186145d);
            View view = eVar.f172621E;
            int i3 = b ? 0 : 4;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Integer.valueOf(i3));
            View view2 = view;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/FinderLiveElementWidget$ElementViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (b) {
                C60557z1.this.f172611g = eVar;
            }
            if (C87412m.m108589b(wo24.f186145d, "-1")) {
                eVar.f172619C.setVisibility(0);
                eVar.f172618B.setVisibility(8);
                eVar.f172623G.setVisibility(8);
            } else {
                eVar.f172619C.setVisibility(8);
                eVar.f172618B.setVisibility(0);
                eVar.f172618B.setText(wo24.f186146e);
                C39818r rVar = C39818r.f106831a;
                ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85957c(new C11984n0(wo24.f186147f, C27696y.RAW_IMAGE), eVar.f172623G, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(C11978e0.C11979a.COMMON));
            }
            eVar.f44854d.setOnClickListener(new C60341a2(C60557z1.this, wo24, eVar));
            C0000n0 n0Var = C60557z1.this.f172606b;
            eVar.f172624H = n0Var != null ? C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C60347b2(wo24, eVar, (C15601d<? super C60347b2>) null), 3, (Object) null) : null;
            View view3 = eVar.f44854d;
            C87412m.m108593f(view3, "holder.itemView");
            C23564m.m28138h(view3, new C60356c2(C60557z1.this, wo24));
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            C60557z1 z1Var = C60557z1.this;
            View inflate = View.inflate(viewGroup.getContext(), C0966R.C0971layout.f7163e8, (ViewGroup) null);
            C87412m.m108593f(inflate, "inflate(\n               …   null\n                )");
            return new C60562e(z1Var, inflate);
        }
    }

    /* renamed from: il1.z1$e */
    public final class C60562e extends RecyclerView.C16631z {

        /* renamed from: J */
        public static final /* synthetic */ int f172616J = 0;

        /* renamed from: A */
        public final RoundProgressBtn f172617A;

        /* renamed from: B */
        public final TextView f172618B;

        /* renamed from: C */
        public final TextView f172619C;

        /* renamed from: D */
        public final View f172620D;

        /* renamed from: E */
        public final View f172621E;

        /* renamed from: F */
        public final View f172622F;

        /* renamed from: G */
        public final ImageView f172623G;

        /* renamed from: H */
        public C53973z1 f172624H;

        /* renamed from: I */
        public final /* synthetic */ C60557z1 f172625I;

        /* renamed from: z */
        public final ImageView f172626z;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveElementWidget$ElementViewHolder", mo125469f = "FinderLiveElementWidget.kt", mo125470l = {342, 347, 349, 351}, mo125471m = "executeDownloadAndAnimation")
        /* renamed from: il1.z1$e$a */
        public static final class C60563a extends C66704d {

            /* renamed from: d */
            public Object f172627d;

            /* renamed from: e */
            public Object f172628e;

            /* renamed from: f */
            public Object f172629f;

            /* renamed from: g */
            public /* synthetic */ Object f172630g;

            /* renamed from: h */
            public final /* synthetic */ C60562e f172631h;

            /* renamed from: i */
            public int f172632i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60563a(C60562e eVar, C15601d<? super C60563a> dVar) {
                super(dVar);
                this.f172631h = eVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f172630g = obj;
                this.f172632i |= Integer.MIN_VALUE;
                return this.f172631h.mo85528y((String) null, false, (String) null, this);
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.widget.FinderLiveElementWidget$ElementViewHolder", mo125469f = "FinderLiveElementWidget.kt", mo125470l = {368}, mo125471m = "makeProgress")
        /* renamed from: il1.z1$e$b */
        public static final class C60564b extends C66704d {

            /* renamed from: d */
            public Object f172633d;

            /* renamed from: e */
            public int f172634e;

            /* renamed from: f */
            public int f172635f;

            /* renamed from: g */
            public /* synthetic */ Object f172636g;

            /* renamed from: h */
            public final /* synthetic */ C60562e f172637h;

            /* renamed from: i */
            public int f172638i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C60564b(C60562e eVar, C15601d<? super C60564b> dVar) {
                super(dVar);
                this.f172637h = eVar;
            }

            public final Object invokeSuspend(Object obj) {
                this.f172636g = obj;
                this.f172638i |= Integer.MIN_VALUE;
                C60562e eVar = this.f172637h;
                int i = C60562e.f172616J;
                return eVar.mo85529z(0, 0, false, this);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C60562e(C60557z1 z1Var, View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f172625I = z1Var;
            View findViewById = view.findViewById(C0966R.C0970id.omf);
            C87412m.m108593f(findViewById, "itemView.findViewById(R.…ive_element_download_btn)");
            this.f172626z = (ImageView) findViewById;
            View findViewById2 = view.findViewById(C0966R.C0970id.omg);
            C87412m.m108593f(findViewById2, "itemView.findViewById(R.…_download_progress_round)");
            this.f172617A = (RoundProgressBtn) findViewById2;
            View findViewById3 = view.findViewById(C0966R.C0970id.oki);
            C87412m.m108593f(findViewById3, "itemView.findViewById(R.…_live_element_item_title)");
            this.f172618B = (TextView) findViewById3;
            View findViewById4 = view.findViewById(C0966R.C0970id.oke);
            C87412m.m108593f(findViewById4, "itemView.findViewById(R.…lement_item_default_text)");
            this.f172619C = (TextView) findViewById4;
            View findViewById5 = view.findViewById(C0966R.C0970id.okg);
            C87412m.m108593f(findViewById5, "itemView.findViewById(R.…ive_element_item_root_bg)");
            this.f172620D = findViewById5;
            View findViewById6 = view.findViewById(C0966R.C0970id.okh);
            C87412m.m108593f(findViewById6, "itemView.findViewById(R.…element_item_select_mark)");
            this.f172621E = findViewById6;
            View findViewById7 = view.findViewById(C0966R.C0970id.okf);
            C87412m.m108593f(findViewById7, "itemView.findViewById(R.…r_live_element_item_root)");
            this.f172622F = findViewById7;
            View findViewById8 = view.findViewById(C0966R.C0970id.okd);
            C87412m.m108593f(findViewById8, "itemView.findViewById(R.id.finder_live_element_bg)");
            this.f172623G = (ImageView) findViewById8;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v8, resolved type: java.lang.String} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x00be A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00e1  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x002b  */
        /* renamed from: y */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo85528y(java.lang.String r12, boolean r13, java.lang.String r14, wx3.C15601d<? super rx3.C13605o<java.lang.Boolean, java.lang.String, java.lang.String>> r15) {
            /*
                r11 = this;
                java.lang.Class<fp.h> r0 = p523fp.C59265h.class
                boolean r1 = r15 instanceof il1.C60557z1.C60562e.C60563a
                if (r1 == 0) goto L_0x0015
                r1 = r15
                il1.z1$e$a r1 = (il1.C60557z1.C60562e.C60563a) r1
                int r2 = r1.f172632i
                r3 = -2147483648(0xffffffff80000000, float:-0.0)
                r4 = r2 & r3
                if (r4 == 0) goto L_0x0015
                int r2 = r2 - r3
                r1.f172632i = r2
                goto L_0x001a
            L_0x0015:
                il1.z1$e$a r1 = new il1.z1$e$a
                r1.<init>(r11, r15)
            L_0x001a:
                java.lang.Object r15 = r1.f172630g
                xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
                int r3 = r1.f172632i
                r4 = 60
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 0
                r9 = 8
                r10 = 1
                if (r3 == 0) goto L_0x0066
                if (r3 == r10) goto L_0x0062
                if (r3 == r7) goto L_0x0051
                if (r3 == r6) goto L_0x0048
                if (r3 != r5) goto L_0x0040
                java.lang.Object r12 = r1.f172628e
                rx3.o r12 = (rx3.C13605o) r12
                java.lang.Object r13 = r1.f172627d
                il1.z1$e r13 = (il1.C60557z1.C60562e) r13
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x00db
            L_0x0040:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L_0x0048:
                java.lang.Object r12 = r1.f172627d
                il1.z1$e r12 = (il1.C60557z1.C60562e) r12
                kotlin.ResultKt.throwOnFailure(r15)
                r13 = r12
                goto L_0x00bf
            L_0x0051:
                java.lang.Object r12 = r1.f172629f
                r14 = r12
                java.lang.String r14 = (java.lang.String) r14
                java.lang.Object r12 = r1.f172628e
                java.lang.String r12 = (java.lang.String) r12
                java.lang.Object r13 = r1.f172627d
                il1.z1$e r13 = (il1.C60557z1.C60562e) r13
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x00a9
            L_0x0062:
                kotlin.ResultKt.throwOnFailure(r15)
                goto L_0x008e
            L_0x0066:
                kotlin.ResultKt.throwOnFailure(r15)
                di3.d r15 = di3.C86312j.m106911c(r0)
                fp.h r15 = (p523fp.C59265h) r15
                boolean r15 = r15.Ft0(r12)
                if (r15 == 0) goto L_0x008f
                android.widget.ImageView r13 = r11.f172626z
                r13.setVisibility(r9)
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r13 = r11.f172617A
                r13.setVisibility(r9)
                di3.d r13 = di3.C86312j.m106911c(r0)
                fp.h r13 = (p523fp.C59265h) r13
                r1.f172632i = r10
                java.lang.Object r15 = r13.mo58904Xj(r12, r10, r14, r1)
                if (r15 != r2) goto L_0x008e
                return r2
            L_0x008e:
                return r15
            L_0x008f:
                android.widget.ImageView r15 = r11.f172626z
                r15.setVisibility(r9)
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r15 = r11.f172617A
                r15.setVisibility(r8)
                r1.f172627d = r11
                r1.f172628e = r12
                r1.f172629f = r14
                r1.f172632i = r7
                java.lang.Object r13 = r11.mo85529z(r8, r4, r13, r1)
                if (r13 != r2) goto L_0x00a8
                return r2
            L_0x00a8:
                r13 = r11
            L_0x00a9:
                di3.d r15 = di3.C86312j.m106911c(r0)
                fp.h r15 = (p523fp.C59265h) r15
                r1.f172627d = r13
                r0 = 0
                r1.f172628e = r0
                r1.f172629f = r0
                r1.f172632i = r6
                java.lang.Object r15 = r15.mo58904Xj(r12, r10, r14, r1)
                if (r15 != r2) goto L_0x00bf
                return r2
            L_0x00bf:
                r12 = r15
                rx3.o r12 = (rx3.C13605o) r12
                A r14 = r12.f38557d
                java.lang.Boolean r14 = (java.lang.Boolean) r14
                boolean r14 = r14.booleanValue()
                if (r14 == 0) goto L_0x00e1
                r14 = 100
                r1.f172627d = r13
                r1.f172628e = r12
                r1.f172632i = r5
                java.lang.Object r14 = r13.mo85529z(r4, r14, r10, r1)
                if (r14 != r2) goto L_0x00db
                return r2
            L_0x00db:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r13 = r13.f172617A
                r13.setVisibility(r9)
                goto L_0x00eb
            L_0x00e1:
                android.widget.ImageView r14 = r13.f172626z
                r14.setVisibility(r8)
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r13 = r13.f172617A
                r13.setVisibility(r9)
            L_0x00eb:
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60557z1.C60562e.mo85528y(java.lang.String, boolean, java.lang.String, wx3.d):java.lang.Object");
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x003f  */
        /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
        /* renamed from: z */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object mo85529z(int r7, int r8, boolean r9, wx3.C15601d<? super rx3.C13598b0> r10) {
            /*
                r6 = this;
                boolean r0 = r10 instanceof il1.C60557z1.C60562e.C60564b
                if (r0 == 0) goto L_0x0013
                r0 = r10
                il1.z1$e$b r0 = (il1.C60557z1.C60562e.C60564b) r0
                int r1 = r0.f172638i
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L_0x0013
                int r1 = r1 - r2
                r0.f172638i = r1
                goto L_0x0018
            L_0x0013:
                il1.z1$e$b r0 = new il1.z1$e$b
                r0.<init>(r6, r10)
            L_0x0018:
                java.lang.Object r10 = r0.f172636g
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f172638i
                r3 = 1
                if (r2 == 0) goto L_0x0037
                if (r2 != r3) goto L_0x002f
                int r7 = r0.f172635f
                int r8 = r0.f172634e
                java.lang.Object r9 = r0.f172633d
                il1.z1$e r9 = (il1.C60557z1.C60562e) r9
                kotlin.ResultKt.throwOnFailure(r10)
                goto L_0x003d
            L_0x002f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L_0x0037:
                kotlin.ResultKt.throwOnFailure(r10)
                if (r9 == 0) goto L_0x0059
                r9 = r6
            L_0x003d:
                if (r7 >= r8) goto L_0x005e
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r10 = r9.f172617A
                int r2 = r7 + 1
                r10.setProgress(r7)
                r4 = 10
                r0.f172633d = r9
                r0.f172634e = r8
                r0.f172635f = r2
                r0.f172638i = r3
                java.lang.Object r7 = a14.C53965x0.m60607b(r4, r0)
                if (r7 != r1) goto L_0x0057
                return r1
            L_0x0057:
                r7 = r2
                goto L_0x003d
            L_0x0059:
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r7 = r6.f172617A
                r7.setProgress(r8)
            L_0x005e:
                rx3.b0 r7 = rx3.C13598b0.f38549a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: il1.C60557z1.C60562e.mo85529z(int, int, boolean, wx3.d):java.lang.Object");
        }
    }

    /* renamed from: il1.z1$f */
    public static final class C60565f {

        /* renamed from: a */
        public final C64807wo2 f172639a;

        /* renamed from: b */
        public final String f172640b;

        public C60565f(C64807wo2 wo22, String str) {
            C87412m.m108594g(wo22, "data");
            C87412m.m108594g(str, "path");
            this.f172639a = wo22;
            this.f172640b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C60565f)) {
                return false;
            }
            C60565f fVar = (C60565f) obj;
            return C87412m.m108589b(this.f172639a, fVar.f172639a) && C87412m.m108589b(this.f172640b, fVar.f172640b);
        }

        public int hashCode() {
            return (this.f172639a.hashCode() * 31) + this.f172640b.hashCode();
        }

        public String toString() {
            return "LiveElementResourceWrap(data=" + this.f172639a + ", path=" + this.f172640b + ')';
        }
    }

    static {
        new C60560c((C8480h) null);
        C64807wo2 wo22 = new C64807wo2();
        wo22.f186145d = "-1";
        f172604i = wo22;
    }

    public C60557z1(RelativeLayout relativeLayout) {
        C87412m.m108594g(relativeLayout, "panelRoot");
        this.f172605a = relativeLayout;
        RecyclerView recyclerView = (RecyclerView) relativeLayout.findViewById(C0966R.C0970id.ok9);
        this.f172607c = recyclerView;
        relativeLayout.setOnClickListener(new C60558a(this));
        relativeLayout.setTranslationY((float) C75044y4.m89990b(relativeLayout.getContext()).y);
        ((RelativeLayout) relativeLayout.findViewById(C0966R.C0970id.dhw)).setOnClickListener(new C60559b(this));
        recyclerView.setLayoutManager(new LinearLayoutManager(relativeLayout.getContext(), 0, false));
    }

    /* renamed from: b */
    public static /* synthetic */ void m70748b(C60557z1 z1Var, int i, String str, String str2, long j, int i2, Object obj) {
        String str3 = (i2 & 2) != 0 ? "" : str;
        String str4 = (i2 & 4) != 0 ? "" : str2;
        if ((i2 & 8) != 0) {
            j = 0;
        }
        z1Var.mo85524a(i, str3, str4, j);
    }

    /* renamed from: a */
    public final void mo85524a(int i, String str, String str2, long j) {
        Class cls = C54108o.class;
        Class cls2 = C54991o.class;
        if (i == 6 || !C87412m.m108589b(str, f172604i.f186145d)) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", i);
            boolean z = true;
            if (!(i == 1 || i == 2)) {
                jSONObject.put("accessories_id", str);
                jSONObject.put("accessories_name", str2);
            }
            if (i == 7) {
                jSONObject.put("use_time", j);
            }
            FinderLiveService finderLiveService = FinderLiveService.f159376d;
            C54991o oVar = (C54991o) finderLiveService.mo77630e(cls2);
            if (oVar == null || !oVar.mo75999e4()) {
                z = false;
            }
            if (z) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8605f((C8777j5) c, C0073g0.ANCHOR_ELEMENT, jSONObject.toString(), (String) null, 4, (Object) null);
            } else {
                C7335d c2 = C86312j.m106911c(cls);
                C87412m.m108593f(c2, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8600a((C8777j5) c2, 40, jSONObject.toString(), (String) null, 4, (Object) null);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("#report living=");
            C54991o oVar2 = (C54991o) finderLiveService.mo77630e(cls2);
            sb.append(oVar2 != null ? Boolean.valueOf(oVar2.mo75999e4()) : null);
            sb.append(' ');
            sb.append(jSONObject);
            Log.m105924i("Finder.FinderLiveElementWidget", sb.toString());
        }
    }

    /* renamed from: c */
    public final void mo85525c(C60565f fVar) {
        C54405b bVar;
        C54405b bVar2;
        C60565f fVar2 = this.f172610f;
        String str = null;
        if (!(!C87412m.m108589b(fVar2.f172639a.f186145d, fVar.f172639a.f186145d))) {
            fVar2 = null;
        }
        if (fVar2 != null && !C87412m.m108589b(fVar2.f172639a.f186145d, f172604i.f186145d)) {
            C64807wo2 wo22 = fVar2.f172639a;
            String str2 = wo22.f186145d;
            String str3 = wo22.f186146e;
            long currentTimeMillis = System.currentTimeMillis();
            FinderLiveService.f159376d.getClass();
            mo85524a(7, str2, str3, currentTimeMillis - FinderLiveService.f159392v);
            if (C87412m.m108589b(fVar.f172639a.f186145d, "-1")) {
                C64807wo2 wo23 = fVar2.f172639a;
                m70748b(this, 6, wo23.f186145d, wo23.f186146e, 0, 8, (Object) null);
            }
        }
        this.f172610f = fVar;
        FinderLiveService finderLiveService = FinderLiveService.f159376d;
        finderLiveService.mo77614Q(fVar);
        StringBuilder sb = new StringBuilder();
        sb.append("#curSelectedFilter set ");
        C64807wo2 wo24 = fVar.f172639a;
        if (wo24 != null) {
            str = wo24.f186145d;
        }
        sb.append(str);
        Log.m105924i("Finder.FinderLiveElementWidget", sb.toString());
        if (C87412m.m108589b(fVar.f172639a.f186145d, "-1")) {
            C54655b b = finderLiveService.mo77626b();
            if (b != null && (bVar2 = b.f173032r) != null) {
                ((C54412f) bVar2).mo75223f(C64186f0.f181907d);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String str4 = fVar.f172639a.f186145d;
        if (str4 == null) {
            str4 = "";
        }
        arrayList.add(new C13604l(str4, fVar.f172640b));
        C54655b b2 = finderLiveService.mo77626b();
        if (b2 != null && (bVar = b2.f173032r) != null) {
            ((C54412f) bVar).mo75223f(arrayList);
        }
    }
}

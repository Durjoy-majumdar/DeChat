package com.tencent.p014mm.plugin.finder.p056ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.C16680w;
import androidx.recyclerview.widget.C16681x;
import androidx.recyclerview.widget.C16682y;
import androidx.recyclerview.widget.C54256s;
import androidx.recyclerview.widget.C54259z;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.finder.view.manager.FinderLinearLayoutManager;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C8478d0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: com.tencent.mm.plugin.finder.ui.x0 */
public final class C56437x0 extends C54259z {

    /* renamed from: v */
    public static final boolean f161303v = BuildInfo.DEBUG;

    /* renamed from: f */
    public final HashSet<Integer> f161304f;

    /* renamed from: g */
    public final HashSet<Integer> f161305g;

    /* renamed from: h */
    public LinearLayoutManager f161306h;

    /* renamed from: i */
    public final C13601g f161307i = C36568h.m40985a(new C56444e(this));

    /* renamed from: j */
    public final C13601g f161308j = C36568h.m40985a(new C56443d(this));

    /* renamed from: k */
    public RecyclerView f161309k;

    /* renamed from: l */
    public boolean f161310l;

    /* renamed from: m */
    public boolean f161311m = true;

    /* renamed from: n */
    public int f161312n;

    /* renamed from: o */
    public Runnable f161313o;

    /* renamed from: p */
    public int f161314p = -1;

    /* renamed from: q */
    public int f161315q = -1;

    /* renamed from: r */
    public View f161316r;

    /* renamed from: s */
    public View f161317s;

    /* renamed from: t */
    public final int[] f161318t = new int[2];

    /* renamed from: u */
    public final Rect f161319u = new Rect();

    /* renamed from: com.tencent.mm.plugin.finder.ui.x0$a */
    public static final class C56438a extends RecyclerView.C16615g {

        /* renamed from: a */
        public final /* synthetic */ C56437x0 f161320a;

        /* renamed from: b */
        public final /* synthetic */ RecyclerView f161321b;

        /* renamed from: c */
        public final /* synthetic */ LinearLayoutManager f161322c;

        /* renamed from: com.tencent.mm.plugin.finder.ui.x0$a$a */
        public static final class C56439a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C56437x0 f161323d;

            /* renamed from: e */
            public final /* synthetic */ LinearLayoutManager f161324e;

            public C56439a(C56437x0 x0Var, LinearLayoutManager linearLayoutManager) {
                this.f161323d = x0Var;
                this.f161324e = linearLayoutManager;
            }

            public final void run() {
                C56437x0 x0Var = this.f161323d;
                RecyclerView recyclerView = x0Var.f161309k;
                if (recyclerView != null) {
                    C56437x0.m64730o(x0Var, recyclerView, this.f161324e, 1, true);
                    this.f161323d.f161313o = null;
                    return;
                }
                C87412m.m108603p("recyclerView");
                throw null;
            }
        }

        public C56438a(C56437x0 x0Var, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager) {
            this.f161320a = x0Var;
            this.f161321b = recyclerView;
            this.f161322c = linearLayoutManager;
        }

        /* renamed from: g */
        public void mo2560g(int i, int i2) {
            C56437x0 x0Var = this.f161320a;
            C56439a aVar = new C56439a(x0Var, this.f161322c);
            x0Var.f161313o = aVar;
            RecyclerView recyclerView = x0Var.f161309k;
            if (recyclerView != null) {
                RecyclerView.C16616j itemAnimator = this.f161321b.getItemAnimator();
                recyclerView.postDelayed(aVar, itemAnimator != null ? itemAnimator.mo17324m() : 20);
                return;
            }
            C87412m.m108603p("recyclerView");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.x0$b */
    public static final class C56440b extends RecyclerView.C0130p {

        /* renamed from: d */
        public boolean f161325d;

        /* renamed from: e */
        public final /* synthetic */ C56437x0 f161326e;

        /* renamed from: f */
        public final /* synthetic */ C8478d0 f161327f;

        /* renamed from: g */
        public final /* synthetic */ C8478d0 f161328g;

        /* renamed from: h */
        public final /* synthetic */ LinearLayoutManager f161329h;

        /* renamed from: com.tencent.mm.plugin.finder.ui.x0$b$a */
        public static final class C56441a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C56437x0 f161330d;

            /* renamed from: e */
            public final /* synthetic */ RecyclerView f161331e;

            /* renamed from: f */
            public final /* synthetic */ LinearLayoutManager f161332f;

            /* renamed from: g */
            public final /* synthetic */ C8478d0 f161333g;

            /* renamed from: h */
            public final /* synthetic */ C8478d0 f161334h;

            public C56441a(C56437x0 x0Var, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, C8478d0 d0Var, C8478d0 d0Var2) {
                this.f161330d = x0Var;
                this.f161331e = recyclerView;
                this.f161332f = linearLayoutManager;
                this.f161333g = d0Var;
                this.f161334h = d0Var2;
            }

            public final void run() {
                C56437x0 x0Var = this.f161330d;
                C56437x0.m64730o(x0Var, this.f161331e, this.f161332f, x0Var.f161312n, true);
                C56437x0 x0Var2 = this.f161330d;
                C56437x0.m64729n(x0Var2, this.f161331e, this.f161332f, this.f161333g.f27483d, this.f161334h.f27483d, x0Var2.f161312n);
                C56437x0 x0Var3 = this.f161330d;
                x0Var3.f161312n = 0;
                x0Var3.f161313o = null;
            }
        }

        public C56440b(C56437x0 x0Var, C8478d0 d0Var, C8478d0 d0Var2, LinearLayoutManager linearLayoutManager) {
            this.f161326e = x0Var;
            this.f161327f = d0Var;
            this.f161328g = d0Var2;
            this.f161329h = linearLayoutManager;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                C56437x0 x0Var = this.f161326e;
                C56441a aVar = new C56441a(x0Var, recyclerView, this.f161329h, this.f161328g, this.f161327f);
                x0Var.f161313o = aVar;
                recyclerView.postDelayed(aVar, 20);
            }
            this.f161325d = true;
            C8478d0 d0Var = this.f161327f;
            C8478d0 d0Var2 = this.f161328g;
            d0Var.f27483d = d0Var2.f27483d;
            d0Var2.f27483d = i;
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            Runnable runnable = this.f161326e.f161313o;
            if (runnable != null) {
                recyclerView.removeCallbacks(runnable);
                this.f161326e.f161313o = null;
            }
            C56437x0 x0Var = this.f161326e;
            int i3 = x0Var.f161312n + i2;
            x0Var.f161312n = i3;
            if (this.f161325d) {
                C56437x0.m64729n(x0Var, recyclerView, this.f161329h, this.f161328g.f27483d, this.f161327f.f27483d, i3);
                this.f161325d = false;
            }
            C56437x0 x0Var2 = this.f161326e;
            C56437x0.m64730o(x0Var2, recyclerView, this.f161329h, x0Var2.f161312n, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper$attachToRecyclerView$1$2", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.x0$c */
    public static final class C56442c extends C54256s {

        /* renamed from: n */
        public final DecelerateInterpolator f161335n = new DecelerateInterpolator(2.0f);

        /* renamed from: o */
        public final /* synthetic */ C56437x0 f161336o;

        /* renamed from: p */
        public final /* synthetic */ RecyclerView.LayoutManager f161337p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56442c(C56437x0 x0Var, RecyclerView.LayoutManager layoutManager, Context context) {
            super(context);
            this.f161336o = x0Var;
            this.f161337p = layoutManager;
        }

        /* renamed from: f */
        public void mo17385f(View view, RecyclerView.C16628w wVar, RecyclerView.C16634v.C16635a aVar) {
            C87412m.m108594g(view, "targetView");
            C87412m.m108594g(wVar, "state");
            C87412m.m108594g(aVar, "action");
            int[] c = this.f161336o.mo75026c(this.f161337p, view);
            int i = c[0];
            int i2 = c[1];
            int l = mo10339l(Math.max(Math.abs(i), Math.abs(i2)));
            if (l > 0) {
                aVar.mo17388b(i, i2, l, this.f161335n);
            }
        }

        /* renamed from: k */
        public float mo3227k(DisplayMetrics displayMetrics) {
            C87412m.m108594g(displayMetrics, "displayMetrics");
            return ((FinderLinearLayoutManager) this.f161337p).f162360w / ((float) displayMetrics.densityDpi);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.x0$d */
    public static final class C56443d extends C87413o implements C32224a<C16682y> {

        /* renamed from: d */
        public final /* synthetic */ C56437x0 f161338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56443d(C56437x0 x0Var) {
            super(0);
            this.f161338d = x0Var;
        }

        public Object invoke() {
            LinearLayoutManager linearLayoutManager = this.f161338d.f161306h;
            if (linearLayoutManager != null) {
                return new C16680w(linearLayoutManager);
            }
            C87412m.m108603p("layoutManager");
            throw null;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.x0$e */
    public static final class C56444e extends C87413o implements C32224a<C16682y> {

        /* renamed from: d */
        public final /* synthetic */ C56437x0 f161339d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56444e(C56437x0 x0Var) {
            super(0);
            this.f161339d = x0Var;
        }

        public Object invoke() {
            LinearLayoutManager linearLayoutManager = this.f161339d.f161306h;
            if (linearLayoutManager != null) {
                return new C16681x(linearLayoutManager);
            }
            C87412m.m108603p("layoutManager");
            throw null;
        }
    }

    public C56437x0() {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(Integer.valueOf(C0966R.C0970id.esl));
        this.f161304f = hashSet;
        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(Integer.valueOf(C0966R.C0970id.j6y));
        this.f161305g = hashSet2;
    }

    /* renamed from: n */
    public static final void m64729n(C56437x0 x0Var, RecyclerView recyclerView, LinearLayoutManager linearLayoutManager, int i, int i2, int i3) {
        x0Var.getClass();
        RecyclerView.C16613e adapter = recyclerView.getAdapter();
        if ((adapter != null ? adapter.getItemCount() : 0) > 1) {
            if (i != i2 && i == 1) {
                int C = i3 > 0 ? linearLayoutManager.mo16957C() : linearLayoutManager.mo16959E();
                RecyclerView.C16631z I0 = recyclerView.mo17023I0(C);
                if (i3 > 0 || C != 0) {
                    x0Var.mo79174p(I0, C0966R.C0970id.d97);
                    x0Var.mo79174p(I0, C0966R.C0970id.mq8);
                    x0Var.mo79174p(I0, C0966R.C0970id.d9p);
                    x0Var.mo79174p(I0, C0966R.C0970id.hra);
                }
            } else if ((i2 == 1 || i2 == 2) && i != i2) {
                int C2 = linearLayoutManager.mo16957C();
                int E = linearLayoutManager.mo16959E();
                RecyclerView.C16631z I02 = recyclerView.mo17023I0(C2);
                RecyclerView.C16631z I03 = recyclerView.mo17023I0(E);
                x0Var.mo79179u(I02, C0966R.C0970id.d97);
                x0Var.mo79179u(I03, C0966R.C0970id.d97);
                x0Var.mo79179u(I02, C0966R.C0970id.d9p);
                x0Var.mo79179u(I03, C0966R.C0970id.d9p);
                x0Var.mo79179u(I02, C0966R.C0970id.mq8);
                x0Var.mo79179u(I03, C0966R.C0970id.mq8);
                x0Var.mo79179u(I02, C0966R.C0970id.hra);
                x0Var.mo79179u(I03, C0966R.C0970id.hra);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
        r2 = r2.f44854d;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64730o(com.tencent.p014mm.plugin.finder.p056ui.C56437x0 r18, androidx.recyclerview.widget.RecyclerView r19, androidx.recyclerview.widget.LinearLayoutManager r20, int r21, boolean r22) {
        /*
            r0 = r18
            r1 = r19
            r18.getClass()
            int r2 = r19.getHeight()
            if (r2 > 0) goto L_0x000f
            goto L_0x0160
        L_0x000f:
            boolean r2 = r0.f161311m
            if (r2 != 0) goto L_0x0015
            goto L_0x0160
        L_0x0015:
            if (r21 != 0) goto L_0x0019
            goto L_0x0160
        L_0x0019:
            int r2 = r20.mo16957C()
            int r3 = r20.mo16959E()
            int r4 = r0.f161314p
            r5 = 2131306640(0x7f092890, float:1.8231485E38)
            if (r4 != r2) goto L_0x002c
            int r4 = r0.f161315q
            if (r3 == r4) goto L_0x0054
        L_0x002c:
            r0.f161314p = r2
            r0.f161315q = r3
            androidx.recyclerview.widget.RecyclerView$z r2 = r1.mo17023I0(r2)
            if (r2 == 0) goto L_0x003f
            android.view.View r2 = r2.f44854d
            if (r2 == 0) goto L_0x003f
            android.view.View r2 = r2.findViewById(r5)
            goto L_0x0040
        L_0x003f:
            r2 = 0
        L_0x0040:
            r0.f161316r = r2
            androidx.recyclerview.widget.RecyclerView$z r2 = r1.mo17023I0(r3)
            if (r2 == 0) goto L_0x0051
            android.view.View r2 = r2.f44854d
            if (r2 == 0) goto L_0x0051
            android.view.View r2 = r2.findViewById(r5)
            goto L_0x0052
        L_0x0051:
            r2 = 0
        L_0x0052:
            r0.f161317s = r2
        L_0x0054:
            android.view.View r2 = r0.f161316r
            android.view.View r3 = r0.f161317s
            if (r2 == 0) goto L_0x005f
            int[] r4 = r0.f161318t
            r2.getLocationInWindow(r4)
        L_0x005f:
            r4 = 1065353216(0x3f800000, float:1.0)
            r15 = 0
            r16 = 1
            if (r2 != 0) goto L_0x0067
            goto L_0x00bb
        L_0x0067:
            int[] r7 = r0.f161318t
            r7 = r7[r16]
            int r7 = java.lang.Math.abs(r7)
            float r7 = (float) r7
            float r7 = r7 * r4
            int r8 = r19.getHeight()
            float r8 = (float) r8
            float r7 = r7 / r8
            k20.a r14 = new k20.a
            r14.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r14.mo10233c(r7)
            java.lang.Object[] r8 = r14.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper"
            java.lang.String r10 = "checkMaskAlpha"
            java.lang.String r11 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r17 = "(F)V"
            r7 = r2
            r6 = r14
            r14 = r17
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r6 = r6.mo10231a(r15)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            r2.setAlpha(r6)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper"
            java.lang.String r9 = "checkMaskAlpha"
            java.lang.String r10 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setAlpha"
            java.lang.String r13 = "(F)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x00bb:
            if (r3 == 0) goto L_0x00c2
            int[] r2 = r0.f161318t
            r3.getLocationInWindow(r2)
        L_0x00c2:
            if (r3 != 0) goto L_0x00c5
            goto L_0x0116
        L_0x00c5:
            int[] r0 = r0.f161318t
            r0 = r0[r16]
            int r0 = java.lang.Math.abs(r0)
            float r0 = (float) r0
            float r0 = r0 * r4
            int r2 = r19.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.mo10233c(r0)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper"
            java.lang.String r10 = "checkMaskAlpha"
            java.lang.String r11 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setAlpha"
            java.lang.String r14 = "(F)V"
            r7 = r3
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r0 = r2.mo10231a(r15)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            r3.setAlpha(r0)
            java.lang.String r8 = "com/tencent/mm/plugin/finder/ui/FinderFullPagerSnapHelper"
            java.lang.String r9 = "checkMaskAlpha"
            java.lang.String r10 = "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/LinearLayoutManager;IZ)V"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setAlpha"
            java.lang.String r13 = "(F)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
        L_0x0116:
            if (r22 == 0) goto L_0x0160
            int r0 = r19.getChildCount()
        L_0x011c:
            if (r15 >= r0) goto L_0x0160
            android.view.View r2 = r1.getChildAt(r15)
            android.view.View r2 = r2.findViewById(r5)
            if (r2 == 0) goto L_0x0131
            android.view.ViewPropertyAnimator r3 = r2.animate()
            if (r3 == 0) goto L_0x0131
            r3.cancel()
        L_0x0131:
            if (r2 == 0) goto L_0x013c
            float r3 = r2.getAlpha()
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            goto L_0x013d
        L_0x013c:
            r3 = 0
        L_0x013d:
            r4 = 0
            boolean r3 = gy3.C87412m.m108588a(r3, r4)
            if (r3 != 0) goto L_0x015d
            if (r2 == 0) goto L_0x015d
            android.view.ViewPropertyAnimator r2 = r2.animate()
            if (r2 == 0) goto L_0x015d
            android.view.ViewPropertyAnimator r2 = r2.alpha(r4)
            if (r2 == 0) goto L_0x015d
            r3 = 90
            android.view.ViewPropertyAnimator r2 = r2.setDuration(r3)
            if (r2 == 0) goto L_0x015d
            r2.start()
        L_0x015d:
            int r15 = r15 + 1
            goto L_0x011c
        L_0x0160:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C56437x0.m64730o(com.tencent.mm.plugin.finder.ui.x0, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.LinearLayoutManager, int, boolean):void");
    }

    /* renamed from: b */
    public void mo75025b(RecyclerView recyclerView) {
        if (recyclerView != null) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            this.f161309k = recyclerView;
            this.f161306h = linearLayoutManager;
            C8478d0 d0Var = new C8478d0();
            C8478d0 d0Var2 = new C8478d0();
            RecyclerView.C16613e adapter = recyclerView.getAdapter();
            if (adapter != null) {
                adapter.registerAdapterDataObserver(new C56438a(this, recyclerView, linearLayoutManager));
            }
            recyclerView.mo17043c(new C56440b(this, d0Var2, d0Var, linearLayoutManager));
        }
        super.mo75025b(recyclerView);
    }

    /* renamed from: c */
    public int[] mo75026c(RecyclerView.LayoutManager layoutManager, View view) {
        C87412m.m108594g(layoutManager, "layoutManager");
        C87412m.m108594g(view, "targetView");
        int[] iArr = new int[2];
        if (mo79177s(view)) {
            Object tag = view.getTag(C0966R.C0970id.d_5);
            C16682y yVar = (C16682y) ((C36570n) this.f161307i).getValue();
            C87412m.m108593f(yVar, "verticalHelper");
            iArr[1] = mo79175q(layoutManager, view, yVar);
            if (tag == null || C87412m.m108589b(tag, Boolean.TRUE)) {
                iArr[1] = 0;
            }
            view.setTag(C0966R.C0970id.d_5, Boolean.FALSE);
        } else {
            if (layoutManager.canScrollHorizontally()) {
                C16682y yVar2 = (C16682y) ((C36570n) this.f161308j).getValue();
                C87412m.m108593f(yVar2, "horizontalHelper");
                iArr[0] = mo79175q(layoutManager, view, yVar2);
            } else {
                iArr[0] = 0;
            }
            if (layoutManager.canScrollVertically()) {
                C16682y yVar3 = (C16682y) ((C36570n) this.f161307i).getValue();
                C87412m.m108593f(yVar3, "verticalHelper");
                iArr[1] = mo79175q(layoutManager, view, yVar3);
            } else {
                iArr[1] = 0;
            }
        }
        mo79178t("calculateDistanceToFinalSnap x:" + iArr[0] + " y:" + iArr[1]);
        return iArr;
    }

    /* renamed from: e */
    public C54256s mo75028e(RecyclerView.LayoutManager layoutManager) {
        C87412m.m108594g(layoutManager, "layoutManager");
        if (!(layoutManager instanceof FinderLinearLayoutManager)) {
            return super.mo75028e(layoutManager);
        }
        RecyclerView recyclerView = this.f161309k;
        if (recyclerView != null) {
            return new C56442c(this, layoutManager, recyclerView.getContext());
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* renamed from: f */
    public View mo75029f(RecyclerView.LayoutManager layoutManager) {
        int i;
        int i2;
        int i3;
        int i4;
        C87412m.m108594g(layoutManager, "layoutManager");
        boolean canScrollVertically = layoutManager.canScrollVertically();
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount != 0) {
            float f = 0.0f;
            View view2 = null;
            int i5 = 0;
            while (true) {
                if (i5 >= childCount) {
                    view = view2;
                    break;
                }
                View childAt = layoutManager.getChildAt(i5);
                if (childAt != null && ((!canScrollVertically || childAt.getHeight() > 0) && (canScrollVertically || childAt.getWidth() > 0))) {
                    if (!mo79177s(childAt) || !childAt.getGlobalVisibleRect(this.f161319u) || this.f161319u.height() <= 0) {
                        if (childAt.getGlobalVisibleRect(this.f161319u)) {
                            Rect rect = this.f161319u;
                            i = canScrollVertically ? rect.height() : rect.width();
                        } else {
                            i = 0;
                        }
                        int height = canScrollVertically ? childAt.getHeight() : childAt.getWidth();
                        if (mo79176r(childAt) && childAt.getGlobalVisibleRect(this.f161319u) && this.f161319u.height() > 0) {
                            boolean z = this.f161310l;
                            View childAt2 = (!z || (i4 = i5 + 1) >= childCount) ? (z || (i3 = i5 + -1) < 0) ? null : layoutManager.getChildAt(i3) : layoutManager.getChildAt(i4);
                            if (childAt2 != null) {
                                if (childAt2.getGlobalVisibleRect(this.f161319u)) {
                                    Rect rect2 = this.f161319u;
                                    i2 = canScrollVertically ? rect2.height() : rect2.width();
                                } else {
                                    i2 = 0;
                                }
                                i += i2;
                                height += canScrollVertically ? childAt2.getHeight() : childAt2.getWidth();
                                mo79178t("findSnapView ignoreChild:" + childAt + " jumpIgnoreChild:" + childAt2);
                                childAt = childAt2;
                            }
                        }
                        float f2 = (((float) i) * 1.0f) / ((float) height);
                        if (f < f2) {
                            view2 = childAt;
                            f = f2;
                        }
                    } else {
                        Object tag = childAt.getTag(C0966R.C0970id.d_5);
                        mo79178t("[findSnapView] isSpecialView child=" + childAt + " rect=" + this.f161319u + " tag=" + tag);
                        if (tag == null || C87412m.m108589b(tag, Boolean.TRUE)) {
                            view = childAt;
                        } else {
                            childAt.setTag(C0966R.C0970id.d_5, Boolean.FALSE);
                        }
                    }
                }
                i5++;
            }
        }
        mo79178t("findSnapView() snapView:" + view);
        return view;
    }

    /* renamed from: g */
    public int mo75030g(RecyclerView.LayoutManager layoutManager, int i, int i2) {
        int i3;
        View view;
        int i4;
        int i5;
        C87412m.m108594g(layoutManager, "layoutManager");
        int g = super.mo75030g(layoutManager, i, i2);
        int i6 = 0;
        boolean z = true;
        if (!layoutManager.canScrollHorizontally() ? i2 <= 0 : i <= 0) {
            z = false;
        }
        this.f161310l = z;
        View findViewByPosition = layoutManager.findViewByPosition(g);
        if (!mo79176r(findViewByPosition)) {
            int i7 = -1;
            if (findViewByPosition == null || findViewByPosition.getHeight() <= 0) {
                LinearLayoutManager linearLayoutManager = this.f161306h;
                if (linearLayoutManager != null) {
                    int childCount = linearLayoutManager.getChildCount();
                    while (true) {
                        if (i6 >= childCount) {
                            i6 = -1;
                            break;
                        }
                        LinearLayoutManager linearLayoutManager2 = this.f161306h;
                        if (linearLayoutManager2 != null) {
                            View childAt = linearLayoutManager2.getChildAt(i6);
                            if (childAt != null && C87412m.m108589b(childAt, findViewByPosition)) {
                                break;
                            }
                            i6++;
                        } else {
                            C87412m.m108603p("layoutManager");
                            throw null;
                        }
                    }
                    if (i2 > 0 && (i5 = i6 + 1) < childCount) {
                        while (true) {
                            if (i5 >= childCount) {
                                break;
                            }
                            LinearLayoutManager linearLayoutManager3 = this.f161306h;
                            if (linearLayoutManager3 != null) {
                                view = linearLayoutManager3.getChildAt(i5);
                                if (view != null && view.getHeight() > 0) {
                                    break;
                                }
                                i5++;
                            } else {
                                C87412m.m108603p("layoutManager");
                                throw null;
                            }
                        }
                    } else if (i2 < 0 && i6 - 1 >= 0) {
                        while (true) {
                            if (-1 >= i4) {
                                break;
                            }
                            LinearLayoutManager linearLayoutManager4 = this.f161306h;
                            if (linearLayoutManager4 != null) {
                                view = linearLayoutManager4.getChildAt(i4);
                                if (view != null && view.getHeight() > 0) {
                                    break;
                                }
                                i4--;
                            } else {
                                C87412m.m108603p("layoutManager");
                                throw null;
                            }
                        }
                    }
                } else {
                    C87412m.m108603p("layoutManager");
                    throw null;
                }
            }
            view = findViewByPosition;
            if (view != null) {
                RecyclerView recyclerView = this.f161309k;
                if (recyclerView != null) {
                    RecyclerView.C16631z F0 = recyclerView.mo17021F0(view);
                    if (F0 != null) {
                        i7 = F0.mo17363j();
                    }
                } else {
                    C87412m.m108603p("recyclerView");
                    throw null;
                }
            }
            mo79178t("[findTargetSnapPosition] pos=" + g + " -> " + i7);
            if (findViewByPosition != null && mo79177s(findViewByPosition)) {
                findViewByPosition.setTag(C0966R.C0970id.d_5, Boolean.FALSE);
            }
            return i7;
        }
        RecyclerView recyclerView2 = this.f161309k;
        if (recyclerView2 != null) {
            RecyclerView.C16613e adapter = recyclerView2.getAdapter();
            if (adapter != null) {
                i6 = adapter.getItemCount();
            }
            boolean z2 = this.f161310l;
            if ((!z2 || (i3 = g + 1) >= i6) && (z2 || g - 1 < 0)) {
                i3 = g;
            }
            mo79178t("[findTargetSnapPosition] isIgnoreView pos=" + g + " -> " + i3);
            return i3;
        }
        C87412m.m108603p("recyclerView");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r3 = r3.f44854d;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79174p(androidx.recyclerview.widget.RecyclerView.C16631z r3, int r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x000b
            android.view.View r3 = r3.f44854d
            if (r3 == 0) goto L_0x000b
            android.view.View r3 = r3.findViewById(r4)
            goto L_0x000c
        L_0x000b:
            r3 = 0
        L_0x000c:
            if (r3 == 0) goto L_0x002b
            android.view.ViewPropertyAnimator r4 = r3.animate()
            if (r4 == 0) goto L_0x0017
            r4.cancel()
        L_0x0017:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            r4 = 1045220557(0x3e4ccccd, float:0.2)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r4)
            r0 = 110(0x6e, double:5.43E-322)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r0)
            r3.start()
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C56437x0.mo79174p(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }

    /* renamed from: q */
    public final int mo79175q(RecyclerView.LayoutManager layoutManager, View view, C16682y yVar) {
        int e = yVar.mo17564e(view);
        int k = yVar.mo17570k();
        int i = e - k;
        mo79178t("distanceToTop childTop:" + e + " containerTop:" + k + " targetViewHeight:" + view.getHeight() + " view:" + view);
        return i;
    }

    /* renamed from: r */
    public final boolean mo79176r(View view) {
        if (view == null) {
            return false;
        }
        for (Number intValue : this.f161305g) {
            View findViewById = view.findViewById(intValue.intValue());
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: s */
    public final boolean mo79177s(View view) {
        if (view == null) {
            return false;
        }
        for (Number intValue : this.f161304f) {
            View findViewById = view.findViewById(intValue.intValue());
            if (findViewById != null && findViewById.getVisibility() == 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: t */
    public final void mo79178t(String str) {
        if (f161303v) {
            Log.m105924i("Finder.FullPagerSnapHelper", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r3 = r3.f44854d;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo79179u(androidx.recyclerview.widget.RecyclerView.C16631z r3, int r4) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x000c
            android.view.View r3 = r3.f44854d
            if (r3 == 0) goto L_0x000c
            android.view.View r3 = r3.findViewById(r4)
            goto L_0x000d
        L_0x000c:
            r3 = r0
        L_0x000d:
            if (r3 == 0) goto L_0x0017
            float r4 = r3.getAlpha()
            java.lang.Float r0 = java.lang.Float.valueOf(r4)
        L_0x0017:
            r4 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = gy3.C87412m.m108588a(r0, r4)
            if (r0 != 0) goto L_0x003b
            if (r3 == 0) goto L_0x003b
            android.view.ViewPropertyAnimator r0 = r3.animate()
            if (r0 == 0) goto L_0x002a
            r0.cancel()
        L_0x002a:
            android.view.ViewPropertyAnimator r3 = r3.animate()
            android.view.ViewPropertyAnimator r3 = r3.alpha(r4)
            r0 = 110(0x6e, double:5.43E-322)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r0)
            r3.start()
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C56437x0.mo79179u(androidx.recyclerview.widget.RecyclerView$z, int):void");
    }
}

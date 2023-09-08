package kj1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.live.view.FinderMaxSizeLinearLayout;
import com.tencent.p014mm.plugin.finder.view.C4160r0;
import com.tencent.p014mm.plugin.finder.view.C4191v0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import er1.C7919x;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import nj3.C11182m0;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C76874e0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;

/* renamed from: kj1.s0 */
public final class C10222s0 {

    /* renamed from: a */
    public final Context f31211a;

    /* renamed from: b */
    public final boolean f31212b;

    /* renamed from: c */
    public final C13601g f31213c = C36568h.m40985a(new C10225c(this));

    /* renamed from: d */
    public final C13601g f31214d = C36568h.m40985a(new C10228f(this));

    /* renamed from: e */
    public final C13601g f31215e = C36568h.m40985a(new C10226d(this));

    /* renamed from: f */
    public final C13601g f31216f = C36568h.m40985a(new C10227e(this));

    /* renamed from: g */
    public final View f31217g;

    /* renamed from: h */
    public final RecyclerView f31218h;

    /* renamed from: i */
    public final RecyclerView f31219i;

    /* renamed from: j */
    public final C10223a f31220j;

    /* renamed from: k */
    public final C10223a f31221k;

    /* renamed from: l */
    public final C10223a f31222l;

    /* renamed from: m */
    public final TextView f31223m;

    /* renamed from: n */
    public final TextView f31224n;

    /* renamed from: o */
    public C11182m0 f31225o;

    /* renamed from: p */
    public C11182m0 f31226p;

    /* renamed from: q */
    public C11182m0 f31227q;

    /* renamed from: r */
    public C11183n0 f31228r;

    /* renamed from: kj1.s0$a */
    public final class C10223a extends RecyclerView.C16613e<C10224b> {

        /* renamed from: d */
        public C76874e0 f31229d;

        /* renamed from: e */
        public C11184p0 f31230e;

        public C10223a() {
        }

        public int getItemCount() {
            C76874e0 e0Var = this.f31229d;
            if (e0Var != null) {
                return e0Var.size();
            }
            return 0;
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x0039  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.C16631z r24, int r25) {
            /*
                r23 = this;
                r0 = r23
                r1 = r25
                r2 = r24
                kj1.s0$b r2 = (kj1.C10222s0.C10224b) r2
                java.lang.String r3 = "holder"
                gy3.C87412m.m108594g(r2, r3)
                nj3.e0 r3 = r0.f31229d
                r4 = 0
                r5 = 0
                java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
                if (r3 == 0) goto L_0x0034
                java.util.List<android.view.MenuItem> r3 = r3.f224704d
                if (r3 == 0) goto L_0x0034
                r7 = r3
                java.util.ArrayList r7 = (java.util.ArrayList) r7
                int r7 = r7.size()
                if (r1 >= r7) goto L_0x0026
                r7 = 1
                goto L_0x0027
            L_0x0026:
                r7 = 0
            L_0x0027:
                if (r7 == 0) goto L_0x002a
                goto L_0x002b
            L_0x002a:
                r3 = r4
            L_0x002b:
                if (r3 == 0) goto L_0x0034
                java.lang.Object r3 = r3.get(r1)
                android.view.MenuItem r3 = (android.view.MenuItem) r3
                goto L_0x0035
            L_0x0034:
                r3 = r4
            L_0x0035:
                boolean r7 = r3 instanceof nj3.C76875f0
                if (r7 == 0) goto L_0x003c
                r4 = r3
                nj3.f0 r4 = (nj3.C76875f0) r4
            L_0x003c:
                if (r4 != 0) goto L_0x0040
                goto L_0x023d
            L_0x0040:
                android.widget.TextView r3 = r2.f31236z
                java.lang.CharSequence r7 = r4.getTitle()
                r3.setText(r7)
                java.lang.CharSequence r3 = r4.getTitle()
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 == 0) goto L_0x0062
                java.lang.CharSequence r3 = r4.f224719n
                boolean r3 = android.text.TextUtils.isEmpty(r3)
                if (r3 != 0) goto L_0x0062
                android.widget.TextView r3 = r2.f31236z
                java.lang.CharSequence r7 = r4.f224719n
                r3.setText(r7)
            L_0x0062:
                android.widget.TextView r3 = r2.f31236z
                android.text.TextUtils$TruncateAt r7 = r4.f224720o
                r3.setEllipsize(r7)
                nj3.e0 r3 = r0.f31229d
                gy3.C87412m.m108591d(r3)
                int r3 = r3.size()
                r7 = 5
                if (r3 <= r7) goto L_0x007b
                android.widget.TextView r3 = r2.f31236z
                r7 = 2
                r3.setLines(r7)
            L_0x007b:
                android.graphics.drawable.Drawable r3 = r4.getIcon()
                r7 = 8
                if (r3 == 0) goto L_0x00b0
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                r3.setVisibility(r5)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                android.graphics.drawable.Drawable r8 = r4.getIcon()
                r3.setImageDrawable(r8)
                int r3 = r4.f224725t
                if (r3 == 0) goto L_0x009b
                com.tencent.mm.ui.widget.imageview.WeImageView r8 = r2.f31232A
                r8.setIconColor(r3)
                goto L_0x00b5
            L_0x009b:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                kj1.s0 r8 = kj1.C10222s0.this
                android.content.Context r8 = r8.f31211a
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131101688(0x7f0607f8, float:1.7815793E38)
                int r8 = r8.getColor(r9)
                r3.setIconColor(r8)
                goto L_0x00b5
            L_0x00b0:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                r3.setVisibility(r7)
            L_0x00b5:
                boolean r3 = r4.f224722q
                if (r3 == 0) goto L_0x00eb
                android.widget.TextView r3 = r2.f31236z
                kj1.s0 r8 = kj1.C10222s0.this
                android.content.Context r8 = r8.f31211a
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131100184(0x7f060218, float:1.7812742E38)
                int r8 = r8.getColor(r9)
                r3.setTextColor(r8)
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                kj1.s0 r8 = kj1.C10222s0.this
                android.content.Context r8 = r8.f31211a
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131099712(0x7f060040, float:1.7811785E38)
                int r8 = r8.getColor(r9)
                r3.setIconColor(r8)
                android.widget.ImageView r3 = r2.f31233B
                if (r3 == 0) goto L_0x010d
                r8 = 128(0x80, float:1.794E-43)
                r3.setAlpha(r8)
                goto L_0x010d
            L_0x00eb:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                r8 = 255(0xff, float:3.57E-43)
                r3.setAlpha(r8)
                android.widget.ImageView r3 = r2.f31233B
                if (r3 == 0) goto L_0x00f9
                r3.setAlpha(r8)
            L_0x00f9:
                android.widget.TextView r3 = r2.f31236z
                kj1.s0 r8 = kj1.C10222s0.this
                android.content.Context r8 = r8.f31211a
                android.content.res.Resources r8 = r8.getResources()
                r9 = 2131100185(0x7f060219, float:1.7812744E38)
                int r8 = r8.getColor(r9)
                r3.setTextColor(r8)
            L_0x010d:
                android.view.View r3 = r2.f31234C
                if (r3 == 0) goto L_0x0152
                boolean r8 = r4.f224712d
                if (r8 == 0) goto L_0x0152
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                r8.mo10233c(r6)
                java.lang.Object[] r10 = r8.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r12 = "onBindViewHolder"
                java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r9 = r3
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.Object r8 = r8.mo10231a(r5)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r3.setVisibility(r8)
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r11 = "onBindViewHolder"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
                goto L_0x0195
            L_0x0152:
                if (r3 != 0) goto L_0x0155
                goto L_0x0195
            L_0x0155:
                k20.a r8 = new k20.a
                r8.<init>()
                java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
                java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
                r8.mo10233c(r9)
                java.lang.Object[] r10 = r8.mo10232b()
                java.lang.String r11 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r12 = "onBindViewHolder"
                java.lang.String r13 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r14 = "android/view/View_EXEC_"
                java.lang.String r15 = "setVisibility"
                java.lang.String r16 = "(I)V"
                r9 = r3
                j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
                java.lang.Object r8 = r8.mo10231a(r5)
                java.lang.Integer r8 = (java.lang.Integer) r8
                int r8 = r8.intValue()
                r3.setVisibility(r8)
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r11 = "onBindViewHolder"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
            L_0x0195:
                boolean r3 = r4.f224713e
                if (r3 == 0) goto L_0x01dc
                android.view.View r3 = r2.f31235D
                if (r3 != 0) goto L_0x019f
                goto L_0x0221
            L_0x019f:
                k20.a r7 = new k20.a
                r7.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                r7.mo10233c(r6)
                java.lang.Object[] r9 = r7.mo10232b()
                java.lang.String r10 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r11 = "onBindViewHolder"
                java.lang.String r12 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r13 = "android/view/View_EXEC_"
                java.lang.String r14 = "setVisibility"
                java.lang.String r15 = "(I)V"
                r8 = r3
                j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
                java.lang.Object r5 = r7.mo10231a(r5)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r3.setVisibility(r5)
                java.lang.String r9 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r10 = "onBindViewHolder"
                java.lang.String r11 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r12 = "android/view/View_EXEC_"
                java.lang.String r13 = "setVisibility"
                java.lang.String r14 = "(I)V"
                j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x0221
            L_0x01dc:
                android.view.View r3 = r2.f31235D
                if (r3 != 0) goto L_0x01e1
                goto L_0x0221
            L_0x01e1:
                k20.a r6 = new k20.a
                r6.<init>()
                java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
                java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                r6.mo10233c(r7)
                java.lang.Object[] r16 = r6.mo10232b()
                java.lang.String r17 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r18 = "onBindViewHolder"
                java.lang.String r19 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r3
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r5 = r6.mo10231a(r5)
                java.lang.Integer r5 = (java.lang.Integer) r5
                int r5 = r5.intValue()
                r3.setVisibility(r5)
                java.lang.String r16 = "com/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$RecycleViewAdapter"
                java.lang.String r17 = "onBindViewHolder"
                java.lang.String r18 = "(Lcom/tencent/mm/plugin/finder/live/moreaction/FinderLiveAnchorMoreActionBottomSheet$ViewHolder;I)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            L_0x0221:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r2.f31232A
                boolean r5 = r4.f224727v
                r3.setEnableColorFilter(r5)
                android.view.View r3 = r2.f44854d
                kj1.r0 r5 = new kj1.r0
                r5.<init>(r0, r4, r1)
                r3.setOnClickListener(r5)
                kj1.s0 r3 = kj1.C10222s0.this
                nj3.n0 r3 = r3.f31228r
                if (r3 == 0) goto L_0x023d
                android.view.View r2 = r2.f44854d
                r3.mo2585a(r2, r1, r4)
            L_0x023d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kj1.C10222s0.C10223a.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$z, int):void");
        }

        public RecyclerView.C16631z onCreateViewHolder(ViewGroup viewGroup, int i) {
            C87412m.m108594g(viewGroup, "parent");
            View inflate = LayoutInflater.from(C10222s0.this.f31211a).inflate(C0966R.C0971layout.d1r, viewGroup, false);
            C87412m.m108593f(inflate, "view");
            return new C10224b(inflate);
        }
    }

    /* renamed from: kj1.s0$b */
    public static final class C10224b extends RecyclerView.C16631z {

        /* renamed from: A */
        public final WeImageView f31232A;

        /* renamed from: B */
        public final ImageView f31233B;

        /* renamed from: C */
        public final View f31234C;

        /* renamed from: D */
        public final View f31235D;

        /* renamed from: z */
        public final TextView f31236z;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10224b(View view) {
            super(view);
            C87412m.m108594g(view, "itemView");
            this.f31236z = (TextView) view.findViewById(C0966R.C0970id.knx);
            this.f31232A = (WeImageView) view.findViewById(C0966R.C0970id.f15);
            this.f31233B = (ImageView) view.findViewById(C0966R.C0970id.f1j);
            this.f31234C = view.findViewById(C0966R.C0970id.hdw);
            this.f31235D = view.findViewById(C0966R.C0970id.f359044ij1);
        }
    }

    /* renamed from: kj1.s0$c */
    public static final class C10225c extends C87413o implements C32224a<C4191v0> {

        /* renamed from: d */
        public final /* synthetic */ C10222s0 f31237d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10225c(C10222s0 s0Var) {
            super(0);
            this.f31237d = s0Var;
        }

        public Object invoke() {
            int i = this.f31237d.f31211a.getResources().getDisplayMetrics().heightPixels;
            int i2 = (int) (((double) i) * 0.6d);
            C4191v0 v0Var = new C4191v0(this.f31237d.f31211a);
            C10222s0 s0Var = this.f31237d;
            Log.m105924i("Finder.FinderLiveAnchorMoreActionBottomSheet", "isLandscape:" + s0Var.f31212b + ", peekHeight:" + i2);
            if (s0Var.f31212b) {
                v0Var.mo5071f(s0Var.f31217g, new FrameLayout.LayoutParams(i, -2));
            } else {
                if (i2 <= 0) {
                    i2 = -2;
                }
                v0Var.mo5071f(s0Var.f31217g, new FrameLayout.LayoutParams(-1, -2));
                if (i2 > 0) {
                    View view = s0Var.f31217g;
                    FinderMaxSizeLinearLayout finderMaxSizeLinearLayout = view instanceof FinderMaxSizeLinearLayout ? (FinderMaxSizeLinearLayout) view : null;
                    if (finderMaxSizeLinearLayout != null) {
                        finderMaxSizeLinearLayout.setMaxHeight(i2);
                    }
                    Log.m105924i("Finder.FinderLiveAnchorMoreActionBottomSheet", "setMaxHeight");
                }
            }
            v0Var.f18469o = true;
            v0Var.mo5067b(true);
            v0Var.f18457B.setVisibility(0);
            v0Var.f18478x = true;
            v0Var.f18479y = true;
            float dimension = v0Var.f18463f.getContext().getResources().getDimension(C0966R.dimen.f3758d_);
            float dimension2 = v0Var.f18463f.getContext().getResources().getDimension(C0966R.dimen.f3736cp);
            v0Var.f18471q.f309240z = new C4160r0(v0Var, dimension, v0Var.f18463f.getContext().getResources().getDimension(C0966R.dimen.f3703bv), dimension2);
            return v0Var;
        }
    }

    /* renamed from: kj1.s0$d */
    public static final class C10226d extends C87413o implements C32224a<C76874e0> {

        /* renamed from: d */
        public final /* synthetic */ C10222s0 f31238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10226d(C10222s0 s0Var) {
            super(0);
            this.f31238d = s0Var;
        }

        public Object invoke() {
            return new C76874e0(this.f31238d.f31211a);
        }
    }

    /* renamed from: kj1.s0$e */
    public static final class C10227e extends C87413o implements C32224a<C76874e0> {

        /* renamed from: d */
        public final /* synthetic */ C10222s0 f31239d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10227e(C10222s0 s0Var) {
            super(0);
            this.f31239d = s0Var;
        }

        public Object invoke() {
            return new C76874e0(this.f31239d.f31211a);
        }
    }

    /* renamed from: kj1.s0$f */
    public static final class C10228f extends C87413o implements C32224a<C76874e0> {

        /* renamed from: d */
        public final /* synthetic */ C10222s0 f31240d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C10228f(C10222s0 s0Var) {
            super(0);
            this.f31240d = s0Var;
        }

        public Object invoke() {
            return new C76874e0(this.f31240d.f31211a);
        }
    }

    static {
        MMApplicationContext.getContext().getResources().getDimension(C0966R.dimen.f3736cp);
    }

    public C10222s0(Context context, boolean z) {
        C87412m.m108594g(context, "context");
        this.f31211a = context;
        this.f31212b = z;
        View inflate = View.inflate(context, C0966R.C0971layout.ae4, (ViewGroup) null);
        C87412m.m108593f(inflate, "inflate(context, R.layou…_sheet_custom_view, null)");
        this.f31217g = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.f358086db0);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.…t_zero_menu_recyclerview)");
        RecyclerView recyclerView = (RecyclerView) findViewById;
        this.f31218h = recyclerView;
        View findViewById2 = inflate.findViewById(C0966R.C0970id.dav);
        C87412m.m108593f(findViewById2, "rootView.findViewById(R.…_first_menu_recyclerview)");
        RecyclerView recyclerView2 = (RecyclerView) findViewById2;
        this.f31219i = recyclerView2;
        View findViewById3 = inflate.findViewById(C0966R.C0970id.dax);
        C87412m.m108593f(findViewById3, "rootView.findViewById(R.…second_menu_recyclerview)");
        View findViewById4 = inflate.findViewById(C0966R.C0970id.daz);
        C87412m.m108593f(findViewById4, "rootView.findViewById(R.…tom_sheet_zero_menu_line)");
        TextView textView = (TextView) findViewById4;
        this.f31223m = textView;
        View findViewById5 = inflate.findViewById(C0966R.C0970id.dau);
        C87412m.m108593f(findViewById5, "rootView.findViewById(R.…om_sheet_first_menu_line)");
        TextView textView2 = (TextView) findViewById5;
        this.f31224n = textView2;
        View findViewById6 = inflate.findViewById(C0966R.C0970id.daw);
        C87412m.m108593f(findViewById6, "rootView.findViewById(R.…m_sheet_second_menu_line)");
        C7919x.m8091a(textView);
        C7919x.m8091a(textView2);
        C7919x.m8091a((TextView) findViewById6);
        C10223a aVar = new C10223a();
        this.f31220j = aVar;
        C10223a aVar2 = new C10223a();
        this.f31221k = aVar2;
        C10223a aVar3 = new C10223a();
        this.f31222l = aVar3;
        mo10567a(recyclerView, aVar);
        mo10567a(recyclerView2, aVar2);
        mo10567a((RecyclerView) findViewById3, aVar3);
    }

    /* renamed from: a */
    public final void mo10567a(RecyclerView recyclerView, C10223a aVar) {
        recyclerView.setFocusable(false);
        recyclerView.setAdapter(aVar);
        recyclerView.setLayoutManager(new GridLayoutManager(this.f31211a, 5));
    }

    /* renamed from: b */
    public final void mo10568b() {
        ((C4191v0) ((C36570n) this.f31213c).getValue()).mo5072g();
    }

    /* renamed from: c */
    public final void mo10569c() {
        C11182m0 m0Var = this.f31225o;
        if (m0Var != null) {
            m0Var.onCreateMMMenu((C76874e0) ((C36570n) this.f31214d).getValue());
        }
        this.f31220j.f31229d = (C76874e0) ((C36570n) this.f31214d).getValue();
        this.f31220j.notifyDataSetChanged();
        C11182m0 m0Var2 = this.f31226p;
        if (m0Var2 != null) {
            m0Var2.onCreateMMMenu((C76874e0) ((C36570n) this.f31215e).getValue());
        }
        this.f31221k.f31229d = (C76874e0) ((C36570n) this.f31215e).getValue();
        this.f31221k.notifyDataSetChanged();
        C11182m0 m0Var3 = this.f31227q;
        if (m0Var3 != null) {
            m0Var3.onCreateMMMenu((C76874e0) ((C36570n) this.f31216f).getValue());
        }
        this.f31222l.f31229d = (C76874e0) ((C36570n) this.f31216f).getValue();
        this.f31222l.notifyDataSetChanged();
        ((C4191v0) ((C36570n) this.f31213c).getValue()).mo5073h();
    }
}

package pp1;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C9507n;
import wc1.C15064b;

/* renamed from: pp1.d */
public final class C62431d extends C9507n {

    /* renamed from: A */
    public final boolean f177411A;

    /* renamed from: B */
    public C62433b f177412B;

    /* renamed from: C */
    public final TextView f177413C;

    /* renamed from: D */
    public final WeImageView f177414D;

    /* renamed from: E */
    public final LinearLayout f177415E;

    /* renamed from: F */
    public final LinearLayout f177416F;

    /* renamed from: G */
    public final ConstraintLayout f177417G;

    /* renamed from: H */
    public C62432a f177418H = C62432a.Goods;

    /* renamed from: pp1.d$a */
    public enum C62432a {
        Coupon,
        Goods,
        Detail
    }

    /* renamed from: pp1.d$b */
    public interface C62433b {
        /* renamed from: a */
        void mo86776a();

        /* renamed from: b */
        void mo86777b();

        /* renamed from: c */
        void mo86778c();
    }

    /* renamed from: pp1.d$c */
    public static final class C62434c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62431d f177423d;

        public C62434c(C62431d dVar) {
            this.f177423d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62433b bVar = this.f177423d.f177412B;
            if (bVar != null) {
                bVar.mo86777b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pp1.d$d */
    public static final class C62435d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62431d f177424d;

        public C62435d(C62431d dVar) {
            this.f177424d = dVar;
        }

        public final void onClick(View view) {
            C62433b bVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62431d dVar = this.f177424d;
            if (dVar.f177418H == C62432a.Coupon && (bVar = dVar.f177412B) != null) {
                bVar.mo86777b();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pp1.d$e */
    public static final class C62436e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62431d f177425d;

        public C62436e(C62431d dVar) {
            this.f177425d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62433b bVar = this.f177425d.f177412B;
            if (bVar != null) {
                bVar.mo86776a();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: pp1.d$f */
    public static final class C62437f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C62431d f177426d;

        public C62437f(C62431d dVar) {
            this.f177426d = dVar;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C62433b bVar = this.f177426d.f177412B;
            if (bVar != null) {
                bVar.mo86778c();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$update$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62431d(View view, boolean z) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f177411A = z;
        TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
        C15064b bVar = C15064b.f41199a;
        Context context = view.getContext();
        C87412m.m108593f(context, "itemView.context");
        C15064b bVar2 = bVar;
        C15064b.m14230a(bVar2, context, textView, 14.0f, 0.0f, 8, (Object) null);
        this.f177413C = textView;
        this.f177414D = (WeImageView) view.findViewById(C0966R.C0970id.gz5);
        this.f177415E = (LinearLayout) view.findViewById(C0966R.C0970id.f5585j3);
        Context context2 = view.getContext();
        C87412m.m108593f(context2, "itemView.context");
        C15064b.m14230a(bVar2, context2, (TextView) view.findViewById(C0966R.C0970id.c5p), 14.0f, 0.0f, 8, (Object) null);
        this.f177416F = (LinearLayout) view.findViewById(C0966R.C0970id.f358714go0);
        Context context3 = view.getContext();
        C87412m.m108593f(context3, "itemView.context");
        C15064b.m14230a(bVar2, context3, (TextView) view.findViewById(C0966R.C0970id.o9j), 14.0f, 0.0f, 8, (Object) null);
        this.f177417G = (ConstraintLayout) view.findViewById(C0966R.C0970id.f357785br0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0166  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87480z(java.lang.String r15, pp1.C62431d.C62432a r16, boolean r17, boolean r18, boolean r19) {
        /*
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            java.lang.String r3 = "title"
            gy3.C87412m.m108594g(r15, r3)
            java.lang.String r3 = "type"
            gy3.C87412m.m108594g(r2, r3)
            android.view.View r3 = r0.f44854d
            k20.a r12 = new k20.a
            r12.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r13 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r13)
            r12.mo10233c(r4)
            java.lang.Object[] r5 = r12.mo10232b()
            java.lang.String r6 = "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder"
            java.lang.String r7 = "update"
            java.lang.String r8 = "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$ShoppingHeaderType;ZZZ)V"
            java.lang.String r9 = "android/view/View_EXEC_"
            java.lang.String r10 = "setVisibility"
            java.lang.String r11 = "(I)V"
            r4 = r3
            j20.C117292a.m165358d(r4, r5, r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r12.mo10231a(r13)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r5 = "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder"
            java.lang.String r6 = "update"
            java.lang.String r7 = "(Ljava/lang/String;Lcom/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingHeaderViewHolder$ShoppingHeaderType;ZZZ)V"
            java.lang.String r8 = "android/view/View_EXEC_"
            java.lang.String r9 = "setVisibility"
            java.lang.String r10 = "(I)V"
            r4 = r3
            j20.C117292a.m165359e(r4, r5, r6, r7, r8, r9, r10)
            android.widget.TextView r3 = r0.f177413C
            r3.setText(r15)
            r0.f177418H = r2
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f177414D
            pp1.d$a r3 = pp1.C62431d.C62432a.Coupon
            r4 = 8
            if (r2 != r3) goto L_0x0067
            r3 = 0
            goto L_0x0069
        L_0x0067:
            r3 = 8
        L_0x0069:
            r1.setVisibility(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = r0.f177414D
            pp1.d$c r3 = new pp1.d$c
            r3.<init>(r14)
            r1.setOnClickListener(r3)
            android.view.View r1 = r0.f44854d
            pp1.d$d r3 = new pp1.d$d
            r3.<init>(r14)
            r1.setOnClickListener(r3)
            android.widget.LinearLayout r1 = r0.f177415E
            pp1.d$a r3 = pp1.C62431d.C62432a.Goods
            r5 = 1
            if (r2 != r3) goto L_0x009f
            ok1.e r6 = ok1.C62042e.f176370a
            boolean r6 = r6.mo87027N0()
            if (r6 != 0) goto L_0x0096
            boolean r6 = r0.f177411A
            if (r6 == 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r6 = 0
            goto L_0x0097
        L_0x0096:
            r6 = 1
        L_0x0097:
            if (r6 == 0) goto L_0x009f
            if (r18 != 0) goto L_0x009d
            if (r19 == 0) goto L_0x009f
        L_0x009d:
            r6 = 0
            goto L_0x00a1
        L_0x009f:
            r6 = 8
        L_0x00a1:
            r1.setVisibility(r6)
            android.widget.LinearLayout r1 = r0.f177415E
            pp1.d$e r6 = new pp1.d$e
            r6.<init>(r14)
            r1.setOnClickListener(r6)
            android.widget.LinearLayout r1 = r0.f177416F
            if (r2 != r3) goto L_0x00c7
            ok1.e r3 = ok1.C62042e.f176370a
            boolean r3 = r3.mo87027N0()
            if (r3 != 0) goto L_0x00c1
            boolean r3 = r0.f177411A
            if (r3 == 0) goto L_0x00bf
            goto L_0x00c1
        L_0x00bf:
            r3 = 0
            goto L_0x00c2
        L_0x00c1:
            r3 = 1
        L_0x00c2:
            if (r3 == 0) goto L_0x00c7
            if (r18 == 0) goto L_0x00c7
            r4 = 0
        L_0x00c7:
            r1.setVisibility(r4)
            android.widget.LinearLayout r1 = r0.f177416F
            pp1.d$f r3 = new pp1.d$f
            r3.<init>(r14)
            r1.setOnClickListener(r3)
            android.widget.TextView r1 = r0.f177413C
            android.view.View r3 = r0.f44854d
            android.content.Context r3 = r3.getContext()
            pp1.d$a r4 = pp1.C62431d.C62432a.Detail
            if (r2 == r4) goto L_0x00e4
            r4 = 2131099927(0x7f060117, float:1.7812221E38)
            goto L_0x00e7
        L_0x00e4:
            r4 = 2131099919(0x7f06010f, float:1.7812205E38)
        L_0x00e7:
            int r3 = kg3.C76577a.m92153d(r3, r4)
            r1.setTextColor(r3)
            int r1 = r16.ordinal()
            java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams"
            if (r1 == 0) goto L_0x0166
            r3 = 2131166432(0x7f0704e0, float:1.794711E38)
            r4 = 2131166452(0x7f0704f4, float:1.794715E38)
            if (r1 == r5) goto L_0x013f
            r5 = 2
            if (r1 == r5) goto L_0x0103
            goto L_0x0181
        L_0x0103:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r0.f177417G
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r1, r2)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            android.view.View r2 = r0.f44854d
            android.content.Context r2 = r2.getContext()
            r5 = 2131166451(0x7f0704f3, float:1.7947148E38)
            int r2 = kg3.C76577a.m92155f(r2, r5)
            if (r17 == 0) goto L_0x0124
            android.view.View r5 = r0.f44854d
            android.content.Context r5 = r5.getContext()
            goto L_0x012d
        L_0x0124:
            android.view.View r4 = r0.f44854d
            android.content.Context r5 = r4.getContext()
            r4 = 2131166429(0x7f0704dd, float:1.7947103E38)
        L_0x012d:
            int r4 = kg3.C76577a.m92155f(r5, r4)
            android.view.View r5 = r0.f44854d
            android.content.Context r5 = r5.getContext()
            int r3 = kg3.C76577a.m92155f(r5, r3)
            r1.setMargins(r2, r4, r13, r3)
            goto L_0x0181
        L_0x013f:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r0.f177417G
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r1, r2)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            if (r17 == 0) goto L_0x0157
            android.view.View r2 = r0.f44854d
            android.content.Context r2 = r2.getContext()
            int r2 = kg3.C76577a.m92155f(r2, r4)
            goto L_0x0158
        L_0x0157:
            r2 = 0
        L_0x0158:
            android.view.View r4 = r0.f44854d
            android.content.Context r4 = r4.getContext()
            int r3 = kg3.C76577a.m92155f(r4, r3)
            r1.setMargins(r13, r2, r13, r3)
            goto L_0x0181
        L_0x0166:
            androidx.constraintlayout.widget.ConstraintLayout r1 = r0.f177417G
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            gy3.C87412m.m108592e(r1, r2)
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            android.view.View r2 = r0.f44854d
            android.content.Context r2 = r2.getContext()
            r3 = 2131165371(0x7f0700bb, float:1.7944957E38)
            int r2 = kg3.C76577a.m92155f(r2, r3)
            r1.setMargins(r13, r13, r13, r2)
        L_0x0181:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.C62431d.mo87480z(java.lang.String, pp1.d$a, boolean, boolean, boolean):void");
    }
}

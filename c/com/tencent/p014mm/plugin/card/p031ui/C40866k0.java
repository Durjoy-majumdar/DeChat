package com.tencent.p014mm.plugin.card.p031ui;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import dz0.C45498d;
import java.util.LinkedList;

/* renamed from: com.tencent.mm.plugin.card.ui.k0 */
public class C40866k0 implements C45498d {

    /* renamed from: a */
    public Context f109882a;

    /* renamed from: b */
    public BaseAdapter f109883b;

    /* renamed from: c */
    public int f109884c;

    /* renamed from: d */
    public int f109885d;

    /* renamed from: e */
    public int f109886e;

    /* renamed from: f */
    public LinkedList<CardTagTextView> f109887f = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.card.ui.k0$a */
    public class C40867a {

        /* renamed from: a */
        public RelativeLayout f109888a;

        /* renamed from: b */
        public ImageView f109889b;

        /* renamed from: c */
        public View f109890c;

        /* renamed from: d */
        public ImageView f109891d;

        /* renamed from: e */
        public TextView f109892e;

        /* renamed from: f */
        public TextView f109893f;

        /* renamed from: g */
        public TextView f109894g;

        /* renamed from: h */
        public ImageView f109895h;

        /* renamed from: i */
        public LinearLayout f109896i;

        /* renamed from: j */
        public ImageView f109897j;

        /* renamed from: k */
        public ImageView f109898k;

        /* renamed from: l */
        public ImageView f109899l;

        public C40867a(C40866k0 k0Var) {
        }
    }

    public C40866k0(Context context, BaseAdapter baseAdapter) {
        this.f109882a = context;
        this.f109883b = baseAdapter;
        this.f109884c = context.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        this.f109885d = this.f109882a.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
        this.f109886e = this.f109882a.getResources().getDimensionPixelOffset(C0966R.dimen.f4219wm);
        this.f109882a.getResources().getDimensionPixelOffset(C0966R.dimen.f4220wn);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.tencent.mm.plugin.card.ui.k0$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x01e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo63834a(int r21, android.view.View r22, android.view.ViewGroup r23, dz0.C20483c r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            if (r22 != 0) goto L_0x00ef
            java.lang.String r2 = r24.getCardId()
            java.lang.String r3 = "PRIVATE_TICKET_TITLE"
            boolean r2 = r2.equals(r3)
            r3 = 2131298826(0x7f090a0a, float:1.8215636E38)
            r4 = 2131493514(0x7f0c028a, float:1.861051E38)
            r5 = 0
            if (r2 == 0) goto L_0x0034
            android.content.Context r2 = r0.f109882a
            android.view.View r2 = android.view.View.inflate(r2, r4, r5)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0064
            android.content.Context r4 = r0.f109882a
            r5 = 2131823225(0x7f110a79, float:1.9279244E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setText(r4)
            goto L_0x0064
        L_0x0034:
            java.lang.String r2 = r24.getCardId()
            java.lang.String r6 = "PRIVATE_INVOICE_TITLE"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x005b
            android.content.Context r2 = r0.f109882a
            android.view.View r2 = android.view.View.inflate(r2, r4, r5)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L_0x0064
            android.content.Context r4 = r0.f109882a
            r5 = 2131823109(0x7f110a05, float:1.9279008E38)
            java.lang.String r4 = r4.getString(r5)
            r3.setText(r4)
            goto L_0x0064
        L_0x005b:
            android.content.Context r2 = r0.f109882a
            r3 = 2131493512(0x7f0c0288, float:1.8610506E38)
            android.view.View r2 = android.view.View.inflate(r2, r3, r5)
        L_0x0064:
            com.tencent.mm.plugin.card.ui.k0$a r3 = new com.tencent.mm.plugin.card.ui.k0$a
            r3.<init>(r0)
            r4 = 2131298751(0x7f0909bf, float:1.8215484E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r3.f109888a = r4
            r4 = 2131298810(0x7f0909fa, float:1.8215604E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f109889b = r4
            r4 = 2131298902(0x7f090a56, float:1.821579E38)
            android.view.View r4 = r2.findViewById(r4)
            r3.f109890c = r4
            r4 = 2131298901(0x7f090a55, float:1.8215788E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f109891d = r4
            r4 = 2131298717(0x7f09099d, float:1.8215415E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f109892e = r4
            r4 = 2131298846(0x7f090a1e, float:1.8215677E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f109893f = r4
            r4 = 2131298847(0x7f090a1f, float:1.8215679E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.f109894g = r4
            r4 = 2131298695(0x7f090987, float:1.821537E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f109895h = r4
            r4 = 2131298710(0x7f090996, float:1.82154E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f109897j = r4
            r4 = 2131298712(0x7f090998, float:1.8215405E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f109898k = r4
            r4 = 2131298711(0x7f090997, float:1.8215403E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.f109899l = r4
            r4 = 2131298872(0x7f090a38, float:1.821573E38)
            android.view.View r4 = r2.findViewById(r4)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.f109896i = r4
            r2.setTag(r3)
            goto L_0x00f8
        L_0x00ef:
            java.lang.Object r2 = r22.getTag()
            r3 = r2
            com.tencent.mm.plugin.card.ui.k0$a r3 = (com.tencent.p014mm.plugin.card.p031ui.C40866k0.C40867a) r3
            r2 = r22
        L_0x00f8:
            android.widget.TextView r4 = r3.f109893f
            r5 = 0
            if (r4 == 0) goto L_0x010f
            android.content.Context r4 = r0.f109882a
            android.content.res.Resources r4 = r4.getResources()
            r6 = 2131165202(0x7f070012, float:1.7944614E38)
            float r4 = r4.getDimension(r6)
            android.widget.TextView r6 = r3.f109893f
            r6.setTextSize(r5, r4)
        L_0x010f:
            android.widget.BaseAdapter r4 = r0.f109883b
            java.lang.Object r4 = r4.getItem(r1)
            boolean r4 = r4 instanceof com.tencent.p014mm.plugin.card.model.CardInfo
            r6 = 8
            r7 = 2131101837(0x7f06088d, float:1.7816095E38)
            r8 = 1
            if (r4 == 0) goto L_0x01ec
            android.widget.BaseAdapter r4 = r0.f109883b
            java.lang.Object r4 = r4.getItem(r1)
            com.tencent.mm.plugin.card.model.CardInfo r4 = (com.tencent.p014mm.plugin.card.model.CardInfo) r4
            int r9 = r4.field_stickyIndex
            int r10 = r9 % 10
            if (r10 == 0) goto L_0x0136
            if (r9 <= 0) goto L_0x0142
            android.content.Context r10 = r0.f109882a
            java.lang.String r9 = wz0.C53261k.m59694a(r10, r9, r4)
            goto L_0x0140
        L_0x0136:
            java.lang.String r9 = r4.field_label_wording
            boolean r9 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r9 != 0) goto L_0x0142
            java.lang.String r9 = r4.field_label_wording
        L_0x0140:
            r10 = 1
            goto L_0x0145
        L_0x0142:
            java.lang.String r9 = ""
            r10 = 0
        L_0x0145:
            if (r10 == 0) goto L_0x01e7
            r10 = 0
        L_0x0148:
            android.widget.LinearLayout r11 = r3.f109896i
            int r11 = r11.getChildCount()
            if (r10 >= r11) goto L_0x0160
            android.widget.LinearLayout r11 = r3.f109896i
            android.view.View r11 = r11.getChildAt(r10)
            com.tencent.mm.plugin.card.widget.CardTagTextView r11 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r11
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r12 = r0.f109887f
            r12.add(r11)
            int r10 = r10 + 1
            goto L_0x0148
        L_0x0160:
            android.widget.LinearLayout r10 = r3.f109896i
            r10.removeAllViews()
            android.widget.LinearLayout r10 = r3.f109896i
            r10.setVisibility(r5)
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r10 = r0.f109887f
            int r10 = r10.size()
            if (r10 != 0) goto L_0x017a
            com.tencent.mm.plugin.card.widget.CardTagTextView r10 = new com.tencent.mm.plugin.card.widget.CardTagTextView
            android.content.Context r11 = r0.f109882a
            r10.<init>(r11)
            goto L_0x0182
        L_0x017a:
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r10 = r0.f109887f
            java.lang.Object r10 = r10.removeFirst()
            com.tencent.mm.plugin.card.widget.CardTagTextView r10 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r10
        L_0x0182:
            int r11 = r0.f109885d
            int r12 = r0.f109884c
            r10.setPadding(r11, r12, r11, r12)
            r11 = 17
            r10.setGravity(r11)
            android.content.Context r11 = r0.f109882a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131166080(0x7f070380, float:1.7946395E38)
            int r11 = r11.getDimensionPixelSize(r12)
            r10.setMinWidth(r11)
            android.content.Context r11 = r0.f109882a
            android.content.res.Resources r11 = r11.getResources()
            r12 = 2131166079(0x7f07037f, float:1.7946393E38)
            int r11 = r11.getDimensionPixelSize(r12)
            r10.setMinHeight(r11)
            boolean r4 = r4.mo23291o()
            if (r4 == 0) goto L_0x01ca
            android.content.Context r4 = r0.f109882a
            int r4 = kg3.C76577a.m92153d(r4, r7)
            r10.setTextColor(r4)
            android.content.Context r4 = r0.f109882a
            r11 = 2131100270(0x7f06026e, float:1.7812917E38)
            int r4 = kg3.C76577a.m92153d(r4, r11)
            r10.setFillColor(r4)
            goto L_0x01d9
        L_0x01ca:
            android.content.Context r4 = r0.f109882a
            r11 = 2131101015(0x7f060557, float:1.7814428E38)
            int r4 = kg3.C76577a.m92153d(r4, r11)
            r10.setTextColor(r4)
            r10.setFillColor(r5)
        L_0x01d9:
            r10.setText(r9)
            r4 = 1092616192(0x41200000, float:10.0)
            r10.setTextSize(r8, r4)
            android.widget.LinearLayout r4 = r3.f109896i
            r4.addView(r10)
            goto L_0x01ec
        L_0x01e7:
            android.widget.LinearLayout r4 = r3.f109896i
            r4.setVisibility(r6)
        L_0x01ec:
            boolean r4 = r24.mo23266N0()
            if (r4 == 0) goto L_0x0420
            android.widget.ImageView r4 = r3.f109889b
            r4.setVisibility(r5)
            android.widget.TextView r4 = r3.f109893f
            r4.setVisibility(r5)
            android.widget.TextView r4 = r3.f109894g
            r4.setVisibility(r6)
            android.widget.TextView r4 = r3.f109892e
            r4.setVisibility(r5)
            android.widget.TextView r4 = r3.f109892e
            te3.ko r9 = r24.mo23264L0()
            java.lang.String r9 = r9.f64142j
            r4.setText(r9)
            android.widget.TextView r4 = r3.f109893f
            te3.ko r9 = r24.mo23264L0()
            java.lang.String r9 = r9.f64143n
            r4.setText(r9)
            boolean r4 = r24.mo23271R1()
            r9 = 2131166083(0x7f070383, float:1.7946401E38)
            if (r4 == 0) goto L_0x02bb
            android.view.View r4 = r3.f109890c
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r10)
            java.lang.Object[] r11 = r15.mo10232b()
            java.lang.String r12 = "com/tencent/mm/plugin/card/ui/CardViewProxy"
            java.lang.String r13 = "updateView"
            java.lang.String r14 = "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            r10 = r4
            r7 = r15
            r15 = r16
            r16 = r17
            r17 = r18
            j20.C117292a.m165358d(r10, r11, r12, r13, r14, r15, r16, r17)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4.setVisibility(r7)
            java.lang.String r11 = "com/tencent/mm/plugin/card/ui/CardViewProxy"
            java.lang.String r12 = "updateView"
            java.lang.String r13 = "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.widget.ImageView r4 = r3.f109889b
            r7 = 4
            r4.setVisibility(r7)
            android.widget.ImageView r11 = r3.f109891d
            te3.ko r4 = r24.mo23264L0()
            java.lang.String r4 = r4.f64105C
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x02a8
            android.content.Context r4 = r0.f109882a
            android.content.res.Resources r4 = r4.getResources()
            int r13 = r4.getDimensionPixelSize(r9)
            android.content.Context r10 = r0.f109882a
            te3.ko r4 = r24.mo23264L0()
            java.lang.String r12 = r4.f64105C
            r14 = 2131231525(0x7f080325, float:1.8079133E38)
            r15 = 0
            te3.ko r4 = r24.mo23264L0()
            java.lang.String r4 = r4.f64145p
            int r16 = wz0.C22945n.m27004d(r4)
            wz0.C53263p.m59702c(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x031c
        L_0x02a8:
            android.content.Context r4 = r0.f109882a
            r7 = 2131231525(0x7f080325, float:1.8079133E38)
            te3.ko r9 = r24.mo23264L0()
            java.lang.String r9 = r9.f64145p
            int r9 = wz0.C22945n.m27004d(r9)
            wz0.C53263p.m59703d(r4, r11, r7, r9)
            goto L_0x031c
        L_0x02bb:
            android.view.View r4 = r3.f109890c
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            java.lang.Integer r10 = java.lang.Integer.valueOf(r6)
            r7.mo10233c(r10)
            java.lang.Object[] r13 = r7.mo10232b()
            java.lang.String r14 = "com/tencent/mm/plugin/card/ui/CardViewProxy"
            java.lang.String r15 = "updateView"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            r12 = r4
            j20.C117292a.m165358d(r12, r13, r14, r15, r16, r17, r18, r19)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r4.setVisibility(r7)
            java.lang.String r13 = "com/tencent/mm/plugin/card/ui/CardViewProxy"
            java.lang.String r14 = "updateView"
            java.lang.String r15 = "(ILcom/tencent/mm/plugin/card/ui/CardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r16 = "android/view/View_EXEC_"
            java.lang.String r17 = "setVisibility"
            java.lang.String r18 = "(I)V"
            j20.C117292a.m165359e(r12, r13, r14, r15, r16, r17, r18)
            android.widget.ImageView r4 = r3.f109889b
            r4.setVisibility(r5)
            android.content.Context r4 = r0.f109882a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelSize(r9)
            android.widget.ImageView r7 = r3.f109889b
            te3.ko r9 = r24.mo23264L0()
            java.lang.String r9 = r9.f64137e
            r10 = 2131234225(0x7f080db1, float:1.808461E38)
            wz0.C53263p.m59701b(r7, r9, r4, r10, r8)
        L_0x031c:
            boolean r4 = r24.mo23291o()
            r7 = 2131231490(0x7f080302, float:1.8079062E38)
            if (r4 == 0) goto L_0x03e0
            te3.hn r4 = r24.mo23263J0()
            java.lang.String r4 = r4.f63934A
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 == 0) goto L_0x0358
            android.content.Context r4 = r0.f109882a
            te3.ko r7 = r24.mo23264L0()
            java.lang.String r7 = r7.f64145p
            int r7 = wz0.C22945n.m27004d(r7)
            int r9 = r0.f109886e
            android.graphics.drawable.ShapeDrawable r4 = wz0.C22945n.m27014n(r4, r7, r9)
            android.widget.RelativeLayout r7 = r3.f109888a
            r7.setBackgroundDrawable(r4)
            android.widget.ImageView r4 = r3.f109897j
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r3.f109898k
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r3.f109899l
            r4.setVisibility(r5)
            goto L_0x03bd
        L_0x0358:
            android.widget.RelativeLayout r4 = r3.f109888a
            android.content.Context r9 = r0.f109882a
            android.content.res.Resources r9 = r9.getResources()
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r7)
            r4.setBackgroundDrawable(r9)
            android.widget.ImageView r4 = r3.f109897j
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r3.f109898k
            r4.setVisibility(r5)
            android.widget.ImageView r4 = r3.f109897j
            te3.hn r9 = r24.mo23263J0()
            java.lang.String r9 = r9.f63934A
            hc0.c$b r10 = new hc0.c$b
            r10.<init>()
            java.lang.String r11 = a70.C112760b.m154195C()
            r10.f59351g = r11
            java.lang.String r11 = hz0.C76251l.m91644m(r9)
            r10.f59350f = r11
            r10.f59346b = r8
            r10.f59366v = r8
            r10.f59345a = r8
            r10.f59359o = r7
            android.content.Context r7 = r0.f109882a
            r11 = 2131166075(0x7f07037b, float:1.7946385E38)
            int r7 = kg3.C76577a.m92157h(r7, r11)
            r10.f59355k = r7
            android.content.Context r7 = r0.f109882a
            int r7 = kg3.C76577a.m92145A(r7)
            r10.f59354j = r7
            hc0.c r7 = r10.mo32666a()
            gc0.a r10 = gc0.C20828a.m22825b()
            r10.mo32519h(r9, r4, r7)
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            r4.setImageMatrix(r7)
            android.widget.ImageView r4 = r3.f109899l
            r4.setVisibility(r6)
        L_0x03bd:
            android.widget.TextView r4 = r3.f109892e
            android.content.Context r6 = r0.f109882a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r6 = r6.getColor(r7)
            r4.setTextColor(r6)
            android.widget.TextView r4 = r3.f109893f
            android.content.Context r6 = r0.f109882a
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r7)
            r4.setTextColor(r6)
            goto L_0x0463
        L_0x03e0:
            android.widget.ImageView r4 = r3.f109899l
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r3.f109897j
            r4.setVisibility(r6)
            android.widget.ImageView r4 = r3.f109898k
            r4.setVisibility(r6)
            android.widget.RelativeLayout r4 = r3.f109888a
            android.content.Context r6 = r0.f109882a
            android.content.res.Resources r6 = r6.getResources()
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r7)
            r4.setBackgroundDrawable(r6)
            android.widget.TextView r4 = r3.f109893f
            android.content.Context r6 = r0.f109882a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131101252(0x7f060644, float:1.7814908E38)
            int r6 = r6.getColor(r7)
            r4.setTextColor(r6)
            android.widget.TextView r4 = r3.f109892e
            android.content.Context r6 = r0.f109882a
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r7)
            r4.setTextColor(r6)
            goto L_0x0463
        L_0x0420:
            android.widget.ImageView r4 = r3.f109889b
            r4.setVisibility(r6)
            android.widget.TextView r4 = r3.f109893f
            r4.setVisibility(r6)
            android.widget.TextView r4 = r3.f109892e
            r4.setVisibility(r6)
            android.widget.LinearLayout r4 = r3.f109896i
            r4.setVisibility(r6)
            android.widget.TextView r4 = r3.f109894g
            r4.setVisibility(r5)
            android.content.Context r4 = r0.f109882a
            android.content.res.Resources r6 = r4.getResources()
            r7 = 2131100269(0x7f06026d, float:1.7812915E38)
            int r6 = r6.getColor(r7)
            int r7 = r0.f109886e
            android.graphics.drawable.ShapeDrawable r4 = wz0.C22945n.m27014n(r4, r6, r7)
            android.widget.RelativeLayout r6 = r3.f109888a
            r6.setBackgroundDrawable(r4)
            android.widget.TextView r4 = r3.f109894g
            android.content.Context r6 = r0.f109882a
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131823154(0x7f110a32, float:1.92791E38)
            java.lang.String r6 = r6.getString(r7)
            r4.setText(r6)
        L_0x0463:
            te3.ko r4 = r24.mo23264L0()
            int r4 = r4.f64141i
            android.widget.BaseAdapter r4 = r0.f109883b
            int r4 = r4.getCount()
            int r4 = r4 - r8
            if (r1 != r4) goto L_0x049f
            android.widget.RelativeLayout r1 = r3.f109888a
            if (r1 == 0) goto L_0x049f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r4 = r1.bottomMargin
            android.content.Context r5 = r0.f109882a
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165564(0x7f07017c, float:1.7945349E38)
            int r5 = r5.getDimensionPixelOffset(r6)
            if (r4 == r5) goto L_0x04b2
            android.content.Context r4 = r0.f109882a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getDimensionPixelOffset(r6)
            r1.bottomMargin = r4
            android.widget.RelativeLayout r3 = r3.f109888a
            r3.setLayoutParams(r1)
            goto L_0x04b2
        L_0x049f:
            android.widget.RelativeLayout r1 = r3.f109888a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r4 = r1.bottomMargin
            if (r4 == 0) goto L_0x04b2
            r1.bottomMargin = r5
            android.widget.RelativeLayout r3 = r3.f109888a
            r3.setLayoutParams(r1)
        L_0x04b2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.card.p031ui.C40866k0.mo63834a(int, android.view.View, android.view.ViewGroup, dz0.c):android.view.View");
    }

    /* renamed from: b */
    public void mo63835b(View view, int i) {
        ((C40867a) view.getTag()).f109895h.setVisibility(i);
    }

    public void release() {
        this.f109882a = null;
        this.f109883b = null;
        LinkedList<CardTagTextView> linkedList = this.f109887f;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}

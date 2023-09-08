package vz0;

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

/* renamed from: vz0.e0 */
public class C53043e0 implements C45498d {

    /* renamed from: a */
    public Context f148061a;

    /* renamed from: b */
    public BaseAdapter f148062b;

    /* renamed from: c */
    public int f148063c;

    /* renamed from: d */
    public int f148064d;

    /* renamed from: e */
    public int f148065e;

    /* renamed from: f */
    public LinkedList<CardTagTextView> f148066f = new LinkedList<>();

    /* renamed from: vz0.e0$a */
    public class C53044a {

        /* renamed from: a */
        public RelativeLayout f148067a;

        /* renamed from: b */
        public ImageView f148068b;

        /* renamed from: c */
        public View f148069c;

        /* renamed from: d */
        public ImageView f148070d;

        /* renamed from: e */
        public TextView f148071e;

        /* renamed from: f */
        public TextView f148072f;

        /* renamed from: g */
        public TextView f148073g;

        /* renamed from: h */
        public TextView f148074h;

        /* renamed from: i */
        public LinearLayout f148075i;

        /* renamed from: j */
        public ImageView f148076j;

        /* renamed from: k */
        public ImageView f148077k;

        /* renamed from: l */
        public ImageView f148078l;

        /* renamed from: m */
        public TextView f148079m;

        /* renamed from: n */
        public TextView f148080n;

        /* renamed from: o */
        public TextView f148081o;

        /* renamed from: p */
        public TextView f148082p;

        public C53044a(C53043e0 e0Var) {
        }
    }

    public C53043e0(Context context, BaseAdapter baseAdapter) {
        this.f148061a = context;
        this.f148062b = baseAdapter;
        this.f148063c = context.getResources().getDimensionPixelSize(C0966R.dimen.f3963ll);
        this.f148064d = this.f148061a.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
        this.f148065e = this.f148061a.getResources().getDimensionPixelOffset(C0966R.dimen.f4219wm);
        this.f148061a.getResources().getDimensionPixelOffset(C0966R.dimen.f4220wn);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: vz0.e0$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x031a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo63834a(int r24, android.view.View r25, android.view.ViewGroup r26, dz0.C20483c r27) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 2
            r3 = 2131823109(0x7f110a05, float:1.9279008E38)
            r4 = 2131823225(0x7f110a79, float:1.9279244E38)
            java.lang.String r5 = "PRIVATE_INVOICE_TITLE"
            java.lang.String r6 = "PRIVATE_TICKET_TITLE"
            r7 = 1
            if (r25 != 0) goto L_0x0159
            android.widget.BaseAdapter r8 = r0.f148062b
            int r8 = r8.getItemViewType(r1)
            r9 = 2131298826(0x7f090a0a, float:1.8215636E38)
            r10 = 0
            if (r8 == 0) goto L_0x003d
            r11 = 2131493512(0x7f0c0288, float:1.8610506E38)
            if (r8 == r7) goto L_0x0036
            if (r8 == r2) goto L_0x002c
            android.content.Context r8 = r0.f148061a
            android.view.View r8 = android.view.View.inflate(r8, r11, r10)
            goto L_0x007d
        L_0x002c:
            android.content.Context r8 = r0.f148061a
            r11 = 2131493517(0x7f0c028d, float:1.8610516E38)
            android.view.View r8 = android.view.View.inflate(r8, r11, r10)
            goto L_0x007d
        L_0x0036:
            android.content.Context r8 = r0.f148061a
            android.view.View r8 = android.view.View.inflate(r8, r11, r10)
            goto L_0x007d
        L_0x003d:
            android.content.Context r8 = r0.f148061a
            r11 = 2131493514(0x7f0c028a, float:1.861051E38)
            android.view.View r8 = android.view.View.inflate(r8, r11, r10)
            java.lang.String r10 = r27.getCardId()
            boolean r10 = r10.equals(r6)
            if (r10 == 0) goto L_0x0062
            android.view.View r10 = r8.findViewById(r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x007d
            android.content.Context r11 = r0.f148061a
            java.lang.String r11 = r11.getString(r4)
            r10.setText(r11)
            goto L_0x007d
        L_0x0062:
            java.lang.String r10 = r27.getCardId()
            boolean r10 = r10.equals(r5)
            if (r10 == 0) goto L_0x007d
            android.view.View r10 = r8.findViewById(r9)
            android.widget.TextView r10 = (android.widget.TextView) r10
            if (r10 == 0) goto L_0x007d
            android.content.Context r11 = r0.f148061a
            java.lang.String r11 = r11.getString(r3)
            r10.setText(r11)
        L_0x007d:
            vz0.e0$a r10 = new vz0.e0$a
            r10.<init>(r0)
            java.lang.String r11 = r27.getCardId()
            boolean r11 = r11.equals(r6)
            if (r11 != 0) goto L_0x014d
            java.lang.String r11 = r27.getCardId()
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0098
            goto L_0x014d
        L_0x0098:
            boolean r9 = r27.mo23285h2()
            if (r9 == 0) goto L_0x00cc
            r9 = 2131298833(0x7f090a11, float:1.821565E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148079m = r9
            r9 = 2131298829(0x7f090a0d, float:1.8215642E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148080n = r9
            r9 = 2131298831(0x7f090a0f, float:1.8215646E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148081o = r9
            r9 = 2131298832(0x7f090a10, float:1.8215648E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148082p = r9
            goto L_0x0155
        L_0x00cc:
            r9 = 2131298751(0x7f0909bf, float:1.8215484E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r10.f148067a = r9
            r9 = 2131298810(0x7f0909fa, float:1.8215604E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10.f148068b = r9
            r9 = 2131298902(0x7f090a56, float:1.821579E38)
            android.view.View r9 = r8.findViewById(r9)
            r10.f148069c = r9
            r9 = 2131298901(0x7f090a55, float:1.8215788E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10.f148070d = r9
            r9 = 2131298717(0x7f09099d, float:1.8215415E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148071e = r9
            r9 = 2131298846(0x7f090a1e, float:1.8215677E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148072f = r9
            r9 = 2131298847(0x7f090a1f, float:1.8215679E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148073g = r9
            r9 = 2131298695(0x7f090987, float:1.821537E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r9 = 2131298710(0x7f090996, float:1.82154E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10.f148076j = r9
            r9 = 2131298712(0x7f090998, float:1.8215405E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10.f148077k = r9
            r9 = 2131298711(0x7f090997, float:1.8215403E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r10.f148078l = r9
            r9 = 2131298872(0x7f090a38, float:1.821573E38)
            android.view.View r9 = r8.findViewById(r9)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r10.f148075i = r9
            goto L_0x0155
        L_0x014d:
            android.view.View r9 = r8.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10.f148074h = r9
        L_0x0155:
            r8.setTag(r10)
            goto L_0x0187
        L_0x0159:
            java.lang.Object r8 = r25.getTag()
            r10 = r8
            vz0.e0$a r10 = (vz0.C53043e0.C53044a) r10
            android.widget.TextView r8 = r10.f148074h
            if (r8 == 0) goto L_0x0185
            java.lang.String r8 = r27.getCardId()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L_0x017a
            android.widget.TextView r8 = r10.f148074h
            android.content.Context r9 = r0.f148061a
            java.lang.String r9 = r9.getString(r4)
            r8.setText(r9)
            goto L_0x0185
        L_0x017a:
            android.widget.TextView r8 = r10.f148074h
            android.content.Context r9 = r0.f148061a
            java.lang.String r9 = r9.getString(r3)
            r8.setText(r9)
        L_0x0185:
            r8 = r25
        L_0x0187:
            android.widget.TextView r9 = r10.f148072f
            r11 = 0
            if (r9 == 0) goto L_0x019e
            android.content.Context r9 = r0.f148061a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131165202(0x7f070012, float:1.7944614E38)
            float r9 = r9.getDimension(r12)
            android.widget.TextView r12 = r10.f148072f
            r12.setTextSize(r11, r9)
        L_0x019e:
            boolean r9 = r27.mo23266N0()
            r12 = 8
            if (r9 == 0) goto L_0x0549
            java.lang.String r9 = r27.getCardId()
            boolean r9 = r9.equals(r6)
            if (r9 == 0) goto L_0x01bd
            android.widget.TextView r2 = r10.f148074h
            android.content.Context r3 = r0.f148061a
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
            goto L_0x05a6
        L_0x01bd:
            java.lang.String r4 = r27.getCardId()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x01d4
            android.widget.TextView r2 = r10.f148074h
            android.content.Context r4 = r0.f148061a
            java.lang.String r3 = r4.getString(r3)
            r2.setText(r3)
            goto L_0x05a6
        L_0x01d4:
            boolean r3 = r27.mo23285h2()
            if (r3 == 0) goto L_0x0233
            te3.ko r3 = r27.mo23264L0()
            java.util.LinkedList<te3.fy> r3 = r3.f64149s
            android.widget.TextView r4 = r10.f148079m
            java.lang.Object r9 = r3.get(r11)
            te3.fy r9 = (te3.C22498fy) r9
            java.lang.String r9 = r9.f63885e
            r4.setText(r9)
            android.widget.TextView r4 = r10.f148081o
            java.lang.Object r3 = r3.get(r7)
            te3.fy r3 = (te3.C22498fy) r3
            java.lang.String r3 = r3.f63885e
            r4.setText(r3)
            te3.hn r3 = r27.mo23263J0()
            java.util.LinkedList<te3.fy> r3 = r3.f63952q
            android.content.Context r4 = r0.f148061a
            r9 = 2131823120(0x7f110a10, float:1.927903E38)
            java.lang.String r4 = r4.getString(r9)
            java.lang.Object[] r9 = new java.lang.Object[r7]
            java.lang.Object r12 = r3.get(r11)
            te3.fy r12 = (te3.C22498fy) r12
            java.lang.String r12 = r12.f63885e
            r9[r11] = r12
            java.lang.String r4 = java.lang.String.format(r4, r9)
            android.widget.TextView r9 = r10.f148082p
            r9.setText(r4)
            int r4 = r3.size()
            if (r4 < r2) goto L_0x05a6
            android.widget.TextView r2 = r10.f148080n
            java.lang.Object r3 = r3.get(r7)
            te3.fy r3 = (te3.C22498fy) r3
            java.lang.String r3 = r3.f63885e
            r2.setText(r3)
            goto L_0x05a6
        L_0x0233:
            android.widget.BaseAdapter r2 = r0.f148062b
            java.lang.Object r2 = r2.getItem(r1)
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.card.model.CardInfo
            r3 = 2131101837(0x7f06088d, float:1.7816095E38)
            if (r2 == 0) goto L_0x031f
            android.widget.BaseAdapter r2 = r0.f148062b
            java.lang.Object r2 = r2.getItem(r1)
            com.tencent.mm.plugin.card.model.CardInfo r2 = (com.tencent.p014mm.plugin.card.model.CardInfo) r2
            java.lang.String r4 = r2.field_card_id
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x031f
            java.lang.String r4 = r2.field_card_id
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x025a
            goto L_0x031f
        L_0x025a:
            int r4 = r2.field_stickyIndex
            int r9 = r4 % 10
            if (r9 == 0) goto L_0x0269
            if (r4 <= 0) goto L_0x0275
            android.content.Context r9 = r0.f148061a
            java.lang.String r4 = wz0.C53261k.m59694a(r9, r4, r2)
            goto L_0x0273
        L_0x0269:
            java.lang.String r4 = r2.field_label_wording
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r4)
            if (r4 != 0) goto L_0x0275
            java.lang.String r4 = r2.field_label_wording
        L_0x0273:
            r9 = 1
            goto L_0x0278
        L_0x0275:
            java.lang.String r4 = ""
            r9 = 0
        L_0x0278:
            if (r9 == 0) goto L_0x031a
            r9 = 0
        L_0x027b:
            android.widget.LinearLayout r13 = r10.f148075i
            int r13 = r13.getChildCount()
            if (r9 >= r13) goto L_0x0293
            android.widget.LinearLayout r13 = r10.f148075i
            android.view.View r13 = r13.getChildAt(r9)
            com.tencent.mm.plugin.card.widget.CardTagTextView r13 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r13
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r14 = r0.f148066f
            r14.add(r13)
            int r9 = r9 + 1
            goto L_0x027b
        L_0x0293:
            android.widget.LinearLayout r9 = r10.f148075i
            r9.removeAllViews()
            android.widget.LinearLayout r9 = r10.f148075i
            r9.setVisibility(r11)
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r9 = r0.f148066f
            int r9 = r9.size()
            if (r9 != 0) goto L_0x02ad
            com.tencent.mm.plugin.card.widget.CardTagTextView r9 = new com.tencent.mm.plugin.card.widget.CardTagTextView
            android.content.Context r13 = r0.f148061a
            r9.<init>(r13)
            goto L_0x02b5
        L_0x02ad:
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r9 = r0.f148066f
            java.lang.Object r9 = r9.removeFirst()
            com.tencent.mm.plugin.card.widget.CardTagTextView r9 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r9
        L_0x02b5:
            int r13 = r0.f148064d
            int r14 = r0.f148063c
            r9.setPadding(r13, r14, r13, r14)
            r13 = 17
            r9.setGravity(r13)
            android.content.Context r13 = r0.f148061a
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131166080(0x7f070380, float:1.7946395E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r9.setMinWidth(r13)
            android.content.Context r13 = r0.f148061a
            android.content.res.Resources r13 = r13.getResources()
            r14 = 2131166079(0x7f07037f, float:1.7946393E38)
            int r13 = r13.getDimensionPixelSize(r14)
            r9.setMinHeight(r13)
            boolean r2 = r2.mo23291o()
            if (r2 == 0) goto L_0x02fd
            android.content.Context r2 = r0.f148061a
            int r2 = kg3.C76577a.m92153d(r2, r3)
            r9.setTextColor(r2)
            android.content.Context r2 = r0.f148061a
            r13 = 2131100270(0x7f06026e, float:1.7812917E38)
            int r2 = kg3.C76577a.m92153d(r2, r13)
            r9.setFillColor(r2)
            goto L_0x030c
        L_0x02fd:
            android.content.Context r2 = r0.f148061a
            r13 = 2131101015(0x7f060557, float:1.7814428E38)
            int r2 = kg3.C76577a.m92153d(r2, r13)
            r9.setTextColor(r2)
            r9.setFillColor(r11)
        L_0x030c:
            r9.setText(r4)
            r2 = 1092616192(0x41200000, float:10.0)
            r9.setTextSize(r7, r2)
            android.widget.LinearLayout r2 = r10.f148075i
            r2.addView(r9)
            goto L_0x031f
        L_0x031a:
            android.widget.LinearLayout r2 = r10.f148075i
            r2.setVisibility(r12)
        L_0x031f:
            android.widget.RelativeLayout r2 = r10.f148067a
            r2.setVisibility(r11)
            android.widget.ImageView r2 = r10.f148068b
            r2.setVisibility(r11)
            android.widget.TextView r2 = r10.f148072f
            r2.setVisibility(r11)
            android.widget.TextView r2 = r10.f148073g
            r2.setVisibility(r12)
            android.widget.TextView r2 = r10.f148071e
            r2.setVisibility(r11)
            android.widget.TextView r2 = r10.f148071e
            te3.ko r4 = r27.mo23264L0()
            java.lang.String r4 = r4.f64142j
            r2.setText(r4)
            android.widget.TextView r2 = r10.f148072f
            te3.ko r4 = r27.mo23264L0()
            java.lang.String r4 = r4.f64143n
            r2.setText(r4)
            boolean r2 = r27.mo23271R1()
            r4 = 2131166083(0x7f070383, float:1.7946401E38)
            if (r2 == 0) goto L_0x03e7
            android.view.View r2 = r10.f148069c
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r13)
            java.lang.Object[] r14 = r9.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy"
            java.lang.String r16 = "updateView"
            java.lang.String r17 = "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            r13 = r2
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r14 = "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy"
            java.lang.String r15 = "updateView"
            java.lang.String r16 = "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r17 = "android/view/View_EXEC_"
            java.lang.String r18 = "setVisibility"
            java.lang.String r19 = "(I)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
            android.widget.ImageView r2 = r10.f148068b
            r9 = 4
            r2.setVisibility(r9)
            android.widget.ImageView r14 = r10.f148070d
            te3.ko r2 = r27.mo23264L0()
            java.lang.String r2 = r2.f64105C
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x03d4
            android.content.Context r2 = r0.f148061a
            android.content.res.Resources r2 = r2.getResources()
            int r16 = r2.getDimensionPixelSize(r4)
            android.content.Context r13 = r0.f148061a
            te3.ko r2 = r27.mo23264L0()
            java.lang.String r15 = r2.f64105C
            r17 = 2131231525(0x7f080325, float:1.8079133E38)
            r18 = 0
            te3.ko r2 = r27.mo23264L0()
            java.lang.String r2 = r2.f64145p
            int r19 = wz0.C22945n.m27004d(r2)
            wz0.C53263p.m59702c(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0448
        L_0x03d4:
            android.content.Context r2 = r0.f148061a
            r4 = 2131231525(0x7f080325, float:1.8079133E38)
            te3.ko r9 = r27.mo23264L0()
            java.lang.String r9 = r9.f64145p
            int r9 = wz0.C22945n.m27004d(r9)
            wz0.C53263p.m59703d(r2, r14, r4, r9)
            goto L_0x0448
        L_0x03e7:
            android.view.View r2 = r10.f148069c
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)
            r9.mo10233c(r13)
            java.lang.Object[] r16 = r9.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy"
            java.lang.String r18 = "updateView"
            java.lang.String r19 = "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r2
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r2.setVisibility(r9)
            java.lang.String r16 = "com/tencent/mm/plugin/card/ui/view/CardTicketViewProxy"
            java.lang.String r17 = "updateView"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/card/ui/view/CardTicketViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.widget.ImageView r2 = r10.f148068b
            r2.setVisibility(r11)
            android.content.Context r2 = r0.f148061a
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getDimensionPixelSize(r4)
            android.widget.ImageView r4 = r10.f148068b
            te3.ko r9 = r27.mo23264L0()
            java.lang.String r9 = r9.f64137e
            r13 = 2131234225(0x7f080db1, float:1.808461E38)
            wz0.C53263p.m59701b(r4, r9, r2, r13, r7)
        L_0x0448:
            boolean r2 = r27.mo23291o()
            r4 = 2131231490(0x7f080302, float:1.8079062E38)
            if (r2 == 0) goto L_0x0509
            te3.hn r2 = r27.mo23263J0()
            java.lang.String r2 = r2.f63934A
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 == 0) goto L_0x0484
            android.content.Context r2 = r0.f148061a
            te3.ko r4 = r27.mo23264L0()
            java.lang.String r4 = r4.f64145p
            int r4 = wz0.C22945n.m27004d(r4)
            int r9 = r0.f148065e
            android.graphics.drawable.ShapeDrawable r2 = wz0.C22945n.m27014n(r2, r4, r9)
            android.widget.RelativeLayout r4 = r10.f148067a
            r4.setBackgroundDrawable(r2)
            android.widget.ImageView r2 = r10.f148076j
            r2.setVisibility(r12)
            android.widget.ImageView r2 = r10.f148077k
            r2.setVisibility(r12)
            android.widget.ImageView r2 = r10.f148078l
            r2.setVisibility(r11)
            goto L_0x04e9
        L_0x0484:
            android.widget.RelativeLayout r2 = r10.f148067a
            android.content.Context r9 = r0.f148061a
            android.content.res.Resources r9 = r9.getResources()
            android.graphics.drawable.Drawable r9 = r9.getDrawable(r4)
            r2.setBackgroundDrawable(r9)
            android.widget.ImageView r2 = r10.f148076j
            r2.setVisibility(r11)
            android.widget.ImageView r2 = r10.f148077k
            r2.setVisibility(r11)
            android.widget.ImageView r2 = r10.f148076j
            te3.hn r9 = r27.mo23263J0()
            java.lang.String r9 = r9.f63934A
            hc0.c$b r13 = new hc0.c$b
            r13.<init>()
            java.lang.String r14 = a70.C112760b.m154195C()
            r13.f59351g = r14
            java.lang.String r14 = hz0.C76251l.m91644m(r9)
            r13.f59350f = r14
            r13.f59346b = r7
            r13.f59366v = r7
            r13.f59345a = r7
            r13.f59359o = r4
            android.content.Context r4 = r0.f148061a
            r14 = 2131166075(0x7f07037b, float:1.7946385E38)
            int r4 = kg3.C76577a.m92157h(r4, r14)
            r13.f59355k = r4
            android.content.Context r4 = r0.f148061a
            int r4 = kg3.C76577a.m92145A(r4)
            r13.f59354j = r4
            hc0.c r4 = r13.mo32666a()
            gc0.a r13 = gc0.C20828a.m22825b()
            r13.mo32519h(r9, r2, r4)
            android.graphics.Matrix r4 = new android.graphics.Matrix
            r4.<init>()
            r2.setImageMatrix(r4)
            android.widget.ImageView r2 = r10.f148078l
            r2.setVisibility(r12)
        L_0x04e9:
            android.widget.TextView r2 = r10.f148071e
            android.content.Context r4 = r0.f148061a
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r3)
            r2.setTextColor(r4)
            android.widget.TextView r2 = r10.f148072f
            android.content.Context r4 = r0.f148061a
            android.content.res.Resources r4 = r4.getResources()
            int r3 = r4.getColor(r3)
            r2.setTextColor(r3)
            goto L_0x05a6
        L_0x0509:
            android.widget.ImageView r2 = r10.f148078l
            r2.setVisibility(r12)
            android.widget.ImageView r2 = r10.f148076j
            r2.setVisibility(r12)
            android.widget.ImageView r2 = r10.f148077k
            r2.setVisibility(r12)
            android.widget.RelativeLayout r2 = r10.f148067a
            android.content.Context r3 = r0.f148061a
            android.content.res.Resources r3 = r3.getResources()
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)
            r2.setBackgroundDrawable(r3)
            android.widget.TextView r2 = r10.f148072f
            android.content.Context r3 = r0.f148061a
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131100248(0x7f060258, float:1.7812872E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r10.f148071e
            android.content.Context r3 = r0.f148061a
            android.content.res.Resources r3 = r3.getResources()
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            goto L_0x05a6
        L_0x0549:
            java.lang.String r2 = r27.getCardId()
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x05a6
            java.lang.String r2 = r27.getCardId()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x05a6
            boolean r2 = r27.mo23285h2()
            if (r2 != 0) goto L_0x05a6
            android.widget.ImageView r2 = r10.f148068b
            r2.setVisibility(r12)
            android.widget.TextView r2 = r10.f148072f
            r2.setVisibility(r12)
            android.widget.TextView r2 = r10.f148071e
            r2.setVisibility(r12)
            android.widget.LinearLayout r2 = r10.f148075i
            r2.setVisibility(r12)
            android.widget.TextView r2 = r10.f148073g
            r2.setVisibility(r11)
            android.content.Context r2 = r0.f148061a
            android.content.res.Resources r3 = r2.getResources()
            r4 = 2131100269(0x7f06026d, float:1.7812915E38)
            int r3 = r3.getColor(r4)
            int r4 = r0.f148065e
            android.graphics.drawable.ShapeDrawable r2 = wz0.C22945n.m27014n(r2, r3, r4)
            android.widget.RelativeLayout r3 = r10.f148067a
            r3.setBackgroundDrawable(r2)
            android.widget.TextView r2 = r10.f148073g
            android.content.Context r3 = r0.f148061a
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131823154(0x7f110a32, float:1.92791E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
        L_0x05a6:
            java.lang.String r2 = r27.getCardId()
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L_0x060f
            java.lang.String r2 = r27.getCardId()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L_0x060f
            boolean r2 = r27.mo23285h2()
            if (r2 != 0) goto L_0x060f
            te3.ko r2 = r27.mo23264L0()
            int r2 = r2.f64141i
            android.widget.BaseAdapter r2 = r0.f148062b
            int r2 = r2.getCount()
            int r2 = r2 - r7
            if (r1 != r2) goto L_0x05fc
            android.widget.RelativeLayout r1 = r10.f148067a
            if (r1 == 0) goto L_0x05fc
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r1.bottomMargin
            android.content.Context r3 = r0.f148061a
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131165564(0x7f07017c, float:1.7945349E38)
            int r3 = r3.getDimensionPixelOffset(r4)
            if (r2 == r3) goto L_0x060f
            android.content.Context r2 = r0.f148061a
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getDimensionPixelOffset(r4)
            r1.bottomMargin = r2
            android.widget.RelativeLayout r2 = r10.f148067a
            r2.setLayoutParams(r1)
            goto L_0x060f
        L_0x05fc:
            android.widget.RelativeLayout r1 = r10.f148067a
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r1 = (android.widget.LinearLayout.LayoutParams) r1
            int r2 = r1.bottomMargin
            if (r2 == 0) goto L_0x060f
            r1.bottomMargin = r11
            android.widget.RelativeLayout r2 = r10.f148067a
            r2.setLayoutParams(r1)
        L_0x060f:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vz0.C53043e0.mo63834a(int, android.view.View, android.view.ViewGroup, dz0.c):android.view.View");
    }

    public void release() {
        this.f148061a = null;
        this.f148062b = null;
        LinkedList<CardTagTextView> linkedList = this.f148066f;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}

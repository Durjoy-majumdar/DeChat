package qz0;

import android.content.Context;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.mars.smc.IDKey;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.card.widget.CardTagTextView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import dz0.C45498d;
import java.util.ArrayList;
import java.util.LinkedList;

/* renamed from: qz0.j */
public class C47912j implements C45498d {

    /* renamed from: a */
    public Context f128547a;

    /* renamed from: b */
    public BaseAdapter f128548b;

    /* renamed from: c */
    public long f128549c = 0;

    /* renamed from: d */
    public long f128550d = 0;

    /* renamed from: e */
    public int f128551e;

    /* renamed from: f */
    public int f128552f;

    /* renamed from: g */
    public ArrayList<Integer> f128553g = new ArrayList<>();

    /* renamed from: h */
    public ArrayList<String> f128554h = new ArrayList<>();

    /* renamed from: i */
    public ArrayList<String> f128555i = new ArrayList<>();

    /* renamed from: j */
    public LinkedList<CardTagTextView> f128556j = new LinkedList<>();

    /* renamed from: qz0.j$a */
    public class C47913a {

        /* renamed from: a */
        public LinearLayout f128557a;

        /* renamed from: b */
        public TextView f128558b;

        /* renamed from: c */
        public TextView f128559c;

        /* renamed from: d */
        public RelativeLayout f128560d;

        /* renamed from: e */
        public ImageView f128561e;

        /* renamed from: f */
        public TextView f128562f;

        /* renamed from: g */
        public TextView f128563g;

        /* renamed from: h */
        public TextView f128564h;

        /* renamed from: i */
        public TextView f128565i;

        /* renamed from: j */
        public TextView f128566j;

        /* renamed from: k */
        public View f128567k;

        /* renamed from: l */
        public TextView f128568l;

        public C47913a(C47912j jVar) {
        }
    }

    public C47912j(Context context, BaseAdapter baseAdapter) {
        this.f128547a = context;
        this.f128548b = baseAdapter;
        this.f128551e = context.getResources().getDimensionPixelSize(C0966R.dimen.f3928j9);
        this.f128552f = this.f128547a.getResources().getDimensionPixelSize(C0966R.dimen.f3913iq);
        this.f128553g.clear();
        this.f128554h.clear();
        this.f128555i.clear();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: qz0.j$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View mo63834a(int r23, android.view.View r24, android.view.ViewGroup r25, dz0.C20483c r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            long r2 = java.lang.System.currentTimeMillis()
            if (r24 != 0) goto L_0x00a6
            android.content.Context r4 = r0.f128547a
            r5 = 2131493536(0x7f0c02a0, float:1.8610555E38)
            r6 = 0
            android.view.View r4 = android.view.View.inflate(r4, r5, r6)
            qz0.j$a r5 = new qz0.j$a
            r5.<init>(r0)
            r6 = 2131298890(0x7f090a4a, float:1.8215766E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.LinearLayout r6 = (android.widget.LinearLayout) r6
            r5.f128557a = r6
            r6 = 2131298817(0x7f090a01, float:1.8215618E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128558b = r6
            r6 = 2131298821(0x7f090a05, float:1.8215626E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128559c = r6
            r6 = 2131298751(0x7f0909bf, float:1.8215484E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.RelativeLayout r6 = (android.widget.RelativeLayout) r6
            r5.f128560d = r6
            r6 = 2131298810(0x7f0909fa, float:1.8215604E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.ImageView r6 = (android.widget.ImageView) r6
            r5.f128561e = r6
            r6 = 2131298717(0x7f09099d, float:1.8215415E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128562f = r6
            r6 = 2131298846(0x7f090a1e, float:1.8215677E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128563g = r6
            r6 = 2131298823(0x7f090a07, float:1.821563E38)
            android.view.View r6 = r4.findViewById(r6)
            r5.f128567k = r6
            r6 = 2131314692(0x7f094804, float:1.8247816E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128564h = r6
            r6 = 2131298697(0x7f090989, float:1.8215374E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128565i = r6
            r6 = 2131298847(0x7f090a1f, float:1.8215679E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128566j = r6
            r6 = 2131298754(0x7f0909c2, float:1.821549E38)
            android.view.View r6 = r4.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f128568l = r6
            android.widget.TextView r6 = r5.f128564h
            android.text.TextUtils$TruncateAt r7 = android.text.TextUtils.TruncateAt.MIDDLE
            r6.setEllipsize(r7)
            r4.setTag(r5)
            goto L_0x00af
        L_0x00a6:
            java.lang.Object r4 = r24.getTag()
            r5 = r4
            qz0.j$a r5 = (qz0.C47912j.C47913a) r5
            r4 = r24
        L_0x00af:
            java.lang.Class<ny.h> r6 = p629ny.C76979h.class
            android.widget.BaseAdapter r7 = r0.f128548b
            java.lang.Object r7 = r7.getItem(r1)
            dz0.c r7 = (dz0.C20483c) r7
            int r8 = r7.mo23298y1()
            int r9 = r7.mo23298y1()
            boolean r9 = oz0.C47407b.m52739a(r9)
            r10 = 1
            r11 = 0
            if (r9 == 0) goto L_0x00e8
            if (r1 != 0) goto L_0x00d6
            java.lang.String r9 = r7.mo23268P(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x00e8
            goto L_0x00e6
        L_0x00d6:
            android.widget.BaseAdapter r9 = r0.f128548b
            int r12 = r1 + -1
            java.lang.Object r9 = r9.getItem(r12)
            dz0.c r9 = (dz0.C20483c) r9
            int r9 = r9.mo23298y1()
            if (r8 == r9) goto L_0x00e8
        L_0x00e6:
            r9 = 1
            goto L_0x00e9
        L_0x00e8:
            r9 = 0
        L_0x00e9:
            java.lang.String r12 = ""
            r13 = 8
            if (r9 == 0) goto L_0x011c
            android.widget.TextView r9 = r5.f128558b
            r9.setVisibility(r11)
            android.widget.TextView r9 = r5.f128558b
            java.lang.String r14 = r7.mo23268P(r8)
            r9.setText(r14)
            java.lang.String r9 = r7.mo23288k1(r8)
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 != 0) goto L_0x0116
            android.widget.TextView r9 = r5.f128559c
            r9.setVisibility(r11)
            android.widget.TextView r9 = r5.f128559c
            java.lang.String r7 = r7.mo23288k1(r8)
            r9.setText(r7)
            goto L_0x012b
        L_0x0116:
            android.widget.TextView r7 = r5.f128559c
            r7.setVisibility(r13)
            goto L_0x012b
        L_0x011c:
            android.widget.TextView r7 = r5.f128558b
            r7.setVisibility(r13)
            android.widget.TextView r7 = r5.f128559c
            r7.setVisibility(r13)
            android.widget.TextView r7 = r5.f128558b
            r7.setText(r12)
        L_0x012b:
            boolean r7 = r26.mo23266N0()
            if (r7 == 0) goto L_0x0457
            android.widget.ImageView r7 = r5.f128561e
            r7.setVisibility(r11)
            android.widget.TextView r7 = r5.f128562f
            r7.setVisibility(r11)
            android.widget.LinearLayout r7 = r5.f128557a
            r7.setVisibility(r11)
            android.widget.TextView r7 = r5.f128563g
            r7.setVisibility(r11)
            android.widget.TextView r7 = r5.f128568l
            r7.setVisibility(r11)
            android.view.View r7 = r5.f128567k
            k20.a r9 = new k20.a
            r9.<init>()
            java.lang.ThreadLocal<k20.a> r14 = k20.C60958c.f173611a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            r9.mo10233c(r14)
            java.lang.Object[] r15 = r9.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy"
            java.lang.String r17 = "updateView"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r7
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r9 = r9.mo10231a(r11)
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            r7.setVisibility(r9)
            java.lang.String r15 = "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy"
            java.lang.String r16 = "updateView"
            java.lang.String r17 = "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.widget.TextView r7 = r5.f128564h
            r7.setVisibility(r11)
            android.widget.TextView r7 = r5.f128565i
            r7.setVisibility(r11)
            android.widget.TextView r7 = r5.f128566j
            r7.setVisibility(r13)
            android.widget.TextView r7 = r5.f128562f
            te3.ko r9 = r26.mo23264L0()
            java.lang.String r9 = r9.f64142j
            r7.setText(r9)
            boolean r7 = r26.mo23271R1()
            if (r7 == 0) goto L_0x0221
            te3.ko r7 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r7 = r7.f64149s
            if (r7 == 0) goto L_0x01d6
            te3.ko r7 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r7 = r7.f64149s
            int r7 = r7.size()
            if (r7 != r10) goto L_0x01d6
            android.widget.TextView r7 = r5.f128563g
            te3.ko r9 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r9 = r9.f64149s
            java.lang.Object r9 = r9.get(r11)
            te3.fy r9 = (te3.C22498fy) r9
            java.lang.String r9 = r9.f63884d
            r7.setText(r9)
            goto L_0x022c
        L_0x01d6:
            te3.ko r7 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r7 = r7.f64149s
            if (r7 == 0) goto L_0x022c
            te3.ko r7 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r7 = r7.f64149s
            int r7 = r7.size()
            r9 = 2
            if (r7 != r9) goto L_0x022c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            te3.ko r9 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r9 = r9.f64149s
            java.lang.Object r9 = r9.get(r11)
            te3.fy r9 = (te3.C22498fy) r9
            java.lang.String r9 = r9.f63884d
            r7.append(r9)
            java.lang.String r9 = "-"
            r7.append(r9)
            te3.ko r9 = r26.mo23264L0()
            java.util.LinkedList<te3.fy> r9 = r9.f64149s
            java.lang.Object r9 = r9.get(r10)
            te3.fy r9 = (te3.C22498fy) r9
            java.lang.String r9 = r9.f63884d
            r7.append(r9)
            android.widget.TextView r9 = r5.f128563g
            java.lang.String r7 = r7.toString()
            r9.setText(r7)
            goto L_0x022c
        L_0x0221:
            android.widget.TextView r7 = r5.f128563g
            te3.ko r9 = r26.mo23264L0()
            java.lang.String r9 = r9.f64143n
            r7.setText(r9)
        L_0x022c:
            android.content.Context r7 = r0.f128547a
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131166083(0x7f070383, float:1.7946401E38)
            int r7 = r7.getDimensionPixelSize(r9)
            android.widget.ImageView r9 = r5.f128561e
            te3.ko r14 = r26.mo23264L0()
            java.lang.String r14 = r14.f64137e
            r15 = 2131234225(0x7f080db1, float:1.808461E38)
            wz0.C53263p.m59701b(r9, r14, r7, r15, r10)
            android.widget.TextView r7 = r5.f128562f
            android.content.Context r9 = r0.f128547a
            android.content.res.Resources r9 = r9.getResources()
            r14 = 2131100248(0x7f060258, float:1.7812872E38)
            int r9 = r9.getColor(r14)
            r7.setTextColor(r9)
            java.lang.String r7 = r26.mo23270R0()
            gz0.f r9 = hz0.C46153l0.yx0()
            java.lang.String r14 = "key_share_card_annoucement_map"
            java.lang.Object r9 = r9.mo71382a(r14)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x026d
            r7 = r12
            goto L_0x0273
        L_0x026d:
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
        L_0x0273:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x027f
            android.widget.TextView r9 = r5.f128565i
            r9.setText(r7)
            goto L_0x0284
        L_0x027f:
            android.widget.TextView r7 = r5.f128565i
            r7.setText(r12)
        L_0x0284:
            java.lang.String r7 = r26.mo23270R0()
            gz0.f r9 = hz0.C46153l0.yx0()
            java.lang.String r14 = "key_share_card_username_map"
            java.lang.Object r9 = r9.mo71382a(r14)
            java.util.Map r9 = (java.util.Map) r9
            if (r9 != 0) goto L_0x0298
            r7 = r12
            goto L_0x029e
        L_0x0298:
            java.lang.Object r7 = r9.get(r7)
            java.lang.String r7 = (java.lang.String) r7
        L_0x029e:
            int r9 = r26.mo23298y1()
            boolean r9 = oz0.C47407b.m52739a(r9)
            boolean r14 = android.text.TextUtils.isEmpty(r7)
            r15 = 2131165650(0x7f0701d2, float:1.7945523E38)
            if (r14 != 0) goto L_0x02cb
            if (r9 == 0) goto L_0x02cb
            android.widget.TextView r12 = r5.f128564h
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r14 = r0.f128547a
            android.content.res.Resources r8 = r14.getResources()
            int r8 = r8.getDimensionPixelOffset(r15)
            android.text.SpannableString r6 = r6.op0(r14, r7, r8)
            r12.setText(r6)
            goto L_0x0319
        L_0x02cb:
            java.lang.String r7 = r26.mo23280e()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0314
            java.lang.String r7 = r26.mo23280e()
            java.lang.String r7 = wz0.C22945n.m27016p(r7)
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            if (r8 != 0) goto L_0x030e
            android.content.Context r8 = r0.f128547a
            android.content.res.Resources r8 = r8.getResources()
            r12 = 2131823185(0x7f110a51, float:1.9279163E38)
            java.lang.Object[] r14 = new java.lang.Object[r10]
            r14[r11] = r7
            java.lang.String r7 = r8.getString(r12, r14)
            android.widget.TextView r8 = r5.f128564h
            di3.d r6 = di3.C86312j.m106911c(r6)
            ny.h r6 = (p629ny.C76979h) r6
            android.content.Context r12 = r0.f128547a
            android.content.res.Resources r14 = r12.getResources()
            int r14 = r14.getDimensionPixelOffset(r15)
            android.text.SpannableString r6 = r6.op0(r12, r7, r14)
            r8.setText(r6)
            goto L_0x0319
        L_0x030e:
            android.widget.TextView r6 = r5.f128564h
            r6.setText(r12)
            goto L_0x0319
        L_0x0314:
            android.widget.TextView r6 = r5.f128564h
            r6.setText(r12)
        L_0x0319:
            java.lang.String r6 = r26.mo23270R0()
            int r6 = oz0.C47407b.m52742d(r6)
            if (r6 <= r10) goto L_0x0341
            if (r9 == 0) goto L_0x0341
            android.widget.TextView r7 = r5.f128568l
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "X"
            r8.append(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.setText(r6)
            android.widget.TextView r6 = r5.f128568l
            r6.setVisibility(r11)
            goto L_0x0346
        L_0x0341:
            android.widget.TextView r6 = r5.f128568l
            r6.setVisibility(r13)
        L_0x0346:
            te3.ko r6 = r26.mo23264L0()
            te3.ho4 r6 = r6.f64116N
            if (r6 == 0) goto L_0x035c
            te3.ko r6 = r26.mo23264L0()
            te3.ho4 r6 = r6.f64116N
            java.util.LinkedList<te3.we4> r6 = r6.f134797e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 == 0) goto L_0x0366
        L_0x035c:
            java.lang.String r6 = r26.mo23270R0()
            boolean r6 = oz0.C47407b.m52747m(r6)
            if (r6 == 0) goto L_0x0451
        L_0x0366:
            android.widget.LinearLayout r6 = r5.f128557a
            r6.setVisibility(r11)
            r6 = 0
        L_0x036c:
            android.widget.LinearLayout r7 = r5.f128557a
            int r7 = r7.getChildCount()
            if (r6 >= r7) goto L_0x0384
            android.widget.LinearLayout r7 = r5.f128557a
            android.view.View r7 = r7.getChildAt(r6)
            com.tencent.mm.plugin.card.widget.CardTagTextView r7 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r7
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r8 = r0.f128556j
            r8.add(r7)
            int r6 = r6 + 1
            goto L_0x036c
        L_0x0384:
            android.widget.LinearLayout r6 = r5.f128557a
            r6.removeAllViews()
            java.lang.String r6 = r26.mo23270R0()
            boolean r6 = oz0.C47407b.m52747m(r6)
            r7 = 1094713344(0x41400000, float:12.0)
            if (r6 == 0) goto L_0x03ed
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r6 = r0.f128556j
            int r6 = r6.size()
            if (r6 != 0) goto L_0x03a5
            com.tencent.mm.plugin.card.widget.CardTagTextView r6 = new com.tencent.mm.plugin.card.widget.CardTagTextView
            android.content.Context r8 = r0.f128547a
            r6.<init>(r8)
            goto L_0x03ad
        L_0x03a5:
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r6 = r0.f128556j
            java.lang.Object r6 = r6.removeFirst()
            com.tencent.mm.plugin.card.widget.CardTagTextView r6 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r6
        L_0x03ad:
            int r8 = r0.f128552f
            int r9 = r0.f128551e
            r6.setPadding(r8, r9, r8, r9)
            android.content.Context r8 = r0.f128547a
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131101358(0x7f0606ae, float:1.7815123E38)
            int r8 = r8.getColor(r9)
            r6.setTextColor(r8)
            android.content.Context r8 = r0.f128547a
            r9 = 2131823196(0x7f110a5c, float:1.9279185E38)
            java.lang.String r8 = r8.getString(r9)
            r6.setText(r8)
            r6.setTextSize(r7)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r9 = -2
            r8.<init>(r9, r9)
            android.content.Context r9 = r0.f128547a
            android.content.res.Resources r9 = r9.getResources()
            r12 = 2131165564(0x7f07017c, float:1.7945349E38)
            int r9 = r9.getDimensionPixelOffset(r12)
            r8.rightMargin = r9
            android.widget.LinearLayout r9 = r5.f128557a
            r9.addView(r6, r8)
        L_0x03ed:
            te3.ko r6 = r26.mo23264L0()
            te3.ho4 r6 = r6.f64116N
            if (r6 == 0) goto L_0x04d5
            te3.ko r6 = r26.mo23264L0()
            te3.ho4 r6 = r6.f64116N
            java.util.LinkedList<te3.we4> r6 = r6.f134797e
            boolean r6 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r6)
            if (r6 != 0) goto L_0x04d5
            te3.ko r6 = r26.mo23264L0()
            te3.ho4 r6 = r6.f64116N
            java.util.LinkedList<te3.we4> r6 = r6.f134797e
            java.util.Iterator r6 = r6.iterator()
        L_0x040f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x04d5
            java.lang.Object r8 = r6.next()
            te3.we4 r8 = (te3.we4) r8
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r9 = r0.f128556j
            int r9 = r9.size()
            if (r9 != 0) goto L_0x042b
            com.tencent.mm.plugin.card.widget.CardTagTextView r9 = new com.tencent.mm.plugin.card.widget.CardTagTextView
            android.content.Context r12 = r0.f128547a
            r9.<init>(r12)
            goto L_0x0433
        L_0x042b:
            java.util.LinkedList<com.tencent.mm.plugin.card.widget.CardTagTextView> r9 = r0.f128556j
            java.lang.Object r9 = r9.removeFirst()
            com.tencent.mm.plugin.card.widget.CardTagTextView r9 = (com.tencent.p014mm.plugin.card.widget.CardTagTextView) r9
        L_0x0433:
            int r12 = r0.f128552f
            int r13 = r0.f128551e
            r9.setPadding(r12, r13, r12, r13)
            java.lang.String r12 = r8.f144004e
            int r12 = wz0.C22945n.m27004d(r12)
            r9.setTextColor(r12)
            java.lang.String r8 = r8.f144003d
            r9.setText(r8)
            r9.setTextSize(r7)
            android.widget.LinearLayout r8 = r5.f128557a
            r8.addView(r9)
            goto L_0x040f
        L_0x0451:
            android.widget.LinearLayout r6 = r5.f128557a
            r6.setVisibility(r13)
            goto L_0x04d5
        L_0x0457:
            android.widget.ImageView r6 = r5.f128561e
            r6.setVisibility(r13)
            android.widget.TextView r6 = r5.f128562f
            r6.setVisibility(r13)
            android.widget.LinearLayout r6 = r5.f128557a
            r6.setVisibility(r13)
            android.widget.TextView r6 = r5.f128563g
            r6.setVisibility(r13)
            android.widget.TextView r6 = r5.f128568l
            r6.setVisibility(r13)
            android.view.View r6 = r5.f128567k
            k20.a r7 = new k20.a
            r7.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r7.mo10233c(r8)
            java.lang.Object[] r15 = r7.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy"
            java.lang.String r17 = "updateView"
            java.lang.String r18 = "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r6
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r7 = r7.mo10231a(r11)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r15 = "com/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy"
            java.lang.String r16 = "updateView"
            java.lang.String r17 = "(ILcom/tencent/mm/plugin/card/sharecard/ui/ShareCardViewProxy$ViewHolder;Lcom/tencent/mm/plugin/card/base/ICardInfo;)V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.widget.TextView r6 = r5.f128564h
            r6.setVisibility(r13)
            android.widget.TextView r6 = r5.f128565i
            r6.setVisibility(r13)
            android.widget.TextView r6 = r5.f128566j
            r6.setVisibility(r11)
            android.widget.TextView r6 = r5.f128566j
            android.content.Context r7 = r0.f128547a
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131823154(0x7f110a32, float:1.92791E38)
            java.lang.String r7 = r7.getString(r8)
            r6.setText(r7)
        L_0x04d5:
            android.widget.BaseAdapter r6 = r0.f128548b
            int r6 = r6.getCount()
            int r6 = r6 - r10
            if (r1 != r6) goto L_0x050b
            android.widget.RelativeLayout r6 = r5.f128560d
            if (r6 == 0) goto L_0x050b
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r7 = r6.bottomMargin
            android.content.Context r8 = r0.f128547a
            android.content.res.Resources r8 = r8.getResources()
            r9 = 2131165564(0x7f07017c, float:1.7945349E38)
            int r8 = r8.getDimensionPixelOffset(r9)
            if (r7 == r8) goto L_0x0520
            android.content.Context r7 = r0.f128547a
            android.content.res.Resources r7 = r7.getResources()
            int r7 = r7.getDimensionPixelOffset(r9)
            r6.bottomMargin = r7
            android.widget.RelativeLayout r5 = r5.f128560d
            r5.setLayoutParams(r6)
            goto L_0x0520
        L_0x050b:
            android.widget.RelativeLayout r6 = r5.f128560d
            if (r6 == 0) goto L_0x0520
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r6 = (android.widget.LinearLayout.LayoutParams) r6
            int r7 = r6.bottomMargin
            if (r7 == 0) goto L_0x0520
            r6.bottomMargin = r11
            android.widget.RelativeLayout r5 = r5.f128560d
            r5.setLayoutParams(r6)
        L_0x0520:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.f128549c
            long r5 = r5 - r2
            long r7 = r7 + r5
            r0.f128549c = r7
            long r2 = r0.f128550d
            r5 = 1
            long r2 = r2 + r5
            r0.f128550d = r2
            java.util.ArrayList<java.lang.String> r2 = r0.f128554h
            java.lang.String r3 = r26.getCardId()
            boolean r2 = r2.contains(r3)
            if (r2 != 0) goto L_0x0558
            java.util.ArrayList<java.lang.String> r2 = r0.f128554h
            java.lang.String r3 = r26.getCardId()
            r2.add(r3)
            java.util.ArrayList<java.lang.String> r2 = r0.f128555i
            java.lang.String r3 = r26.mo23270R0()
            r2.add(r3)
            java.util.ArrayList<java.lang.Integer> r2 = r0.f128553g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r23)
            r2.add(r1)
        L_0x0558:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: qz0.C47912j.mo63834a(int, android.view.View, android.view.ViewGroup, dz0.c):android.view.View");
    }

    public void release() {
        this.f128547a = null;
        this.f128548b = null;
        if (this.f128550d > 0) {
            ArrayList arrayList = new ArrayList();
            IDKey iDKey = new IDKey();
            iDKey.SetID(281);
            iDKey.SetKey(5);
            iDKey.SetValue(1);
            IDKey iDKey2 = new IDKey();
            iDKey2.SetID(281);
            iDKey2.SetKey(6);
            iDKey2.SetValue((long) ((int) (this.f128549c / this.f128550d)));
            arrayList.add(iDKey);
            arrayList.add(iDKey2);
            C115669n.INSTANCE.mo160124a(arrayList, true);
        }
        if (this.f128553g.size() == this.f128554h.size() && this.f128554h.size() == this.f128555i.size() && this.f128553g.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            for (int i = 0; i < this.f128553g.size(); i++) {
                C115669n.INSTANCE.mo160131h(13220, this.f128555i.get(i), this.f128554h.get(i), this.f128553g.get(i), Long.valueOf(currentTimeMillis));
            }
        }
        this.f128553g.clear();
        this.f128554h.clear();
        this.f128555i.clear();
        LinkedList<CardTagTextView> linkedList = this.f128556j;
        if (linkedList != null) {
            linkedList.clear();
        }
    }
}

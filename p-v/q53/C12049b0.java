package q53;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import qo3.C12925w;

/* renamed from: q53.b0 */
public final class C12049b0 {

    /* renamed from: a */
    public final Context f35094a;

    /* renamed from: b */
    public final C12053c0 f35095b;

    /* renamed from: c */
    public final C12925w f35096c;

    /* renamed from: d */
    public View f35097d;

    /* renamed from: e */
    public View f35098e;

    /* renamed from: f */
    public TextView f35099f;

    /* renamed from: g */
    public TextView f35100g;

    /* renamed from: h */
    public TextView f35101h;

    /* renamed from: i */
    public TextView f35102i;

    /* renamed from: j */
    public View f35103j;

    /* renamed from: k */
    public CheckBox f35104k;

    /* renamed from: l */
    public Button f35105l;

    /* renamed from: m */
    public TextView f35106m;

    /* renamed from: n */
    public View f35107n;

    /* renamed from: o */
    public TextView f35108o;

    /* renamed from: p */
    public View f35109p;

    /* renamed from: q */
    public TextView f35110q;

    /* renamed from: r */
    public ImageView f35111r;

    /* JADX WARNING: Removed duplicated region for block: B:113:0x0425  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0677  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0362  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C12049b0(android.content.Context r31, q53.C12053c0 r32) {
        /*
            r30 = this;
            r0 = r30
            r7 = r31
            r1 = r32
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r7, r2)
            java.lang.String r2 = "parameter"
            gy3.C87412m.m108594g(r1, r2)
            r30.<init>()
            r0.f35094a = r7
            r0.f35095b = r1
            qo3.w r8 = new qo3.w
            r8.<init>(r7)
            r0.f35096c = r8
            r2 = 2131498211(0x7f0c14e3, float:1.8620037E38)
            r9 = 0
            android.view.View r2 = android.view.View.inflate(r7, r2, r9)
            r3 = 2131299709(0x7f090d7d, float:1.8217427E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.close_btn)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f35097d = r3
            r3 = 2131297593(0x7f090539, float:1.8213135E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.balance_button)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f35098e = r3
            r3 = 2131297608(0x7f090548, float:1.8213166E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.balance_text)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35099f = r3
            r3 = 2131311319(0x7f093ad7, float:1.8240975E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.productTitle)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35100g = r3
            r3 = 2131311320(0x7f093ad8, float:1.8240977E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.productWecoinPrice)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35101h = r3
            r3 = 2131311321(0x7f093ad9, float:1.824098E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.productWecoinRealPrice)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35102i = r3
            r3 = 2131311887(0x7f093d0f, float:1.8242127E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id…charge_agreement_link_ll)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f35103j = r3
            r3 = 2131311886(0x7f093d0e, float:1.8242125E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id…_agreement_link_checkbox)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.CheckBox r3 = (android.widget.CheckBox) r3
            r0.f35104k = r3
            r3 = 2131311888(0x7f093d10, float:1.824213E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id…arge_agreement_link_text)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35106m = r3
            r3 = 2131300097(0x7f090f01, float:1.8218214E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.confirm_button)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.Button r3 = (android.widget.Button) r3
            r0.f35105l = r3
            r3 = 2131300132(0x7f090f24, float:1.8218285E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.consume_tips_link_ll)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f35107n = r3
            r3 = 2131300131(0x7f090f23, float:1.8218283E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.consume_tips_link)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35108o = r3
            r3 = 2131307335(0x7f092b47, float:1.8232894E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.link_separator)"
            gy3.C87412m.m108593f(r3, r4)
            r0.f35109p = r3
            r3 = 2131300039(0x7f090ec7, float:1.8218096E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id.common_faq)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r0.f35110q = r3
            r3 = 2131317040(0x7f095130, float:1.8252579E38)
            android.view.View r3 = r2.findViewById(r3)
            java.lang.String r4 = "result.findViewById(R.id…oin_show_product_icon_iv)"
            gy3.C87412m.m108593f(r3, r4)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r0.f35111r = r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            r4 = 24
            int r4 = kg3.C76577a.m92151b(r7, r4)
            float r4 = (float) r4
            float r5 = kg3.C76577a.m92165p(r31)
            float r4 = r4 * r5
            int r4 = (int) r4
            r3.width = r4
            android.widget.ImageView r3 = r0.f35111r
            java.lang.String r4 = "wecoin_show_product_icon_iv"
            if (r3 == 0) goto L_0x06ab
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.ImageView r5 = r0.f35111r
            if (r5 == 0) goto L_0x06a6
            android.view.ViewGroup$LayoutParams r4 = r5.getLayoutParams()
            int r4 = r4.width
            r3.height = r4
            r8.mo12471k(r2)
            r10 = 1
            r8.f36933o = r10
            android.widget.TextView r2 = r0.f35099f
            if (r2 == 0) goto L_0x069f
            long r3 = r1.f35119b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
            boolean r2 = r30.mo11902a()
            java.lang.String r3 = "productWecoinPrice"
            java.lang.String r4 = "productTitle"
            java.lang.String r11 = "confirm_button"
            if (r2 == 0) goto L_0x018b
            android.widget.TextView r2 = r0.f35100g
            if (r2 == 0) goto L_0x0187
            s43.e r4 = r1.f35118a
            java.lang.String r4 = r4.f38604h
            r2.setText(r4)
            android.widget.TextView r2 = r0.f35101h
            if (r2 == 0) goto L_0x0183
            s43.e r3 = r1.f35118a
            int r3 = r3.f38606j
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
            android.widget.Button r2 = r0.f35105l
            if (r2 == 0) goto L_0x017f
            r3 = 2131840172(0x7f114cac, float:1.9313616E38)
            java.lang.String r3 = r7.getString(r3)
            r2.setText(r3)
            goto L_0x01b7
        L_0x017f:
            gy3.C87412m.m108603p(r11)
            throw r9
        L_0x0183:
            gy3.C87412m.m108603p(r3)
            throw r9
        L_0x0187:
            gy3.C87412m.m108603p(r4)
            throw r9
        L_0x018b:
            android.widget.TextView r2 = r0.f35100g
            if (r2 == 0) goto L_0x069a
            s43.e r4 = r1.f35118a
            java.lang.String r4 = r4.f38605i
            r2.setText(r4)
            android.widget.TextView r2 = r0.f35101h
            if (r2 == 0) goto L_0x0695
            s43.e r3 = r1.f35118a
            int r3 = r3.f38606j
            long r3 = (long) r3
            long r5 = r1.f35119b
            long r3 = r3 - r5
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.setText(r3)
            android.widget.Button r2 = r0.f35105l
            if (r2 == 0) goto L_0x0690
            r3 = 2131840179(0x7f114cb3, float:1.931363E38)
            java.lang.String r3 = r7.getString(r3)
            r2.setText(r3)
        L_0x01b7:
            s43.e r2 = r1.f35118a
            java.lang.String r2 = r2.f38607k
            int r2 = r2.length()
            r12 = 0
            if (r2 <= 0) goto L_0x01c4
            r2 = 1
            goto L_0x01c5
        L_0x01c4:
            r2 = 0
        L_0x01c5:
            java.lang.String r3 = "productWecoinRealPrice"
            r4 = 8
            if (r2 == 0) goto L_0x01e6
            android.widget.TextView r2 = r0.f35102i
            if (r2 == 0) goto L_0x01e2
            r2.setVisibility(r12)
            android.widget.TextView r2 = r0.f35102i
            if (r2 == 0) goto L_0x01de
            s43.e r3 = r1.f35118a
            java.lang.String r3 = r3.f38607k
            r2.setText(r3)
            goto L_0x01ed
        L_0x01de:
            gy3.C87412m.m108603p(r3)
            throw r9
        L_0x01e2:
            gy3.C87412m.m108603p(r3)
            throw r9
        L_0x01e6:
            android.widget.TextView r2 = r0.f35102i
            if (r2 == 0) goto L_0x068b
            r2.setVisibility(r4)
        L_0x01ed:
            te3.uc2 r2 = r1.f35120c
            int r2 = r2.f142741f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "updateCheckBox: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r5 = "WeCoinConsumePanel"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r5, r3)
            java.lang.String r3 = "recharge_agreement_link_ll"
            if (r2 == 0) goto L_0x023a
            r2.intValue()
            android.widget.CheckBox r5 = r0.f35104k
            if (r5 == 0) goto L_0x0234
            int r2 = r2.intValue()
            if (r2 == 0) goto L_0x021f
            r2 = 1
            goto L_0x0220
        L_0x021f:
            r2 = 0
        L_0x0220:
            r5.setChecked(r2)
            android.view.View r2 = r0.f35103j
            if (r2 == 0) goto L_0x0230
            q53.y r5 = new q53.y
            r5.<init>(r0)
            r2.setOnClickListener(r5)
            goto L_0x023a
        L_0x0230:
            gy3.C87412m.m108603p(r3)
            throw r9
        L_0x0234:
            java.lang.String r1 = "recharge_agreement_link_checkbox"
            gy3.C87412m.m108603p(r1)
            throw r9
        L_0x023a:
            boolean r2 = r30.mo11902a()
            java.lang.String r13 = "recharge_agreement_link_text"
            if (r2 != 0) goto L_0x030b
            te3.uc2 r2 = r1.f35120c
            java.lang.String r2 = r2.f142740e
            if (r2 == 0) goto L_0x0251
            int r2 = r2.length()
            if (r2 != 0) goto L_0x024f
            goto L_0x0251
        L_0x024f:
            r2 = 0
            goto L_0x0252
        L_0x0251:
            r2 = 1
        L_0x0252:
            if (r2 == 0) goto L_0x0256
            goto L_0x030b
        L_0x0256:
            android.view.View r2 = r0.f35103j
            if (r2 == 0) goto L_0x0307
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r3.mo10233c(r5)
            java.lang.Object[] r15 = r3.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r17 = "updateAgreementLinkText"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r15 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r16 = "updateAgreementLinkText"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
            android.widget.TextView r2 = r0.f35106m
            if (r2 == 0) goto L_0x0303
            r3 = 14
            r53.C12953c.m12404m(r2, r3)
            r2 = 2131839292(0x7f11493c, float:1.9311831E38)
            java.lang.String r2 = r7.getString(r2)
            java.lang.String r3 = "context.getString(R.stri…lan_protocal_prefix_text)"
            gy3.C87412m.m108593f(r2, r3)
            android.text.SpannableStringBuilder r3 = new android.text.SpannableStringBuilder
            r3.<init>(r2)
            r5 = 2131840178(0x7f114cb2, float:1.9313628E38)
            java.lang.String r5 = r7.getString(r5)
            java.lang.String r6 = "context.getString(R.stri…arge_agreement_link_text)"
            gy3.C87412m.m108593f(r5, r6)
            r3.append(r5)
            com.tencent.mm.wallet_core.ui.q r5 = new com.tencent.mm.wallet_core.ui.q
            q53.x r6 = new q53.x
            r6.<init>(r0)
            r5.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r6, (boolean) r10)
            int r2 = r2.length()
            int r6 = r3.length()
            r14 = 18
            r3.setSpan(r5, r2, r6, r14)
            android.widget.TextView r2 = r0.f35106m
            if (r2 == 0) goto L_0x02ff
            r2.setText(r3)
            android.widget.TextView r2 = r0.f35106m
            if (r2 == 0) goto L_0x02fb
            r2.setClickable(r10)
            android.widget.TextView r2 = r0.f35106m
            if (r2 == 0) goto L_0x02f7
            de3.a0 r3 = new de3.a0
            r3.<init>(r7)
            r2.setOnTouchListener(r3)
            goto L_0x0351
        L_0x02f7:
            gy3.C87412m.m108603p(r13)
            throw r9
        L_0x02fb:
            gy3.C87412m.m108603p(r13)
            throw r9
        L_0x02ff:
            gy3.C87412m.m108603p(r13)
            throw r9
        L_0x0303:
            gy3.C87412m.m108603p(r13)
            throw r9
        L_0x0307:
            gy3.C87412m.m108603p(r3)
            throw r9
        L_0x030b:
            android.view.View r2 = r0.f35103j
            if (r2 == 0) goto L_0x0686
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r15 = r3.mo10232b()
            java.lang.String r16 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r17 = "updateAgreementLinkText"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            r14 = r2
            j20.C117292a.m165358d(r14, r15, r16, r17, r18, r19, r20, r21)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r15 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r16 = "updateAgreementLinkText"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "android/view/View_EXEC_"
            java.lang.String r19 = "setVisibility"
            java.lang.String r20 = "(I)V"
            j20.C117292a.m165359e(r14, r15, r16, r17, r18, r19, r20)
        L_0x0351:
            s43.e r1 = r1.f35118a
            java.util.List<java.lang.String> r1 = r1.f38608l
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r10
            java.lang.String r2 = "link_separator"
            java.lang.String r3 = "consume_tips_link_ll"
            java.lang.String r14 = "consume_tips_link"
            if (r1 == 0) goto L_0x0425
            android.view.View r1 = r0.f35107n
            if (r1 == 0) goto L_0x0421
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            r3.mo10233c(r4)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r18 = "updateConsumeTipsLink"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r17 = "updateConsumeTipsLink"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r1 = r0.f35109p
            if (r1 == 0) goto L_0x041d
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            r2.mo10233c(r3)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r25 = "updateConsumeTipsLink"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r2 = r2.mo10231a(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r23 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r24 = "updateConsumeTipsLink"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.widget.TextView r1 = r0.f35108o
            if (r1 == 0) goto L_0x0419
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            r3 = 0
            android.widget.TextView r4 = r0.f35108o
            if (r4 == 0) goto L_0x0415
            java.lang.CharSequence r4 = r4.getText()
            int r4 = r4.length()
            com.tencent.mm.wallet_core.ui.q r5 = new com.tencent.mm.wallet_core.ui.q
            q53.a0 r6 = new q53.a0
            r6.<init>(r0)
            r5.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r6, (boolean) r10)
            r6 = r31
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90253j0(r1, r2, r3, r4, r5, r6)
            goto L_0x04ae
        L_0x0415:
            gy3.C87412m.m108603p(r14)
            throw r9
        L_0x0419:
            gy3.C87412m.m108603p(r14)
            throw r9
        L_0x041d:
            gy3.C87412m.m108603p(r2)
            throw r9
        L_0x0421:
            gy3.C87412m.m108603p(r3)
            throw r9
        L_0x0425:
            android.view.View r1 = r0.f35107n
            if (r1 == 0) goto L_0x0681
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.mo10233c(r5)
            java.lang.Object[] r16 = r3.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r18 = "updateConsumeTipsLink"
            java.lang.String r19 = "()V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r1
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r3 = r3.mo10231a(r12)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.setVisibility(r3)
            java.lang.String r16 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r17 = "updateConsumeTipsLink"
            java.lang.String r18 = "()V"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            android.view.View r1 = r0.f35109p
            if (r1 == 0) goto L_0x067c
            k20.a r2 = new k20.a
            r2.<init>()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2.mo10233c(r3)
            java.lang.Object[] r23 = r2.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r25 = "updateConsumeTipsLink"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r1
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.Object r2 = r2.mo10231a(r12)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r23 = "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinConsumePanel"
            java.lang.String r24 = "updateConsumeTipsLink"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
        L_0x04ae:
            android.widget.TextView r1 = r0.f35110q
            java.lang.String r15 = "common_faq"
            if (r1 == 0) goto L_0x0677
            java.lang.CharSequence r2 = r1.getText()
            java.lang.String r2 = r2.toString()
            r3 = 0
            android.widget.TextView r4 = r0.f35110q
            if (r4 == 0) goto L_0x0672
            java.lang.CharSequence r4 = r4.getText()
            int r4 = r4.length()
            com.tencent.mm.wallet_core.ui.q r5 = new com.tencent.mm.wallet_core.ui.q
            q53.z r6 = new q53.z
            r6.<init>(r0)
            r5.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r6, (boolean) r10)
            r6 = r31
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90253j0(r1, r2, r3, r4, r5, r6)
            android.view.View r1 = r0.f35097d
            if (r1 == 0) goto L_0x066b
            q53.u r2 = new q53.u
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.view.View r1 = r0.f35098e
            if (r1 == 0) goto L_0x0664
            q53.v r2 = new q53.v
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.widget.Button r1 = r0.f35105l
            if (r1 == 0) goto L_0x065f
            q53.w r2 = new q53.w
            r2.<init>(r0)
            r1.setOnClickListener(r2)
            android.view.ViewGroup r1 = r8.f36921B
            java.lang.String r2 = "dialog.contentContainer"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r3 = "consume_info_view"
            l31.C10460a.m10392a(r1, r3)
            android.view.ViewGroup r1 = r8.f36921B
            gy3.C87412m.m108593f(r1, r2)
            r3 = 3
            rx3.l[] r3 = new rx3.C13604l[r3]
            boolean r4 = r30.mo11902a()
            r5 = 2
            if (r4 == 0) goto L_0x0519
            r4 = 1
            goto L_0x051a
        L_0x0519:
            r4 = 2
        L_0x051a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            rx3.l r6 = new rx3.l
            java.lang.String r7 = "enough_coin"
            r6.<init>(r7, r4)
            r3[r12] = r6
            java.lang.String r4 = m53.C10765k.f32240b
            rx3.l r6 = new rx3.l
            java.lang.String r7 = "coin_report_session_id"
            r6.<init>(r7, r4)
            r3[r10] = r6
            int r4 = m53.C10765k.f32239a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            rx3.l r6 = new rx3.l
            java.lang.String r9 = "coin_business_id"
            r6.<init>(r9, r4)
            r3[r5] = r6
            java.util.Map r3 = sx3.C90364q0.m113148g(r3)
            l31.C10460a.m10393b(r1, r3)
            android.view.ViewGroup r1 = r8.f36921B
            gy3.C87412m.m108593f(r1, r2)
            r2 = 32
            r3 = 25955(0x6563, float:3.6371E-41)
            l31.C10460a.m10394c(r1, r2, r3)
            android.widget.TextView r1 = r0.f35106m
            if (r1 == 0) goto L_0x065a
            java.lang.String r2 = "pay_info_protocol"
            l31.C10460a.m10392a(r1, r2)
            android.widget.TextView r1 = r0.f35106m
            if (r1 == 0) goto L_0x0655
            rx3.l[] r2 = new rx3.C13604l[r5]
            java.lang.String r4 = m53.C10765k.f32240b
            rx3.l r6 = new rx3.l
            r6.<init>(r7, r4)
            r2[r12] = r6
            int r4 = m53.C10765k.f32239a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            rx3.l r6 = new rx3.l
            r6.<init>(r9, r4)
            r2[r10] = r6
            java.util.Map r2 = sx3.C90364q0.m113148g(r2)
            l31.C10460a.m10393b(r1, r2)
            android.widget.TextView r1 = r0.f35106m
            if (r1 == 0) goto L_0x0650
            r2 = 40
            l31.C10460a.m10394c(r1, r2, r3)
            android.widget.TextView r1 = r0.f35110q
            if (r1 == 0) goto L_0x064b
            java.lang.String r4 = "pay_info_help"
            l31.C10460a.m10392a(r1, r4)
            android.widget.TextView r1 = r0.f35110q
            if (r1 == 0) goto L_0x0646
            rx3.l[] r4 = new rx3.C13604l[r5]
            java.lang.String r6 = m53.C10765k.f32240b
            rx3.l r8 = new rx3.l
            r8.<init>(r7, r6)
            r4[r12] = r8
            int r6 = m53.C10765k.f32239a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r8 = new rx3.l
            r8.<init>(r9, r6)
            r4[r10] = r8
            java.util.Map r4 = sx3.C90364q0.m113148g(r4)
            l31.C10460a.m10393b(r1, r4)
            android.widget.TextView r1 = r0.f35110q
            if (r1 == 0) goto L_0x0641
            l31.C10460a.m10394c(r1, r2, r3)
            android.widget.TextView r1 = r0.f35108o
            if (r1 == 0) goto L_0x063c
            java.lang.String r4 = "pay_info_notice"
            l31.C10460a.m10392a(r1, r4)
            android.widget.TextView r1 = r0.f35108o
            if (r1 == 0) goto L_0x0637
            rx3.l[] r4 = new rx3.C13604l[r5]
            java.lang.String r6 = m53.C10765k.f32240b
            rx3.l r8 = new rx3.l
            r8.<init>(r7, r6)
            r4[r12] = r8
            int r6 = m53.C10765k.f32239a
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            rx3.l r8 = new rx3.l
            r8.<init>(r9, r6)
            r4[r10] = r8
            java.util.Map r4 = sx3.C90364q0.m113148g(r4)
            l31.C10460a.m10393b(r1, r4)
            android.widget.TextView r1 = r0.f35108o
            if (r1 == 0) goto L_0x0632
            l31.C10460a.m10394c(r1, r2, r3)
            android.widget.Button r1 = r0.f35105l
            if (r1 == 0) goto L_0x062d
            java.lang.String r4 = "pay_info_button"
            l31.C10460a.m10392a(r1, r4)
            android.widget.Button r1 = r0.f35105l
            if (r1 == 0) goto L_0x0628
            rx3.l[] r4 = new rx3.C13604l[r5]
            java.lang.String r5 = m53.C10765k.f32240b
            rx3.l r6 = new rx3.l
            r6.<init>(r7, r5)
            r4[r12] = r6
            int r5 = m53.C10765k.f32239a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            rx3.l r6 = new rx3.l
            r6.<init>(r9, r5)
            r4[r10] = r6
            java.util.Map r4 = sx3.C90364q0.m113148g(r4)
            l31.C10460a.m10393b(r1, r4)
            android.widget.Button r1 = r0.f35105l
            if (r1 == 0) goto L_0x0623
            l31.C10460a.m10394c(r1, r2, r3)
            return
        L_0x0623:
            gy3.C87412m.m108603p(r11)
            r1 = 0
            throw r1
        L_0x0628:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x062d:
            r1 = 0
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x0632:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0637:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x063c:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0641:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x0646:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x064b:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x0650:
            r1 = 0
            gy3.C87412m.m108603p(r13)
            throw r1
        L_0x0655:
            r1 = 0
            gy3.C87412m.m108603p(r13)
            throw r1
        L_0x065a:
            r1 = 0
            gy3.C87412m.m108603p(r13)
            throw r1
        L_0x065f:
            r1 = r9
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x0664:
            r1 = r9
            java.lang.String r2 = "balance_button"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x066b:
            r1 = r9
            java.lang.String r2 = "closeButton"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0672:
            r1 = r9
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x0677:
            r1 = r9
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x067c:
            r1 = r9
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0681:
            r1 = r9
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0686:
            r1 = r9
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x068b:
            r1 = r9
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0690:
            r1 = r9
            gy3.C87412m.m108603p(r11)
            throw r1
        L_0x0695:
            r1 = r9
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x069a:
            r1 = r9
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x069f:
            r1 = r9
            java.lang.String r2 = "balanceText"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x06a6:
            r1 = r9
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x06ab:
            r1 = r9
            gy3.C87412m.m108603p(r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: q53.C12049b0.<init>(android.content.Context, q53.c0):void");
    }

    /* renamed from: a */
    public final boolean mo11902a() {
        C12053c0 c0Var = this.f35095b;
        return ((long) c0Var.f35118a.f38606j) <= c0Var.f35119b;
    }
}

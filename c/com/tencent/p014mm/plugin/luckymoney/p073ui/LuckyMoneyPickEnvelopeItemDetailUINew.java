package com.tencent.p014mm.plugin.luckymoney.p073ui;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.vas.VASActivity;
import com.tencent.p014mm.plugin.appbrand.jsapi.nfc.C82860i;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import f40.C86737h0;
import java.util.Set;
import kg3.C76577a;
import kotlin.Metadata;
import nj3.C88989a;
import sx3.C110826x0;
import vo3.C90852c;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailUINew;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-wxpay_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
@C88989a(7)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew */
public final class LuckyMoneyPickEnvelopeItemDetailUINew extends VASActivity {

    /* renamed from: d */
    public boolean f200506d;

    /* renamed from: e */
    public String f200507e;

    /* renamed from: f */
    public Integer f200508f = 0;

    /* renamed from: g */
    public String f200509g;

    /* renamed from: h */
    public int f200510h = C76577a.m92151b(MMApplicationContext.getContext(), 213);

    /* renamed from: i */
    public int f200511i = C76577a.m92151b(MMApplicationContext.getContext(), C82860i.CTRL_INDEX);

    /* renamed from: j */
    public int f200512j;

    /* renamed from: n */
    public int f200513n;

    /* renamed from: o */
    public int f200514o;

    /* renamed from: p */
    public int f200515p;

    public int getLayoutId() {
        return C0966R.C0971layout.d_k;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C69597g3.class, C69651n3.class, C69626k3.class, C69658o3.class);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.o3>} */
    /* JADX WARNING: type inference failed for: r1v66, types: [java.lang.Throwable, android.view.View$OnTouchListener] */
    /* JADX WARNING: type inference failed for: r1v110 */
    /* JADX WARNING: type inference failed for: r1v116 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:291:0x0879  */
    /* JADX WARNING: Removed duplicated region for block: B:315:0x097d  */
    /* JADX WARNING: Removed duplicated region for block: B:486:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r38) {
        /*
            r37 = this;
            r1 = r37
            java.lang.Class<f32.b> r2 = f32.C75672b.class
            java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.o3> r3 = com.tencent.p014mm.plugin.luckymoney.p073ui.C69658o3.class
            java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.g3> r4 = com.tencent.p014mm.plugin.luckymoney.p073ui.C69597g3.class
            super.onCreate(r38)
            java.util.regex.Pattern r0 = com.tencent.p014mm.wallet_core.p137ui.C75228t.f221346a
            android.view.Window r0 = r37.getWindow()
            android.view.View r0 = r0.getDecorView()
            r5 = 1792(0x700, float:2.511E-42)
            r0.setSystemUiVisibility(r5)
            android.view.Window r0 = r37.getWindow()
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r0.addFlags(r5)
            android.view.Window r0 = r37.getWindow()
            r6 = 0
            r0.setStatusBarColor(r6)
            android.view.Window r0 = r37.getWindow()
            r0.setNavigationBarColor(r6)
            androidx.appcompat.app.ActionBar r0 = r37.getSupportActionBar()
            if (r0 == 0) goto L_0x003f
            androidx.appcompat.app.ActionBar r0 = r37.getSupportActionBar()
            r0.mo91104o()
        L_0x003f:
            androidx.appcompat.app.AppCompatActivity r0 = r37.getContext()
            com.tencent.mm.ui.i3$a r0 = com.tencent.p014mm.p136ui.C74783i3.m89537a(r0)
            int r7 = r0.f24704a
            int r0 = r0.f24705b
            if (r7 <= 0) goto L_0x004f
            if (r0 > 0) goto L_0x006a
        L_0x004f:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.view.Window r7 = r37.getWindow()
            android.view.View r7 = r7.getDecorView()
            r7.getWindowVisibleDisplayFrame(r0)
            int r7 = r0.right
            int r8 = r0.left
            int r7 = r7 - r8
            int r8 = r0.bottom
            int r0 = r0.top
            int r0 = r8 - r0
        L_0x006a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "calculateItemSize： "
            r8.append(r9)
            r8.append(r7)
            r9 = 32
            r8.append(r9)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            java.lang.String r8 = "MicroMsg.LuckyMoneyPickEnvelopeItemDetailUI"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            if (r7 <= 0) goto L_0x00b6
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 24
            kg3.C76577a.m92151b(r0, r9)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 116(0x74, float:1.63E-43)
            kg3.C76577a.m92151b(r0, r9)
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 90
            kg3.C76577a.m92151b(r0, r9)
            float r0 = (float) r7
            r7 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r7
            int r0 = (int) r0
            r1.f200510h = r0
            float r0 = (float) r0
            r7 = 1070856143(0x3fd3f7cf, float:1.656)
            float r0 = r0 * r7
            int r0 = (int) r0
            r1.f200511i = r0
        L_0x00b6:
            int r0 = r1.f200510h
            float r0 = (float) r0
            r7 = 1068540887(0x3fb0a3d7, float:1.38)
            float r7 = r7 * r0
            int r7 = (int) r7
            r1.f200512j = r7
            r7 = 1066186205(0x3f8cb5dd, float:1.0993)
            float r7 = r7 * r0
            int r7 = (int) r7
            r1.f200513n = r7
            float r7 = (float) r7
            r9 = 1071393014(0x3fdc28f6, float:1.72)
            float r7 = r7 * r9
            int r7 = (int) r7
            r1.f200514o = r7
            r7 = 1077516698(0x4039999a, float:2.9)
            float r0 = r0 / r7
            int r0 = (int) r0
            r1.f200515p = r0
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r7 = r37.getContext()
            java.lang.String r9 = "context"
            gy3.C87412m.m108593f(r7, r9)
            bl3.r$a r0 = r0.mo62444c(r7)
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            com.tencent.mm.plugin.luckymoney.ui.g3 r0 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69597g3) r0
            te3.sf2 r7 = new te3.sf2
            r7.<init>()
            r0.getClass()
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307957(0x7f092db5, float:1.8234156E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.id.lmpi_detail_root_view)"
            gy3.C87412m.m108593f(r7, r10)
            r0.f200925n = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307937(0x7f092da1, float:1.8234115E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…ail_decoration_avatar_iv)"
            gy3.C87412m.m108593f(r7, r10)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0.f200918d = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307942(0x7f092da6, float:1.8234126E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…l_decoration_nickname_tv)"
            gy3.C87412m.m108593f(r7, r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f200919e = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307951(0x7f092daf, float:1.8234144E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…etail_decoration_wish_tv)"
            gy3.C87412m.m108593f(r7, r10)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f200920f = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307952(0x7f092db0, float:1.8234146E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…etail_envelope_close_btn)"
            gy3.C87412m.m108593f(r7, r10)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            r0.f200921g = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307953(0x7f092db1, float:1.8234148E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…ail_envelope_confirm_btn)"
            gy3.C87412m.m108593f(r7, r10)
            android.widget.Button r7 = (android.widget.Button) r7
            r0.f200923i = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r10 = 2131307956(0x7f092db4, float:1.8234154E38)
            android.view.View r7 = r7.findViewById(r10)
            java.lang.String r11 = "activity.findViewById(R.…tail_envelope_preview_tv)"
            gy3.C87412m.m108593f(r7, r11)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r0.f200924j = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r12 = 2131307941(0x7f092da5, float:1.8234124E38)
            android.view.View r7 = r7.findViewById(r12)
            java.lang.String r13 = "activity.findViewById(R.…tion_envelope_top_cap_iv)"
            gy3.C87412m.m108593f(r7, r13)
            r0.f200926o = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r14 = 2131307939(0x7f092da3, float:1.823412E38)
            android.view.View r7 = r7.findViewById(r14)
            java.lang.String r14 = "activity.findViewById(R.…etail_decoration_default)"
            gy3.C87412m.m108593f(r7, r14)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r0.f200927p = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r14 = 2131307947(0x7f092dab, float:1.8234136E38)
            android.view.View r7 = r7.findViewById(r14)
            java.lang.String r14 = "activity.findViewById(R.…coration_userinfo_layout)"
            gy3.C87412m.m108593f(r7, r14)
            r0.f200928q = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r14 = 2131307943(0x7f092da7, float:1.8234128E38)
            android.view.View r7 = r7.findViewById(r14)
            java.lang.String r14 = "activity.findViewById(R.…tail_decoration_open_btn)"
            gy3.C87412m.m108593f(r7, r14)
            android.widget.Button r7 = (android.widget.Button) r7
            r0.f200922h = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            r14 = 2131307938(0x7f092da2, float:1.8234117E38)
            android.view.View r7 = r7.findViewById(r14)
            java.lang.String r14 = "activity.findViewById(R.…ail_decoration_container)"
            gy3.C87412m.m108593f(r7, r14)
            android.widget.RelativeLayout r7 = (android.widget.RelativeLayout) r7
            r0.f200929r = r7
            androidx.appcompat.app.AppCompatActivity r7 = r0.getActivity()
            android.view.Window r7 = r7.getWindow()
            java.lang.String r14 = "activity.window"
            gy3.C87412m.m108593f(r7, r14)
            r7.addFlags(r5)
            androidx.appcompat.app.AppCompatActivity r5 = r0.getActivity()
            android.content.res.Resources r5 = r5.getResources()
            r14 = 2131101688(0x7f0607f8, float:1.7815793E38)
            int r5 = r5.getColor(r14)
            r7.setStatusBarColor(r5)
            androidx.appcompat.app.AppCompatActivity r5 = r0.getActivity()
            java.lang.String r7 = "null cannot be cast to non-null type com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew"
            gy3.C87412m.m108592e(r5, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r5 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r5
            int r5 = r5.f200514o
            androidx.appcompat.app.AppCompatActivity r14 = r0.getActivity()
            gy3.C87412m.m108592e(r14, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r14 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r14
            int r14 = r14.f200511i
            int r15 = r5 - r14
            r16 = r11
            double r10 = (double) r15
            r17 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r10 = r10 * r17
            int r10 = iy3.C60641c.m70920a(r10)
            android.widget.RelativeLayout r11 = r0.f200929r
            if (r11 == 0) goto L_0x0c98
            r11.setMinimumHeight(r5)
            android.widget.ImageView r5 = r0.f200927p
            java.lang.String r11 = "envelopeDefaultBg"
            if (r5 == 0) goto L_0x0c91
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams"
            gy3.C87412m.m108592e(r5, r12)
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            androidx.appcompat.app.AppCompatActivity r15 = r0.getActivity()
            gy3.C87412m.m108592e(r15, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r15 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r15
            int r15 = r15.f200510h
            r5.width = r15
            r5.height = r14
            android.widget.ImageView r14 = r0.f200927p
            if (r14 == 0) goto L_0x0c8a
            r14.setLayoutParams(r5)
            android.view.View r5 = r0.f200926o
            java.lang.String r14 = "envelopeMaskIv"
            if (r5 == 0) goto L_0x0c83
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            gy3.C87412m.m108592e(r5, r12)
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            r5.topMargin = r10
            androidx.appcompat.app.AppCompatActivity r15 = r0.getActivity()
            gy3.C87412m.m108592e(r15, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r15 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r15
            int r15 = r15.f200510h
            r5.width = r15
            androidx.appcompat.app.AppCompatActivity r15 = r0.getActivity()
            gy3.C87412m.m108592e(r15, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r15 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r15
            int r15 = r15.f200512j
            r5.height = r15
            android.view.View r15 = r0.f200926o
            if (r15 == 0) goto L_0x0c7c
            r15.setLayoutParams(r5)
            android.view.View r5 = r0.f200928q
            java.lang.String r15 = "userInfoLayout"
            if (r5 == 0) goto L_0x0c75
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            gy3.C87412m.m108592e(r5, r12)
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r19 = r15
            r15 = 58
            int r6 = kg3.C76577a.m92151b(r6, r15)
            int r10 = r10 + r6
            r5.topMargin = r10
            android.view.View r6 = r0.f200928q
            if (r6 == 0) goto L_0x0c70
            r6.setLayoutParams(r5)
            android.widget.Button r5 = r0.f200922h
            java.lang.String r6 = "openBtn"
            if (r5 == 0) goto L_0x0c6b
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            gy3.C87412m.m108592e(r5, r12)
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            androidx.appcompat.app.AppCompatActivity r10 = r0.getActivity()
            gy3.C87412m.m108592e(r10, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r10 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r10
            int r10 = r10.f200515p
            r15 = 2
            int r10 = r10 * 2
            r15 = 3
            int r10 = r10 / r15
            int r10 = -r10
            r5.topMargin = r10
            androidx.appcompat.app.AppCompatActivity r10 = r0.getActivity()
            gy3.C87412m.m108592e(r10, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r10 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r10
            int r10 = r10.f200515p
            r5.width = r10
            androidx.appcompat.app.AppCompatActivity r10 = r0.getActivity()
            gy3.C87412m.m108592e(r10, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r10 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r10
            int r10 = r10.f200515p
            r5.height = r10
            android.widget.Button r10 = r0.f200922h
            if (r10 == 0) goto L_0x0c66
            r10.setLayoutParams(r5)
            java.lang.Class<ln.f> r5 = p196ln.C76705f.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ln.f r5 = (p196ln.C76705f) r5
            android.widget.ImageView r6 = r0.f200918d
            if (r6 == 0) goto L_0x0c5f
            java.lang.String r10 = eb0.C75592q0.m90789s()
            r15 = 1031127695(0x3d75c28f, float:0.06)
            r5.D20(r6, r10, r15)
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r6 = 2131165650(0x7f0701d2, float:1.7945523E38)
            int r5 = kg3.C76577a.m92157h(r5, r6)
            android.app.Activity r6 = r0.getContext()
            r10 = 1
            java.lang.Object[] r15 = new java.lang.Object[r10]
            java.lang.Class<ny.h> r20 = p629ny.C76979h.class
            di3.d r20 = di3.C86312j.m106911c(r20)
            r10 = r20
            ny.h r10 = (p629ny.C76979h) r10
            r20 = r11
            android.content.Context r11 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r22 = r3
            java.lang.String r3 = eb0.C75592q0.m90783m()
            android.text.SpannableString r3 = r10.op0(r11, r3, r5)
            r5 = 0
            r15[r5] = r3
            r3 = 2131832559(0x7f112eef, float:1.9298175E38)
            java.lang.String r3 = r6.getString(r3, r15)
            java.lang.String r5 = "context.getString(\n     …e\n            )\n        )"
            gy3.C87412m.m108593f(r3, r5)
            android.widget.TextView r5 = r0.f200919e
            java.lang.String r6 = "nickNameTv"
            if (r5 == 0) goto L_0x0c58
            r5.setText(r3)
            android.widget.TextView r3 = r0.f200919e
            if (r3 == 0) goto L_0x0c51
            r5 = 1097859072(0x41700000, float:15.0)
            r10 = 1
            r3.setTextSize(r10, r5)
            android.widget.TextView r3 = r0.f200920f
            java.lang.String r5 = "wishTv"
            if (r3 == 0) goto L_0x0c4a
            r11 = 1099431936(0x41880000, float:17.0)
            r3.setTextSize(r10, r11)
            com.tencent.mm.ui.widget.imageview.WeImageView r3 = r0.f200921g
            if (r3 == 0) goto L_0x0c43
            com.tencent.mm.plugin.luckymoney.ui.d3 r10 = new com.tencent.mm.plugin.luckymoney.ui.d3
            r10.<init>(r0)
            r3.setOnClickListener(r10)
            android.content.Intent r3 = r0.getIntent()
            java.lang.String r10 = "key_source_select_pos"
            r15 = 0
            int r3 = r3.getIntExtra(r10, r15)
            android.content.Intent r11 = r0.getIntent()
            r24 = r10
            java.lang.String r10 = "key_source_is_select_create_Envelope"
            boolean r10 = r11.getBooleanExtra(r10, r15)
            android.content.Intent r11 = r0.getIntent()
            r25 = r14
            java.lang.String r14 = "key_source_is_select_biz_Envelope"
            boolean r11 = r11.getBooleanExtra(r14, r15)
            android.widget.TextView r14 = r0.f200924j
            java.lang.String r15 = "envelopePreviewTv"
            if (r14 == 0) goto L_0x0c3e
            r26 = r5
            r5 = 1096810496(0x41600000, float:14.0)
            r27 = r6
            r6 = 1
            r14.setTextSize(r6, r5)
            android.widget.Button r14 = r0.f200923i
            java.lang.String r28 = "envelopeConfirmBtn"
            if (r14 == 0) goto L_0x0c39
            r5 = 1099431936(0x41880000, float:17.0)
            r14.setTextSize(r6, r5)
            r5 = -1
            r6 = 2131832403(0x7f112e53, float:1.9297859E38)
            r14 = 4
            if (r3 != r5) goto L_0x03d8
            android.widget.Button r3 = r0.f200923i
            if (r3 == 0) goto L_0x03d3
            r5 = 0
            r3.setEnabled(r5)
            android.widget.Button r3 = r0.f200923i
            if (r3 == 0) goto L_0x03ce
            r3.setText(r6)
            android.widget.Button r3 = r0.f200923i
            if (r3 == 0) goto L_0x03c9
            r3.setVisibility(r5)
            goto L_0x044d
        L_0x03c9:
            gy3.C87412m.m108603p(r28)
            r5 = 0
            throw r5
        L_0x03ce:
            r5 = 0
            gy3.C87412m.m108603p(r28)
            throw r5
        L_0x03d3:
            r5 = 0
            gy3.C87412m.m108603p(r28)
            throw r5
        L_0x03d8:
            r5 = 0
            r6 = -2
            if (r3 != r6) goto L_0x03f3
            android.widget.TextView r3 = r0.f200924j
            if (r3 == 0) goto L_0x03ef
            r3.setVisibility(r14)
            android.widget.Button r3 = r0.f200923i
            if (r3 == 0) goto L_0x03eb
            r3.setVisibility(r14)
            goto L_0x044d
        L_0x03eb:
            gy3.C87412m.m108603p(r28)
            throw r5
        L_0x03ef:
            gy3.C87412m.m108603p(r15)
            throw r5
        L_0x03f3:
            if (r10 == 0) goto L_0x040c
            android.widget.TextView r3 = r0.f200924j
            if (r3 == 0) goto L_0x0408
            r3.setVisibility(r14)
            android.widget.Button r3 = r0.f200923i
            if (r3 == 0) goto L_0x0404
            r3.setVisibility(r14)
            goto L_0x044d
        L_0x0404:
            gy3.C87412m.m108603p(r28)
            throw r5
        L_0x0408:
            gy3.C87412m.m108603p(r15)
            throw r5
        L_0x040c:
            android.widget.Button r6 = r0.f200923i
            if (r6 == 0) goto L_0x0c34
            r10 = 1
            r6.setEnabled(r10)
            if (r11 == 0) goto L_0x0425
            android.widget.Button r6 = r0.f200923i
            if (r6 == 0) goto L_0x0421
            r10 = 2131832389(0x7f112e45, float:1.929783E38)
            r6.setText(r10)
            goto L_0x042f
        L_0x0421:
            gy3.C87412m.m108603p(r28)
            throw r5
        L_0x0425:
            android.widget.Button r5 = r0.f200923i
            if (r5 == 0) goto L_0x0c2f
            r6 = 2131832403(0x7f112e53, float:1.9297859E38)
            r5.setText(r6)
        L_0x042f:
            android.widget.Button r5 = r0.f200923i
            if (r5 == 0) goto L_0x0c2a
            r6 = 0
            r5.setVisibility(r6)
            if (r3 != 0) goto L_0x0446
            android.widget.TextView r3 = r0.f200924j
            if (r3 == 0) goto L_0x0441
            r3.setVisibility(r14)
            goto L_0x044d
        L_0x0441:
            gy3.C87412m.m108603p(r15)
            r2 = 0
            throw r2
        L_0x0446:
            android.widget.TextView r3 = r0.f200924j
            if (r3 == 0) goto L_0x0c25
            r3.setVisibility(r6)
        L_0x044d:
            android.widget.Button r3 = r0.f200923i
            if (r3 == 0) goto L_0x0c20
            com.tencent.mm.plugin.luckymoney.ui.f3 r5 = new com.tencent.mm.plugin.luckymoney.ui.f3
            r5.<init>(r0)
            r3.setOnClickListener(r5)
            android.view.View r3 = r0.f200925n
            if (r3 == 0) goto L_0x0c19
            com.tencent.mm.plugin.luckymoney.ui.e3 r5 = new com.tencent.mm.plugin.luckymoney.ui.e3
            r5.<init>(r0)
            r3.post(r5)
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r3 = "key_source_click_thumb_detail_need_close_dynamic"
            r5 = 0
            boolean r0 = r0.getBooleanExtra(r3, r5)
            r1.f200506d = r0
            android.content.Intent r0 = r37.getIntent()
            java.lang.String r3 = "key_source_click_thumb_detail_resp"
            boolean r0 = r0.getBooleanExtra(r3, r5)
            if (r0 != 0) goto L_0x0484
            java.lang.String r0 = "do not have source data"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return
        L_0x0484:
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r3 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_LUCKY_MONEY_ENVELOPE_CLICK_THUNB_ITEM_SNAPSHOT_STRING_SYNC
            java.lang.String r5 = ""
            java.lang.Object r0 = r0.mo119685f(r3, r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x04a1
            int r3 = r0.length()
            if (r3 != 0) goto L_0x049f
            goto L_0x04a1
        L_0x049f:
            r3 = 0
            goto L_0x04a2
        L_0x04a1:
            r3 = 1
        L_0x04a2:
            if (r3 == 0) goto L_0x04aa
            java.lang.String r0 = "do not have source data s"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            return
        L_0x04aa:
            java.nio.charset.Charset r3 = s24.C77613a.f226275a
            java.lang.String r6 = "ISO_8859_1"
            gy3.C87412m.m108593f(r3, r6)
            byte[] r0 = r0.getBytes(r3)
            java.lang.String r3 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r0, r3)
            te3.sf2 r3 = new te3.sf2
            r3.<init>()
            r3.parseFrom(r0)     // Catch:{ Exception -> 0x04c4 }
            goto L_0x04d2
        L_0x04c4:
            r0 = move-exception
            r3 = r0
            r6 = 1
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r6 = 0
            r0[r6] = r3
            java.lang.String r3 = "safeParser"
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r3, r5, r0)
            r3 = 0
        L_0x04d2:
            if (r3 == 0) goto L_0x0c18
            java.lang.String r0 = r3.f228202f
            r1.f200507e = r0
            int r0 = r3.f228208o
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.f200508f = r0
            java.lang.String r0 = r3.f228199D
            r1.f200509g = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "onCreate materialId is："
            r0.append(r6)
            java.lang.String r6 = r1.f200507e
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r8, r0)
            bl3.r r0 = bl3.C39818r.f106831a
            androidx.appcompat.app.AppCompatActivity r6 = r37.getContext()
            gy3.C87412m.m108593f(r6, r9)
            bl3.r$a r6 = r0.mo62444c(r6)
            java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.n3> r8 = com.tencent.p014mm.plugin.luckymoney.p073ui.C69651n3.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r8)
            com.tencent.mm.plugin.luckymoney.ui.n3 r6 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69651n3) r6
            r6.getClass()
            androidx.appcompat.app.AppCompatActivity r8 = r6.getActivity()
            r10 = 2131307940(0x7f092da4, float:1.8234122E38)
            android.view.View r8 = r8.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…l_decoration_envelope_iv)"
            gy3.C87412m.m108593f(r8, r10)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r6.f201028e = r8
            androidx.appcompat.app.AppCompatActivity r8 = r6.getActivity()
            r10 = 2131307955(0x7f092db3, float:1.8234152E38)
            android.view.View r8 = r8.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…_detail_envelope_name_tv)"
            gy3.C87412m.m108593f(r8, r10)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.f201030g = r8
            androidx.appcompat.app.AppCompatActivity r8 = r6.getActivity()
            r10 = 2131307954(0x7f092db2, float:1.823415E38)
            android.view.View r8 = r8.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…detail_envelope_leave_tv)"
            gy3.C87412m.m108593f(r8, r10)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.f201031h = r8
            androidx.appcompat.app.AppCompatActivity r8 = r6.getActivity()
            r10 = 2131307941(0x7f092da5, float:1.8234124E38)
            android.view.View r8 = r8.findViewById(r10)
            gy3.C87412m.m108593f(r8, r13)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            r6.f201029f = r8
            androidx.appcompat.app.AppCompatActivity r8 = r6.getActivity()
            r10 = 2131307946(0x7f092daa, float:1.8234134E38)
            android.view.View r8 = r8.findViewById(r10)
            java.lang.String r10 = "activity.findViewById(R.…decoration_temp_label_tv)"
            gy3.C87412m.m108593f(r8, r10)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.f201032i = r8
            androidx.appcompat.app.AppCompatActivity r8 = r6.getActivity()
            r10 = 2131307956(0x7f092db4, float:1.8234154E38)
            android.view.View r8 = r8.findViewById(r10)
            r10 = r16
            gy3.C87412m.m108593f(r8, r10)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r6.f201033j = r8
            android.content.Intent r8 = r6.getIntent()
            java.lang.String r10 = "key_source_is_illegal"
            r11 = 0
            boolean r8 = r8.getBooleanExtra(r10, r11)
            r6.f201034n = r8
            r6.f201027d = r3
            te3.tf2 r8 = r3.f228203g
            java.lang.String r10 = "default envelope"
            java.lang.String r11 = "SimpleUIComponent"
            java.lang.String r13 = "0"
            java.lang.String r16 = "hbEnvelopSource"
            if (r8 == 0) goto L_0x0687
            java.lang.String r8 = r3.f228202f
            boolean r8 = gy3.C87412m.m108589b(r13, r8)
            if (r8 == 0) goto L_0x05b2
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            r23 = r4
            goto L_0x0849
        L_0x05b2:
            te3.sf2 r8 = r6.f201027d
            if (r8 == 0) goto L_0x0682
            te3.tf2 r8 = r8.f228203g
            if (r8 == 0) goto L_0x0669
            java.lang.String r8 = r8.f228245f
            if (r8 == 0) goto L_0x05c7
            int r8 = r8.length()
            if (r8 != 0) goto L_0x05c5
            goto L_0x05c7
        L_0x05c5:
            r8 = 0
            goto L_0x05c8
        L_0x05c7:
            r8 = 1
        L_0x05c8:
            if (r8 == 0) goto L_0x05cc
            goto L_0x0669
        L_0x05cc:
            android.widget.ImageView r8 = r6.mo95878c3()
            r14 = 0
            r8.setVisibility(r14)
            android.widget.ImageView r8 = r6.f201029f
            if (r8 == 0) goto L_0x067a
            r14 = 2131233825(0x7f080c21, float:1.8083798E38)
            r8.setImageResource(r14)
            android.widget.ImageView r8 = r6.mo95878c3()
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            gy3.C87412m.m108592e(r8, r12)
            android.widget.RelativeLayout$LayoutParams r8 = (android.widget.RelativeLayout.LayoutParams) r8
            androidx.appcompat.app.AppCompatActivity r14 = r6.getActivity()
            gy3.C87412m.m108592e(r14, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r14 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r14
            int r14 = r14.f200510h
            r8.width = r14
            androidx.appcompat.app.AppCompatActivity r14 = r6.getActivity()
            gy3.C87412m.m108592e(r14, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r14 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r14
            int r14 = r14.f200511i
            r8.height = r14
            android.widget.ImageView r14 = r6.mo95878c3()
            r14.setLayoutParams(r8)
            di3.d r8 = di3.C86312j.m106911c(r2)
            r30 = r8
            f32.b r30 = (f32.C75672b) r30
            android.widget.ImageView r31 = r6.mo95878c3()
            te3.sf2 r8 = r6.f201027d
            if (r8 == 0) goto L_0x0675
            r33 = 0
            androidx.appcompat.app.AppCompatActivity r14 = r6.getActivity()
            gy3.C87412m.m108592e(r14, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r14 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r14
            int r14 = r14.f200510h
            androidx.appcompat.app.AppCompatActivity r1 = r6.getActivity()
            gy3.C87412m.m108592e(r1, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r1
            int r1 = r1.f200511i
            r36 = 0
            r32 = r8
            r34 = r14
            r35 = r1
            r30.ng0(r31, r32, r33, r34, r35, r36)
            androidx.appcompat.app.AppCompatActivity r1 = r6.getActivity()
            bl3.r$a r1 = r0.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            com.tencent.mm.plugin.luckymoney.ui.g3 r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69597g3) r1
            android.widget.TextView r1 = r1.f200920f
            if (r1 == 0) goto L_0x0670
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81615u(r1)
            androidx.appcompat.app.AppCompatActivity r1 = r6.getActivity()
            bl3.r$a r1 = r0.mo62444c(r1)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            com.tencent.mm.plugin.luckymoney.ui.g3 r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69597g3) r1
            android.widget.TextView r1 = r1.f200919e
            if (r1 == 0) goto L_0x066b
            com.tencent.p014mm.plugin.luckymoney.model.C69242l1.m81615u(r1)
        L_0x0669:
            r1 = 0
            goto L_0x067f
        L_0x066b:
            gy3.C87412m.m108603p(r27)
            r1 = 0
            throw r1
        L_0x0670:
            r1 = 0
            gy3.C87412m.m108603p(r26)
            throw r1
        L_0x0675:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x067a:
            r1 = 0
            gy3.C87412m.m108603p(r25)
            throw r1
        L_0x067f:
            rx3.b0 r8 = rx3.C13598b0.f38549a
            goto L_0x0687
        L_0x0682:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0687:
            android.widget.TextView r1 = r6.f201030g
            java.lang.String r8 = "envelopeNameTv"
            if (r1 == 0) goto L_0x0c11
            java.lang.String r14 = r3.f228200d
            r1.setText(r14)
            android.widget.TextView r1 = r6.f201030g
            if (r1 == 0) goto L_0x0c0a
            r8 = 1
            r14 = 1099431936(0x41880000, float:17.0)
            r1.setTextSize(r8, r14)
            android.widget.TextView r1 = r6.f201031h
            java.lang.String r14 = "envelopeLeaveTv"
            if (r1 == 0) goto L_0x0c05
            r23 = r4
            r4 = 1096810496(0x41600000, float:14.0)
            r1.setTextSize(r8, r4)
            te3.sf2 r1 = r6.f201027d
            if (r1 == 0) goto L_0x0c00
            java.lang.String r1 = r1.f228204h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x06db
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x06d6
            te3.sf2 r4 = r6.f201027d
            if (r4 == 0) goto L_0x06d1
            java.lang.String r4 = r4.f228204h
            r1.setText(r4)
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x06cc
            r4 = 0
            r1.setVisibility(r4)
            r1 = 0
            goto L_0x06e3
        L_0x06cc:
            gy3.C87412m.m108603p(r14)
            r1 = 0
            throw r1
        L_0x06d1:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x06d6:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x06db:
            r1 = 0
            android.widget.TextView r4 = r6.f201031h
            if (r4 == 0) goto L_0x0bfc
            r4.setText(r5)
        L_0x06e3:
            android.widget.TextView r4 = r6.f201031h
            if (r4 == 0) goto L_0x0bf8
            r4.setOnTouchListener(r1)
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x0bf3
            r4 = 0
            r1.setClickable(r4)
            te3.sf2 r1 = r6.f201027d
            if (r1 == 0) goto L_0x0bee
            int r5 = r1.f228208o
            r8 = 1
            if (r5 != r8) goto L_0x0728
            java.lang.String r1 = r1.f228211r
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x0728
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x0723
            r1.setVisibility(r4)
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x071e
            te3.sf2 r4 = r6.f201027d
            if (r4 == 0) goto L_0x0719
            java.lang.String r4 = r4.f228211r
            r1.setText(r4)
            goto L_0x07d7
        L_0x0719:
            gy3.C87412m.m108603p(r16)
            r1 = 0
            throw r1
        L_0x071e:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0723:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0728:
            te3.sf2 r1 = r6.f201027d
            if (r1 == 0) goto L_0x0be9
            int r4 = r1.f228209p
            r5 = 1
            if (r4 != r5) goto L_0x0768
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x0763
            r4 = 0
            r1.setVisibility(r4)
            te3.sf2 r1 = r6.f201027d
            if (r1 == 0) goto L_0x075e
            java.lang.String r1 = r1.f228210q
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x07d7
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x0759
            te3.sf2 r4 = r6.f201027d
            if (r4 == 0) goto L_0x0754
            java.lang.String r4 = r4.f228210q
            r1.setText(r4)
            goto L_0x07d7
        L_0x0754:
            gy3.C87412m.m108603p(r16)
            r1 = 0
            throw r1
        L_0x0759:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x075e:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0763:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0768:
            int r4 = r1.f228205i
            r5 = 1
            if (r4 != r5) goto L_0x079a
            java.lang.String r1 = r1.f228204h
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r1 != 0) goto L_0x07d7
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x0795
            te3.sf2 r4 = r6.f201027d
            if (r4 == 0) goto L_0x0790
            java.lang.String r4 = r4.f228204h
            r1.setText(r4)
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x078b
            r4 = 0
            r1.setVisibility(r4)
            goto L_0x07d7
        L_0x078b:
            gy3.C87412m.m108603p(r14)
            r1 = 0
            throw r1
        L_0x0790:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0795:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x079a:
            boolean r1 = r6.f201034n
            if (r1 == 0) goto L_0x07bb
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x07b6
            r4 = 2131832387(0x7f112e43, float:1.9297826E38)
            r1.setText(r4)
            android.widget.TextView r1 = r6.f201031h
            if (r1 == 0) goto L_0x07b1
            r4 = 0
            r1.setVisibility(r4)
            goto L_0x07d7
        L_0x07b1:
            gy3.C87412m.m108603p(r14)
            r1 = 0
            throw r1
        L_0x07b6:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x07bb:
            r1 = 0
            android.widget.TextView r4 = r6.f201031h
            if (r4 == 0) goto L_0x0be5
            java.lang.CharSequence r4 = r4.getText()
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r4)
            if (r4 == 0) goto L_0x07d7
            android.widget.TextView r4 = r6.f201031h
            if (r4 == 0) goto L_0x07d3
            r5 = 4
            r4.setVisibility(r5)
            goto L_0x07d7
        L_0x07d3:
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x07d7:
            android.content.Intent r1 = r6.getIntent()
            r4 = r24
            r5 = 0
            int r1 = r1.getIntExtra(r4, r5)
            if (r1 <= 0) goto L_0x081c
            android.app.Activity r4 = r6.getContext()
            r5 = 2131832509(0x7f112ebd, float:1.9298074E38)
            java.lang.String r4 = r4.getString(r5)
            java.lang.String r5 = "context.getString(R.stri…iew_envelope_btn_wording)"
            gy3.C87412m.m108593f(r4, r5)
            android.widget.TextView r5 = r6.f201033j
            if (r5 == 0) goto L_0x0817
            r26 = 0
            int r27 = r4.length()
            com.tencent.mm.wallet_core.ui.q r8 = new com.tencent.mm.wallet_core.ui.q
            com.tencent.mm.plugin.luckymoney.ui.m3 r14 = new com.tencent.mm.plugin.luckymoney.ui.m3
            r14.<init>(r6, r1)
            r1 = 1
            r8.<init>((com.tencent.p014mm.wallet_core.p137ui.C7092q.C7093a) r14, (boolean) r1)
            android.app.Activity r29 = r6.getContext()
            r24 = r5
            r25 = r4
            r28 = r8
            com.tencent.p014mm.wallet_core.p137ui.C75228t.m90253j0(r24, r25, r26, r27, r28, r29)
            goto L_0x081c
        L_0x0817:
            gy3.C87412m.m108603p(r15)
            r1 = 0
            throw r1
        L_0x081c:
            r1 = 0
            int r4 = r3.f228208o
            java.lang.String r5 = "tempLabelTv"
            r8 = 2
            if (r4 != r8) goto L_0x0832
            android.widget.TextView r4 = r6.f201032i
            if (r4 == 0) goto L_0x082e
            r8 = 0
            r4.setVisibility(r8)
            goto L_0x083b
        L_0x082e:
            gy3.C87412m.m108603p(r5)
            throw r1
        L_0x0832:
            android.widget.TextView r1 = r6.f201032i
            if (r1 == 0) goto L_0x0be0
            r4 = 8
            r1.setVisibility(r4)
        L_0x083b:
            android.widget.ImageView r1 = r6.mo95878c3()
            com.tencent.mm.plugin.luckymoney.ui.l3 r4 = new com.tencent.mm.plugin.luckymoney.ui.l3
            r4.<init>(r6)
            r5 = 25
            r1.postDelayed(r4, r5)
        L_0x0849:
            androidx.appcompat.app.AppCompatActivity r1 = r37.getContext()
            gy3.C87412m.m108593f(r1, r9)
            bl3.r$a r1 = r0.mo62444c(r1)
            r4 = r22
            androidx.lifecycle.i0 r1 = r1.mo75002a(r4)
            com.tencent.mm.plugin.luckymoney.ui.o3 r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69658o3) r1
            r1.getClass()
            androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
            r6 = 2131307948(0x7f092dac, float:1.8234138E38)
            android.view.View r5 = r5.findViewById(r6)
            java.lang.String r6 = "activity.findViewById(R.…ail_decoration_widget_iv)"
            gy3.C87412m.m108593f(r5, r6)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1.f201044e = r5
            r1.f201043d = r3
            te3.tf2 r5 = r3.f228203g
            if (r5 == 0) goto L_0x0915
            java.lang.String r5 = r3.f228202f
            boolean r5 = gy3.C87412m.m108589b(r13, r5)
            if (r5 == 0) goto L_0x0886
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            goto L_0x0915
        L_0x0886:
            te3.sf2 r5 = r1.f201043d
            if (r5 == 0) goto L_0x0910
            te3.tf2 r5 = r5.f228203g
            if (r5 == 0) goto L_0x090c
            java.lang.String r5 = r5.f228251o
            if (r5 == 0) goto L_0x089b
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0899
            goto L_0x089b
        L_0x0899:
            r5 = 0
            goto L_0x089c
        L_0x089b:
            r5 = 1
        L_0x089c:
            if (r5 == 0) goto L_0x089f
            goto L_0x090c
        L_0x089f:
            android.widget.ImageView r5 = r1.mo95885c3()
            r6 = 0
            r5.setVisibility(r6)
            android.widget.ImageView r5 = r1.mo95885c3()
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            gy3.C87412m.m108592e(r5, r12)
            android.widget.RelativeLayout$LayoutParams r5 = (android.widget.RelativeLayout.LayoutParams) r5
            androidx.appcompat.app.AppCompatActivity r6 = r1.getActivity()
            gy3.C87412m.m108592e(r6, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r6 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r6
            int r6 = r6.f200513n
            r5.width = r6
            androidx.appcompat.app.AppCompatActivity r6 = r1.getActivity()
            gy3.C87412m.m108592e(r6, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r6 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r6
            int r6 = r6.f200514o
            r5.height = r6
            android.widget.ImageView r6 = r1.mo95885c3()
            r6.setLayoutParams(r5)
            di3.d r2 = di3.C86312j.m106911c(r2)
            r24 = r2
            f32.b r24 = (f32.C75672b) r24
            android.widget.ImageView r25 = r1.mo95885c3()
            te3.sf2 r2 = r1.f201043d
            if (r2 == 0) goto L_0x0907
            r27 = 0
            androidx.appcompat.app.AppCompatActivity r5 = r1.getActivity()
            gy3.C87412m.m108592e(r5, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r5 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r5
            int r5 = r5.f200513n
            androidx.appcompat.app.AppCompatActivity r1 = r1.getActivity()
            gy3.C87412m.m108592e(r1, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r1
            int r1 = r1.f200514o
            r26 = r2
            r28 = r5
            r29 = r1
            r24.P30(r25, r26, r27, r28, r29)
            goto L_0x090c
        L_0x0907:
            gy3.C87412m.m108603p(r16)
            r1 = 0
            throw r1
        L_0x090c:
            r1 = 0
            rx3.b0 r2 = rx3.C13598b0.f38549a
            goto L_0x0915
        L_0x0910:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0915:
            androidx.appcompat.app.AppCompatActivity r1 = r37.getContext()
            gy3.C87412m.m108593f(r1, r9)
            bl3.r$a r1 = r0.mo62444c(r1)
            java.lang.Class<com.tencent.mm.plugin.luckymoney.ui.k3> r2 = com.tencent.p014mm.plugin.luckymoney.p073ui.C69626k3.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            com.tencent.mm.plugin.luckymoney.ui.k3 r1 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69626k3) r1
            r1.getClass()
            androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
            r5 = 2131307945(0x7f092da9, float:1.8234132E38)
            android.view.View r2 = r2.findViewById(r5)
            java.lang.String r5 = "activity.findViewById(R.…il_decoration_pag_layout)"
            gy3.C87412m.m108593f(r2, r5)
            r1.f200989e = r2
            androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
            r5 = 2131307944(0x7f092da8, float:1.823413E38)
            android.view.View r2 = r2.findViewById(r5)
            java.lang.String r5 = "activity.findViewById(R.…detail_decoration_pag_iv)"
            gy3.C87412m.m108593f(r2, r5)
            com.tencent.mm.chatting.component.ListScrollPAGView r2 = (com.tencent.p014mm.chatting.component.ListScrollPAGView) r2
            r1.f200990f = r2
            androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
            r5 = 2131307950(0x7f092dae, float:1.8234142E38)
            android.view.View r2 = r2.findViewById(r5)
            java.lang.String r5 = "activity.findViewById(R.…ration_widget_pag_layout)"
            gy3.C87412m.m108593f(r2, r5)
            r1.f200991g = r2
            androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
            r5 = 2131307949(0x7f092dad, float:1.823414E38)
            android.view.View r2 = r2.findViewById(r5)
            java.lang.String r5 = "activity.findViewById(R.…decoration_widget_pag_iv)"
            gy3.C87412m.m108593f(r2, r5)
            com.tencent.mm.chatting.component.ListScrollPAGView r2 = (com.tencent.p014mm.chatting.component.ListScrollPAGView) r2
            r1.f200992h = r2
            r1.f200988d = r3
            te3.tf2 r2 = r3.f228203g
            if (r2 == 0) goto L_0x0bdf
            java.lang.String r2 = r3.f228202f
            boolean r2 = gy3.C87412m.m108589b(r13, r2)
            if (r2 == 0) goto L_0x098a
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            goto L_0x0bdf
        L_0x098a:
            androidx.appcompat.app.AppCompatActivity r2 = r1.getActivity()
            gy3.C87412m.m108592e(r2, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r2 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r2
            boolean r2 = r2.f200506d
            if (r2 != 0) goto L_0x0bdd
            te3.sf2 r2 = r1.f200988d
            if (r2 == 0) goto L_0x0bd8
            te3.tf2 r2 = r2.f228203g
            if (r2 == 0) goto L_0x0bdd
            java.lang.String r2 = r2.f228260x
            if (r2 == 0) goto L_0x09ac
            int r2 = r2.length()
            if (r2 != 0) goto L_0x09aa
            goto L_0x09ac
        L_0x09aa:
            r2 = 0
            goto L_0x09ad
        L_0x09ac:
            r2 = 1
        L_0x09ad:
            if (r2 == 0) goto L_0x09b1
            goto L_0x0bdd
        L_0x09b1:
            r2 = 1
            r3 = 0
            a14.w r5 = a14.C53959v2.m60598a(r3, r2, r3)
            a14.h0 r2 = a14.C53872d1.f151117a
            a14.k2 r2 = f14.C58901s.f168555a
            a14.f2 r5 = (a14.C53884f2) r5
            wx3.f r2 = r5.plus(r2)
            a14.m0 r3 = new a14.m0
            java.lang.String r5 = "WalletPagDownloadScope"
            r3.<init>(r5)
            wx3.f r2 = r2.plus(r3)
            a14.n0 r2 = a14.C53930o0.m60554a(r2)
            r1.f200993i = r2
            te3.sf2 r2 = r1.f200988d
            if (r2 == 0) goto L_0x0bd3
            te3.tf2 r2 = r2.f228203g
            int r2 = r2.f228242D
            androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
            bl3.r$a r3 = r0.mo62444c(r3)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            com.tencent.mm.plugin.luckymoney.ui.o3 r3 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69658o3) r3
            android.widget.ImageView r3 = r3.mo95885c3()
            androidx.appcompat.app.AppCompatActivity r4 = r1.getActivity()
            bl3.r$a r0 = r0.mo62444c(r4)
            r4 = r23
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            com.tencent.mm.plugin.luckymoney.ui.g3 r0 = (com.tencent.p014mm.plugin.luckymoney.p073ui.C69597g3) r0
            android.widget.ImageView r0 = r0.f200927p
            if (r0 == 0) goto L_0x0bce
            com.tencent.mm.plugin.luckymoney.ui.h3 r4 = new com.tencent.mm.plugin.luckymoney.ui.h3
            r4.<init>(r2, r1, r0, r3)
            r1.f200994j = r4
            com.tencent.mm.chatting.component.ListScrollPAGView r0 = r1.f200990f
            java.lang.String r3 = "pagView"
            if (r0 == 0) goto L_0x0bc9
            r0.mo21212d(r4)
            com.tencent.mm.chatting.component.ListScrollPAGView r0 = r1.f200990f
            if (r0 == 0) goto L_0x0bc4
            r4 = 0
            r0.setRepeatCount(r4)
            com.tencent.mm.chatting.component.ListScrollPAGView r0 = r1.f200990f
            if (r0 == 0) goto L_0x0bbf
            r4 = 3
            r0.setScaleMode(r4)
            com.tencent.mm.chatting.component.ListScrollPAGView r0 = r1.f200992h
            java.lang.String r3 = "pagWidgetView"
            if (r0 == 0) goto L_0x0bba
            com.tencent.mm.chatting.component.ListScrollPAGView$h r4 = r1.f200994j
            if (r4 == 0) goto L_0x0bb3
            r0.mo21212d(r4)
            com.tencent.mm.chatting.component.ListScrollPAGView r0 = r1.f200992h
            if (r0 == 0) goto L_0x0bae
            r4 = 0
            r0.setRepeatCount(r4)
            com.tencent.mm.chatting.component.ListScrollPAGView r0 = r1.f200992h
            if (r0 == 0) goto L_0x0ba9
            r4 = 3
            r0.setScaleMode(r4)
            java.lang.String r0 = "mPagDownloadScope"
            java.lang.String r3 = "pagWidgetLl"
            java.lang.String r4 = "pagLl"
            r5 = 2
            if (r2 != r5) goto L_0x0ae8
            android.view.View r2 = r1.f200989e
            if (r2 == 0) goto L_0x0ae3
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r6)
            java.lang.Object[] r23 = r5.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC"
            java.lang.String r25 = "renderEnvelopeDynamic"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r2
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r2.setVisibility(r5)
            java.lang.String r23 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC"
            java.lang.String r24 = "renderEnvelopeDynamic"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.view.View r2 = r1.f200991g
            if (r2 == 0) goto L_0x0ade
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            gy3.C87412m.m108592e(r2, r12)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
            gy3.C87412m.m108592e(r3, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r3 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r3
            int r3 = r3.f200513n
            r2.width = r3
            androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
            gy3.C87412m.m108592e(r3, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r3 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r3
            int r3 = r3.f200514o
            r2.height = r3
            android.view.View r3 = r1.f200989e
            if (r3 == 0) goto L_0x0ad9
            r3.setLayoutParams(r2)
            com.tencent.mm.plugin.luckymoney.model.d0 r2 = com.tencent.p014mm.plugin.luckymoney.model.C69198d0.f199107a
            te3.sf2 r3 = r1.f200988d
            if (r3 == 0) goto L_0x0ad4
            a14.n0 r4 = r1.f200993i
            if (r4 == 0) goto L_0x0acf
            com.tencent.mm.plugin.luckymoney.ui.i3 r0 = new com.tencent.mm.plugin.luckymoney.ui.i3
            r0.<init>(r1)
            r1 = 1
            r2.mo95352b(r3, r1, r4, r0)
            goto L_0x0bdd
        L_0x0acf:
            gy3.C87412m.m108603p(r0)
            r1 = 0
            throw r1
        L_0x0ad4:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0ad9:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0ade:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0ae3:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0ae8:
            android.view.View r2 = r1.f200991g
            if (r2 == 0) goto L_0x0ba4
            k20.a r3 = new k20.a
            r3.<init>()
            java.lang.ThreadLocal<k20.a> r5 = k20.C60958c.f173611a
            r5 = 8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r6)
            java.lang.Object[] r23 = r3.mo10232b()
            java.lang.String r24 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC"
            java.lang.String r25 = "renderEnvelopeDynamic"
            java.lang.String r26 = "()V"
            java.lang.String r27 = "android/view/View_EXEC_"
            java.lang.String r28 = "setVisibility"
            java.lang.String r29 = "(I)V"
            r22 = r2
            j20.C117292a.m165358d(r22, r23, r24, r25, r26, r27, r28, r29)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r23 = "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeItemDetailDecorationEnvelopeDynamicUIC"
            java.lang.String r24 = "renderEnvelopeDynamic"
            java.lang.String r25 = "()V"
            java.lang.String r26 = "android/view/View_EXEC_"
            java.lang.String r27 = "setVisibility"
            java.lang.String r28 = "(I)V"
            j20.C117292a.m165359e(r22, r23, r24, r25, r26, r27, r28)
            android.view.View r2 = r1.f200989e
            if (r2 == 0) goto L_0x0b9f
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 8
            int r3 = kg3.C76577a.m92151b(r3, r5)
            float r3 = (float) r3
            zo3.a r5 = new zo3.a
            r6 = 1
            r5.<init>(r6, r6, r3)
            r2.setOutlineProvider(r5)
            r2.setClipToOutline(r6)
            android.view.View r2 = r1.f200989e
            if (r2 == 0) goto L_0x0b9a
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            gy3.C87412m.m108592e(r2, r12)
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
            gy3.C87412m.m108592e(r3, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r3 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r3
            int r3 = r3.f200510h
            r2.width = r3
            androidx.appcompat.app.AppCompatActivity r3 = r1.getActivity()
            gy3.C87412m.m108592e(r3, r7)
            com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeItemDetailUINew r3 = (com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew) r3
            int r3 = r3.f200511i
            r2.height = r3
            android.view.View r3 = r1.f200989e
            if (r3 == 0) goto L_0x0b95
            r3.setLayoutParams(r2)
            com.tencent.mm.plugin.luckymoney.model.d0 r2 = com.tencent.p014mm.plugin.luckymoney.model.C69198d0.f199107a
            te3.sf2 r3 = r1.f200988d
            if (r3 == 0) goto L_0x0b90
            a14.n0 r4 = r1.f200993i
            if (r4 == 0) goto L_0x0b8b
            com.tencent.mm.plugin.luckymoney.ui.j3 r0 = new com.tencent.mm.plugin.luckymoney.ui.j3
            r0.<init>(r1)
            r1 = 1
            r2.mo95352b(r3, r1, r4, r0)
            goto L_0x0bdd
        L_0x0b8b:
            gy3.C87412m.m108603p(r0)
            r1 = 0
            throw r1
        L_0x0b90:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0b95:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0b9a:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0b9f:
            r1 = 0
            gy3.C87412m.m108603p(r4)
            throw r1
        L_0x0ba4:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0ba9:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0bae:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0bb3:
            r1 = 0
            java.lang.String r0 = "mPAGViewListener"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0bba:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0bbf:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0bc4:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0bc9:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0bce:
            r1 = 0
            gy3.C87412m.m108603p(r20)
            throw r1
        L_0x0bd3:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0bd8:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0bdd:
            rx3.b0 r0 = rx3.C13598b0.f38549a
        L_0x0bdf:
            return
        L_0x0be0:
            r1 = 0
            gy3.C87412m.m108603p(r5)
            throw r1
        L_0x0be5:
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0be9:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0bee:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0bf3:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0bf8:
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0bfc:
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0c00:
            r1 = 0
            gy3.C87412m.m108603p(r16)
            throw r1
        L_0x0c05:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x0c0a:
            r21 = r8
            r1 = 0
            gy3.C87412m.m108603p(r21)
            throw r1
        L_0x0c11:
            r21 = r8
            r1 = 0
            gy3.C87412m.m108603p(r21)
            throw r1
        L_0x0c18:
            return
        L_0x0c19:
            r1 = 0
            java.lang.String r0 = "containerView"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0c20:
            r1 = 0
            gy3.C87412m.m108603p(r28)
            throw r1
        L_0x0c25:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x0c2a:
            r1 = 0
            gy3.C87412m.m108603p(r28)
            throw r1
        L_0x0c2f:
            r1 = 0
            gy3.C87412m.m108603p(r28)
            throw r1
        L_0x0c34:
            r1 = r5
            gy3.C87412m.m108603p(r28)
            throw r1
        L_0x0c39:
            r1 = 0
            gy3.C87412m.m108603p(r28)
            throw r1
        L_0x0c3e:
            r1 = 0
            gy3.C87412m.m108603p(r15)
            throw r1
        L_0x0c43:
            r1 = 0
            java.lang.String r0 = "closeBtn"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0c4a:
            r26 = r5
            r1 = 0
            gy3.C87412m.m108603p(r26)
            throw r1
        L_0x0c51:
            r27 = r6
            r1 = 0
            gy3.C87412m.m108603p(r27)
            throw r1
        L_0x0c58:
            r27 = r6
            r1 = 0
            gy3.C87412m.m108603p(r27)
            throw r1
        L_0x0c5f:
            r1 = 0
            java.lang.String r0 = "avatarIv"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0c66:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x0c6b:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x0c70:
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x0c75:
            r19 = r15
            r1 = 0
            gy3.C87412m.m108603p(r19)
            throw r1
        L_0x0c7c:
            r25 = r14
            r1 = 0
            gy3.C87412m.m108603p(r25)
            throw r1
        L_0x0c83:
            r25 = r14
            r1 = 0
            gy3.C87412m.m108603p(r25)
            throw r1
        L_0x0c8a:
            r20 = r11
            r1 = 0
            gy3.C87412m.m108603p(r20)
            throw r1
        L_0x0c91:
            r20 = r11
            r1 = 0
            gy3.C87412m.m108603p(r20)
            throw r1
        L_0x0c98:
            r1 = 0
            java.lang.String r0 = "decorationContainer"
            gy3.C87412m.m108603p(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.luckymoney.p073ui.LuckyMoneyPickEnvelopeItemDetailUINew.onCreate(android.os.Bundle):void");
    }
}

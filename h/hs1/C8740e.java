package hs1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import gy3.C87412m;
import qo3.C12925w;

/* renamed from: hs1.e */
public final class C8740e extends FrameLayout {

    /* renamed from: d */
    public ViewGroup f28006d;

    /* renamed from: e */
    public View f28007e;

    /* renamed from: f */
    public View f28008f;

    /* renamed from: g */
    public ImageView f28009g;

    /* renamed from: h */
    public TextView f28010h;

    /* renamed from: i */
    public ImageView f28011i;

    /* renamed from: j */
    public TextView f28012j;

    /* renamed from: n */
    public TextView f28013n;

    /* renamed from: o */
    public LinearLayout f28014o;

    /* renamed from: p */
    public TextView f28015p;

    /* renamed from: q */
    public TextView f28016q;

    /* renamed from: r */
    public WeImageView f28017r;

    /* renamed from: s */
    public WeImageView f28018s;

    /* renamed from: t */
    public C12925w f28019t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8740e(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    /* JADX WARNING: Removed duplicated region for block: B:135:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0172  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x017a  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0182  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9569a(java.lang.String r13, te3.C49098d51 r14) {
        /*
            r12 = this;
            java.lang.Class<pl1.s0> r0 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r1 = ht1.C60200t1.class
            java.lang.String r2 = "username"
            gy3.C87412m.m108594g(r13, r2)
            java.lang.String r2 = "noticeInfo"
            gy3.C87412m.m108594g(r14, r2)
            fe1.d$b r2 = fe1.C58961d.f168673a
            fe1.q r13 = r2.mo84155b(r13)
            r2 = 0
            r3 = 1
            r4 = 0
            if (r13 == 0) goto L_0x0098
            java.lang.String r5 = r13.getUsername()
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x0026
            r5 = 1
            goto L_0x0027
        L_0x0026:
            r5 = 0
        L_0x0027:
            if (r5 == 0) goto L_0x002a
            goto L_0x002b
        L_0x002a:
            r13 = r2
        L_0x002b:
            if (r13 == 0) goto L_0x0098
            android.widget.ImageView r5 = r12.f28009g
            if (r5 == 0) goto L_0x0060
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r6 = r6.mo62446e(r1)
            bl3.c r6 = r6.mo62447c(r0)
            pl1.s0 r6 = (pl1.C11990s0) r6
            k60.d r6 = r6.mo11872i2()
            pl1.f r7 = new pl1.f
            java.lang.String r8 = r13.getAvatarUrl()
            r9 = 2
            r7.<init>(r8, r2, r9, r2)
            pl1.e0$a r8 = pl1.C11978e0.C11979a.AVATAR
            bl3.r r9 = bl3.C39818r.f106831a
            bl3.r$a r1 = r9.mo62446e(r1)
            bl3.c r0 = r1.mo62447c(r0)
            pl1.s0 r0 = (pl1.C11990s0) r0
            n60.f r0 = r0.mo11867O2(r8)
            r6.mo85957c(r7, r5, r0)
        L_0x0060:
            android.widget.TextView r0 = r12.f28010h
            if (r0 != 0) goto L_0x0065
            goto L_0x007c
        L_0x0065:
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.content.Context r5 = r12.getContext()
            java.lang.String r6 = r13.getNickname()
            android.text.SpannableString r1 = r1.mo107057T1(r5, r6)
            r0.setText(r1)
        L_0x007c:
            android.widget.ImageView r6 = r12.f28011i
            if (r6 == 0) goto L_0x0098
            java.lang.Class<tf0.p1> r0 = tf0.C64916p1.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r1 = "getService(IFinderCommon…atureService::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r5 = r0
            tf0.p1 r5 = (tf0.C64916p1) r5
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r7 = r13.field_authInfo
            r8 = 0
            r9 = 0
            r10 = 12
            r11 = 0
            tf0.C64916p1.C64917a.m76444k(r5, r6, r7, r8, r9, r10, r11)
        L_0x0098:
            java.lang.String r13 = r14.f132122h
            if (r13 == 0) goto L_0x00a9
            int r13 = r13.length()
            if (r13 <= 0) goto L_0x00a4
            r13 = 1
            goto L_0x00a5
        L_0x00a4:
            r13 = 0
        L_0x00a5:
            if (r13 != r3) goto L_0x00a9
            r13 = 1
            goto L_0x00aa
        L_0x00a9:
            r13 = 0
        L_0x00aa:
            if (r13 == 0) goto L_0x00ae
            r13 = r14
            goto L_0x00af
        L_0x00ae:
            r13 = r2
        L_0x00af:
            r0 = 8
            if (r13 == 0) goto L_0x0122
            android.content.Context r1 = r12.getContext()
            android.content.res.Resources r1 = r1.getResources()
            te3.nc3 r5 = r13.f132128q
            if (r5 == 0) goto L_0x00c5
            boolean r5 = r5.f138532d
            if (r5 != r3) goto L_0x00c5
            r5 = 1
            goto L_0x00c6
        L_0x00c5:
            r5 = 0
        L_0x00c6:
            if (r5 == 0) goto L_0x00cc
            r5 = 2131828218(0x7f111dfa, float:1.928937E38)
            goto L_0x00cf
        L_0x00cc:
            r5 = 2131828217(0x7f111df9, float:1.9289369E38)
        L_0x00cf:
            java.lang.Object[] r6 = new java.lang.Object[r3]
            er1.j4 r7 = er1.C58739j4.f168176a
            int r8 = r13.f132118d
            long r8 = (long) r8
            r10 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r10
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            java.lang.String r7 = r7.mo83723t(r8, r10, r4)
            r6[r4] = r7
            java.lang.String r1 = r1.getString(r5, r6)
            java.lang.String r5 = "context.resources.getStr…          )\n            )"
            gy3.C87412m.m108593f(r1, r5)
            java.lang.String r5 = r13.f132121g
            if (r5 == 0) goto L_0x00fc
            int r5 = r5.length()
            if (r5 <= 0) goto L_0x00f7
            r5 = 1
            goto L_0x00f8
        L_0x00f7:
            r5 = 0
        L_0x00f8:
            if (r5 != r3) goto L_0x00fc
            r5 = 1
            goto L_0x00fd
        L_0x00fc:
            r5 = 0
        L_0x00fd:
            if (r5 == 0) goto L_0x0112
            android.widget.TextView r5 = r12.f28012j
            if (r5 != 0) goto L_0x0104
            goto L_0x0109
        L_0x0104:
            java.lang.String r13 = r13.f132121g
            r5.setText(r13)
        L_0x0109:
            android.widget.TextView r13 = r12.f28013n
            if (r13 != 0) goto L_0x010e
            goto L_0x0122
        L_0x010e:
            r13.setText(r1)
            goto L_0x0122
        L_0x0112:
            android.widget.TextView r13 = r12.f28012j
            if (r13 != 0) goto L_0x0117
            goto L_0x011a
        L_0x0117:
            r13.setText(r1)
        L_0x011a:
            android.widget.TextView r13 = r12.f28013n
            if (r13 != 0) goto L_0x011f
            goto L_0x0122
        L_0x011f:
            r13.setVisibility(r0)
        L_0x0122:
            int r13 = r14.f132119e
            if (r13 != 0) goto L_0x0128
            r13 = 1
            goto L_0x0129
        L_0x0128:
            r13 = 0
        L_0x0129:
            te3.nc3 r14 = r14.f132128q
            if (r14 == 0) goto L_0x0133
            boolean r1 = r14.f138532d
            if (r1 != r3) goto L_0x0133
            r1 = 1
            goto L_0x0134
        L_0x0133:
            r1 = 0
        L_0x0134:
            if (r14 == 0) goto L_0x0139
            int r5 = r14.f138533e
            goto L_0x013a
        L_0x0139:
            r5 = 0
        L_0x013a:
            if (r14 == 0) goto L_0x013f
            boolean r14 = r14.f138534f
            goto L_0x0140
        L_0x013f:
            r14 = 0
        L_0x0140:
            android.widget.TextView r6 = r12.f28016q
            if (r6 == 0) goto L_0x0156
            android.content.Context r7 = r12.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            int r7 = r7.getColor(r8)
            r6.setTextColor(r7)
        L_0x0156:
            android.widget.LinearLayout r6 = r12.f28014o
            r7 = 2131232532(0x7f080714, float:1.8081176E38)
            if (r6 != 0) goto L_0x015e
            goto L_0x016d
        L_0x015e:
            android.content.Context r8 = r12.getContext()
            android.content.res.Resources r8 = r8.getResources()
            android.graphics.drawable.Drawable r8 = r8.getDrawable(r7)
            r6.setBackground(r8)
        L_0x016d:
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r12.f28017r
            if (r6 != 0) goto L_0x0172
            goto L_0x0175
        L_0x0172:
            r6.setVisibility(r0)
        L_0x0175:
            com.tencent.mm.ui.widget.imageview.WeImageView r6 = r12.f28018s
            if (r6 != 0) goto L_0x017a
            goto L_0x017d
        L_0x017a:
            r6.setVisibility(r0)
        L_0x017d:
            android.widget.TextView r6 = r12.f28015p
            if (r6 != 0) goto L_0x0182
            goto L_0x0185
        L_0x0182:
            r6.setVisibility(r0)
        L_0x0185:
            if (r1 == 0) goto L_0x0216
            if (r5 == 0) goto L_0x0216
            if (r14 == 0) goto L_0x01d5
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 == 0) goto L_0x0192
            r13.setBackgroundResource(r7)
        L_0x0192:
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 != 0) goto L_0x0197
            goto L_0x019a
        L_0x0197:
            r13.setEnabled(r4)
        L_0x019a:
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 != 0) goto L_0x019f
            goto L_0x01a2
        L_0x019f:
            r13.setBackground(r2)
        L_0x01a2:
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = r12.f28017r
            if (r13 != 0) goto L_0x01a7
            goto L_0x01aa
        L_0x01a7:
            r13.setVisibility(r4)
        L_0x01aa:
            android.widget.TextView r13 = r12.f28016q
            if (r13 != 0) goto L_0x01af
            goto L_0x01bd
        L_0x01af:
            android.content.res.Resources r14 = r12.getResources()
            r0 = 2131826410(0x7f1116ea, float:1.9285704E38)
            java.lang.String r14 = r14.getString(r0)
            r13.setText(r14)
        L_0x01bd:
            android.widget.TextView r13 = r12.f28016q
            if (r13 == 0) goto L_0x028a
            android.content.Context r14 = r12.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r0 = 2131099919(0x7f06010f, float:1.7812205E38)
            int r14 = r14.getColor(r0)
            r13.setTextColor(r14)
            goto L_0x028a
        L_0x01d5:
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = r12.f28018s
            if (r13 != 0) goto L_0x01da
            goto L_0x01dd
        L_0x01da:
            r13.setVisibility(r4)
        L_0x01dd:
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 == 0) goto L_0x01e4
            r13.setBackgroundResource(r7)
        L_0x01e4:
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 != 0) goto L_0x01e9
            goto L_0x01ec
        L_0x01e9:
            r13.setEnabled(r3)
        L_0x01ec:
            android.widget.TextView r13 = r12.f28015p
            if (r13 != 0) goto L_0x01f1
            goto L_0x01f4
        L_0x01f1:
            r13.setVisibility(r4)
        L_0x01f4:
            android.widget.TextView r13 = r12.f28015p
            if (r13 != 0) goto L_0x01f9
            goto L_0x0200
        L_0x01f9:
            java.lang.String r14 = java.lang.String.valueOf(r5)
            r13.setText(r14)
        L_0x0200:
            android.widget.TextView r13 = r12.f28016q
            if (r13 != 0) goto L_0x0206
            goto L_0x028a
        L_0x0206:
            android.content.res.Resources r14 = r12.getResources()
            r0 = 2131829328(0x7f112250, float:1.9291622E38)
            java.lang.String r14 = r14.getString(r0)
            r13.setText(r14)
            goto L_0x028a
        L_0x0216:
            android.widget.LinearLayout r14 = r12.f28014o
            if (r14 != 0) goto L_0x021b
            goto L_0x021e
        L_0x021b:
            r14.setEnabled(r3)
        L_0x021e:
            if (r13 == 0) goto L_0x0270
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 == 0) goto L_0x022a
            r14 = 2131232536(0x7f080718, float:1.8081184E38)
            r13.setBackgroundResource(r14)
        L_0x022a:
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = r12.f28017r
            if (r13 != 0) goto L_0x022f
            goto L_0x0232
        L_0x022f:
            r13.setVisibility(r4)
        L_0x0232:
            com.tencent.mm.ui.widget.imageview.WeImageView r13 = r12.f28017r
            r14 = 2131099924(0x7f060114, float:1.7812215E38)
            if (r13 != 0) goto L_0x023a
            goto L_0x0249
        L_0x023a:
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r14)
            r13.setIconColor(r0)
        L_0x0249:
            android.widget.TextView r13 = r12.f28016q
            if (r13 != 0) goto L_0x024e
            goto L_0x025c
        L_0x024e:
            android.content.res.Resources r0 = r12.getResources()
            r1 = 2131826409(0x7f1116e9, float:1.9285702E38)
            java.lang.String r0 = r0.getString(r1)
            r13.setText(r0)
        L_0x025c:
            android.widget.TextView r13 = r12.f28016q
            if (r13 == 0) goto L_0x028a
            android.content.Context r0 = r12.getContext()
            android.content.res.Resources r0 = r0.getResources()
            int r14 = r0.getColor(r14)
            r13.setTextColor(r14)
            goto L_0x028a
        L_0x0270:
            android.widget.LinearLayout r13 = r12.f28014o
            if (r13 == 0) goto L_0x0277
            r13.setBackgroundResource(r7)
        L_0x0277:
            android.widget.TextView r13 = r12.f28016q
            if (r13 != 0) goto L_0x027c
            goto L_0x028a
        L_0x027c:
            android.content.res.Resources r14 = r12.getResources()
            r0 = 2131829610(0x7f11236a, float:1.9292194E38)
            java.lang.String r14 = r14.getString(r0)
            r13.setText(r14)
        L_0x028a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hs1.C8740e.mo9569a(java.lang.String, te3.d51):void");
    }

    /* JADX WARNING: type inference failed for: r1v30, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9570b(java.lang.String r6, fy3.C32224a<? extends te3.C49098d51> r7, fy3.C32224a<rx3.C13598b0> r8) {
        /*
            r5 = this;
            java.lang.String r0 = "username"
            gy3.C87412m.m108594g(r6, r0)
            java.lang.String r0 = "getNoticeInfo"
            gy3.C87412m.m108594g(r7, r0)
            java.lang.String r0 = "callbackToNext"
            gy3.C87412m.m108594g(r8, r0)
            java.lang.String r0 = "FinderLiveNoticeBigCardWidget"
            java.lang.String r1 = "#show"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r1)
            qo3.w r0 = new qo3.w
            android.content.Context r1 = r5.getContext()
            r0.<init>(r1)
            java.lang.Object r7 = r7.invoke()
            te3.d51 r7 = (te3.C49098d51) r7
            android.content.Context r1 = r5.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 2131496905(0x7f0c0fc9, float:1.8617388E38)
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r5, r3)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r5.f28006d = r1
            r2 = 0
            if (r1 == 0) goto L_0x004f
            r3 = 2131306711(0x7f0928d7, float:1.8231629E38)
            android.view.View r1 = r1.findViewById(r3)
            if (r1 == 0) goto L_0x004f
            hs1.b r3 = new hs1.b
            r3.<init>(r5)
            r1.setOnClickListener(r3)
            goto L_0x0050
        L_0x004f:
            r1 = r2
        L_0x0050:
            r5.f28007e = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x005e
            r3 = 2131307878(0x7f092d66, float:1.8233996E38)
            android.view.View r1 = r1.findViewById(r3)
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            r5.f28008f = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x006f
            r3 = 2131304029(0x7f091e5d, float:1.822619E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            r5.f28009g = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x0080
            r3 = 2131304050(0x7f091e72, float:1.8226232E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x0081
        L_0x0080:
            r1 = r2
        L_0x0081:
            r5.f28010h = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x0091
            r3 = 2131304028(0x7f091e5c, float:1.8226187E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            goto L_0x0092
        L_0x0091:
            r1 = r2
        L_0x0092:
            r5.f28011i = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x00a2
            r3 = 2131304036(0x7f091e64, float:1.8226203E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x00a3
        L_0x00a2:
            r1 = r2
        L_0x00a3:
            r5.f28012j = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x00b3
            r3 = 2131304057(0x7f091e79, float:1.8226246E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x00b4
        L_0x00b3:
            r1 = r2
        L_0x00b4:
            r5.f28013n = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x00c4
            r3 = 2131310255(0x7f0936af, float:1.8238817E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            goto L_0x00c5
        L_0x00c4:
            r1 = r2
        L_0x00c5:
            r5.f28014o = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x00d5
            r3 = 2131310257(0x7f0936b1, float:1.823882E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            goto L_0x00d6
        L_0x00d5:
            r1 = r2
        L_0x00d6:
            r5.f28016q = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x00ee
            r3 = 2131310256(0x7f0936b0, float:1.8238819E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L_0x00ee
            er1.j4 r3 = er1.C58739j4.f168176a
            r4 = 1
            r3.mo83703c0(r1, r4)
            goto L_0x00ef
        L_0x00ee:
            r1 = r2
        L_0x00ef:
            r5.f28015p = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x00ff
            r3 = 2131310253(0x7f0936ad, float:1.8238813E38)
            android.view.View r1 = r1.findViewById(r3)
            com.tencent.mm.ui.widget.imageview.WeImageView r1 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r1
            goto L_0x0100
        L_0x00ff:
            r1 = r2
        L_0x0100:
            r5.f28017r = r1
            android.view.ViewGroup r1 = r5.f28006d
            if (r1 == 0) goto L_0x0110
            r2 = 2131310254(0x7f0936ae, float:1.8238815E38)
            android.view.View r1 = r1.findViewById(r2)
            r2 = r1
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r2
        L_0x0110:
            r5.f28018s = r2
            android.view.View r1 = r5.f28008f
            if (r1 == 0) goto L_0x011e
            hs1.c r2 = new hs1.c
            r2.<init>(r6, r5)
            r1.setOnClickListener(r2)
        L_0x011e:
            android.widget.LinearLayout r1 = r5.f28014o
            if (r1 == 0) goto L_0x012a
            hs1.d r2 = new hs1.d
            r2.<init>(r8)
            r1.setOnClickListener(r2)
        L_0x012a:
            r5.mo9569a(r6, r7)
            android.view.ViewGroup r6 = r5.f28006d
            r0.mo12471k(r6)
            android.view.ViewGroup r6 = r0.f36921B
            r7 = 2131235390(0x7f08123e, float:1.8086973E38)
            r6.setBackgroundResource(r7)
            r0.mo5086o()
            r5.f28019t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hs1.C8740e.mo9570b(java.lang.String, fy3.a, fy3.a):void");
    }
}

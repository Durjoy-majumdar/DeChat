package sj1;

import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cj1.C54741c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import jq3.C60896i;
import jq3.C60905o;
import org.libpag.PAGView;

/* renamed from: sj1.h */
public final class C63914h extends C60896i<C54741c> {

    /* renamed from: f */
    public static ValueAnimator f181160f;

    /* renamed from: e */
    public final String f181161e = "PromoteBannerNormalConvert";

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.d4d;
    }

    /* JADX WARNING: type inference failed for: r8v35, types: [up1.y, gy3.h] */
    /* JADX WARNING: type inference failed for: r8v37 */
    /* JADX WARNING: type inference failed for: r8v38 */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x03dd  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0437  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x048f  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0492  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0499 A[SYNTHETIC, Splitter:B:140:0x0499] */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x055a  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0563  */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0568  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x056b  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0575  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0577  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x057c  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x05b3  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x05b5  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x05b8  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0630  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r35, jq3.C9493c r36, int r37, int r38, boolean r39, java.util.List r40) {
        /*
            r34 = this;
            r1 = r34
            r2 = r35
            r3 = r40
            r4 = r36
            cj1.c r4 = (cj1.C54741c) r4
            pl1.e0$a r5 = pl1.C11978e0.C11979a.DEFAULT
            java.lang.Class<ht1.t1> r6 = ht1.C60200t1.class
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.String r0 = "holder"
            gy3.C87412m.m108594g(r2, r0)
            java.lang.String r0 = "item"
            gy3.C87412m.m108594g(r4, r0)
            java.lang.String r0 = r1.f181161e
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "onBind, pos: "
            r8.append(r9)
            r9 = r37
            r8.append(r9)
            java.lang.String r9 = " type:"
            r8.append(r9)
            r9 = r38
            r8.append(r9)
            java.lang.String r9 = " scopeHash: "
            r8.append(r9)
            a14.n0 r9 = r2.f29679z
            if (r9 == 0) goto L_0x0047
            int r9 = r9.hashCode()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x0048
        L_0x0047:
            r9 = 0
        L_0x0048:
            r8.append(r9)
            java.lang.String r9 = ", payload: "
            r8.append(r9)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r8)
            android.view.View r0 = r2.f44854d
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r8 = "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams"
            gy3.C87412m.m108592e(r0, r8)
            android.content.Context r8 = r2.f173499A
            int r9 = fh1.C59018f2.f168860S
            int r8 = kg3.C76577a.m92151b(r8, r9)
            r0.width = r8
            android.content.Context r8 = r2.f173499A
            int r9 = fh1.C59018f2.f168858Q
            int r8 = kg3.C76577a.m92151b(r8, r9)
            r0.height = r8
            android.view.View r8 = r2.f44854d
            r8.setLayoutParams(r0)
            android.view.View r0 = r2.f44854d
            r8 = 2131310337(0x7f093701, float:1.8238983E38)
            android.view.View r0 = r0.findViewById(r8)
            java.lang.String r8 = "null cannot be cast to non-null type android.widget.FrameLayout"
            gy3.C87412m.m108592e(r0, r8)
            r9 = r0
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            android.view.View r0 = r2.f44854d
            r11 = 2131304174(0x7f091eee, float:1.8226483E38)
            android.view.View r0 = r0.findViewById(r11)
            java.lang.String r11 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            gy3.C87412m.m108592e(r0, r11)
            r11 = r0
            androidx.constraintlayout.widget.ConstraintLayout r11 = (androidx.constraintlayout.widget.ConstraintLayout) r11
            android.view.View r0 = r2.f44854d
            r12 = 2131304176(0x7f091ef0, float:1.8226487E38)
            android.view.View r0 = r0.findViewById(r12)
            java.lang.String r12 = "null cannot be cast to non-null type android.widget.TextView"
            gy3.C87412m.m108592e(r0, r12)
            r13 = r0
            android.widget.TextView r13 = (android.widget.TextView) r13
            android.content.Context r0 = r2.f173499A
            r14 = 12
            int r0 = kg3.C76577a.m92151b(r0, r14)
            float r0 = (float) r0
            r15 = 0
            r13.setTextSize(r15, r0)
            cj1.d r0 = cj1.C54745d.f153453a
            te3.dw0 r14 = r4.f153444h
            if (r14 == 0) goto L_0x00c7
            java.lang.String r14 = r14.f182882j
            goto L_0x00c8
        L_0x00c7:
            r14 = 0
        L_0x00c8:
            android.content.Context r10 = r2.f173499A
            android.content.res.Resources r10 = r10.getResources()
            r15 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r10 = r10.getColor(r15)
            int r10 = r0.mo75641a(r14, r10)
            r13.setTextColor(r10)
            android.view.View r10 = r2.f44854d
            r14 = 2131304168(0x7f091ee8, float:1.822647E38)
            android.view.View r10 = r10.findViewById(r14)
            gy3.C87412m.m108592e(r10, r12)
            android.widget.TextView r10 = (android.widget.TextView) r10
            android.content.Context r12 = r2.f173499A
            r14 = 10
            int r12 = kg3.C76577a.m92151b(r12, r14)
            float r12 = (float) r12
            r15 = 0
            r10.setTextSize(r15, r12)
            r1.mo88698j(r13, r15)
            r1.mo88698j(r10, r15)
            android.view.View r12 = r2.f44854d
            r15 = 2131304165(0x7f091ee5, float:1.8226465E38)
            android.view.View r12 = r12.findViewById(r15)
            java.lang.String r15 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.imageview.WeImageView"
            gy3.C87412m.m108592e(r12, r15)
            com.tencent.mm.ui.widget.imageview.WeImageView r12 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r12
            android.view.View r14 = r2.f44854d
            r3 = 2131304173(0x7f091eed, float:1.8226481E38)
            android.view.View r3 = r14.findViewById(r3)
            java.lang.String r14 = "null cannot be cast to non-null type android.widget.ImageView"
            gy3.C87412m.m108592e(r3, r14)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.view.View r14 = r2.f44854d
            r17 = r5
            r5 = 2131304179(0x7f091ef3, float:1.8226493E38)
            android.view.View r5 = r14.findViewById(r5)
            gy3.C87412m.m108592e(r5, r15)
            com.tencent.mm.ui.widget.imageview.WeImageView r5 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r5
            android.view.View r14 = r2.f44854d
            r15 = 2131304167(0x7f091ee7, float:1.8226469E38)
            android.view.View r14 = r14.findViewById(r15)
            java.lang.String r15 = "null cannot be cast to non-null type org.libpag.PAGView"
            gy3.C87412m.m108592e(r14, r15)
            org.libpag.PAGView r14 = (org.libpag.PAGView) r14
            r18 = r14
            android.view.View r14 = r2.f44854d
            r19 = r5
            r5 = 2131304166(0x7f091ee6, float:1.8226467E38)
            android.view.View r5 = r14.findViewById(r5)
            java.lang.String r14 = "null cannot be cast to non-null type com.tencent.mm.ui.widget.MMRoundCornerImageView"
            gy3.C87412m.m108592e(r5, r14)
            com.tencent.mm.ui.widget.MMRoundCornerImageView r5 = (com.tencent.p014mm.p136ui.widget.MMRoundCornerImageView) r5
            android.view.View r14 = r2.f44854d
            r20 = r5
            r5 = 2131304169(0x7f091ee9, float:1.8226473E38)
            android.view.View r5 = r14.findViewById(r5)
            java.lang.String r14 = "null cannot be cast to non-null type android.widget.LinearLayout"
            gy3.C87412m.m108592e(r5, r14)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r21 = r3
            android.view.View r3 = r2.f44854d
            r22 = r0
            r0 = 2131304189(0x7f091efd, float:1.8226514E38)
            android.view.View r0 = r3.findViewById(r0)
            gy3.C87412m.m108592e(r0, r8)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            android.view.View r3 = r2.f44854d
            r8 = 2131304175(0x7f091eef, float:1.8226485E38)
            android.view.View r3 = r3.findViewById(r8)
            gy3.C87412m.m108592e(r3, r14)
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            android.view.View r8 = r2.f44854d
            r14 = 2131304178(0x7f091ef2, float:1.8226491E38)
            android.view.View r8 = r8.findViewById(r14)
            gy3.C87412m.m108592e(r8, r15)
            org.libpag.PAGView r8 = (org.libpag.PAGView) r8
            r14 = 0
            r11.setVisibility(r14)
            r14 = 8
            r5.setVisibility(r14)
            r15 = 1065353216(0x3f800000, float:1.0)
            r9.setAlpha(r15)
            te3.dw0 r15 = r4.f153444h
            if (r15 == 0) goto L_0x01ac
            java.util.LinkedList<te3.v9> r14 = r15.f182889t
            if (r14 == 0) goto L_0x01ac
            int r14 = r14.size()
            goto L_0x01ad
        L_0x01ac:
            r14 = 0
        L_0x01ad:
            java.lang.String r23 = ""
            r24 = r9
            if (r14 > 0) goto L_0x01c0
            r14 = 8
            r3.setVisibility(r14)
            r26 = r5
            r28 = r8
            r27 = r11
            goto L_0x02a8
        L_0x01c0:
            if (r15 == 0) goto L_0x0286
            java.util.LinkedList<te3.v9> r14 = r15.f182889t
            if (r14 == 0) goto L_0x0286
            int r9 = r4.f153443g
            int r26 = r14.size()
            r27 = r11
            r25 = -1
            int r11 = r26 + -1
            if (r9 <= r11) goto L_0x01d7
            r9 = 0
            r4.f153443g = r9
        L_0x01d7:
            int r9 = r4.f153443g
            java.lang.Object r9 = sx3.C110818d0.m150917O(r14, r9)
            te3.v9 r9 = (te3.C51663v9) r9
            if (r9 == 0) goto L_0x01e6
            java.lang.String r11 = r9.f143390e
            if (r11 == 0) goto L_0x01e6
            goto L_0x01e8
        L_0x01e6:
            r11 = r23
        L_0x01e8:
            r10.setText(r11)
            java.lang.String r11 = r1.f181161e
            r26 = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = "subTitle text : "
            r5.append(r1)
            if (r9 == 0) goto L_0x01ff
            java.lang.String r1 = r9.f143390e
            goto L_0x0200
        L_0x01ff:
            r1 = 0
        L_0x0200:
            r5.append(r1)
            java.lang.String r1 = ", index "
            r5.append(r1)
            int r1 = r4.f153443g
            r5.append(r1)
            java.lang.String r1 = ", title size: "
            r5.append(r1)
            int r1 = r14.size()
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r1)
            if (r9 == 0) goto L_0x0225
            java.lang.String r1 = r9.f143389d
            goto L_0x0226
        L_0x0225:
            r1 = 0
        L_0x0226:
            if (r1 == 0) goto L_0x0231
            int r1 = r1.length()
            if (r1 != 0) goto L_0x022f
            goto L_0x0231
        L_0x022f:
            r1 = 0
            goto L_0x0232
        L_0x0231:
            r1 = 1
        L_0x0232:
            if (r1 == 0) goto L_0x023c
            r1 = 8
            r12.setVisibility(r1)
            r28 = r8
            goto L_0x027f
        L_0x023c:
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r5 = r1.mo62446e(r6)
            bl3.c r5 = r5.mo62447c(r7)
            pl1.s0 r5 = (pl1.C11990s0) r5
            k60.d r5 = r5.mo11865K1()
            pl1.f r11 = new pl1.f
            if (r9 == 0) goto L_0x0256
            java.lang.String r9 = r9.f143389d
            r28 = r8
            r8 = 0
            goto L_0x025a
        L_0x0256:
            r28 = r8
            r8 = 0
            r9 = 0
        L_0x025a:
            r14 = 2
            r11.<init>(r9, r8, r14, r8)
            pl1.e0$a r8 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r1 = r1.mo62446e(r6)
            bl3.c r1 = r1.mo62447c(r7)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r8)
            l60.b r1 = r5.mo85956b(r11, r1)
            sj1.g r5 = new sj1.g
            r5.<init>(r12)
            r1.getClass()
            r1.f291320d = r5
            r1.mo85951a()
        L_0x027f:
            int r1 = r4.f153443g
            r5 = 1
            int r1 = r1 + r5
            r4.f153443g = r1
            goto L_0x028c
        L_0x0286:
            r26 = r5
            r28 = r8
            r27 = r11
        L_0x028c:
            java.lang.CharSequence r1 = r10.getText()
            if (r1 == 0) goto L_0x029b
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0299
            goto L_0x029b
        L_0x0299:
            r1 = 0
            goto L_0x029c
        L_0x029b:
            r1 = 1
        L_0x029c:
            if (r1 == 0) goto L_0x02a4
            r1 = 8
            r3.setVisibility(r1)
            goto L_0x02a8
        L_0x02a4:
            r1 = 0
            r3.setVisibility(r1)
        L_0x02a8:
            android.content.Context r1 = r2.f173499A
            java.lang.String r3 = "holder.context"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.CharSequence r3 = r13.getText()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r5 = r4.f153440d
            java.lang.String r5 = r5.wording
            boolean r3 = gy3.C87412m.m108589b(r3, r5)
            if (r3 != 0) goto L_0x02c9
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r4.f153440d
            java.lang.String r3 = r3.wording
            if (r3 == 0) goto L_0x02c4
            goto L_0x02c6
        L_0x02c4:
            r3 = r23
        L_0x02c6:
            r13.setText(r3)
        L_0x02c9:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r4.f153440d
            java.lang.String r3 = r3.ext_info
            r5 = r22
            te3.dw0 r3 = r5.mo75642b(r3)
            if (r3 == 0) goto L_0x02d8
            java.lang.String r3 = r3.f182890u
            goto L_0x02d9
        L_0x02d8:
            r3 = 0
        L_0x02d9:
            if (r3 == 0) goto L_0x02e4
            int r3 = r3.length()
            if (r3 != 0) goto L_0x02e2
            goto L_0x02e4
        L_0x02e2:
            r3 = 0
            goto L_0x02e5
        L_0x02e4:
            r3 = 1
        L_0x02e5:
            if (r3 != 0) goto L_0x0328
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r3 = r4.f153440d
            java.lang.String r3 = r3.wording
            if (r3 == 0) goto L_0x02f6
            int r3 = r3.length()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x02f7
        L_0x02f6:
            r3 = 0
        L_0x02f7:
            r8 = 5
            if (r3 != 0) goto L_0x02fb
            goto L_0x0302
        L_0x02fb:
            int r9 = r3.intValue()
            if (r9 != r8) goto L_0x0302
            goto L_0x031c
        L_0x0302:
            r8 = 6
            if (r3 != 0) goto L_0x0306
            goto L_0x030f
        L_0x0306:
            int r9 = r3.intValue()
            if (r9 != r8) goto L_0x030f
            r3 = 11
            goto L_0x031e
        L_0x030f:
            r8 = 7
            if (r3 != 0) goto L_0x0313
            goto L_0x031c
        L_0x0313:
            int r3 = r3.intValue()
            if (r3 != r8) goto L_0x031c
            r3 = 10
            goto L_0x031e
        L_0x031c:
            r3 = 12
        L_0x031e:
            int r1 = kg3.C76577a.m92151b(r1, r3)
            float r1 = (float) r1
            r3 = 0
            r13.setTextSize(r3, r1)
            goto L_0x0333
        L_0x0328:
            r3 = 0
            r8 = 12
            int r1 = kg3.C76577a.m92151b(r1, r8)
            float r1 = (float) r1
            r13.setTextSize(r3, r1)
        L_0x0333:
            if (r15 == 0) goto L_0x0338
            java.lang.String r1 = r15.f182890u
            goto L_0x0339
        L_0x0338:
            r1 = 0
        L_0x0339:
            if (r1 == 0) goto L_0x0344
            int r3 = r1.length()
            if (r3 != 0) goto L_0x0342
            goto L_0x0344
        L_0x0342:
            r3 = 0
            goto L_0x0345
        L_0x0344:
            r3 = 1
        L_0x0345:
            if (r3 == 0) goto L_0x0355
            r3 = 8
            r0.setVisibility(r3)
            r8 = r21
            r8.setVisibility(r3)
            r3 = r17
            r1 = 0
            goto L_0x0388
        L_0x0355:
            r8 = r21
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r9 = r3.mo62446e(r6)
            bl3.c r9 = r9.mo62447c(r7)
            pl1.s0 r9 = (pl1.C11990s0) r9
            k60.d r9 = r9.mo11871f2()
            pl1.n0 r11 = new pl1.n0
            up1.y r12 = up1.C27696y.THUMB_IMAGE
            r11.<init>(r1, r12)
            bl3.r$a r1 = r3.mo62446e(r6)
            bl3.c r1 = r1.mo62447c(r7)
            pl1.s0 r1 = (pl1.C11990s0) r1
            r3 = r17
            n60.f r1 = r1.mo11867O2(r3)
            r9.mo85957c(r11, r8, r1)
            r1 = 0
            r0.setVisibility(r1)
            r8.setVisibility(r1)
        L_0x0388:
            te3.dw0 r0 = r4.f153444h
            if (r0 == 0) goto L_0x0393
            boolean r0 = r0.f182894y
            r8 = 1
            if (r0 != r8) goto L_0x0393
            r0 = 1
            goto L_0x0394
        L_0x0393:
            r0 = 0
        L_0x0394:
            if (r0 == 0) goto L_0x03b8
            r8 = r28
            r8.setVisibility(r1)
            r8.stop()
            android.content.Context r0 = r2.f173499A
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = "finder_live_banner_icon.pag"
            org.libpag.PAGFile r0 = org.libpag.PAGFile.Load(r0, r1)
            r8.setComposition(r0)
            r8.flush()
            r0 = -1
            r8.setRepeatCount(r0)
            r8.play()
            goto L_0x03c2
        L_0x03b8:
            r8 = r28
            r1 = 8
            r8.setVisibility(r1)
            r8.stop()
        L_0x03c2:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r4.f153440d
            int r1 = r0.jumpinfo_type
            r8 = 3
            if (r1 != r8) goto L_0x03da
            com.tencent.mm.protocal.protobuf.NativeInfo r0 = r0.native_info
            if (r0 == 0) goto L_0x03d5
            int r0 = r0.native_type
            r1 = 29
            if (r0 != r1) goto L_0x03d5
            r0 = 1
            goto L_0x03d6
        L_0x03d5:
            r0 = 0
        L_0x03d6:
            if (r0 == 0) goto L_0x03da
            r0 = 1
            goto L_0x03db
        L_0x03da:
            r0 = 0
        L_0x03db:
            if (r0 == 0) goto L_0x0437
            android.content.Context r0 = r2.f173499A
            r1 = 10
            int r0 = kg3.C76577a.m92151b(r0, r1)
            float r0 = (float) r0
            r1 = 0
            r13.setTextSize(r1, r0)
            android.content.Context r0 = r2.f173499A
            r8 = 12
            int r0 = kg3.C76577a.m92151b(r0, r8)
            float r0 = (float) r0
            r10.setTextSize(r1, r0)
            android.content.Context r0 = r2.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r0 = r0.getColor(r1)
            java.lang.String r8 = "#8C704608"
            int r0 = r5.mo75641a(r8, r0)
            r13.setTextColor(r0)
            android.content.Context r0 = r2.f173499A
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            int r0 = r5.mo75641a(r8, r0)
            r8 = r19
            r8.setIconColor(r0)
            android.content.Context r0 = r2.f173499A
            android.content.res.Resources r0 = r0.getResources()
            int r0 = r0.getColor(r1)
            java.lang.String r1 = "#704608"
            int r0 = r5.mo75641a(r1, r0)
            r10.setTextColor(r0)
            r1 = 0
            r8.setVisibility(r1)
            goto L_0x0483
        L_0x0437:
            r8 = r19
            te3.dw0 r0 = r4.f153444h
            if (r0 == 0) goto L_0x0440
            java.lang.String r0 = r0.f182882j
            goto L_0x0441
        L_0x0440:
            r0 = 0
        L_0x0441:
            android.content.Context r1 = r2.f173499A
            android.content.res.Resources r1 = r1.getResources()
            r9 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r1 = r1.getColor(r9)
            int r0 = r5.mo75641a(r0, r1)
            r13.setTextColor(r0)
            android.content.Context r0 = r2.f173499A
            android.content.res.Resources r0 = r0.getResources()
            r1 = 2131099702(0x7f060036, float:1.7811765E38)
            int r0 = r0.getColor(r1)
            r10.setTextColor(r0)
            android.content.Context r0 = r2.f173499A
            r1 = 12
            int r0 = kg3.C76577a.m92151b(r0, r1)
            float r0 = (float) r0
            r1 = 0
            r13.setTextSize(r1, r0)
            android.content.Context r0 = r2.f173499A
            r5 = 10
            int r0 = kg3.C76577a.m92151b(r0, r5)
            float r0 = (float) r0
            r10.setTextSize(r1, r0)
            r1 = 8
            r8.setVisibility(r1)
        L_0x0483:
            r5 = r20
            r1 = 0
            r5.setImageDrawable(r1)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r0 = r4.f153440d
            java.lang.String r0 = r0.icon_url
            if (r0 != 0) goto L_0x0492
            r1 = r23
            goto L_0x0493
        L_0x0492:
            r1 = r0
        L_0x0493:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x055a
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r8 = "imgtype"
            java.lang.String r0 = r0.getQueryParameter(r8)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)     // Catch:{ Exception -> 0x04b0 }
            java.lang.String r8 = "pag"
            boolean r0 = gy3.C87412m.m108589b(r0, r8)     // Catch:{ Exception -> 0x04b0 }
            r8 = r34
            goto L_0x04ce
        L_0x04b0:
            r0 = move-exception
            r8 = r34
            java.lang.String r9 = r8.f181161e
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "execption: "
            r11.append(r12)
            java.lang.String r0 = r0.getMessage()
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            r0 = 0
        L_0x04ce:
            if (r0 == 0) goto L_0x04ec
            a14.n0 r0 = r2.f29679z
            if (r0 == 0) goto L_0x055c
            a14.h0 r29 = a14.C53872d1.f151119c
            r30 = 0
            sj1.a r3 = new sj1.a
            r14 = r18
            r6 = 0
            r3.<init>(r1, r14, r5, r6)
            r32 = 2
            r33 = 0
            r28 = r0
            r31 = r3
            a14.C53895h.m60466d(r28, r29, r30, r31, r32, r33)
            goto L_0x055c
        L_0x04ec:
            r14 = r18
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r9 = r0.mo62446e(r6)
            bl3.c r9 = r9.mo62447c(r7)
            pl1.s0 r9 = (pl1.C11990s0) r9
            n60.f r3 = r9.mo11867O2(r3)
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r9 = fh1.C59018f2.f168857P
            java.lang.Object r9 = r9.get(r1)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r11 = fh1.C59018f2.f168857P
            boolean r11 = r11.containsKey(r1)
            if (r11 == 0) goto L_0x051a
            if (r9 == 0) goto L_0x051a
            boolean r11 = r9.isRecycled()
            if (r11 != 0) goto L_0x051a
            r5.setImageBitmap(r9)
            goto L_0x0550
        L_0x051a:
            bl3.r$a r0 = r0.mo62446e(r6)
            bl3.c r0 = r0.mo62447c(r7)
            pl1.s0 r0 = (pl1.C11990s0) r0
            k60.d r0 = r0.mo11861A2()
            pl1.f r6 = new pl1.f
            r7 = 2
            r9 = 0
            r6.<init>(r1, r9, r7, r9)
            l60.b r0 = r0.mo85956b(r6, r3)
            java.lang.Object r3 = r0.mo138757e()
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3
            if (r3 == 0) goto L_0x0546
            boolean r6 = r3.isRecycled()
            if (r6 != 0) goto L_0x0546
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r6 = fh1.C59018f2.f168857P
            r6.put(r1, r3)
        L_0x0546:
            sj1.c r3 = new sj1.c
            r3.<init>(r1, r5)
            r0.f291320d = r3
            r0.mo85951a()
        L_0x0550:
            r1 = 0
            r5.setVisibility(r1)
            r1 = 8
            r14.setVisibility(r1)
            goto L_0x055c
        L_0x055a:
            r8 = r34
        L_0x055c:
            if (r40 == 0) goto L_0x0563
            java.lang.Object r0 = sx3.C110818d0.m150916N(r40)
            goto L_0x0564
        L_0x0563:
            r0 = 0
        L_0x0564:
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L_0x056b
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x056c
        L_0x056b:
            r0 = 0
        L_0x056c:
            if (r0 == 0) goto L_0x0577
            int r1 = r0.length()
            if (r1 != 0) goto L_0x0575
            goto L_0x0577
        L_0x0575:
            r1 = 0
            goto L_0x0578
        L_0x0577:
            r1 = 1
        L_0x0578:
            java.lang.String r3 = "karlDebug"
            if (r1 != 0) goto L_0x05aa
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "payload "
            r1.append(r5)
            r1.append(r0)
            java.lang.String r5 = ", id "
            r1.append(r5)
            if (r15 == 0) goto L_0x0593
            java.lang.String r5 = r15.f182876d
            goto L_0x0594
        L_0x0593:
            r5 = 0
        L_0x0594:
            r1.append(r5)
            java.lang.String r5 = ", wording: "
            r1.append(r5)
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f153440d
            java.lang.String r4 = r4.wording
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)
        L_0x05aa:
            if (r0 == 0) goto L_0x05b5
            int r1 = r0.length()
            if (r1 != 0) goto L_0x05b3
            goto L_0x05b5
        L_0x05b3:
            r1 = 0
            goto L_0x05b6
        L_0x05b5:
            r1 = 1
        L_0x05b6:
            if (r1 != 0) goto L_0x0630
            if (r15 == 0) goto L_0x05bd
            java.lang.String r1 = r15.f182876d
            goto L_0x05be
        L_0x05bd:
            r1 = 0
        L_0x05be:
            boolean r1 = gy3.C87412m.m108589b(r0, r1)
            if (r1 == 0) goto L_0x060d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "do animate, "
            r1.append(r4)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
            r5 = r26
            r1 = 0
            r5.setVisibility(r1)
            r1 = r27
            r3 = 8
            r1.setVisibility(r3)
            r1 = 2
            float[] r0 = new float[r1]
            r0 = {1065353216, 0} // fill-array
            java.lang.String r1 = "alpha"
            r3 = r24
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r3, r1, r0)
            r4 = 1500(0x5dc, double:7.41E-321)
            android.animation.ObjectAnimator r0 = r0.setDuration(r4)
            f181160f = r0
            if (r0 == 0) goto L_0x0605
            sj1.d r1 = new sj1.d
            r1.<init>()
            r0.addListener(r1)
        L_0x0605:
            android.animation.ValueAnimator r0 = f181160f
            if (r0 == 0) goto L_0x0632
            r0.start()
            goto L_0x0632
        L_0x060d:
            r3 = r24
            java.util.HashMap<java.lang.String, android.graphics.Bitmap> r1 = fh1.C59018f2.f168857P
            java.lang.String r1 = "bannerselected"
            boolean r0 = gy3.C87412m.m108589b(r0, r1)
            if (r0 == 0) goto L_0x0632
            a14.n0 r14 = r2.f29679z
            if (r14 == 0) goto L_0x0632
            r15 = 0
            r16 = 0
            sj1.e r0 = new sj1.e
            r1 = 0
            r0.<init>(r8, r13, r10, r1)
            r18 = 3
            r19 = 0
            r17 = r0
            a14.C53895h.m60466d(r14, r15, r16, r17, r18, r19)
            goto L_0x0632
        L_0x0630:
            r3 = r24
        L_0x0632:
            android.content.Context r0 = r2.f173499A
            r1 = 2131827062(0x7f111976, float:1.9287026E38)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.CharSequence r4 = r13.getText()
            java.lang.String r4 = r4.toString()
            r5 = 0
            r2[r5] = r4
            java.lang.CharSequence r4 = r10.getText()
            java.lang.String r4 = r4.toString()
            r5 = 1
            r2[r5] = r4
            java.lang.String r0 = r0.getString(r1, r2)
            r3.setContentDescription(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sj1.C63914h.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        String str = this.f181161e;
        Log.m105924i(str, "onCreate, type: " + i);
    }

    /* renamed from: g */
    public void mo2296g(RecyclerView recyclerView) {
        C87412m.m108594g(recyclerView, "recyclerView");
        this.f173479d = false;
        ValueAnimator valueAnimator = f181160f;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
    }

    /* renamed from: i */
    public void mo735i(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        View findViewById = oVar.f44854d.findViewById(C0966R.C0970id.nuw);
        C87412m.m108592e(findViewById, "null cannot be cast to non-null type org.libpag.PAGView");
        ((PAGView) findViewById).stop();
        View findViewById2 = oVar.f44854d.findViewById(C0966R.C0970id.ode);
        C87412m.m108592e(findViewById2, "null cannot be cast to non-null type org.libpag.PAGView");
        ((PAGView) findViewById2).stop();
    }

    /* renamed from: j */
    public final void mo88698j(TextView textView, boolean z) {
        C87412m.m108594g(textView, "tv");
        if (z) {
            textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
            textView.setMarqueeRepeatLimit(Integer.MAX_VALUE);
            textView.setSelected(true);
            return;
        }
        textView.setEllipsize((TextUtils.TruncateAt) null);
        textView.setMarqueeRepeatLimit(0);
        textView.setSelected(false);
    }
}

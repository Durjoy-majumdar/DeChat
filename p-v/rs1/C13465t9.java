package rs1;

import android.widget.TextView;
import androidx.lifecycle.C0120a0;

/* renamed from: rs1.t9 */
public final class C13465t9<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ TextView f38165d;

    /* renamed from: e */
    public final /* synthetic */ TextView f38166e;

    /* renamed from: f */
    public final /* synthetic */ TextView f38167f;

    /* renamed from: g */
    public final /* synthetic */ C13146c9 f38168g;

    public C13465t9(TextView textView, TextView textView2, TextView textView3, C13146c9 c9Var) {
        this.f38165d = textView;
        this.f38166e = textView2;
        this.f38167f = textView3;
        this.f38168g = c9Var;
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x013b A[SYNTHETIC, Splitter:B:59:0x013b] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0188  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onChanged(java.lang.Object r24) {
        /*
            r23 = this;
            r1 = r23
            r0 = r24
            com.tencent.mm.plugin.finder.extension.reddot.n0$a r0 = (com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0.C2480a) r0
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0012
            boolean r5 = r0.f12908a
            if (r5 != r3) goto L_0x0012
            r5 = 1
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            r6 = 8
            if (r5 == 0) goto L_0x02fb
            te3.nn1 r5 = r0.f12909b
            if (r5 == 0) goto L_0x001e
            int r7 = r5.f184503e
            goto L_0x001f
        L_0x001e:
            r7 = 0
        L_0x001f:
            if (r5 == 0) goto L_0x0024
            int r5 = r5.f184502d
            goto L_0x0025
        L_0x0024:
            r5 = 0
        L_0x0025:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "wxMessageEntrance count:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "SimpleUIComponent"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r8)
            r8 = 0
            r9 = 2
            if (r5 == r9) goto L_0x023b
            r7 = 27
            if (r5 == r7) goto L_0x0046
            goto L_0x0297
        L_0x0046:
            android.widget.TextView r5 = r1.f38165d
            if (r5 != 0) goto L_0x004b
            goto L_0x004e
        L_0x004b:
            r5.setVisibility(r6)
        L_0x004e:
            android.widget.TextView r5 = r1.f38166e
            if (r5 != 0) goto L_0x0053
            goto L_0x0056
        L_0x0053:
            r5.setVisibility(r4)
        L_0x0056:
            android.widget.TextView r5 = r1.f38167f
            if (r5 != 0) goto L_0x005b
            goto L_0x005e
        L_0x005b:
            r5.setVisibility(r4)
        L_0x005e:
            te3.nn1 r0 = r0.f12909b
            java.lang.String r5 = ""
            if (r0 == 0) goto L_0x0068
            java.lang.String r0 = r0.f184504f
            if (r0 != 0) goto L_0x0069
        L_0x0068:
            r0 = r5
        L_0x0069:
            android.widget.TextView r6 = r1.f38167f
            if (r6 == 0) goto L_0x0072
            float r6 = r6.getTextSize()
            goto L_0x0073
        L_0x0072:
            r6 = 0
        L_0x0073:
            int r6 = (int) r6
            java.lang.Class<pl1.s0> r7 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r15 = ht1.C60200t1.class
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[parseRichText] richText="
            r10.append(r11)
            r10.append(r0)
            java.lang.String r11 = " textSize="
            r10.append(r11)
            r10.append(r6)
            java.lang.String r10 = r10.toString()
            java.lang.String r14 = "Finder.DynamicImageUtil"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r10)
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r13 = r10.getResources()
            boolean r16 = com.tencent.p014mm.p136ui.C85875k4.m106211z()
            r11 = 60
            r12 = 0
            r17 = 0
            r18 = 6
            r19 = 0
            r20 = 0
            r10 = r0
            r9 = r13
            r13 = r20
            r21 = r14
            r14 = r18
            r22 = r15
            r15 = r19
            int r15 = z04.C112550d0.m153768D(r10, r11, r12, r13, r14, r15)
            r11 = 62
            r13 = 0
            r14 = 6
            r18 = 0
            r12 = r17
            r4 = r15
            r15 = r18
            int r10 = z04.C112550d0.m153768D(r10, r11, r12, r13, r14, r15)
            if (r4 < 0) goto L_0x022d
            if (r10 < 0) goto L_0x022d
            if (r10 > r4) goto L_0x00d4
            goto L_0x022d
        L_0x00d4:
            int r10 = r10 + r3
            java.lang.CharSequence r3 = r0.subSequence(r4, r10)
            java.lang.String r11 = "$$"
            java.lang.CharSequence r10 = z04.C112550d0.m153781Q(r0, r4, r10, r11)
            java.lang.String r0 = r3.toString()
            java.lang.String r3 = "_wc_custom_img_"
            java.util.Map r3 = com.tencent.p014mm.sdk.platformtools.XmlParser.parseXml(r0, r3, r8)
            java.lang.String r0 = "._wc_custom_img_.$src"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L_0x00f4
            goto L_0x00f5
        L_0x00f4:
            r5 = r0
        L_0x00f5:
            java.lang.String r0 = "._wc_custom_img_.$color"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            r11 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r0 == 0) goto L_0x012c
            kotlin.Result$Companion r12 = kotlin.Result.Companion     // Catch:{ all -> 0x0111 }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x0111 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0111 }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x0111 }
            goto L_0x011c
        L_0x0111:
            r0 = move-exception
            kotlin.Result$Companion r12 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x011c:
            boolean r12 = kotlin.Result.m168120isFailureimpl(r0)
            if (r12 == 0) goto L_0x0123
            r0 = r8
        L_0x0123:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x012c
            int r0 = r0.intValue()
            goto L_0x0130
        L_0x012c:
            int r0 = r9.getColor(r11)
        L_0x0130:
            r12 = r0
            java.lang.String r0 = "._wc_custom_img_.$darkColor"
            java.lang.Object r0 = r3.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0165
            kotlin.Result$Companion r3 = kotlin.Result.Companion     // Catch:{ all -> 0x014a }
            int r0 = android.graphics.Color.parseColor(r0)     // Catch:{ all -> 0x014a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x014a }
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)     // Catch:{ all -> 0x014a }
            goto L_0x0155
        L_0x014a:
            r0 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m168114constructorimpl(r0)
        L_0x0155:
            boolean r3 = kotlin.Result.m168120isFailureimpl(r0)
            if (r3 == 0) goto L_0x015c
            r0 = r8
        L_0x015c:
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L_0x0165
            int r0 = r0.intValue()
            goto L_0x0169
        L_0x0165:
            int r0 = r9.getColor(r11)
        L_0x0169:
            if (r16 == 0) goto L_0x016c
            r12 = r0
        L_0x016c:
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r6, r6, r0)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r0)
            r11 = 2131231874(0x7f080482, float:1.8079841E38)
            android.graphics.drawable.Drawable r11 = r9.getDrawable(r11, r8)
            r11.draw(r3)
            android.graphics.drawable.BitmapDrawable r3 = new android.graphics.drawable.BitmapDrawable
            r3.<init>(r9, r0)
            if (r12 != 0) goto L_0x0190
            android.graphics.drawable.Drawable r0 = r3.mutate()
            r0.setColorFilter(r8)
            goto L_0x01b7
        L_0x0190:
            r0 = 255(0xff, float:3.57E-43)
            int r9 = android.graphics.Color.red(r12)
            int r11 = android.graphics.Color.green(r12)
            int r13 = android.graphics.Color.blue(r12)
            int r0 = android.graphics.Color.argb(r0, r9, r11, r13)
            int r9 = android.graphics.Color.alpha(r12)
            android.graphics.PorterDuffColorFilter r11 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r13 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r11.<init>(r0, r13)
            android.graphics.drawable.Drawable r0 = r3.mutate()
            r0.setColorFilter(r11)
            r3.setAlpha(r9)
        L_0x01b7:
            r9 = 0
            r3.setBounds(r9, r9, r6, r6)
            go3.c r0 = new go3.c
            r6 = 2
            r0.<init>(r3, r6)
            wp1.j r6 = wp1.C15587j.f42215a
            te3.cf1 r5 = r6.mo14349a(r5)
            if (r5 == 0) goto L_0x0220
            if (r16 == 0) goto L_0x01ce
            java.lang.String r5 = r5.f131695f
            goto L_0x01d0
        L_0x01ce:
            java.lang.String r5 = r5.f131694e
        L_0x01d0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r9 = "[parseRichText] url="
            r6.append(r9)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            r9 = r21
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            bl3.r r6 = bl3.C39818r.f106831a
            r9 = r22
            bl3.r$a r11 = r6.mo62446e(r9)
            bl3.c r11 = r11.mo62447c(r7)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11871f2()
            pl1.n0 r13 = new pl1.n0
            up1.y r14 = up1.C27696y.RAW_IMAGE
            r13.<init>(r5, r14)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.TIMELINE
            bl3.r$a r6 = r6.mo62446e(r9)
            bl3.c r6 = r6.mo62447c(r7)
            pl1.s0 r6 = (pl1.C11990s0) r6
            n60.f r5 = r6.mo11867O2(r5)
            l60.b r5 = r11.mo85956b(r13, r5)
            wp1.e r6 = new wp1.e
            r6.<init>(r3, r12)
            r5.getClass()
            r5.f291320d = r6
            r5.mo85953c()
        L_0x0220:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r10)
            int r15 = r4 + 2
            r5 = 33
            r3.setSpan(r0, r4, r15, r5)
            goto L_0x0232
        L_0x022d:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r0)
        L_0x0232:
            android.widget.TextView r0 = r1.f38167f
            if (r0 != 0) goto L_0x0237
            goto L_0x0297
        L_0x0237:
            r0.setText(r3)
            goto L_0x0297
        L_0x023b:
            android.widget.TextView r0 = r1.f38165d
            if (r0 != 0) goto L_0x0240
            goto L_0x0244
        L_0x0240:
            r3 = 0
            r0.setVisibility(r3)
        L_0x0244:
            android.widget.TextView r0 = r1.f38165d
            if (r0 != 0) goto L_0x0249
            goto L_0x0258
        L_0x0249:
            r3 = 999(0x3e7, float:1.4E-42)
            if (r7 <= r3) goto L_0x0251
            java.lang.String r3 = "· · ·"
            goto L_0x0255
        L_0x0251:
            java.lang.String r3 = java.lang.String.valueOf(r7)
        L_0x0255:
            r0.setText(r3)
        L_0x0258:
            android.widget.TextView r0 = r1.f38165d
            rs1.c9 r3 = r1.f38168g
            android.app.Activity r3 = r3.getContext()
            int r3 = com.tencent.p014mm.p136ui.tools.C45081s1.m49933b(r3, r7)
            r0.setBackgroundResource(r3)
            android.widget.TextView r0 = r1.f38165d
            rs1.c9 r3 = r1.f38168g
            android.app.Activity r3 = r3.getContext()
            r4 = 2131167343(0x7f07086f, float:1.7948957E38)
            int r3 = kg3.C76577a.m92155f(r3, r4)
            float r3 = (float) r3
            rs1.c9 r4 = r1.f38168g
            android.app.Activity r4 = r4.getContext()
            float r4 = kg3.C76577a.m92161l(r4)
            float r3 = r3 * r4
            r4 = 0
            r0.setTextSize(r4, r3)
            android.widget.TextView r0 = r1.f38166e
            if (r0 != 0) goto L_0x028c
            goto L_0x028f
        L_0x028c:
            r0.setVisibility(r6)
        L_0x028f:
            android.widget.TextView r0 = r1.f38167f
            if (r0 != 0) goto L_0x0294
            goto L_0x0297
        L_0x0294:
            r0.setVisibility(r6)
        L_0x0297:
            di3.d r0 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            java.lang.String r3 = "WxMessageEntry"
            te3.nn1 r12 = r0.mo77246R5(r3)
            di3.d r0 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            com.tencent.mm.plugin.finder.extension.reddot.s0 r11 = r0.mo77227G5(r3)
            if (r12 == 0) goto L_0x0313
            if (r11 == 0) goto L_0x0313
            java.lang.String r0 = r11.field_tipsId
            rs1.c9 r2 = r1.f38168g
            java.lang.String r2 = r2.f37402G
            boolean r0 = gy3.C87412m.m108589b(r0, r2)
            if (r0 == 0) goto L_0x02c6
            goto L_0x0313
        L_0x02c6:
            rs1.c9 r0 = r1.f38168g
            java.lang.String r2 = r11.field_tipsId
            java.lang.String r3 = "ctrlInfo.field_tipsId"
            gy3.C87412m.m108593f(r2, r3)
            r0.getClass()
            r0.f37402G = r2
            dp1.v0 r9 = dp1.C58413v0.f167346a
            r13 = 1
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            rs1.c9 r2 = r1.f38168g
            androidx.appcompat.app.AppCompatActivity r2 = r2.getActivity()
            rs1.s8 r0 = r0.mo12873f(r2)
            if (r0 == 0) goto L_0x02e9
            te3.hj1 r8 = r0.mo12861q3()
        L_0x02e9:
            r14 = r8
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 480(0x1e0, float:6.73E-43)
            r20 = 0
            java.lang.String r10 = "4"
            dp1.C58413v0.m67781i(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x0313
        L_0x02fb:
            android.widget.TextView r0 = r1.f38165d
            if (r0 != 0) goto L_0x0300
            goto L_0x0303
        L_0x0300:
            r0.setVisibility(r6)
        L_0x0303:
            android.widget.TextView r0 = r1.f38166e
            if (r0 != 0) goto L_0x0308
            goto L_0x030b
        L_0x0308:
            r0.setVisibility(r6)
        L_0x030b:
            android.widget.TextView r0 = r1.f38167f
            if (r0 != 0) goto L_0x0310
            goto L_0x0313
        L_0x0310:
            r0.setVisibility(r6)
        L_0x0313:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13465t9.onChanged(java.lang.Object):void");
    }
}

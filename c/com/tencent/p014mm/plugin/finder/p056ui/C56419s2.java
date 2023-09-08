package com.tencent.p014mm.plugin.finder.p056ui;

import android.view.ViewTreeObserver;

/* renamed from: com.tencent.mm.plugin.finder.ui.s2 */
public final class C56419s2 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d */
    public final /* synthetic */ FinderSelectCoverUI f161282d;

    public C56419s2(FinderSelectCoverUI finderSelectCoverUI) {
        this.f161282d = finderSelectCoverUI;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008c, code lost:
        r10 = r10.f332923a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0366  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x036f  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0404  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0410  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0407 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onGlobalLayout() {
        /*
            r26 = this;
            r0 = r26
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI r1 = r0.f161282d
            com.tencent.mm.ui.widget.cropview.CropLayout r1 = r1.f161114p
            r2 = 0
            java.lang.String r3 = "cropLayout"
            if (r1 == 0) goto L_0x0464
            android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
            r1.removeOnGlobalLayoutListener(r0)
            com.tencent.mm.plugin.finder.ui.FinderSelectCoverUI r1 = r0.f161282d
            r1.getClass()
            java.lang.String r4 = "Finder.FinderSelectCoverUI"
            java.lang.String r5 = "cover editor init"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            androidx.appcompat.app.AppCompatActivity r5 = r1.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131165284(0x7f070064, float:1.794478E38)
            int r5 = r5.getDimensionPixelSize(r6)
            r7 = 2
            int r5 = r5 / r7
            com.tencent.mm.ui.widget.cropview.CropLayout r8 = r1.f161114p
            if (r8 == 0) goto L_0x045f
            int r8 = r8.getTop()
            android.view.View r9 = r1.f161125z
            java.lang.String r10 = "centerHoleView"
            if (r9 == 0) goto L_0x045a
            int r9 = r9.getTop()
            int r8 = java.lang.Math.max(r8, r9)
            androidx.appcompat.app.AppCompatActivity r9 = r1.getContext()
            android.content.res.Resources r9 = r9.getResources()
            int r6 = r9.getDimensionPixelSize(r6)
            int r6 = r6 / r7
            android.view.View r9 = r1.f161125z
            if (r9 == 0) goto L_0x0455
            int r9 = r9.getWidth()
            int r6 = r6 + r9
            int r9 = r1.mo79103S7()
            int r9 = r9 + r8
            com.tencent.mm.ui.widget.cropview.CropLayout r10 = r1.f161114p
            if (r10 == 0) goto L_0x0450
            int r10 = r10.getHeight()
            int r11 = r1.mo79103S7()
            if (r10 >= r11) goto L_0x007d
            com.tencent.mm.ui.widget.cropview.CropLayout r9 = r1.f161114p
            if (r9 == 0) goto L_0x0079
            int r3 = r9.getHeight()
            int r9 = r8 + r3
            goto L_0x007d
        L_0x0079:
            gy3.C87412m.m108603p(r3)
            throw r2
        L_0x007d:
            if (r5 == 0) goto L_0x044f
            if (r8 != 0) goto L_0x0083
            goto L_0x044f
        L_0x0083:
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>(r5, r8, r6, r9)
            ug.r0 r10 = r1.f161104R
            if (r10 == 0) goto L_0x0093
            ug.r0$a r10 = r10.f332923a
            if (r10 == 0) goto L_0x0093
            android.graphics.Rect r10 = r10.f332928e
            goto L_0x0094
        L_0x0093:
            r10 = r2
        L_0x0094:
            boolean r11 = r1.f161111Y
            r12 = 1
            r13 = 0
            if (r11 == 0) goto L_0x00af
            boolean r11 = gy3.C87412m.m108589b(r3, r10)
            if (r11 == 0) goto L_0x00a2
            goto L_0x044f
        L_0x00a2:
            int r11 = r3.top
            if (r10 == 0) goto L_0x00a9
            int r10 = r10.top
            goto L_0x00aa
        L_0x00a9:
            r10 = 0
        L_0x00aa:
            int r11 = r11 - r10
            r1.mo79110Z7()
            goto L_0x00c5
        L_0x00af:
            java.lang.Class<ew.b> r10 = p511ew.C58849b.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            ew.b r10 = (p511ew.C58849b) r10
            ug.r0 r10 = r10.mo58069ZD()
            r1.f161104R = r10
            int r10 = r3.top
            int r11 = com.tencent.p014mm.plugin.finder.p056ui.FinderSelectCoverUI.f161087x0
            int r11 = r10 - r11
            r1.f161111Y = r12
        L_0x00c5:
            r10 = 2131313084(0x7f0941bc, float:1.8244555E38)
            android.view.View r10 = r1.findViewById(r10)
            java.lang.String r14 = "findViewById(R.id.select_cover_edit_content)"
            gy3.C87412m.m108593f(r10, r14)
            android.widget.FrameLayout r10 = (android.widget.FrameLayout) r10
            r1.f161105S = r10
            ug.r0 r10 = r1.f161104R
            if (r10 == 0) goto L_0x0102
            ug.r0$a r14 = new ug.r0$a
            r14.<init>()
            r14.f332925b = r13
            r14.f332926c = r13
            r14.f332929f = r13
            ug.r0$b r15 = p248ug.C111164r0.C111166b.VIDEO_COVER
            r14.f332924a = r15
            r14.f332928e = r3
            r14.f332927d = r4
            androidx.appcompat.app.AppCompatActivity r15 = r1.getContext()
            r2 = 2131101687(0x7f0607f7, float:1.781579E38)
            int r2 = p385u2.C111105a.m151500b(r15, r2)
            int r6 = r6 - r5
            int r9 = r9 - r8
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.createColorBitmap(r2, r6, r9)
            r14.f332932i = r2
            r10.mo162895d(r14)
        L_0x0102:
            zp3.i0 r2 = r1.f161106T
            if (r2 == 0) goto L_0x0109
            r2.getRotation()
        L_0x0109:
            ug.r0 r2 = r1.f161104R
            if (r2 == 0) goto L_0x0112
            ug.e r2 = r2.mo162894c(r1)
            goto L_0x0113
        L_0x0112:
            r2 = 0
        L_0x0113:
            java.lang.String r5 = "null cannot be cast to non-null type com.tencent.mm.view.VideoCoverDrawingView"
            gy3.C87412m.m108592e(r2, r5)
            zp3.i0 r2 = (zp3.C112661i0) r2
            r1.f161106T = r2
            cq3.a r5 = r2.getBaseBoardView()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.view.board.VideoCoverBoardView"
            gy3.C87412m.m108592e(r5, r6)
            cq3.g r5 = (cq3.C106961g) r5
            android.view.View r5 = r2.getActionBar()
            r6 = 2131301278(0x7f09139e, float:1.822061E38)
            android.view.View r5 = r5.findViewById(r6)
            android.widget.Button r5 = (android.widget.Button) r5
            r6 = 2131231392(0x7f0802a0, float:1.8078864E38)
            r5.setBackgroundResource(r6)
            android.content.Context r6 = r5.getContext()
            r8 = 2131100231(0x7f060247, float:1.7812838E38)
            int r6 = p385u2.C111105a.m151500b(r6, r8)
            r5.setTextColor(r6)
            me3.f r5 = r2.getPresenter()
            me3.c r5 = (me3.C109612c) r5
            r5.f328165h = r13
            me3.f r5 = r2.getPresenter()
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.presenter.DrawingPresenter"
            gy3.C87412m.m108592e(r5, r6)
            me3.c r5 = (me3.C109612c) r5
            com.tencent.mm.plugin.finder.ui.w2 r6 = new com.tencent.mm.plugin.finder.ui.w2
            r6.<init>(r1)
            r5.f328172o = r6
            android.widget.FrameLayout r5 = r1.f161105S
            if (r5 == 0) goto L_0x0448
            zp3.i0 r6 = r1.f161106T
            r5.addView(r6)
            java.lang.Class<l31.e> r5 = l31.C61212e.class
            zp3.i0 r6 = r1.f161106T
            if (r6 == 0) goto L_0x0176
            com.tencent.mm.view.TextModeSelectView r6 = r6.getBgSwitch()
            goto L_0x0177
        L_0x0176:
            r6 = 0
        L_0x0177:
            if (r6 != 0) goto L_0x017b
            goto L_0x0224
        L_0x017b:
            di3.d r9 = di3.C86312j.m106911c(r5)
            l31.e r9 = (l31.C61212e) r9
            java.lang.String r10 = "change_word_style_button"
            r9.o30(r6, r10)
            di3.d r9 = di3.C86312j.m106911c(r5)
            l31.e r9 = (l31.C61212e) r9
            r10 = 40
            r14 = 25496(0x6398, float:3.5728E-41)
            r9.mo86175pO(r6, r10, r14)
            di3.d r9 = di3.C86312j.m106911c(r5)
            l31.e r9 = (l31.C61212e) r9
            r10 = 4
            rx3.l[] r10 = new rx3.C13604l[r10]
            rs1.s8$a r14 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r15 = r1.getContext()
            java.lang.String r8 = "context"
            gy3.C87412m.m108593f(r15, r8)
            rs1.s8 r15 = r14.mo12873f(r15)
            if (r15 == 0) goto L_0x01b0
            java.lang.String r15 = r15.f38099o
            goto L_0x01b1
        L_0x01b0:
            r15 = 0
        L_0x01b1:
            rx3.l r7 = new rx3.l
            java.lang.String r12 = "behaviour_session_id"
            r7.<init>(r12, r15)
            r10[r13] = r7
            androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
            gy3.C87412m.m108593f(r7, r8)
            rs1.s8 r7 = r14.mo12873f(r7)
            if (r7 == 0) goto L_0x01ca
            java.lang.String r7 = r7.f38098n
            goto L_0x01cb
        L_0x01ca:
            r7 = 0
        L_0x01cb:
            rx3.l r12 = new rx3.l
            java.lang.String r15 = "finder_context_id"
            r12.<init>(r15, r7)
            r7 = 1
            r10[r7] = r12
            androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
            gy3.C87412m.m108593f(r7, r8)
            rs1.s8 r7 = r14.mo12873f(r7)
            if (r7 == 0) goto L_0x01e5
            java.lang.String r7 = r7.f38100p
            goto L_0x01e6
        L_0x01e5:
            r7 = 0
        L_0x01e6:
            rx3.l r12 = new rx3.l
            java.lang.String r15 = "finder_tab_context_id"
            r12.<init>(r15, r7)
            r7 = 2
            r10[r7] = r12
            androidx.appcompat.app.AppCompatActivity r7 = r1.getContext()
            gy3.C87412m.m108593f(r7, r8)
            rs1.s8 r7 = r14.mo12873f(r7)
            if (r7 == 0) goto L_0x0204
            int r7 = r7.f38096i
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0205
        L_0x0204:
            r7 = 0
        L_0x0205:
            rx3.l r8 = new rx3.l
            java.lang.String r12 = "comment_scene"
            r8.<init>(r12, r7)
            r7 = 3
            r10[r7] = r8
            java.util.Map r7 = sx3.C90364q0.m113147f(r10)
            r9.mo86149PM(r6, r7)
            di3.d r5 = di3.C86312j.m106911c(r5)
            l31.e r5 = (l31.C61212e) r5
            com.tencent.mm.plugin.finder.ui.y2 r7 = new com.tencent.mm.plugin.finder.ui.y2
            r7.<init>(r1, r6)
            r5.E60(r6, r7)
        L_0x0224:
            me3.f r2 = r2.getPresenter()
            com.tencent.mm.plugin.finder.ui.x2 r5 = new com.tencent.mm.plugin.finder.ui.x2
            r5.<init>(r1)
            me3.c r2 = (me3.C109612c) r2
            r2.f328162e = r5
            zp3.i0 r2 = r1.f161106T
            if (r2 == 0) goto L_0x0246
            me3.f r2 = r2.getPresenter()
            if (r2 == 0) goto L_0x0246
            ug.t r5 = p248ug.C111167t.TEXT
            me3.c r2 = (me3.C109612c) r2
            bh.b r2 = r2.mo160818b(r5)
            bh.k r2 = (p1093bh.C104101k) r2
            goto L_0x0247
        L_0x0246:
            r2 = 0
        L_0x0247:
            if (r2 != 0) goto L_0x024b
            goto L_0x044f
        L_0x024b:
            fi.g r5 = r2.mo145692c()
            fi.d r5 = (p520fi.C107547d) r5
            if (r5 != 0) goto L_0x0255
            goto L_0x044f
        L_0x0255:
            te3.wi0 r6 = r1.f161099L
            java.lang.String r7 = "#FFFFFF"
            if (r6 != 0) goto L_0x025c
            goto L_0x02af
        L_0x025c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "restore word size"
            r8.append(r9)
            java.util.LinkedList<te3.vi0> r9 = r6.f186122e
            int r9 = r9.size()
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r8)
            java.util.LinkedList<te3.vi0> r8 = r6.f186122e
            int r8 = r8.size()
            if (r8 != 0) goto L_0x027f
            goto L_0x02af
        L_0x027f:
            fi.g r8 = r2.mo145692c()
            fi.d r8 = (p520fi.C107547d) r8
            java.util.Stack r9 = r8.mo157990c(r13)
            if (r9 != 0) goto L_0x028d
            r9 = 1
            goto L_0x028e
        L_0x028d:
            r9 = 0
        L_0x028e:
            if (r9 == 0) goto L_0x0299
            fi.g r9 = r2.mo145692c()
            fi.d r9 = (p520fi.C107547d) r9
            r9.mo157977Z(r13)
        L_0x0299:
            java.util.Stack r8 = r8.mo157990c(r13)
            java.lang.String r9 = "cache.getStack(false)"
            gy3.C87412m.m108593f(r8, r9)
            boolean r8 = r8.isEmpty()
            r9 = 1
            r8 = r8 ^ r9
            if (r8 == 0) goto L_0x02b3
            java.lang.String r6 = "restore word skip"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r6)
        L_0x02af:
            r7 = 0
            r12 = 0
            goto L_0x040e
        L_0x02b3:
            java.util.LinkedList<te3.vi0> r6 = r6.f186122e
            java.util.Iterator r6 = r6.iterator()
        L_0x02b9:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x040c
            java.lang.Object r8 = r6.next()
            te3.vi0 r8 = (te3.C64775vi0) r8
            java.lang.String r9 = r8.f185905g     // Catch:{ IllegalArgumentException -> 0x02d1 }
            if (r9 != 0) goto L_0x02ca
            r9 = r7
        L_0x02ca:
            int r9 = android.graphics.Color.parseColor(r9)     // Catch:{ IllegalArgumentException -> 0x02d1 }
            r23 = r9
            goto L_0x02d3
        L_0x02d1:
            r23 = 0
        L_0x02d3:
            java.lang.String r9 = r8.f185906h     // Catch:{ IllegalArgumentException -> 0x02dd }
            if (r9 != 0) goto L_0x02d8
            r9 = r7
        L_0x02d8:
            int r9 = android.graphics.Color.parseColor(r9)     // Catch:{ IllegalArgumentException -> 0x02dd }
            goto L_0x02df
        L_0x02dd:
            r9 = 0
        L_0x02df:
            z20.f r10 = new z20.f
            android.content.Context r18 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Matrix r19 = r2.mo145696g()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            fi.g r14 = r2.mo145692c()
            fi.d r14 = (p520fi.C107547d) r14
            int r14 = r14.mo157975D1(r13)
            r12.append(r14)
            java.lang.String r14 = ""
            r12.append(r14)
            java.lang.String r20 = r12.toString()
            android.graphics.Rect r21 = r2.mo145691b()
            android.text.SpannableString r12 = new android.text.SpannableString
            java.lang.String r14 = r8.f185909n
            r12.<init>(r14)
            r24 = 0
            java.lang.String r25 = ""
            r17 = r10
            r22 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25)
            int r12 = r8.f185904f
            r14 = 2
            if (r12 != r14) goto L_0x0332
            java.lang.String r14 = r8.f185906h
            if (r14 == 0) goto L_0x032c
            int r14 = r14.length()
            if (r14 != 0) goto L_0x032a
            goto L_0x032c
        L_0x032a:
            r14 = 0
            goto L_0x032d
        L_0x032c:
            r14 = 1
        L_0x032d:
            if (r14 != 0) goto L_0x0332
            r10.f337111z = r9
            goto L_0x0338
        L_0x0332:
            r9 = 3
            if (r12 != r9) goto L_0x0338
            r9 = 1
            r10.f337104A = r9
        L_0x0338:
            r10.f337078u = r13
            r10.f337105B = r13
            android.graphics.Rect r9 = r2.f307886c
            int r9 = r9.width()
            r10.f337109F = r9
            float r9 = r8.f185902d
            android.graphics.Rect r12 = r2.f307886c
            int r12 = r12.width()
            float r12 = (float) r12
            float r9 = r9 * r12
            float r12 = r8.f185903e
            android.graphics.Rect r14 = r2.f307886c
            int r14 = r14.height()
            float r14 = (float) r14
            float r12 = r12 * r14
            zp3.i0 r14 = r1.f161106T
            if (r14 == 0) goto L_0x036f
            cq3.a r14 = r14.getBaseBoardView()
            cq3.g r14 = (cq3.C106961g) r14
            if (r14 == 0) goto L_0x036f
            int r14 = r14.getWidth()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            goto L_0x0370
        L_0x036f:
            r14 = 0
        L_0x0370:
            if (r14 == 0) goto L_0x0378
            int r15 = r14.intValue()
            if (r15 != 0) goto L_0x0382
        L_0x0378:
            android.graphics.Point r14 = r1.mo79100G6()
            int r14 = r14.x
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
        L_0x0382:
            int r15 = r8.f185908j
            float r13 = r8.f185907i
            int r14 = r14.intValue()
            android.graphics.Bitmap r0 = r10.mo164314g()
            android.graphics.Bitmap r0 = r10.mo164311d(r0)
            r10.f337067g = r0
            float r14 = (float) r14
            r18 = 1067030938(0x3f99999a, float:1.2)
            float r18 = r18 * r14
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r0 = r18 / r0
            r10.f337075r = r0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r14 = r14 * r0
            android.graphics.Bitmap r0 = r10.f337067g
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r14 = r14 / r0
            r10.f337076s = r14
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.f337072o = r0
            r10.f337070j = r15
            r10.f337071n = r13
            r0 = 3
            java.lang.Object[] r13 = new java.lang.Object[r0]
            float r14 = r10.f337075r
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r15 = 0
            r13[r15] = r14
            float r14 = r10.f337076s
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r15 = 1
            r13[r15] = r14
            float r14 = r10.f337072o
            java.lang.Float r14 = java.lang.Float.valueOf(r14)
            r16 = 2
            r13[r16] = r14
            java.lang.String r14 = "MicroMsg.EmojiItem"
            java.lang.String r0 = "MAX_SCALE:%s MIN_SCALE:%s mInitScale:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r14, r0, r13)
            android.graphics.PointF r0 = r10.f337069i
            r0.set(r9, r12)
            java.lang.Object[] r0 = new java.lang.Object[r15]
            android.graphics.PointF r9 = r10.f337069i
            r12 = 0
            r0[r12] = r9
            java.lang.String r9 = "[setPoint] point:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r14, r9, r0)
            r10.mo164318l()
            float r0 = r8.f185907i
            r10.f337071n = r0
            fi.g r0 = r2.mo145692c()
            fi.d r0 = (p520fi.C107547d) r0
            java.util.Stack r0 = r0.mo157990c(r12)
            if (r0 == 0) goto L_0x0407
            r0.add(r10)
        L_0x0407:
            r0 = r26
            r13 = 0
            goto L_0x02b9
        L_0x040c:
            r12 = 0
            r7 = 1
        L_0x040e:
            if (r7 == 0) goto L_0x0411
            r11 = 0
        L_0x0411:
            java.util.Stack r0 = r5.mo157990c(r12)
            r1.mo79109Y7(r11, r3, r0)
            r0 = 1
            java.util.Stack r6 = r5.mo157990c(r0)
            r1.mo79109Y7(r11, r3, r6)
            int r0 = r5.mo157975D1(r0)
            int r1 = r5.mo157975D1(r12)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "save alive "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r0 = " last "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r0)
            r2.mo145704o()
            goto L_0x044f
        L_0x0448:
            java.lang.String r0 = "coverEditorContent"
            gy3.C87412m.m108603p(r0)
            r0 = 0
            throw r0
        L_0x044f:
            return
        L_0x0450:
            r0 = r2
            gy3.C87412m.m108603p(r3)
            throw r0
        L_0x0455:
            r0 = r2
            gy3.C87412m.m108603p(r10)
            throw r0
        L_0x045a:
            r0 = r2
            gy3.C87412m.m108603p(r10)
            throw r0
        L_0x045f:
            r0 = r2
            gy3.C87412m.m108603p(r3)
            throw r0
        L_0x0464:
            r0 = r2
            gy3.C87412m.m108603p(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.p056ui.C56419s2.onGlobalLayout():void");
    }
}

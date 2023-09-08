package com.tencent.p014mm.plugin.finder.view;

/* renamed from: com.tencent.mm.plugin.finder.view.p */
public final class C4143p implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CollapsibleTextView f18366d;

    /* renamed from: e */
    public final /* synthetic */ boolean f18367e;

    public C4143p(CollapsibleTextView collapsibleTextView, boolean z) {
        this.f18366d = collapsibleTextView;
        this.f18367e = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a3, code lost:
        if (r7 < (r5 == null ? r5.length() : 0)) goto L_0x00cd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r0 = r11.f18366d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = r0.f17600n
            android.text.Layout r0 = r0.getLayout()
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            int r1 = r0.getLineCount()
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r2 = r11.f18366d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r2 = r2.f17600n
            int r2 = r2.getMaxLines()
            if (r1 <= r2) goto L_0x001a
            r1 = r2
        L_0x001a:
            r2 = 1
            int r1 = r1 - r2
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r1 = r0.getOffsetForHorizontal(r1, r3)
            float r0 = r0.getPrimaryHorizontal(r1)
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r1 = r11.f18366d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r1 = r1.f17600n
            int r1 = r1.getExtraEllipsizeWidth()
            float r1 = (float) r1
            float r0 = r0 + r1
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r1 = r11.f18366d
            android.widget.TextView r1 = r1.f17601o
            android.text.TextPaint r1 = r1.getPaint()
            boolean r3 = r11.f18367e
            if (r3 == 0) goto L_0x004b
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r3 = r11.f18366d
            android.content.Context r3 = r3.getContext()
            r4 = 2131823855(0x7f110cef, float:1.9280521E38)
            java.lang.String r3 = r3.getString(r4)
            goto L_0x0058
        L_0x004b:
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r3 = r11.f18366d
            android.content.Context r3 = r3.getContext()
            r4 = 2131826150(0x7f1115e6, float:1.9285176E38)
            java.lang.String r3 = r3.getString(r4)
        L_0x0058:
            float r1 = r1.measureText(r3)
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r3 = r3 * r1
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r4 = r11.f18366d
            int r4 = r4.getExpandLeftPadding()
            float r4 = (float) r4
            float r3 = r3 + r4
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r4 = r11.f18366d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r5 = r4.f17600n
            android.text.Layout r5 = r5.getLayout()
            r6 = 0
            int r7 = r4.f17599j     // Catch:{ Exception -> 0x0086 }
            int r8 = r5.getLineCount()     // Catch:{ Exception -> 0x0086 }
            if (r7 <= r8) goto L_0x007b
            r7 = r8
        L_0x007b:
            int r7 = r7 - r2
            if (r7 < 0) goto L_0x008b
            r8 = 1176256512(0x461c4000, float:10000.0)
            int r7 = r5.getOffsetForHorizontal(r7, r8)     // Catch:{ Exception -> 0x0086 }
            goto L_0x008c
        L_0x0086:
            r7 = move-exception
            boolean r8 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r8 != 0) goto L_0x0106
        L_0x008b:
            r7 = 0
        L_0x008c:
            android.widget.TextView r8 = r4.f17601o
            r8.getVisibility()
            if (r5 == 0) goto L_0x00a5
            if (r7 <= 0) goto L_0x00a5
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r5 = r4.f17600n
            java.lang.CharSequence r5 = r5.getText()
            if (r5 == 0) goto L_0x00a2
            int r5 = r5.length()
            goto L_0x00a3
        L_0x00a2:
            r5 = 0
        L_0x00a3:
            if (r7 < r5) goto L_0x00cd
        L_0x00a5:
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r5 = r4.f17600n
            android.text.TextUtils$TruncateAt r7 = r5.getEllipsize()
            if (r7 != 0) goto L_0x00b0
            boolean r2 = r5.f17613n
            goto L_0x00cb
        L_0x00b0:
            android.text.Layout r7 = r5.getLayout()
            if (r7 != 0) goto L_0x00b8
            r2 = 0
            goto L_0x00cb
        L_0x00b8:
            int r8 = r7.getLineCount()
            r9 = 0
        L_0x00bd:
            if (r9 >= r8) goto L_0x00c9
            int r10 = r7.getEllipsisCount(r9)
            if (r10 <= 0) goto L_0x00c6
            goto L_0x00cb
        L_0x00c6:
            int r9 = r9 + 1
            goto L_0x00bd
        L_0x00c9:
            boolean r2 = r5.f17613n
        L_0x00cb:
            if (r2 == 0) goto L_0x00d3
        L_0x00cd:
            android.widget.TextView r2 = r4.f17601o
            r2.setVisibility(r6)
            goto L_0x00da
        L_0x00d3:
            android.widget.TextView r2 = r4.f17601o
            r5 = 8
            r2.setVisibility(r5)
        L_0x00da:
            android.widget.TextView r2 = r4.f17601o
            r2.getVisibility()
            float r0 = r0 + r1
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r1 = r11.f18366d
            int r1 = r1.getWidth()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r0 = r11.f18366d
            android.widget.TextView r0 = r0.f17601o
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x00fe
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r0 = r11.f18366d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = r0.f17600n
            int r1 = (int) r3
            r0.setExtraEllipsizeWidth(r1)
            goto L_0x0105
        L_0x00fe:
            com.tencent.mm.plugin.finder.view.CollapsibleTextView r0 = r11.f18366d
            com.tencent.mm.plugin.finder.view.EllipsizedTextView r0 = r0.f17600n
            r0.setExtraEllipsizeWidth(r6)
        L_0x0105:
            return
        L_0x0106:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.view.C4143p.run():void");
    }
}

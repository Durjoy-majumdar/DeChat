package com.tencent.p014mm.plugin.game.widget;

import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.game.widget.EllipsizingTextView */
public class EllipsizingTextView extends TextView {

    /* renamed from: d */
    public final List<C69020a> f198363d = new ArrayList();

    /* renamed from: e */
    public boolean f198364e;

    /* renamed from: f */
    public boolean f198365f;

    /* renamed from: g */
    public boolean f198366g;

    /* renamed from: h */
    public String f198367h;

    /* renamed from: i */
    public int f198368i = -1;

    /* renamed from: j */
    public float f198369j = 1.0f;

    /* renamed from: n */
    public float f198370n = 0.0f;

    /* renamed from: com.tencent.mm.plugin.game.widget.EllipsizingTextView$a */
    public interface C69020a {
        /* renamed from: a */
        void mo95036a(boolean z);
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public final Layout mo95029a(String str) {
        return new StaticLayout(str, getPaint(), (getWidth() - getPaddingLeft()) - getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, this.f198369j, this.f198370n, false);
    }

    public int getMaxLines() {
        return this.f198368i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onDraw(android.graphics.Canvas r8) {
        /*
            r7 = this;
            boolean r0 = r7.f198365f
            if (r0 == 0) goto L_0x00bf
            r0 = 0
            super.setEllipsize(r0)
            int r0 = r7.getMaxLines()
            java.lang.String r1 = r7.f198367h
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 == r2) goto L_0x0088
            android.text.Layout r5 = r7.mo95029a(r1)
            int r6 = r5.getLineCount()
            if (r6 <= r0) goto L_0x0088
            java.lang.String r1 = r7.f198367h
            int r6 = r0 + -1
            int r5 = r5.getLineEnd(r6)
            java.lang.String r1 = r1.substring(r3, r5)
            java.lang.String r1 = r1.trim()
            byte[] r5 = r1.getBytes()
            int r5 = r5.length
            int r6 = r1.length()
            if (r5 == r6) goto L_0x003a
            r5 = 1
            goto L_0x003b
        L_0x003a:
            r5 = 0
        L_0x003b:
            java.lang.String r6 = "..."
            if (r5 != 0) goto L_0x0066
        L_0x003f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r1)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.text.Layout r5 = r7.mo95029a(r5)
            int r5 = r5.getLineCount()
            if (r5 <= r0) goto L_0x0077
            r5 = 32
            int r5 = r1.lastIndexOf(r5)
            if (r5 != r2) goto L_0x0061
            goto L_0x0077
        L_0x0061:
            java.lang.String r1 = r1.substring(r3, r5)
            goto L_0x003f
        L_0x0066:
            int r0 = r1.length()
            r2 = 2
            if (r0 < r2) goto L_0x0077
            int r0 = r1.length()
            int r0 = r0 - r4
            int r0 = r0 - r4
            java.lang.String r1 = r1.substring(r3, r0)
        L_0x0077:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = r0.toString()
            r0 = 1
            goto L_0x0089
        L_0x0088:
            r0 = 0
        L_0x0089:
            java.lang.CharSequence r2 = r7.getText()
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x009f
            r7.f198366g = r4
            r7.setText(r1)     // Catch:{ all -> 0x009b }
            r7.f198366g = r3
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            r7.f198366g = r3
            throw r8
        L_0x009f:
            r7.f198365f = r3
            boolean r1 = r7.f198364e
            if (r0 == r1) goto L_0x00bf
            r7.f198364e = r0
            java.util.List<com.tencent.mm.plugin.game.widget.EllipsizingTextView$a> r1 = r7.f198363d
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L_0x00af:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00bf
            java.lang.Object r2 = r1.next()
            com.tencent.mm.plugin.game.widget.EllipsizingTextView$a r2 = (com.tencent.p014mm.plugin.game.widget.EllipsizingTextView.C69020a) r2
            r2.mo95036a(r0)
            goto L_0x00af
        L_0x00bf:
            super.onDraw(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.game.widget.EllipsizingTextView.onDraw(android.graphics.Canvas):void");
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        if (!this.f198366g) {
            this.f198367h = charSequence.toString();
            this.f198365f = true;
        }
    }

    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
    }

    public void setLineSpacing(float f, float f2) {
        this.f198370n = f;
        this.f198369j = f2;
        super.setLineSpacing(f, f2);
    }

    public void setMaxLines(int i) {
        super.setMaxLines(i);
        this.f198368i = i;
        this.f198365f = true;
    }

    public EllipsizingTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

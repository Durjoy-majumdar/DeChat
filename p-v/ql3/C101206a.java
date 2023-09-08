package ql3;

import android.text.InputFilter;
import android.widget.TextView;
import gy3.C87412m;

/* renamed from: ql3.a */
public final class C101206a implements InputFilter {

    /* renamed from: d */
    public final TextView f296342d;

    /* renamed from: e */
    public int f296343e;

    /* renamed from: f */
    public boolean f296344f;

    public C101206a(TextView textView, int i) {
        C87412m.m108594g(textView, "mTextView");
        this.f296342d = textView;
        this.f296343e = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0086, code lost:
        if (r0 == r10[r10.length - 1].f295334a) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c0, code lost:
        if (r0 == r10.f295334a) goto L_0x008a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.CharSequence filter(java.lang.CharSequence r9, int r10, int r11, android.text.Spanned r12, int r13, int r14) {
        /*
            r8 = this;
            java.lang.String r10 = "dest"
            gy3.C87412m.m108594g(r12, r10)
            android.widget.TextView r10 = r8.f296342d
            boolean r10 = r10.isInEditMode()
            if (r10 != 0) goto L_0x017e
            if (r9 == 0) goto L_0x017e
            java.lang.String r10 = ""
            boolean r11 = gy3.C87412m.m108589b(r9, r10)
            if (r11 != 0) goto L_0x017e
            int r11 = r8.f296343e
            if (r11 != 0) goto L_0x001d
            goto L_0x017e
        L_0x001d:
            boolean r11 = r8.f296344f
            r12 = 1
            r13 = 0
            if (r11 != 0) goto L_0x00c8
            int r11 = r9.length()
            vl3.c r14 = vl3.C102226d.f301013a
            if (r14 == 0) goto L_0x0048
            com.tencent.mm.smiley.p0 r14 = com.tencent.p014mm.smiley.C96963p0.wx0()
            r14.getClass()
            boolean r14 = r9 instanceof android.text.Spannable
            if (r14 == 0) goto L_0x0048
            r14 = r9
            android.text.Spannable r14 = (android.text.Spannable) r14
            java.lang.Class<com.tencent.mm.smiley.u> r0 = com.tencent.p014mm.smiley.C72953u.class
            java.lang.Object[] r11 = r14.getSpans(r13, r11, r0)
            com.tencent.mm.smiley.u[] r11 = (com.tencent.p014mm.smiley.C72953u[]) r11
            if (r11 == 0) goto L_0x0048
            int r11 = r11.length
            if (r11 <= 0) goto L_0x0048
            r11 = 1
            goto L_0x0049
        L_0x0048:
            r11 = 0
        L_0x0049:
            if (r11 != 0) goto L_0x00c7
            android.widget.TextView r11 = r8.f296342d
            java.lang.CharSequence r11 = r11.getText()
            java.lang.String r14 = "mTextView.text"
            gy3.C87412m.m108593f(r11, r14)
            int r14 = r9.length()
            int r0 = r8.f296343e
            java.lang.Class<pl3.b> r1 = pl3.C100822b.class
            boolean r10 = gy3.C87412m.m108589b(r11, r10)
            java.lang.String r2 = "emojiInfoSpans"
            if (r10 == 0) goto L_0x008c
            boolean r10 = r9 instanceof android.text.Spanned
            if (r10 == 0) goto L_0x008c
            r10 = r9
            android.text.Spanned r10 = (android.text.Spanned) r10
            java.lang.Object[] r10 = r10.getSpans(r13, r14, r1)
            pl3.b[] r10 = (pl3.C100822b[]) r10
            gy3.C87412m.m108593f(r10, r2)
            int r11 = r10.length
            if (r11 != 0) goto L_0x007c
            r11 = 1
            goto L_0x007d
        L_0x007c:
            r11 = 0
        L_0x007d:
            r11 = r11 ^ r12
            if (r11 == 0) goto L_0x0088
            int r11 = r10.length
            int r11 = r11 - r12
            r10 = r10[r11]
            int r10 = r10.f295334a
            if (r0 == r10) goto L_0x008a
        L_0x0088:
            r10 = 1
            goto L_0x00c3
        L_0x008a:
            r10 = 0
            goto L_0x00c3
        L_0x008c:
            boolean r10 = r9 instanceof android.text.Spanned
            if (r10 == 0) goto L_0x0088
            r10 = r9
            android.text.Spanned r10 = (android.text.Spanned) r10
            java.lang.Object[] r10 = r10.getSpans(r13, r14, r1)
            pl3.b[] r10 = (pl3.C100822b[]) r10
            gy3.C87412m.m108593f(r10, r2)
            int r1 = r10.length
            if (r1 != 0) goto L_0x00a1
            r1 = 1
            goto L_0x00a2
        L_0x00a1:
            r1 = 0
        L_0x00a2:
            r1 = r1 ^ r12
            if (r1 == 0) goto L_0x0088
            int r1 = r11.length()
            int r2 = r9.length()
            if (r1 != r2) goto L_0x0088
            int r1 = r10.length
            int r1 = r1 - r12
            r10 = r10[r1]
            java.lang.CharSequence r11 = r11.subSequence(r13, r14)
            boolean r11 = r10.mo140271a(r11)
            r11 = r11 ^ r12
            if (r11 != 0) goto L_0x0088
            int r10 = r10.f295334a
            if (r0 == r10) goto L_0x008a
            goto L_0x0088
        L_0x00c3:
            if (r10 == 0) goto L_0x00c7
            r11 = 1
            goto L_0x00c8
        L_0x00c7:
            r11 = 0
        L_0x00c8:
            if (r11 == 0) goto L_0x017e
            boolean r10 = r8.f296344f
            if (r10 == 0) goto L_0x00d0
            r8.f296344f = r13
        L_0x00d0:
            int r10 = r9.length()
            android.widget.TextView r11 = r8.f296342d
            android.text.Layout r11 = r11.getLayout()
            r13 = 0
            if (r11 == 0) goto L_0x00ed
            android.widget.TextView r14 = r8.f296342d
            int r14 = r14.getLineCount()
            int r14 = r14 - r12
            int r11 = r11.getEllipsisCount(r14)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            goto L_0x00ee
        L_0x00ed:
            r11 = r13
        L_0x00ee:
            if (r11 == 0) goto L_0x0113
            int r12 = r11.intValue()
            if (r12 <= 0) goto L_0x0113
            android.widget.TextView r12 = r8.f296342d
            android.text.TextUtils$TruncateAt r12 = r12.getEllipsize()
            android.text.TextUtils$TruncateAt r14 = android.text.TextUtils.TruncateAt.END
            if (r12 != r14) goto L_0x0113
            int r12 = r9.length()
            int r14 = r11.intValue()
            if (r12 <= r14) goto L_0x0113
            int r10 = r9.length()
            int r11 = r11.intValue()
            int r10 = r10 - r11
        L_0x0113:
            r3 = r10
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.CharSequence) r9)
            if (r10 != 0) goto L_0x017e
            vl3.a r10 = new vl3.a
            r2 = 0
            int r4 = r8.f296343e
            r5 = 300(0x12c, float:4.2E-43)
            r6 = 1
            r7 = 0
            r0 = r10
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            vl3.c r11 = vl3.C102226d.f301013a
            if (r11 == 0) goto L_0x0146
            com.tencent.mm.smiley.p0 r11 = com.tencent.p014mm.smiley.C96963p0.wx0()
            r11.getClass()
            com.tencent.mm.smiley.e r12 = com.tencent.p014mm.smiley.C96931e.m124499a()
            vl3.b r13 = r12.mo135522b(r10)
            android.text.Spannable r12 = r13.f229807a
            int r14 = r10.f301007b
            int r0 = r10.f301008c
            int r1 = r10.f301009d
            r11.vx0(r12, r14, r0, r1)
        L_0x0146:
            int r11 = r13.f229808b
            java.lang.String r12 = "MicroMsg.EmojiInputFilter"
            if (r11 > 0) goto L_0x0152
            java.lang.String r10 = "filter:  no emoji actually, use source"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r10)
            goto L_0x017e
        L_0x0152:
            boolean r10 = r10.f301011f
            if (r10 == 0) goto L_0x017e
            android.text.Spannable r10 = r13.f229807a
            if (r10 == 0) goto L_0x017e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "filter:  had emoji actually, use span, source:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = " , view hash:"
            r10.append(r9)
            android.widget.TextView r9 = r8.f296342d
            int r9 = r9.hashCode()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r12, r9)
            android.text.Spannable r9 = r13.f229807a
        L_0x017e:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: ql3.C101206a.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}

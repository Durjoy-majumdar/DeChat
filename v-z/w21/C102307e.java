package w21;

import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.WXRTEditText;
import u21.C101955g;
import w21.C102310h;

/* renamed from: w21.e */
public abstract class C102307e<V, C extends C102310h<V>> extends C102323t<V, C> {
    /* renamed from: c */
    public C101955g mo141858c(WXRTEditText wXRTEditText) {
        return new C101955g(wXRTEditText);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0096 A[SYNTHETIC] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<java.lang.Object> mo141859d(android.text.Spannable r17, u21.C101955g r18, w21.C102320q r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            int r4 = r2.f300151d
            r5 = 1
            int r4 = r4 - r5
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            int r7 = r17.length()
            int r8 = r2.f300152e
            int r8 = r8 + r5
            int r7 = java.lang.Math.min(r7, r8)
            java.lang.Class<android.text.style.CharacterStyle> r8 = android.text.style.CharacterStyle.class
            java.lang.Object[] r4 = r1.getSpans(r4, r7, r8)
            int r7 = r4.length
            r8 = 0
        L_0x0027:
            if (r8 >= r7) goto L_0x0099
            r9 = r4[r8]
            boolean r10 = r9 instanceof com.tencent.p014mm.plugin.component.editor.model.nativenote.spans.BoldSpan
            if (r10 != 0) goto L_0x003f
            boolean r10 = r9 instanceof android.text.style.StyleSpan
            if (r10 == 0) goto L_0x003d
            r10 = r9
            android.text.style.StyleSpan r10 = (android.text.style.StyleSpan) r10
            int r10 = r10.getStyle()
            if (r10 != r5) goto L_0x003d
            goto L_0x003f
        L_0x003d:
            r10 = 0
            goto L_0x0040
        L_0x003f:
            r10 = 1
        L_0x0040:
            if (r10 == 0) goto L_0x0094
            int r10 = r1.getSpanStart(r9)
            int r11 = r1.getSpanEnd(r9)
            int r12 = r2.f300151d
            int r13 = r2.f300152e
            int r14 = java.lang.Math.max(r10, r12)
            int r15 = java.lang.Math.min(r11, r13)
            if (r14 <= r15) goto L_0x005c
            r13 = r19
        L_0x005a:
            r10 = 0
            goto L_0x008e
        L_0x005c:
            if (r14 >= r15) goto L_0x0062
        L_0x005e:
            r13 = r19
            r10 = 1
            goto L_0x008e
        L_0x0062:
            if (r10 <= r12) goto L_0x0066
            if (r11 < r13) goto L_0x005e
        L_0x0066:
            if (r12 <= r10) goto L_0x006b
            if (r13 >= r11) goto L_0x006b
            goto L_0x005e
        L_0x006b:
            w21.q r10 = w21.C102320q.EXACT
            r13 = r19
            if (r13 != r10) goto L_0x0072
            goto L_0x005a
        L_0x0072:
            int r10 = r1.getSpanFlags(r9)
            r10 = r10 & 51
            r14 = 2
            if (r11 != r12) goto L_0x0085
            int[] r11 = new int[r14]
            r11 = {34, 18} // fill-array
            boolean r10 = r0.mo141873e(r10, r11)
            goto L_0x008e
        L_0x0085:
            int[] r11 = new int[r14]
            r11 = {17, 18} // fill-array
            boolean r10 = r0.mo141873e(r10, r11)
        L_0x008e:
            if (r10 == 0) goto L_0x0096
            r3.add(r9)
            goto L_0x0096
        L_0x0094:
            r13 = r19
        L_0x0096:
            int r8 = r8 + 1
            goto L_0x0027
        L_0x0099:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.C102307e.mo141859d(android.text.Spannable, u21.g, w21.q):java.util.ArrayList");
    }
}

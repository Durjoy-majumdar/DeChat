package p268x1;

import android.text.Layout;
import gy3.C87412m;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import z04.C112550d0;

/* renamed from: x1.b */
public final class C111994b {

    /* renamed from: a */
    public final Layout f335254a;

    /* renamed from: b */
    public final List<Integer> f335255b;

    /* renamed from: c */
    public final List<Bidi> f335256c;

    /* renamed from: d */
    public final boolean[] f335257d;

    /* renamed from: e */
    public char[] f335258e;

    /* renamed from: x1.b$a */
    public static final class C38442a {

        /* renamed from: a */
        public final int f101399a;

        /* renamed from: b */
        public final int f101400b;

        /* renamed from: c */
        public final boolean f101401c;

        public C38442a(int i, int i2, boolean z) {
            this.f101399a = i;
            this.f101400b = i2;
            this.f101401c = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38442a)) {
                return false;
            }
            C38442a aVar = (C38442a) obj;
            return this.f101399a == aVar.f101399a && this.f101400b == aVar.f101400b && this.f101401c == aVar.f101401c;
        }

        public int hashCode() {
            int i = ((this.f101399a * 31) + this.f101400b) * 31;
            boolean z = this.f101401c;
            if (z) {
                z = true;
            }
            return i + (z ? 1 : 0);
        }

        public String toString() {
            return "BidiRun(start=" + this.f101399a + ", end=" + this.f101400b + ", isRtl=" + this.f101401c + ')';
        }
    }

    public C111994b(Layout layout) {
        C87412m.m108594g(layout, "layout");
        this.f335254a = layout;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        do {
            CharSequence text = this.f335254a.getText();
            C87412m.m108593f(text, "layout.text");
            int D = C112550d0.m153768D(text, 10, i, false, 4, (Object) null);
            i = D < 0 ? this.f335254a.getText().length() : D + 1;
            arrayList.add(Integer.valueOf(i));
        } while (i < this.f335254a.getText().length());
        this.f335255b = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList2.add((Object) null);
        }
        this.f335256c = arrayList2;
        this.f335257d = new boolean[this.f335255b.size()];
        this.f335255b.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01db, code lost:
        if (r14.getRunCount() == 1) goto L_0x01dd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x013a A[EDGE_INSN: B:219:0x013a->B:81:0x013a ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0138 A[LOOP:1: B:57:0x00ff->B:80:0x0138, LOOP_END] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float mo163664a(int r22, boolean r23, boolean r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            if (r24 != 0) goto L_0x0016
            if (r23 == 0) goto L_0x000f
            android.text.Layout r2 = r0.f335254a
            float r1 = r2.getPrimaryHorizontal(r1)
            goto L_0x0015
        L_0x000f:
            android.text.Layout r2 = r0.f335254a
            float r1 = r2.getSecondaryHorizontal(r1)
        L_0x0015:
            return r1
        L_0x0016:
            android.text.Layout r2 = r0.f335254a
            java.lang.String r3 = "<this>"
            gy3.C87412m.m108594g(r2, r3)
            r4 = -1
            r5 = 0
            if (r1 > 0) goto L_0x0023
            r2 = 0
            goto L_0x0052
        L_0x0023:
            java.lang.CharSequence r6 = r2.getText()
            int r6 = r6.length()
            if (r1 < r6) goto L_0x0033
            int r2 = r2.getLineCount()
            int r2 = r2 + r4
            goto L_0x0052
        L_0x0033:
            int r6 = r2.getLineForOffset(r1)
            int r7 = r2.getLineStart(r6)
            int r2 = r2.getLineEnd(r6)
            if (r7 == r1) goto L_0x0044
            if (r2 == r1) goto L_0x0044
            goto L_0x004d
        L_0x0044:
            if (r7 != r1) goto L_0x004b
            if (r24 == 0) goto L_0x004d
            int r6 = r6 + -1
            goto L_0x004d
        L_0x004b:
            if (r24 == 0) goto L_0x004f
        L_0x004d:
            r2 = r6
            goto L_0x0052
        L_0x004f:
            int r6 = r6 + 1
            goto L_0x004d
        L_0x0052:
            android.text.Layout r6 = r0.f335254a
            int r6 = r6.getLineStart(r2)
            android.text.Layout r7 = r0.f335254a
            int r7 = r7.getLineEnd(r2)
            if (r1 == r6) goto L_0x0072
            if (r1 == r7) goto L_0x0072
            if (r23 == 0) goto L_0x006b
            android.text.Layout r2 = r0.f335254a
            float r1 = r2.getPrimaryHorizontal(r1)
            goto L_0x0071
        L_0x006b:
            android.text.Layout r2 = r0.f335254a
            float r1 = r2.getSecondaryHorizontal(r1)
        L_0x0071:
            return r1
        L_0x0072:
            if (r1 == 0) goto L_0x0353
            android.text.Layout r8 = r0.f335254a
            java.lang.CharSequence r8 = r8.getText()
            int r8 = r8.length()
            if (r1 != r8) goto L_0x0082
            goto L_0x0353
        L_0x0082:
            java.util.List<java.lang.Integer> r8 = r0.f335255b
            java.lang.Integer r9 = java.lang.Integer.valueOf(r22)
            r10 = r8
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            int r10 = r10.size()
            gy3.C87412m.m108594g(r8, r3)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            int r3 = r8.size()
            java.lang.String r11 = ")."
            if (r10 < 0) goto L_0x0331
            if (r10 > r3) goto L_0x030f
            int r10 = r10 + r4
            r3 = 0
        L_0x00a0:
            r11 = 1
            if (r3 > r10) goto L_0x00ba
            int r12 = r3 + r10
            int r12 = r12 >>> r11
            java.lang.Object r13 = r8.get(r12)
            java.lang.Comparable r13 = (java.lang.Comparable) r13
            int r13 = ux3.C65486b.m77169a(r13, r9)
            if (r13 >= 0) goto L_0x00b5
            int r3 = r12 + 1
            goto L_0x00a0
        L_0x00b5:
            if (r13 <= 0) goto L_0x00bc
            int r10 = r12 + -1
            goto L_0x00a0
        L_0x00ba:
            int r3 = r3 + r11
            int r12 = -r3
        L_0x00bc:
            if (r12 >= 0) goto L_0x00c1
            int r12 = r12 + r11
            int r3 = -r12
            goto L_0x00c3
        L_0x00c1:
            int r3 = r12 + 1
        L_0x00c3:
            if (r24 == 0) goto L_0x00da
            if (r3 <= 0) goto L_0x00da
            java.util.List<java.lang.Integer> r8 = r0.f335255b
            int r9 = r3 + -1
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.lang.Object r8 = r8.get(r9)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r1 != r8) goto L_0x00da
            r3 = r9
        L_0x00da:
            android.text.Layout r8 = r0.f335254a
            if (r3 != 0) goto L_0x00e0
            r9 = 0
            goto L_0x00f0
        L_0x00e0:
            java.util.List<java.lang.Integer> r9 = r0.f335255b
            int r10 = r3 + -1
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        L_0x00f0:
            int r8 = r8.getLineForOffset(r9)
            android.text.Layout r9 = r0.f335254a
            int r8 = r9.getParagraphDirection(r8)
            if (r8 != r4) goto L_0x00fe
            r8 = 1
            goto L_0x00ff
        L_0x00fe:
            r8 = 0
        L_0x00ff:
            if (r7 <= 0) goto L_0x013a
            android.text.Layout r9 = r0.f335254a
            java.lang.CharSequence r9 = r9.getText()
            int r10 = r7 + -1
            char r9 = r9.charAt(r10)
            r12 = 32
            if (r9 == r12) goto L_0x0135
            r12 = 10
            if (r9 == r12) goto L_0x0135
            r12 = 5760(0x1680, float:8.071E-42)
            if (r9 == r12) goto L_0x0135
            r12 = 8192(0x2000, float:1.14794E-41)
            if (r12 > r9) goto L_0x0123
            r12 = 8203(0x200b, float:1.1495E-41)
            if (r9 >= r12) goto L_0x0123
            r12 = 1
            goto L_0x0124
        L_0x0123:
            r12 = 0
        L_0x0124:
            if (r12 == 0) goto L_0x012a
            r12 = 8199(0x2007, float:1.1489E-41)
            if (r9 != r12) goto L_0x0135
        L_0x012a:
            r12 = 8287(0x205f, float:1.1613E-41)
            if (r9 == r12) goto L_0x0135
            r12 = 12288(0x3000, float:1.7219E-41)
            if (r9 != r12) goto L_0x0133
            goto L_0x0135
        L_0x0133:
            r9 = 0
            goto L_0x0136
        L_0x0135:
            r9 = 1
        L_0x0136:
            if (r9 == 0) goto L_0x013a
            r7 = r10
            goto L_0x00ff
        L_0x013a:
            if (r3 != 0) goto L_0x013e
            r9 = 0
            goto L_0x014e
        L_0x013e:
            java.util.List<java.lang.Integer> r9 = r0.f335255b
            int r10 = r3 + -1
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r10)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        L_0x014e:
            int r10 = r6 - r9
            int r7 = r7 - r9
            boolean[] r9 = r0.f335257d
            boolean r9 = r9[r3]
            if (r9 == 0) goto L_0x0163
            java.util.List<java.text.Bidi> r9 = r0.f335256c
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r3 = r9.get(r3)
            java.text.Bidi r3 = (java.text.Bidi) r3
            goto L_0x01f5
        L_0x0163:
            if (r3 != 0) goto L_0x0167
            r9 = 0
            goto L_0x0177
        L_0x0167:
            java.util.List<java.lang.Integer> r9 = r0.f335255b
            int r13 = r3 + -1
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            java.lang.Object r9 = r9.get(r13)
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
        L_0x0177:
            java.util.List<java.lang.Integer> r13 = r0.f335255b
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r3)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r15 = r13 - r9
            char[] r14 = r0.f335258e
            if (r14 == 0) goto L_0x018e
            int r12 = r14.length
            if (r12 >= r15) goto L_0x0190
        L_0x018e:
            char[] r14 = new char[r15]
        L_0x0190:
            r12 = r14
            android.text.Layout r14 = r0.f335254a
            java.lang.CharSequence r14 = r14.getText()
            android.text.TextUtils.getChars(r14, r9, r13, r12, r5)
            boolean r9 = java.text.Bidi.requiresBidi(r12, r5, r15)
            if (r9 == 0) goto L_0x01dd
            android.text.Layout r9 = r0.f335254a
            if (r3 != 0) goto L_0x01a6
            r13 = 0
            goto L_0x01b6
        L_0x01a6:
            java.util.List<java.lang.Integer> r13 = r0.f335255b
            int r14 = r3 + -1
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.lang.Object r13 = r13.get(r14)
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
        L_0x01b6:
            int r9 = r9.getLineForOffset(r13)
            android.text.Layout r13 = r0.f335254a
            int r9 = r13.getParagraphDirection(r9)
            if (r9 != r4) goto L_0x01c5
            r20 = 1
            goto L_0x01c7
        L_0x01c5:
            r20 = 0
        L_0x01c7:
            java.text.Bidi r9 = new java.text.Bidi
            r16 = 0
            r17 = 0
            r18 = 0
            r14 = r9
            r13 = r15
            r15 = r12
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19, r20)
            int r13 = r9.getRunCount()
            if (r13 != r11) goto L_0x01de
        L_0x01dd:
            r9 = 0
        L_0x01de:
            java.util.List<java.text.Bidi> r13 = r0.f335256c
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            r13.set(r3, r9)
            boolean[] r13 = r0.f335257d
            r13[r3] = r11
            if (r9 == 0) goto L_0x01f2
            char[] r3 = r0.f335258e
            if (r12 != r3) goto L_0x01f1
            r12 = 0
            goto L_0x01f2
        L_0x01f1:
            r12 = r3
        L_0x01f2:
            r0.f335258e = r12
            r3 = r9
        L_0x01f5:
            if (r3 == 0) goto L_0x01fc
            java.text.Bidi r12 = r3.createLineBidi(r10, r7)
            goto L_0x01fd
        L_0x01fc:
            r12 = 0
        L_0x01fd:
            if (r12 == 0) goto L_0x02eb
            int r3 = r12.getRunCount()
            if (r3 != r11) goto L_0x0207
            goto L_0x02eb
        L_0x0207:
            int r3 = r12.getRunCount()
            x1.b$a[] r7 = new p268x1.C111994b.C38442a[r3]
            r9 = 0
        L_0x020e:
            if (r9 >= r3) goto L_0x022f
            x1.b$a r10 = new x1.b$a
            int r13 = r12.getRunStart(r9)
            int r13 = r13 + r6
            int r14 = r12.getRunLimit(r9)
            int r14 = r14 + r6
            int r15 = r12.getRunLevel(r9)
            int r15 = r15 % 2
            if (r15 != r11) goto L_0x0226
            r15 = 1
            goto L_0x0227
        L_0x0226:
            r15 = 0
        L_0x0227:
            r10.<init>(r13, r14, r15)
            r7[r9] = r10
            int r9 = r9 + 1
            goto L_0x020e
        L_0x022f:
            int r9 = r12.getRunCount()
            byte[] r10 = new byte[r9]
            r13 = 0
        L_0x0236:
            if (r13 >= r9) goto L_0x0242
            int r14 = r12.getRunLevel(r13)
            byte r14 = (byte) r14
            r10[r13] = r14
            int r13 = r13 + 1
            goto L_0x0236
        L_0x0242:
            java.text.Bidi.reorderVisually(r10, r5, r7, r5, r3)
            if (r1 != r6) goto L_0x0299
            r6 = 0
        L_0x0248:
            if (r6 >= r3) goto L_0x0259
            r9 = r7[r6]
            int r9 = r9.f101399a
            if (r9 != r1) goto L_0x0252
            r9 = 1
            goto L_0x0253
        L_0x0252:
            r9 = 0
        L_0x0253:
            if (r9 == 0) goto L_0x0256
            goto L_0x025a
        L_0x0256:
            int r6 = r6 + 1
            goto L_0x0248
        L_0x0259:
            r6 = -1
        L_0x025a:
            r1 = r7[r6]
            if (r23 != 0) goto L_0x0265
            boolean r1 = r1.f101401c
            if (r8 != r1) goto L_0x0263
            goto L_0x0265
        L_0x0263:
            r5 = r8
            goto L_0x0268
        L_0x0265:
            if (r8 != 0) goto L_0x0268
            r5 = 1
        L_0x0268:
            if (r6 != 0) goto L_0x0273
            if (r5 == 0) goto L_0x0273
            android.text.Layout r1 = r0.f335254a
            float r1 = r1.getLineLeft(r2)
            return r1
        L_0x0273:
            int r3 = r3 + r4
            if (r6 != r3) goto L_0x027f
            if (r5 != 0) goto L_0x027f
            android.text.Layout r1 = r0.f335254a
            float r1 = r1.getLineRight(r2)
            return r1
        L_0x027f:
            if (r5 == 0) goto L_0x028d
            android.text.Layout r1 = r0.f335254a
            int r6 = r6 - r11
            r2 = r7[r6]
            int r2 = r2.f101399a
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x028d:
            android.text.Layout r1 = r0.f335254a
            int r6 = r6 + r11
            r2 = r7[r6]
            int r2 = r2.f101399a
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x0299:
            r6 = 0
        L_0x029a:
            if (r6 >= r3) goto L_0x02ab
            r9 = r7[r6]
            int r9 = r9.f101400b
            if (r9 != r1) goto L_0x02a4
            r9 = 1
            goto L_0x02a5
        L_0x02a4:
            r9 = 0
        L_0x02a5:
            if (r9 == 0) goto L_0x02a8
            goto L_0x02ac
        L_0x02a8:
            int r6 = r6 + 1
            goto L_0x029a
        L_0x02ab:
            r6 = -1
        L_0x02ac:
            r1 = r7[r6]
            if (r23 != 0) goto L_0x02b9
            boolean r1 = r1.f101401c
            if (r8 != r1) goto L_0x02b5
            goto L_0x02b9
        L_0x02b5:
            if (r8 != 0) goto L_0x02ba
            r5 = 1
            goto L_0x02ba
        L_0x02b9:
            r5 = r8
        L_0x02ba:
            if (r6 != 0) goto L_0x02c5
            if (r5 == 0) goto L_0x02c5
            android.text.Layout r1 = r0.f335254a
            float r1 = r1.getLineLeft(r2)
            return r1
        L_0x02c5:
            int r3 = r3 + r4
            if (r6 != r3) goto L_0x02d1
            if (r5 != 0) goto L_0x02d1
            android.text.Layout r1 = r0.f335254a
            float r1 = r1.getLineRight(r2)
            return r1
        L_0x02d1:
            if (r5 == 0) goto L_0x02df
            android.text.Layout r1 = r0.f335254a
            int r6 = r6 - r11
            r2 = r7[r6]
            int r2 = r2.f101400b
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x02df:
            android.text.Layout r1 = r0.f335254a
            int r6 = r6 + r11
            r2 = r7[r6]
            int r2 = r2.f101400b
            float r1 = r1.getPrimaryHorizontal(r2)
            return r1
        L_0x02eb:
            android.text.Layout r3 = r0.f335254a
            boolean r3 = r3.isRtlCharAt(r6)
            if (r23 != 0) goto L_0x02f5
            if (r8 != r3) goto L_0x02fa
        L_0x02f5:
            if (r8 != 0) goto L_0x02f9
            r8 = 1
            goto L_0x02fa
        L_0x02f9:
            r8 = 0
        L_0x02fa:
            if (r1 != r6) goto L_0x02fe
            r5 = r8
            goto L_0x0301
        L_0x02fe:
            if (r8 != 0) goto L_0x0301
            r5 = 1
        L_0x0301:
            android.text.Layout r1 = r0.f335254a
            if (r5 == 0) goto L_0x030a
            float r1 = r1.getLineLeft(r2)
            goto L_0x030e
        L_0x030a:
            float r1 = r1.getLineRight(r2)
        L_0x030e:
            return r1
        L_0x030f:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "toIndex ("
            r2.append(r4)
            r2.append(r10)
            java.lang.String r4 = ") is greater than size ("
            r2.append(r4)
            r2.append(r3)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0331:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "fromIndex ("
            r2.append(r3)
            r2.append(r5)
            java.lang.String r3 = ") is greater than toIndex ("
            r2.append(r3)
            r2.append(r10)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0353:
            if (r23 == 0) goto L_0x035c
            android.text.Layout r2 = r0.f335254a
            float r1 = r2.getPrimaryHorizontal(r1)
            goto L_0x0362
        L_0x035c:
            android.text.Layout r2 = r0.f335254a
            float r1 = r2.getSecondaryHorizontal(r1)
        L_0x0362:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p268x1.C111994b.mo163664a(int, boolean, boolean):float");
    }
}

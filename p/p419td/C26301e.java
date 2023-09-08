package p419td;

import android.graphics.Bitmap;
import android.graphics.Rect;

/* renamed from: td.e */
public class C26301e {

    /* renamed from: a */
    public Bitmap f73260a;

    /* renamed from: b */
    public C26297d f73261b = new C26311l();

    /* renamed from: c */
    public Rect f73262c = new Rect();

    /* renamed from: d */
    public int[] f73263d = new int[4];

    public C26301e(int i, int i2) {
        i = i <= 0 ? 512 : i;
        i2 = i2 <= 0 ? 512 : i2;
        this.f73260a = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        C26311l lVar = (C26311l) this.f73261b;
        lVar.f73316c = i;
        lVar.f73317d = i2;
        lVar.mo53198a();
        this.f73262c.setEmpty();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0093 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo53175a(int r18, int r19, android.graphics.Rect r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            if (r1 <= 0) goto L_0x017f
            if (r2 > 0) goto L_0x0012
            goto L_0x017f
        L_0x0012:
            td.d r5 = r0.f73261b
            td.l r5 = (p419td.C26311l) r5
            r5.getClass()
            if (r1 <= 0) goto L_0x015e
            if (r2 > 0) goto L_0x001f
            goto L_0x015e
        L_0x001f:
            td.d$c r7 = r5.f73318e
            r7.f73256a = r4
            r7.f73257b = r4
            r7.f73258c = r1
            r7.f73259d = r2
            r8 = 2147483647(0x7fffffff, float:NaN)
            r9 = -1
            r10 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            r12 = -1
        L_0x0032:
            java.util.ArrayList<td.d$b> r13 = r5.f73314a
            int r13 = r13.size()
            if (r11 >= r13) goto L_0x0097
            java.util.ArrayList<td.d$b> r13 = r5.f73314a
            java.lang.Object r13 = r13.get(r11)
            td.d$b r13 = (p419td.C26297d.C26299b) r13
            int r14 = r13.f73253a
            int r13 = r13.f73254b
            int r14 = r14 + r1
            int r15 = r5.f73316c
            int r15 = r15 + r9
            if (r14 <= r15) goto L_0x004d
            goto L_0x0067
        L_0x004d:
            r14 = r1
            r15 = r11
        L_0x004f:
            if (r14 <= 0) goto L_0x0072
            java.util.ArrayList<td.d$b> r6 = r5.f73314a
            java.lang.Object r6 = r6.get(r15)
            td.d$b r6 = (p419td.C26297d.C26299b) r6
            int r4 = r6.f73254b
            if (r4 <= r13) goto L_0x005e
            r13 = r4
        L_0x005e:
            int r4 = r13 + r2
            r16 = r13
            int r13 = r5.f73317d
            int r13 = r13 + r9
            if (r4 <= r13) goto L_0x0069
        L_0x0067:
            r13 = -1
            goto L_0x0072
        L_0x0069:
            int r4 = r6.f73255c
            int r14 = r14 - r4
            int r15 = r15 + 1
            r13 = r16
            r4 = 0
            goto L_0x004f
        L_0x0072:
            if (r13 < 0) goto L_0x0093
            java.util.ArrayList<td.d$b> r4 = r5.f73314a
            java.lang.Object r4 = r4.get(r11)
            td.d$b r4 = (p419td.C26297d.C26299b) r4
            int r6 = r13 + r2
            if (r6 < r8) goto L_0x0088
            if (r6 != r8) goto L_0x0093
            int r14 = r4.f73255c
            if (r14 <= 0) goto L_0x0093
            if (r14 >= r10) goto L_0x0093
        L_0x0088:
            int r8 = r4.f73255c
            int r4 = r4.f73253a
            r7.f73256a = r4
            r7.f73257b = r13
            r10 = r8
            r12 = r11
            r8 = r6
        L_0x0093:
            int r11 = r11 + 1
            r4 = 0
            goto L_0x0032
        L_0x0097:
            if (r12 != r9) goto L_0x00a4
            r7.f73256a = r9
            r7.f73257b = r9
            r4 = 0
            r7.f73258c = r4
            r7.f73259d = r4
            goto L_0x0149
        L_0x00a4:
            td.d$a r4 = r5.f73315b
            java.util.Queue<td.d$b> r4 = r4.f73252a
            java.util.LinkedList r4 = (java.util.LinkedList) r4
            java.lang.Object r4 = r4.poll()
            td.d$b r4 = (p419td.C26297d.C26299b) r4
            if (r4 != 0) goto L_0x00b7
            td.d$b r4 = new td.d$b
            r4.<init>()
        L_0x00b7:
            int r6 = r7.f73256a
            r4.f73253a = r6
            int r6 = r7.f73257b
            int r6 = r6 + r2
            r4.f73254b = r6
            r4.f73255c = r1
            java.util.ArrayList<td.d$b> r6 = r5.f73314a
            r6.add(r12, r4)
        L_0x00c7:
            r4 = 1
            int r12 = r12 + r4
            java.util.ArrayList<td.d$b> r4 = r5.f73314a
            int r4 = r4.size()
            if (r12 >= r4) goto L_0x010a
            java.util.ArrayList<td.d$b> r4 = r5.f73314a
            java.lang.Object r4 = r4.get(r12)
            td.d$b r4 = (p419td.C26297d.C26299b) r4
            java.util.ArrayList<td.d$b> r6 = r5.f73314a
            int r8 = r12 + -1
            java.lang.Object r6 = r6.get(r8)
            td.d$b r6 = (p419td.C26297d.C26299b) r6
            int r10 = r4.f73253a
            int r11 = r6.f73253a
            int r6 = r6.f73255c
            int r11 = r11 + r6
            if (r10 >= r11) goto L_0x010a
            int r11 = r11 - r10
            int r10 = r10 + r11
            r4.f73253a = r10
            int r6 = r4.f73255c
            int r6 = r6 - r11
            r4.f73255c = r6
            if (r6 > 0) goto L_0x010a
            java.util.ArrayList<td.d$b> r4 = r5.f73314a
            java.lang.Object r4 = r4.remove(r12)
            td.d$b r4 = (p419td.C26297d.C26299b) r4
            td.d$a r6 = r5.f73315b
            java.util.Queue<td.d$b> r6 = r6.f73252a
            java.util.LinkedList r6 = (java.util.LinkedList) r6
            r6.offer(r4)
            r12 = r8
            goto L_0x00c7
        L_0x010a:
            r4 = 0
        L_0x010b:
            java.util.ArrayList<td.d$b> r6 = r5.f73314a
            int r6 = r6.size()
            int r6 = r6 + r9
            if (r4 >= r6) goto L_0x0149
            java.util.ArrayList<td.d$b> r6 = r5.f73314a
            java.lang.Object r6 = r6.get(r4)
            td.d$b r6 = (p419td.C26297d.C26299b) r6
            java.util.ArrayList<td.d$b> r8 = r5.f73314a
            int r10 = r4 + 1
            java.lang.Object r8 = r8.get(r10)
            td.d$b r8 = (p419td.C26297d.C26299b) r8
            int r11 = r6.f73254b
            int r12 = r8.f73254b
            if (r11 != r12) goto L_0x0146
            int r11 = r6.f73255c
            int r8 = r8.f73255c
            int r11 = r11 + r8
            r6.f73255c = r11
            java.util.ArrayList<td.d$b> r6 = r5.f73314a
            java.lang.Object r6 = r6.remove(r10)
            td.d$b r6 = (p419td.C26297d.C26299b) r6
            td.d$a r8 = r5.f73315b
            java.util.Queue<td.d$b> r8 = r8.f73252a
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            r8.offer(r6)
            int r4 = r4 + -1
        L_0x0146:
            r6 = 1
            int r4 = r4 + r6
            goto L_0x010b
        L_0x0149:
            int r4 = r7.f73256a
            if (r4 < 0) goto L_0x015a
            int r5 = r7.f73257b
            if (r5 >= 0) goto L_0x0152
            goto L_0x015a
        L_0x0152:
            int r1 = r1 + r4
            int r1 = r1 + r9
            int r2 = r2 + r5
            int r2 = r2 + r9
            r3.set(r4, r5, r1, r2)
            goto L_0x0161
        L_0x015a:
            r20.setEmpty()
            goto L_0x0161
        L_0x015e:
            r20.setEmpty()
        L_0x0161:
            int r1 = r3.left
            if (r1 < 0) goto L_0x017d
            int r1 = r3.right
            if (r1 < 0) goto L_0x017d
            int r1 = r20.width()
            if (r1 <= 0) goto L_0x017d
            int r1 = r20.height()
            if (r1 > 0) goto L_0x0176
            goto L_0x017d
        L_0x0176:
            android.graphics.Rect r1 = r0.f73262c
            r1.union(r3)
            r1 = 1
            return r1
        L_0x017d:
            r1 = 0
            return r1
        L_0x017f:
            r1 = 0
            r20.setEmpty()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p419td.C26301e.mo53175a(int, int, android.graphics.Rect):boolean");
    }
}

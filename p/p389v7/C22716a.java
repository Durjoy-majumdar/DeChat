package p389v7;

import androidx.exifinterface.media.ExifInterface;
import java.util.List;
import p383t7.C22440b;

/* renamed from: v7.a */
public final class C22716a extends C22440b {

    /* renamed from: m */
    public final C22717b f65300m;

    public C22716a(List<byte[]> list) {
        super("DvbDecoder");
        byte[] bArr = list.get(0);
        int length = bArr.length;
        int i = 0 + 1;
        int i2 = i + 1;
        this.f65300m = new C22717b(((bArr[0] & ExifInterface.MARKER) << 8) | (bArr[i] & ExifInterface.MARKER), (bArr[i2 + 1] & ExifInterface.MARKER) | ((bArr[i2] & ExifInterface.MARKER) << 8));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:89:0x027a, code lost:
        if ((r1.f65316b + 1) == r3.f65310g.getHeight()) goto L_0x0291;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public p383t7.C22442d mo14895f(byte[] r49, int r50, boolean r51) {
        /*
            r48 = this;
            r0 = r48
            r1 = 0
            if (r51 == 0) goto L_0x0026
            v7.b r2 = r0.f65300m
            v7.b$h r2 = r2.f65309f
            android.util.SparseArray<v7.b$f> r3 = r2.f65344c
            r3.clear()
            android.util.SparseArray<v7.b$a> r3 = r2.f65345d
            r3.clear()
            android.util.SparseArray<v7.b$c> r3 = r2.f65346e
            r3.clear()
            android.util.SparseArray<v7.b$a> r3 = r2.f65347f
            r3.clear()
            android.util.SparseArray<v7.b$c> r3 = r2.f65348g
            r3.clear()
            r2.f65349h = r1
            r2.f65350i = r1
        L_0x0026:
            v7.c r2 = new v7.c
            v7.b r3 = r0.f65300m
            r3.getClass()
            e8.l r4 = new e8.l
            r5 = r49
            r6 = r50
            r4.<init>(r5, r6)
        L_0x0036:
            int r5 = r4.mo32085b()
            r6 = 48
            r7 = 3
            r8 = 2
            r9 = 1
            if (r5 < r6) goto L_0x024f
            r5 = 8
            int r6 = r4.mo32087d(r5)
            r11 = 15
            if (r6 != r11) goto L_0x024f
            v7.b$h r6 = r3.f65309f
            int r11 = r4.mo32087d(r5)
            r12 = 16
            int r13 = r4.mo32087d(r12)
            int r14 = r4.mo32087d(r12)
            int r15 = r4.f57807c
            if (r15 != 0) goto L_0x0061
            r15 = 1
            goto L_0x0062
        L_0x0061:
            r15 = 0
        L_0x0062:
            p333e8.C20528a.m22240d(r15)
            int r15 = r4.f57806b
            int r15 = r15 + r14
            int r1 = r14 * 8
            int r10 = r4.mo32085b()
            if (r1 <= r10) goto L_0x0079
            int r1 = r4.mo32085b()
            r4.mo32089f(r1)
            goto L_0x024c
        L_0x0079:
            r1 = 4
            switch(r11) {
                case 16: goto L_0x01cd;
                case 17: goto L_0x0107;
                case 18: goto L_0x00e5;
                case 19: goto L_0x00c3;
                case 20: goto L_0x007f;
                default: goto L_0x007d;
            }
        L_0x007d:
            goto L_0x022d
        L_0x007f:
            int r5 = r6.f65342a
            if (r13 != r5) goto L_0x022d
            r4.mo32089f(r1)
            boolean r1 = r4.mo32086c()
            r4.mo32089f(r7)
            int r17 = r4.mo32087d(r12)
            int r18 = r4.mo32087d(r12)
            if (r1 == 0) goto L_0x00b0
            int r1 = r4.mo32087d(r12)
            int r5 = r4.mo32087d(r12)
            int r7 = r4.mo32087d(r12)
            int r8 = r4.mo32087d(r12)
            r19 = r1
            r20 = r5
            r21 = r7
            r22 = r8
            goto L_0x00b8
        L_0x00b0:
            r20 = r17
            r22 = r18
            r19 = 0
            r21 = 0
        L_0x00b8:
            v7.b$b r1 = new v7.b$b
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22)
            r6.f65349h = r1
            goto L_0x022d
        L_0x00c3:
            int r1 = r6.f65342a
            if (r13 != r1) goto L_0x00d4
            v7.b$c r1 = p389v7.C22717b.m26610f(r4)
            android.util.SparseArray<v7.b$c> r5 = r6.f65346e
            int r6 = r1.f65321a
            r5.put(r6, r1)
            goto L_0x022d
        L_0x00d4:
            int r1 = r6.f65343b
            if (r13 != r1) goto L_0x022d
            v7.b$c r1 = p389v7.C22717b.m26610f(r4)
            android.util.SparseArray<v7.b$c> r5 = r6.f65348g
            int r6 = r1.f65321a
            r5.put(r6, r1)
            goto L_0x022d
        L_0x00e5:
            int r1 = r6.f65342a
            if (r13 != r1) goto L_0x00f6
            v7.b$a r1 = p389v7.C22717b.m26609e(r4, r14)
            android.util.SparseArray<v7.b$a> r5 = r6.f65345d
            int r6 = r1.f65311a
            r5.put(r6, r1)
            goto L_0x022d
        L_0x00f6:
            int r1 = r6.f65343b
            if (r13 != r1) goto L_0x022d
            v7.b$a r1 = p389v7.C22717b.m26609e(r4, r14)
            android.util.SparseArray<v7.b$a> r5 = r6.f65347f
            int r6 = r1.f65311a
            r5.put(r6, r1)
            goto L_0x022d
        L_0x0107:
            v7.b$d r10 = r6.f65350i
            int r11 = r6.f65342a
            if (r13 != r11) goto L_0x022d
            if (r10 == 0) goto L_0x022d
            int r11 = r4.mo32087d(r5)
            r4.mo32089f(r1)
            boolean r18 = r4.mo32086c()
            r4.mo32089f(r7)
            int r19 = r4.mo32087d(r12)
            int r20 = r4.mo32087d(r12)
            int r21 = r4.mo32087d(r7)
            int r22 = r4.mo32087d(r7)
            r4.mo32089f(r8)
            int r23 = r4.mo32087d(r5)
            int r24 = r4.mo32087d(r5)
            int r25 = r4.mo32087d(r1)
            int r26 = r4.mo32087d(r8)
            r4.mo32089f(r8)
            int r14 = r14 + -10
            android.util.SparseArray r7 = new android.util.SparseArray
            r7.<init>()
        L_0x014a:
            if (r14 <= 0) goto L_0x0192
            int r13 = r4.mo32087d(r12)
            int r12 = r4.mo32087d(r8)
            int r29 = r4.mo32087d(r8)
            r5 = 12
            int r30 = r4.mo32087d(r5)
            r4.mo32089f(r1)
            int r31 = r4.mo32087d(r5)
            int r14 = r14 + -6
            if (r12 == r9) goto L_0x0171
            if (r12 != r8) goto L_0x016c
            goto L_0x0171
        L_0x016c:
            r32 = 0
            r33 = 0
            goto L_0x0181
        L_0x0171:
            r5 = 8
            int r16 = r4.mo32087d(r5)
            int r17 = r4.mo32087d(r5)
            int r14 = r14 + -2
            r32 = r16
            r33 = r17
        L_0x0181:
            v7.b$g r5 = new v7.b$g
            r27 = r5
            r28 = r12
            r27.<init>(r28, r29, r30, r31, r32, r33)
            r7.put(r13, r5)
            r5 = 8
            r12 = 16
            goto L_0x014a
        L_0x0192:
            v7.b$f r1 = new v7.b$f
            r16 = r1
            r17 = r11
            r27 = r7
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            int r5 = r10.f65326b
            if (r5 != 0) goto L_0x01c5
            android.util.SparseArray<v7.b$f> r5 = r6.f65344c
            java.lang.Object r5 = r5.get(r11)
            v7.b$f r5 = (p389v7.C22717b.C22723f) r5
            if (r5 != 0) goto L_0x01ac
            goto L_0x01c5
        L_0x01ac:
            android.util.SparseArray<v7.b$g> r5 = r5.f65339j
            r7 = 0
        L_0x01af:
            int r8 = r5.size()
            if (r7 >= r8) goto L_0x01c5
            android.util.SparseArray<v7.b$g> r8 = r1.f65339j
            int r10 = r5.keyAt(r7)
            java.lang.Object r11 = r5.valueAt(r7)
            r8.put(r10, r11)
            int r7 = r7 + 1
            goto L_0x01af
        L_0x01c5:
            android.util.SparseArray<v7.b$f> r5 = r6.f65344c
            int r6 = r1.f65330a
            r5.put(r6, r1)
            goto L_0x022d
        L_0x01cd:
            int r5 = r6.f65342a
            if (r13 != r5) goto L_0x022d
            v7.b$d r5 = r6.f65350i
            r7 = 8
            int r10 = r4.mo32087d(r7)
            int r1 = r4.mo32087d(r1)
            int r11 = r4.mo32087d(r8)
            r4.mo32089f(r8)
            int r14 = r14 + -2
            android.util.SparseArray r8 = new android.util.SparseArray
            r8.<init>()
        L_0x01eb:
            if (r14 <= 0) goto L_0x020c
            int r12 = r4.mo32087d(r7)
            r4.mo32089f(r7)
            r13 = 16
            int r7 = r4.mo32087d(r13)
            int r9 = r4.mo32087d(r13)
            int r14 = r14 + -6
            v7.b$e r13 = new v7.b$e
            r13.<init>(r7, r9)
            r8.put(r12, r13)
            r7 = 8
            r9 = 1
            goto L_0x01eb
        L_0x020c:
            v7.b$d r7 = new v7.b$d
            r7.<init>(r10, r1, r11, r8)
            if (r11 == 0) goto L_0x0225
            r6.f65350i = r7
            android.util.SparseArray<v7.b$f> r1 = r6.f65344c
            r1.clear()
            android.util.SparseArray<v7.b$a> r1 = r6.f65345d
            r1.clear()
            android.util.SparseArray<v7.b$c> r1 = r6.f65346e
            r1.clear()
            goto L_0x022d
        L_0x0225:
            if (r5 == 0) goto L_0x022d
            int r5 = r5.f65325a
            if (r5 == r1) goto L_0x022d
            r6.f65350i = r7
        L_0x022d:
            int r1 = r4.f57807c
            if (r1 != 0) goto L_0x0233
            r1 = 1
            goto L_0x0234
        L_0x0233:
            r1 = 0
        L_0x0234:
            p333e8.C20528a.m22240d(r1)
            int r1 = r4.f57806b
            int r15 = r15 - r1
            int r1 = r4.f57807c
            if (r1 != 0) goto L_0x0240
            r9 = 1
            goto L_0x0241
        L_0x0240:
            r9 = 0
        L_0x0241:
            p333e8.C20528a.m22240d(r9)
            int r1 = r4.f57806b
            int r1 = r1 + r15
            r4.f57806b = r1
            r4.mo32084a()
        L_0x024c:
            r1 = 0
            goto L_0x0036
        L_0x024f:
            v7.b$h r1 = r3.f65309f
            v7.b$d r4 = r1.f65350i
            if (r4 != 0) goto L_0x025c
            java.util.List r1 = java.util.Collections.emptyList()
            r0 = r2
            goto L_0x043f
        L_0x025c:
            v7.b$b r1 = r1.f65349h
            if (r1 == 0) goto L_0x0261
            goto L_0x0263
        L_0x0261:
            v7.b$b r1 = r3.f65307d
        L_0x0263:
            android.graphics.Bitmap r4 = r3.f65310g
            if (r4 == 0) goto L_0x027d
            int r5 = r1.f65315a
            r6 = 1
            int r5 = r5 + r6
            int r4 = r4.getWidth()
            if (r5 != r4) goto L_0x027e
            int r4 = r1.f65316b
            int r4 = r4 + r6
            android.graphics.Bitmap r5 = r3.f65310g
            int r5 = r5.getHeight()
            if (r4 == r5) goto L_0x0291
            goto L_0x027e
        L_0x027d:
            r6 = 1
        L_0x027e:
            int r4 = r1.f65315a
            int r4 = r4 + r6
            int r5 = r1.f65316b
            int r5 = r5 + r6
            android.graphics.Bitmap$Config r6 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r4, r5, r6)
            r3.f65310g = r4
            android.graphics.Canvas r5 = r3.f65306c
            r5.setBitmap(r4)
        L_0x0291:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            v7.b$h r5 = r3.f65309f
            v7.b$d r5 = r5.f65350i
            android.util.SparseArray<v7.b$e> r5 = r5.f65327c
            r6 = 0
        L_0x029d:
            int r9 = r5.size()
            if (r6 >= r9) goto L_0x043c
            java.lang.Object r9 = r5.valueAt(r6)
            v7.b$e r9 = (p389v7.C22717b.C22722e) r9
            int r10 = r5.keyAt(r6)
            v7.b$h r11 = r3.f65309f
            android.util.SparseArray<v7.b$f> r11 = r11.f65344c
            java.lang.Object r10 = r11.get(r10)
            v7.b$f r10 = (p389v7.C22717b.C22723f) r10
            int r11 = r9.f65328a
            int r12 = r1.f65317c
            int r11 = r11 + r12
            int r9 = r9.f65329b
            int r12 = r1.f65319e
            int r9 = r9 + r12
            int r12 = r10.f65332c
            int r12 = r12 + r11
            int r13 = r1.f65318d
            int r12 = java.lang.Math.min(r12, r13)
            int r13 = r10.f65333d
            int r13 = r13 + r9
            int r14 = r1.f65320f
            int r13 = java.lang.Math.min(r13, r14)
            android.graphics.Canvas r14 = r3.f65306c
            float r15 = (float) r11
            float r8 = (float) r9
            float r12 = (float) r12
            float r13 = (float) r13
            android.graphics.Region$Op r21 = android.graphics.Region.Op.REPLACE
            r16 = r14
            r17 = r15
            r18 = r8
            r19 = r12
            r20 = r13
            r16.clipRect(r17, r18, r19, r20, r21)
            v7.b$h r12 = r3.f65309f
            android.util.SparseArray<v7.b$a> r12 = r12.f65345d
            int r13 = r10.f65335f
            java.lang.Object r12 = r12.get(r13)
            v7.b$a r12 = (p389v7.C22717b.C22718a) r12
            if (r12 != 0) goto L_0x0306
            v7.b$h r12 = r3.f65309f
            android.util.SparseArray<v7.b$a> r12 = r12.f65347f
            int r13 = r10.f65335f
            java.lang.Object r12 = r12.get(r13)
            v7.b$a r12 = (p389v7.C22717b.C22718a) r12
            if (r12 != 0) goto L_0x0306
            v7.b$a r12 = r3.f65308e
        L_0x0306:
            android.util.SparseArray<v7.b$g> r13 = r10.f65339j
            r14 = 0
        L_0x0309:
            int r7 = r13.size()
            if (r14 >= r7) goto L_0x039c
            int r7 = r13.keyAt(r14)
            java.lang.Object r16 = r13.valueAt(r14)
            r0 = r16
            v7.b$g r0 = (p389v7.C22717b.C22724g) r0
            r23 = r5
            v7.b$h r5 = r3.f65309f
            android.util.SparseArray<v7.b$c> r5 = r5.f65346e
            java.lang.Object r5 = r5.get(r7)
            v7.b$c r5 = (p389v7.C22717b.C22720c) r5
            if (r5 != 0) goto L_0x0333
            v7.b$h r5 = r3.f65309f
            android.util.SparseArray<v7.b$c> r5 = r5.f65348g
            java.lang.Object r5 = r5.get(r7)
            v7.b$c r5 = (p389v7.C22717b.C22720c) r5
        L_0x0333:
            if (r5 == 0) goto L_0x037f
            boolean r7 = r5.f65322b
            if (r7 == 0) goto L_0x033d
            r16 = r13
            r7 = 0
            goto L_0x0341
        L_0x033d:
            android.graphics.Paint r7 = r3.f65304a
            r16 = r13
        L_0x0341:
            int r13 = r10.f65334e
            r31 = r2
            int r2 = r0.f65340a
            int r2 = r2 + r11
            int r0 = r0.f65341b
            int r0 = r0 + r9
            r32 = r6
            android.graphics.Canvas r6 = r3.f65306c
            r33 = r4
            r4 = 3
            if (r13 != r4) goto L_0x0357
            int[] r4 = r12.f65314d
            goto L_0x035f
        L_0x0357:
            r4 = 2
            if (r13 != r4) goto L_0x035d
            int[] r4 = r12.f65313c
            goto L_0x035f
        L_0x035d:
            int[] r4 = r12.f65312b
        L_0x035f:
            r34 = r1
            byte[] r1 = r5.f65323c
            r24 = r1
            r25 = r4
            r26 = r13
            r27 = r2
            r28 = r0
            r29 = r7
            r30 = r6
            p389v7.C22717b.m26608d(r24, r25, r26, r27, r28, r29, r30)
            byte[] r1 = r5.f65324d
            r5 = 1
            int r28 = r0 + 1
            r24 = r1
            p389v7.C22717b.m26608d(r24, r25, r26, r27, r28, r29, r30)
            goto L_0x038a
        L_0x037f:
            r34 = r1
            r31 = r2
            r33 = r4
            r32 = r6
            r16 = r13
            r5 = 1
        L_0x038a:
            int r14 = r14 + 1
            r0 = r48
            r13 = r16
            r5 = r23
            r2 = r31
            r6 = r32
            r4 = r33
            r1 = r34
            goto L_0x0309
        L_0x039c:
            r34 = r1
            r31 = r2
            r33 = r4
            r23 = r5
            r32 = r6
            r5 = 1
            boolean r0 = r10.f65331b
            if (r0 == 0) goto L_0x03e9
            int r0 = r10.f65334e
            r1 = 3
            if (r0 != r1) goto L_0x03b8
            int[] r0 = r12.f65314d
            int r2 = r10.f65336g
            r0 = r0[r2]
            r2 = 2
            goto L_0x03c8
        L_0x03b8:
            r2 = 2
            if (r0 != r2) goto L_0x03c2
            int[] r0 = r12.f65313c
            int r4 = r10.f65337h
            r0 = r0[r4]
            goto L_0x03c8
        L_0x03c2:
            int[] r0 = r12.f65312b
            int r4 = r10.f65338i
            r0 = r0[r4]
        L_0x03c8:
            android.graphics.Paint r4 = r3.f65305b
            r4.setColor(r0)
            android.graphics.Canvas r0 = r3.f65306c
            int r4 = r10.f65332c
            int r4 = r4 + r11
            float r4 = (float) r4
            int r6 = r10.f65333d
            int r6 = r6 + r9
            float r6 = (float) r6
            android.graphics.Paint r7 = r3.f65305b
            r16 = r0
            r17 = r15
            r18 = r8
            r19 = r4
            r20 = r6
            r21 = r7
            r16.drawRect(r17, r18, r19, r20, r21)
            goto L_0x03eb
        L_0x03e9:
            r1 = 3
            r2 = 2
        L_0x03eb:
            android.graphics.Bitmap r0 = r3.f65310g
            int r4 = r10.f65332c
            int r6 = r10.f65333d
            android.graphics.Bitmap r38 = android.graphics.Bitmap.createBitmap(r0, r11, r9, r4, r6)
            t7.a r0 = new t7.a
            r4 = r34
            int r6 = r4.f65315a
            float r6 = (float) r6
            float r42 = r15 / r6
            r43 = 0
            int r7 = r4.f65316b
            float r7 = (float) r7
            float r39 = r8 / r7
            r41 = 0
            int r8 = r10.f65332c
            float r8 = (float) r8
            float r44 = r8 / r6
            int r6 = r10.f65333d
            float r6 = (float) r6
            float r45 = r6 / r7
            r36 = 0
            r37 = 0
            r40 = 0
            r46 = 0
            r47 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r35 = r0
            r35.<init>(r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r6 = r33
            r6.add(r0)
            android.graphics.Canvas r0 = r3.f65306c
            android.graphics.PorterDuff$Mode r7 = android.graphics.PorterDuff.Mode.CLEAR
            r8 = 0
            r0.drawColor(r8, r7)
            int r0 = r32 + 1
            r1 = r4
            r4 = r6
            r5 = r23
            r2 = r31
            r7 = 3
            r8 = 2
            r6 = r0
            r0 = r48
            goto L_0x029d
        L_0x043c:
            r6 = r4
            r0 = r2
            r1 = r6
        L_0x043f:
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p389v7.C22716a.mo14895f(byte[], int, boolean):t7.d");
    }
}

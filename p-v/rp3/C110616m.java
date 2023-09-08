package rp3;

import androidx.exifinterface.media.ExifInterface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* renamed from: rp3.m */
public class C110616m {

    /* renamed from: a */
    public int f330936a = 35;

    /* renamed from: b */
    public int f330937b = 0;

    /* renamed from: c */
    public int f330938c = 6;

    /* renamed from: d */
    public int f330939d = 0;

    /* renamed from: e */
    public float f330940e = 1.2f;

    /* renamed from: f */
    public float f330941f = 1.2f;

    /* renamed from: g */
    public int f330942g = 0;

    /* renamed from: h */
    public int f330943h = 0;

    /* renamed from: i */
    public boolean f330944i = false;

    /* renamed from: j */
    public int f330945j = 0;

    /* renamed from: k */
    public ByteBuffer f330946k = ByteBuffer.allocate(6125);

    /* renamed from: l */
    public ByteBuffer f330947l = ByteBuffer.allocate(6125);

    /* renamed from: m */
    public float[] f330948m = new float[6];

    /* renamed from: n */
    public ArrayList<C110619p> f330949n = new ArrayList<>();

    /* renamed from: o */
    public int[] f330950o = new int[10];

    /* renamed from: p */
    public int[] f330951p = new int[10];

    /* renamed from: q */
    public boolean f330952q = false;

    /* renamed from: a */
    public final int mo162182a(ByteBuffer byteBuffer, int i, int i2) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i3 = i2;
        byte b = byteBuffer2.get(i3) & ExifInterface.MARKER;
        byte b2 = byteBuffer2.get(i3 - 1) & ExifInterface.MARKER;
        byte b3 = byteBuffer2.get(i3 - 2) & ExifInterface.MARKER;
        byte b4 = byteBuffer2.get(i3 + 1) & ExifInterface.MARKER;
        byte b5 = byteBuffer2.get(i3 + 2) & ExifInterface.MARKER;
        int i4 = i3 - i;
        byte b6 = byteBuffer2.get(i4) & ExifInterface.MARKER;
        int i5 = i * 2;
        int i6 = i3 - i5;
        byte b7 = byteBuffer2.get(i6) & ExifInterface.MARKER;
        int i7 = i3 + i;
        byte b8 = byteBuffer2.get(i7) & ExifInterface.MARKER;
        int i8 = i3 + i5;
        byte b9 = byteBuffer2.get(i8) & ExifInterface.MARKER;
        byte b15 = byteBuffer2.get(i4 - 1) & ExifInterface.MARKER;
        byte b16 = byteBuffer2.get(i6 - 2) & ExifInterface.MARKER;
        byte b17 = byteBuffer2.get(i7 + 1) & ExifInterface.MARKER;
        byte b18 = byteBuffer2.get(i8 + 2) & ExifInterface.MARKER;
        byte b19 = byteBuffer2.get(i4 + 1) & ExifInterface.MARKER;
        byte b25 = byteBuffer2.get(i6 + 2) & ExifInterface.MARKER;
        int i9 = b * 4;
        int i15 = (i9 - b2) - b3;
        int i16 = (i9 - b6) - b7;
        return Math.abs((i15 - b4) - b5) + Math.abs((i16 - b8) - b9) + Math.abs((((i9 - b15) - b16) - b17) - b18) + Math.abs((((i9 - b19) - b25) - (byteBuffer2.get(i7 - 1) & ExifInterface.MARKER)) - (byteBuffer2.get(i8 - 2) & ExifInterface.MARKER)) + Math.abs((i16 - b4) - b5) + Math.abs((i15 - b8) - b9) + Math.abs((i15 - b6) - b7) + Math.abs((((i9 - b8) - b9) - b4) - b5);
    }

    /* renamed from: b */
    public final float mo162183b(float f, float f2) {
        float f3 = 0.0f;
        if (f2 >= 80.0f && f2 >= 120.0f) {
            f3 = 0.5f;
        }
        return (f < 0.8f ? 4.0f : f < 1.5f ? 3.6f : f < 2.4f ? 3.2f : 2.8f) - f3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:126:0x041a  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0480  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo162184c(byte[] r35, int r36, int r37) {
        /*
            r34 = this;
            r0 = r34
            r1 = r36
            r2 = r37
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r35)
            r5 = 0
            if (r3 == 0) goto L_0x04bc
            if (r1 == 0) goto L_0x04bc
            if (r2 == 0) goto L_0x04bc
            r6 = 320(0x140, float:4.48E-43)
            if (r1 < r6) goto L_0x04bc
            r6 = 100
            if (r2 < r6) goto L_0x04bc
            r6 = 1280(0x500, float:1.794E-42)
            if (r1 > r6) goto L_0x04bc
            r6 = 720(0x2d0, float:1.009E-42)
            if (r2 <= r6) goto L_0x0023
            goto L_0x04bc
        L_0x0023:
            r6 = 5
            r7 = 1
            if (r1 == 0) goto L_0x0033
            int r8 = r0.f330942g
            if (r1 != r8) goto L_0x0033
            int r8 = r0.f330943h
            if (r2 == r8) goto L_0x0030
            goto L_0x0033
        L_0x0030:
            r0.f330952q = r5
            goto L_0x0059
        L_0x0033:
            r0.f330942g = r1
            r0.f330943h = r2
            r0.f330952q = r7
            java.nio.ByteBuffer r8 = r0.f330947l
            if (r8 != 0) goto L_0x0049
            int r8 = r0.f330936a
            int r8 = r8 * r8
            int r8 = r8 * 5
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            r0.f330947l = r8
        L_0x0049:
            java.nio.ByteBuffer r8 = r0.f330946k
            if (r8 != 0) goto L_0x0059
            int r8 = r0.f330936a
            int r8 = r8 * r8
            int r8 = r8 * 5
            java.nio.ByteBuffer r8 = java.nio.ByteBuffer.allocate(r8)
            r0.f330946k = r8
        L_0x0059:
            rp3.o[] r8 = new rp3.C110618o[r6]
            int[] r9 = new int[r7]
            r9[r5] = r5
            int r10 = r1 / 2
            int r11 = r0.f330936a
            int r12 = r10 - r11
            int r13 = r2 / 3
            int r11 = r13 - r11
            double r14 = java.lang.Math.random()
            double r6 = (double) r11
            double r14 = r14 * r6
            int r11 = (int) r14
            double r14 = java.lang.Math.random()
            double r4 = (double) r12
            double r14 = r14 * r4
            int r14 = (int) r14
            int[] r15 = r0.f330950o
            r16 = 0
            r15[r16] = r11
            r11 = 1
            r15[r11] = r14
            double r14 = java.lang.Math.random()
            double r14 = r14 * r6
            int r11 = (int) r14
            double r14 = java.lang.Math.random()
            double r14 = r14 * r4
            r17 = r8
            r18 = r9
            double r8 = (double) r10
            double r14 = r14 + r8
            int r10 = (int) r14
            int[] r14 = r0.f330950o
            r15 = 2
            r14[r15] = r11
            r11 = 3
            r14[r11] = r10
            double r19 = java.lang.Math.random()
            double r19 = r19 * r6
            double r13 = (double) r13
            double r13 = r19 + r13
            int r10 = (int) r13
            double r13 = java.lang.Math.random()
            int r12 = r12 * 2
            double r11 = (double) r12
            double r13 = r13 * r11
            int r11 = (int) r13
            int[] r12 = r0.f330950o
            r13 = 4
            r12[r13] = r10
            r10 = 5
            r12[r10] = r11
            double r10 = java.lang.Math.random()
            double r10 = r10 * r6
            int r12 = r2 * 2
            r13 = 3
            int r12 = r12 / r13
            double r12 = (double) r12
            double r10 = r10 + r12
            int r10 = (int) r10
            double r20 = java.lang.Math.random()
            double r14 = r20 * r4
            int r14 = (int) r14
            int[] r15 = r0.f330950o
            r11 = 6
            r15[r11] = r10
            r10 = 7
            r15[r10] = r14
            double r14 = java.lang.Math.random()
            double r14 = r14 * r6
            double r14 = r14 + r12
            int r6 = (int) r14
            double r12 = java.lang.Math.random()
            double r12 = r12 * r4
            double r12 = r12 + r8
            int r4 = (int) r12
            int[] r5 = r0.f330950o
            r7 = 8
            r5[r7] = r6
            r6 = 9
            r5[r6] = r4
            int r4 = r0.f330937b
            r5 = 1
            int r4 = r4 + r5
            r0.f330937b = r4
            int r5 = r0.f330938c
            int r4 = r4 % r5
            if (r4 != 0) goto L_0x00fd
            r4 = 1
            goto L_0x00fe
        L_0x00fd:
            r4 = 0
        L_0x00fe:
            r0.f330944i = r4
            r4 = 0
        L_0x0101:
            r7 = 5
            if (r4 >= r7) goto L_0x034a
            int[] r7 = r0.f330951p
            int r8 = r4 * 2
            r9 = r7[r8]
            int r10 = r8 + 1
            r7 = r7[r10]
            int[] r12 = r0.f330950o
            r13 = r12[r8]
            r12 = r12[r10]
            rp3.o r14 = new rp3.o
            r14.<init>()
            if (r7 < 0) goto L_0x0121
            if (r9 < 0) goto L_0x0121
            if (r7 >= r1) goto L_0x0121
            if (r9 < r2) goto L_0x0128
        L_0x0121:
            r15 = 1
            r14.f330958b = r15
            r15 = 1132396544(0x437f0000, float:255.0)
            r14.f330957a = r15
        L_0x0128:
            r15 = 0
            r21 = r18[r15]
            boolean r15 = r0.f330952q
            if (r15 != 0) goto L_0x01a8
            r23 = r21
            r15 = 0
            r21 = 0
            r22 = 0
        L_0x0136:
            int r6 = r0.f330936a
            if (r15 >= r6) goto L_0x01a1
            r11 = r23
            r6 = 0
        L_0x013d:
            int r5 = r0.f330936a
            if (r6 >= r5) goto L_0x0197
            int r5 = r7 + r6
            int r23 = r9 + r15
            int r23 = r23 * r1
            int r5 = r5 + r23
            int r23 = r12 + r6
            int r24 = r13 + r15
            int r24 = r24 * r1
            int r2 = r23 + r24
            byte r23 = r3.get(r5)
            byte r5 = r3.get(r5)
            if (r23 >= 0) goto L_0x015d
            int r5 = r5 + 255
        L_0x015d:
            r24 = r10
            java.nio.ByteBuffer r10 = r0.f330946k
            byte r10 = r10.get(r11)
            if (r10 >= 0) goto L_0x0170
            java.nio.ByteBuffer r10 = r0.f330946k
            byte r10 = r10.get(r11)
            int r10 = r10 + 255
            goto L_0x0176
        L_0x0170:
            java.nio.ByteBuffer r10 = r0.f330946k
            byte r10 = r10.get(r11)
        L_0x0176:
            int r10 = r10 - r5
            int r10 = java.lang.Math.abs(r10)
            int r21 = r21 + r10
            int r22 = r22 + r5
            java.nio.ByteBuffer r5 = r0.f330946k
            byte r2 = r3.get(r2)
            r5.put(r11, r2)
            java.nio.ByteBuffer r2 = r0.f330947l
            byte r5 = (byte) r10
            r2.put(r11, r5)
            int r11 = r11 + 1
            int r6 = r6 + 1
            r2 = r37
            r10 = r24
            goto L_0x013d
        L_0x0197:
            r24 = r10
            int r15 = r15 + 1
            r2 = r37
            r23 = r11
            r11 = 6
            goto L_0x0136
        L_0x01a1:
            r24 = r10
            r2 = r21
            r5 = r22
            goto L_0x01df
        L_0x01a8:
            r24 = r10
            r2 = 0
        L_0x01ab:
            int r5 = r0.f330936a
            if (r2 >= r5) goto L_0x01db
            r6 = r21
            r5 = 0
        L_0x01b2:
            int r10 = r0.f330936a
            if (r5 >= r10) goto L_0x01d6
            int r10 = r12 + r5
            int r11 = r13 + r2
            int r11 = r11 * r1
            int r10 = r10 + r11
            r11 = 0
            int r15 = java.lang.Math.abs(r11)
            java.nio.ByteBuffer r11 = r0.f330946k
            byte r10 = r3.get(r10)
            r11.put(r6, r10)
            java.nio.ByteBuffer r10 = r0.f330947l
            byte r11 = (byte) r15
            r10.put(r6, r11)
            int r6 = r6 + 1
            int r5 = r5 + 1
            goto L_0x01b2
        L_0x01d6:
            int r2 = r2 + 1
            r21 = r6
            goto L_0x01ab
        L_0x01db:
            r23 = r21
            r2 = 0
            r5 = 0
        L_0x01df:
            r6 = 0
            r18[r6] = r23
            float r2 = (float) r2
            int r10 = r0.f330936a
            int r11 = r10 * r10
            float r11 = (float) r11
            float r2 = r2 / r11
            r14.f330957a = r2
            float r2 = (float) r5
            float r2 = r2 / r11
            r14.f330959c = r2
            r14.f330958b = r6
            boolean r2 = r0.f330944i
            if (r2 == 0) goto L_0x02f0
            boolean r2 = r0.f330952q
            if (r2 != 0) goto L_0x02f0
            int r10 = r10 / 5
            r2 = 0
        L_0x01fc:
            if (r2 >= r10) goto L_0x02f0
            r5 = 0
        L_0x01ff:
            if (r5 >= r10) goto L_0x02de
            int r6 = r2 * 5
            int r11 = r9 + r6
            int r15 = r5 * 5
            int r21 = r7 + r15
            int r22 = r21 + 2
            int r23 = r11 + 2
            int r23 = r23 * r1
            r25 = r7
            int r7 = r22 + r23
            int r22 = r15 + 2
            int r23 = r6 + 2
            r26 = r9
            int r9 = r0.f330936a
            int r23 = r23 * r9
            int r22 = r22 + r23
            int r23 = r4 * r9
            int r23 = r23 * r9
            int r9 = r22 + r23
            int r7 = r0.mo162182a(r3, r1, r7)
            r22 = r10
            java.nio.ByteBuffer r10 = r0.f330947l
            r23 = r12
            int r12 = r0.f330936a
            int r9 = r0.mo162182a(r10, r12, r9)
            r30 = r8
            r8 = 5
            r10 = 0
            r12 = 0
            r27 = 0
            r28 = 0
            r29 = 0
        L_0x0240:
            if (r10 >= r8) goto L_0x02a0
            r31 = r13
            r13 = 0
        L_0x0245:
            if (r13 >= r8) goto L_0x0296
            int r8 = r21 + r13
            int r32 = r11 + r10
            int r32 = r32 * r1
            int r8 = r8 + r32
            int r32 = r15 + r13
            int r33 = r6 + r10
            int r1 = r0.f330936a
            int r33 = r33 * r1
            int r32 = r32 + r33
            int r33 = r4 * r1
            int r33 = r33 * r1
            int r1 = r32 + r33
            r32 = r6
            byte r6 = r3.get(r8)
            float r6 = (float) r6
            float r27 = r27 + r6
            java.nio.ByteBuffer r6 = r0.f330947l
            byte r6 = r6.get(r1)
            float r6 = (float) r6
            float r29 = r29 + r6
            byte r6 = r3.get(r8)
            byte r8 = r3.get(r8)
            int r6 = r6 * r8
            float r6 = (float) r6
            float r12 = r12 + r6
            java.nio.ByteBuffer r6 = r0.f330947l
            byte r6 = r6.get(r1)
            java.nio.ByteBuffer r8 = r0.f330947l
            byte r1 = r8.get(r1)
            int r6 = r6 * r1
            float r1 = (float) r6
            float r28 = r28 + r1
            int r13 = r13 + 1
            r1 = r36
            r6 = r32
            r8 = 5
            goto L_0x0245
        L_0x0296:
            r32 = r6
            int r10 = r10 + 1
            r1 = r36
            r13 = r31
            r8 = 5
            goto L_0x0240
        L_0x02a0:
            r31 = r13
            r1 = 25
            float r1 = (float) r1
            float r12 = r12 / r1
            float r27 = r27 / r1
            float r27 = r27 * r27
            float r12 = r12 - r27
            float r28 = r28 / r1
            float r29 = r29 / r1
            float r29 = r29 * r29
            float r28 = r28 - r29
            r1 = 1073741824(0x40000000, float:2.0)
            float r6 = r28 / r1
            rp3.p r1 = new rp3.p
            r8 = 0
            r1.<init>(r8, r7, r12)
            rp3.p r7 = new rp3.p
            r8 = 1
            r7.<init>(r8, r9, r6)
            java.util.ArrayList<rp3.p> r6 = r0.f330949n
            r6.add(r1)
            java.util.ArrayList<rp3.p> r1 = r0.f330949n
            r1.add(r7)
            int r5 = r5 + 1
            r1 = r36
            r10 = r22
            r12 = r23
            r7 = r25
            r9 = r26
            r8 = r30
            goto L_0x01ff
        L_0x02de:
            r25 = r7
            r30 = r8
            r26 = r9
            r22 = r10
            r23 = r12
            r31 = r13
            int r2 = r2 + 1
            r1 = r36
            goto L_0x01fc
        L_0x02f0:
            r30 = r8
            r23 = r12
            r31 = r13
            float r1 = r0.f330940e
            float r2 = r14.f330959c
            float r1 = r0.mo162183b(r1, r2)
            float r2 = r14.f330959c
            r5 = 1123024896(0x42f00000, float:120.0)
            int r6 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            r7 = 1
            if (r6 >= 0) goto L_0x0309
            r14.f330960d = r7
        L_0x0309:
            if (r6 >= 0) goto L_0x031d
            float r6 = r14.f330957a
            float r8 = r0.f330940e
            float r8 = r8 * r1
            r9 = 1058642330(0x3f19999a, float:0.6)
            float r8 = r8 * r9
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x031d
            r14.f330958b = r7
            goto L_0x0339
        L_0x031d:
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x0339
            float r5 = r14.f330957a
            float r6 = r0.f330940e
            float r6 = r6 * r1
            r1 = 1059481190(0x3f266666, float:0.65)
            float r6 = r6 * r1
            int r1 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x0336
            r1 = 1132068864(0x437a0000, float:250.0)
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x0339
        L_0x0336:
            r1 = 1
            r14.f330958b = r1
        L_0x0339:
            r17[r4] = r14
            int[] r1 = r0.f330951p
            r1[r30] = r31
            r1[r24] = r23
            int r4 = r4 + 1
            r1 = r36
            r2 = r37
            r11 = 6
            goto L_0x0101
        L_0x034a:
            r1 = 0
            r2 = r17[r1]
            int r1 = r2.f330958b
            r3 = 1
            r4 = r17[r3]
            int r3 = r4.f330958b
            int r1 = r1 + r3
            r3 = 2
            r3 = r17[r3]
            int r5 = r3.f330958b
            int r1 = r1 + r5
            r5 = 3
            r6 = r17[r5]
            int r5 = r6.f330958b
            int r1 = r1 + r5
            r5 = 4
            r7 = r17[r5]
            int r5 = r7.f330958b
            int r1 = r1 + r5
            float r5 = r2.f330959c
            float r8 = r4.f330959c
            float r5 = r5 + r8
            float r8 = r3.f330959c
            float r5 = r5 + r8
            float r8 = r6.f330959c
            float r5 = r5 + r8
            float r8 = r7.f330959c
            float r5 = r5 + r8
            r8 = 1084227584(0x40a00000, float:5.0)
            float r5 = r5 / r8
            float r9 = r2.f330957a
            float r10 = r4.f330957a
            float r9 = r9 + r10
            float r10 = r3.f330957a
            float r9 = r9 + r10
            float r10 = r6.f330957a
            float r9 = r9 + r10
            float r10 = r7.f330957a
            float r9 = r9 + r10
            float r9 = r9 / r8
            int r2 = r2.f330960d
            int r4 = r4.f330960d
            int r2 = r2 + r4
            int r3 = r3.f330960d
            int r2 = r2 + r3
            int r3 = r6.f330960d
            int r2 = r2 + r3
            int r3 = r7.f330960d
            int r2 = r2 + r3
            boolean r3 = r0.f330944i
            if (r3 == 0) goto L_0x048d
            boolean r3 = r0.f330952q
            if (r3 != 0) goto L_0x048d
            java.util.ArrayList<rp3.p> r3 = r0.f330949n
            rp3.l r6 = new rp3.l
            r6.<init>(r0)
            java.util.Collections.sort(r3, r6)
            java.util.ArrayList<rp3.p> r3 = r0.f330949n
            if (r3 == 0) goto L_0x040b
            int r6 = r3.size()
            r7 = 16
            if (r6 >= r7) goto L_0x03b4
            goto L_0x040b
        L_0x03b4:
            r6 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
        L_0x03b9:
            if (r6 >= r7) goto L_0x03df
            java.lang.Object r13 = r3.get(r6)
            rp3.p r13 = (rp3.C110619p) r13
            boolean r14 = r13.f330961a
            float r13 = r13.f330963c
            r36 = r5
            double r4 = (double) r13
            r17 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r15 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x03d1
            int r7 = r7 + -1
            goto L_0x03da
        L_0x03d1:
            if (r14 != 0) goto L_0x03d7
            float r11 = r11 + r13
            int r8 = r8 + 1
            goto L_0x03da
        L_0x03d7:
            float r12 = r12 + r13
            int r10 = r10 + 1
        L_0x03da:
            int r6 = r6 + 1
            r5 = r36
            goto L_0x03b9
        L_0x03df:
            r36 = r5
            if (r8 == 0) goto L_0x03e7
            float r3 = (float) r8
            float r3 = r11 / r3
            goto L_0x03ea
        L_0x03e7:
            r3 = 1067030938(0x3f99999a, float:1.2)
        L_0x03ea:
            if (r10 == 0) goto L_0x03f0
            float r4 = (float) r10
            float r4 = r12 / r4
            goto L_0x03f3
        L_0x03f0:
            r4 = 1067030938(0x3f99999a, float:1.2)
        L_0x03f3:
            if (r7 == 0) goto L_0x040d
            float r5 = (float) r10
            float r6 = (float) r7
            float r5 = r5 / r6
            r7 = 1073741824(0x40000000, float:2.0)
            float r10 = r3 / r7
            float r10 = r10 + r4
            float r5 = r5 * r10
            float r8 = (float) r8
            float r8 = r8 / r6
            float r4 = r4 / r7
            r6 = 1080033280(0x40600000, float:3.5)
            float r3 = r3 / r6
            float r4 = r4 + r3
            float r8 = r8 * r4
            float r3 = r5 + r8
            goto L_0x0410
        L_0x040b:
            r36 = r5
        L_0x040d:
            r3 = 1067030938(0x3f99999a, float:1.2)
        L_0x0410:
            java.util.ArrayList<rp3.p> r4 = r0.f330949n
            r4.clear()
            int r4 = r0.f330945j
            r5 = 6
            if (r4 != r5) goto L_0x0480
            float[] r3 = r0.f330948m
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x041f:
            if (r5 >= r4) goto L_0x0427
            r7 = r3[r5]
            float r6 = r6 + r7
            int r5 = r5 + 1
            goto L_0x041f
        L_0x0427:
            int r3 = r3.length
            float r3 = (float) r3
            float r6 = r6 / r3
            r3 = 1082130432(0x40800000, float:4.0)
            r4 = 0
            r0.f330945j = r4
            int r5 = r0.f330937b
            r7 = 7200(0x1c20, float:1.009E-41)
            if (r5 <= r7) goto L_0x045a
            r5 = 35
            r0.f330936a = r5
            r5 = 1067030938(0x3f99999a, float:1.2)
            r0.f330940e = r5
            r0.f330941f = r5
            r0.f330939d = r4
            r0.f330937b = r4
            r0.f330944i = r4
            r0.f330945j = r4
            r4 = 6
            r0.f330938c = r4
            java.util.ArrayList<rp3.p> r4 = r0.f330949n
            r4.clear()
            java.nio.ByteBuffer r4 = r0.f330946k
            r4.clear()
            java.nio.ByteBuffer r4 = r0.f330947l
            r4.clear()
        L_0x045a:
            float r4 = r0.f330941f
            float r4 = r6 - r4
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x047b
            r3 = 1082549862(0x40866666, float:4.2)
            int r4 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r4 <= 0) goto L_0x0470
            r6 = 1082549862(0x40866666, float:4.2)
        L_0x0470:
            float r3 = r0.f330941f
            r4 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 * r4
            float r6 = r6 * r4
            float r3 = r3 + r6
            r0.f330940e = r3
        L_0x047b:
            float r3 = r0.f330940e
            r0.f330941f = r3
            goto L_0x048f
        L_0x0480:
            float[] r5 = r0.f330948m
            r6 = 1073741824(0x40000000, float:2.0)
            float r3 = r3 * r6
            r5[r4] = r3
            r3 = 1
            int r4 = r4 + r3
            r0.f330945j = r4
            goto L_0x048f
        L_0x048d:
            r36 = r5
        L_0x048f:
            float r3 = r0.f330940e
            r5 = r36
            float r3 = r0.mo162183b(r3, r5)
            float r4 = r0.f330940e
            float r4 = r4 * r3
            r3 = 1067030938(0x3f99999a, float:1.2)
            float r4 = r4 * r3
            int r3 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r3 > 0) goto L_0x04b7
            r3 = 3
            if (r1 >= r3) goto L_0x04b7
            r1 = 4
            if (r2 < r1) goto L_0x04ab
            goto L_0x04b8
        L_0x04ab:
            int r2 = r0.f330939d
            r3 = 5
            if (r2 <= r3) goto L_0x04b2
            r4 = 0
            goto L_0x04be
        L_0x04b2:
            r3 = 1
            int r2 = r2 + r3
            r0.f330939d = r2
            goto L_0x04bd
        L_0x04b7:
            r1 = 4
        L_0x04b8:
            r2 = 0
            r0.f330939d = r2
            goto L_0x04bd
        L_0x04bc:
            r1 = 4
        L_0x04bd:
            r4 = 4
        L_0x04be:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: rp3.C110616m.mo162184c(byte[], int, int):int");
    }
}

package bh2;

import java.nio.FloatBuffer;

/* renamed from: bh2.b */
public class C104109b extends C104108a {

    /* renamed from: b */
    public final float[] f308017b = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: c */
    public final float[] f308018c = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: d */
    public FloatBuffer f308019d;

    /* renamed from: e */
    public FloatBuffer f308020e;

    /* renamed from: f */
    public int f308021f;

    /* renamed from: g */
    public int f308022g;

    /* renamed from: h */
    public int f308023h;

    /* renamed from: i */
    public int f308024i;

    /* renamed from: j */
    public int f308025j;

    /* JADX WARNING: Removed duplicated region for block: B:10:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0149  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo145761c(int r29, int r30, int r31, int r32, float r33) {
        /*
            r28 = this;
            r0 = r28
            r1 = r31
            r2 = r32
            long r3 = java.lang.System.currentTimeMillis()
            float[] r5 = r0.f308017b
            int r5 = r5.length
            r6 = 4
            int r5 = r5 * 4
            java.nio.ByteBuffer r5 = java.nio.ByteBuffer.allocateDirect(r5)
            java.nio.ByteOrder r7 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r5 = r5.order(r7)
            java.nio.FloatBuffer r5 = r5.asFloatBuffer()
            r0.f308019d = r5
            float[] r7 = r0.f308017b
            java.nio.FloatBuffer r5 = r5.put(r7)
            r7 = 0
            r5.position(r7)
            java.nio.FloatBuffer r13 = r0.f308019d
            r8 = 0
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 0
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            android.opengl.GLES20.glEnableVertexAttribArray(r7)
            r5 = r29
            float r5 = (float) r5
            float r8 = (float) r1
            float r9 = r5 / r8
            r10 = r30
            float r10 = (float) r10
            float r11 = (float) r2
            float r12 = r10 / r11
            float[] r13 = r0.f308018c
            int r14 = r13.length
            float[] r13 = java.util.Arrays.copyOf(r13, r14)
            int r15 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r15 >= 0) goto L_0x0057
            float r2 = r5 / r12
            int r2 = (int) r2
            int r1 = r1 - r2
            float r1 = (float) r1
            goto L_0x0065
        L_0x0057:
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x0064
            float r1 = r10 / r9
            int r1 = (int) r1
            int r1 = r2 - r1
            float r1 = (float) r1
            r2 = r1
            r1 = 0
            goto L_0x0066
        L_0x0064:
            r1 = 0
        L_0x0065:
            r2 = 0
        L_0x0066:
            r16 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r16
            float r1 = r1 / r8
            r17 = 1065353216(0x3f800000, float:1.0)
            float r18 = r17 - r1
            float r2 = r2 / r16
            float r2 = r2 / r11
            float r19 = r17 - r2
            r13[r7] = r1
            r14 = 1
            r13[r14] = r19
            r20 = 2
            r13[r20] = r18
            r21 = 3
            r13[r21] = r19
            r13[r6] = r1
            r1 = 5
            r13[r1] = r2
            r19 = 6
            r13[r19] = r18
            r18 = 7
            r13[r18] = r2
            int r2 = r13.length
            int r2 = r2 * 4
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r2.order(r1)
            java.nio.FloatBuffer r1 = r1.asFloatBuffer()
            r0.f308020e = r1
            java.nio.FloatBuffer r1 = r1.put(r13)
            r1.position(r7)
            r22 = 2
            r23 = 2
            r24 = 5126(0x1406, float:7.183E-42)
            r25 = 0
            r26 = 0
            java.nio.FloatBuffer r1 = r0.f308020e
            r27 = r1
            android.opengl.GLES20.glVertexAttribPointer(r22, r23, r24, r25, r26, r27)
            android.opengl.GLES20.glEnableVertexAttribArray(r20)
            if (r15 >= 0) goto L_0x00d1
            float r1 = r12 / r9
            float r1 = r1 - r17
            float r1 = r1 / r16
            float r2 = r1 + r17
            r22 = 0
            float r1 = r22 - r1
            r17 = r2
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L_0x00ea
        L_0x00d1:
            r22 = 0
            int r1 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e5
            float r1 = r9 / r12
            float r1 = r1 - r17
            float r1 = r1 / r16
            float r2 = r1 + r17
            float r1 = r22 - r1
            r22 = r1
            r1 = 0
            goto L_0x00ea
        L_0x00e5:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            r22 = 0
        L_0x00ea:
            r13[r7] = r22
            r13[r14] = r17
            r13[r20] = r2
            r13[r21] = r17
            r13[r6] = r22
            r17 = 5
            r13[r17] = r1
            r13[r19] = r2
            r13[r18] = r1
            int r1 = r13.length
            int r1 = r1 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r1 = r1.order(r2)
            java.nio.FloatBuffer r1 = r1.asFloatBuffer()
            r0.f308020e = r1
            java.nio.FloatBuffer r1 = r1.put(r13)
            r1.position(r7)
            r22 = 1
            r23 = 2
            r24 = 5126(0x1406, float:7.183E-42)
            r25 = 0
            r26 = 0
            java.nio.FloatBuffer r1 = r0.f308020e
            r27 = r1
            android.opengl.GLES20.glVertexAttribPointer(r22, r23, r24, r25, r26, r27)
            android.opengl.GLES20.glEnableVertexAttribArray(r14)
            float[] r1 = new float[r6]
            r1[r7] = r10
            r2 = 0
            r1[r14] = r2
            r1[r20] = r2
            r1[r21] = r5
            if (r15 >= 0) goto L_0x0149
            float r11 = r11 * r9
            float r11 = r11 * r33
            float r2 = r10 + r11
            float r2 = r2 / r16
            r1[r7] = r2
            float r10 = r10 - r11
            float r10 = r10 / r16
            r1[r14] = r10
            goto L_0x015c
        L_0x0149:
            int r2 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r2 <= 0) goto L_0x015c
            float r8 = r8 * r12
            float r8 = r8 * r33
            float r2 = r5 - r8
            float r2 = r2 / r16
            r1[r20] = r2
            float r5 = r5 + r8
            float r5 = r5 / r16
            r1[r21] = r5
        L_0x015c:
            r2 = 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocateDirect(r2)
            java.nio.ByteOrder r5 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r2 = r2.order(r5)
            java.nio.FloatBuffer r2 = r2.asFloatBuffer()
            java.nio.FloatBuffer r1 = r2.put(r1)
            r1.position(r7)
            int r1 = r0.f308025j
            android.opengl.GLES20.glUniform4fv(r1, r14, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "scale cost:"
            r1.append(r2)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MicroMsg.Story.FadeImageShader"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh2.C104109b.mo145761c(int, int, int, int, float):void");
    }
}

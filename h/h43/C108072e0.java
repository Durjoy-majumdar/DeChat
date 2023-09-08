package h43;

import android.opengl.GLES20;
import bc3.C104079c;
import com.tencent.wxmm.v2helper;
import g43.C107729a;
import g43.C107730b;
import g43.C107732d;
import gy3.C8480h;
import gy3.C87412m;
import java.nio.ByteBuffer;
import p80.C110194c;

/* renamed from: h43.e0 */
public class C108072e0 extends C108109r0 {

    /* renamed from: L */
    public int f323604L;

    /* renamed from: M */
    public C107730b f323605M;

    /* renamed from: N */
    public C107732d f323606N;

    /* renamed from: O */
    public C107729a f323607O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C108072e0(int i, int i2, int i3, int i4, int i5, int i6, int i7, C8480h hVar) {
        super(i, i2, (i7 & 4) != 0 ? i : i3, (i7 & 8) != 0 ? i2 : i4, (i7 & 16) != 0 ? 1 : i5, (i7 & 32) != 0 ? 2 : i6);
        this.f323606N = new C107732d();
        this.f323605M = new C107730b(true);
    }

    /* renamed from: A */
    public void mo158477A(int i) {
        C107729a aVar;
        if (i > 0 && (aVar = this.f323607O) != null) {
            aVar.f322359e = i > 0;
        }
    }

    /* renamed from: B */
    public void mo158478B(int i) {
        this.f323604L = i;
    }

    /* renamed from: j */
    public void mo158479j(boolean z) {
        if (this.f332750e == 2) {
            this.f332760o = !z;
        } else {
            this.f332760o = z;
        }
    }

    /* renamed from: l */
    public void mo158471l() {
        C107729a aVar = this.f323607O;
        if (aVar != null) {
            GLES20.glDeleteProgram(aVar.f322360f);
            C104079c cVar = aVar.f322355a;
            if (cVar != null) {
                cVar.mo145682a();
            }
        }
        C107732d dVar = this.f323606N;
        if (dVar != null) {
            C110194c cVar2 = dVar.f322379d;
            if (cVar2 != null) {
                cVar2.close();
            }
            C110194c cVar3 = dVar.f322380e;
            if (cVar3 != null) {
                cVar3.close();
            }
            C110194c cVar4 = dVar.f322381f;
            if (cVar4 != null) {
                cVar4.close();
            }
            GLES20.glDeleteProgram(dVar.f322376a);
        }
        GLES20.glDeleteProgram(this.f323605M.f322369b);
        super.mo158471l();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0127, code lost:
        if ((r11.capacity() == r6.length) == false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x015c, code lost:
        if ((r6.capacity() == r10.length) == false) goto L_0x015e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018d A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:78:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158472n() {
        /*
            r22 = this;
            r0 = r22
            int r1 = r0.f323604L
            r2 = 36197(0x8d65, float:5.0723E-41)
            r3 = 5
            r4 = 33984(0x84c0, float:4.7622E-41)
            r5 = 3553(0xde1, float:4.979E-42)
            java.lang.String r6 = "transformMatrix"
            r7 = 4
            r8 = 0
            r9 = 1
            if (r1 != r9) goto L_0x0023
            g43.b r1 = r0.f323605M
            java.nio.FloatBuffer r10 = r0.f332753h
            java.nio.FloatBuffer r11 = r0.f332752g
            int r12 = r0.f323723B
            float[] r13 = r0.f332757l
            r1.mo158147a(r10, r11, r12, r13)
            goto L_0x00bc
        L_0x0023:
            g43.d r1 = r0.f323606N
            if (r1 == 0) goto L_0x00bc
            java.nio.FloatBuffer r15 = r0.f332753h
            java.nio.FloatBuffer r14 = r0.f332752g
            float[] r10 = r0.f332757l
            java.lang.String r11 = "cubeBuffer"
            gy3.C87412m.m108594g(r15, r11)
            java.lang.String r11 = "textureCoordBuff"
            gy3.C87412m.m108594g(r14, r11)
            gy3.C87412m.m108594g(r10, r6)
            int r11 = r1.f322376a
            android.opengl.GLES20.glUseProgram(r11)
            int r11 = r1.f322385j
            android.opengl.GLES20.glUniformMatrix4fv(r11, r9, r8, r10, r8)
            int r10 = r1.f322377b
            r17 = 2
            r18 = 5126(0x1406, float:7.183E-42)
            r19 = 0
            r20 = 0
            r11 = 2
            r12 = 5126(0x1406, float:7.183E-42)
            r13 = 0
            r16 = 0
            r21 = r14
            r14 = r16
            android.opengl.GLES20.glVertexAttribPointer(r10, r11, r12, r13, r14, r15)
            int r10 = r1.f322377b
            android.opengl.GLES20.glEnableVertexAttribArray(r10)
            int r10 = r1.f322378c
            r16 = r10
            android.opengl.GLES20.glVertexAttribPointer(r16, r17, r18, r19, r20, r21)
            int r10 = r1.f322378c
            android.opengl.GLES20.glEnableVertexAttribArray(r10)
            p80.c r10 = r1.f322379d
            if (r10 != 0) goto L_0x0071
            goto L_0x007e
        L_0x0071:
            android.opengl.GLES20.glActiveTexture(r4)
            int r10 = r10.f329652e
            android.opengl.GLES20.glBindTexture(r5, r10)
            int r10 = r1.f322382g
            android.opengl.GLES20.glUniform1i(r10, r8)
        L_0x007e:
            p80.c r10 = r1.f322380e
            if (r10 != 0) goto L_0x0083
            goto L_0x0093
        L_0x0083:
            r11 = 33985(0x84c1, float:4.7623E-41)
            android.opengl.GLES20.glActiveTexture(r11)
            int r10 = r10.f329652e
            android.opengl.GLES20.glBindTexture(r5, r10)
            int r10 = r1.f322383h
            android.opengl.GLES20.glUniform1i(r10, r9)
        L_0x0093:
            p80.c r10 = r1.f322381f
            if (r10 != 0) goto L_0x0098
            goto L_0x00a9
        L_0x0098:
            r11 = 33986(0x84c2, float:4.7625E-41)
            android.opengl.GLES20.glActiveTexture(r11)
            int r10 = r10.f329652e
            android.opengl.GLES20.glBindTexture(r5, r10)
            int r10 = r1.f322384i
            r11 = 2
            android.opengl.GLES20.glUniform1i(r10, r11)
        L_0x00a9:
            android.opengl.GLES20.glDrawArrays(r3, r8, r7)
            int r10 = r1.f322377b
            android.opengl.GLES20.glDisableVertexAttribArray(r10)
            int r1 = r1.f322378c
            android.opengl.GLES20.glDisableVertexAttribArray(r1)
            android.opengl.GLES20.glBindTexture(r5, r8)
            android.opengl.GLES20.glBindTexture(r2, r8)
        L_0x00bc:
            p80.c r1 = r0.f332754i
            if (r1 == 0) goto L_0x01e0
            int r1 = r1.f329652e
            g43.a r15 = r0.f323607O
            if (r15 == 0) goto L_0x00ce
            int r10 = r0.f332748c
            int r11 = r0.f332749d
            r15.f322356b = r10
            r15.f322357c = r11
        L_0x00ce:
            if (r15 == 0) goto L_0x01e0
            float[] r10 = r0.f332757l
            gy3.C87412m.m108594g(r10, r6)
            int r12 = r15.f322356b
            if (r12 == 0) goto L_0x0109
            int r13 = r15.f322357c
            if (r13 == 0) goto L_0x0109
            int r14 = r15.f322358d
            if (r14 <= 0) goto L_0x0109
            bc3.c r10 = r15.f322355a
            if (r10 == 0) goto L_0x0109
            boolean r6 = r15.f322359e     // Catch:{ Exception -> 0x00ef }
            r11 = r1
            r9 = r15
            r15 = r6
            int r1 = r10.mo145683b(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00f0 }
            goto L_0x010a
        L_0x00ef:
            r9 = r15
        L_0x00f0:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "sharpen render failed with sharpenratio "
            r6.append(r10)
            int r10 = r9.f322358d
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            java.lang.String r10 = "MicroMsg.VoipSharperRendererProgram"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r6)
            goto L_0x010a
        L_0x0109:
            r9 = r15
        L_0x010a:
            float[] r6 = r9.f322364j
            float[] r10 = r9.f322365k
            java.lang.String r11 = "vert"
            gy3.C87412m.m108594g(r6, r11)
            java.lang.String r11 = "coord"
            gy3.C87412m.m108594g(r10, r11)
            java.nio.FloatBuffer r11 = r9.f322366l
            if (r11 == 0) goto L_0x0129
            int r11 = r11.capacity()
            int r12 = r6.length
            if (r11 != r12) goto L_0x0126
            r11 = 1
            goto L_0x0127
        L_0x0126:
            r11 = 0
        L_0x0127:
            if (r11 != 0) goto L_0x013e
        L_0x0129:
            int r11 = r6.length
            int r11 = r11 * 4
            java.nio.ByteBuffer r11 = java.nio.ByteBuffer.allocateDirect(r11)
            java.nio.ByteOrder r12 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r11 = r11.order(r12)
            java.nio.FloatBuffer r11 = r11.asFloatBuffer()
            r9.f322366l = r11
        L_0x013e:
            java.nio.FloatBuffer r11 = r9.f322366l
            if (r11 == 0) goto L_0x0145
            r11.put(r6)
        L_0x0145:
            java.nio.FloatBuffer r6 = r9.f322366l
            if (r6 == 0) goto L_0x014c
            r6.position(r8)
        L_0x014c:
            java.nio.FloatBuffer r6 = r9.f322367m
            if (r6 == 0) goto L_0x015e
            int r6 = r6.capacity()
            int r11 = r10.length
            if (r6 != r11) goto L_0x015a
            r16 = 1
            goto L_0x015c
        L_0x015a:
            r16 = 0
        L_0x015c:
            if (r16 != 0) goto L_0x0173
        L_0x015e:
            int r6 = r10.length
            int r6 = r6 * 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r6)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r6 = r6.order(r11)
            java.nio.FloatBuffer r6 = r6.asFloatBuffer()
            r9.f322367m = r6
        L_0x0173:
            java.nio.FloatBuffer r6 = r9.f322367m
            if (r6 == 0) goto L_0x017a
            r6.put(r10)
        L_0x017a:
            java.nio.FloatBuffer r6 = r9.f322367m
            if (r6 == 0) goto L_0x0181
            r6.position(r8)
        L_0x0181:
            r6 = 36160(0x8d40, float:5.0671E-41)
            android.opengl.GLES20.glBindFramebuffer(r6, r8)
            java.nio.FloatBuffer r15 = r9.f322366l
            java.nio.FloatBuffer r6 = r9.f322367m
            if (r15 == 0) goto L_0x01e0
            if (r6 == 0) goto L_0x01e0
            r10 = -1
            if (r1 == r10) goto L_0x01e0
            boolean r10 = android.opengl.GLES20.glIsTexture(r1)
            if (r10 == 0) goto L_0x01e0
            int r10 = r9.f322360f
            android.opengl.GLES20.glUseProgram(r10)
            android.opengl.GLES20.glActiveTexture(r4)
            android.opengl.GLES20.glBindTexture(r5, r1)
            int r1 = r9.f322363i
            android.opengl.GLES20.glUniform1i(r1, r8)
            int r10 = r9.f322361g
            r17 = 2
            r18 = 5126(0x1406, float:7.183E-42)
            r19 = 0
            r20 = 0
            r11 = 2
            r12 = 5126(0x1406, float:7.183E-42)
            r13 = 0
            r14 = 0
            android.opengl.GLES20.glVertexAttribPointer(r10, r11, r12, r13, r14, r15)
            int r1 = r9.f322361g
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            int r1 = r9.f322362h
            r16 = r1
            r21 = r6
            android.opengl.GLES20.glVertexAttribPointer(r16, r17, r18, r19, r20, r21)
            int r1 = r9.f322362h
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            android.opengl.GLES20.glDrawArrays(r3, r8, r7)
            int r1 = r9.f322361g
            android.opengl.GLES20.glDisableVertexAttribArray(r1)
            int r1 = r9.f322362h
            android.opengl.GLES20.glDisableVertexAttribArray(r1)
            android.opengl.GLES20.glBindTexture(r5, r8)
            android.opengl.GLES20.glBindTexture(r2, r8)
        L_0x01e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h43.C108072e0.mo158472n():void");
    }

    /* renamed from: q */
    public void mo143262q(int i) {
        if (this.f332750e == 2) {
            this.f332758m = (i + 180) % v2helper.VOIP_ENC_HEIGHT_LV1;
        } else {
            this.f332758m = i;
        }
    }

    /* renamed from: v */
    public void mo158480v(ByteBuffer byteBuffer, int i, int i2) {
        C87412m.m108594g(byteBuffer, "pBuff");
        C107732d dVar = this.f323606N;
        if (dVar != null) {
            byteBuffer.position(0);
            C110194c cVar = dVar.f322379d;
            if (cVar != null) {
                cVar.mo161594a(i, i2, 6409, byteBuffer, 9729, 33071);
            }
            int i3 = i * i2;
            byteBuffer.position(i3);
            C110194c cVar2 = dVar.f322380e;
            if (cVar2 != null) {
                cVar2.mo161594a(i / 2, i2 / 2, 6409, byteBuffer, 9729, 33071);
            }
            byteBuffer.position((i3 * 5) / 4);
            C110194c cVar3 = dVar.f322381f;
            if (cVar3 != null) {
                cVar3.mo161594a(i / 2, i2 / 2, 6409, byteBuffer, 9729, 33071);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        if ((r3.capacity() == r1) == false) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0069, code lost:
        if (r10 < r1) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0071  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158481w(byte[] r23, int r24, int r25) {
        /*
            r22 = this;
            r0 = r23
            java.lang.String r1 = "pBuff"
            gy3.C87412m.m108594g(r0, r1)
            r7 = r22
            g43.d r8 = r7.f323606N
            if (r8 == 0) goto L_0x0118
            int r1 = r24 * r25
            int r2 = r1 * 3
            r9 = 2
            int r2 = r2 / r9
            java.nio.ByteBuffer r3 = r8.f322386k
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L_0x002c
            java.nio.ByteBuffer r6 = r8.f322387l
            if (r6 == 0) goto L_0x002c
            java.nio.ByteBuffer r6 = r8.f322388m
            if (r6 == 0) goto L_0x002c
            int r3 = r3.capacity()
            if (r3 != r1) goto L_0x0029
            r3 = 1
            goto L_0x002a
        L_0x0029:
            r3 = 0
        L_0x002a:
            if (r3 != 0) goto L_0x0040
        L_0x002c:
            int r3 = r1 / 4
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r1)
            r8.f322386k = r6
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocateDirect(r3)
            r8.f322387l = r6
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            r8.f322388m = r3
        L_0x0040:
            java.nio.ByteBuffer r6 = r8.f322386k
            java.nio.ByteBuffer r14 = r8.f322387l
            java.nio.ByteBuffer r15 = r8.f322388m
            if (r6 == 0) goto L_0x0118
            if (r14 == 0) goto L_0x0118
            if (r15 == 0) goto L_0x0118
            int r3 = r8.f322389n
            int r3 = r3 + r5
            r8.f322389n = r3
            int r10 = r0.length
            r11 = 4
            if (r10 < r2) goto L_0x00f5
            int r3 = r3 % 100
            if (r3 != 0) goto L_0x006e
            int r3 = r0.length
            if (r3 <= r2) goto L_0x006c
            r3 = 0
            r10 = 0
        L_0x005e:
            if (r3 >= r1) goto L_0x0069
            byte r12 = r0[r3]
            if (r12 != 0) goto L_0x0066
            int r10 = r10 + 1
        L_0x0066:
            int r3 = r3 + 1
            goto L_0x005e
        L_0x0069:
            if (r10 >= r1) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r3 = 0
            goto L_0x006f
        L_0x006e:
            r3 = 1
        L_0x006f:
            if (r3 == 0) goto L_0x00f5
            java.nio.ByteBuffer r2 = r8.f322386k
            if (r2 == 0) goto L_0x0078
            r2.clear()
        L_0x0078:
            java.nio.ByteBuffer r2 = r8.f322387l
            if (r2 == 0) goto L_0x007f
            r2.clear()
        L_0x007f:
            java.nio.ByteBuffer r2 = r8.f322388m
            if (r2 == 0) goto L_0x0086
            r2.clear()
        L_0x0086:
            java.nio.ByteBuffer r2 = r8.f322386k
            if (r2 == 0) goto L_0x008d
            r2.put(r0, r4, r1)
        L_0x008d:
            java.nio.ByteBuffer r2 = r8.f322387l
            if (r2 == 0) goto L_0x0096
            int r3 = r1 / 4
            r2.put(r0, r1, r3)
        L_0x0096:
            java.nio.ByteBuffer r2 = r8.f322388m
            if (r2 == 0) goto L_0x00a1
            int r3 = r1 * 5
            int r3 = r3 / r11
            int r1 = r1 / r11
            r2.put(r0, r3, r1)
        L_0x00a1:
            java.nio.ByteBuffer r0 = r8.f322386k
            if (r0 == 0) goto L_0x00a8
            r0.position(r4)
        L_0x00a8:
            java.nio.ByteBuffer r0 = r8.f322387l
            if (r0 == 0) goto L_0x00af
            r0.position(r4)
        L_0x00af:
            java.nio.ByteBuffer r0 = r8.f322388m
            if (r0 == 0) goto L_0x00b6
            r0.position(r4)
        L_0x00b6:
            p80.c r0 = r8.f322379d
            if (r0 == 0) goto L_0x00ca
            r3 = 6409(0x1909, float:8.981E-42)
            r5 = 9729(0x2601, float:1.3633E-41)
            r10 = 33071(0x812f, float:4.6342E-41)
            r1 = r24
            r2 = r25
            r4 = r6
            r6 = r10
            r0.mo161594a(r1, r2, r3, r4, r5, r6)
        L_0x00ca:
            p80.c r10 = r8.f322380e
            if (r10 == 0) goto L_0x00df
            int r11 = r24 / 2
            int r12 = r25 / 2
            r13 = 6409(0x1909, float:8.981E-42)
            r0 = 9729(0x2601, float:1.3633E-41)
            r16 = 33071(0x812f, float:4.6342E-41)
            r1 = r15
            r15 = r0
            r10.mo161594a(r11, r12, r13, r14, r15, r16)
            goto L_0x00e0
        L_0x00df:
            r1 = r15
        L_0x00e0:
            p80.c r15 = r8.f322381f
            if (r15 == 0) goto L_0x0118
            int r16 = r24 / 2
            int r17 = r25 / 2
            r18 = 6409(0x1909, float:8.981E-42)
            r20 = 9729(0x2601, float:1.3633E-41)
            r21 = 33071(0x812f, float:4.6342E-41)
            r19 = r1
            r15.mo161594a(r16, r17, r18, r19, r20, r21)
            goto L_0x0118
        L_0x00f5:
            java.lang.Object[] r1 = new java.lang.Object[r11]
            int r0 = r0.length
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r4] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1[r5] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r24)
            r1[r9] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r25)
            r2 = 3
            r1[r2] = r0
            java.lang.String r0 = "MicroMsg.VoipYuvRenderProgram"
            java.lang.String r2 = "remote yuvData size not match, realSize:%s, desiredSie:%s, videoSize:%sx%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r0, r2, r1)
        L_0x0118:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h43.C108072e0.mo158481w(byte[], int, int):void");
    }

    /* renamed from: z */
    public void mo158482z(int i) {
        if (i > 0) {
            this.f332750e = 2;
            if (this.f323607O == null) {
                this.f323607O = new C107729a();
            }
            C107729a aVar = this.f323607O;
            if (aVar != null) {
                aVar.f322358d = i;
            }
        }
    }
}

package f43;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import rp3.C110602a;
import rp3.C110603b;
import rp3.C110606e;
import rp3.C110607f;
import rp3.C110608g;
import rp3.C110616m;

/* renamed from: f43.f */
public class C107479f implements GLSurfaceView.Renderer {

    /* renamed from: A */
    public int f321557A = 0;

    /* renamed from: B */
    public int f321558B = 0;

    /* renamed from: C */
    public int f321559C = 0;

    /* renamed from: a */
    public volatile C107475c f321560a;

    /* renamed from: b */
    public volatile C107474b f321561b;

    /* renamed from: c */
    public int f321562c = 0;

    /* renamed from: d */
    public int f321563d = 0;

    /* renamed from: e */
    public int f321564e = 0;

    /* renamed from: f */
    public int f321565f = 0;

    /* renamed from: g */
    public int f321566g = 0;

    /* renamed from: h */
    public int f321567h = 0;

    /* renamed from: i */
    public int f321568i = 0;

    /* renamed from: j */
    public boolean f321569j = false;

    /* renamed from: k */
    public int f321570k = 3;

    /* renamed from: l */
    public ByteBuffer f321571l = ByteBuffer.allocate(0);

    /* renamed from: m */
    public ByteBuffer f321572m = ByteBuffer.allocate(0);

    /* renamed from: n */
    public ByteBuffer f321573n = ByteBuffer.allocate(0);

    /* renamed from: o */
    public ByteBuffer f321574o = ByteBuffer.allocate(0);

    /* renamed from: p */
    public ByteBuffer f321575p = ByteBuffer.allocate(0);

    /* renamed from: q */
    public boolean f321576q;

    /* renamed from: r */
    public int f321577r;

    /* renamed from: s */
    public int f321578s = 0;

    /* renamed from: t */
    public int f321579t = 0;

    /* renamed from: u */
    public boolean f321580u = false;

    /* renamed from: v */
    public boolean f321581v = false;

    /* renamed from: w */
    public volatile boolean f321582w = false;

    /* renamed from: x */
    public C110616m f321583x;

    /* renamed from: y */
    public int f321584y = 5;

    /* renamed from: z */
    public float f321585z = 0.0f;

    /* renamed from: a */
    public boolean mo157899a() {
        Log.printInfoStack("MicroMsg.VoipRenderer", "attachGLContext isContextAttached:%b, mHProgram:%s", Boolean.valueOf(this.f321569j), this.f321561b);
        if (!this.f321569j && this.f321561b != null) {
            try {
                this.f321561b.mo157888a();
                this.f321569j = true;
                Log.m105924i("MicroMsg.VoipRenderer", "attachGLContext done!");
            } catch (Exception e) {
                this.f321569j = false;
                Log.printErrStackTrace("MicroMsg.VoipRenderer", e, "attachGLContext error!", new Object[0]);
            }
        }
        return this.f321569j;
    }

    /* renamed from: b */
    public void mo157900b(int i, int i2, float[] fArr, float[] fArr2) {
        float f;
        int i3 = this.f321562c;
        int i4 = i2 * i3;
        int i5 = this.f321563d;
        float f2 = 0.0f;
        if (i4 < i * i5) {
            f = 0.5f - (((((float) i2) * 1.0f) * ((float) i3)) / ((((float) i) * 2.0f) * ((float) i5)));
        } else {
            f2 = 0.5f - (((((float) i) * 1.0f) * ((float) i5)) / ((((float) i2) * 2.0f) * ((float) i3)));
            f = 0.0f;
        }
        fArr2[0] = f2;
        float f3 = 1.0f - f;
        fArr2[1] = f3;
        float f4 = 1.0f - f2;
        fArr2[2] = f4;
        fArr2[3] = f3;
        fArr2[4] = f2;
        fArr2[5] = f;
        fArr2[6] = f4;
        fArr2[7] = f;
        fArr[0] = -1.0f;
        fArr[1] = 1.0f;
        fArr[2] = -1.0f;
        fArr[3] = -1.0f;
        fArr[4] = 1.0f;
        fArr[5] = 1.0f;
        fArr[6] = 1.0f;
        fArr[7] = -1.0f;
        if (this.f321561b != null) {
            C107474b bVar = this.f321561b;
            bVar.getClass();
            FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            bVar.f321523b = asFloatBuffer;
            asFloatBuffer.put(fArr);
            bVar.f321523b.position(0);
            FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(fArr2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            bVar.f321524c = asFloatBuffer2;
            asFloatBuffer2.put(fArr2);
            bVar.f321524c.position(0);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0170  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01f3  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0218  */
    /* JADX WARNING: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo157901c(int r19, int r20, boolean r21, float[] r22, float[] r23, int r24) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r22
            r4 = r23
            r5 = r24
            r6 = 270(0x10e, float:3.78E-43)
            r7 = 90
            r8 = 0
            r9 = 1056964608(0x3f000000, float:0.5)
            r10 = 1000593162(0x3ba3d70a, float:0.005)
            r11 = 0
            r12 = 1073741824(0x40000000, float:2.0)
            r13 = 1065353216(0x3f800000, float:1.0)
            if (r5 == r7) goto L_0x0099
            if (r5 == r6) goto L_0x0099
            if (r21 == 0) goto L_0x006f
            float r14 = (float) r1
            float r15 = r8 / r14
            float r15 = r15 / r12
            float r15 = r15 + r10
            float r6 = (float) r2
            float r16 = r8 / r6
            float r16 = r16 / r12
            float r16 = r16 + r10
            int r1 = r1 - r11
            int r2 = r2 - r11
            int r7 = r0.f321562c
            int r11 = r1 * r7
            int r8 = r0.f321563d
            int r10 = r2 * r8
            if (r11 >= r10) goto L_0x004c
            float r1 = (float) r1
            float r1 = r1 * r13
            float r2 = (float) r7
            float r1 = r1 * r2
            float r6 = r6 * r12
            float r2 = (float) r8
            float r6 = r6 * r2
            float r1 = r1 / r6
            float r9 = r9 - r1
            r1 = 1000593162(0x3ba3d70a, float:0.005)
            float r9 = r9 + r1
            r8 = 0
            goto L_0x005f
        L_0x004c:
            r1 = 1000593162(0x3ba3d70a, float:0.005)
            float r2 = (float) r2
            float r2 = r2 * r13
            float r6 = (float) r8
            float r2 = r2 * r6
            float r14 = r14 * r12
            float r6 = (float) r7
            float r14 = r14 * r6
            float r2 = r2 / r14
            float r9 = r9 - r2
            float r9 = r9 + r1
            r8 = r9
            r9 = 0
        L_0x005f:
            int r1 = (r8 > r15 ? 1 : (r8 == r15 ? 0 : -1))
            if (r1 <= 0) goto L_0x0064
            goto L_0x0065
        L_0x0064:
            r8 = r15
        L_0x0065:
            int r1 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r1 <= 0) goto L_0x006b
            goto L_0x011f
        L_0x006b:
            r9 = r16
            goto L_0x011f
        L_0x006f:
            int r6 = r0.f321562c
            int r7 = r1 * r6
            int r8 = r0.f321563d
            int r10 = r2 * r8
            if (r7 >= r10) goto L_0x0089
            float r1 = (float) r1
            float r1 = r1 * r13
            float r6 = (float) r6
            float r1 = r1 * r6
            float r2 = (float) r2
            float r2 = r2 * r12
            float r6 = (float) r8
            float r2 = r2 * r6
            float r1 = r1 / r2
            float r9 = r9 - r1
            goto L_0x010a
        L_0x0089:
            float r2 = (float) r2
            float r2 = r2 * r13
            float r7 = (float) r8
            float r2 = r2 * r7
            float r1 = (float) r1
            float r1 = r1 * r12
            float r6 = (float) r6
            float r1 = r1 * r6
            float r2 = r2 / r1
            float r9 = r9 - r2
            goto L_0x011d
        L_0x0099:
            if (r21 == 0) goto L_0x00ef
            float r6 = (float) r1
            r7 = 0
            float r8 = r7 / r6
            float r8 = r8 / r12
            r10 = 1000593162(0x3ba3d70a, float:0.005)
            float r8 = r8 + r10
            float r11 = (float) r2
            float r14 = r7 / r11
            float r14 = r14 / r12
            float r14 = r14 + r10
            r10 = 0
            int r1 = r1 - r10
            int r2 = r2 - r10
            int r10 = r0.f321563d
            int r15 = r1 * r10
            int r7 = r0.f321562c
            int r9 = r2 * r7
            if (r15 >= r9) goto L_0x00cd
            float r1 = (float) r1
            float r1 = r1 * r13
            float r2 = (float) r10
            float r1 = r1 * r2
            float r11 = r11 * r12
            float r2 = (float) r7
            float r11 = r11 * r2
            float r1 = r1 / r11
            r9 = 1056964608(0x3f000000, float:0.5)
            float r9 = r9 - r1
            r1 = 1000593162(0x3ba3d70a, float:0.005)
            float r9 = r9 + r1
            r17 = r9
            r9 = 0
            goto L_0x00e2
        L_0x00cd:
            r1 = 1000593162(0x3ba3d70a, float:0.005)
            r9 = 1056964608(0x3f000000, float:0.5)
            float r2 = (float) r2
            float r2 = r2 * r13
            float r7 = (float) r7
            float r2 = r2 * r7
            float r6 = r6 * r12
            float r7 = (float) r10
            float r6 = r6 * r7
            float r2 = r2 / r6
            float r9 = r9 - r2
            float r9 = r9 + r1
            r17 = 0
        L_0x00e2:
            int r1 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r1 <= 0) goto L_0x00e7
            r8 = r9
        L_0x00e7:
            int r1 = (r17 > r14 ? 1 : (r17 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ed
            r14 = r17
        L_0x00ed:
            r9 = r14
            goto L_0x011f
        L_0x00ef:
            int r6 = r0.f321563d
            int r7 = r1 * r6
            int r8 = r0.f321562c
            int r9 = r2 * r8
            if (r7 >= r9) goto L_0x010c
            float r1 = (float) r1
            float r1 = r1 * r13
            float r6 = (float) r6
            float r1 = r1 * r6
            float r2 = (float) r2
            float r2 = r2 * r12
            float r6 = (float) r8
            float r2 = r2 * r6
            float r1 = r1 / r2
            r7 = 1056964608(0x3f000000, float:0.5)
            float r9 = r7 - r1
        L_0x010a:
            r8 = 0
            goto L_0x011f
        L_0x010c:
            r7 = 1056964608(0x3f000000, float:0.5)
            float r2 = (float) r2
            float r2 = r2 * r13
            float r8 = (float) r8
            float r2 = r2 * r8
            float r1 = (float) r1
            float r1 = r1 * r12
            float r6 = (float) r6
            float r1 = r1 * r6
            float r2 = r2 / r1
            float r9 = r7 - r2
        L_0x011d:
            r8 = r9
            r9 = 0
        L_0x011f:
            int r1 = r0.f321577r
            r2 = 4
            r6 = 5
            r7 = 6
            r10 = 7
            r11 = 2
            r12 = 3
            r14 = 1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 == r14) goto L_0x0170
            if (r1 == r12) goto L_0x0130
            goto L_0x01af
        L_0x0130:
            r1 = 0
            r3[r1] = r8
            boolean r1 = r0.f321576q
            if (r1 == 0) goto L_0x013a
            float r16 = r13 - r9
            goto L_0x013c
        L_0x013a:
            r16 = r9
        L_0x013c:
            r3[r14] = r16
            float r16 = r13 - r8
            r3[r11] = r16
            if (r1 == 0) goto L_0x0147
            float r17 = r13 - r9
            goto L_0x0149
        L_0x0147:
            r17 = r9
        L_0x0149:
            r3[r12] = r17
            r3[r2] = r8
            if (r1 == 0) goto L_0x0151
            r8 = r9
            goto L_0x0153
        L_0x0151:
            float r8 = r13 - r9
        L_0x0153:
            r3[r6] = r8
            r3[r7] = r16
            if (r1 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            float r9 = r13 - r9
        L_0x015c:
            r3[r10] = r9
            r1 = 0
            r4[r1] = r15
            r4[r14] = r15
            r4[r11] = r15
            r4[r12] = r13
            r4[r2] = r13
            r4[r6] = r15
            r4[r7] = r13
            r4[r10] = r13
            goto L_0x01af
        L_0x0170:
            r1 = 0
            r3[r1] = r8
            boolean r1 = r0.f321576q
            if (r1 == 0) goto L_0x017a
            float r16 = r13 - r9
            goto L_0x017c
        L_0x017a:
            r16 = r9
        L_0x017c:
            r3[r14] = r16
            float r16 = r13 - r8
            r3[r11] = r16
            if (r1 == 0) goto L_0x0187
            float r17 = r13 - r9
            goto L_0x0189
        L_0x0187:
            r17 = r9
        L_0x0189:
            r3[r12] = r17
            r3[r2] = r8
            if (r1 == 0) goto L_0x0191
            r8 = r9
            goto L_0x0193
        L_0x0191:
            float r8 = r13 - r9
        L_0x0193:
            r3[r6] = r8
            r3[r7] = r16
            if (r1 == 0) goto L_0x019a
            goto L_0x019c
        L_0x019a:
            float r9 = r13 - r9
        L_0x019c:
            r3[r10] = r9
            r1 = 0
            r4[r1] = r13
            r4[r14] = r13
            r4[r11] = r13
            r4[r12] = r15
            r4[r2] = r15
            r4[r6] = r13
            r4[r7] = r15
            r4[r10] = r15
        L_0x01af:
            w80.d$a r1 = w80.C111742d.f334647a
            java.lang.String r8 = "textureCoords"
            gy3.C87412m.m108594g(r3, r8)
            r8 = 90
            if (r5 == r8) goto L_0x01f3
            r8 = 180(0xb4, float:2.52E-43)
            if (r5 == r8) goto L_0x01e5
            r8 = 270(0x10e, float:3.78E-43)
            if (r5 == r8) goto L_0x01c3
            goto L_0x0214
        L_0x01c3:
            r1 = 0
            r5 = r3[r1]
            r8 = r3[r14]
            r9 = r3[r11]
            r3[r1] = r9
            r1 = r3[r12]
            r3[r14] = r1
            r1 = r3[r7]
            r3[r11] = r1
            r1 = r3[r10]
            r3[r12] = r1
            r1 = r3[r2]
            r3[r7] = r1
            r1 = r3[r6]
            r3[r10] = r1
            r3[r2] = r5
            r3[r6] = r8
            goto L_0x0214
        L_0x01e5:
            r5 = 0
            r1.mo163473s(r3, r5, r7)
            r1.mo163473s(r3, r14, r10)
            r1.mo163473s(r3, r11, r2)
            r1.mo163473s(r3, r12, r6)
            goto L_0x0214
        L_0x01f3:
            r5 = 0
            r1 = r3[r5]
            r8 = r3[r14]
            r9 = r3[r2]
            r3[r5] = r9
            r5 = r3[r6]
            r3[r14] = r5
            r5 = r3[r7]
            r3[r2] = r5
            r2 = r3[r10]
            r3[r6] = r2
            r2 = r3[r11]
            r3[r7] = r2
            r2 = r3[r12]
            r3[r10] = r2
            r3[r11] = r1
            r3[r12] = r8
        L_0x0214:
            f43.c r1 = r0.f321560a
            if (r1 == 0) goto L_0x021d
            f43.c r1 = r0.f321560a
            r1.mo157892b(r4, r3)
        L_0x021d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f43.C107479f.mo157901c(int, int, boolean, float[], float[], int):void");
    }

    /* renamed from: d */
    public void mo157902d(int i, int i2, int i3) {
        if (this.f321568i != 1 && this.f321560a != null) {
            int i4 = this.f321570k;
            if (i4 == 0 || i4 == 1) {
                mo157901c(i, i2, true, this.f321560a.f321549w, this.f321560a.f321548v, 0);
                return;
            }
            mo157901c(i, i2, false, this.f321560a.f321549w, this.f321560a.f321548v, i3);
        }
    }

    /* renamed from: e */
    public boolean mo157903e() {
        Log.printInfoStack("MicroMsg.VoipRenderer", "detachGLContext isContextAttached:%b!", Boolean.valueOf(this.f321569j));
        if (this.f321569j && this.f321561b != null) {
            try {
                this.f321561b.mo157889b();
                this.f321569j = false;
                Log.m105924i("MicroMsg.VoipRenderer", "detachGLContext done!");
            } catch (Exception e) {
                this.f321569j = true;
                Log.printErrStackTrace("MicroMsg.VoipRenderer", e, "detachGLContext error!", new Object[0]);
            }
        }
        return this.f321569j;
    }

    /* renamed from: f */
    public void mo157904f(int i) {
        int i2;
        int i3;
        if (this.f321568i != i) {
            Log.m105925i("MicroMsg.VoipRenderer", "setRenderType: %s, screenWidth: %s, screenHeight: %s", Integer.valueOf(i), Integer.valueOf(this.f321562c), Integer.valueOf(this.f321563d));
            this.f321568i = i;
            if (i != 1 && (i2 = this.f321564e) > 0 && (i3 = this.f321565f) > 0) {
                mo157902d(i2, i3, this.f321559C);
            }
        }
    }

    public void onDrawFrame(GL10 gl10) {
        synchronized (this) {
            GLES20.glViewport(0, 0, this.f321562c, this.f321563d);
            GLES20.glClear(16640);
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
            if (this.f321568i == 0) {
                if (!this.f321582w || this.f321560a == null) {
                    Log.m105920e("MicroMsg.VoipRenderer", "render soft draw error, cannot draw yuv now");
                } else {
                    if (this.f321572m.capacity() == this.f321565f * this.f321564e) {
                        this.f321572m.position(0);
                        int i = (this.f321565f * this.f321564e) / 4;
                        if (this.f321570k == 3) {
                            if (this.f321575p.capacity() == i * 2) {
                                this.f321575p.position(0);
                                C107475c cVar = this.f321560a;
                                ByteBuffer byteBuffer = this.f321572m;
                                ByteBuffer byteBuffer2 = this.f321575p;
                                int i2 = this.f321564e;
                                int i3 = this.f321565f;
                                cVar.mo157897g(byteBuffer, i2, i3, 0);
                                int i4 = i3 / 2;
                                cVar.f321528b[1].mo161594a(i2 / 2, i4, 6410, byteBuffer2, 9729, 33071);
                            } else {
                                Log.m105921e("MicroMsg.VoipRenderer", "RENDER_NV21 draw error, uv buffer size not match, uv.capacity:%s, videoSize:%sx%s", Integer.valueOf(this.f321575p.capacity()), Integer.valueOf(this.f321564e), Integer.valueOf(this.f321565f));
                            }
                        } else if (this.f321573n.capacity() == i && this.f321574o.capacity() == i) {
                            this.f321573n.position(0);
                            this.f321574o.position(0);
                            C107475c cVar2 = this.f321560a;
                            ByteBuffer byteBuffer3 = this.f321572m;
                            ByteBuffer byteBuffer4 = this.f321573n;
                            ByteBuffer byteBuffer5 = this.f321574o;
                            int i5 = this.f321564e;
                            int i6 = this.f321565f;
                            cVar2.mo157897g(byteBuffer3, i5, i6, 0);
                            int i7 = i5 / 2;
                            int i8 = i6 / 2;
                            cVar2.mo157897g(byteBuffer4, i7, i8, 1);
                            cVar2.mo157897g(byteBuffer5, i7, i8, 2);
                        } else {
                            Log.m105921e("MicroMsg.VoipRenderer", "RENDER_YV12/RENDER_YV12Edge draw error, uv buffer size not match, u.capacity:%s, v.capacity:%s, videoSize:%sx%s", Integer.valueOf(this.f321573n.capacity()), Integer.valueOf(this.f321574o.capacity()), Integer.valueOf(this.f321564e), Integer.valueOf(this.f321565f));
                        }
                    } else {
                        Log.m105921e("MicroMsg.VoipRenderer", "draw error, y buffer size not match, y.capacity:%s, videoSize:%sx%s", Integer.valueOf(this.f321572m.capacity()), Integer.valueOf(this.f321564e), Integer.valueOf(this.f321565f));
                    }
                    try {
                        if (this.f321579t == 1) {
                            C107475c cVar3 = this.f321560a;
                            int i9 = this.f321584y;
                            float f = this.f321585z;
                            if (cVar3.f321539m) {
                                C110608g gVar = cVar3.f321533g;
                                if (i9 >= 4) {
                                    C110606e eVar = gVar.f330905k;
                                    eVar.mo162168i(new C110602a(eVar, eVar.f330895q, 1));
                                    C110607f fVar = gVar.f330906l;
                                    fVar.mo162168i(new C110602a(fVar, fVar.f330900t, 1));
                                } else {
                                    C110606e eVar2 = gVar.f330905k;
                                    eVar2.mo162168i(new C110602a(eVar2, eVar2.f330895q, 0));
                                    C110607f fVar2 = gVar.f330906l;
                                    fVar2.mo162168i(new C110602a(fVar2, fVar2.f330900t, 0));
                                }
                                C110606e eVar3 = cVar3.f321533g.f330905k;
                                eVar3.f330894p = f;
                                eVar3.mo162168i(new C110603b(eVar3, eVar3.f330897s, f));
                            }
                        }
                        this.f321560a.mo157894d(this.f321570k, this.f321578s, this.f321577r, this.f321581v);
                    } catch (Exception e) {
                        Log.m105928w("MicroMsg.VoipRenderer", e.getMessage());
                    }
                }
                this.f321582w = false;
            } else if (this.f321561b != null) {
                int i15 = this.f321558B + 1;
                this.f321558B = i15;
                if (i15 % 100 == 0) {
                    Log.m105925i("MicroMsg.VoipRenderer", "steve: remote HW texture videoSize:%sx%s, mHardDrawCnt:%d", Integer.valueOf(this.f321566g), Integer.valueOf(this.f321567h), Integer.valueOf(this.f321558B));
                }
                mo157900b(this.f321566g, this.f321567h, C107474b.f321520f, C107474b.f321521g);
                this.f321561b.mo157890c();
            }
        }
    }

    public void onSurfaceChanged(GL10 gl10, int i, int i2) {
        int i3;
        Log.m105925i("MicroMsg.VoipRenderer", "onSurfaceChanged and render type is %s, dataType is %s ", Integer.valueOf(this.f321568i), Integer.valueOf(this.f321570k));
        GLES20.glViewport(0, 0, i, i2);
        if (this.f321560a == null) {
            this.f321560a = new C107475c();
        }
        if (this.f321561b == null) {
            this.f321561b = new C107474b();
        }
        this.f321563d = i2;
        this.f321562c = i;
        int i4 = this.f321564e;
        if (i4 > 0 && (i3 = this.f321565f) > 0) {
            mo157902d(i4, i3, this.f321559C);
        }
        if (this.f321560a != null) {
            C107475c cVar = this.f321560a;
            cVar.getClass();
            Log.m105925i("MicroMsg.VoipGLSProgram", "onSurfaceChanged, width: %s, height: %s, surfaceWidth: %s, surfaceHeight: %s", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(cVar.f321541o), Integer.valueOf(cVar.f321542p));
            if (!(i == cVar.f321541o && cVar.f321542p == i2)) {
                cVar.f321541o = i;
                cVar.f321542p = i2;
                C107473a aVar = cVar.f321532f;
                aVar.getClass();
                Log.m105925i("MicroMsg.VoipGLSProgram", "onSurfaceChanged: %s %s", Integer.valueOf(i), Integer.valueOf(i2));
                aVar.f321503d = i;
                aVar.f321504e = i2;
                C110608g gVar = cVar.f321533g;
                gVar.f330919y = i;
                gVar.f330920z = i2;
            }
        }
        this.f321580u = true;
        Log.m105919d("MicroMsg.VoipRenderer", "onSurfaceChanged width: %s * height: %s , and video size is width %s * height %s ", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(this.f321564e), Integer.valueOf(this.f321565f));
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Log.m105925i("MicroMsg.VoipRenderer", "onSurfaceCreated and render type is %s", Integer.valueOf(this.f321568i));
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        if (this.f321560a == null) {
            this.f321560a = new C107475c();
        }
        if (this.f321561b == null) {
            this.f321561b = new C107474b();
        }
        this.f321583x = new C110616m();
        this.f321557A = 0;
        this.f321558B = 0;
    }
}

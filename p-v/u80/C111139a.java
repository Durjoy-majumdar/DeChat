package u80;

import android.graphics.Point;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import fy3.C32226l;
import fy3.C32228q;
import gy3.C87412m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.concurrent.LinkedBlockingQueue;
import p80.C110192a;
import p80.C110193b;
import p80.C110194c;
import rx3.C13598b0;
import w80.C111742d;

/* renamed from: u80.a */
public abstract class C111139a {

    /* renamed from: A */
    public Point f332745A = new Point(this.f332746a, 0);

    /* renamed from: a */
    public int f332746a;

    /* renamed from: b */
    public int f332747b;

    /* renamed from: c */
    public int f332748c;

    /* renamed from: d */
    public int f332749d;

    /* renamed from: e */
    public int f332750e;

    /* renamed from: f */
    public int f332751f;

    /* renamed from: g */
    public FloatBuffer f332752g;

    /* renamed from: h */
    public FloatBuffer f332753h;

    /* renamed from: i */
    public C110194c f332754i;

    /* renamed from: j */
    public C110192a f332755j;

    /* renamed from: k */
    public ByteBuffer f332756k;

    /* renamed from: l */
    public float[] f332757l = new float[16];

    /* renamed from: m */
    public int f332758m;

    /* renamed from: n */
    public boolean f332759n;

    /* renamed from: o */
    public boolean f332760o;

    /* renamed from: p */
    public Rect f332761p;

    /* renamed from: q */
    public C32226l<? super IntBuffer, C13598b0> f332762q;

    /* renamed from: r */
    public C32226l<? super ByteBuffer, C13598b0> f332763r;

    /* renamed from: s */
    public C32228q<? super ByteBuffer, ? super Integer, ? super Integer, C13598b0> f332764s;

    /* renamed from: t */
    public boolean f332765t = true;

    /* renamed from: u */
    public volatile boolean f332766u;

    /* renamed from: v */
    public boolean f332767v;

    /* renamed from: w */
    public int f332768w = -1;

    /* renamed from: x */
    public int f332769x = -1;

    /* renamed from: y */
    public LinkedBlockingQueue<ByteBuffer> f332770y = new LinkedBlockingQueue<>();

    /* renamed from: z */
    public Point f332771z = new Point(0, this.f332747b);

    public C111139a(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f332746a = i;
        this.f332747b = i2;
        this.f332748c = i3;
        this.f332749d = i4;
        this.f332750e = i5;
        this.f332751f = i6;
        C111742d.C111743a aVar = C111742d.f334647a;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f332752g = asFloatBuffer;
        C111742d.C111743a aVar2 = C111742d.f334647a;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        C87412m.m108593f(asFloatBuffer2, "allocateDirect(GLEnviron…eOrder()).asFloatBuffer()");
        this.f332753h = asFloatBuffer2;
        int i7 = this.f332750e;
        if (i7 == 2) {
            this.f332754i = C110193b.m149776b(true, 3);
            this.f332755j = C110193b.f329648a.mo161592a(3);
        } else if (i7 == 3) {
            mo162877h();
        }
    }

    /* renamed from: f */
    public void mo161601f() {
        IntBuffer intBuffer = null;
        if (!this.f332766u || !this.f332767v) {
            int i = this.f332750e;
            if (i == 3) {
                if (this.f332756k == null) {
                    mo162877h();
                }
                ByteBuffer byteBuffer = this.f332756k;
                if (byteBuffer != null) {
                    if (byteBuffer != null) {
                        byteBuffer.clear();
                    }
                    GLES20.glReadPixels(0, 0, this.f332748c, this.f332749d, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f332756k);
                    GLES20.glFinish();
                    C32226l<? super IntBuffer, C13598b0> lVar = this.f332762q;
                    if (lVar != null) {
                        ByteBuffer byteBuffer2 = this.f332756k;
                        if (byteBuffer2 != null) {
                            intBuffer = byteBuffer2.asIntBuffer();
                        }
                        C87412m.m108591d(intBuffer);
                        lVar.invoke(intBuffer);
                    }
                }
            } else if (i == 2) {
                GLES20.glBindFramebuffer(36160, 0);
            }
            GLES20.glUseProgram(0);
            GLES20.glBindFramebuffer(36160, 0);
            return;
        }
        Util.currentTicks();
        this.f332767v = false;
        if (this.f332770y.size() < 2 && this.f332768w > 0 && this.f332769x > 0 && this.f332770y.size() < 2) {
            if (this.f332765t) {
                int size = 2 - this.f332770y.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f332770y.add(ByteBuffer.allocateDirect(this.f332768w * this.f332769x * 4).order(ByteOrder.nativeOrder()));
                }
            } else {
                int size2 = 2 - this.f332770y.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    this.f332770y.add(ByteBuffer.allocate(this.f332768w * this.f332769x * 4).order(ByteOrder.nativeOrder()));
                }
            }
        }
        if (this.f332770y.size() < 2 || this.f332768w < 0 || this.f332769x < 0) {
            this.f332766u = false;
            return;
        }
        C110192a aVar = this.f332755j;
        if (aVar != null) {
            GLES20.glBindFramebuffer(36160, aVar.f329644e);
        }
        ByteBuffer take = this.f332770y.size() > 0 ? this.f332770y.take() : ByteBuffer.allocate(this.f332768w * this.f332769x * 4).order(ByteOrder.nativeOrder());
        if (take != null) {
            take.position(0);
        }
        GLES20.glReadPixels(0, 0, this.f332768w, this.f332769x, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, take);
        GLES20.glFinish();
        C32226l<? super ByteBuffer, C13598b0> lVar2 = this.f332763r;
        if (lVar2 != null) {
            C87412m.m108591d(take);
            lVar2.invoke(take);
        }
        C32228q<? super ByteBuffer, ? super Integer, ? super Integer, C13598b0> qVar = this.f332764s;
        if (qVar != null) {
            C87412m.m108591d(take);
            qVar.invoke(take, Integer.valueOf(this.f332768w), Integer.valueOf(this.f332769x));
        }
        C32226l<? super IntBuffer, C13598b0> lVar3 = this.f332762q;
        if (lVar3 != null) {
            if (take != null) {
                intBuffer = take.asIntBuffer();
            }
            C87412m.m108591d(intBuffer);
            lVar3.invoke(intBuffer);
        }
        GLES20.glBindFramebuffer(36160, 0);
        this.f332766u = false;
        if (this.f332770y.size() < 2) {
            this.f332770y.add(take);
        }
    }

    /* renamed from: g */
    public void mo158521g() {
        Matrix.setIdentityM(this.f332757l, 0);
        Matrix.setRotateM(this.f332757l, 0, (float) this.f332758m, 0.0f, 0.0f, -1.0f);
        if (this.f332759n || this.f332750e == 3) {
            int i = this.f332758m;
            if (i == 90 || i == 270) {
                Matrix.scaleM(this.f332757l, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(this.f332757l, 0, 1.0f, -1.0f, 1.0f);
            }
        } else {
            Matrix.scaleM(this.f332757l, 0, 1.0f, 1.0f, 1.0f);
        }
        if (this.f332760o) {
            Matrix.scaleM(this.f332757l, 0, 1.0f, -1.0f, 1.0f);
        }
        if (this.f332751f == 5) {
            mo162878i(((float) this.f332748c) / ((float) this.f332749d), ((float) this.f332746a) / ((float) this.f332747b));
        }
        mo158337k();
        mo162882t();
    }

    /* renamed from: h */
    public final void mo162877h() {
        int i;
        int i2 = this.f332748c;
        if (i2 > 0 && (i = this.f332749d) > 0 && this.f332756k == null) {
            this.f332756k = ByteBuffer.allocateDirect(i2 * i * 4).order(ByteOrder.nativeOrder());
        }
    }

    /* renamed from: i */
    public final void mo162878i(float f, float f2) {
        float f3;
        float f4;
        float f5;
        float f6;
        if (f2 > f) {
            float f7 = f2 / f;
            f4 = -f7;
            f3 = f7;
            f6 = -1.0f;
            f5 = 1.0f;
        } else {
            float f8 = (-f) / f2;
            f6 = f8;
            f5 = -f8;
            f4 = -1.0f;
            f3 = 1.0f;
        }
        Matrix.orthoM(this.f332757l, 0, f6, f5, f4, f3, 1.0f, -1.0f);
    }

    /* renamed from: j */
    public void mo158479j(boolean z) {
        this.f332760o = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo158337k() {
        /*
            r25 = this;
            r0 = r25
            int r1 = r0.f332751f
            r2 = 270(0x10e, float:3.78E-43)
            r3 = 90
            r4 = 2
            r7 = 0
            if (r1 != r4) goto L_0x0052
            int r1 = r0.f332758m
            if (r1 == r3) goto L_0x0015
            if (r1 != r2) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r1 = 0
            goto L_0x0016
        L_0x0015:
            r1 = 1
        L_0x0016:
            android.graphics.Point r8 = r0.f332745A
            int r9 = r8.x
            android.graphics.Point r10 = r0.f332771z
            int r11 = r10.x
            int r9 = r9 - r11
            int r10 = r10.y
            int r8 = r8.y
            int r10 = r10 - r8
            if (r1 == 0) goto L_0x0028
            r8 = r10
            goto L_0x0029
        L_0x0028:
            r8 = r9
        L_0x0029:
            if (r1 == 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r9 = r10
        L_0x002d:
            int r1 = r0.f332748c
            float r10 = (float) r1
            float r11 = (float) r8
            float r10 = r10 / r11
            int r12 = r0.f332749d
            float r13 = (float) r12
            float r14 = (float) r9
            float r13 = r13 / r14
            int r15 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r15 >= 0) goto L_0x003f
            float r1 = (float) r1
            float r1 = r1 / r13
            float r11 = r11 - r1
            goto L_0x0049
        L_0x003f:
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r1 <= 0) goto L_0x0048
            float r1 = (float) r12
            float r1 = r1 / r10
            float r14 = r14 - r1
            r11 = 0
            goto L_0x004a
        L_0x0048:
            r11 = 0
        L_0x0049:
            r14 = 0
        L_0x004a:
            int r1 = (int) r11
            int r8 = r8 - r1
            r0.f332768w = r8
            int r1 = (int) r14
            int r9 = r9 - r1
            r0.f332769x = r9
        L_0x0052:
            java.nio.FloatBuffer r1 = r0.f332752g
            r1.position(r7)
            java.nio.FloatBuffer r1 = r0.f332752g
            int r8 = r0.f332751f
            int r9 = r0.f332746a
            int r10 = r0.f332747b
            android.graphics.Point r11 = r0.f332771z
            android.graphics.Point r12 = r0.f332745A
            int r13 = r0.f332758m
            int r14 = r0.f332748c
            int r15 = r0.f332749d
            android.graphics.Rect r5 = r0.f332761p
            java.lang.String r7 = "textureValidLTPoint"
            gy3.C87412m.m108594g(r11, r7)
            java.lang.String r2 = "textureValidRBPoint"
            gy3.C87412m.m108594g(r12, r2)
            float[] r3 = w80.C111742d.f334650d
            r4 = 8
            float[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r4 = "copyOf(this, newSize)"
            gy3.C87412m.m108593f(r3, r4)
            int r6 = r11.x
            float r6 = (float) r6
            r17 = r4
            float r4 = (float) r9
            float r6 = r6 / r4
            r18 = r2
            int r2 = r11.y
            float r2 = (float) r2
            r19 = r7
            r7 = 1
            float r0 = (float) r7
            float r2 = r2 - r0
            float r7 = (float) r10
            float r2 = r2 / r7
            r20 = r1
            int r1 = r12.x
            float r1 = (float) r1
            float r1 = r1 - r0
            float r1 = r1 / r4
            int r0 = r12.y
            float r0 = (float) r0
            float r0 = r0 / r7
            r21 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>(r6, r2, r1, r0)
            float r0 = r3.left
            float r1 = r3.top
            float r2 = r3.right
            float r3 = r3.bottom
            r6 = 3
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = r15
            r15 = 2
            if (r8 == r15) goto L_0x012c
            if (r8 == r6) goto L_0x0101
            r11 = 4
            if (r8 == r11) goto L_0x00be
            goto L_0x0184
        L_0x00be:
            if (r5 == 0) goto L_0x0184
            int r8 = r5.left
            float r8 = (float) r8
            float r8 = r8 / r4
            float r8 = v80.C111413b.m151893a(r8)
            int r9 = r5.right
            float r9 = (float) r9
            float r9 = r9 / r4
            float r4 = v80.C111413b.m151893a(r9)
            int r9 = r5.bottom
            float r9 = (float) r9
            float r9 = r9 / r7
            float r9 = v80.C111413b.m151893a(r9)
            int r5 = r5.top
            float r5 = (float) r5
            float r5 = r5 / r7
            float r5 = v80.C111413b.m151893a(r5)
            float r2 = r2 - r0
            float r2 = java.lang.Math.abs(r2)
            float r7 = r3 - r1
            float r7 = java.lang.Math.abs(r7)
            float r8 = r8 * r2
            float r0 = r0 + r8
            float r2 = r2 * r4
            float r2 = r2 + r0
            float r3 = java.lang.Math.min(r1, r3)
            float r9 = r9 * r7
            float r3 = r3 + r9
            float r1 = java.lang.Math.min(r1, r3)
            float r7 = r7 * r5
            float r1 = r1 + r7
            goto L_0x0184
        L_0x0101:
            if (r5 == 0) goto L_0x0184
            int r0 = r5.width()
            int r1 = r5.height()
            int r2 = r5.left
            int r9 = r9 - r0
            float r0 = (float) r9
            float r0 = r0 / r4
            if (r2 != 0) goto L_0x0115
            float r2 = r22 - r0
            goto L_0x011c
        L_0x0115:
            float r2 = r22 - r0
            r24 = r2
            r2 = r0
            r0 = r24
        L_0x011c:
            int r3 = r5.top
            int r10 = r10 - r1
            float r1 = (float) r10
            if (r3 != 0) goto L_0x0127
            float r1 = r1 / r7
            float r3 = r22 - r1
            goto L_0x0184
        L_0x0127:
            float r3 = r1 / r7
            float r1 = r22 - r3
            goto L_0x0184
        L_0x012c:
            r4 = 90
            if (r13 == r4) goto L_0x0137
            r4 = 270(0x10e, float:3.78E-43)
            if (r13 != r4) goto L_0x0135
            goto L_0x0137
        L_0x0135:
            r4 = 0
            goto L_0x0138
        L_0x0137:
            r4 = 1
        L_0x0138:
            int r5 = r12.x
            int r7 = r11.x
            int r5 = r5 - r7
            int r7 = r11.y
            int r8 = r12.y
            int r7 = r7 - r8
            if (r4 == 0) goto L_0x0146
            r8 = r7
            goto L_0x0147
        L_0x0146:
            r8 = r5
        L_0x0147:
            if (r4 == 0) goto L_0x014a
            goto L_0x014b
        L_0x014a:
            r5 = r7
        L_0x014b:
            float r7 = (float) r14
            float r8 = (float) r8
            float r9 = r7 / r8
            r10 = r23
            float r10 = (float) r10
            float r5 = (float) r5
            float r11 = r10 / r5
            int r12 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r12 >= 0) goto L_0x015d
            float r7 = r7 / r11
            float r7 = r8 - r7
            goto L_0x0168
        L_0x015d:
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x0167
            float r10 = r10 / r9
            float r7 = r5 - r10
            r16 = 0
            goto L_0x016b
        L_0x0167:
            r7 = 0
        L_0x0168:
            r16 = r7
            r7 = 0
        L_0x016b:
            r9 = 1073741824(0x40000000, float:2.0)
            if (r4 == 0) goto L_0x0176
            float r7 = r7 / r9
            float r7 = r7 / r5
            float r16 = r16 / r9
            float r16 = r16 / r8
            goto L_0x017e
        L_0x0176:
            float r16 = r16 / r9
            float r4 = r16 / r8
            float r7 = r7 / r9
            float r16 = r7 / r5
            r7 = r4
        L_0x017e:
            float r0 = r0 + r7
            float r2 = r2 - r7
            float r3 = r3 + r16
            float r1 = r1 - r16
        L_0x0184:
            r4 = 0
            r21[r4] = r0
            r4 = 1
            r21[r4] = r1
            r4 = 2
            r21[r4] = r2
            r21[r6] = r1
            r1 = 4
            r21[r1] = r0
            r0 = 5
            r21[r0] = r3
            r1 = 6
            r21[r1] = r2
            r2 = 7
            r21[r2] = r3
            r3 = r20
            r4 = r21
            r3.put(r4)
            r3 = r25
            java.nio.FloatBuffer r4 = r3.f332752g
            r5 = 0
            r4.position(r5)
            java.nio.FloatBuffer r4 = r3.f332753h
            r4.position(r5)
            java.nio.FloatBuffer r4 = r3.f332753h
            int r5 = r3.f332751f
            android.graphics.Point r7 = r3.f332771z
            android.graphics.Point r8 = r3.f332745A
            int r9 = r3.f332758m
            int r10 = r3.f332748c
            int r11 = r3.f332749d
            r12 = r19
            gy3.C87412m.m108594g(r7, r12)
            r12 = r18
            gy3.C87412m.m108594g(r8, r12)
            float[] r12 = w80.C111742d.f334649c
            r13 = 8
            float[] r12 = java.util.Arrays.copyOf(r12, r13)
            r13 = r17
            gy3.C87412m.m108593f(r12, r13)
            r13 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r5 != r1) goto L_0x0219
            r5 = 90
            if (r9 == r5) goto L_0x01e3
            r5 = 270(0x10e, float:3.78E-43)
            if (r9 != r5) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            r5 = 0
            goto L_0x01e4
        L_0x01e3:
            r5 = 1
        L_0x01e4:
            int r9 = r8.x
            int r14 = r7.x
            int r9 = r9 - r14
            int r7 = r7.y
            int r8 = r8.y
            int r7 = r7 - r8
            if (r5 == 0) goto L_0x01f2
            r8 = r7
            goto L_0x01f3
        L_0x01f2:
            r8 = r9
        L_0x01f3:
            if (r5 == 0) goto L_0x01f6
            goto L_0x01f7
        L_0x01f6:
            r9 = r7
        L_0x01f7:
            float r5 = (float) r10
            float r7 = (float) r8
            float r8 = r5 / r7
            float r10 = (float) r11
            float r9 = (float) r9
            float r11 = r10 / r9
            int r14 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r14 <= 0) goto L_0x020e
            float r8 = r8 - r11
            float r8 = r8 * r7
            float r8 = r8 * r22
            float r8 = r8 / r5
            float r5 = r22 - r8
            float r8 = r8 + r13
            r7 = 0
            goto L_0x0225
        L_0x020e:
            float r11 = r11 - r8
            float r11 = r11 * r9
            float r11 = r11 * r22
            float r11 = r11 / r10
            float r5 = r11 + r13
            float r7 = r22 - r11
            goto L_0x021d
        L_0x0219:
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            r7 = 1065353216(0x3f800000, float:1.0)
        L_0x021d:
            r13 = r5
            r22 = r7
            r5 = 1065353216(0x3f800000, float:1.0)
            r7 = 0
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0225:
            r12[r7] = r13
            r7 = 1
            r12[r7] = r8
            r7 = 2
            r12[r7] = r22
            r12[r6] = r8
            r6 = 4
            r12[r6] = r13
            r12[r0] = r5
            r12[r1] = r22
            r12[r2] = r5
            r4.put(r12)
            java.nio.FloatBuffer r0 = r3.f332753h
            r1 = 0
            r0.position(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u80.C111139a.mo158337k():void");
    }

    /* renamed from: l */
    public void mo158471l() {
        Log.m105924i("MicroMsg.GLTextureRenderProc", hashCode() + " release renderOutputTexture:" + this.f332754i + ", renderOutputTextureFbo:" + this.f332755j + ", drawWidth:" + this.f332748c + ", drawHeight:" + this.f332749d);
        C110194c cVar = this.f332754i;
        if (cVar != null) {
            cVar.close();
        }
        C110192a aVar = this.f332755j;
        if (aVar != null) {
            aVar.close();
        }
    }

    /* renamed from: m */
    public void mo162879m() {
        mo158521g();
        Util.currentTicks();
        mo158472n();
        mo161601f();
    }

    /* renamed from: n */
    public abstract void mo158472n();

    /* renamed from: o */
    public void mo162880o(byte[] bArr) {
        C87412m.m108594g(bArr, "frame");
    }

    /* renamed from: p */
    public void mo159578p(int i) {
    }

    /* renamed from: q */
    public void mo143262q(int i) {
        this.f332758m = i;
    }

    /* renamed from: r */
    public final void mo162881r(int i, int i2) {
        if (!(i == this.f332768w && i2 == this.f332769x)) {
            this.f332770y.clear();
        }
        this.f332768w = i;
        this.f332769x = i2;
    }

    /* renamed from: s */
    public void mo158522s(int i, int i2) {
        if (!(this.f332748c == i && this.f332749d == i2)) {
            Log.m105924i("MicroMsg.GLTextureRenderProc", "updateDrawViewSize: current width=" + this.f332748c + ", height=" + this.f332749d + ". new width=" + i + ", height=" + i2);
        }
        this.f332749d = i2;
        this.f332748c = i;
        mo162881r(i, i2);
        if (this.f332750e == 3) {
            mo162877h();
        }
    }

    /* renamed from: t */
    public final void mo162882t() {
        if (this.f332750e == 2) {
            if (this.f332754i == null) {
                this.f332754i = C110193b.m149776b(true, 3);
                this.f332755j = C110193b.f329648a.mo161592a(3);
            }
            C111742d.f334647a.mo163459b(this.f332755j, this.f332754i, this.f332748c, this.f332749d);
        }
        GLES20.glViewport(0, 0, this.f332748c, this.f332749d);
        Log.m105925i("MicroMsg.GLTextureRenderProc", "updateRenderTypeStatus: glViewport drawWidth:%d, drawHeight:%d", Integer.valueOf(this.f332748c), Integer.valueOf(this.f332749d));
        if (this.f332766u) {
            if (this.f332754i == null) {
                this.f332754i = C110193b.m149776b(true, 3);
                this.f332755j = C110193b.f329648a.mo161592a(3);
            }
            C111742d.f334647a.mo163459b(this.f332755j, this.f332754i, this.f332768w, this.f332769x);
            GLES20.glViewport(0, 0, this.f332768w, this.f332769x);
            int i = this.f332758m;
            if (i == 90 || i == 270) {
                Matrix.scaleM(this.f332757l, 0, -1.0f, 1.0f, 1.0f);
            } else {
                Matrix.scaleM(this.f332757l, 0, 1.0f, -1.0f, 1.0f);
            }
            this.f332767v = true;
        }
    }

    /* renamed from: u */
    public void mo143263u(int i, int i2) {
        this.f332746a = i;
        this.f332747b = i2;
        Point point = this.f332771z;
        point.x = 0;
        point.y = i2;
        Point point2 = this.f332745A;
        point2.x = i;
        point2.y = 0;
    }
}

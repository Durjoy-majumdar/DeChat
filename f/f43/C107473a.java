package f43;

import android.opengl.GLES20;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import p80.C110192a;
import p80.C110193b;
import p80.C110194c;

/* renamed from: f43.a */
public class C107473a {

    /* renamed from: a */
    public int f321500a = 0;

    /* renamed from: b */
    public int f321501b = 0;

    /* renamed from: c */
    public int f321502c = 0;

    /* renamed from: d */
    public int f321503d;

    /* renamed from: e */
    public int f321504e;

    /* renamed from: f */
    public int f321505f = 0;

    /* renamed from: g */
    public int f321506g = 0;

    /* renamed from: h */
    public C110192a f321507h = null;

    /* renamed from: i */
    public C110194c f321508i = null;

    /* renamed from: j */
    public FloatBuffer f321509j;

    /* renamed from: k */
    public FloatBuffer f321510k;

    /* renamed from: l */
    public FloatBuffer f321511l;

    /* renamed from: m */
    public int f321512m;

    /* renamed from: n */
    public int f321513n;

    /* renamed from: o */
    public ByteBuffer f321514o;

    /* renamed from: p */
    public int f321515p;

    /* renamed from: q */
    public int f321516q;

    /* renamed from: r */
    public float[] f321517r = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: s */
    public float[] f321518s = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: t */
    public FloatBuffer f321519t;

    /* renamed from: a */
    public final void mo157880a(int i, int i2, int i3, int i4) {
        GLES20.glBindFramebuffer(36160, i);
        if (i > 0) {
            GLES20.glBindTexture(3553, i2);
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i3, i4, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
            GLES20.glBindTexture(3553, 0);
        }
    }

    /* renamed from: b */
    public final void mo157881b(int i, int i2, FloatBuffer floatBuffer, FloatBuffer floatBuffer2, boolean z) {
        GLES20.glUseProgram(i);
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, "vPosition");
        this.f321512m = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        GLES20.glVertexAttribPointer(this.f321512m, 2, 5126, false, 8, floatBuffer);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(i, "vTexCoord");
        this.f321513n = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        GLES20.glVertexAttribPointer(this.f321513n, 2, 5126, false, 8, floatBuffer2);
        if (z) {
            GLES20.glUniform1f(GLES20.glGetUniformLocation(i, "smoothDegree"), 0.5f);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(i, "showCounter"), 0);
            GLES20.glUniform1i(GLES20.glGetUniformLocation(i, "showMode"), 2);
            GLES20.glUniform1f(GLES20.glGetUniformLocation(i, "brightness"), 0.8f);
            GLES20.glUniform1f(GLES20.glGetUniformLocation(i, "texelWidth"), (float) this.f321515p);
            GLES20.glUniform1f(GLES20.glGetUniformLocation(i, "texelHeight"), (float) this.f321516q);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(GLES20.glGetAttribLocation(i, "inputImageTexture"), 0);
    }

    /* renamed from: c */
    public void mo157882c() {
        if (this.f321507h == null || this.f321515p <= 0 || this.f321516q <= 0) {
            mo157883d(this.f321505f, this.f321506g);
        }
        mo157880a(this.f321507h.f329644e, this.f321508i.f329652e, this.f321515p, this.f321516q);
        mo157881b(this.f321500a, this.f321502c, this.f321509j, this.f321519t, true);
        mo157885f(true);
        mo157880a(0, 0, 0, 0);
        mo157881b(this.f321501b, this.f321508i.f329652e, this.f321511l, this.f321510k, false);
        mo157885f(false);
    }

    /* renamed from: d */
    public final void mo157883d(int i, int i2) {
        Log.m105925i("MicroMsg.VoipGLSProgram", "initOutputFrameBuffer, width:%s, height:%s, frameBufferTextureOutput:%s, frameBufferOutput:%s", Integer.valueOf(i), Integer.valueOf(i2), this.f321508i, this.f321507h);
        C110192a aVar = this.f321507h;
        if (aVar != null) {
            aVar.close();
        }
        C110194c cVar = this.f321508i;
        if (cVar != null) {
            cVar.close();
        }
        this.f321515p = i;
        this.f321516q = i2;
        this.f321508i = C110193b.m149776b(true, 14);
        this.f321507h = C110193b.f329648a.mo161592a(14);
        GLES20.glBindTexture(3553, this.f321508i.f329652e);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, this.f321515p, this.f321516q, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
        GLES20.glBindTexture(3553, 0);
    }

    /* renamed from: e */
    public void mo157884e() {
        Log.m105925i("MicroMsg.VoipGLSProgram", "%s do destroy", Integer.valueOf(hashCode()));
        C110192a aVar = this.f321507h;
        if (aVar != null) {
            aVar.close();
        }
        C110194c cVar = this.f321508i;
        if (cVar != null) {
            cVar.close();
        }
        GLES20.glDeleteProgram(this.f321500a);
        GLES20.glDeleteProgram(this.f321501b);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glFinish();
        FloatBuffer floatBuffer = this.f321510k;
        if (floatBuffer != null) {
            floatBuffer.clear();
        }
        FloatBuffer floatBuffer2 = this.f321509j;
        if (floatBuffer2 != null) {
            floatBuffer2.clear();
        }
        FloatBuffer floatBuffer3 = this.f321519t;
        if (floatBuffer3 != null) {
            floatBuffer3.clear();
        }
        this.f321519t = null;
        this.f321509j = null;
        this.f321510k = null;
        this.f321500a = 0;
        this.f321501b = 0;
        this.f321507h = null;
        this.f321508i = null;
        this.f321503d = 0;
        this.f321504e = 0;
        this.f321516q = 0;
        this.f321515p = 0;
        this.f321506g = 0;
        this.f321505f = 0;
    }

    /* renamed from: f */
    public final void mo157885f(boolean z) {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        if (z) {
            GLES20.glViewport(0, 0, this.f321505f, this.f321506g);
            GLES20.glDrawArrays(5, 0, 4);
            ByteBuffer byteBuffer = this.f321514o;
            if (byteBuffer == null || byteBuffer.capacity() < this.f321506g * this.f321505f * 4) {
                this.f321514o = ByteBuffer.allocateDirect(this.f321506g * this.f321505f * 4).order(ByteOrder.nativeOrder());
            }
            this.f321514o.position(0);
            GLES20.glReadPixels(0, 0, this.f321505f, this.f321506g, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, this.f321514o);
            this.f321514o.position(0);
            this.f321514o.array();
            mo157880a(0, 0, 0, 0);
        } else {
            GLES20.glViewport(0, 0, this.f321503d, this.f321504e);
            GLES20.glDrawArrays(5, 0, 4);
        }
        GLES20.glUseProgram(0);
        GLES20.glDisableVertexAttribArray(this.f321512m);
        GLES20.glDisableVertexAttribArray(this.f321513n);
    }

    /* renamed from: g */
    public final void mo157886g(int i, float[] fArr) {
        if (i == 1) {
            float f = fArr[0];
            float f2 = fArr[1];
            fArr[0] = fArr[4];
            fArr[1] = fArr[5];
            fArr[4] = fArr[6];
            fArr[5] = fArr[7];
            fArr[6] = fArr[2];
            fArr[7] = fArr[3];
            fArr[2] = f;
            fArr[3] = f2;
        } else if (i == 2) {
            float f3 = fArr[0];
            fArr[0] = fArr[6];
            fArr[6] = f3;
            float f4 = fArr[1];
            fArr[1] = fArr[7];
            fArr[7] = f4;
            float f5 = fArr[2];
            fArr[2] = fArr[4];
            fArr[4] = f5;
            float f6 = fArr[3];
            fArr[3] = fArr[5];
            fArr[5] = f6;
        } else if (i == 3) {
            float f7 = fArr[0];
            float f8 = fArr[1];
            fArr[0] = fArr[2];
            fArr[1] = fArr[3];
            fArr[2] = fArr[6];
            fArr[3] = fArr[7];
            fArr[6] = fArr[4];
            fArr[7] = fArr[5];
            fArr[4] = f7;
            fArr[5] = f8;
        }
    }

    /* renamed from: h */
    public void mo157887h(float[] fArr, float[] fArr2) {
        if (fArr2 != null && fArr != null) {
            float[] copyOf = Arrays.copyOf(fArr2, fArr2.length);
            mo157886g(2, copyOf);
            FloatBuffer floatBuffer = this.f321510k;
            if (floatBuffer == null || floatBuffer.capacity() < copyOf.length) {
                this.f321510k = ByteBuffer.allocateDirect(copyOf.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            }
            this.f321510k.put(copyOf);
            this.f321510k.position(0);
            float[] copyOf2 = Arrays.copyOf(fArr, fArr.length);
            FloatBuffer floatBuffer2 = this.f321511l;
            if (floatBuffer2 == null || floatBuffer2.capacity() < copyOf2.length) {
                this.f321511l = ByteBuffer.allocateDirect(copyOf2.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
            }
            this.f321511l.put(copyOf2);
            this.f321511l.position(0);
        }
    }
}

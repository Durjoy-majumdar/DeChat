package bc3;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.github.henryye.nativeiv.bitmap.NativeBitmapStruct;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* renamed from: bc3.a */
public class C104077a {

    /* renamed from: p */
    public static final float[] f307812p = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: q */
    public static final float[] f307813q = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public FloatBuffer f307814a;

    /* renamed from: b */
    public FloatBuffer f307815b;

    /* renamed from: c */
    public float[] f307816c;

    /* renamed from: d */
    public float[] f307817d;

    /* renamed from: e */
    public int[] f307818e;

    /* renamed from: f */
    public int[] f307819f;

    /* renamed from: g */
    public int f307820g;

    /* renamed from: h */
    public int f307821h;

    /* renamed from: i */
    public int f307822i;

    /* renamed from: j */
    public int f307823j;

    /* renamed from: k */
    public int f307824k;

    /* renamed from: l */
    public int f307825l;

    /* renamed from: m */
    public int f307826m;

    /* renamed from: n */
    public int f307827n;

    /* renamed from: o */
    public boolean f307828o;

    public C104077a() {
        this.f307816c = new float[16];
        this.f307817d = new float[16];
        this.f307820g = 0;
        this.f307823j = 0;
        this.f307824k = 0;
        this.f307825l = 0;
        this.f307826m = 0;
        this.f307827n = 0;
        this.f307828o = false;
        this.f307818e = new int[3];
        this.f307819f = new int[3];
        for (int i = 0; i < 3; i++) {
            this.f307818e[i] = 0;
            this.f307819f[i] = 0;
        }
        float[] fArr = f307812p;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307814a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f307813q;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307815b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.f307817d, 0);
        if (!mo145676c() || mo145674a("BlurFilter") != 0) {
            throw new RuntimeException("sifeng: BlurFilter create failed");
        }
    }

    /* renamed from: a */
    public final int mo145674a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        Log.m105924i("BlurFilter.OES2Texture", str + ": EGL error: 0x" + Integer.toHexString(glGetError));
        return glGetError;
    }

    /* renamed from: b */
    public int mo145675b(String str, int i) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: c */
    public boolean mo145676c() {
        int b;
        int b2 = mo145675b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nuniform highp vec2 texSize;\nuniform highp float Offset;\nvarying vec2 TexCoord;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   TexCoord = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b2 == 0 || (b = mo145675b("precision mediump float;\nvarying vec2 TexCoord;\nuniform sampler2D inputImageTexture;\nvoid main()\n{\ngl_FragColor = vec4(texture2D(inputImageTexture, TexCoord).rgb, 1.0);\n}\n", 35632)) == 0) {
            return false;
        }
        this.f307820g = GLES20.glCreateProgram();
        if (mo145674a("glCreateProgram") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f307820g, b2);
        if (mo145674a("glAttachShader") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f307820g, b);
        if (mo145674a("glAttachShader") != 0) {
            return false;
        }
        GLES20.glLinkProgram(this.f307820g);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f307820g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(this.f307820g);
            GLES20.glDeleteProgram(this.f307820g);
            this.f307820g = 0;
            return false;
        }
        GLES20.glUseProgram(this.f307820g);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f307820g, "position");
        this.f307825l = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f307820g, "texCoord");
        this.f307826m = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f307827n = GLES20.glGetUniformLocation(this.f307820g, "inputImageTexture");
        this.f307821h = GLES20.glGetUniformLocation(this.f307820g, "uMVPMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f307820g, "uSTMatrix");
        this.f307822i = glGetUniformLocation;
        return (this.f307825l == -1 || this.f307826m == -1 || this.f307827n == -1 || this.f307821h == -1 || glGetUniformLocation == -1) ? false : true;
    }

    /* renamed from: d */
    public void mo145677d(int i, int i2, int i3, int i4) {
        int i5 = i2;
        int i6 = i3;
        int i7 = this.f307823j;
        int i8 = 1;
        if (!((i7 == i5 && this.f307824k == i6) || (i7 == i5 && this.f307824k == i6))) {
            float[] fArr = {1.25f, 1.5f, 3.0f};
            int i9 = 0;
            float f = 1.0f;
            while (i9 < 3) {
                int[] iArr = this.f307818e;
                if (iArr[i9] != 0) {
                    GLES20.glDeleteFramebuffers(i8, iArr, i9);
                    this.f307818e[i9] = 0;
                }
                int[] iArr2 = this.f307819f;
                if (iArr2[i9] != 0) {
                    GLES20.glDeleteTextures(i8, iArr2, i9);
                    this.f307819f[i9] = 0;
                }
                f = this.f307828o ? fArr[i9] : f * 1.5f;
                GLES20.glGenFramebuffers(i8, this.f307818e, i9);
                GLES20.glBindFramebuffer(36160, this.f307818e[i9]);
                GLES20.glGenTextures(i8, this.f307819f, i9);
                GLES20.glBindTexture(3553, this.f307819f[i9]);
                GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, (int) (((float) i5) / f), (int) (((float) i6) / f), 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f307819f[i9], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
                i9++;
                i8 = 1;
            }
            this.f307823j = i5;
            this.f307824k = i6;
        }
        float[] fArr2 = {1.25f, 1.5f, 3.0f};
        int i15 = i;
        int i16 = 0;
        float f2 = 1.0f;
        while (i16 < 3) {
            f2 = this.f307828o ? fArr2[i16] : f2 * 1.5f;
            GLES20.glBindFramebuffer(36160, this.f307818e[i16]);
            GLES20.glUseProgram(this.f307820g);
            GLES20.glViewport(0, 0, (int) (((float) i5) / f2), (int) (((float) i6) / f2));
            GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
            GLES20.glClear(16384);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, i15);
            GLES20.glUniform1i(this.f307827n, 0);
            Matrix.setIdentityM(this.f307816c, 0);
            GLES20.glUniformMatrix4fv(this.f307821h, 1, false, this.f307816c, 0);
            GLES20.glUniformMatrix4fv(this.f307822i, 1, false, this.f307817d, 0);
            GLES20.glEnableVertexAttribArray(this.f307825l);
            GLES20.glEnableVertexAttribArray(this.f307826m);
            this.f307814a.position(0);
            this.f307815b.position(0);
            GLES20.glVertexAttribPointer(this.f307825l, 3, 5126, false, 0, this.f307814a);
            GLES20.glVertexAttribPointer(this.f307826m, 2, 5126, false, 0, this.f307815b);
            GLES20.glDrawArrays(5, 0, 4);
            GLES20.glDisableVertexAttribArray(this.f307825l);
            GLES20.glDisableVertexAttribArray(this.f307826m);
            i15 = this.f307819f[i16];
            if (mo145674a("BlurFilter") == 0) {
                GLES20.glBindFramebuffer(36160, 0);
                i16++;
            } else {
                throw new RuntimeException("sifeng: BlurFilter process failed");
            }
        }
    }

    public C104077a(int i) {
        this.f307816c = new float[16];
        this.f307817d = new float[16];
        this.f307820g = 0;
        this.f307823j = 0;
        this.f307824k = 0;
        this.f307825l = 0;
        this.f307826m = 0;
        this.f307827n = 0;
        this.f307828o = false;
        if (i == 2 || i == 3 || i == 4) {
            this.f307828o = true;
        } else {
            this.f307828o = false;
        }
        this.f307818e = new int[3];
        this.f307819f = new int[3];
        for (int i2 = 0; i2 < 3; i2++) {
            this.f307818e[i2] = 0;
            this.f307819f[i2] = 0;
        }
        float[] fArr = f307812p;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307814a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f307813q;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307815b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.f307817d, 0);
        if (!mo145676c() || mo145674a("BlurFilter") != 0) {
            throw new RuntimeException("sifeng: BlurFilter create failed");
        }
    }
}

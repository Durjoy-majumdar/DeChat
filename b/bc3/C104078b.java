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

/* renamed from: bc3.b */
public class C104078b {

    /* renamed from: q */
    public static final float[] f307829q = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: r */
    public static final float[] f307830r = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: a */
    public FloatBuffer f307831a;

    /* renamed from: b */
    public FloatBuffer f307832b;

    /* renamed from: c */
    public float[] f307833c;

    /* renamed from: d */
    public float[] f307834d;

    /* renamed from: e */
    public int[] f307835e;

    /* renamed from: f */
    public int[] f307836f;

    /* renamed from: g */
    public int f307837g;

    /* renamed from: h */
    public int f307838h;

    /* renamed from: i */
    public int f307839i;

    /* renamed from: j */
    public int f307840j;

    /* renamed from: k */
    public int f307841k;

    /* renamed from: l */
    public int f307842l;

    /* renamed from: m */
    public int f307843m;

    /* renamed from: n */
    public int f307844n;

    /* renamed from: o */
    public int f307845o;

    /* renamed from: p */
    public int f307846p;

    public C104078b() {
        this.f307833c = new float[16];
        this.f307834d = new float[16];
        this.f307837g = 0;
        this.f307840j = 0;
        this.f307841k = 0;
        this.f307842l = 0;
        this.f307843m = 0;
        this.f307844n = 0;
        this.f307845o = 0;
        this.f307846p = 0;
        int[] iArr = new int[1];
        this.f307835e = iArr;
        iArr[0] = 0;
        int[] iArr2 = new int[1];
        this.f307836f = iArr2;
        iArr2[0] = 0;
        float[] fArr = f307829q;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307831a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f307830r;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307832b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.f307834d, 0);
        if (!mo145680c() || mo145678a("OES2TextureFilter create0") != 0) {
            throw new RuntimeException("sifeng: OES2TextureFilter create0 failed");
        }
    }

    /* renamed from: a */
    public final int mo145678a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        Log.m105924i("SharpenFilter.OES2Texture", str + ": EGL error: 0x" + Integer.toHexString(glGetError));
        return glGetError;
    }

    /* renamed from: b */
    public int mo145679b(String str, int i) {
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
    public boolean mo145680c() {
        int b = mo145679b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nvarying vec2 coordinate;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   coordinate = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b == 0) {
            return false;
        }
        int b2 = this.f307846p == 2 ? mo145679b("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying highp vec2 coordinate;\nuniform samplerExternalOES inputImageTexture;\nuniform int outputFormat;\nvec3 RGB2YUV(vec3 rgb)\n{\nvec3 yuv = vec3(0.0);\nyuv.x = rgb.r * 0.257 + rgb.g * 0.504 + rgb.b * 0.098 + 0.00627;\nyuv.y = rgb.r * -0.148 + rgb.g * -0.291 + rgb.b * 0.439 + 0.50196;\nyuv.z = rgb.r * 0.439 + rgb.g * -0.368 + rgb.b * -0.071 + 0.50196;\nreturn yuv;\n}\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\nvec3 yuvColor = outputFormat==1?RGB2YUV(orgColor):orgColor;\ngl_FragColor = vec4(yuvColor, 1.0);\n}\n", 35632) : mo145679b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform sampler2D inputImageTexture;\nuniform int outputFormat;\nvec3 RGB2YUV(vec3 rgb)\n{\nvec3 yuv = vec3(0.0);\nyuv.x = rgb.r * 0.257 + rgb.g * 0.504 + rgb.b * 0.098 + 0.00627;\nyuv.y = rgb.r * -0.148 + rgb.g * -0.291 + rgb.b * 0.439 + 0.50196;\nyuv.z = rgb.r * 0.439 + rgb.g * -0.368 + rgb.b * -0.071 + 0.50196;\nreturn yuv;\n}\nvoid main()\n{\nvec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\nvec3 yuvColor = outputFormat==1?RGB2YUV(orgColor):orgColor;\ngl_FragColor = vec4(yuvColor, 1.0);\n}\n", 35632);
        if (b2 == 0) {
            return false;
        }
        this.f307837g = GLES20.glCreateProgram();
        if (mo145678a("glCreateProgram") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f307837g, b);
        if (mo145678a("glAttachShader") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f307837g, b2);
        if (mo145678a("glAttachShader") != 0) {
            return false;
        }
        GLES20.glLinkProgram(this.f307837g);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f307837g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(this.f307837g);
            GLES20.glDeleteProgram(this.f307837g);
            this.f307837g = 0;
            return false;
        }
        GLES20.glUseProgram(this.f307837g);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f307837g, "position");
        this.f307842l = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f307837g, "texCoord");
        this.f307843m = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f307844n = GLES20.glGetUniformLocation(this.f307837g, "inputImageTexture");
        this.f307838h = GLES20.glGetUniformLocation(this.f307837g, "uMVPMatrix");
        this.f307839i = GLES20.glGetUniformLocation(this.f307837g, "uSTMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f307837g, "outputFormat");
        this.f307845o = glGetUniformLocation;
        return (this.f307842l == -1 || this.f307843m == -1 || this.f307844n == -1 || this.f307838h == -1 || this.f307839i == -1 || glGetUniformLocation == -1) ? false : true;
    }

    /* JADX WARNING: type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARNING: type inference failed for: r15v2 */
    /* JADX WARNING: type inference failed for: r15v3 */
    /* renamed from: d */
    public int mo145681d(int i, int i2, int i3, int i4) {
        ? r15;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        if (this.f307840j == i6 && this.f307841k == i7) {
            r15 = 0;
        } else {
            int[] iArr = this.f307835e;
            if (iArr[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                this.f307835e[0] = 0;
            }
            int[] iArr2 = this.f307836f;
            if (iArr2[0] != 0) {
                GLES20.glDeleteTextures(1, iArr2, 0);
                this.f307836f[0] = 0;
            }
            GLES20.glGenFramebuffers(1, this.f307835e, 0);
            GLES20.glBindFramebuffer(36160, this.f307835e[0]);
            GLES20.glGenTextures(1, this.f307836f, 0);
            GLES20.glBindTexture(3553, this.f307836f[0]);
            r15 = 0;
            GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i2, i3, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
            GLES20.glTexParameteri(3553, 10241, 9729);
            GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f307836f[0], 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.f307840j = i6;
            this.f307841k = i7;
        }
        GLES20.glBindFramebuffer(36160, this.f307835e[r15]);
        GLES20.glUseProgram(this.f307837g);
        GLES20.glViewport(r15, r15, i6, i7);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        if (this.f307846p == 2) {
            GLES20.glBindTexture(36197, i5);
        } else {
            GLES20.glBindTexture(3553, i5);
        }
        GLES20.glUniform1i(this.f307844n, r15);
        GLES20.glUniform1i(this.f307845o, i4);
        Matrix.setIdentityM(this.f307833c, r15);
        Matrix.setIdentityM(this.f307834d, r15);
        GLES20.glUniformMatrix4fv(this.f307838h, 1, r15, this.f307833c, r15);
        GLES20.glUniformMatrix4fv(this.f307839i, 1, r15, this.f307834d, r15);
        GLES20.glEnableVertexAttribArray(this.f307842l);
        GLES20.glEnableVertexAttribArray(this.f307843m);
        this.f307831a.position(r15);
        this.f307832b.position(r15);
        GLES20.glVertexAttribPointer(this.f307842l, 3, 5126, false, 0, this.f307831a);
        GLES20.glVertexAttribPointer(this.f307843m, 2, 5126, false, 0, this.f307832b);
        GLES20.glDrawArrays(5, r15, 4);
        GLES20.glDisableVertexAttribArray(this.f307842l);
        GLES20.glDisableVertexAttribArray(this.f307843m);
        GLES20.glBindFramebuffer(36160, r15);
        if (mo145678a("OES2TextureFilter") == 0) {
            return this.f307836f[r15];
        }
        throw new RuntimeException("sifeng: OES2TextureFilter process failed");
    }

    public C104078b(int i) {
        this.f307833c = new float[16];
        this.f307834d = new float[16];
        this.f307837g = 0;
        this.f307840j = 0;
        this.f307841k = 0;
        this.f307842l = 0;
        this.f307843m = 0;
        this.f307844n = 0;
        this.f307845o = 0;
        this.f307846p = i;
        int[] iArr = new int[1];
        this.f307835e = iArr;
        iArr[0] = 0;
        int[] iArr2 = new int[1];
        this.f307836f = iArr2;
        iArr2[0] = 0;
        float[] fArr = f307829q;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307831a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f307830r;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307832b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.f307834d, 0);
        if (!mo145680c() || mo145678a("OES2TextureFilter create1") != 0) {
            throw new RuntimeException("sifeng: OES2TextureFilter create1 failed");
        }
    }
}

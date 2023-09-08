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

/* renamed from: bc3.d */
public class C104080d {

    /* renamed from: t */
    public static final float[] f307851t = {-1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: u */
    public static final float[] f307852u = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: v */
    public static final float[] f307853v = {8.0f, 0.25f, 0.4f, 0.35f, 0.25f, 20.0f, 4.0f, 0.25f, 0.35f, 0.35f, 0.3f, 20.0f};

    /* renamed from: w */
    public static final float[] f307854w = {4.0f, 0.25f, 0.5f, 0.5f, 0.0f, 25.0f, 4.0f, 0.25f, 0.5f, 0.5f, 0.0f, 30.0f};

    /* renamed from: a */
    public FloatBuffer f307855a;

    /* renamed from: b */
    public FloatBuffer f307856b;

    /* renamed from: c */
    public float[] f307857c;

    /* renamed from: d */
    public float[] f307858d;

    /* renamed from: e */
    public int[] f307859e;

    /* renamed from: f */
    public int[] f307860f;

    /* renamed from: g */
    public int f307861g;

    /* renamed from: h */
    public int f307862h;

    /* renamed from: i */
    public int f307863i;

    /* renamed from: j */
    public int f307864j;

    /* renamed from: k */
    public int f307865k;

    /* renamed from: l */
    public int f307866l;

    /* renamed from: m */
    public int f307867m;

    /* renamed from: n */
    public int f307868n;

    /* renamed from: o */
    public int f307869o;

    /* renamed from: p */
    public int f307870p;

    /* renamed from: q */
    public int f307871q;

    /* renamed from: r */
    public int f307872r;

    /* renamed from: s */
    public int f307873s;

    public C104080d() {
        this.f307857c = new float[16];
        this.f307858d = new float[16];
        this.f307861g = 0;
        this.f307864j = 0;
        this.f307865k = 0;
        this.f307866l = 0;
        this.f307867m = 0;
        this.f307868n = 0;
        this.f307869o = 0;
        this.f307870p = 0;
        this.f307871q = 0;
        this.f307872r = 0;
        this.f307873s = 0;
        int[] iArr = new int[1];
        this.f307859e = iArr;
        iArr[0] = 0;
        int[] iArr2 = new int[1];
        this.f307860f = iArr2;
        iArr2[0] = 0;
        float[] fArr = f307851t;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307855a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f307852u;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307856b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.f307858d, 0);
        if (!mo145686c() || mo145684a("USM3FusionFilter") != 0) {
            throw new RuntimeException("USM3FusionFilter create failed");
        }
    }

    /* renamed from: a */
    public final int mo145684a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return 0;
        }
        Log.m105924i("SharpenFilter.USM3Fusion", str + ": EGL error: 0x" + Integer.toHexString(glGetError));
        return glGetError;
    }

    /* renamed from: b */
    public int mo145685b(String str, int i) {
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
    public boolean mo145686c() {
        int i;
        int b = mo145685b("uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nattribute vec4 position;\nattribute vec4 texCoord;\nvarying vec2 coordinate;\nvoid main()\n{\n   gl_Position = uMVPMatrix * position;\n   coordinate = (uSTMatrix * texCoord).xy;\n}\n", 35633);
        if (b == 0) {
            return false;
        }
        int i2 = this.f307873s;
        int b2 = i2 == 0 ? mo145685b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float y_lowpass3 = texture2D(blurredImageTexture3, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass3);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw3 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n   // if ((y0-y_lowpass1)*(y0-y_lowpass2)<0.0 || (y0-y_lowpass1)*(y0-y_lowpass3)<0.0) resw = 0.0; \n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]):-pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632) : i2 == 1 ? mo145685b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float y_lowpass3 = texture2D(blurredImageTexture3, coordinate).r;\n\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = 20.0/((1.0+exp(-(ay_residue-4.0)))*(ay_residue+4.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = 20.0/((1.0+exp(-(ay_residue-4.0)))*(ay_residue+4.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass3);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw3 = 20.0/((1.0+exp(-(ay_residue-4.0)))*(ay_residue+4.0))*y_residue;\n\n    float resw;\n   // if ((y0-y_lowpass1)*(y0-y_lowpass2)<0.0 || (y0-y_lowpass1)*(y0-y_lowpass3)<0.0) resw = 0.0; \n    resw = y0-y_lowpass1>=0.0?pow(resw1, 0.4)*pow(resw2, 0.3)*pow(resw3, 0.3):-pow(resw1, 0.4)*pow(resw2, 0.3)*pow(resw3, 0.3);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float val_weight = 1.0; //cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(1.0);\n}\n", 35632) : (i2 == 2 || i2 == 4) ? mo145685b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3]):-pow(resw1, paras[2])*pow(resw2, paras[3]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632) : i2 == 3 ? mo145685b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvoid main()\n{\n    float y0 = texture2D(inputImageTexture, coordinate).r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3]):-pow(resw1, paras[2])*pow(resw2, paras[3]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    gl_FragColor = vec4(yres, vec3(1.0));\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632) : mo145685b("precision mediump float;\nvarying highp vec2 coordinate;\nuniform float paras[6];\nuniform sampler2D inputImageTexture;\nuniform sampler2D blurredImageTexture1;\nuniform sampler2D blurredImageTexture2;\nuniform sampler2D blurredImageTexture3;\nvec3 YUV2RGB(vec3 yuv)\n{\n  yuv.x = yuv.x - 0.00627;\n  yuv.y = yuv.y - 0.50196;\n  yuv.z = yuv.z - 0.50196;\n  vec3 rgb = vec3(0.0);\n  rgb.r = yuv.x * 1.164 +                 yuv.z * 1.596;\n  rgb.g = yuv.x * 1.164 + yuv.y * -0.392 + yuv.z * -0.813;\n  rgb.b = yuv.x * 1.164 + yuv.y * 2.017;\n  return rgb;\n}\nvoid main()\n{\n    vec3 orgColor = texture2D(inputImageTexture, coordinate).rgb;\n\n    float y0 = orgColor.r;\n\n    float y_lowpass1 = texture2D(blurredImageTexture1, coordinate).r;\n\n    float y_lowpass2 = texture2D(blurredImageTexture2, coordinate).r;\n\n    float y_lowpass3 = texture2D(blurredImageTexture3, coordinate).r;\n\n    float para1 = paras[0];\n    float para3 = paras[5];\n    float y_residue = abs(y0-y_lowpass1);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue;  //24\n    float ay_residue = y_residue*255.0;\n    float resw1 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass2);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw2 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    y_residue = abs(y0-y_lowpass3);\n    y_residue = y_residue>0.09412?(y_residue<0.18823?0.18823-y_residue:0.0):y_residue; //24\n    ay_residue = y_residue*255.0;\n    float resw3 = para3/((1.0+exp(-(ay_residue-para1)))*(ay_residue+2.0))*y_residue;\n\n    float resw;\n   // if ((y0-y_lowpass1)*(y0-y_lowpass2)<0.0 || (y0-y_lowpass1)*(y0-y_lowpass3)<0.0) resw = 0.0; \n    resw = y0-y_lowpass1>=0.0?pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]):-pow(resw1, paras[2])*pow(resw2, paras[3])*pow(resw3, paras[4]);\n\n    float cvalue = clamp(y0+resw, 0.0, 1.0);\n\n    float para2 = paras[1];\n    float val_weight = cvalue <= (1.0 - para2)? 1.0 : (resw<0.0?1.0:pow((1.0-cvalue)/para2,3.0));\n    float yres = val_weight*cvalue + (1.0-val_weight)*y0;\n\n    vec3 rgbColor = YUV2RGB(vec3(yres, orgColor.gb));\n    gl_FragColor = vec4(rgbColor, 1.0);\n    // if (coordinate.x<0.2 && coordinate.y<0.2) gl_FragColor = vec4(vec3(paras[4]*2.0), 1.0);\n}\n", 35632);
        if (b2 == 0) {
            return false;
        }
        this.f307861g = GLES20.glCreateProgram();
        if (mo145684a("glCreateProgram") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f307861g, b);
        if (mo145684a("glAttachShader") != 0) {
            return false;
        }
        GLES20.glAttachShader(this.f307861g, b2);
        if (mo145684a("glAttachShader") != 0) {
            return false;
        }
        GLES20.glLinkProgram(this.f307861g);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(this.f307861g, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glGetProgramInfoLog(this.f307861g);
            GLES20.glDeleteProgram(this.f307861g);
            this.f307861g = 0;
            return false;
        }
        GLES20.glUseProgram(this.f307861g);
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f307861g, "position");
        this.f307866l = glGetAttribLocation;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.f307861g, "texCoord");
        this.f307867m = glGetAttribLocation2;
        GLES20.glEnableVertexAttribArray(glGetAttribLocation2);
        this.f307868n = GLES20.glGetUniformLocation(this.f307861g, "inputImageTexture");
        this.f307869o = GLES20.glGetUniformLocation(this.f307861g, "blurredImageTexture1");
        this.f307870p = GLES20.glGetUniformLocation(this.f307861g, "blurredImageTexture2");
        this.f307871q = GLES20.glGetUniformLocation(this.f307861g, "blurredImageTexture3");
        this.f307872r = GLES20.glGetUniformLocation(this.f307861g, "paras");
        this.f307862h = GLES20.glGetUniformLocation(this.f307861g, "uMVPMatrix");
        int glGetUniformLocation = GLES20.glGetUniformLocation(this.f307861g, "uSTMatrix");
        this.f307863i = glGetUniformLocation;
        return (this.f307866l == -1 || this.f307867m == -1 || this.f307868n == -1 || this.f307862h == -1 || glGetUniformLocation == -1 || this.f307869o == -1 || this.f307870p == -1 || (((i = this.f307873s) == 0 || i == 1) && this.f307871q == -1) || (i != 1 && this.f307872r == -1)) ? false : true;
    }

    /* renamed from: d */
    public int mo145687d(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i5;
        int i15 = i6;
        if (!(this.f307864j == i9 && this.f307865k == i15)) {
            int[] iArr = this.f307859e;
            if (iArr[0] != 0) {
                GLES20.glDeleteFramebuffers(1, iArr, 0);
                this.f307859e[0] = 0;
            }
            int[] iArr2 = this.f307860f;
            if (iArr2[0] != 0) {
                GLES20.glDeleteTextures(1, iArr2, 0);
                this.f307860f[0] = 0;
            }
            GLES20.glGenFramebuffers(1, this.f307859e, 0);
            if (this.f307873s != 1) {
                GLES20.glBindFramebuffer(36160, this.f307859e[0]);
                GLES20.glGenTextures(1, this.f307860f, 0);
                GLES20.glBindTexture(3553, this.f307860f[0]);
                GLES20.glTexImage2D(3553, 0, NativeBitmapStruct.GLFormat.GL_RGBA, i5, i6, 0, NativeBitmapStruct.GLFormat.GL_RGBA, NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, (Buffer) null);
                GLES20.glTexParameteri(3553, 10241, 9729);
                GLES20.glTexParameteri(3553, Task.EXTRAS_LIMIT_BYTES, 9729);
                GLES20.glTexParameteri(3553, 10242, 33071);
                GLES20.glTexParameteri(3553, 10243, 33071);
                GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f307860f[0], 0);
                GLES20.glBindTexture(3553, 0);
                GLES20.glBindFramebuffer(36160, 0);
            }
            this.f307864j = i9;
            this.f307865k = i15;
        }
        GLES20.glBindFramebuffer(36160, this.f307859e[0]);
        GLES20.glUseProgram(this.f307861g);
        GLES20.glViewport(0, 0, i9, i15);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.f307868n, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.f307869o, 1);
        GLES20.glActiveTexture(33986);
        GLES20.glBindTexture(3553, i3);
        GLES20.glUniform1i(this.f307870p, 2);
        GLES20.glActiveTexture(33987);
        GLES20.glBindTexture(3553, i4);
        GLES20.glUniform1i(this.f307871q, 3);
        int i16 = (i7 - 1) * 6;
        if (!(i16 == 0 || i16 == 6)) {
            i16 = 0;
        }
        int i17 = this.f307873s;
        if (i17 == 0) {
            GLES20.glUniform1fv(this.f307872r, 6, f307853v, i16);
        } else if (i17 == 2 || i17 == 3 || i17 == 4) {
            float[] fArr = new float[6];
            for (int i18 = 0; i18 < 6; i18++) {
                fArr[i18] = f307854w[i16 + i18];
            }
            fArr[5] = (float) i8;
            GLES20.glUniform1fv(this.f307872r, 6, fArr, 0);
        } else {
            int i19 = this.f307872r;
            if (i19 != -1) {
                GLES20.glUniform1fv(i19, 6, f307853v, i16);
            }
        }
        Matrix.setIdentityM(this.f307857c, 0);
        GLES20.glUniformMatrix4fv(this.f307862h, 1, false, this.f307857c, 0);
        GLES20.glUniformMatrix4fv(this.f307863i, 1, false, this.f307858d, 0);
        GLES20.glEnableVertexAttribArray(this.f307866l);
        GLES20.glEnableVertexAttribArray(this.f307867m);
        this.f307855a.position(0);
        this.f307856b.position(0);
        GLES20.glVertexAttribPointer(this.f307866l, 3, 5126, false, 0, this.f307855a);
        GLES20.glVertexAttribPointer(this.f307867m, 2, 5126, false, 0, this.f307856b);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f307866l);
        GLES20.glDisableVertexAttribArray(this.f307867m);
        GLES20.glBindFramebuffer(36160, 0);
        if (mo145684a("USM3FusionFilter") == 0) {
            return this.f307860f[0];
        }
        throw new RuntimeException("sifeng: USM3FusionFilter process failed");
    }

    public C104080d(int i) {
        this.f307857c = new float[16];
        this.f307858d = new float[16];
        this.f307861g = 0;
        this.f307864j = 0;
        this.f307865k = 0;
        this.f307866l = 0;
        this.f307867m = 0;
        this.f307868n = 0;
        this.f307869o = 0;
        this.f307870p = 0;
        this.f307871q = 0;
        this.f307872r = 0;
        this.f307873s = i;
        int[] iArr = new int[1];
        this.f307859e = iArr;
        iArr[0] = 0;
        int[] iArr2 = new int[1];
        this.f307860f = iArr2;
        iArr2[0] = 0;
        float[] fArr = f307851t;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307855a = asFloatBuffer;
        asFloatBuffer.put(fArr).position(0);
        float[] fArr2 = f307852u;
        FloatBuffer asFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f307856b = asFloatBuffer2;
        asFloatBuffer2.put(fArr2).position(0);
        Matrix.setIdentityM(this.f307858d, 0);
        if (!mo145686c() || mo145684a("USM3FusionFilter") != 0) {
            throw new RuntimeException("USM3FusionFilter create failed");
        }
    }
}

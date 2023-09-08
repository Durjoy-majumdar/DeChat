package j71;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: j71.b */
public final class C108585b {

    /* renamed from: a */
    public static final C108586a f325048a = new C108586a((C8480h) null);

    /* renamed from: b */
    public static final float[] f325049b = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: c */
    public static final float[] f325050c = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: d */
    public static final float[] f325051d = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: j71.b$a */
    public static final class C108586a {
        public C108586a(C8480h hVar) {
        }

        /* renamed from: a */
        public final int mo159579a(String str, int i) {
            C87412m.m108594g(str, "shaderSource");
            int[] iArr = new int[1];
            int glCreateShader = GLES20.glCreateShader(i);
            GLES20.glShaderSource(glCreateShader, str);
            GLES20.glCompileShader(glCreateShader);
            GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
            if (iArr[0] != 0) {
                return glCreateShader;
            }
            Log.m105921e("MicroMsg.EmojiCaptureGLUtil", "loadShader error, infoLog: %s", GLES20.glGetShaderInfoLog(glCreateShader));
            return 0;
        }

        /* renamed from: b */
        public final int mo159580b(String str, String str2) {
            C87412m.m108594g(str, "vertexShaderSource");
            C87412m.m108594g(str2, "fragmentShaderSource");
            int[] iArr = new int[1];
            int a = mo159579a(str, 35633);
            if (a == 0) {
                Log.m105920e("MicroMsg.EmojiCaptureGLUtil", "load vertex shader failed");
                return 0;
            }
            int a2 = mo159579a(str2, 35632);
            if (a2 == 0) {
                Log.m105920e("MicroMsg.EmojiCaptureGLUtil", "load fragment shader failed");
                return 0;
            }
            int glCreateProgram = GLES20.glCreateProgram();
            GLES20.glAttachShader(glCreateProgram, a);
            GLES20.glAttachShader(glCreateProgram, a2);
            GLES20.glLinkProgram(glCreateProgram);
            GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
            if (iArr[0] <= 0) {
                Log.m105920e("MicroMsg.EmojiCaptureGLUtil", "link program failed");
                return 0;
            }
            GLES20.glDeleteShader(a);
            GLES20.glDeleteShader(a2);
            return glCreateProgram;
        }
    }
}

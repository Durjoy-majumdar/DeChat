package f43;

import android.opengl.GLES20;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: f43.e */
public class C107478e {
    /* renamed from: a */
    public static int m145592a(String str, String str2) {
        int b;
        int b2 = m145593b(35633, str);
        if (b2 == 0 || (b = m145593b(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            Log.m105920e("MicroMsg.VoipRenderUtils", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, b2);
        GLES20.glAttachShader(glCreateProgram, b);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.m105920e("MicroMsg.VoipRenderUtils", "Could not link program: ");
        Log.m105920e("MicroMsg.VoipRenderUtils", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    /* renamed from: b */
    public static int m145593b(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m105921e("MicroMsg.VoipRenderUtils", "Could not compile shader %s and shader info is %s", Integer.valueOf(i), GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }
}

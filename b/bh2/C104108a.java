package bh2;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bh2.a */
public abstract class C104108a {

    /* renamed from: a */
    public int f308016a;

    /* renamed from: a */
    public int mo145759a(int i, String str) {
        Log.m105924i("MicroMsg.Story.AbsShader", "loadShader");
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        if (glCreateShader == 0) {
            return 0;
        }
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.m105920e("MicroMsg.Story.AbsShader", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: b */
    public int mo145760b(Bitmap bitmap, int i, boolean z) {
        Log.m105924i("MicroMsg.Story.AbsShader", "loadTexture");
        if (bitmap != null) {
            if (i > 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
            }
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            i = iArr[0];
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 10497);
            GLES20.glTexParameteri(3553, 10243, 10497);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            if (z) {
                bitmap.recycle();
            }
        } else {
            Log.m105924i("MicroMsg.Story.AbsShader", "loadTexture bitmap null");
        }
        return i;
    }
}

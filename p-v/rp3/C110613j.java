package rp3;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;

/* renamed from: rp3.j */
public class C110613j {
    /* renamed from: a */
    public static int m150606a(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glGetShaderInfoLog(glCreateShader);
        return 0;
    }

    /* renamed from: b */
    public static int m150607b(Bitmap bitmap, int i, boolean z) {
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texSubImage2D(3553, 0, 0, 0, bitmap);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }
}

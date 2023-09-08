package zs2;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zs2.b */
public class C112685b {
    /* renamed from: a */
    public static int m154068a(Context context) {
        SnsMethodCalculate.markStartTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        SnsMethodCalculate.markStartTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        int glCreateProgram = GLES20.glCreateProgram();
        int glCreateShader = GLES20.glCreateShader(35632);
        int glCreateShader2 = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(glCreateShader2, "attribute vec4 aPosition;attribute vec2 aTextureCoord;uniform mat4 uProjectMatrix;varying vec2 vTextureCoord;void main(){gl_Position = uProjectMatrix * aPosition;\nvTextureCoord = aTextureCoord;\n}");
        GLES20.glShaderSource(glCreateShader, "precision mediump float;varying vec2 vTextureCoord;uniform sampler2D uTexture;void main(){gl_FragColor = texture2D(uTexture, vTextureCoord);}");
        GLES20.glCompileShader(glCreateShader2);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glAttachShader(glCreateProgram, glCreateShader2);
        GLES20.glAttachShader(glCreateProgram, glCreateShader);
        GLES20.glLinkProgram(glCreateProgram);
        SnsMethodCalculate.markEndTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        SnsMethodCalculate.markEndTimeMs("getProgram", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        return glCreateProgram;
    }

    /* renamed from: b */
    public static int m154069b(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
        if (bitmap == null) {
            Log.m105924i("SphereImageView.Utils", "initTexture, bmp==null");
            SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return 0;
        }
        Log.m105924i("SphereImageView.Utils", "initTexture, bmp.w=" + bitmap.getWidth() + ", bmp.h=" + bitmap.getHeight());
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i = iArr[0];
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9728.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return i;
        } catch (Throwable th) {
            Log.m105920e("SphereImageView.Utils", "initTexture exp:" + th.toString());
            SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.widget.SphereImageView.Utils");
            return 0;
        }
    }
}

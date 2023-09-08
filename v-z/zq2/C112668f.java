package zq2;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.google.android.gms.gcm.Task;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: zq2.f */
public class C112668f {
    /* renamed from: a */
    public static Bitmap m154044a(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        if (i == 0 || i2 == 0) {
            SnsMethodCalculate.markEndTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(i3);
        if (i4 == 0) {
            SnsMethodCalculate.markEndTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return createBitmap;
        }
        Bitmap roundedCornerBitmap = BitmapUtil.getRoundedCornerBitmap(createBitmap, true, (float) i4);
        SnsMethodCalculate.markEndTimeMs("createColorBitmap", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        return roundedCornerBitmap;
    }

    /* renamed from: b */
    public static int m154045b(Bitmap bitmap) {
        SnsMethodCalculate.markStartTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
        if (bitmap == null) {
            Log.m105924i("Utils", "initTexture, bmp==null");
            SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return 0;
        }
        Log.m105924i("Utils", "initTexture, bmp.w=" + bitmap.getWidth() + ", bmp.h=" + bitmap.getHeight());
        try {
            int[] iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            int i = iArr[0];
            if (i == 0) {
                SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
                return 0;
            }
            GLES20.glBindTexture(3553, i);
            GLES20.glTexParameterf(3553, 10241, 9728.0f);
            GLES20.glTexParameterf(3553, Task.EXTRAS_LIMIT_BYTES, 9728.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return i;
        } catch (Throwable th) {
            Log.m105920e("Utils", "initTexture exp:" + android.util.Log.getStackTraceString(th));
            SnsMethodCalculate.markEndTimeMs("initTexture", "com.tencent.mm.plugin.sns.ad.widget.gllib.Utils");
            return 0;
        }
    }
}

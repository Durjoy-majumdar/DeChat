package pr3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.vfs.C86013q1;
import p156gj.C45918i0;
import p206nj.C88960n;

/* renamed from: pr3.a */
public class C89436a {
    /* renamed from: a */
    public static boolean m111809a() {
        String a;
        int i = Build.VERSION.SDK_INT;
        if ((i != 27 || (a = C45918i0.m51188a("ro.mediatek.platform")) == null || (!a.startsWith("mt6765") && !a.startsWith("MT6765"))) && C88960n.m111088a()) {
            Log.m105924i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImageOpt is MTK platform");
            if (i == 24 || i == 25 || i == 27) {
                Log.m105925i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImgOpt is MTK platform, android api: %d, cannot use BigImgOpt", Integer.valueOf(i));
                Log.m105925i("BigImageReporter", "alvinluo reportMTKPlatform apiLevel: %d", Integer.valueOf(i));
                if (i == 24) {
                    C115669n.INSTANCE.mo175913w(896, 0, 1);
                } else if (i == 25) {
                    C115669n.INSTANCE.mo175913w(896, 1, 1);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m111810b(String str) {
        if (m111809a()) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(C86013q1.m106448i(str, false), options);
        if (decodeFile != null) {
            decodeFile.recycle();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        Log.m105925i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImgOpt ignore abTestFlag, widthFactor: %f, heightFactor: %f, width: %d, height: %d", Float.valueOf(1.0f), Float.valueOf(1.0f), Integer.valueOf(i), Integer.valueOf(i2));
        Context context = MMApplicationContext.getContext();
        int i3 = context == null ? 0 : context.getResources().getDisplayMetrics().widthPixels;
        Context context2 = MMApplicationContext.getContext();
        int i4 = context2 == null ? 0 : context2.getResources().getDisplayMetrics().heightPixels;
        Log.m105919d("MicroMsg.BigImageJudge", "alvinluo checkUseBigImageOpt width: %d, height: %d, screenWidth: %d, screenHeight: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        return ((float) i) >= ((float) i3) * 1.0f || ((float) i2) >= ((float) i4) * 1.0f;
    }

    /* renamed from: c */
    public static boolean m111811c(String str) {
        if (m111809a()) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        Bitmap decodeFile = BitmapFactory.decodeFile(C86013q1.m106448i(str, false), options);
        if (decodeFile != null) {
            decodeFile.recycle();
        }
        int i = options.outWidth;
        int i2 = options.outHeight;
        Log.m105925i("MicroMsg.BigImageJudge", "alvinluo checkUseBigImgOpt ignore abTestFlag, widthFactor: %f, heightFactor: %f, width: %d, height: %d", Float.valueOf(2.0f), Float.valueOf(2.5f), Integer.valueOf(i), Integer.valueOf(i2));
        Context context = MMApplicationContext.getContext();
        int i3 = context == null ? 0 : context.getResources().getDisplayMetrics().widthPixels;
        Context context2 = MMApplicationContext.getContext();
        int i4 = context2 == null ? 0 : context2.getResources().getDisplayMetrics().heightPixels;
        Log.m105919d("MicroMsg.BigImageJudge", "alvinluo checkUseBigImageOpt width: %d, height: %d, screenWidth: %d, screenHeight: %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
        return ((float) i) >= ((float) i3) * 2.5f || ((float) i2) >= ((float) i4) * 2.0f;
    }
}

package ym0;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.WindowManager;
import com.eclipsesource.mmv8.Platform;
import com.tencent.p014mm.sdk.platformtools.Log;
import in0.C87760d;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* renamed from: ym0.l */
public class C91515l {
    /* renamed from: a */
    public static String m114817a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(j < 3600000 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: b */
    public static float m114818b(Context context) {
        if (!(context instanceof Activity)) {
            return 1.0f;
        }
        float f = ((Activity) context).getWindow().getAttributes().screenBrightness;
        float f2 = 0.0f;
        if (f >= 0.0f) {
            return f;
        }
        try {
            f2 = (float) Settings.System.getInt(context.getContentResolver(), "screen_brightness");
            int i = 255;
            try {
                Resources system = Resources.getSystem();
                int identifier = system.getIdentifier("config_screenBrightnessSettingMaximum", "integer", Platform.ANDROID);
                if (identifier != 0) {
                    i = system.getInteger(identifier);
                }
                Log.m105919d("MicroMsg.VideoPlayerUtils", "getMaxBrightness %d", Integer.valueOf(i));
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.VideoPlayerUtils", "get max brightness fail, fallback to 255");
            }
            f2 /= (float) i;
        } catch (Settings.SettingNotFoundException e) {
            Log.printErrStackTrace("MicroMsg.VideoPlayerUtils", e, "", new Object[0]);
        }
        return f2;
    }

    /* renamed from: c */
    public static boolean m114819c(C87760d dVar) {
        return dVar != null && 2 == dVar.getPlayerType();
    }

    /* renamed from: d */
    public static boolean m114820d(C87760d dVar) {
        return dVar != null && 1 == dVar.getPlayerType();
    }

    /* renamed from: e */
    public static void m114821e(Context context, float f) {
        if (context instanceof Activity) {
            if (f < 0.01f) {
                f = 0.01f;
            } else if (f > 1.0f) {
                f = 1.0f;
            }
            Activity activity = (Activity) context;
            WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
            attributes.screenBrightness = f;
            activity.getWindow().setAttributes(attributes);
        }
    }
}

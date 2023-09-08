package f83;

import android.app.Activity;
import android.content.Context;
import android.provider.Settings;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

/* renamed from: f83.c */
public class C86779c {
    /* renamed from: a */
    public static String m107715a(long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(j < 3600000 ? "mm:ss" : "HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
        return simpleDateFormat.format(Long.valueOf(j));
    }

    /* renamed from: b */
    public static float m107716b(Context context) {
        float f = ((Activity) context).getWindow().getAttributes().screenBrightness;
        if (f >= 0.0f) {
            return f;
        }
        try {
            return ((float) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / 255.0f;
        } catch (Exception unused) {
            return 0.0f;
        }
    }
}

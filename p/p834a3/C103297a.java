package p834a3;

import android.os.Build;
import androidx.exifinterface.media.ExifInterface;

/* renamed from: a3.a */
public class C103297a {
    /* renamed from: a */
    public static boolean m136810a() {
        if (Build.VERSION.SDK_INT < 31) {
            String str = Build.VERSION.CODENAME;
            return !"REL".equals(str) && str.compareTo(ExifInterface.LATITUDE_SOUTH) >= 0;
        }
    }
}

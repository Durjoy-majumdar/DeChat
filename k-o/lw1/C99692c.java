package lw1;

import android.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C87412m;
import java.io.IOException;

/* renamed from: lw1.c */
public final class C99692c {

    /* renamed from: a */
    public static final C99692c f292189a = new C99692c();

    /* renamed from: a */
    public final void mo139060a(String str, String str2) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(str2, "dst");
        String i = C86013q1.m106448i(str, false);
        C87412m.m108591d(i);
        ExifInterface exifInterface = new ExifInterface(i);
        String attribute = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE);
        String attribute2 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE);
        String attribute3 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF);
        String attribute4 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF);
        String attribute5 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE);
        String attribute6 = exifInterface.getAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF);
        String i2 = C86013q1.m106448i(str2, false);
        C87412m.m108591d(i2);
        ExifInterface exifInterface2 = new ExifInterface(i2);
        if (attribute != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE, attribute);
        }
        if (attribute2 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE, attribute2);
        }
        if (attribute3 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LONGITUDE_REF, attribute3);
        }
        if (attribute4 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_LATITUDE_REF, attribute4);
        }
        if (attribute5 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE, attribute5);
        }
        if (attribute6 != null) {
            exifInterface2.setAttribute(androidx.exifinterface.media.ExifInterface.TAG_GPS_DEST_LONGITUDE_REF, attribute6);
        }
        try {
            exifInterface2.saveAttributes();
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.PhotoExifUtil", e, "saveAttributes error!", new Object[0]);
        }
    }
}

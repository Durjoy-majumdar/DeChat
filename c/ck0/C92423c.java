package ck0;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.vfs.C86009m1;
import java.io.InputStream;

/* renamed from: ck0.c */
public class C92423c {
    /* renamed from: a */
    public static void m116248a(InputStream inputStream, String str) {
        if (inputStream != null && m116250c(str)) {
            ExifInterface exifInterface = new ExifInterface(str);
            C92422b.m116247a(new ExifInterface(inputStream), exifInterface);
            exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, (String) null);
            exifInterface.saveAttributes();
        }
    }

    /* renamed from: b */
    public static void m116249b(String str, String str2) {
        if (m116250c(str) && m116250c(str2)) {
            ExifInterface exifInterface = new ExifInterface(str2);
            C92422b.m116247a(new ExifInterface(str), exifInterface);
            exifInterface.setAttribute(ExifInterface.TAG_ORIENTATION, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_IMAGE_WIDTH, (String) null);
            exifInterface.setAttribute(ExifInterface.TAG_THUMBNAIL_IMAGE_WIDTH, (String) null);
            exifInterface.saveAttributes();
        }
    }

    /* renamed from: c */
    public static boolean m116250c(String str) {
        return !TextUtils.isEmpty(str) && new C86009m1(str).mo119967g();
    }
}

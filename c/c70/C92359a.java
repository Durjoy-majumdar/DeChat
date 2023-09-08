package c70;

import android.graphics.Bitmap;

/* renamed from: c70.a */
public class C92359a {
    /* renamed from: a */
    public static long m116168a(Object obj) {
        if (obj == null || !(obj instanceof Bitmap)) {
            return 0;
        }
        return (long) ((Bitmap) obj).getByteCount();
    }
}

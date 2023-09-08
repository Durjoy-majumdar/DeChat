package ce2;

import androidx.exifinterface.media.ExifInterface;

/* renamed from: ce2.b */
public final class C28545b {
    /* renamed from: a */
    public static String m38262a(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ((byte) (((((byte) str.charAt(i)) ^ (i - length)) ^ 60) & ExifInterface.MARKER)));
        }
        return sb.toString();
    }
}

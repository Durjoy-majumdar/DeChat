package n20;

import android.graphics.Bitmap;
import c70.C92359a;

/* renamed from: n20.p */
public final class C100039p {
    /* renamed from: a */
    public static final String m130707a(Bitmap bitmap) {
        if (bitmap == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(C92359a.m116168a(bitmap));
        sb.append(';');
        sb.append(bitmap.getWidth());
        sb.append(';');
        sb.append(bitmap.getHeight());
        sb.append(']');
        return sb.toString();
    }
}

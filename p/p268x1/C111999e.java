package p268x1;

import android.graphics.Paint;
import android.graphics.Rect;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: x1.e */
public final class C111999e {
    /* renamed from: a */
    public static final void m152720a(Paint paint, CharSequence charSequence, int i, int i2, Rect rect) {
        C87412m.m108594g(paint, "paint");
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        C87412m.m108594g(rect, "rect");
        paint.getTextBounds(charSequence, i, i2, rect);
    }
}

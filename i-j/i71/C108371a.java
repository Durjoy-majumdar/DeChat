package i71;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.thumbplayer.tmediacodec.util.MimeTypes;
import gy3.C87412m;

/* renamed from: i71.a */
public final class C108371a implements C108374c {

    /* renamed from: a */
    public CharSequence f324433a;

    /* renamed from: a */
    public void mo158885a() {
    }

    /* renamed from: b */
    public void mo158886b(String str) {
        C87412m.m108594g(str, "fontName");
    }

    /* renamed from: c */
    public void mo158887c(Canvas canvas, int i, int i2, float f, float f2, Paint paint, boolean z) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        CharSequence charSequence = this.f324433a;
        if (charSequence != null) {
            C87412m.m108591d(charSequence);
            canvas.drawText(charSequence, i, i2, f, f2, paint);
            if (z) {
                canvas.drawText("...", paint.measureText(this.f324433a, i, i2) + f, f2, paint);
            }
        }
    }

    public void setText(CharSequence charSequence) {
        C87412m.m108594g(charSequence, MimeTypes.BASE_TYPE_TEXT);
        this.f324433a = charSequence;
    }
}

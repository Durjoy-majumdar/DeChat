package xr3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.BackgroundColorSpan;
import android.text.style.CharacterStyle;
import java.util.Iterator;
import java.util.List;
import yr3.C112482d;

/* renamed from: xr3.a */
public class C112171a extends C112172b<BackgroundColorSpan> {
    public C112171a(int i, int i2, CharacterStyle characterStyle) {
        super(i, i2, characterStyle);
    }

    /* renamed from: b */
    public void mo163971b(Canvas canvas, TextPaint textPaint, List<C112482d> list) {
        mo163972a(list);
        int color = textPaint.getColor();
        textPaint.setColor(((BackgroundColorSpan) this.f335874g).getBackgroundColor());
        Iterator<RectF> it = this.f335871d.iterator();
        while (it.hasNext()) {
            canvas.drawRect(it.next(), textPaint);
        }
        textPaint.setColor(color);
    }
}

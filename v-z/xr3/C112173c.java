package xr3;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import yr3.C112482d;

/* renamed from: xr3.c */
public class C112173c extends C112172b<ClickableSpan> {

    /* renamed from: h */
    public boolean f335875h;

    public C112173c(int i, int i2, ClickableSpan clickableSpan) {
        super(i, i2, clickableSpan);
    }

    /* renamed from: b */
    public void mo163971b(Canvas canvas, TextPaint textPaint, List<C112482d> list) {
        mo163972a(list);
        if (this.f335875h) {
            int color = textPaint.getColor();
            int i = textPaint.bgColor;
            boolean isUnderlineText = textPaint.isUnderlineText();
            ((ClickableSpan) this.f335874g).updateDrawState(textPaint);
            textPaint.setColor(textPaint.bgColor);
            Iterator<RectF> it = this.f335871d.iterator();
            while (it.hasNext()) {
                canvas.drawRect(it.next(), textPaint);
            }
            textPaint.setColor(color);
            textPaint.setUnderlineText(isUnderlineText);
            textPaint.bgColor = i;
            this.f335875h = false;
        }
    }

    public void onClick(View view) {
        CharacterStyle characterStyle = this.f335874g;
        if (characterStyle != null) {
            ((ClickableSpan) characterStyle).onClick(view);
        }
    }
}

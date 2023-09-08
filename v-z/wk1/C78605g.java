package wk1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;
import gy3.C8480h;
import gy3.C87412m;

/* renamed from: wk1.g */
public final class C78605g extends ImageSpan {

    /* renamed from: e */
    public static final /* synthetic */ int f230236e = 0;

    /* renamed from: d */
    public C53185a f230237d = new C53185a((BitmapDrawable) null, 0, 0, 7, (C8480h) null);

    /* renamed from: wk1.g$a */
    public static final class C53185a {

        /* renamed from: a */
        public BitmapDrawable f148377a;

        /* renamed from: b */
        public int f148378b;

        /* renamed from: c */
        public int f148379c;

        public C53185a() {
            this((BitmapDrawable) null, 0, 0, 7, (C8480h) null);
        }

        public C53185a(BitmapDrawable bitmapDrawable, int i, int i2, int i3, C8480h hVar) {
            bitmapDrawable = (i3 & 1) != 0 ? null : bitmapDrawable;
            i = (i3 & 2) != 0 ? 0 : i;
            i2 = (i3 & 4) != 0 ? 0 : i2;
            this.f148377a = bitmapDrawable;
            this.f148378b = i;
            this.f148379c = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C53185a)) {
                return false;
            }
            C53185a aVar = (C53185a) obj;
            return C87412m.m108589b(this.f148377a, aVar.f148377a) && this.f148378b == aVar.f148378b && this.f148379c == aVar.f148379c;
        }

        public int hashCode() {
            BitmapDrawable bitmapDrawable = this.f148377a;
            return ((((bitmapDrawable == null ? 0 : bitmapDrawable.hashCode()) * 31) + this.f148378b) * 31) + this.f148379c;
        }

        public String toString() {
            return "ImageSpanParams(bitmapDrawable=" + this.f148377a + ", leftMargin=" + this.f148378b + ", rightMargin=" + this.f148379c + ')';
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78605g(Drawable drawable) {
        super(drawable);
        C87412m.m108594g(drawable, "d");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(paint, "paint");
        canvas.save();
        Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
        int i6 = fontMetricsInt.descent;
        canvas.translate(f + ((float) this.f230237d.f148378b), (float) (((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2)) - ((getDrawable().getBounds().bottom - getDrawable().getBounds().top) / 2)));
        int alpha = paint.getAlpha();
        int alpha2 = getDrawable().getAlpha();
        if (alpha == 0 && alpha2 != alpha) {
            getDrawable().setAlpha(alpha);
        }
        getDrawable().draw(canvas);
        getDrawable().setAlpha(alpha2);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C87412m.m108594g(paint, "paint");
        Rect bounds = getDrawable().getBounds();
        C87412m.m108593f(bounds, "drawable.bounds");
        if (fontMetricsInt != null) {
            Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
            int i3 = fontMetricsInt2.descent;
            int i4 = fontMetricsInt2.ascent;
            int i5 = i4 + ((i3 - i4) / 2);
            int i6 = (bounds.bottom - bounds.top) / 2;
            int i7 = i5 - i6;
            fontMetricsInt.ascent = i7;
            fontMetricsInt.top = i7;
            int i8 = i5 + i6;
            fontMetricsInt.bottom = i8;
            fontMetricsInt.descent = i8;
        }
        int i9 = bounds.right;
        C53185a aVar = this.f230237d;
        return i9 + aVar.f148378b + aVar.f148379c;
    }
}

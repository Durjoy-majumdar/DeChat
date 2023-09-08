package wk1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.style.ImageSpan;
import er1.C58739j4;
import ft1.C59319a;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import o40.C11348f;

/* renamed from: wk1.l */
public final class C15437l extends ImageSpan {

    /* renamed from: f */
    public static final C15438a f41880f = new C15438a((C8480h) null);

    /* renamed from: d */
    public final C15439m f41881d;

    /* renamed from: e */
    public final String f41882e = "FinderLiveRoundImageSpan";

    /* renamed from: wk1.l$a */
    public static final class C15438a {
        public C15438a(C8480h hVar) {
        }

        /* renamed from: a */
        public static Drawable m14437a(C15438a aVar, String str, float f, float f2, int i, Object obj) {
            if ((i & 2) != 0) {
                int i2 = C15439m.f41883i;
                f = (float) C15439m.f41884j;
            }
            if ((i & 4) != 0) {
                int i3 = C15439m.f41883i;
                f2 = C15439m.f41885k;
            }
            aVar.getClass();
            C87412m.m108594g(str, "spanStr");
            Paint paint = new Paint();
            paint.setTextSize(f);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setBounds(0, 0, (int) (paint.measureText(str, 0, str.length()) + (((float) 2) * f2) + f2), 1);
            return gradientDrawable;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15437l(Drawable drawable, C15439m mVar) {
        super(drawable);
        C87412m.m108594g(drawable, "drawable");
        C87412m.m108594g(mVar, "config");
        this.f41881d = mVar;
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        int i6 = i;
        float f2 = f;
        int i7 = i3;
        int i8 = i5;
        Paint paint2 = paint;
        C87412m.m108594g(canvas2, "canvas");
        C87412m.m108594g(paint2, "paint");
        try {
            int color = paint.getColor();
            float textSize = paint.getTextSize();
            paint2.setTextSize((float) this.f41881d.f41893g);
            paint2.setColor(this.f41881d.f41890d);
            float f3 = (float) i7;
            float f4 = (float) i8;
            C15439m mVar = this.f41881d;
            float f5 = mVar.f41894h;
            int i9 = mVar.f41891e;
            if (i9 > 0) {
                float f6 = f4 - f3;
                float f7 = (float) 2;
                float f8 = f6 / f7;
                float f9 = ((float) i9) / f7;
                f3 = f8 - f9;
                f4 = f8 + f9;
                int i15 = C15439m.f41883i;
                if (f5 == C15439m.f41886l) {
                    f5 = f9;
                }
            }
            CharSequence charSequence2 = this.f41881d.f41887a;
            float measureText = paint2.measureText(charSequence2, i6, i6 + charSequence2.length());
            C15439m mVar2 = this.f41881d;
            canvas2.drawRoundRect(new RectF(f2, f3, measureText + mVar2.f41888b + mVar2.f41889c + f2, f4), f5, f5, paint2);
            paint2.setColor(this.f41881d.f41892f);
            float abs = (Math.abs(paint.ascent() + paint.descent()) / ((float) 2)) + ((float) ((i8 - i7) / 2)) + ((float) 1);
            CharSequence charSequence3 = this.f41881d.f41887a;
            canvas.drawText(charSequence3, i, i6 + charSequence3.length(), f2 + this.f41881d.f41888b, abs, paint);
            paint2.setColor(color);
            paint2.setTextSize(textSize);
        } catch (Exception e) {
            C11348f.C11349a.m11178b(C59319a.f169618b, "liveInvalidBadgeTag", false, (C11348f.C11352b) null, false, false, (C32224a) null, 60, (Object) null);
            C58739j4 j4Var = C58739j4.f168176a;
            j4Var.mo83712h0(e, this.f41882e + ".draw(config:" + this.f41881d + ",draw text:" + charSequence + ",start:" + i6 + ",end:" + i2 + ')');
        }
    }
}

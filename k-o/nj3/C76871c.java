package nj3;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.TextView;
import com.tencent.neattextview.textview.view.NeatTextView;
import xo3.C78967g;
import yr3.C79150a;

/* renamed from: nj3.c */
public class C76871c implements LineBackgroundSpan {

    /* renamed from: d */
    public View f224699d;

    /* renamed from: e */
    public final int f224700e;

    /* renamed from: f */
    public int f224701f;

    /* renamed from: g */
    public int f224702g;

    /* renamed from: h */
    public Rect f224703h = new Rect();

    public C76871c(View view, int i, int i2, int i3) {
        this.f224699d = view;
        this.f224700e = i;
        this.f224701f = i2;
        this.f224702g = i3;
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        float f;
        Layout layout;
        if (this.f224702g >= i6 && this.f224701f <= i7) {
            int color = paint.getColor();
            int c = C78967g.m95470c(this.f224699d, this.f224701f);
            int c2 = C78967g.m95470c(this.f224699d, this.f224702g);
            if (c <= i8 && i8 <= c2) {
                if (c == i8) {
                    f = C78967g.m95475h(this.f224699d, this.f224701f);
                } else {
                    View view = this.f224699d;
                    if (view instanceof NeatTextView) {
                        C79150a layout2 = ((NeatTextView) view).getLayout();
                        if (layout2 != null) {
                            f = layout2.mo109120S(layout2.mo109122b(i8));
                        }
                    } else if ((view instanceof TextView) && (layout = ((TextView) view).getLayout()) != null) {
                        f = layout.getLineLeft(i8);
                    }
                    f = 0.0f;
                }
                i = (int) f;
                i2 = c2 == i8 ? (int) C78967g.m95475h(this.f224699d, this.f224702g) : ((int) C78967g.m95473f(this.f224699d, i8)) + i;
            }
            int descent = (int) (((float) i4) + paint.descent());
            Rect rect = this.f224703h;
            rect.left = i;
            if (this.f224701f == i6) {
                rect.left = i - 4;
            }
            rect.right = i2;
            if (this.f224702g == i2) {
                rect.right = i2 + 4;
            }
            rect.top = i3;
            rect.bottom = descent;
            paint.setColor(this.f224700e);
            canvas.drawRect(this.f224703h, paint);
            paint.setColor(color);
        }
    }
}

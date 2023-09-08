package jl1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import gy3.C87412m;

/* renamed from: jl1.d */
public final class C9469d extends View {

    /* renamed from: d */
    public final int f29540d;

    /* renamed from: e */
    public final int f29541e;

    /* renamed from: f */
    public final int f29542f;

    /* renamed from: g */
    public final Paint f29543g;

    /* renamed from: h */
    public boolean f29544h;

    /* renamed from: i */
    public final int f29545i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9469d(Context context, int i, int i2, int i3) {
        super(context);
        C87412m.m108594g(context, "context");
        this.f29540d = i;
        this.f29541e = i2;
        this.f29542f = i3;
        Paint paint = new Paint();
        this.f29543g = paint;
        this.f29545i = i3 - i2;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
    }

    public final int getColor() {
        return this.f29540d;
    }

    public final int getSelectedStokeWidth() {
        return this.f29542f;
    }

    public final int getUnselectedStokeWidth() {
        return this.f29541e;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        float width = ((float) getWidth()) / 2.0f;
        float height = ((float) getHeight()) / 2.0f;
        this.f29543g.setColor(-1);
        if (this.f29544h) {
            canvas.drawCircle(width, height, width, this.f29543g);
            this.f29543g.setColor(this.f29540d);
            canvas.drawCircle(width, height, width - ((float) this.f29542f), this.f29543g);
        } else {
            canvas.drawCircle(width, height, width - ((float) this.f29545i), this.f29543g);
            this.f29543g.setColor(this.f29540d);
            canvas.drawCircle(width, height, width - ((float) this.f29542f), this.f29543g);
        }
        super.onDraw(canvas);
    }

    public final void setHasSelected(boolean z) {
        if (this.f29544h != z) {
            this.f29544h = z;
            invalidate();
        }
    }
}

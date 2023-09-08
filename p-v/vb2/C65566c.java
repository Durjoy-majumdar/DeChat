package vb2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import iy3.C60641c;
import kg3.C76577a;
import y24.C91368a;

/* renamed from: vb2.c */
public final class C65566c extends RecyclerView.C0129l {

    /* renamed from: d */
    public final Context f188653d;

    /* renamed from: e */
    public final Paint f188654e;

    /* renamed from: f */
    public final float f188655f;

    /* renamed from: g */
    public final float f188656g;

    /* renamed from: h */
    public final float f188657h;

    /* renamed from: i */
    public final Drawable f188658i;

    /* renamed from: j */
    public final int f188659j;

    /* renamed from: n */
    public long f188660n;

    /* renamed from: o */
    public long f188661o = 1000;

    /* renamed from: p */
    public C65564b f188662p;

    public C65566c(Context context) {
        C87412m.m108594g(context, "context");
        this.f188653d = context;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(C0966R.dimen.f3645a3);
        Paint paint = new Paint(1);
        this.f188654e = paint;
        paint.setColor(-1);
        paint.setTextSize((float) dimensionPixelSize);
        this.f188655f = paint.measureText("00:00");
        this.f188657h = paint.getFontMetrics().top;
        this.f188656g = paint.getFontMetrics().bottom - paint.getFontMetrics().top;
        Drawable drawable = context.getDrawable(C0966R.C0969drawable.air);
        C87412m.m108591d(drawable);
        this.f188658i = drawable;
        int b = C76577a.m92151b(context, 2);
        this.f188659j = b;
        drawable.setBounds(0, 0, b, b);
    }

    /* renamed from: h */
    public void mo122h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C16628w wVar) {
        Canvas canvas2 = canvas;
        C87412m.m108594g(canvas2, "c");
        C87412m.m108594g(recyclerView, "parent");
        C87412m.m108594g(wVar, "state");
        C65564b bVar = this.f188662p;
        if (bVar != null) {
            int b = C60641c.m70921b((((float) (recyclerView.getWidth() / 2)) + this.f188655f) / bVar.f188652c);
            long b2 = this.f188660n - ((long) C60641c.m70921b(((float) (recyclerView.getWidth() / 2)) / bVar.f188652c));
            long j = this.f188660n;
            long j2 = (long) b;
            long j3 = j - j2;
            if (j3 < 0) {
                j3 = 0;
            }
            long j4 = j + j2;
            long j5 = this.f188661o;
            if (j4 > j5) {
                j4 = j5;
            }
            long j6 = bVar.f188651b;
            long j7 = j3 / j6;
            long j8 = j4 / j6;
            if (j7 <= j8) {
                while (true) {
                    long j9 = bVar.f188651b;
                    Long.signum(j7);
                    long j15 = j9 * j7;
                    float f = ((float) (j15 - b2)) * bVar.f188652c;
                    if (j7 % ((long) 2) == 1) {
                        Drawable drawable = this.f188658i;
                        int i = (int) f;
                        int i2 = this.f188659j;
                        float f2 = this.f188656g;
                        drawable.setBounds(i - (i2 / 2), (((int) f2) - i2) / 2, i + (i2 / 2), (((int) f2) + i2) / 2);
                        this.f188658i.draw(canvas2);
                    } else {
                        canvas2.drawText(C91368a.m114616a(j15, "mm:ss", true), f - (this.f188655f / ((float) 2)), -this.f188657h, this.f188654e);
                    }
                    if (j7 != j8) {
                        j7++;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}

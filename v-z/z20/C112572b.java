package z20;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import cp3.C45142d;

/* renamed from: z20.b */
public class C112572b implements Cloneable {

    /* renamed from: h */
    public static Paint f337059h;

    /* renamed from: d */
    public Path f337060d;

    /* renamed from: e */
    public int f337061e;

    /* renamed from: f */
    public float f337062f = 1.0f;

    /* renamed from: g */
    public float f337063g = ((float) C45142d.m49971b(5.0f));

    static {
        Paint paint = new Paint();
        f337059h = paint;
        paint.setAntiAlias(true);
        f337059h.setStyle(Paint.Style.STROKE);
        f337059h.setStrokeCap(Paint.Cap.ROUND);
    }

    public C112572b(Path path, float f, int i) {
        this.f337060d = path;
        this.f337062f = f;
        this.f337061e = i;
    }

    /* renamed from: a */
    public void mo164305a(Canvas canvas) {
        f337059h.setColor(this.f337061e);
        f337059h.setStrokeWidth(this.f337063g * this.f337062f);
        if (!this.f337060d.isEmpty()) {
            canvas.drawPath(this.f337060d, f337059h);
        }
    }
}

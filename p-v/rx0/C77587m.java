package rx0;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.C0966R;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: rx0.m */
public final class C77587m extends View {

    /* renamed from: d */
    public Bitmap f226189d;

    /* renamed from: e */
    public Paint f226190e = new Paint();

    /* renamed from: f */
    public Path f226191f = new Path();

    /* renamed from: g */
    public Rect f226192g;

    /* renamed from: h */
    public Rect f226193h;

    /* renamed from: i */
    public RectF f226194i;

    /* renamed from: j */
    public int f226195j;

    /* renamed from: n */
    public int f226196n;

    /* renamed from: o */
    public int f226197o;

    /* renamed from: p */
    public AnimatorListenerAdapter f226198p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C77587m(Context context, Bitmap bitmap) {
        super(context);
        C87412m.m108594g(bitmap, "contentBitmap");
        this.f226195j = C76577a.m92151b(context, 32) / 2;
        new Paint();
        Paint paint = this.f226190e;
        if (paint != null) {
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        }
        this.f226189d = bitmap;
        this.f226196n = (int) (((float) bitmap.getWidth()) * 1.0f);
        this.f226197o = (int) (((float) bitmap.getHeight()) * 1.0f);
        this.f226192g = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        this.f226193h = new Rect(0, 0, this.f226196n, this.f226197o);
        RectF rectF = new RectF();
        this.f226194i = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) this.f226196n;
        rectF.bottom = (float) this.f226197o;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Path path = this.f226191f;
        if (path != null) {
            path.reset();
            Path path2 = this.f226191f;
            if (path2 != null) {
                RectF rectF = this.f226194i;
                if (rectF != null) {
                    int i = this.f226195j;
                    path2.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
                    Path path3 = this.f226191f;
                    if (path3 != null) {
                        canvas.clipPath(path3);
                        canvas.drawColor(getContext().getResources().getColor(C0966R.color.f2929c));
                        Bitmap bitmap = this.f226189d;
                        if (bitmap != null) {
                            Rect rect = this.f226192g;
                            if (rect != null) {
                                Rect rect2 = this.f226193h;
                                if (rect2 != null) {
                                    canvas.drawBitmap(bitmap, rect, rect2, this.f226190e);
                                } else {
                                    C87412m.m108603p("mDstRect");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mDrawRect");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("mContentBitmap");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("mClipPath");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("mMaskRect");
                    throw null;
                }
            } else {
                C87412m.m108603p("mClipPath");
                throw null;
            }
        } else {
            C87412m.m108603p("mClipPath");
            throw null;
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f226196n, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f226197o, 1073741824));
    }

    public final void setListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f226198p = animatorListenerAdapter;
    }
}

package f92;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: f92.g */
public final class C107529g extends View {

    /* renamed from: d */
    public Bitmap f321714d;

    /* renamed from: e */
    public Paint f321715e = new Paint();

    /* renamed from: f */
    public Paint f321716f = new Paint();

    /* renamed from: g */
    public Path f321717g = new Path();

    /* renamed from: h */
    public Rect f321718h;

    /* renamed from: i */
    public Rect f321719i;

    /* renamed from: j */
    public RectF f321720j;

    /* renamed from: n */
    public int f321721n;

    /* renamed from: o */
    public int f321722o;

    /* renamed from: p */
    public int f321723p;

    /* renamed from: q */
    public int f321724q;

    /* renamed from: r */
    public int f321725r;

    /* renamed from: s */
    public int f321726s;

    /* renamed from: t */
    public int f321727t = -1;

    /* renamed from: u */
    public boolean f321728u;

    /* renamed from: v */
    public int f321729v;

    /* renamed from: w */
    public AnimatorListenerAdapter f321730w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C107529g(Context context, Bitmap bitmap) {
        super(context);
        C87412m.m108594g(bitmap, "contentBitmap");
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = this.f321716f;
        if (paint != null) {
            paint.setXfermode(porterDuffXfermode);
            this.f321714d = bitmap;
            this.f321725r = (int) (((float) bitmap.getWidth()) * 1.0f);
            this.f321726s = (int) (((float) bitmap.getHeight()) * 1.0f);
            this.f321718h = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f321719i = new Rect(0, 0, this.f321725r, this.f321726s);
            RectF rectF = new RectF();
            this.f321720j = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            int i = this.f321725r;
            rectF.right = (float) i;
            rectF.bottom = (float) this.f321726s;
            String format = String.format("init: mWidth:%d mHeight:%d", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(this.f321726s)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            Log.m105924i("MicroMsg.TransformToMultiTaskFBAnimationMaskView", format);
            return;
        }
        C87412m.m108603p("mMaskPaint");
        throw null;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (this.f321728u) {
            canvas.translate((float) this.f321721n, 0.0f);
        } else {
            canvas.drawColor(Color.argb(this.f321729v, 0, 0, 0));
        }
        Path path = this.f321717g;
        if (path != null) {
            path.reset();
            Path path2 = this.f321717g;
            if (path2 != null) {
                RectF rectF = this.f321720j;
                if (rectF != null) {
                    int i = this.f321722o;
                    path2.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
                    Path path3 = this.f321717g;
                    if (path3 != null) {
                        canvas.clipPath(path3);
                        Bitmap bitmap = this.f321714d;
                        if (bitmap != null) {
                            Rect rect = this.f321718h;
                            if (rect != null) {
                                Rect rect2 = this.f321719i;
                                if (rect2 != null) {
                                    canvas.drawBitmap(bitmap, rect, rect2, this.f321715e);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f321725r, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f321726s, 1073741824));
    }

    public final void setContentStartPosX(int i) {
        this.f321727t = i;
    }

    public final void setListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f321730w = animatorListenerAdapter;
    }
}

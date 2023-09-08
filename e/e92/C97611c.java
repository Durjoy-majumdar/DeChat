package e92;

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
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import gy3.C87412m;
import java.util.Arrays;

/* renamed from: e92.c */
public final class C97611c extends C107268a {

    /* renamed from: s */
    public static final int f286357s = C74942w4.m89784a(MMApplicationContext.getContext(), 8);

    /* renamed from: d */
    public Bitmap f286358d;

    /* renamed from: e */
    public GradientDrawable f286359e;

    /* renamed from: f */
    public Paint f286360f = new Paint();

    /* renamed from: g */
    public Paint f286361g = new Paint();

    /* renamed from: h */
    public Path f286362h = new Path();

    /* renamed from: i */
    public Rect f286363i;

    /* renamed from: j */
    public Rect f286364j;

    /* renamed from: n */
    public RectF f286365n;

    /* renamed from: o */
    public int f286366o;

    /* renamed from: p */
    public int f286367p;

    /* renamed from: q */
    public int f286368q;

    /* renamed from: r */
    public final float[] f286369r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97611c(Context context, Bitmap bitmap) {
        super(context);
        C87412m.m108594g(bitmap, "contentBitmap");
        int i = f286357s;
        this.f286369r = new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) i, (float) i, (float) i, (float) i};
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = this.f286361g;
        if (paint != null) {
            paint.setXfermode(porterDuffXfermode);
            this.f286358d = bitmap;
            this.f286366o = (int) (((float) bitmap.getWidth()) * 1.0f);
            this.f286367p = (int) (((float) bitmap.getHeight()) * 1.0f);
            this.f286363i = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f286364j = new Rect(0, 0, this.f286366o, this.f286367p);
            RectF rectF = new RectF();
            this.f286365n = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) this.f286366o;
            rectF.bottom = (float) this.f286367p;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(230, 0, 0, 0), Color.argb(76, 0, 0, 0), Color.argb(0, 0, 0, 0)});
            this.f286359e = gradientDrawable;
            gradientDrawable.setGradientType(0);
            GradientDrawable gradientDrawable2 = this.f286359e;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setGradientCenter(0.5f, 0.4f);
            }
            GradientDrawable gradientDrawable3 = this.f286359e;
            if (gradientDrawable3 != null) {
                Rect rect = this.f286364j;
                if (rect != null) {
                    gradientDrawable3.setBounds(rect);
                } else {
                    C87412m.m108603p("mDstRect");
                    throw null;
                }
            }
            String format = String.format("default init: mWidth:%d mHeight:%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f286366o), Integer.valueOf(this.f286367p)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            Log.m105924i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
            return;
        }
        C87412m.m108603p("mMaskPaint");
        throw null;
    }

    /* renamed from: a */
    public void mo136869a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f286365n;
        if (rectF != null) {
            rectF.set(f, f2, f3, f4);
        } else {
            C87412m.m108603p("mMaskRect");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo136870b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.f286369r;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    /* renamed from: c */
    public void mo136871c(int i, int i2) {
        this.f286366o = i;
        this.f286367p = i2;
    }

    public final Bitmap getContentBitmap() {
        return this.f286358d;
    }

    public final GradientDrawable getGradientDrawable() {
        return this.f286359e;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Path path = this.f286362h;
        if (path != null) {
            path.reset();
            Path path2 = this.f286362h;
            if (path2 != null) {
                RectF rectF = this.f286365n;
                if (rectF != null) {
                    path2.addRoundRect(rectF, this.f286369r, Path.Direction.CW);
                    Path path3 = this.f286362h;
                    if (path3 != null) {
                        canvas.clipPath(path3);
                        Bitmap bitmap = this.f286358d;
                        if (bitmap != null) {
                            Rect rect = this.f286363i;
                            if (rect != null) {
                                Rect rect2 = this.f286364j;
                                if (rect2 != null) {
                                    Paint paint = this.f286360f;
                                    if (paint != null) {
                                        canvas.drawBitmap(bitmap, rect, rect2, paint);
                                    } else {
                                        C87412m.m108603p("mPaint");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mDstRect");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mDrawRect");
                                throw null;
                            }
                        }
                        GradientDrawable gradientDrawable = this.f286359e;
                        if (gradientDrawable != null) {
                            Rect rect3 = new Rect();
                            RectF rectF2 = this.f286365n;
                            if (rectF2 != null) {
                                rectF2.round(rect3);
                                gradientDrawable.setBounds(rect3);
                                gradientDrawable.setAlpha(this.f286368q);
                                gradientDrawable.draw(canvas);
                                return;
                            }
                            C87412m.m108603p("mMaskRect");
                            throw null;
                        }
                        return;
                    }
                    C87412m.m108603p("mClipPath");
                    throw null;
                }
                C87412m.m108603p("mMaskRect");
                throw null;
            }
            C87412m.m108603p("mClipPath");
            throw null;
        }
        C87412m.m108603p("mClipPath");
        throw null;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f286366o, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f286367p, 1073741824));
    }

    public void setDstRect(Rect rect) {
        C87412m.m108594g(rect, "dstRect");
        this.f286364j = rect;
    }

    public void setMaskAlpha(int i) {
        this.f286368q = i;
    }
}

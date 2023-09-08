package h92;

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

/* renamed from: h92.d */
public final class C98325d extends View {

    /* renamed from: u */
    public static final int f288196u = C74942w4.m89784a(MMApplicationContext.getContext(), 8);

    /* renamed from: d */
    public Bitmap f288197d;

    /* renamed from: e */
    public GradientDrawable f288198e;

    /* renamed from: f */
    public Paint f288199f;

    /* renamed from: g */
    public Paint f288200g;

    /* renamed from: h */
    public Path f288201h;

    /* renamed from: i */
    public Rect f288202i;

    /* renamed from: j */
    public Rect f288203j;

    /* renamed from: n */
    public RectF f288204n;

    /* renamed from: o */
    public int f288205o;

    /* renamed from: p */
    public int f288206p;

    /* renamed from: q */
    public int f288207q;

    /* renamed from: r */
    public float f288208r;

    /* renamed from: s */
    public boolean f288209s = true;

    /* renamed from: t */
    public final float[] f288210t;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C98325d(Context context, Bitmap bitmap) {
        super(context);
        C87412m.m108594g(bitmap, "contentBitmap");
        int i = f288196u;
        this.f288210t = new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) i, (float) i, (float) i, (float) i};
        this.f288199f = new Paint();
        this.f288201h = new Path();
        this.f288200g = new Paint();
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = this.f288200g;
        if (paint != null) {
            paint.setXfermode(porterDuffXfermode);
            this.f288197d = bitmap;
            this.f288205o = (int) (((float) bitmap.getWidth()) * 1.0f);
            this.f288206p = (int) (((float) bitmap.getHeight()) * 1.0f);
            this.f288202i = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f288203j = new Rect(0, 0, this.f288205o, this.f288206p);
            RectF rectF = new RectF();
            this.f288204n = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) this.f288205o;
            rectF.bottom = (float) this.f288206p;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(230, 0, 0, 0), Color.argb(76, 0, 0, 0), Color.argb(0, 0, 0, 0)});
            this.f288198e = gradientDrawable;
            gradientDrawable.setGradientType(0);
            GradientDrawable gradientDrawable2 = this.f288198e;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setGradientCenter(0.5f, 0.4f);
            }
            GradientDrawable gradientDrawable3 = this.f288198e;
            if (gradientDrawable3 != null) {
                Rect rect = this.f288203j;
                if (rect != null) {
                    gradientDrawable3.setBounds(rect);
                } else {
                    C87412m.m108603p("mDstRect");
                    throw null;
                }
            }
            String format = String.format("default init: mWidth:%d mHeight:%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f288205o), Integer.valueOf(this.f288206p)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            Log.m105924i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
            return;
        }
        C87412m.m108603p("mMaskPaint");
        throw null;
    }

    /* renamed from: a */
    public final void mo137622a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f288204n;
        if (rectF != null) {
            rectF.set(f, f2, f3, f4);
        } else {
            C87412m.m108603p("mMaskRect");
            throw null;
        }
    }

    /* renamed from: b */
    public final void mo137623b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.f288210t;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
        fArr[3] = f4;
        fArr[4] = f5;
        fArr[5] = f6;
        fArr[6] = f7;
        fArr[7] = f8;
    }

    public final Bitmap getContentBitmap() {
        return this.f288197d;
    }

    public final GradientDrawable getGradientDrawable() {
        return this.f288198e;
    }

    public void onDraw(Canvas canvas) {
        GradientDrawable gradientDrawable;
        C87412m.m108594g(canvas, "canvas");
        Path path = this.f288201h;
        if (path != null) {
            path.reset();
            Path path2 = this.f288201h;
            if (path2 != null) {
                RectF rectF = this.f288204n;
                if (rectF != null) {
                    path2.addRoundRect(rectF, this.f288210t, Path.Direction.CW);
                    Path path3 = this.f288201h;
                    if (path3 != null) {
                        canvas.clipPath(path3);
                        Bitmap bitmap = this.f288197d;
                        if (bitmap != null) {
                            int save = canvas.save();
                            float f = this.f288208r;
                            RectF rectF2 = this.f288204n;
                            if (rectF2 != null) {
                                float centerX = rectF2.centerX();
                                RectF rectF3 = this.f288204n;
                                if (rectF3 != null) {
                                    canvas.rotate(f, centerX, rectF3.centerY());
                                    Rect rect = this.f288202i;
                                    if (rect != null) {
                                        Rect rect2 = this.f288203j;
                                        if (rect2 != null) {
                                            Paint paint = this.f288199f;
                                            if (paint != null) {
                                                canvas.drawBitmap(bitmap, rect, rect2, paint);
                                                if (this.f288209s && (gradientDrawable = this.f288198e) != null) {
                                                    gradientDrawable.setAlpha(this.f288207q);
                                                    gradientDrawable.draw(canvas);
                                                }
                                                canvas.restoreToCount(save);
                                                return;
                                            }
                                            C87412m.m108603p("mPaint");
                                            throw null;
                                        }
                                        C87412m.m108603p("mDstRect");
                                        throw null;
                                    }
                                    C87412m.m108603p("mDrawRect");
                                    throw null;
                                }
                                C87412m.m108603p("mMaskRect");
                                throw null;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f288205o, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f288206p, 1073741824));
    }

    public final void setGradientOrientation(GradientDrawable.Orientation orientation) {
        C87412m.m108594g(orientation, "orientation");
        GradientDrawable gradientDrawable = this.f288198e;
        if (gradientDrawable != null) {
            gradientDrawable.setOrientation(orientation);
        }
    }

    public final void setMaskAlpha(int i) {
        this.f288207q = i;
    }

    public final void setRotate(float f) {
        this.f288208r = f;
    }
}

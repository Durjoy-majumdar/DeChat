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

/* renamed from: e92.b */
public final class C97610b extends C107268a {

    /* renamed from: v */
    public static final int f286341v = C74942w4.m89784a(MMApplicationContext.getContext(), 8);

    /* renamed from: d */
    public Bitmap f286342d;

    /* renamed from: e */
    public Bitmap f286343e;

    /* renamed from: f */
    public GradientDrawable f286344f;

    /* renamed from: g */
    public Paint f286345g = new Paint();

    /* renamed from: h */
    public Paint f286346h = new Paint();

    /* renamed from: i */
    public Path f286347i = new Path();

    /* renamed from: j */
    public Rect f286348j;

    /* renamed from: n */
    public Rect f286349n;

    /* renamed from: o */
    public Rect f286350o;

    /* renamed from: p */
    public Rect f286351p;

    /* renamed from: q */
    public RectF f286352q;

    /* renamed from: r */
    public int f286353r;

    /* renamed from: s */
    public int f286354s;

    /* renamed from: t */
    public int f286355t;

    /* renamed from: u */
    public final float[] f286356u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C97610b(Context context, Bitmap bitmap, Bitmap bitmap2) {
        super(context);
        C87412m.m108594g(bitmap, "contentBitmap");
        int i = f286341v;
        this.f286356u = new float[]{0.0f, 0.0f, 0.0f, 0.0f, (float) i, (float) i, (float) i, (float) i};
        PorterDuffXfermode porterDuffXfermode = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
        Paint paint = this.f286346h;
        if (paint != null) {
            paint.setXfermode(porterDuffXfermode);
            this.f286342d = bitmap;
            this.f286343e = bitmap2;
            this.f286353r = (int) (((float) bitmap.getWidth()) * 1.0f);
            this.f286354s = (int) (((float) bitmap.getHeight()) * 1.0f);
            this.f286348j = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            this.f286349n = new Rect(0, 0, bitmap2 != null ? bitmap2.getWidth() : 0, bitmap2 != null ? bitmap2.getHeight() : 0);
            this.f286350o = new Rect(0, 0, this.f286353r, this.f286354s);
            RectF rectF = new RectF();
            this.f286352q = rectF;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = (float) this.f286353r;
            rectF.bottom = (float) this.f286354s;
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.argb(230, 0, 0, 0), Color.argb(76, 0, 0, 0), Color.argb(0, 0, 0, 0)});
            this.f286344f = gradientDrawable;
            gradientDrawable.setGradientType(0);
            GradientDrawable gradientDrawable2 = this.f286344f;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setGradientCenter(0.5f, 0.4f);
            }
            GradientDrawable gradientDrawable3 = this.f286344f;
            if (gradientDrawable3 != null) {
                Rect rect = this.f286350o;
                if (rect != null) {
                    gradientDrawable3.setBounds(rect);
                } else {
                    C87412m.m108603p("mDstRect");
                    throw null;
                }
            }
            String format = String.format("default init: mWidth:%d mHeight:%d", Arrays.copyOf(new Object[]{Integer.valueOf(this.f286353r), Integer.valueOf(this.f286354s)}, 2));
            C87412m.m108593f(format, "format(format, *args)");
            Log.m105924i("MicroMsg.TransformSwipeBackToMultiTaskView", format);
            return;
        }
        C87412m.m108603p("mMaskPaint");
        throw null;
    }

    /* renamed from: a */
    public void mo136869a(float f, float f2, float f3, float f4) {
        RectF rectF = this.f286352q;
        if (rectF != null) {
            rectF.set(f, f2, f3, f4);
        } else {
            C87412m.m108603p("mMaskRect");
            throw null;
        }
    }

    /* renamed from: b */
    public void mo136870b(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        float[] fArr = this.f286356u;
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
        this.f286353r = i;
        this.f286354s = i2;
    }

    public final Bitmap getContentBitmap() {
        return this.f286342d;
    }

    public final Bitmap getDefaultIcon() {
        return this.f286343e;
    }

    public final GradientDrawable getGradientDrawable() {
        return this.f286344f;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Path path = this.f286347i;
        if (path != null) {
            path.reset();
            Path path2 = this.f286347i;
            if (path2 != null) {
                RectF rectF = this.f286352q;
                if (rectF != null) {
                    path2.addRoundRect(rectF, this.f286356u, Path.Direction.CW);
                    Path path3 = this.f286347i;
                    if (path3 != null) {
                        canvas.clipPath(path3);
                        Bitmap bitmap = this.f286342d;
                        if (bitmap != null) {
                            Rect rect = this.f286348j;
                            if (rect != null) {
                                Rect rect2 = this.f286350o;
                                if (rect2 != null) {
                                    Paint paint = this.f286345g;
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
                        Bitmap bitmap2 = this.f286343e;
                        if (bitmap2 != null) {
                            Rect rect3 = this.f286349n;
                            if (rect3 != null) {
                                Rect rect4 = this.f286351p;
                                if (rect4 != null) {
                                    Paint paint2 = this.f286345g;
                                    if (paint2 != null) {
                                        canvas.drawBitmap(bitmap2, rect3, rect4, paint2);
                                    } else {
                                        C87412m.m108603p("mPaint");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("mDstDefaultRect");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("mDrawDefaultRect");
                                throw null;
                            }
                        }
                        GradientDrawable gradientDrawable = this.f286344f;
                        if (gradientDrawable != null) {
                            gradientDrawable.setAlpha(this.f286355t);
                            gradientDrawable.draw(canvas);
                            return;
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f286353r, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f286354s, 1073741824));
    }

    public void setDefaultDstRect(Rect rect) {
        C87412m.m108594g(rect, "dstRect");
        this.f286351p = rect;
    }

    public void setDstRect(Rect rect) {
        C87412m.m108594g(rect, "dstRect");
        this.f286350o = rect;
    }

    public void setMaskAlpha(int i) {
        this.f286355t = i;
    }
}

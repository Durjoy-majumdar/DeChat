package com.tencent.p014mm.plugin.ball.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import bw0.C0387i;
import bw0.C54595g;
import bw0.C67321f;
import bw0.C67322h;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kotlin.Metadata;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import tv0.C78111d;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B#\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b%\u0010(J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u000e\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, mo182094d2 = {"Lcom/tencent/mm/plugin/ball/view/FloatBallRoundCornerFrameLayout;", "Landroid/widget/FrameLayout;", "", "radius", "Lrx3/b0;", "setRadius", "", "round", "setRoundCorner", "", "color", "setBackgroundColorMask", "Landroid/graphics/Path;", "d", "Lrx3/g;", "getMPath", "()Landroid/graphics/Path;", "mPath", "Landroid/graphics/RectF;", "e", "getMRectF", "()Landroid/graphics/RectF;", "mRectF", "", "f", "getRoundRadiusArray", "()[F", "roundRadiusArray", "Landroid/graphics/Paint;", "g", "getMPaint", "()Landroid/graphics/Paint;", "mPaint", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ball_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.ball.view.FloatBallRoundCornerFrameLayout */
public final class FloatBallRoundCornerFrameLayout extends FrameLayout {

    /* renamed from: d */
    public final C13601g f197430d;

    /* renamed from: e */
    public final C13601g f197431e;

    /* renamed from: f */
    public final C13601g f197432f;

    /* renamed from: g */
    public final C13601g f197433g;

    /* renamed from: h */
    public float f197434h;

    /* renamed from: i */
    public boolean f197435i;

    /* renamed from: j */
    public boolean f197436j;

    /* renamed from: n */
    public boolean f197437n;

    /* renamed from: o */
    public Integer f197438o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FloatBallRoundCornerFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C87412m.m108594g(context, "context");
    }

    private final Paint getMPaint() {
        return (Paint) ((C36570n) this.f197433g).getValue();
    }

    private final Path getMPath() {
        return (Path) ((C36570n) this.f197430d).getValue();
    }

    private final RectF getMRectF() {
        return (RectF) ((C36570n) this.f197431e).getValue();
    }

    private final float[] getRoundRadiusArray() {
        return (float[]) ((C36570n) this.f197432f).getValue();
    }

    /* renamed from: a */
    public final void mo94550a() {
        getMPath().reset();
        if (this.f197435i) {
            float height = getMRectF().height() / ((float) 2);
            getMPath().addRoundRect(getMRectF(), height, height, Path.Direction.CCW);
            return;
        }
        boolean z = this.f197436j;
        if (z || this.f197437n) {
            float f = 0.0f;
            float height2 = z ? getMRectF().height() / ((float) 2) : 0.0f;
            getRoundRadiusArray()[0] = height2;
            getRoundRadiusArray()[1] = height2;
            getRoundRadiusArray()[6] = height2;
            getRoundRadiusArray()[7] = height2;
            if (this.f197437n) {
                f = getMRectF().height() / ((float) 2);
            }
            getRoundRadiusArray()[2] = f;
            getRoundRadiusArray()[3] = f;
            getRoundRadiusArray()[4] = f;
            getRoundRadiusArray()[5] = f;
            getMPath().addRoundRect(getMRectF(), getRoundRadiusArray(), Path.Direction.CCW);
            return;
        }
        Path mPath = getMPath();
        RectF mRectF = getMRectF();
        float f2 = this.f197434h;
        mPath.addRoundRect(mRectF, f2, f2, Path.Direction.CCW);
    }

    public void dispatchDraw(Canvas canvas) {
        if (canvas != null) {
            canvas.save();
        }
        if (canvas != null) {
            canvas.clipPath(getMPath());
        }
        Integer num = this.f197438o;
        if (num != null) {
            num.intValue();
            if (canvas != null) {
                canvas.drawPaint(getMPaint());
            }
        }
        super.dispatchDraw(canvas);
        if (canvas != null) {
            canvas.restore();
        }
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.save();
        canvas.clipPath(getMPath());
        Integer num = this.f197438o;
        if (num != null) {
            num.intValue();
            canvas.drawPaint(getMPaint());
        }
        super.draw(canvas);
        canvas.restore();
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105926v("MicroMsg.FloatBallRoundFrameLayout", "onSizeChanged w: " + i + ", h: " + i2);
        if (i != i3 || i2 != i4) {
            getMRectF().set(0.0f, 0.0f, (float) i, (float) i2);
            mo94550a();
        }
    }

    public final void setBackgroundColorMask(int i) {
        Integer num = this.f197438o;
        if (num == null || num.intValue() != i) {
            this.f197438o = Integer.valueOf(i);
            getMPaint().setColor(i);
            getMPaint().setAntiAlias(true);
            getMPaint().setStyle(Paint.Style.FILL);
            invalidate();
        }
    }

    public final void setRadius(float f) {
        if (!(this.f197434h == f)) {
            this.f197434h = f;
            mo94550a();
        }
    }

    public final void setRoundCorner(boolean z) {
        this.f197436j = false;
        this.f197437n = false;
        if (this.f197435i != z) {
            this.f197435i = z;
            mo94550a();
            invalidate();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatBallRoundCornerFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f197430d = C36568h.m40985a(C54595g.f153091d);
        this.f197431e = C36568h.m40985a(C67322h.f193158d);
        this.f197432f = C36568h.m40985a(C0387i.f989d);
        this.f197433g = C36568h.m40985a(C67321f.f193157d);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C78111d.f228922a);
        C87412m.m108593f(obtainStyledAttributes, "context.obtainStyledAttr…llRoundCornerFrameLayout)");
        this.f197434h = obtainStyledAttributes.getDimension(1, 0.0f);
        this.f197435i = obtainStyledAttributes.getBoolean(3, false);
        this.f197436j = obtainStyledAttributes.getBoolean(0, false);
        this.f197437n = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
    }
}

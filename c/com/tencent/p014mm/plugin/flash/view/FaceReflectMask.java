package com.tencent.p014mm.plugin.flash.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.flash.action.FaceFlashActionPreviewLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.youtu.ytagreflectlivecheck.p139ui.YTReflectLayout;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceReflectMask */
public class FaceReflectMask extends YTReflectLayout {

    /* renamed from: q */
    public static final int f19069q = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3703bv);

    /* renamed from: d */
    public Paint f19070d;

    /* renamed from: e */
    public Paint f19071e;

    /* renamed from: f */
    public ColorMatrixColorFilter f19072f;

    /* renamed from: g */
    public PorterDuffXfermode f19073g;

    /* renamed from: h */
    public Rect f19074h = new Rect();

    /* renamed from: i */
    public float f19075i = 0.0f;

    /* renamed from: j */
    public C4403a f19076j;

    /* renamed from: n */
    public float f19077n = 0.0f;

    /* renamed from: o */
    public Paint f19078o;

    /* renamed from: p */
    public float f19079p = 0.0f;

    /* renamed from: com.tencent.mm.plugin.flash.view.FaceReflectMask$a */
    public interface C4403a {
    }

    public FaceReflectMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, (Paint) null);
        Paint paint = new Paint(1);
        this.f19070d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f19071e = paint2;
        paint2.setColor(C76577a.m92153d(getContext(), C0966R.color.ahf));
        Paint paint3 = new Paint(1);
        this.f19078o = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f19078o.setStrokeWidth((float) f19069q);
        this.f19078o.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_100_Alpha_0_8));
        setWillNotDraw(false);
        this.f19073g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public float getCircleMarginY() {
        return this.f19079p;
    }

    public float getCircleY() {
        return this.f19075i;
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        float min = ((float) Math.min(getWidth(), getHeight())) * 0.27f;
        float width = (float) (((double) getWidth()) * 0.5d);
        float f = this.f19079p;
        if (f != 0.0f) {
            this.f19075i = f + min;
        } else {
            this.f19075i = ((float) C76577a.m92157h(getContext(), C0966R.dimen.a58)) + min;
        }
        Rect rect = this.f19074h;
        rect.left = 0;
        rect.right = getWidth();
        Rect rect2 = this.f19074h;
        rect2.top = 0;
        rect2.bottom = getHeight();
        this.f19070d.setColor(-1);
        ColorMatrixColorFilter colorMatrixColorFilter = this.f19072f;
        if (colorMatrixColorFilter != null) {
            this.f19070d.setColorFilter(colorMatrixColorFilter);
        }
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(this.f19074h, this.f19070d);
        setAlpha(0.998f);
        this.f19071e.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f19071e.setXfermode(this.f19073g);
        canvas.drawCircle(width, this.f19075i, min, this.f19071e);
        float f2 = this.f19077n * 360.0f;
        int i = f19069q;
        float f3 = this.f19075i;
        Canvas canvas2 = canvas;
        canvas2.drawArc((width - min) + ((float) (i >> 1)), ((float) (i >> 1)) + (f3 - min), (width + min) - ((float) (i >> 1)), (f3 + min) - ((float) (i >> 1)), -90.0f, f2, false, this.f19078o);
        canvas.restore();
        C4403a aVar = this.f19076j;
        if (aVar != null) {
            FaceFlashActionPreviewLayout faceFlashActionPreviewLayout = FaceFlashActionPreviewLayout.this;
            int i2 = FaceFlashActionPreviewLayout.f18912N;
            faceFlashActionPreviewLayout.mo5249c();
            this.f19076j = null;
        }
    }

    public void setCallback(C4403a aVar) {
        this.f19076j = aVar;
    }

    public void setCircleMarginY(float f) {
        this.f19079p = f;
    }

    public void setColorMatrixColorFilter(ColorMatrixColorFilter colorMatrixColorFilter) {
        Log.m105924i("MicroMsg.FaceReflectMask", "setColorMatrixColorFilter");
        this.f19072f = colorMatrixColorFilter;
        postInvalidate();
    }

    public void setProgress(float f) {
        Log.m105919d("MicroMsg.FaceReflectMask", "setProgress :%s", Float.valueOf(f));
        if (f <= 0.0f) {
            this.f19077n = 0.0f;
        } else if (f <= 1.0f) {
            this.f19077n = f;
        } else if (((double) f) <= 1.05d) {
            this.f19077n = 1.0f;
        } else {
            return;
        }
        postInvalidate();
    }
}

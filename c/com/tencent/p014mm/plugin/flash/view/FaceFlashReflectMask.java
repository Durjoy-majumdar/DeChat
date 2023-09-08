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
import com.tencent.p014mm.plugin.flash.FaceFlashPreviewLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.youtu.ytagreflectlivecheck.p139ui.YTReflectLayout;
import di3.C86312j;
import h81.C32735h;
import kg3.C76577a;

/* renamed from: com.tencent.mm.plugin.flash.view.FaceFlashReflectMask */
public class FaceFlashReflectMask extends YTReflectLayout {

    /* renamed from: q */
    public static float f19057q = 0.386f;

    /* renamed from: r */
    public static final int f19058r = C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3703bv);

    /* renamed from: d */
    public Paint f19059d;

    /* renamed from: e */
    public Paint f19060e;

    /* renamed from: f */
    public ColorMatrixColorFilter f19061f;

    /* renamed from: g */
    public PorterDuffXfermode f19062g;

    /* renamed from: h */
    public Rect f19063h = new Rect();

    /* renamed from: i */
    public float f19064i = 0.0f;

    /* renamed from: j */
    public C4402a f19065j;

    /* renamed from: n */
    public float f19066n = 0.0f;

    /* renamed from: o */
    public Paint f19067o;

    /* renamed from: p */
    public float f19068p = 0.0f;

    /* renamed from: com.tencent.mm.plugin.flash.view.FaceFlashReflectMask$a */
    public interface C4402a {
    }

    public FaceFlashReflectMask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayerType(1, (Paint) null);
        float xe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58785xe(C32735h.C32737c.clicfg_face_flash_preview_ratio, 0.386f);
        if (((double) xe) > 0.1d) {
            f19057q = xe;
            Log.m105925i("MicroMsg.FaceReflectMask", "FACE_FLASH_CIRCLE_RADIUS set value:%f", Float.valueOf(xe));
        }
        Paint paint = new Paint(1);
        this.f19059d = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint(1);
        this.f19060e = paint2;
        paint2.setColor(C76577a.m92153d(getContext(), C0966R.color.ahf));
        Paint paint3 = new Paint(1);
        this.f19067o = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        this.f19067o.setStrokeWidth((float) f19058r);
        this.f19067o.setColor(C76577a.m92153d(getContext(), C0966R.color.BW_100_Alpha_0_8));
        setWillNotDraw(false);
        this.f19062g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
    }

    public float getCircleMarginY() {
        return this.f19068p;
    }

    public float getCircleY() {
        return this.f19064i;
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        float min = ((float) Math.min(getWidth(), getHeight())) * f19057q;
        float width = (float) (((double) getWidth()) * 0.5d);
        float f = this.f19068p;
        if (f != 0.0f) {
            this.f19064i = f + min;
        } else {
            this.f19064i = ((float) C76577a.m92157h(getContext(), C0966R.dimen.a58)) + min;
        }
        Rect rect = this.f19063h;
        rect.left = 0;
        rect.right = getWidth();
        Rect rect2 = this.f19063h;
        rect2.top = 0;
        rect2.bottom = getHeight();
        this.f19059d.setColor(-1);
        ColorMatrixColorFilter colorMatrixColorFilter = this.f19061f;
        if (colorMatrixColorFilter != null) {
            this.f19059d.setColorFilter(colorMatrixColorFilter);
        }
        canvas.drawARGB(255, 0, 0, 0);
        canvas.drawRect(this.f19063h, this.f19059d);
        setAlpha(0.998f);
        this.f19060e.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f19060e.setXfermode(this.f19062g);
        canvas.drawCircle(width, this.f19064i, min, this.f19060e);
        float f2 = this.f19066n * 360.0f;
        int i = f19058r;
        float f3 = this.f19064i;
        Canvas canvas2 = canvas;
        canvas2.drawArc((width - min) + ((float) (i >> 1)), ((float) (i >> 1)) + (f3 - min), (width + min) - ((float) (i >> 1)), (f3 + min) - ((float) (i >> 1)), -90.0f, f2, false, this.f19067o);
        canvas.restore();
        C4402a aVar = this.f19065j;
        if (aVar != null) {
            FaceFlashPreviewLayout faceFlashPreviewLayout = FaceFlashPreviewLayout.this;
            int i2 = FaceFlashPreviewLayout.f18847K;
            faceFlashPreviewLayout.mo5214d();
            this.f19065j = null;
        }
    }

    public void setCallback(C4402a aVar) {
        this.f19065j = aVar;
    }

    public void setCircleMarginY(float f) {
        this.f19068p = f;
    }

    public void setColorMatrixColorFilter(ColorMatrixColorFilter colorMatrixColorFilter) {
        Log.m105924i("MicroMsg.FaceReflectMask", "setColorMatrixColorFilter");
        this.f19061f = colorMatrixColorFilter;
        postInvalidate();
    }

    public void setProgress(float f) {
        Log.m105919d("MicroMsg.FaceReflectMask", "setProgress :%s", Float.valueOf(f));
        if (f <= 0.0f) {
            this.f19066n = 0.0f;
        } else if (f <= 1.0f) {
            this.f19066n = f;
        } else if (((double) f) <= 1.05d) {
            this.f19066n = 1.0f;
        } else {
            return;
        }
        postInvalidate();
    }
}

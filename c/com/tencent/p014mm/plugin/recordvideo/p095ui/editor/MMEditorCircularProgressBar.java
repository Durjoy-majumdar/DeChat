package com.tencent.p014mm.plugin.recordvideo.p095ui.editor;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.util.ArrayList;

/* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorCircularProgressBar */
public class MMEditorCircularProgressBar extends View {

    /* renamed from: d */
    public int f163839d = Color.parseColor("#1AAD19");

    /* renamed from: e */
    public int f163840e = Color.parseColor("#FFFFFF");

    /* renamed from: f */
    public int f163841f = Color.parseColor("#FA5151");

    /* renamed from: g */
    public RectF f163842g;

    /* renamed from: h */
    public Paint f163843h;

    /* renamed from: i */
    public Paint f163844i;

    /* renamed from: j */
    public Paint f163845j;

    /* renamed from: n */
    public float f163846n = 0.0f;

    /* renamed from: o */
    public float f163847o = 0.0f;

    /* renamed from: p */
    public int f163848p = 153;

    /* renamed from: q */
    public float f163849q = 0.0f;

    /* renamed from: r */
    public float f163850r = 0.0f;

    /* renamed from: s */
    public Context f163851s;

    /* renamed from: t */
    public ArrayList<Float> f163852t = new ArrayList<>();

    /* renamed from: u */
    public boolean f163853u;

    /* renamed from: v */
    public boolean f163854v;

    /* renamed from: com.tencent.mm.plugin.recordvideo.ui.editor.MMEditorCircularProgressBar$a */
    public interface C57175a {
    }

    public MMEditorCircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        this.f163853u = false;
        this.f163854v = false;
        this.f163851s = context;
    }

    public int getDrawWidth() {
        return (int) this.f163842g.width();
    }

    public ArrayList<Float> getSubProgress() {
        return this.f163852t;
    }

    public void onDraw(Canvas canvas) {
        canvas.save();
        float f = this.f163847o;
        canvas.translate(f, f);
        RectF rectF = this.f163842g;
        canvas.rotate(180.0f, rectF.right / 2.0f, rectF.bottom / 2.0f);
        if (this.f163853u) {
            float f2 = 0.0f;
            int i = 0;
            while (i < this.f163852t.size()) {
                canvas.drawArc(this.f163842g, ((f2 / this.f163850r) * 360.0f) + 90.0f, ((this.f163852t.get(i).floatValue() - f2) / this.f163850r) * 360.0f, false, this.f163843h);
                float floatValue = this.f163852t.get(i).floatValue();
                RectF rectF2 = this.f163842g;
                float f3 = this.f163850r;
                canvas.drawArc(rectF2, (((floatValue - 0.85f) / f3) * 360.0f) + 90.0f, (0.85f / f3) * 360.0f, false, this.f163844i);
                i++;
                f2 = floatValue;
            }
            RectF rectF3 = this.f163842g;
            float f4 = this.f163850r;
            canvas.drawArc(rectF3, ((f2 / f4) * 360.0f) + 90.0f, ((this.f163849q - f2) / f4) * 360.0f, false, this.f163843h);
        } else {
            canvas.drawArc(this.f163842g, 90.0f, (this.f163849q / this.f163850r) * 360.0f, false, this.f163843h);
        }
        canvas.restore();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.f163854v) {
            this.f163854v = true;
            float dimensionPixelSize = (float) this.f163851s.getResources().getDimensionPixelSize(C0966R.dimen.agf);
            this.f163846n = dimensionPixelSize;
            this.f163847o = dimensionPixelSize / 2.0f;
            float f = this.f163847o;
            float width = ((float) getWidth()) - f;
            this.f163842g = new RectF(f, f, width, width);
            Paint paint = new Paint();
            this.f163843h = paint;
            paint.setStyle(Paint.Style.STROKE);
            this.f163843h.setStrokeWidth(this.f163846n);
            this.f163843h.setColor(this.f163839d);
            this.f163843h.setAlpha(this.f163848p);
            this.f163843h.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f163844i = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            this.f163844i.setStrokeWidth(this.f163846n);
            this.f163844i.setColor(this.f163840e);
            this.f163844i.setAlpha(this.f163848p);
            this.f163844i.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f163845j = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            this.f163845j.setStrokeWidth(this.f163846n);
            this.f163845j.setColor(this.f163841f);
            this.f163845j.setAntiAlias(true);
        }
    }

    public void setCircularColor(int i) {
        this.f163839d = i;
        this.f163848p = 255;
        Paint paint = this.f163843h;
        if (paint != null && i != 0) {
            paint.setColor(i);
        }
    }

    public void setCurrentProgress(float f) {
        this.f163849q = f;
        invalidate();
    }

    public void setDuration(int i) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setDuration: %s", Integer.valueOf(i));
    }

    public void setEnableSubProgress(boolean z) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setEnableSubProgress: %s", Boolean.valueOf(z));
        this.f163853u = z;
    }

    public void setInitProgress(int i) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setInitProgress: %s, isStart: %s", Integer.valueOf(i), Boolean.FALSE);
    }

    public void setMaxProgress(float f) {
        Log.m105925i("MicroMsg.MMSightCircularProgressBar", "setMaxProgress: %s", Float.valueOf(f));
        this.f163850r = f;
    }

    public void setProgressCallback(C57175a aVar) {
    }

    public MMEditorCircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ArrayList();
        this.f163853u = false;
        this.f163854v = false;
        this.f163851s = context;
    }
}

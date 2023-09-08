package com.tencent.p014mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView */
public class FaceDetectDecorView extends View {

    /* renamed from: d */
    public boolean f197970d;

    /* renamed from: e */
    public boolean f197971e;

    /* renamed from: f */
    public boolean f197972f;

    /* renamed from: g */
    public RectF f197973g;

    /* renamed from: h */
    public Paint f197974h;

    public FaceDetectDecorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.m105925i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", Boolean.valueOf(this.f197971e), Boolean.valueOf(this.f197970d), this.f197973g);
        boolean z = this.f197971e;
        if (z != this.f197970d || this.f197972f) {
            if (z) {
                canvas.drawColor(getResources().getColor(C0966R.color.f3356p7));
                canvas.drawRect(this.f197973g, this.f197974h);
            } else {
                canvas.drawColor(getResources().getColor(C0966R.color.ahf));
            }
        }
        this.f197970d = this.f197971e;
    }

    public FaceDetectDecorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f197970d = false;
        this.f197971e = false;
        this.f197972f = false;
        this.f197973g = null;
        this.f197974h = null;
        Paint paint = new Paint();
        this.f197974h = paint;
        paint.setColor(getResources().getColor(C0966R.color.f3131gg));
        this.f197974h.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, (Paint) null);
    }
}

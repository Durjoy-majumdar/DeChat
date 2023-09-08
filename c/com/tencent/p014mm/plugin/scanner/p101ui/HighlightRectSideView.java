package com.tencent.p014mm.plugin.scanner.p101ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import p996kj.C88155a;

/* renamed from: com.tencent.mm.plugin.scanner.ui.HighlightRectSideView */
public class HighlightRectSideView extends View {

    /* renamed from: d */
    public boolean[] f164204d;

    /* renamed from: e */
    public Rect f164205e;

    /* renamed from: f */
    public Paint f164206f;

    /* renamed from: g */
    public int f164207g;

    /* renamed from: h */
    public int f164208h;

    /* renamed from: i */
    public int f164209i;

    /* renamed from: j */
    public int f164210j = 0;

    /* renamed from: n */
    public MTimerHandler f164211n = new MTimerHandler(new C57322a(), true);

    /* renamed from: com.tencent.mm.plugin.scanner.ui.HighlightRectSideView$a */
    public class C57322a implements MTimerHandler.CallBack {
        public C57322a() {
        }

        public boolean onTimerExpired() {
            HighlightRectSideView highlightRectSideView = HighlightRectSideView.this;
            highlightRectSideView.f164210j++;
            highlightRectSideView.invalidate();
            return true;
        }
    }

    public HighlightRectSideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Bitmap decodeResource = C88155a.decodeResource(getResources(), C0966R.C0969drawable.cb8, (BitmapFactory.Options) null);
        this.f164207g = decodeResource.getWidth();
        int height = decodeResource.getHeight();
        this.f164208h = height;
        if (height != this.f164207g) {
            Log.m105920e("MicroMsg.HighlightRectSideView", "width is not same as height");
        }
        this.f164209i = (this.f164207g * 6) / 24;
        this.f164204d = new boolean[4];
        Paint paint = new Paint();
        this.f164206f = paint;
        paint.setColor(6676738);
        this.f164206f.setAlpha(255);
        this.f164206f.setStrokeWidth((float) this.f164209i);
        this.f164206f.setStyle(Paint.Style.STROKE);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f164211n.startTimer(300);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MTimerHandler mTimerHandler = this.f164211n;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
            this.f164211n = null;
        }
    }

    public void onDraw(Canvas canvas) {
        boolean z;
        super.onDraw(canvas);
        int i = 0;
        while (true) {
            if (i >= 4) {
                z = true;
                break;
            } else if (!this.f164204d[i]) {
                z = false;
                break;
            } else {
                i++;
            }
        }
        int i2 = this.f164209i / 2;
        if (this.f164204d[0] && (true == z || this.f164210j % 2 == 0)) {
            Rect rect = this.f164205e;
            int i3 = rect.left;
            int i4 = rect.top;
            int i5 = this.f164208h;
            Canvas canvas2 = canvas;
            canvas2.drawLine((float) (i3 + i2), (float) (i4 + i5), (float) (i3 + i2), (float) (rect.bottom - i5), this.f164206f);
        }
        if (this.f164204d[1] && (true == z || this.f164210j % 2 == 0)) {
            Rect rect2 = this.f164205e;
            int i6 = rect2.right;
            int i7 = rect2.top;
            int i8 = this.f164208h;
            Canvas canvas3 = canvas;
            canvas3.drawLine((float) (i6 - i2), (float) (i7 + i8), (float) (i6 - i2), (float) (rect2.bottom - i8), this.f164206f);
        }
        if (this.f164204d[2] && (true == z || this.f164210j % 3 == 0)) {
            Rect rect3 = this.f164205e;
            int i9 = rect3.left;
            int i15 = this.f164207g;
            float f = (float) (i9 + i15);
            int i16 = rect3.top;
            canvas.drawLine(f, (float) (i16 + i2), (float) (rect3.right - i15), (float) (i16 + i2), this.f164206f);
        }
        if (!this.f164204d[3]) {
            return;
        }
        if (true == z || this.f164210j % 3 == 0) {
            Rect rect4 = this.f164205e;
            int i17 = rect4.left;
            int i18 = this.f164207g;
            float f2 = (float) (i17 + i18);
            int i19 = rect4.bottom;
            canvas.drawLine(f2, (float) (i19 - i2), (float) (rect4.right - i18), (float) (i19 - i2), this.f164206f);
        }
    }

    public void setMaskRect(Rect rect) {
        this.f164205e = rect;
        Log.m105919d("MicroMsg.HighlightRectSideView", "rect:%s", rect);
    }

    public void setShowRectEdges(boolean[] zArr) {
        if (zArr != null && 4 == zArr.length) {
            Log.m105919d("MicroMsg.HighlightRectSideView", "%s, %s, %s, %s", Boolean.valueOf(zArr[0]), Boolean.valueOf(zArr[1]), Boolean.valueOf(zArr[2]), Boolean.valueOf(zArr[3]));
            for (int i = 0; i < 4; i++) {
                this.f164204d[i] = zArr[i];
            }
            invalidate();
        }
    }
}

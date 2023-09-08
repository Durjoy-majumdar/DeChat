package cq3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XFileSdk;
import fy3.C32224a;
import gy3.C87412m;
import me3.C109612c;
import me3.C109623f;
import p1093bh.C104084a;
import rx3.C13598b0;

/* renamed from: cq3.d */
public final class C106958d extends C106952a {

    /* renamed from: F */
    public C32224a<C13598b0> f320169F;

    /* renamed from: G */
    public boolean f320170G;

    /* renamed from: H */
    public float f320171H = 1.0f;

    /* renamed from: I */
    public boolean f320172I;

    public C106958d(Context context, C109623f fVar) {
        super(context, fVar);
        this.f320134g = this.f320132e;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((C109612c) getPresenter()).mo160827k()) {
            mo157332f(motionEvent);
        }
        ((C109612c) getPresenter()).mo160832p(motionEvent);
        if (this.f320172I) {
            XFileSdk.setTouchEvent((String) null, (String) null, motionEvent);
        }
        return this.f320172I;
    }

    /* renamed from: g */
    public void mo157333g(MotionEvent motionEvent) {
        C87412m.m108594g(motionEvent, "event");
    }

    public float getMinScale() {
        if (((C109612c) getPresenter()).mo160820d().mo145700k() != C104084a.CROP_PHOTO) {
            return super.getMinScale();
        }
        int width = getBoardRect().width() / getRawLayoutRect().width();
        int height = getBoardRect().height() / getRawLayoutRect().height();
        if (width <= height) {
            width = height;
        }
        return ((float) width) * getCurScale();
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        Matrix matrix = this.f320134g;
        if (matrix != null) {
            this.f320132e.set(matrix);
            canvas.setMatrix(this.f320134g);
        } else {
            canvas.setMatrix(getMainMatrix());
        }
        Bitmap bitmap = ((C109612c) getPresenter()).f328163f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        ((C109612c) getPresenter()).mo160829m(canvas);
        if (this.f320170G) {
            this.f320170G = false;
            C32224a<C13598b0> aVar = this.f320169F;
            if (aVar != null) {
                C13598b0 invoke = aVar.invoke();
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Log.m105924i("MicroMsg.MultiTalkBoardView", "onSizeChanged " + getRawLayoutRect().flattenToString() + ", " + i + ',' + i3);
        if (getRawLayoutRect() != null) {
            Rect rawLayoutRect = getRawLayoutRect();
            C87412m.m108591d(rawLayoutRect);
            Rect rawLayoutRect2 = getRawLayoutRect();
            C87412m.m108591d(rawLayoutRect2);
            if ((((float) rawLayoutRect.width()) * 1.0f) / ((float) rawLayoutRect2.height()) > (((float) getWidth()) * 1.0f) / ((float) getHeight())) {
                Rect rawLayoutRect3 = getRawLayoutRect();
                C87412m.m108591d(rawLayoutRect3);
                this.f320171H = (((float) getWidth()) * 1.0f) / (((float) rawLayoutRect3.width()) * 1.0f);
                getHeight();
                Rect rawLayoutRect4 = getRawLayoutRect();
                C87412m.m108591d(rawLayoutRect4);
                rawLayoutRect4.height();
            } else {
                Rect rawLayoutRect5 = getRawLayoutRect();
                C87412m.m108591d(rawLayoutRect5);
                this.f320171H = (((float) getHeight()) * 1.0f) / (((float) rawLayoutRect5.height()) * 1.0f);
                getWidth();
                Rect rawLayoutRect6 = getRawLayoutRect();
                C87412m.m108591d(rawLayoutRect6);
                rawLayoutRect6.width();
            }
        }
        invalidate();
    }

    public final void setEnableToResponseSlid(boolean z) {
        this.f320172I = z;
    }
}

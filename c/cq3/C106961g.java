package cq3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.MotionEvent;
import gy3.C87412m;
import me3.C109612c;
import me3.C109623f;

/* renamed from: cq3.g */
public final class C106961g extends C106952a {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106961g(Context context, C109623f fVar) {
        super(context, fVar);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(fVar, "presenter");
        Rect rect = ((C109612c) fVar).f328159b.f332928e;
        this.f320132e.reset();
        this.f320135h.set(0, 0, rect.right - rect.left, rect.bottom - rect.top);
        this.f320132e.postTranslate((float) rect.left, (float) rect.top);
    }

    /* renamed from: a */
    public void mo157327a() {
    }

    /* renamed from: e */
    public boolean mo157331e() {
        return false;
    }

    public Rect getAliveRect() {
        String str;
        Rect rect;
        if (super.getAliveRect().isEmpty()) {
            rect = getBoardRect();
            str = "boardRect";
        } else {
            rect = super.getAliveRect();
            str = "super.getAliveRect()";
        }
        C87412m.m108593f(rect, str);
        return rect;
    }

    /* renamed from: h */
    public void mo157350h() {
        super.mo157350h();
        if (this.f320142r != null) {
            Rect rect = ((C109612c) getPresenter()).f328159b.f332928e;
            this.f320132e.reset();
            this.f320135h.set(0, 0, rect.right - rect.left, rect.bottom - rect.top);
            this.f320132e.postTranslate((float) rect.left, (float) rect.top);
        }
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        canvas.drawColor(0);
        canvas.setMatrix(this.f320132e);
        canvas.save();
        Bitmap bitmap = ((C109612c) getPresenter()).f328163f;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        }
        canvas.restore();
        ((C109612c) getPresenter()).mo160829m(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (((C109612c) getPresenter()).mo160827k()) {
            mo157332f(motionEvent);
        }
        return ((C109612c) getPresenter()).mo160832p(motionEvent) || ((C109612c) getPresenter()).f328165h;
    }
}

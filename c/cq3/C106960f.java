package cq3;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import me3.C109612c;
import me3.C109623f;

/* renamed from: cq3.f */
public class C106960f extends C106952a {
    public C106960f(Context context, C109623f fVar) {
        super(context, fVar);
    }

    public Rect getAliveRect() {
        return super.getAliveRect().isEmpty() ? getBoardRect() : super.getAliveRect();
    }

    public void onDraw(Canvas canvas) {
        canvas.drawColor(0);
        canvas.setMatrix(this.f320132e);
        ((C109612c) getPresenter()).mo160829m(canvas);
    }
}

package a43;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import kg3.C76577a;

/* renamed from: a43.b */
public class C0012b extends View {

    /* renamed from: d */
    public Paint f13d;

    public C0012b(Context context) {
        super(context);
        Paint paint = new Paint();
        this.f13d = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.f13d.setColor(-65536);
        this.f13d.setStrokeWidth((float) C76577a.m92151b(getContext(), 3));
        new Matrix();
    }

    public void onDraw(Canvas canvas) {
    }

    public void setFaceLocation(int[] iArr) {
        if (iArr != null) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
        }
    }

    public void setMirror(boolean z) {
    }

    public void setRotateAngle(int i) {
    }
}

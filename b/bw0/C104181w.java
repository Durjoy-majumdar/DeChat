package bw0;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: bw0.w */
public class C104181w extends View {

    /* renamed from: d */
    public Bitmap f308425d;

    /* renamed from: e */
    public Paint f308426e = new Paint();

    /* renamed from: f */
    public Paint f308427f = new Paint();

    /* renamed from: g */
    public Path f308428g = new Path();

    /* renamed from: h */
    public Rect f308429h;

    /* renamed from: i */
    public RectF f308430i;

    /* renamed from: j */
    public int f308431j;

    /* renamed from: n */
    public int f308432n;

    /* renamed from: o */
    public int f308433o;

    /* renamed from: p */
    public int f308434p;

    /* renamed from: q */
    public int f308435q;

    /* renamed from: r */
    public int f308436r;

    /* renamed from: s */
    public int f308437s = -1;

    /* renamed from: t */
    public boolean f308438t;

    /* renamed from: u */
    public int f308439u;

    /* renamed from: v */
    public AnimatorListenerAdapter f308440v;

    public C104181w(Context context, Bitmap bitmap) {
        super(context);
        this.f308427f.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.f308425d = bitmap;
        this.f308435q = bitmap.getWidth();
        this.f308436r = bitmap.getHeight();
        this.f308429h = new Rect(0, 0, this.f308435q, this.f308436r);
        RectF rectF = new RectF();
        this.f308430i = rectF;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        int i = this.f308435q;
        rectF.right = (float) i;
        rectF.bottom = (float) this.f308436r;
        Log.m105924i("MicroMsg.TransformToFloatBallAnimationMaskView", String.format("init: mWidth:%d mHeight:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(this.f308436r)}));
    }

    public void onDraw(Canvas canvas) {
        if (this.f308438t) {
            canvas.translate((float) this.f308431j, 0.0f);
        } else {
            canvas.drawColor(Color.argb(this.f308439u, 0, 0, 0));
        }
        this.f308428g.reset();
        Path path = this.f308428g;
        RectF rectF = this.f308430i;
        int i = this.f308432n;
        path.addRoundRect(rectF, (float) i, (float) i, Path.Direction.CW);
        canvas.clipPath(this.f308428g);
        Bitmap bitmap = this.f308425d;
        Rect rect = this.f308429h;
        canvas.drawBitmap(bitmap, rect, rect, this.f308426e);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.f308435q, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f308436r, 1073741824));
    }

    public void setContentStartPosX(int i) {
        this.f308437s = i;
    }

    public void setListener(AnimatorListenerAdapter animatorListenerAdapter) {
        this.f308440v = animatorListenerAdapter;
    }
}

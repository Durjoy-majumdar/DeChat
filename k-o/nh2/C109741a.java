package nh2;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: nh2.a */
public final class C109741a extends View {

    /* renamed from: d */
    public boolean f328458d;

    /* renamed from: e */
    public final Paint f328459e;

    /* renamed from: f */
    public int f328460f;

    /* renamed from: g */
    public final float f328461g;

    /* renamed from: h */
    public boolean f328462h;

    /* renamed from: i */
    public float f328463i;

    /* renamed from: j */
    public Bitmap f328464j;

    /* renamed from: n */
    public int f328465n;

    /* renamed from: o */
    public int f328466o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C109741a(Context context, AttributeSet attributeSet, boolean z) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f328458d = z;
        Paint paint = new Paint(1);
        this.f328459e = paint;
        this.f328460f = C76577a.m92151b(context, 7);
        this.f328461g = (float) C76577a.m92151b(context, 2);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    public final boolean getSlimWidth() {
        return this.f328458d;
    }

    public final int getType() {
        return this.f328466o;
    }

    public void onDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        boolean z = false;
        canvas.drawColor(0);
        this.f328459e.setColor(-1);
        int width = getWidth() - (((int) this.f328463i) * 2);
        if (!this.f328462h) {
            width -= ((int) this.f328461g) * 2;
        }
        canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getWidth()) / 2.0f, ((float) width) / 2.0f, this.f328459e);
        Bitmap bitmap = this.f328464j;
        if (bitmap != null) {
            if (bitmap != null && !bitmap.isRecycled()) {
                z = true;
            }
            if (z) {
                Bitmap bitmap2 = this.f328464j;
                C87412m.m108591d(bitmap2);
                float width2 = (((float) this.f328460f) * 2.0f) / ((float) bitmap2.getWidth());
                this.f328464j = BitmapUtil.rotateAndScale(this.f328464j, 0.0f, width2, width2);
                int width3 = getWidth();
                Bitmap bitmap3 = this.f328464j;
                C87412m.m108591d(bitmap3);
                float width4 = ((float) (width3 - bitmap3.getWidth())) / ((float) 2);
                Bitmap bitmap4 = this.f328464j;
                C87412m.m108591d(bitmap4);
                canvas.drawBitmap(bitmap4, width4, width4, this.f328459e);
                super.onDraw(canvas);
            }
        }
        int i = this.f328465n;
        if (i != 0) {
            this.f328459e.setColor(i);
            if (this.f328458d) {
                this.f328460f = (getWidth() - C76577a.m92151b(getContext(), 8)) / 2;
            }
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getWidth()) / 2.0f, (float) this.f328460f, this.f328459e);
        }
        super.onDraw(canvas);
    }

    public final void setBgPadding(int i) {
        this.f328463i = (float) C76577a.m92151b(getContext(), i);
    }

    public final void setBitmap(Bitmap bitmap) {
        C87412m.m108594g(bitmap, "bitmap");
        this.f328464j = bitmap;
    }

    public final void setDrawColor(int i) {
        this.f328465n = i;
    }

    public final void setHasSelected(boolean z) {
        if (this.f328462h != z) {
            this.f328462h = z;
            invalidate();
        }
    }

    public final void setSlimWidth(boolean z) {
        this.f328458d = z;
    }

    public final void setType(int i) {
        this.f328466o = i;
    }
}

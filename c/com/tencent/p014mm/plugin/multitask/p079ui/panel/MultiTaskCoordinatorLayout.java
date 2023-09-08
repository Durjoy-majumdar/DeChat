package com.tencent.p014mm.plugin.multitask.p079ui.panel;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.p014mm.p136ui.C74942w4;
import com.tencent.p014mm.plugin.multitask.p079ui.uic.MultiTaskUIC;
import gy3.C87412m;
import kotlin.Metadata;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/multitask/ui/panel/MultiTaskCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "", "mode", "Lrx3/b0;", "setMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui-multitask_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.multitask.ui.panel.MultiTaskCoordinatorLayout */
public final class MultiTaskCoordinatorLayout extends CoordinatorLayout {

    /* renamed from: I */
    public static int f315160I = -1;

    /* renamed from: D */
    public Paint f315161D = new Paint(1);

    /* renamed from: E */
    public Paint f315162E = new Paint(1);

    /* renamed from: F */
    public final RectF f315163F = new RectF();

    /* renamed from: G */
    public int f315164G = C74942w4.m89784a(getContext(), 8);

    /* renamed from: H */
    public Bitmap f315165H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskCoordinatorLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        this.f315161D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setWillNotDraw(false);
    }

    public void draw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        if (canvas.getWidth() > 0 && canvas.getHeight() > 0) {
            int saveLayer = canvas.saveLayer(new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight()), (Paint) null, 31);
            super.draw(canvas);
            if (this.f315165H == null && f315160I != -1) {
                int width = canvas.getWidth();
                int height = canvas.getHeight();
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ALPHA_8);
                Canvas canvas2 = new Canvas(createBitmap);
                Path path = new Path();
                float f = (float) width;
                this.f315163F.set(0.0f, ((float) this.f315164G) * 2.0f, f, (float) height);
                path.addRect(this.f315163F, Path.Direction.CCW);
                int i = f315160I;
                if (i == 0) {
                    Path path2 = new Path();
                    int i2 = MultiTaskUIC.f346684T;
                    float f2 = ((float) (width - i2)) / 2.0f;
                    this.f315163F.set(f2, 0.0f, ((float) i2) + f2, ((float) this.f315164G) * 4.0f);
                    RectF rectF = this.f315163F;
                    float f3 = (float) this.f315164G;
                    path2.addRoundRect(rectF, f3, f3, Path.Direction.CCW);
                    path.op(path2, Path.Op.UNION);
                } else if (i == 1) {
                    float f4 = ((float) MultiTaskUIC.f346680R) + 0.0f;
                    Path path3 = new Path();
                    float f5 = f - (((float) MultiTaskUIC.f346674L) + 0.0f);
                    this.f315163F.set(f5 - f4, 0.0f, f5, ((float) this.f315164G) * 4.0f);
                    RectF rectF2 = this.f315163F;
                    float f6 = (float) this.f315164G;
                    path3.addRoundRect(rectF2, f6, f6, Path.Direction.CCW);
                    path.op(path3, Path.Op.UNION);
                    float f7 = ((float) MultiTaskUIC.f346674L) + 0.0f;
                    this.f315163F.set(f7, 0.0f, f4 + f7, ((float) this.f315164G) * 4.0f);
                    Path path4 = new Path();
                    RectF rectF3 = this.f315163F;
                    float f8 = (float) this.f315164G;
                    path4.addRoundRect(rectF3, f8, f8, Path.Direction.CW);
                    path.op(path4, Path.Op.UNION);
                }
                path.setFillType(Path.FillType.WINDING);
                canvas2.drawPath(path, this.f315162E);
                C87412m.m108593f(createBitmap, "bitmap");
                this.f315165H = createBitmap;
            }
            Bitmap bitmap = this.f315165H;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f315161D);
            }
            canvas.restoreToCount(saveLayer);
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f315165H = null;
    }

    public void setMode(int i) {
        if (f315160I != i) {
            f315160I = i;
            if (this.f315165H != null) {
                this.f315165H = null;
                postInvalidate();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MultiTaskCoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        this.f315161D.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        setWillNotDraw(false);
    }
}

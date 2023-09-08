package com.tencent.p014mm.plugin.finder.live.widget.bulletcommet;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58739j4;
import gy3.C87412m;
import kl1.C10301b0;
import kotlin.Metadata;
import rx3.C36570n;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fB!\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/live/widget/bulletcommet/FlashFlightConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/graphics/RectF;", "v", "Landroid/graphics/RectF;", "getRectF", "()Landroid/graphics/RectF;", "setRectF", "(Landroid/graphics/RectF;)V", "rectF", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.live.widget.bulletcommet.FlashFlightConstraintLayout */
public final class FlashFlightConstraintLayout extends ConstraintLayout {

    /* renamed from: v */
    public RectF f15430v = new RectF(0.0f, 0.0f, (float) getWidth(), (float) getHeight());

    /* renamed from: w */
    public C10301b0 f15431w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashFlightConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }

    public void dispatchDraw(Canvas canvas) {
        C87412m.m108594g(canvas, "canvas");
        C10301b0 b0Var = this.f15431w;
        if (b0Var != null) {
            RectF rectF = this.f15430v;
            C87412m.m108594g(rectF, "rectF");
            if (b0Var.f31398e) {
                Bitmap bitmap = b0Var.f31399f;
                if (bitmap != null) {
                    canvas.save();
                    ((Path) ((C36570n) b0Var.f31401h).getValue()).reset();
                    float f = b0Var.f31403j;
                    ((Path) ((C36570n) b0Var.f31401h).getValue()).addRoundRect(rectF, f, f, Path.Direction.CW);
                    canvas.clipPath((Path) ((C36570n) b0Var.f31401h).getValue());
                    ((Matrix) ((C36570n) b0Var.f31402i).getValue()).reset();
                    float width = (((float) (-bitmap.getWidth())) / 2.0f) + (b0Var.f31400g * ((float) b0Var.f31394a.getWidth()));
                    float height = (((float) (-bitmap.getHeight())) / 2.0f) + (b0Var.f31400g * ((float) b0Var.f31394a.getHeight()));
                    ((Matrix) ((C36570n) b0Var.f31402i).getValue()).postRotate(36.0f, ((float) bitmap.getWidth()) / 2.0f, ((float) bitmap.getHeight()) / 2.0f);
                    ((Matrix) ((C36570n) b0Var.f31402i).getValue()).postTranslate(width, height);
                    canvas.drawBitmap(bitmap, (Matrix) ((C36570n) b0Var.f31402i).getValue(), (Paint) null);
                    canvas.restore();
                }
            } else if (C58739j4.f168176a.mo83692U()) {
                Log.m105924i(b0Var.f31395b, "onDraw END!");
            }
        }
        super.dispatchDraw(canvas);
    }

    public final RectF getRectF() {
        return this.f15430v;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C10301b0 b0Var = this.f15431w;
        if (b0Var != null) {
            b0Var.mo10611b(2);
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f15430v = new RectF(0.0f, 0.0f, (float) i, (float) i2);
        Log.m105924i("FlashFlightConstraintLayout", "onSizeChanged new:" + i + ',' + i2 + ",old:" + i3 + ',' + i4);
    }

    public final void setRectF(RectF rectF) {
        C87412m.m108594g(rectF, "<set-?>");
        this.f15430v = rectF;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FlashFlightConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(attributeSet, "attrs");
    }
}

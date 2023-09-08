package p194lc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import gy3.C87412m;

/* renamed from: lc.q */
public final class C88460q extends C88454p {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C88460q(Context context) {
        super(context);
        C87412m.m108594g(context, "context");
    }

    public boolean drawChild(Canvas canvas, View view, long j) {
        Bitmap bitmap;
        C87412m.m108594g(canvas, "canvas");
        C87412m.m108594g(view, "child");
        if (!canvas.isHardwareAccelerated() && (view instanceof ImageView)) {
            Drawable drawable = ((ImageView) view).getDrawable();
            Bitmap.Config config = null;
            BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
            if (!(bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null)) {
                config = bitmap.getConfig();
            }
            if (config == Bitmap.Config.HARDWARE) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }
}

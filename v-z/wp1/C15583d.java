package wp1;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: wp1.d */
public final class C15583d extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f42206d;

    /* renamed from: e */
    public final /* synthetic */ BitmapDrawable f42207e;

    /* renamed from: f */
    public final /* synthetic */ int f42208f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15583d(Bitmap bitmap, BitmapDrawable bitmapDrawable, int i) {
        super(0);
        this.f42206d = bitmap;
        this.f42207e = bitmapDrawable;
        this.f42208f = i;
    }

    public Object invoke() {
        Log.m105924i("Finder.DynamicImageUtil", "[parseRichText] successfully load resource=[" + this.f42206d.getWidth() + XVFSFile.PATH_SEPARATOR_CHAR + this.f42206d.getHeight() + ']');
        Canvas canvas = new Canvas(this.f42207e.getBitmap());
        Rect rect = new Rect(0, 0, this.f42206d.getWidth(), this.f42206d.getHeight());
        Rect rect2 = new Rect(0, 0, this.f42207e.getBitmap().getWidth(), this.f42207e.getBitmap().getHeight());
        canvas.drawColor(this.f42208f, PorterDuff.Mode.CLEAR);
        canvas.setDrawFilter(new PaintFlagsDrawFilter(0, 3));
        canvas.drawBitmap(this.f42206d, rect, rect2, new Paint(3));
        if (this.f42206d != null) {
            BitmapDrawable bitmapDrawable = this.f42207e;
            int i = this.f42208f;
            if (i == 0) {
                bitmapDrawable.mutate().setColorFilter((ColorFilter) null);
            } else {
                int argb = Color.argb(255, Color.red(i), Color.green(i), Color.blue(i));
                int alpha = Color.alpha(i);
                bitmapDrawable.mutate().setColorFilter(new PorterDuffColorFilter(argb, PorterDuff.Mode.SRC_ATOP));
                bitmapDrawable.setAlpha(alpha);
            }
            this.f42207e.invalidateSelf();
        }
        return C13598b0.f38549a;
    }
}

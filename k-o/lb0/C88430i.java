package lb0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import lb0.C88394b;
import p1162x2.C112020b;

/* renamed from: lb0.i */
public class C88430i implements C88394b.C88408j {
    /* renamed from: c */
    public Bitmap mo5830c(Bitmap bitmap) {
        if (bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return bitmap;
        }
        C112020b bVar = new C112020b(MMApplicationContext.getResources(), bitmap);
        bVar.mo163679b(true);
        Bitmap bitmap2 = null;
        if (bVar instanceof BitmapDrawable) {
            bitmap2 = ((BitmapDrawable) bVar).getBitmap();
        } else {
            int intrinsicWidth = bVar.getIntrinsicWidth();
            int intrinsicHeight = bVar.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                try {
                    Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    bVar.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    bVar.draw(canvas);
                    bitmap2 = createBitmap;
                } catch (OutOfMemoryError unused) {
                }
            }
        }
        if (bitmap2 != bitmap) {
            bitmap.recycle();
        }
        return bitmap2;
    }

    public String key() {
        return "RoundedBitmap";
    }
}

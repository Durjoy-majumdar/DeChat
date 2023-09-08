package wz0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p755xs.C102720b;

/* renamed from: wz0.m */
public class C78743m implements C102720b.C78973a {

    /* renamed from: d */
    public final /* synthetic */ String f230445d;

    /* renamed from: e */
    public final /* synthetic */ ImageView f230446e;

    /* renamed from: f */
    public final /* synthetic */ boolean f230447f;

    /* renamed from: wz0.m$a */
    public class C78744a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Bitmap f230448d;

        public C78744a(Bitmap bitmap) {
            this.f230448d = bitmap;
        }

        public void run() {
            C78743m mVar = C78743m.this;
            if (mVar.f230447f) {
                ImageView imageView = mVar.f230446e;
                Bitmap bitmap = this.f230448d;
                float min = (float) (Math.min(bitmap.getWidth(), this.f230448d.getHeight()) / 2);
                Bitmap bitmap2 = null;
                if (bitmap.isRecycled()) {
                    Log.m105920e("MicroMsg.CardUtil", "getRoundedCornerBitmap in bitmap is null");
                } else {
                    Bitmap createBitmap = BitmapUtil.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888, false);
                    if (createBitmap != null) {
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint();
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        RectF rectF = new RectF(rect);
                        paint.setAntiAlias(true);
                        paint.setDither(true);
                        paint.setFilterBitmap(true);
                        canvas.drawARGB(0, 0, 0, 0);
                        paint.setColor(-4144960);
                        canvas.drawRoundRect(rectF, min, min, paint);
                        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                        canvas.drawBitmap(bitmap, rect, rect, paint);
                        Log.m105925i("MicroMsg.CardUtil", "bitmap recycle %s", bitmap.toString());
                        bitmap.recycle();
                        bitmap2 = createBitmap;
                    }
                }
                imageView.setImageBitmap(bitmap2);
                return;
            }
            mVar.f230446e.setImageBitmap(this.f230448d);
        }
    }

    public C78743m(String str, ImageView imageView, boolean z) {
        this.f230445d = str;
        this.f230446e = imageView;
        this.f230447f = z;
    }

    /* renamed from: j3 */
    public void mo24656j3(String str, Bitmap bitmap) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(", bitmap null = ");
        sb.append(bitmap == null);
        Log.m105918d("MicroMsg.CardUtil", sb.toString());
        if (this.f230445d != null && bitmap != null && !bitmap.isRecycled() && str.equals(this.f230445d)) {
            this.f230446e.post(new C78744a(bitmap));
        }
    }
}

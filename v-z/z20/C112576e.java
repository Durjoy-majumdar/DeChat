package z20;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import cp3.C45142d;
import java.util.LinkedList;

/* renamed from: z20.e */
public class C112576e implements Cloneable {

    /* renamed from: h */
    public static int f337088h = C45142d.m49971b(12.0f);

    /* renamed from: i */
    public static Paint f337089i;

    /* renamed from: d */
    public C112577a f337090d;

    /* renamed from: e */
    public Bitmap f337091e;

    /* renamed from: f */
    public Path f337092f;

    /* renamed from: g */
    public LinkedList<C112578b> f337093g;

    /* renamed from: z20.e$a */
    public enum C112577a {
        ONE,
        TWO
    }

    /* renamed from: z20.e$b */
    public static class C112578b {

        /* renamed from: a */
        public float f337097a;

        /* renamed from: b */
        public float f337098b;

        /* renamed from: c */
        public int f337099c;

        /* renamed from: d */
        public float f337100d;

        /* renamed from: e */
        public float f337101e;

        public C112578b(float f, int i, float f2, float f3, float f4) {
            this.f337097a = f;
            this.f337099c = i;
            this.f337098b = f2;
            this.f337100d = f3;
            this.f337101e = f4;
        }
    }

    static {
        Paint paint = new Paint();
        f337089i = paint;
        paint.setAntiAlias(true);
        f337089i.setStyle(Paint.Style.STROKE);
        f337089i.setColor(-16776961);
        f337089i.setStrokeCap(Paint.Cap.ROUND);
    }

    public C112576e(C112577a aVar, Path path, float f, Bitmap bitmap) {
        this.f337090d = aVar;
        this.f337091e = bitmap;
        this.f337092f = path;
        f337089i.setStrokeWidth(((float) C45142d.m49971b(24.0f)) * f);
    }

    /* renamed from: a */
    public void mo164322a(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2 = canvas;
        C112577a aVar = this.f337090d;
        if (aVar == C112577a.ONE) {
            Bitmap bitmap = this.f337091e;
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.saveLayer(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight(), (Paint) null, 31);
                canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas2.drawPath(this.f337092f, f337089i);
                f337089i.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas2.drawBitmap(bitmap, 0.0f, 0.0f, f337089i);
                f337089i.setXfermode((Xfermode) null);
                canvas.restore();
            }
        } else if (aVar == C112577a.TWO && this.f337093g.size() > 0) {
            C112578b last = this.f337093g.getLast();
            float f3 = last.f337097a;
            int i = last.f337099c;
            int random = (int) (Math.random() * 100.0d);
            float f4 = ((float) f337088h) * f3;
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.ahc, options);
            int round = Math.round(((float) options.outWidth) * f3 * 0.7f);
            int round2 = Math.round(((float) options.outHeight) * f3 * 0.7f);
            int i2 = options.outHeight;
            int i3 = 1;
            while (options.outWidth / i3 > round) {
                i3++;
            }
            int i4 = i3;
            while (i2 / i4 > round2) {
                i4++;
            }
            options.inSampleSize = i4;
            options.inJustDecodeBounds = false;
            Bitmap decodeResource = BitmapFactory.decodeResource(MMApplicationContext.getContext().getResources(), C0966R.C0969drawable.ahc, options);
            f337089i.setStyle(Paint.Style.FILL);
            f337089i.setColorFilter(new LightingColorFilter(i, 1));
            if (decodeResource != null) {
                f2 = last.f337100d - ((((float) decodeResource.getWidth()) * 1.0f) / 2.0f);
                f = last.f337101e - ((((float) decodeResource.getHeight()) * 1.0f) / 2.0f);
            } else {
                f2 = 0.0f;
                f = 0.0f;
            }
            if (random > 0 && random <= 20) {
                f2 += f4;
                f += f4;
            } else if (80 < random) {
                f2 -= f4;
                f -= f4;
            }
            float f5 = f;
            canvas.save();
            canvas2.rotate(-last.f337098b, last.f337100d, last.f337101e);
            if (decodeResource != null) {
                canvas2.drawBitmap(decodeResource, f2, f5, f337089i);
            }
            canvas.restore();
            f337089i.setStyle(Paint.Style.STROKE);
            f337089i.setColorFilter((ColorFilter) null);
        }
    }

    public C112576e(C112577a aVar, LinkedList<C112578b> linkedList, float f) {
        this.f337090d = aVar;
        this.f337093g = linkedList;
        f337089i.setStrokeWidth(((float) C45142d.m49971b(24.0f)) * f);
    }
}

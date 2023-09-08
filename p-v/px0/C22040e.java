package px0;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.xeffect.effect.EffectManager;
import gy3.C8479f0;
import gy3.C87412m;
import ic0.C21070h;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import jc0.C21210b;
import rr3.C110622b;
import rr3.C110625c0;
import rr3.C110632i;
import vp3.C65849b;

/* renamed from: px0.e */
public final class C22040e implements C21070h {

    /* renamed from: a */
    public final /* synthetic */ C22042g f62377a;

    /* renamed from: b */
    public final /* synthetic */ WeakReference<ImageView> f62378b;

    public C22040e(C22042g gVar, WeakReference<ImageView> weakReference) {
        this.f62377a = gVar;
        this.f62378b = weakReference;
    }

    /* renamed from: a */
    public void mo6676a(String str, View view) {
    }

    /* renamed from: b */
    public void mo6677b(String str, View view, C21210b bVar) {
    }

    /* renamed from: c */
    public Bitmap mo6678c(String str, View view, C21210b bVar) {
        float f;
        float f2;
        Bitmap bitmap;
        C21210b bVar2 = bVar;
        if ((bVar2 != null ? bVar2.f59988d : null) == null) {
            Log.m105924i(this.f62377a.f62382e, "bitmap is null");
            return null;
        }
        ImageView imageView = this.f62378b.get();
        if (imageView == null) {
            Log.m105924i(this.f62377a.f62382e, "weakIv == null");
        }
        if (imageView == null) {
            return null;
        }
        EffectManager effectManager = C22038c.f62372a;
        T t = bVar2.f59988d;
        C87412m.m108593f(t, "imageData.bitmap");
        float height = ((float) t.getHeight()) / ((float) t.getWidth());
        int i = C22055p.f62410p;
        float f3 = (float) i;
        int i2 = C22055p.f62409o;
        float f4 = (float) i2;
        float f5 = f3 / f4;
        Log.m105924i("MicroMsg.NativeFinderDrawCardManager", "CardRatio = " + f5);
        if (1.3333334f <= height && height <= f5) {
            Bitmap createBitmap = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            int width = t.getWidth();
            int height2 = t.getHeight();
            RectF rectF = new RectF();
            rectF.set(0.0f, 0.0f, (float) t.getWidth(), (float) t.getHeight());
            RectF rectF2 = new RectF();
            rectF2.set(0.0f, 0.0f, f4, f3);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
            Bitmap createBitmap2 = Bitmap.createBitmap(t, 0, 0, width, height2, matrix, false);
            C87412m.m108593f(createBitmap2, "upImage");
            Canvas canvas = new Canvas(createBitmap);
            C22058r rVar = C22058r.f62430a;
            Paint c = rVar.mo35167c(createBitmap2);
            Paint b = rVar.mo35166b();
            RectF rectF3 = new RectF();
            rectF3.set(0.0f, 0.0f, (float) createBitmap2.getWidth(), (float) createBitmap2.getHeight());
            RectF rectF4 = new RectF();
            rectF4.set(0.0f, 0.0f, (float) i2, (float) i);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(rectF3, rectF4, Matrix.ScaleToFit.START);
            canvas.drawBitmap(createBitmap2, matrix2, (Paint) null);
            Canvas canvas2 = canvas;
            float f6 = f4;
            float f7 = f3;
            canvas2.drawRect(0.0f, 0.0f, f6, f7, c);
            canvas2.drawRect(0.0f, 0.0f, f6, f7, b);
            return createBitmap;
        }
        float f8 = 0.0f;
        if (0.0f <= height && height <= 1.3333334f) {
            C8479f0 f0Var = new C8479f0();
            f0Var.f27484d = t;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            C118142a aVar = new C118142a(f0Var, countDownLatch);
            Bitmap createBitmap3 = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            Canvas canvas3 = new Canvas(createBitmap3);
            int width2 = t.getWidth();
            int height3 = t.getHeight();
            RectF rectF5 = new RectF();
            rectF5.set(0.0f, 0.0f, (float) t.getWidth(), (float) t.getHeight());
            RectF rectF6 = new RectF();
            rectF6.set(0.0f, 0.0f, f4, f3);
            Matrix matrix3 = new Matrix();
            matrix3.setRectToRect(rectF5, rectF6, Matrix.ScaleToFit.START);
            String str2 = "MicroMsg.NativeFinderDrawCardManager";
            Bitmap createBitmap4 = Bitmap.createBitmap(t, 0, 0, width2, height3, matrix3, true);
            C87412m.m108593f(createBitmap4, "upImage");
            C110625c0 g = C22038c.f62372a.mo154927g(C110632i.BlurEffect);
            C87412m.m108592e(g, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
            C110622b bVar3 = (C110622b) g;
            bVar3.mo162186d(80.0f);
            bVar3.mo162187e(1.0f);
            C65849b bVar4 = new C65849b();
            bVar4.mo89891b(t);
            int width3 = t.getWidth();
            int height4 = t.getHeight();
            bVar4.f189363b = width3;
            bVar4.f189364c = height4;
            bVar4.f189366e.f334033b.mo154923c(bVar3);
            bVar4.mo89890a(new C22037b(imageView, createBitmap4, canvas3, aVar, createBitmap3));
            try {
                countDownLatch.await(1000, TimeUnit.MILLISECONDS);
                bitmap = (Bitmap) f0Var.f27484d;
            } catch (InterruptedException e) {
                Log.printErrStackTrace(str2, e, "latch await exp ", new Object[0]);
                bitmap = (Bitmap) f0Var.f27484d;
            }
            return bitmap;
        }
        String str3 = "upImage";
        Bitmap createBitmap5 = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
        Canvas canvas4 = new Canvas(createBitmap5);
        int width4 = t.getWidth();
        int height5 = t.getHeight();
        Matrix matrix4 = new Matrix();
        int width5 = t.getWidth();
        int height6 = t.getHeight();
        if (i * width5 > i2 * height6) {
            f2 = f3 / ((float) height6);
            f = (f4 - (((float) width5) * f2)) * 0.5f;
        } else {
            f2 = f4 / ((float) width5);
            f8 = (f3 - (((float) height6) * f2)) * 0.5f;
            f = 0.0f;
        }
        matrix4.setScale(f2, f2);
        matrix4.postTranslate(f, f8);
        Bitmap createBitmap6 = Bitmap.createBitmap(t, 0, 0, width4, height5, matrix4, true);
        C87412m.m108593f(createBitmap6, str3);
        C22058r rVar2 = C22058r.f62430a;
        Paint c2 = rVar2.mo35167c(createBitmap6);
        Paint b2 = rVar2.mo35166b();
        canvas4.drawBitmap(createBitmap6, rVar2.mo35165a(createBitmap6), (Paint) null);
        Canvas canvas5 = canvas4;
        float f9 = f4;
        float f15 = f3;
        canvas5.drawRect(0.0f, 0.0f, f9, f15, c2);
        canvas5.drawRect(0.0f, 0.0f, f9, f15, b2);
        return createBitmap5;
    }
}

package c60;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import fy3.C32226l;
import gy3.C87413o;
import rr3.C110622b;
import rx3.C13598b0;
import vp3.C65849b;

/* renamed from: c60.b */
public final class C54667b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ Bitmap f153214d;

    /* renamed from: e */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f153215e;

    /* renamed from: f */
    public final /* synthetic */ float f153216f;

    /* renamed from: g */
    public final /* synthetic */ int f153217g;

    /* renamed from: c60.b$a */
    public static final class C54668a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ int f153218d;

        /* renamed from: e */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f153219e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C54668a(int i, C32226l<? super Bitmap, C13598b0> lVar) {
            super(1);
            this.f153218d = i;
            this.f153219e = lVar;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null) {
                int i = this.f153218d;
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                Canvas canvas = new Canvas(bitmap);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawColor(i);
            }
            MMHandlerThread.postToMainThread(new C28499a(this.f153219e, bitmap));
            return C13598b0.f38549a;
        }
    }

    /* renamed from: c60.b$b */
    public static final class C54669b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f153220d;

        public C54669b(C32226l<? super Bitmap, C13598b0> lVar) {
            this.f153220d = lVar;
        }

        public final void run() {
            C32226l<Bitmap, C13598b0> lVar = this.f153220d;
            if (lVar != null) {
                lVar.invoke(null);
            }
        }
    }

    public C54667b(Bitmap bitmap, C32226l<? super Bitmap, C13598b0> lVar, float f, int i) {
        this.f153214d = bitmap;
        this.f153215e = lVar;
        this.f153216f = f;
        this.f153217g = i;
    }

    public final void run() {
        if (this.f153214d == null) {
            C32226l<Bitmap, C13598b0> lVar = this.f153215e;
            if (lVar != null) {
                lVar.invoke(null);
                return;
            }
            return;
        }
        try {
            C65849b bVar = new C65849b();
            bVar.mo89891b(this.f153214d);
            int width = this.f153214d.getWidth();
            int height = this.f153214d.getHeight();
            bVar.f189363b = width;
            bVar.f189364c = height;
            C110622b b = bVar.f189366e.f334033b.mo154922b();
            b.mo162186d(this.f153216f);
            b.mo162187e(5.0f);
            bVar.mo89890a(new C54668a(this.f153217g, this.f153215e));
        } catch (Exception e) {
            Log.m105920e("MicroMsg.LiveBitmapUtil", "fastblur failed: " + e.getMessage());
            MMHandlerThread.postToMainThread(new C54669b(this.f153215e));
        }
    }
}

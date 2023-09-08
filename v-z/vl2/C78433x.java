package vl2;

import android.graphics.Bitmap;
import android.os.Looper;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zt3.C119157j;

/* renamed from: vl2.x */
public final class C78433x extends C87413o implements C32224a<Object> {

    /* renamed from: d */
    public final /* synthetic */ C8479f0<Bitmap> f229802d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f229803e;

    /* renamed from: f */
    public final /* synthetic */ C32226l<Bitmap, C13598b0> f229804f;

    /* renamed from: vl2.x$a */
    public static final class C78434a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C32226l<Bitmap, C13598b0> f229805d;

        /* renamed from: e */
        public final /* synthetic */ C8479f0<Bitmap> f229806e;

        public C78434a(C32226l<? super Bitmap, C13598b0> lVar, C8479f0<Bitmap> f0Var) {
            this.f229805d = lVar;
            this.f229806e = f0Var;
        }

        public final void run() {
            this.f229805d.invoke(this.f229806e.f27484d);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78433x(C8479f0<Bitmap> f0Var, Bitmap bitmap, C32226l<? super Bitmap, C13598b0> lVar) {
        super(0);
        this.f229802d = f0Var;
        this.f229803e = bitmap;
        this.f229804f = lVar;
    }

    public final Object invoke() {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f229802d.f27484d = BitmapUtil.fastBlurBitmap(this.f229803e, 0.1f, 10, true, 200);
            Log.m105925i("MicroMsg.ScanViewUtils", "alvinluo blurBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanViewUtils", e, "blurBitmap exception", new Object[0]);
        }
        Object[] objArr = new Object[2];
        Bitmap bitmap = (Bitmap) this.f229802d.f27484d;
        Integer num = null;
        objArr[0] = bitmap != null ? Integer.valueOf(bitmap.getWidth()) : null;
        Bitmap bitmap2 = (Bitmap) this.f229802d.f27484d;
        if (bitmap2 != null) {
            num = Integer.valueOf(bitmap2.getHeight());
        }
        objArr[1] = num;
        Log.m105919d("MicroMsg.ScanViewUtils", "alvinluo blurBitmap width: %s, height: %s", objArr);
        if (C87412m.m108589b(Thread.currentThread(), Looper.getMainLooper().getThread())) {
            this.f229804f.invoke(this.f229802d.f27484d);
            return C13598b0.f38549a;
        }
        return ((C119157j) C119157j.f356862d).mo183895z(new C78434a(this.f229804f, this.f229802d));
    }
}

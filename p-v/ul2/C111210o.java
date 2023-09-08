package ul2;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ul2.o */
public final class C111210o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333035d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f333036e;

    /* renamed from: f */
    public final /* synthetic */ boolean f333037f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111210o(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, Bitmap bitmap, boolean z) {
        super(0);
        this.f333035d = scanCodeProductMergeMaskView;
        this.f333036e = bitmap;
        this.f333037f = z;
    }

    public Object invoke() {
        ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f333035d;
        int i = ScanCodeProductMergeMaskView.f316025j1;
        boolean z = scanCodeProductMergeMaskView.getMScanSource() == 4;
        boolean z2 = this.f333035d.getMScanSource() == 4;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f333035d.f316038d1 = BitmapUtil.fastBlurBitmap(this.f333036e, 0.1f, 10, true, 200);
            Log.m105925i("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo blurBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanCodeProductMergeMaskView", e, "blurBitmap exception", new Object[0]);
        }
        Bitmap bitmap = this.f333035d.f316038d1;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmap2 = this.f333035d.f316038d1;
            C87412m.m108591d(bitmap2);
            Bitmap bitmap3 = this.f333035d.f316038d1;
            C87412m.m108591d(bitmap3);
            Log.m105919d("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo blurBitmap width: %d, height: %d", Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap3.getHeight()));
            if (z) {
                Bitmap bitmap4 = this.f333035d.f316038d1;
                C87412m.m108591d(bitmap4);
                int width = bitmap4.getWidth();
                Bitmap bitmap5 = this.f333035d.f316038d1;
                C87412m.m108591d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = this.f333035d.getMeasuredWidth();
                int measuredHeight = this.f333035d.getMeasuredHeight();
                float f = (float) width;
                float f2 = (float) height;
                float f3 = (((float) measuredWidth) * 1.0f) / ((float) measuredHeight);
                Point point = (f * 1.0f) / f2 < f3 ? width < measuredWidth ? new Point(width, (int) (f / f3)) : new Point(measuredWidth, measuredHeight) : height < measuredHeight ? new Point((int) (f3 * f2), height) : new Point(measuredWidth, measuredHeight);
                Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo blurBitmap needCrop width: %d, height: %d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                ScanCodeProductMergeMaskView scanCodeProductMergeMaskView2 = this.f333035d;
                scanCodeProductMergeMaskView2.f316038d1 = BitmapUtil.extractThumbNail(scanCodeProductMergeMaskView2.f316038d1, point.y, point.x, true, true);
                Object[] objArr = new Object[2];
                Bitmap bitmap6 = this.f333035d.f316038d1;
                Integer num = null;
                objArr[0] = bitmap6 != null ? Integer.valueOf(bitmap6.getWidth()) : null;
                Bitmap bitmap7 = this.f333035d.f316038d1;
                if (bitmap7 != null) {
                    num = Integer.valueOf(bitmap7.getHeight());
                }
                objArr[1] = num;
                Log.m105927v("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo blurBitmap cropBitmap width: %s, height: %s", objArr);
            }
            C111209n nVar = new C111209n(this.f333035d, z2);
            if (this.f333037f) {
                this.f333035d.post(new C37483m(nVar));
            } else {
                nVar.invoke();
            }
        }
        return C13598b0.f38549a;
    }
}

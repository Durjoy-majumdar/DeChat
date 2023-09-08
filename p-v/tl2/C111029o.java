package tl2;

import android.graphics.Bitmap;
import android.graphics.Point;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: tl2.o */
public final class C111029o extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332505d;

    /* renamed from: e */
    public final /* synthetic */ Bitmap f332506e;

    /* renamed from: f */
    public final /* synthetic */ boolean f332507f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111029o(ScanGoodsMaskView scanGoodsMaskView, Bitmap bitmap, boolean z) {
        super(0);
        this.f332505d = scanGoodsMaskView;
        this.f332506e = bitmap;
        this.f332507f = z;
    }

    public Object invoke() {
        ScanGoodsMaskView scanGoodsMaskView = this.f332505d;
        int i = ScanGoodsMaskView.f315898W0;
        boolean z = scanGoodsMaskView.getMScanSource() == 2;
        boolean z2 = this.f332505d.getMScanSource() == 2;
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.f332505d.f315922U = BitmapUtil.fastBlurBitmap(this.f332506e, 0.1f, 10, true, 200);
            Log.m105925i("MicroMsg.ScanGoodsMaskView", "alvinluo blurBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanGoodsMaskView", e, "blurBitmap exception", new Object[0]);
        }
        Bitmap bitmap = this.f332505d.f315922U;
        if (bitmap != null && !bitmap.isRecycled()) {
            Bitmap bitmap2 = this.f332505d.f315922U;
            C87412m.m108591d(bitmap2);
            Bitmap bitmap3 = this.f332505d.f315922U;
            C87412m.m108591d(bitmap3);
            Log.m105919d("MicroMsg.ScanGoodsMaskView", "alvinluo blurBitmap width: %d, height: %d", Integer.valueOf(bitmap2.getWidth()), Integer.valueOf(bitmap3.getHeight()));
            if (z) {
                Bitmap bitmap4 = this.f332505d.f315922U;
                C87412m.m108591d(bitmap4);
                int width = bitmap4.getWidth();
                Bitmap bitmap5 = this.f332505d.f315922U;
                C87412m.m108591d(bitmap5);
                int height = bitmap5.getHeight();
                int measuredWidth = this.f332505d.getMeasuredWidth();
                int measuredHeight = this.f332505d.getMeasuredHeight();
                float f = (float) width;
                float f2 = (float) height;
                float f3 = (((float) measuredWidth) * 1.0f) / ((float) measuredHeight);
                Point point = (f * 1.0f) / f2 < f3 ? width < measuredWidth ? new Point(width, (int) (f / f3)) : new Point(measuredWidth, measuredHeight) : height < measuredHeight ? new Point((int) (f3 * f2), height) : new Point(measuredWidth, measuredHeight);
                Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo blurBitmap needCrop width: %d, height: %d", Integer.valueOf(point.x), Integer.valueOf(point.y));
                ScanGoodsMaskView scanGoodsMaskView2 = this.f332505d;
                scanGoodsMaskView2.f315922U = BitmapUtil.extractThumbNail(scanGoodsMaskView2.f315922U, point.y, point.x, true, true);
                Object[] objArr = new Object[2];
                Bitmap bitmap6 = this.f332505d.f315922U;
                Integer num = null;
                objArr[0] = bitmap6 != null ? Integer.valueOf(bitmap6.getWidth()) : null;
                Bitmap bitmap7 = this.f332505d.f315922U;
                if (bitmap7 != null) {
                    num = Integer.valueOf(bitmap7.getHeight());
                }
                objArr[1] = num;
                Log.m105927v("MicroMsg.ScanGoodsMaskView", "alvinluo blurBitmap cropBitmap width: %s, height: %s", objArr);
            }
            C111028n nVar = new C111028n(this.f332505d, z2);
            if (this.f332507f) {
                this.f332505d.post(new C37123m(nVar));
            } else {
                nVar.invoke();
            }
        }
        return C13598b0.f38549a;
    }
}

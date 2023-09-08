package tl2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lp3.C88643g;
import op3.C117882j;

/* renamed from: tl2.r */
public final class C90515r extends C87413o implements C32226l<Bitmap, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f260133d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C90515r(ScanGoodsMaskView scanGoodsMaskView) {
        super(1);
        this.f260133d = scanGoodsMaskView;
    }

    public Object invoke(Object obj) {
        boolean z;
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap == null || bitmap.isRecycled()) {
            Log.m105918d("MicroMsg.ScanGoodsMaskView", "alvinluo showCustomTipsImage roundBitmap is invalid");
            C88643g.m110544b().mo72091a(C117882j.m166284c(Boolean.FALSE, "tipsImage roundBitmap is invalid"));
            z = false;
        } else {
            Log.m105918d("MicroMsg.ScanGoodsMaskView", "alvinluo showCustomTipsImage");
            ImageView imageView = this.f260133d.f315907I;
            if (imageView != null) {
                imageView.setImageBitmap(bitmap);
                z = true;
            } else {
                C87412m.m108603p("customTipsImage");
                throw null;
            }
        }
        return Boolean.valueOf(z);
    }
}

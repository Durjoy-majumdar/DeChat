package tl2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.model.C106076p0;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import lp3.C88643g;
import op3.C117882j;

/* renamed from: tl2.s */
public final class C111033s extends C87413o implements C32226l<Boolean, Boolean> {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsRequest f332511d;

    /* renamed from: e */
    public final /* synthetic */ ScanGoodsMaskView f332512e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111033s(ScanGoodsRequest scanGoodsRequest, ScanGoodsMaskView scanGoodsMaskView) {
        super(1);
        this.f332511d = scanGoodsRequest;
        this.f332512e = scanGoodsMaskView;
    }

    public Object invoke(Object obj) {
        boolean z;
        Boolean bool = (Boolean) obj;
        Log.m105918d("MicroMsg.ScanGoodsMaskView", "alvinluo showCustomSuccessView");
        Bitmap b = C106076p0.f315823a.mo151633b(this.f332511d.f248906q);
        if (b == null || b.isRecycled()) {
            C88643g.m110544b().mo72091a(C117882j.m166284c(Boolean.FALSE, "successView getResouce failed"));
            z = false;
        } else {
            ImageView imageView = this.f332512e.f315904F;
            if (imageView != null) {
                imageView.setImageBitmap(b);
                z = true;
            } else {
                C87412m.m108603p("customSuccessView");
                throw null;
            }
        }
        return Boolean.valueOf(z);
    }
}

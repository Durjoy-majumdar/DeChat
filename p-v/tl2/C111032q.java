package tl2;

import android.graphics.Bitmap;
import com.tencent.p014mm.plugin.scanner.api.ScanGoodsRequest;
import com.tencent.p014mm.plugin.scanner.model.C106076p0;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import hp3.C87581a;
import lp3.C88643g;
import op3.C117882j;

/* renamed from: tl2.q */
public final class C111032q<_Ret, _Var> implements C87581a {

    /* renamed from: a */
    public final /* synthetic */ ScanGoodsRequest f332510a;

    public C111032q(ScanGoodsRequest scanGoodsRequest) {
        this.f332510a = scanGoodsRequest;
    }

    public Object call(Object obj) {
        Void voidR = (Void) obj;
        Bitmap b = C106076p0.f315823a.mo151633b(this.f332510a.f248907r);
        if (b == null || b.isRecycled()) {
            C88643g.m110544b().mo72091a(C117882j.m166284c(Boolean.FALSE, "tipsImage getResource failed"));
            return null;
        }
        Log.m105918d("MicroMsg.ScanGoodsMaskView", "alvinluo showCustomTipsImage getRoundBitmap");
        try {
            if (!b.isRecycled()) {
                b = BitmapUtil.getRoundedCornerBitmap(b, false, (float) Math.floor((((double) (b.getWidth() > b.getHeight() ? b.getWidth() : b.getHeight())) / 2.0d) + 0.5d));
            }
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanViewUtils", e, "alvinluo decodeRoundBitmap exception", new Object[0]);
            b = null;
        }
        return b;
    }
}

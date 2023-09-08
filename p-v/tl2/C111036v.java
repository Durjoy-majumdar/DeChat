package tl2;

import android.graphics.Bitmap;
import android.view.TextureView;
import com.tencent.p014mm.plugin.scanner.model.C106067f0;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: tl2.v */
public final class C111036v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332515d;

    /* renamed from: e */
    public final /* synthetic */ TextureView f332516e;

    /* renamed from: tl2.v$a */
    public static final class C111037a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanGoodsMaskView f332517d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f332518e;

        public C111037a(ScanGoodsMaskView scanGoodsMaskView, Bitmap bitmap) {
            this.f332517d = scanGoodsMaskView;
            this.f332518e = bitmap;
        }

        public final void run() {
            ScanGoodsMaskView scanGoodsMaskView = this.f332517d;
            C106067f0 f0Var = C106067f0.f315807d;
            scanGoodsMaskView.f315918S = true;
            scanGoodsMaskView.f315920T = true;
            scanGoodsMaskView.mo151692y(this.f332518e);
        }
    }

    public C111036v(ScanGoodsMaskView scanGoodsMaskView, TextureView textureView) {
        this.f332515d = scanGoodsMaskView;
        this.f332516e = textureView;
    }

    public final void run() {
        try {
            ScanGoodsMaskView scanGoodsMaskView = this.f332515d;
            int i = ScanGoodsMaskView.f315898W0;
            scanGoodsMaskView.mo151674A();
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = this.f332516e.getBitmap();
            Log.m105925i("MicroMsg.ScanGoodsMaskView", "alvinluo updatePreviewBitmap getBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            ((C119157j) C119157j.f356862d).mo183895z(new C111037a(this.f332515d, bitmap));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanGoodsMaskView", e, "alvinluo updatePreviewBitmap exception", new Object[0]);
        }
    }
}

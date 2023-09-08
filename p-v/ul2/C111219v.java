package ul2;

import android.graphics.Bitmap;
import android.view.TextureView;
import com.tencent.p014mm.plugin.scanner.model.C106067f0;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import zt3.C119157j;

/* renamed from: ul2.v */
public final class C111219v implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333044d;

    /* renamed from: e */
    public final /* synthetic */ TextureView f333045e;

    /* renamed from: ul2.v$a */
    public static final class C111220a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ ScanCodeProductMergeMaskView f333046d;

        /* renamed from: e */
        public final /* synthetic */ Bitmap f333047e;

        public C111220a(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, Bitmap bitmap) {
            this.f333046d = scanCodeProductMergeMaskView;
            this.f333047e = bitmap;
        }

        public final void run() {
            ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f333046d;
            C106067f0 f0Var = C106067f0.f315807d;
            scanCodeProductMergeMaskView.f316036b1 = true;
            scanCodeProductMergeMaskView.f316037c1 = true;
            scanCodeProductMergeMaskView.mo151777F(this.f333047e);
        }
    }

    public C111219v(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, TextureView textureView) {
        this.f333044d = scanCodeProductMergeMaskView;
        this.f333045e = textureView;
    }

    public final void run() {
        try {
            ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f333044d;
            int i = ScanCodeProductMergeMaskView.f316025j1;
            scanCodeProductMergeMaskView.mo151778G();
            long currentTimeMillis = System.currentTimeMillis();
            Bitmap bitmap = this.f333045e.getBitmap();
            Log.m105925i("MicroMsg.ScanCodeProductMergeMaskView", "alvinluo updatePreviewBitmap getBitmap cost: %d", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            ((C119157j) C119157j.f356862d).mo183895z(new C111220a(this.f333044d, bitmap));
        } catch (Exception e) {
            Log.printErrStackTrace("MicroMsg.ScanCodeProductMergeMaskView", e, "alvinluo updatePreviewBitmap exception", new Object[0]);
        }
    }
}

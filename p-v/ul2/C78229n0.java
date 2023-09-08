package ul2;

import android.graphics.Bitmap;
import android.view.TextureView;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanSharedMaskView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32226l;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import vl2.C78433x;

/* renamed from: ul2.n0 */
public final class C78229n0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ ScanSharedMaskView f229191d;

    /* renamed from: ul2.n0$a */
    public static final class C78230a extends C87413o implements C32226l<Bitmap, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ ScanSharedMaskView f229192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C78230a(ScanSharedMaskView scanSharedMaskView) {
            super(1);
            this.f229192d = scanSharedMaskView;
        }

        public Object invoke(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap != null && !bitmap.isRecycled()) {
                ScanSharedMaskView scanSharedMaskView = this.f229192d;
                scanSharedMaskView.f53815r = bitmap;
                ImageView imageView = scanSharedMaskView.f53810j;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                    ImageView imageView2 = this.f229192d.f53810j;
                    if (imageView2 != null) {
                        imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    } else {
                        C87412m.m108603p("blurMaskView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("blurMaskView");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    public C78229n0(ScanSharedMaskView scanSharedMaskView) {
        this.f229191d = scanSharedMaskView;
    }

    public final void run() {
        ScanSharedMaskView scanSharedMaskView = this.f229191d;
        int i = ScanSharedMaskView.f53799E;
        scanSharedMaskView.mo24475f();
        TextureView textureView = this.f229191d.f53814q;
        Bitmap bitmap = textureView != null ? textureView.getBitmap() : null;
        if (bitmap == null) {
            Log.m105920e("MicroMsg.ScanSharedMaskView", "alvinluo updateBackgroundBlurView get bitmap failed");
        } else {
            new C78433x(new C8479f0(), bitmap, new C78230a(this.f229191d)).invoke();
        }
    }
}

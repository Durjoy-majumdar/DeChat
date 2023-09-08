package ul2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.widget.ScanCodeProductMergeMaskView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ul2.n */
public final class C111209n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScanCodeProductMergeMaskView f333033d;

    /* renamed from: e */
    public final /* synthetic */ boolean f333034e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111209n(ScanCodeProductMergeMaskView scanCodeProductMergeMaskView, boolean z) {
        super(0);
        this.f333033d = scanCodeProductMergeMaskView;
        this.f333034e = z;
    }

    public Object invoke() {
        Bitmap bitmap = this.f333033d.f316038d1;
        if (bitmap != null && !bitmap.isRecycled()) {
            ScanCodeProductMergeMaskView scanCodeProductMergeMaskView = this.f333033d;
            ImageView imageView = scanCodeProductMergeMaskView.f316029U0;
            if (imageView != null) {
                imageView.setImageBitmap(scanCodeProductMergeMaskView.f316038d1);
                ImageView imageView2 = this.f333033d.f316029U0;
                if (imageView2 != null) {
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    if (this.f333034e) {
                        ScanCodeProductMergeMaskView scanCodeProductMergeMaskView2 = this.f333033d;
                        ImageView imageView3 = scanCodeProductMergeMaskView2.f316027S0;
                        if (imageView3 != null) {
                            imageView3.setImageBitmap(scanCodeProductMergeMaskView2.f316038d1);
                            ImageView imageView4 = this.f333033d.f316027S0;
                            if (imageView4 != null) {
                                imageView4.setVisibility(0);
                                ImageView imageView5 = this.f333033d.f316027S0;
                                if (imageView5 != null) {
                                    imageView5.setAlpha(1.0f);
                                    ImageView imageView6 = this.f333033d.f316027S0;
                                    if (imageView6 != null) {
                                        imageView6.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    } else {
                                        C87412m.m108603p("bottomBlurView");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("bottomBlurView");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("bottomBlurView");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("bottomBlurView");
                            throw null;
                        }
                    }
                    this.f333033d.f316035a1 = true;
                } else {
                    C87412m.m108603p("blurView");
                    throw null;
                }
            } else {
                C87412m.m108603p("blurView");
                throw null;
            }
        }
        return C13598b0.f38549a;
    }
}

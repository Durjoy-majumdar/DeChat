package tl2;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.plugin.scanner.p101ui.scangoods.widget.ScanGoodsMaskView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: tl2.n */
public final class C111028n extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScanGoodsMaskView f332503d;

    /* renamed from: e */
    public final /* synthetic */ boolean f332504e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111028n(ScanGoodsMaskView scanGoodsMaskView, boolean z) {
        super(0);
        this.f332503d = scanGoodsMaskView;
        this.f332504e = z;
    }

    public Object invoke() {
        Bitmap bitmap = this.f332503d.f315922U;
        if (bitmap != null && !bitmap.isRecycled()) {
            ScanGoodsMaskView scanGoodsMaskView = this.f332503d;
            ImageView imageView = scanGoodsMaskView.f315900B;
            if (imageView != null) {
                imageView.setImageBitmap(scanGoodsMaskView.f315922U);
                ImageView imageView2 = this.f332503d.f315900B;
                if (imageView2 != null) {
                    imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                    if (this.f332504e) {
                        ScanGoodsMaskView scanGoodsMaskView2 = this.f332503d;
                        ImageView imageView3 = scanGoodsMaskView2.f315934z;
                        if (imageView3 != null) {
                            imageView3.setImageBitmap(scanGoodsMaskView2.f315922U);
                            ImageView imageView4 = this.f332503d.f315934z;
                            if (imageView4 != null) {
                                imageView4.setVisibility(0);
                                ImageView imageView5 = this.f332503d.f315934z;
                                if (imageView5 != null) {
                                    imageView5.setAlpha(1.0f);
                                    ImageView imageView6 = this.f332503d.f315934z;
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
                    this.f332503d.f315916R = true;
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

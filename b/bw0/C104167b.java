package bw0;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.ball.view.FloatBallBlurView;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: bw0.b */
public final class C104167b extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ FloatBallBlurView f308400d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C104167b(FloatBallBlurView floatBallBlurView) {
        super(0);
        this.f308400d = floatBallBlurView;
    }

    public Object invoke() {
        Log.m105920e("MicroMsg.FloatBallBlurView", "onLoadImageFailed");
        ImageView imageView = this.f308400d.f311898e;
        if (imageView != null) {
            imageView.setImageBitmap((Bitmap) null);
            FloatBallBlurView floatBallBlurView = this.f308400d;
            ImageView imageView2 = floatBallBlurView.f311900g;
            if (imageView2 != null) {
                imageView2.setBackgroundColor(floatBallBlurView.getResources().getColor(C0966R.color.f2927a));
                ImageView imageView3 = this.f308400d.f311900g;
                if (imageView3 != null) {
                    imageView3.setAlpha(0.0f);
                    ImageView imageView4 = this.f308400d.f311899f;
                    if (imageView4 != null) {
                        imageView4.setAlpha(0.0f);
                        return C13598b0.f38549a;
                    }
                    C87412m.m108603p("mTopBlurMask");
                    throw null;
                }
                C87412m.m108603p("mBottomBlurMask");
                throw null;
            }
            C87412m.m108603p("mBottomBlurMask");
            throw null;
        }
        C87412m.m108603p("mBlurImageView");
        throw null;
    }
}

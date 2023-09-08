package v82;

import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.multitalk.p078ui.widget.ScreenCastBigView;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: v82.p1 */
public final class C111484p1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ ScreenCastBigView f333776d;

    /* renamed from: e */
    public final /* synthetic */ TextView f333777e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C111484p1(ScreenCastBigView screenCastBigView, TextView textView) {
        super(0);
        this.f333776d = screenCastBigView;
        this.f333777e = textView;
    }

    public Object invoke() {
        this.f333776d.getMaskView().setVisibility(0);
        ScreenCastBigView screenCastBigView = this.f333776d;
        TextView textView = this.f333777e;
        screenCastBigView.f315012h = textView;
        screenCastBigView.f315009e = 3;
        screenCastBigView.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        return C13598b0.f38549a;
    }
}

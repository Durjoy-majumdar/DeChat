package uh1;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.tencent.p014mm.p136ui.widget.RoundedCornerFrameLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import ph1.C62295l;

/* renamed from: uh1.d */
public final class C65370d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d */
    public final /* synthetic */ C65362c f188154d;

    public C65370d(C65362c cVar) {
        this.f188154d = cVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object animatedValue = valueAnimator.getAnimatedValue();
        C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        int i = this.f188154d.mo88660q().top - ((int) (((float) (this.f188154d.mo88660q().top - this.f188154d.mo88661s().top)) * floatValue));
        int i2 = this.f188154d.mo88660q().left - ((int) (((float) (this.f188154d.mo88660q().left - this.f188154d.mo88661s().left)) * floatValue));
        int width = this.f188154d.mo88660q().width() - ((int) (((float) (this.f188154d.mo88660q().width() - this.f188154d.mo88661s().width())) * floatValue));
        int height = this.f188154d.mo88660q().height() - ((int) (floatValue * ((float) (this.f188154d.mo88660q().height() - this.f188154d.mo88661s().height()))));
        RoundedCornerFrameLayout roundedCornerFrameLayout = this.f188154d.f181119t;
        ViewGroup.LayoutParams layoutParams = roundedCornerFrameLayout != null ? roundedCornerFrameLayout.getLayoutParams() : null;
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        C65362c cVar = this.f188154d;
        marginLayoutParams.topMargin = i;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.width = width;
        marginLayoutParams.height = height;
        C62295l lVar = cVar.f188138v;
        if (lVar != null) {
            lVar.mo87364a(width, height);
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = cVar.f181119t;
        if (roundedCornerFrameLayout2 != null) {
            roundedCornerFrameLayout2.requestLayout();
        }
        String str = cVar.f181104e;
        Log.m105924i(str, "topMargin = " + marginLayoutParams.topMargin + " leftMargin = " + marginLayoutParams.leftMargin + " width = " + width + " height = " + height);
    }
}

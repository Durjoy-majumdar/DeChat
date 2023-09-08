package rs1;

import android.view.View;
import android.view.animation.Animation;
import as1.C0201a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import rx3.C13598b0;
import zp3.C79406f;

/* renamed from: rs1.o7 */
public final class C13358o7 extends C87413o implements C32226l<Float, C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C13329m7 f37865d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13358o7(C13329m7 m7Var) {
        super(1);
        this.f37865d = m7Var;
    }

    public Object invoke(Object obj) {
        float floatValue = ((Number) obj).floatValue();
        C13329m7 m7Var = this.f37865d;
        if (!m7Var.f37808f) {
            float a = floatValue + ((float) C79406f.m96347a(m7Var.f37803a, 28.0f));
            C0201a aVar = this.f37865d.f37806d;
            if (aVar != null) {
                aVar.f18129f = a;
                View view = aVar.f18127d;
                if (view != null) {
                    Animation animation = view.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                    }
                    View view2 = aVar.f18127d;
                    if (view2 != null) {
                        view2.clearAnimation();
                        View view3 = aVar.f18127d;
                        if (view3 != null) {
                            view3.animate().cancel();
                            if (aVar.mo4894b()) {
                                View view4 = aVar.f18127d;
                                if (view4 != null) {
                                    view4.setTranslationX(aVar.getBorderPeek());
                                } else {
                                    C87412m.m108603p("contentView");
                                    throw null;
                                }
                            } else {
                                View view5 = aVar.f18127d;
                                if (view5 != null) {
                                    view5.setTranslationY(aVar.getBorderPeek());
                                } else {
                                    C87412m.m108603p("contentView");
                                    throw null;
                                }
                            }
                            aVar.f18130g = false;
                            aVar.setDrawerOpen(true);
                            aVar.mo185f();
                        } else {
                            C87412m.m108603p("contentView");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("contentView");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("contentView");
                    throw null;
                }
            }
            this.f37865d.mo12770h();
            C32226l<? super Float, Boolean> lVar = this.f37865d.f37813k;
            if (lVar != null) {
                Boolean invoke = lVar.invoke(Float.valueOf(a));
            }
        }
        return C13598b0.f38549a;
    }
}

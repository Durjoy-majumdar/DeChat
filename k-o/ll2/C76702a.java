package ll2;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import ll2.C21441c;

/* renamed from: ll2.a */
public final class C76702a extends C21440b {

    /* renamed from: c */
    public final int f224419c;

    public C76702a(int i) {
        this.f224419c = i;
    }

    /* renamed from: a */
    public void mo33607a(float f) {
        View view = this.f60678a;
        C87412m.m108591d(view);
        if (view.getAlpha() <= f) {
            mo106981f(this.f60678a, f);
        }
    }

    /* renamed from: b */
    public void mo33608b(C21441c.C21442a aVar) {
        C87412m.m108594g(aVar, "animationInfo");
    }

    /* renamed from: c */
    public void mo33609c(float f) {
        View view = this.f60678a;
        C87412m.m108591d(view);
        float f2 = 1.0f - f;
        if (view.getAlpha() >= f2) {
            mo106981f(this.f60678a, f2);
        }
    }

    /* renamed from: d */
    public void mo33606d(C21441c.C21442a aVar) {
        C87412m.m108594g(aVar, "animationInfo");
        super.mo33606d(aVar);
    }

    /* renamed from: e */
    public boolean mo33610e() {
        return this.f224419c == 2;
    }

    /* renamed from: f */
    public final void mo106981f(View view, float f) {
        Log.m105927v("MicroMsg.AlphaImageAnimator", "alvinluo updateViewAlpha: %s", Float.valueOf(f));
        if (view != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(Float.valueOf(f));
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/scanner/ocr/animation/AlphaImageAnimator", "updateViewAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((Float) aVar.mo10231a(0)).floatValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/scanner/ocr/animation/AlphaImageAnimator", "updateViewAlpha", "(Landroid/view/View;F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
    }
}

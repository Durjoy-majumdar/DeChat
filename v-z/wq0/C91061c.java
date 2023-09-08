package wq0;

import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import bt0.C79808b;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntime;
import com.tencent.p014mm.plugin.appbrand.page.C83780d1;
import com.tencent.p014mm.plugin.appbrand.page.C83820i0;
import com.tencent.p014mm.plugin.appbrand.page.C83849m0;
import wt0.C91106a;
import wt0.C91108b;
import wt0.C91110d;
import wt0.C91114h;

/* renamed from: wq0.c */
public class C91061c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntime f261234d;

    /* renamed from: e */
    public final /* synthetic */ String f261235e;

    public C91061c(AppBrandRuntime appBrandRuntime, String str) {
        this.f261234d = appBrandRuntime;
        this.f261235e = str;
    }

    public void run() {
        C83820i0 currentPage;
        C83780d1 currentPageView;
        C83849m0 Z = this.f261234d.mo113042Z();
        if (Z != null && (currentPage = Z.getCurrentPage()) != null && (currentPageView = currentPage.getCurrentPageView()) != null) {
            C91110d dVar = currentPageView.f244570T;
            String str = this.f261235e;
            if (dVar.f261299a.isRunning()) {
                C91110d.C91112b c = dVar.mo125169c();
                C79808b bVar = dVar.f261299a.f244554F;
                if (bVar != null) {
                    dVar.mo125170d(bVar.getTop() + bVar.getMeasuredHeight());
                }
                if (dVar.f261301c == null) {
                    C91106a aVar = new C91106a(dVar.f261299a.getContext());
                    dVar.f261301c = aVar;
                    c.addView(aVar, new FrameLayout.LayoutParams(-2, -2, 17));
                }
                C91106a aVar2 = (C91106a) dVar.f261301c;
                aVar2.f261291d.setText(str);
                aVar2.f261293f.removeCallbacks(aVar2.f261292e);
                aVar2.f261293f.postDelayed(aVar2.f261292e, C91114h.f261308N0);
                if (aVar2.getAlpha() != 1.0f && aVar2.f261294g == null) {
                    aVar2.setVisibility(0);
                    aVar2.animate().cancel();
                    ViewPropertyAnimator animate = aVar2.animate();
                    aVar2.f261294g = animate;
                    animate.alpha(1.0f).setListener(new C91108b(aVar2)).start();
                    aVar2.setVisibility(0);
                }
            }
        }
    }
}

package rs1;

import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import er1.C58784w3;
import gy3.C87412m;
import rx3.C36570n;

/* renamed from: rs1.p */
public final class C63611p implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d */
    public final /* synthetic */ C63586o f180369d;

    public C63611p(C63586o oVar) {
        this.f180369d = oVar;
    }

    public final boolean onPreDraw() {
        int i;
        C63586o oVar = this.f180369d;
        int i2 = C63586o.f180303v;
        ViewGroup viewGroup = (ViewGroup) ((C36570n) oVar.f180306f).getValue();
        if (viewGroup != null) {
            viewGroup.getLocationInWindow(oVar.f180314q);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            i = (oVar.f180314q[1] + viewGroup.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        } else {
            i = 0;
        }
        oVar.f180315r = i;
        C63586o oVar2 = this.f180369d;
        int i3 = oVar2.f180315r;
        if (i3 != oVar2.f180316s) {
            C63512a aVar = oVar2.f180313p;
            if (aVar != null) {
                aVar.mo2404a(i3);
            }
            if (C58784w3.f168295a.mo83910X0()) {
                Log.m105924i("Finder.DoubleClickTipUIC", "OnPreDrawListener lastY=" + this.f180369d.f180316s + ",currY=" + this.f180369d.f180315r);
            }
            C63586o oVar3 = this.f180369d;
            oVar3.f180316s = oVar3.f180315r;
        }
        return true;
    }
}

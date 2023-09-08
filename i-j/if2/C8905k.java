package if2;

import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import kg3.C76577a;

/* renamed from: if2.k */
public final class C8905k implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C8894g f28187d;

    public C8905k(C8894g gVar) {
        this.f28187d = gVar;
    }

    public final void run() {
        ViewGroup.LayoutParams layoutParams = this.f28187d.mo9713d3().getLayoutParams();
        C87412m.m108592e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        Rect rect = new Rect();
        this.f28187d.mo9713d3().getGlobalVisibleRect(rect);
        layoutParams2.setMargins(layoutParams2.leftMargin, layoutParams2.topMargin - (rect.bottom - (this.f28187d.getContext().getResources().getDisplayMetrics().heightPixels - C76577a.m92151b(this.f28187d.getContext(), 108))), layoutParams2.rightMargin, layoutParams2.bottomMargin);
        this.f28187d.mo9713d3().setLayoutParams(layoutParams2);
        Log.m105924i("NewBizInfoAuthScopeUIC", "adjust btn pos, margin top = " + layoutParams2.topMargin);
    }
}

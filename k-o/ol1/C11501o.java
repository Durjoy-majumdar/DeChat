package ol1;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.tencent.p014mm.p136ui.tools.C7020t0;
import com.tencent.p014mm.sdk.platformtools.Log;
import qo3.C12925w;

/* renamed from: ol1.o */
public final class C11501o implements C7020t0 {

    /* renamed from: d */
    public final /* synthetic */ C11497n f33801d;

    public C11501o(C11497n nVar) {
        this.f33801d = nVar;
    }

    /* renamed from: Q1 */
    public final void mo531Q1(int i, boolean z) {
        Log.m105924i("WishKeyBoardInputWidget", "KeyboardHeightObserver " + i + ' ' + z);
        if (i > 0) {
            C11497n nVar = this.f33801d;
            C12925w wVar = nVar.f28309g.f26706b;
            if (wVar.mo12466f()) {
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, i});
                ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
                ofInt.addUpdateListener(new C11496m(nVar, wVar));
                ofInt.setDuration(200);
                ofInt.start();
                return;
            }
            return;
        }
        C12925w wVar2 = this.f33801d.f28309g.f26706b;
        if (wVar2.mo12466f()) {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{wVar2.f36927f.getPaddingBottom(), 0});
            ofInt2.setInterpolator(new DecelerateInterpolator());
            ofInt2.addUpdateListener(new C11495l(wVar2));
            ofInt2.setDuration(200);
            ofInt2.start();
        }
    }
}

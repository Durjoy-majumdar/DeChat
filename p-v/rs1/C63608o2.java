package rs1;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderFeedMegaVideoBtnAnimUIC;
import com.tencent.p014mm.sdk.platformtools.Log;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import rx3.C13598b0;

/* renamed from: rs1.o2 */
public final class C63608o2 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60905o f180364d;

    /* renamed from: e */
    public final /* synthetic */ FinderFeedMegaVideoBtnAnimUIC f180365e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63608o2(C60905o oVar, FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC) {
        super(0);
        this.f180364d = oVar;
        this.f180365e = finderFeedMegaVideoBtnAnimUIC;
    }

    public Object invoke() {
        View D = this.f180364d.mo85812D(C0966R.C0970id.d9r);
        if (D == null) {
            ViewStub viewStub = (ViewStub) this.f180364d.mo85812D(C0966R.C0970id.g6u);
            D = viewStub != null ? viewStub.inflate() : null;
        }
        if (D != null) {
            FinderFeedMegaVideoBtnAnimUIC finderFeedMegaVideoBtnAnimUIC = this.f180365e;
            C60905o oVar = this.f180364d;
            if (finderFeedMegaVideoBtnAnimUIC.f162499h.isRunning() || D.getVisibility() == 0) {
                Log.m105924i("FinderFeedMegaVideoBtnAnimUIC", "startAppearAnim: the guide view is showing");
            } else {
                finderFeedMegaVideoBtnAnimUIC.f162496e = D;
                D.setOnClickListener(new C13295k2(oVar));
                finderFeedMegaVideoBtnAnimUIC.f162497f = oVar.mo85812D(C0966R.C0970id.g6w).getWidth();
                TextView textView = (TextView) D.findViewById(C0966R.C0970id.g74);
                if (textView != null) {
                    textView.setText(((TextView) oVar.mo85812D(C0966R.C0970id.g6y)).getText());
                    textView.setTextColor(D.getContext().getResources().getColor(C0966R.color.BW_100));
                }
                ((WeImageView) D.findViewById(C0966R.C0970id.g76)).setIconColor(D.getContext().getResources().getColor(C0966R.color.BW_100));
                ((TextView) D.findViewById(C0966R.C0970id.g75)).setAlpha(0.0f);
                View findViewById = D.findViewById(C0966R.C0970id.f5842q4);
                findViewById.getLayoutParams().width = finderFeedMegaVideoBtnAnimUIC.f162497f;
                findViewById.requestLayout();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(D, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                D.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(D, "com/tencent/mm/plugin/finder/viewmodel/component/FinderFeedMegaVideoBtnAnimUIC$startAppearAnim$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int color = oVar.f173499A.getResources().getColor(C0966R.color.f3578ya);
                int color2 = oVar.f173499A.getResources().getColor(C0966R.color.f3590yo);
                finderFeedMegaVideoBtnAnimUIC.f162499h.removeAllUpdateListeners();
                finderFeedMegaVideoBtnAnimUIC.f162499h.removeAllListeners();
                finderFeedMegaVideoBtnAnimUIC.f162499h.addUpdateListener(new C63562l2(finderFeedMegaVideoBtnAnimUIC, D, findViewById, color, color2));
                finderFeedMegaVideoBtnAnimUIC.f162499h.addListener(new C63569m2(findViewById));
                finderFeedMegaVideoBtnAnimUIC.f162499h.start();
                C61926c.m72666K(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION, new C63574n2(finderFeedMegaVideoBtnAnimUIC));
            }
        }
        return C13598b0.f38549a;
    }
}

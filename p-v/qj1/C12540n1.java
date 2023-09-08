package qj1;

import android.view.View;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import o40.C61926c;
import org.libpag.PAGFile;
import rx3.C13598b0;

/* renamed from: qj1.n1 */
public final class C12540n1 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C12690u1 f36028d;

    /* renamed from: e */
    public final /* synthetic */ boolean f36029e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12540n1(C12690u1 u1Var, boolean z) {
        super(0);
        this.f36028d = u1Var;
        this.f36029e = z;
    }

    public Object invoke() {
        C12690u1 u1Var = this.f36028d;
        boolean z = this.f36029e;
        u1Var.f36359D = z;
        if (z) {
            u1Var.f36363r.setVisibility(4);
            this.f36028d.f36364s.setVisibility(8);
            View view = this.f36028d.f36367v;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view2 = view;
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$changeApplaudMode$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveAnchorLikePlugin$changeApplaudMode$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f36028d.f36365t.setVisibility(0);
            if (!this.f36028d.f36365t.isPlaying()) {
                this.f36028d.f36365t.setComposition(PAGFile.Load(MMApplicationContext.getContext().getResources().getAssets(), this.f36028d.f36356A));
                this.f36028d.f36365t.setProgress(0.0d);
                this.f36028d.f36365t.flush();
                this.f36028d.f36365t.setRepeatCount(0);
                this.f36028d.f36365t.play();
            }
            C61926c.m72666K(10000, new C12515m1(this.f36028d));
        } else {
            u1Var.f36363r.setVisibility(0);
            this.f36028d.f36364s.setVisibility(0);
            this.f36028d.f36365t.setVisibility(8);
            this.f36028d.f36365t.stop();
            this.f36028d.f36358C = System.currentTimeMillis();
        }
        return C13598b0.f38549a;
    }
}

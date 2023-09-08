package il1;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74933u4;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import fy3.C32224a;
import gy3.C87413o;
import o40.C61926c;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import qj1.C62660c;
import qj1.C62741dg;
import rx3.C13598b0;

/* renamed from: il1.j8 */
public final class C60443j8 extends C87413o implements C32224a<C13598b0> {

    /* renamed from: d */
    public final /* synthetic */ C60424h8 f172331d;

    /* renamed from: e */
    public final /* synthetic */ boolean f172332e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60443j8(C60424h8 h8Var, boolean z) {
        super(0);
        this.f172331d = h8Var;
        this.f172332e = z;
    }

    public Object invoke() {
        C60424h8 h8Var;
        PAGView pAGView;
        C60424h8 h8Var2 = this.f172331d;
        h8Var2.f172279D = this.f172332e;
        if ((h8Var2.f172290u.getAlpha() == 1.0f) && (pAGView = h8Var.f172291v) != null) {
            if (this.f172332e) {
                h8Var.f172290u.setVisibility(8);
                pAGView.setVisibility(0);
                h8Var.f172290u.setImageDrawable(C74933u4.m89768e(h8Var.f166287d.getContext(), C0966R.raw.icons_filled_applause, h8Var.f172281F));
                if (!pAGView.isPlaying()) {
                    pAGView.setComposition(PAGFile.Load(MMApplicationContext.getContext().getResources().getAssets(), h8Var.f172293x));
                    pAGView.setProgress(0.0d);
                    pAGView.flush();
                    pAGView.setRepeatCount(0);
                    pAGView.play();
                }
                C61926c.m72666K(10000, new C60439i8(h8Var));
            } else {
                (h8Var = this.f172331d).f172290u.setVisibility(0);
                pAGView.setVisibility(8);
                pAGView.stop();
                C62660c cVar = h8Var.f172286q;
                C62741dg dgVar = cVar instanceof C62741dg ? (C62741dg) cVar : null;
                if (dgVar != null) {
                    dgVar.mo87747Z0(true);
                }
            }
        }
        return C13598b0.f38549a;
    }
}

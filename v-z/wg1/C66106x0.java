package wg1;

import android.util.AttributeSet;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import aw0.C103928o;
import cl1.C54991o;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.C56074k;
import com.tencent.p014mm.plugin.finder.live.view.C56090m1;
import com.tencent.p014mm.sdk.platformtools.Log;
import fj1.C45795b;
import gy3.C87412m;

/* renamed from: wg1.x0 */
public final class C66106x0 extends C65976a1 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66106x0(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public C56032b mo90010c3() {
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        return new C56074k((MMActivity) activity, getFragment(), (AttributeSet) null);
    }

    /* renamed from: d3 */
    public void mo90011d3() {
        if (getActivity() instanceof MMActivity) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).setSelfNavigationBarVisible(8);
        }
        getContext().getWindow().addFlags(2097280);
        getContext().getWindow().addFlags(67108864);
        getContext().getWindow().getDecorView().setSystemUiVisibility(1792);
        getContext().getWindow().clearFlags(67108864);
        getContext().getWindow().addFlags(Integer.MIN_VALUE);
        getContext().getWindow().setStatusBarColor(0);
        getContext().getWindow().setNavigationBarColor(0);
        getContext().getWindow().setFormat(-3);
        getContext().getWindow().setSoftInputMode(51);
    }

    /* renamed from: f3 */
    public void mo90013f3() {
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar = C45795b.f123698n;
        boolean z = true;
        if (bVar == null || !((C54991o) bVar.mo71262a(C54991o.class)).f154350p0) {
            z = false;
        }
        if (z) {
            C56090m1 m1Var = this.f189697h;
            if (m1Var != null) {
                m1Var.mo64001C();
            }
            C103928o.m138642b();
            Log.m105924i(this.f189693d, "tryShowFloatBallWhenExitPage resumeFloatBall");
        }
    }

    public void onStop() {
        String str = this.f189693d;
        Log.m105924i(str, "[LiveLifecycler]onStop " + this);
        C56032b bVar = this.f189695f;
        if (bVar != null) {
            bVar.stop();
        }
        C45795b.C32059a aVar = C45795b.f123697j;
        C45795b bVar2 = C45795b.f123698n;
        boolean z = true;
        if (bVar2 == null || !((C54991o) bVar2.mo71262a(C54991o.class)).f154350p0) {
            z = false;
        }
        if (z) {
            C56090m1 m1Var = this.f189697h;
            if (m1Var != null) {
                m1Var.mo64001C();
            }
            C103928o.m138642b();
            Log.m105924i(this.f189693d, "onStop resumeFloatBall");
        }
    }
}

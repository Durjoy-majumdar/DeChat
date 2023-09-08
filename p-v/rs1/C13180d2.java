package rs1;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import bl3.C113200q;
import com.tencent.p014mm.C0966R;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import ht1.C8768g2;
import jq3.C60905o;
import zt3.C119157j;
import zt3.C119179t;

@C113200q(initialMode = 2)
/* renamed from: rs1.d2 */
public final class C13180d2 extends C13308kb implements C8768g2 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13180d2(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public View mo12677c3(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        return oVar.mo85812D(C0966R.C0970id.f358073lz3);
    }

    /* renamed from: d3 */
    public void mo12619d3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.f358073lz3);
        if (viewGroup != null) {
            viewGroup.setAlpha(1.0f);
            viewGroup.animate().alpha(0.0f).setDuration(250).setListener(new C13121b2(viewGroup)).start();
        }
    }

    /* renamed from: e3 */
    public boolean mo12620e3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        return true;
    }

    /* renamed from: g3 */
    public void mo12678g3(C60905o oVar, boolean z, long j, long j2) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: i3 */
    public void mo12621i3(C60905o oVar, boolean z) {
        C87412m.m108594g(oVar, "holder");
        long j = z ? 0 : 150;
        ViewGroup viewGroup = (ViewGroup) oVar.mo85812D(C0966R.C0970id.f358073lz3);
        if (viewGroup != null) {
            C119179t tVar = C119157j.f356862d;
            C13134c2 c2Var = new C13134c2(viewGroup, this, oVar);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            jVar.mo183892w(c2Var, j, false);
        }
    }
}

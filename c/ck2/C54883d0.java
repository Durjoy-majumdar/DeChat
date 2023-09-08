package ck2;

import a14.C53884f2;
import a14.C53895h;
import a14.C53934p0;
import a14.C53973z1;
import androidx.appcompat.app.AppCompatActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import d14.C58052j1;
import gy3.C87412m;
import java.util.concurrent.CancellationException;
import p145dx.C58453t;
import rj2.C63451c;
import rj2.C63460e;
import wj2.C66132f;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: ck2.d0 */
public final class C54883d0 extends UIComponent implements C58453t {

    /* renamed from: d */
    public C63451c f153833d = new C63451c(getLifecycleScope());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54883d0(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: T2 */
    public void mo75823T2() {
        Log.m105924i("MicroMsg.RingtonePlayUIC", "onPauseRingtone");
        this.f153833d.mo88319f3();
    }

    /* renamed from: c3 */
    public final void mo75824c3(C66132f fVar, long j, boolean z, boolean z2, boolean z3) {
        C87412m.m108594g(fVar, "item");
        Log.m105924i("MicroMsg.RingtonePlayUIC", "on play ringtone " + fVar.mo90183n() + ",and id is " + j + " with action is play " + z);
        this.f153833d.mo88318e3(fVar, j, z, z2, z3);
    }

    /* renamed from: d3 */
    public final void mo75825d3() {
        Log.m105924i("MicroMsg.RingtonePlayUIC", "release");
        this.f153833d.mo88319f3();
        C63451c cVar = this.f153833d;
        ((C58052j1) cVar.f179978g).setValue(new C63451c.C63452a.C63454b(0, (C66132f) null, 3));
        cVar.mo88316c3();
        C53973z1 z1Var = cVar.f179984p;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        mo75825d3();
    }

    public void onFinished() {
        super.onFinished();
        mo75825d3();
    }

    public void onPause() {
        super.onPause();
        mo75825d3();
    }

    public void onResume() {
        super.onResume();
        C63451c cVar = this.f153833d;
        C53973z1 d = C53895h.m60466d(cVar.f179975d, (C66212f) null, (C53934p0) null, new C63460e(cVar, (C15601d<? super C63460e>) null), 3, (Object) null);
        cVar.f179984p = d;
        ((C53884f2) d).start();
    }
}

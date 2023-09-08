package gl1;

import android.os.Bundle;
import b50.C54424j;
import cl1.C54991o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import d60.C58124b;
import er1.C58704c5;
import er1.C58728f5;
import fj1.C45795b;
import mo0.C88787b;
import qo3.C47883u;
import vk1.C65761b;

/* renamed from: gl1.b2 */
public final class C59534b2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C59559k f170162a;

    /* renamed from: b */
    public final /* synthetic */ int f170163b;

    public C59534b2(C59559k kVar, int i) {
        this.f170162a = kVar;
        this.f170163b = i;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        Bundle bundle = new Bundle();
        C59559k kVar = this.f170162a;
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        C65761b bVar = kVar.f166842f;
        if (bVar != null) {
            bVar.statusChange(C58124b.C58125b.LIVE_HAS_FINISHED, bundle);
        }
        if (((C54991o) this.f170162a.mo83051g(C54991o.class)).f154301c3) {
            C58704c5 c5Var = C58704c5.f168044a;
            C58704c5.C58705a.f168049b = 0;
            C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1141);
            C58728f5 f5Var = C58728f5.f168144a;
            C45795b bVar2 = this.f170162a.f166851d;
            int i = this.f170163b;
            StringBuilder sb = new StringBuilder();
            sb.append("0-vBitrate:");
            C54424j jVar = C54424j.f152652a;
            sb.append(C54424j.f152654c);
            f5Var.mo83645b(bVar2, C88787b.CTRL_INDEX, i, "externalErrorClose", sb.toString());
            return;
        }
        C58704c5 c5Var2 = C58704c5.f168044a;
        C58704c5.C58705a.f168049b = 0;
        C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1131);
        C58728f5 f5Var2 = C58728f5.f168144a;
        C45795b bVar3 = this.f170162a.f166851d;
        int i2 = this.f170163b;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("0-vBitrate:");
        C54424j jVar2 = C54424j.f152652a;
        sb4.append(C54424j.f152654c);
        f5Var2.mo83645b(bVar3, 1131, i2, "secondaryErrorClose", sb4.toString());
    }
}

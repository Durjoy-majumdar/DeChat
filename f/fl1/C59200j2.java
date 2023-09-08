package fl1;

import android.os.Bundle;
import b50.C54424j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.soter.core.biometric.FaceManager;
import d60.C58124b;
import er1.C58704c5;
import er1.C58728f5;
import fj1.C45795b;
import qo3.C47883u;
import vk1.C65760a;

/* renamed from: fl1.j2 */
public final class C59200j2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C59161f f169336a;

    /* renamed from: b */
    public final /* synthetic */ int f169337b;

    public C59200j2(C59161f fVar, int i) {
        this.f169336a = fVar;
        this.f169337b = i;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        Bundle bundle = new Bundle();
        C59161f fVar = this.f169336a;
        bundle.putBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_MANUAL", true);
        C65760a aVar = fVar.f166837f;
        if (aVar != null) {
            aVar.statusChange(C58124b.C58125b.LIVE_HAS_FINISHED, bundle);
        }
        C58704c5 c5Var = C58704c5.f168044a;
        C58704c5.C58705a.f168049b = 0;
        C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1121);
        C58728f5 f5Var = C58728f5.f168144a;
        C45795b bVar = this.f169336a.f166851d;
        int i = this.f169337b;
        StringBuilder sb = new StringBuilder();
        sb.append("0-vBitrate:");
        C54424j jVar = C54424j.f152652a;
        sb.append(C54424j.f152654c);
        f5Var.mo83645b(bVar, FaceManager.FACE_ACQUIRED_MULTI_FACE, i, "anchorErrorClose", sb.toString());
    }
}

package fl1;

import b50.C54424j;
import com.tencent.p014mm.plugin.report.service.C115669n;
import er1.C58704c5;
import er1.C58728f5;
import fj1.C45795b;
import qo3.C47883u;

/* renamed from: fl1.k2 */
public final class C59203k2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C59161f f169340a;

    /* renamed from: b */
    public final /* synthetic */ int f169341b;

    public C59203k2(C59161f fVar, int i) {
        this.f169340a = fVar;
        this.f169341b = i;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        C58704c5 c5Var = C58704c5.f168044a;
        C58704c5.C58705a.f168049b = 0;
        C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1122);
        C58728f5 f5Var = C58728f5.f168144a;
        C45795b bVar = this.f169340a.f166851d;
        int i = this.f169341b;
        StringBuilder sb = new StringBuilder();
        sb.append("0-vBitrate:");
        C54424j jVar = C54424j.f152652a;
        sb.append(C54424j.f152654c);
        f5Var.mo83645b(bVar, 1122, i, "anchorErrorCancel", sb.toString());
    }
}

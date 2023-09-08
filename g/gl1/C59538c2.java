package gl1;

import b50.C54424j;
import cl1.C54991o;
import com.tencent.p014mm.plugin.report.service.C115669n;
import er1.C58704c5;
import er1.C58728f5;
import fj1.C45795b;
import mo0.C88788c;
import qo3.C47883u;

/* renamed from: gl1.c2 */
public final class C59538c2 implements C47883u {

    /* renamed from: a */
    public final /* synthetic */ C59559k f170167a;

    /* renamed from: b */
    public final /* synthetic */ int f170168b;

    public C59538c2(C59559k kVar, int i) {
        this.f170167a = kVar;
        this.f170168b = i;
    }

    /* renamed from: a */
    public final void mo353a(boolean z, String str) {
        if (((C54991o) this.f170167a.mo83051g(C54991o.class)).f154301c3) {
            C58704c5 c5Var = C58704c5.f168044a;
            C58704c5.C58705a.f168049b = 0;
            C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1142);
            C58728f5 f5Var = C58728f5.f168144a;
            C45795b bVar = this.f170167a.f166851d;
            int i = this.f170168b;
            StringBuilder sb = new StringBuilder();
            sb.append("0-vBitrate:");
            C54424j jVar = C54424j.f152652a;
            sb.append(C54424j.f152654c);
            f5Var.mo83645b(bVar, C88788c.CTRL_INDEX, i, "externalErrorCancel", sb.toString());
            return;
        }
        C58704c5 c5Var2 = C58704c5.f168044a;
        C58704c5.C58705a.f168049b = 0;
        C115669n.INSTANCE.mo175912v(C58704c5.f168047d, 1132);
        C58728f5 f5Var2 = C58728f5.f168144a;
        C45795b bVar2 = this.f170167a.f166851d;
        int i2 = this.f170168b;
        StringBuilder sb4 = new StringBuilder();
        sb4.append("0-vBitrate:");
        C54424j jVar2 = C54424j.f152652a;
        sb4.append(C54424j.f152654c);
        f5Var2.mo83645b(bVar2, 1132, i2, "secondaryErrorCancel", sb4.toString());
    }
}

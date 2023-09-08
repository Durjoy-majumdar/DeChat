package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import java.util.concurrent.atomic.AtomicBoolean;
import p1177ce.C113287a;
import p1195ge.C116947b;
import p212oe.C117776s;
import p212oe.b$$f;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$p */
public final /* synthetic */ class e$b$a$$p implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355684a;

    public /* synthetic */ e$b$a$$p(C114467i iVar) {
        this.f355684a = iVar;
    }

    public final void accept(Object obj) {
        C114467i iVar = this.f355684a;
        C113287a aVar = (C113287a) obj;
        boolean z = false;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        C117776s sVar = (C117776s) iVar;
        if ("ExplicitBgPoll".equals(sVar.mo182526y())) {
            atomicBoolean.set(true);
        }
        if (!"ExcessiveCpu".equals(sVar.mo182526y()) || (aVar.mo165841e() > 15 && iVar.mo173666j() > 2)) {
            if (!atomicBoolean.get()) {
                if (b$$f.m166056a() || b$$f.m166061f() || b$$f.m166059d("powerStat", 50)) {
                    z = true;
                }
                if (!z) {
                    return;
                }
            }
            iVar.mo173668l(C116947b.C116948a.class, new e$b$a$$r(iVar, atomicBoolean, aVar));
        }
    }
}

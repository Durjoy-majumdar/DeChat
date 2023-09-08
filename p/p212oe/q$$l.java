package p212oe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import java.util.concurrent.atomic.AtomicReference;
import p1177ce.C113287a;
import p269xe.C118872b;
import p981ie.C87705i;

/* renamed from: oe.q$$l */
public final /* synthetic */ class q$$l implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ AtomicReference f352244a;

    /* renamed from: b */
    public final /* synthetic */ C114467i f352245b;

    public /* synthetic */ q$$l(AtomicReference atomicReference, C114467i iVar) {
        this.f352244a = atomicReference;
        this.f352245b = iVar;
    }

    public final void accept(Object obj) {
        AtomicReference atomicReference = this.f352244a;
        C114467i iVar = this.f352245b;
        atomicReference.set("avgPower" + C118872b.m167605b(iVar) + "_" + ((C113287a) obj).mo165841e());
    }
}

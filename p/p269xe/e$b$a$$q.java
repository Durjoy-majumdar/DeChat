package p269xe;

import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.JiffiesMonitorFeature;
import p1177ce.C113287a;
import p933be.C113173i;
import p981ie.C87705i;

/* renamed from: xe.e$b$a$$q */
public final /* synthetic */ class e$b$a$$q implements C87705i {

    /* renamed from: a */
    public final /* synthetic */ C114467i f355685a;

    /* renamed from: b */
    public final /* synthetic */ String f355686b;

    /* renamed from: c */
    public final /* synthetic */ C113173i f355687c;

    /* renamed from: d */
    public final /* synthetic */ boolean f355688d;

    public /* synthetic */ e$b$a$$q(C114467i iVar, String str, C113173i iVar2, boolean z) {
        this.f355685a = iVar;
        this.f355686b = str;
        this.f355687c = iVar2;
        this.f355688d = z;
    }

    public final void accept(Object obj) {
        C114467i iVar = this.f355685a;
        iVar.mo173668l(JiffiesMonitorFeature.JiffiesSnapshot.class, new e$b$a$$s((C113287a) obj, this.f355686b, this.f355687c, iVar, this.f355688d));
    }
}

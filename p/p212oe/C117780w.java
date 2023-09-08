package p212oe;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p1177ce.C113314g;

/* renamed from: oe.w */
public class C117780w extends C117777t {

    /* renamed from: b */
    public final /* synthetic */ String f352295b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117780w(C113314g gVar, String str, String str2) {
        super(gVar, str);
        this.f352295b = str2;
    }

    /* renamed from: a */
    public void mo182522a() {
        String str = this.f352295b;
        C114467i iVar = this.f352286a;
        if (iVar instanceof C117776s) {
            ((C117776s) iVar).f343160i.putString("extra_module_name", str);
        }
        mo182530b(true);
        this.f352286a.mo173675s(CpuStatFeature.C114427b.class);
        if (MMApplicationContext.isMainProcess()) {
            mo182531c();
        }
        mo182532d(60000);
        mo182533e(Math.max(C117750b.f352133l, 10000));
        if (b$$f.m166060e()) {
            this.f352286a.mo173675s(b$$g.class);
            this.f352286a.mo173678u(C114536x.C114540d.class, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            this.f352286a.mo173678u(C114536x.C114543g.class, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
            this.f352286a.mo173678u(C114513o0.C114514a.class, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        }
    }
}

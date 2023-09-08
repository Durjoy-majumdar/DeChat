package p212oe;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import p1177ce.C113314g;

/* renamed from: oe.p */
public class C117773p extends C117777t {

    /* renamed from: b */
    public final /* synthetic */ String f352216b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117773p(C113314g gVar, String str, String str2) {
        super(gVar, str);
        this.f352216b = str2;
    }

    /* renamed from: a */
    public void mo182522a() {
        String str = this.f352216b;
        C114467i iVar = this.f352286a;
        if (iVar instanceof C117776s) {
            ((C117776s) iVar).f343160i.putString("extra_module_name", str);
        }
        mo182532d(FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
        mo182533e(0);
    }
}

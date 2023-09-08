package p212oe;

import androidx.camera.core.FocusMeteringAction;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.matrix.batterycanary.monitor.feature.C114513o0;
import com.tencent.matrix.batterycanary.monitor.feature.C114536x;
import com.tencent.matrix.batterycanary.monitor.feature.CpuStatFeature;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import p1177ce.C113314g;
import p285zh.c$$f;

/* renamed from: oe.n */
public class C117771n extends C117777t {

    /* renamed from: b */
    public final /* synthetic */ String f352213b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C117771n(C113314g gVar, String str, String str2) {
        super(gVar, str);
        this.f352213b = str2;
    }

    /* renamed from: a */
    public void mo182522a() {
        Class<CpuStatFeature.C114427b> cls = CpuStatFeature.C114427b.class;
        Class<C114513o0.C114514a> cls2 = C114513o0.C114514a.class;
        Class<C114536x.C114543g> cls3 = C114536x.C114543g.class;
        Class<C114536x.C114540d> cls4 = C114536x.C114540d.class;
        Class<b$$g> cls5 = b$$g.class;
        String str = this.f352213b;
        C114467i iVar = this.f352286a;
        if (iVar instanceof C117776s) {
            ((C117776s) iVar).f343160i.putString("extra_module_name", str);
        }
        boolean e = b$$f.m166060e();
        String str2 = this.f352213b;
        str2.getClass();
        char c = 65535;
        switch (str2.hashCode()) {
            case -732590663:
                if (str2.equals("ExplicitBg")) {
                    c = 0;
                    break;
                }
                break;
            case -732590539:
                if (str2.equals("ExplicitFg")) {
                    c = 1;
                    break;
                }
                break;
            case -51753083:
                if (str2.equals("ExcessiveCpu")) {
                    c = 2;
                    break;
                }
                break;
            case 2671072:
                if (str2.equals("VoIp")) {
                    c = 3;
                    break;
                }
                break;
            case 797006181:
                if (str2.equals("MultiTalk")) {
                    c = 4;
                    break;
                }
                break;
            case 1864111384:
                if (str2.equals("ExplicitBgPoll")) {
                    c = 5;
                    break;
                }
                break;
            case 1978627988:
                if (str2.equals("ExplicitFgPoll")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 5:
            case 6:
                mo182530b(true);
                this.f352286a.mo173675s(cls);
                if (MMApplicationContext.isMainProcess()) {
                    mo182531c();
                }
                mo182533e(Math.max(C117750b.f352133l, 10000));
                this.f352286a.mo173675s(C114513o0.C114515b.class);
                if ("ExplicitBg".equals(this.f352213b)) {
                    this.f352286a.mo173675s(c$$f.class);
                }
                if (e) {
                    this.f352286a.mo173675s(cls5);
                    if ("ExplicitFg".equals(this.f352213b)) {
                        this.f352286a.mo173678u(cls4, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        this.f352286a.mo173678u(cls3, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        this.f352286a.mo173678u(cls2, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                mo182530b(false);
                mo182533e(Math.min(Math.max(C117750b.f352133l, 10000), 900000));
                return;
            case 3:
            case 4:
                mo182530b(true);
                this.f352286a.mo173675s(cls);
                if (MMApplicationContext.isMainProcess()) {
                    mo182531c();
                }
                mo182532d(60000);
                mo182533e(Math.max(C117750b.f352133l, 10000));
                if (e) {
                    this.f352286a.mo173675s(cls5);
                    this.f352286a.mo173678u(cls4, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    this.f352286a.mo173678u(cls3, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    this.f352286a.mo173678u(cls2, FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION);
                    return;
                }
                return;
            default:
                return;
        }
    }
}

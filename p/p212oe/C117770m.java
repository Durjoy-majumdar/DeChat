package p212oe;

import android.os.SystemClock;
import com.tencent.matrix.batterycanary.monitor.feature.C114467i;
import com.tencent.p014mm.sdk.platformtools.Log;
import p933be.C113173i;

/* renamed from: oe.m */
public class C117770m {

    /* renamed from: a */
    public final String f352207a;

    /* renamed from: b */
    public final C113173i f352208b = C117750b.m166047e();

    /* renamed from: c */
    public C114467i f352209c;

    public C117770m(String str) {
        this.f352207a = str;
    }

    /* renamed from: a */
    public void mo182518a() {
        if (this.f352208b != null) {
            C114467i iVar = this.f352209c;
            if (iVar == null) {
                Log.m105924i("MicroMsg.BusinessJiffiesMonitor", "finish, monitor is nul");
                return;
            }
            if (iVar instanceof C117776s) {
                long uptimeMillis = SystemClock.uptimeMillis();
                C117776s sVar = (C117776s) this.f352209c;
                long j = uptimeMillis - sVar.f343166o;
                if (j <= sVar.f343160i.getLong("extra_report_during", Math.max(C117750b.f352133l, 10000))) {
                    Log.m105924i("MicroMsg.BusinessJiffiesMonitor", "skip finish, duringMs = " + j);
                    return;
                }
            }
            this.f352208b.f338613h.f339059f.post(new m$$a(this));
        }
    }

    /* renamed from: b */
    public void mo182519b() {
        C113173i iVar = this.f352208b;
        if (iVar != null) {
            iVar.f338613h.f339059f.post(new m$$b(this));
        }
    }
}

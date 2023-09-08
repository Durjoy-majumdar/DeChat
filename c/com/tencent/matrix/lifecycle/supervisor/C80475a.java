package com.tencent.matrix.lifecycle.supervisor;

import android.app.Application;
import android.os.Process;
import com.tencent.matrix.lifecycle.C80406g;
import com.tencent.matrix.lifecycle.C80407h;
import gy3.C87412m;
import java.util.Map;
import p723vf.C118672d;
import p723vf.C90779e;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.a */
public final class C80475a implements C80407h, C80406g {

    /* renamed from: d */
    public final /* synthetic */ Map.Entry f235469d;

    /* renamed from: e */
    public final /* synthetic */ Application f235470e;

    public C80475a(Map.Entry entry, Application application) {
        this.f235469d = entry;
        this.f235470e = application;
    }

    public void off() {
        ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
        C118672d.m167351a(processSupervisor.mo111975b(), "attached " + ((String) this.f235469d.getKey()) + " turned OFF", new Object[0]);
        String str = processSupervisor.mo111975b() + '.' + ((String) this.f235469d.getKey());
        try {
            processSupervisor.getClass();
            C80478e eVar = ProcessSupervisor.f235416f;
            if (eVar != null) {
                Application application = this.f235470e;
                String str2 = (String) this.f235469d.getKey();
                C87412m.m108594g(application, "context");
                C87412m.m108594g(str2, "statefulName");
                int myPid = Process.myPid();
                String a = C90779e.m113846a(application);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(context)");
                eVar.mo112003JF(new ProcessToken(myPid, a, str2, false));
            }
        } catch (Throwable th) {
            C118672d.m167354d(str, th, "", new Object[0]);
        }
    }

    /* renamed from: on */
    public void mo60742on() {
        ProcessSupervisor processSupervisor = ProcessSupervisor.f235421k;
        C118672d.m167351a(processSupervisor.mo111975b(), "attached " + ((String) this.f235469d.getKey()) + " turned ON", new Object[0]);
        String str = processSupervisor.mo111975b() + '.' + ((String) this.f235469d.getKey());
        try {
            processSupervisor.getClass();
            C80478e eVar = ProcessSupervisor.f235416f;
            if (eVar != null) {
                Application application = this.f235470e;
                String str2 = (String) this.f235469d.getKey();
                C87412m.m108594g(application, "context");
                C87412m.m108594g(str2, "statefulName");
                int myPid = Process.myPid();
                String a = C90779e.m113846a(application);
                C87412m.m108593f(a, "MatrixUtil.getProcessName(context)");
                eVar.mo112003JF(new ProcessToken(myPid, a, str2, true));
            }
        } catch (Throwable th) {
            C118672d.m167354d(str, th, "", new Object[0]);
        }
    }

    public boolean serial() {
        return true;
    }
}

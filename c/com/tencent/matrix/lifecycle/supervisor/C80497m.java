package com.tencent.matrix.lifecycle.supervisor;

import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.tencent.matrix.lifecycle.C80407h;
import com.tencent.matrix.lifecycle.supervisor.SupervisorService;
import gy3.C87412m;
import p723vf.C118672d;
import p723vf.C90779e;
import rx3.C36570n;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.m */
public final class C80497m implements C80407h {

    /* renamed from: d */
    public final /* synthetic */ Context f235501d;

    public C80497m(Context context) {
        this.f235501d = context;
    }

    public void off() {
    }

    /* renamed from: on */
    public void mo60742on() {
        C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "pacemaker: call supervisor", new Object[0]);
        C80496l lVar = ProcessSupervisor.f235414d;
        C87412m.m108591d(lVar);
        if (lVar.f235499b) {
            SupervisorService.C80462a aVar = SupervisorService.f235443o;
            Context context = this.f235501d;
            C87412m.m108591d(context);
            aVar.mo111999a(context);
            return;
        }
        SupervisorPacemaker supervisorPacemaker = SupervisorPacemaker.f235439d;
        Context context2 = this.f235501d;
        supervisorPacemaker.getClass();
        Intent intent = new Intent("TELL_SUPERVISOR_FOREGROUND");
        intent.putExtra("KEY_PROCESS_NAME", C90779e.m113846a(context2));
        intent.putExtra("KEY_PROCESS_PID", Process.myPid());
        if (context2 != null) {
            context2.sendBroadcast(intent, (String) ((C36570n) SupervisorPacemaker.f235437b).getValue());
        }
    }
}

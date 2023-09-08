package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.supervisor.ProcessSupervisor;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.v */
public final class C80500v implements C80406g {
    public void off() {
        String a = C80415l.f235359c.mo111904a();
        C118672d.m167353c(a, "ON_APP_UI_EXIT_FOREGROUND scene: " + ProcessSupervisor.f235421k.mo111974a(), new Object[0]);
    }

    /* renamed from: on */
    public void mo60742on() {
        String a = C80415l.f235359c.mo111904a();
        C118672d.m167353c(a, "ON_APP_UI_ENTER_FOREGROUND scene: " + ProcessSupervisor.f235421k.mo111974a(), new Object[0]);
    }

    public boolean serial() {
        return true;
    }
}

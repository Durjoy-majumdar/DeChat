package com.tencent.matrix.lifecycle;

import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.t */
public final class C80498t implements C80406g {
    public void off() {
        C118672d.m167353c(C80415l.f235359c.mo111904a(), "ON_PROCESS_EXIT_STAGED_BACKGROUND", new Object[0]);
    }

    /* renamed from: on */
    public void mo60742on() {
        C118672d.m167353c(C80415l.f235359c.mo111904a(), "ON_PROCESS_ENTER_STAGED_BACKGROUND", new Object[0]);
    }

    public boolean serial() {
        return true;
    }
}

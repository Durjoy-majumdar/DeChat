package com.tencent.matrix.lifecycle;

import com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.r */
public final class C80453r implements C80406g {
    public void off() {
        String a = C80415l.f235359c.mo111904a();
        StringBuilder sb = new StringBuilder();
        sb.append("ON_PROCESS_UI_STOPPED scene: ");
        ProcessUILifecycleOwner.f235399x.getClass();
        sb.append(ProcessUILifecycleOwner.f235392q);
        C118672d.m167353c(a, sb.toString(), new Object[0]);
    }

    /* renamed from: on */
    public void mo60742on() {
        String a = C80415l.f235359c.mo111904a();
        StringBuilder sb = new StringBuilder();
        sb.append("ON_PROCESS_UI_STARTED scene: ");
        ProcessUILifecycleOwner.f235399x.getClass();
        sb.append(ProcessUILifecycleOwner.f235392q);
        C118672d.m167353c(a, sb.toString(), new Object[0]);
    }

    public boolean serial() {
        return true;
    }
}

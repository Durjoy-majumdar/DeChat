package com.tencent.matrix.lifecycle.supervisor;

import com.tencent.matrix.lifecycle.C80392a0;
import com.tencent.matrix.lifecycle.C80407h;
import fy3.C32224a;
import p723vf.C118672d;

/* renamed from: com.tencent.matrix.lifecycle.supervisor.k */
public final class C80494k implements C80407h {

    /* renamed from: d */
    public final /* synthetic */ C32224a f235496d;

    /* renamed from: com.tencent.matrix.lifecycle.supervisor.k$a */
    public static final class C80495a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C80494k f235497d;

        public C80495a(C80494k kVar) {
            this.f235497d = kVar;
        }

        public final void run() {
            C118672d.m167353c(ProcessSupervisor.f235421k.mo111975b(), "SubordinatePacemaker: callback when foreground", new Object[0]);
            this.f235497d.f235496d.invoke();
        }
    }

    public C80494k(C32224a aVar) {
        this.f235496d = aVar;
    }

    public void off() {
    }

    /* renamed from: on */
    public void mo60742on() {
        C80392a0.f235326f.mo111887a().post(new C80495a(this));
    }
}

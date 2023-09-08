package p1029rf;

import p1012ne.C88932a;
import p723vf.C118672d;

/* renamed from: rf.g */
public abstract class C89960g implements C88932a {

    /* renamed from: d */
    public volatile boolean f258529d = false;

    /* renamed from: a */
    public void mo112097a(boolean z) {
    }

    /* renamed from: f */
    public void mo112123f() {
        C118672d.m167353c("Matrix.Tracer", "[onAlive] %s", getClass().getName());
    }

    /* renamed from: g */
    public final synchronized void mo124296g() {
        if (this.f258529d) {
            this.f258529d = false;
            mo112124h();
        }
    }

    /* renamed from: h */
    public void mo112124h() {
        C118672d.m167353c("Matrix.Tracer", "[onDead] %s", getClass().getName());
    }

    /* renamed from: i */
    public final synchronized void mo124297i() {
        if (!this.f258529d) {
            this.f258529d = true;
            mo112123f();
        }
    }
}

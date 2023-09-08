package p1190de;

import com.tencent.matrix.batterycanary.monitor.feature.C114490k0;
import p1177ce.C113314g;
import p723vf.C118672d;

/* renamed from: de.a */
public abstract class C116608a implements C114490k0 {

    /* renamed from: a */
    public C113314g f349668a;

    /* renamed from: a */
    public void mo173597a(boolean z) {
        String g = mo111820g();
        C118672d.m167353c(g, "#onForeground, foreground = " + z, new Object[0]);
    }

    /* renamed from: b */
    public void mo111817b() {
        C118672d.m167353c(mo111820g(), "#onTurnOn", new Object[0]);
    }

    /* renamed from: c */
    public void mo173651c(long j) {
        String g = mo111820g();
        C118672d.m167353c(g, "#onBackgroundCheck, since background started millis = " + j, new Object[0]);
    }

    /* renamed from: e */
    public void mo173631e(C113314g gVar) {
        C118672d.m167353c(mo111820g(), "#configure", new Object[0]);
        this.f349668a = gVar;
    }

    /* renamed from: f */
    public void mo111819f() {
        C118672d.m167353c(mo111820g(), "#onTurnOff", new Object[0]);
    }

    /* renamed from: g */
    public abstract String mo111820g();

    /* renamed from: h */
    public boolean mo180590h() {
        C113314g gVar = this.f349668a;
        return gVar.f339057d.f339048s || (gVar.mo165879a().getApplicationInfo().flags & 2) != 0;
    }

    public String toString() {
        return mo111820g();
    }
}

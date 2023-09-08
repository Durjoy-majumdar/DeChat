package androidx.fragment.app;

import androidx.lifecycle.C103766u;
import androidx.lifecycle.C39623j;
import gy3.C8480h;
import p1094c4.C104290a;
import p1094c4.C104291b;
import p1094c4.C104292c;

/* renamed from: androidx.fragment.app.o0 */
public class C112947o0 implements C104292c {

    /* renamed from: d */
    public C103766u f338128d = null;

    /* renamed from: e */
    public C104291b f338129e = null;

    /* renamed from: a */
    public void mo165229a(C39623j.C39625b bVar) {
        this.f338128d.mo145135c(bVar);
    }

    /* renamed from: b */
    public void mo165230b() {
        if (this.f338128d == null) {
            this.f338128d = new C103766u(this);
            this.f338129e = new C104291b(this, (C8480h) null);
        }
    }

    public C39623j getLifecycle() {
        mo165230b();
        return this.f338128d;
    }

    public C104290a getSavedStateRegistry() {
        return this.f338129e.f308652b;
    }
}

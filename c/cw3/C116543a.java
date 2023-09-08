package cw3;

import java.util.concurrent.atomic.AtomicBoolean;
import vv3.C118701c;
import vv3.C118702d;

/* renamed from: cw3.a */
public abstract class C116543a extends C118701c implements C116546d {

    /* renamed from: e */
    public AtomicBoolean f349547e = new AtomicBoolean(false);

    public C116543a(C118702d dVar) {
        super(dVar);
    }

    /* renamed from: a */
    public void mo180525a(boolean z) {
        this.f349547e.set(z);
    }

    /* renamed from: c */
    public boolean mo165737c() {
        return false;
    }

    /* renamed from: f */
    public boolean mo180526f() {
        return this.f349547e.get();
    }
}

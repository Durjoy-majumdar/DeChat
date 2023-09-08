package j14;

import a14.C53942r0;

/* renamed from: j14.k */
public final class C60728k extends C60725h {

    /* renamed from: f */
    public final Runnable f172963f;

    public C60728k(Runnable runnable, long j, C60726i iVar) {
        super(j, iVar);
        this.f172963f = runnable;
    }

    public void run() {
        try {
            this.f172963f.run();
        } finally {
            this.f172961e.mo85663a();
        }
    }

    public String toString() {
        return "Task[" + this.f172963f.getClass().getSimpleName() + '@' + C53942r0.m60572a(this.f172963f) + ", " + this.f172960d + ", " + this.f172961e + ']';
    }
}

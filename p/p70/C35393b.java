package p70;

import lu3.C109426i;

/* renamed from: p70.b */
public final class C35393b implements C109426i {

    /* renamed from: d */
    public final /* synthetic */ Runnable f94750d;

    public C35393b(Runnable runnable) {
        this.f94750d = runnable;
    }

    public String getKey() {
        return this.f94750d.getClass().getName();
    }

    public boolean isLogging() {
        return false;
    }

    public void run() {
        this.f94750d.run();
    }
}

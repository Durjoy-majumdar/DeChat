package b51;

import t41.C48536a;

/* renamed from: b51.d */
public final class C39729d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C48536a f106597d;

    public C39729d(C48536a aVar) {
        this.f106597d = aVar;
    }

    public final void run() {
        int max = Math.max(this.f106597d.f129815b.getWidth(), this.f106597d.f129814a.getWidth());
        this.f106597d.f129815b.setWidth(max);
        this.f106597d.f129814a.setWidth(max);
    }
}

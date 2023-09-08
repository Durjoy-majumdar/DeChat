package p1209q4;

import p1014o4.C117693m;
import p1221x4.C118847o;

/* renamed from: q4.a */
public class C118166a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118847o f353198d;

    /* renamed from: e */
    public final /* synthetic */ C118167b f353199e;

    public C118166a(C118167b bVar, C118847o oVar) {
        this.f353199e = bVar;
        this.f353198d = oVar;
    }

    public void run() {
        C117693m.m165966c().mo182389a(C118167b.f353200d, String.format("Scheduling work %s", new Object[]{this.f353198d.f355541a}), new Throwable[0]);
        this.f353199e.f353201a.mo182732c(this.f353198d);
    }
}

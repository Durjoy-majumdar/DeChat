package sx2;

import dd0.C116607d;

/* renamed from: sx2.x */
public class C118346x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f353697d;

    /* renamed from: e */
    public final /* synthetic */ C118339u f353698e;

    public C118346x(C118339u uVar, String str) {
        this.f353698e = uVar;
        this.f353697d = str;
    }

    public void run() {
        synchronized (this.f353698e.f353679a) {
            for (C116607d U0 : this.f353698e.f353679a) {
                U0.mo176200U0(this.f353697d);
            }
        }
    }
}

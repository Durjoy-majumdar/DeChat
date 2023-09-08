package j81;

import java.util.HashMap;
import q81.C35815a;
import u24.C90599h;
import v81.C118667b;

/* renamed from: j81.c */
public class C117307c implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C118667b f351188d;

    /* renamed from: e */
    public final /* synthetic */ C117302a f351189e;

    public C117307c(C117302a aVar, C118667b bVar) {
        this.f351189e = aVar;
        this.f351188d = bVar;
    }

    public void run() {
        C118667b bVar = this.f351188d;
        if (bVar.f355086g == 0) {
            C35815a aVar = this.f351189e.f351177j;
            String str = bVar.f355080a;
            if (C90599h.m113511d(str)) {
                aVar.getClass();
                return;
            }
            synchronized (aVar.f95626a) {
                ((HashMap) aVar.f95626a).remove(str);
                aVar.mo60427a();
            }
        }
    }
}

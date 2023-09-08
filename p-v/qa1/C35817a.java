package qa1;

import java.util.Iterator;

/* renamed from: qa1.a */
public class C35817a implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C35818b f95629d;

    public C35817a(C35818b bVar) {
        this.f95629d = bVar;
    }

    public void run() {
        Iterator<C35819c> it = this.f95629d.f95631a.iterator();
        while (it.hasNext()) {
            it.next().mo60432a();
        }
    }
}

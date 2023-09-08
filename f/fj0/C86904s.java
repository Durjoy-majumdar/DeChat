package fj0;

import cj0.C80039a;
import n34.C117604b;

/* renamed from: fj0.s */
public class C86904s implements C117604b<Throwable> {
    public C86904s(C86898q qVar) {
    }

    public void call(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null || th.getMessage() == null) {
            int i = C86898q.f252215h;
            C80039a.m97316a("q", "action send fail");
            return;
        }
        int i2 = C86898q.f252215h;
        C80039a.m97316a("q", "action send fail:" + th.getMessage());
    }
}

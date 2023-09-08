package vs0;

import vs0.C90866a;
import ys0.C91578a;
import ys0.C91579b;
import ys0.C91583f;

/* renamed from: vs0.c */
public class C90871c extends C90869b {
    /* renamed from: b */
    public C90866a.C90868b mo124965b(C91578a aVar) {
        String c = aVar.mo125461c("Sec-WebSocket-Version");
        int i = -1;
        if (c.length() > 0) {
            try {
                i = new Integer(c.trim()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return i == 13 ? C90866a.C90868b.MATCHED : C90866a.C90868b.NOT_MATCHED;
    }

    /* renamed from: c */
    public C90866a mo124966c() {
        return new C90871c();
    }

    /* renamed from: h */
    public C91579b mo124971h(C91579b bVar) {
        super.mo124971h(bVar);
        ((C91583f) bVar).mo125463g("Sec-WebSocket-Version", "13");
        return bVar;
    }
}

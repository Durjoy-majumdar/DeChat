package vq1;

import eb0.C31543z5;
import gy3.C87412m;
import vq1.C65866w;
import vq1.C65869y;

/* renamed from: vq1.i */
public abstract class C14961i {

    /* renamed from: a */
    public int f41017a;

    /* renamed from: b */
    public long f41018b = C31543z5.m39451a();

    public C14961i(C65866w.C14969b bVar) {
    }

    /* renamed from: a */
    public void mo14007a(C65869y.C65870a aVar) {
        C87412m.m108594g(aVar, "callback");
        this.f41017a++;
    }

    /* renamed from: b */
    public final boolean mo14011b() {
        return this.f41017a < 2 && C31543z5.m39451a() - this.f41018b <= ((long) 1200000);
    }

    /* renamed from: c */
    public abstract String mo14008c();
}

package ea1;

import com.tencent.p014mm.autogen.mmdata.rpt.U0CgiCConfigResultStruct;
import com.tencent.p014mm.plugin.report.service.C115669n;
import gy3.C8480h;

/* renamed from: ea1.i */
public final class C58534i {

    /* renamed from: ea1.i$a */
    public static final class C58535a {
        public C58535a(C8480h hVar) {
        }
    }

    static {
        new C58535a((C8480h) null);
    }

    /* renamed from: a */
    public static final void m67952a(long j, int i) {
        U0CgiCConfigResultStruct u0CgiCConfigResultStruct = new U0CgiCConfigResultStruct();
        u0CgiCConfigResultStruct.f156863d = (int) j;
        u0CgiCConfigResultStruct.f156864e = i;
        u0CgiCConfigResultStruct.mo86054n();
    }

    /* renamed from: b */
    public static final void m67953b(long j) {
        C115669n.INSTANCE.idkeyStat(932, j, 1, false);
    }
}

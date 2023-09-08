package ue1;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;
import z04.C112550d0;
import zt3.C119157j;

/* renamed from: ue1.e */
public final class C65326e {

    /* renamed from: a */
    public final String f188005a;

    /* renamed from: b */
    public final String f188006b;

    /* renamed from: c */
    public final long f188007c;

    /* renamed from: d */
    public final String f188008d;

    /* renamed from: e */
    public final long f188009e;

    /* renamed from: ue1.e$a */
    public static final class C65327a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C65326e f188010d;

        public C65327a(C65326e eVar) {
            this.f188010d = eVar;
        }

        public final void run() {
            Log.m105918d("FinderConvReporter", this.f188010d.toString());
            C115669n nVar = C115669n.INSTANCE;
            C65326e eVar = this.f188010d;
            C65326e eVar2 = this.f188010d;
            nVar.mo160131h(23049, eVar.f188005a, eVar.f188006b, Long.valueOf(eVar.f188007c), eVar2.f188008d, Long.valueOf(eVar2.f188009e));
        }
    }

    public C65326e(String str, String str2, long j, String str3, long j2) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        C87412m.m108594g(str2, "sql");
        C87412m.m108594g(str3, "currentThread");
        this.f188005a = str;
        this.f188006b = str2;
        this.f188007c = j;
        this.f188008d = str3;
        this.f188009e = j2;
    }

    /* renamed from: a */
    public final void mo89421a() {
        if (this.f188007c >= 16 || C112550d0.m153801u(this.f188005a, "reportSize", true) || C112550d0.m153801u(this.f188005a, "enterFinderConversationPage", true)) {
            ((C119157j) C119157j.f356862d).mo183870a(new C65327a(this));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C65326e)) {
            return false;
        }
        C65326e eVar = (C65326e) obj;
        return C87412m.m108589b(this.f188005a, eVar.f188005a) && C87412m.m108589b(this.f188006b, eVar.f188006b) && this.f188007c == eVar.f188007c && C87412m.m108589b(this.f188008d, eVar.f188008d) && this.f188009e == eVar.f188009e;
    }

    public int hashCode() {
        long j = this.f188007c;
        long j2 = this.f188009e;
        return (((((((this.f188005a.hashCode() * 31) + this.f188006b.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + this.f188008d.hashCode()) * 31) + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "source:" + this.f188005a + ", sql:" + this.f188006b + ", duration:" + this.f188007c + ", currentThread:" + this.f188008d + ", tableSize:" + this.f188009e;
    }
}

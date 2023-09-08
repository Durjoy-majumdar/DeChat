package la3;

import ad0.C0033t;
import com.google.android.gms.measurement.AppMeasurement;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: la3.l */
public class C117470l {

    /* renamed from: la3.l$a */
    public static class C117471a {

        /* renamed from: a */
        public String f351555a;

        /* renamed from: b */
        public String f351556b;

        /* renamed from: c */
        public int f351557c;

        /* renamed from: d */
        public long f351558d;

        /* renamed from: e */
        public boolean f351559e;
    }

    /* renamed from: a */
    public static void m165698a(String str, int i, boolean z) {
        C117471a aVar = new C117471a();
        aVar.f351555a = str;
        aVar.f351557c = i;
        aVar.f351558d = System.currentTimeMillis();
        aVar.f351556b = C117468g.f351552c.mo182173b(str).field_expId;
        aVar.f351559e = z;
        m165699b(aVar);
    }

    /* renamed from: b */
    public static void m165699b(C117471a aVar) {
        if (aVar != null) {
            C0033t tVar = new C0033t();
            tVar.mo32a("expid", aVar.f351556b + ",");
            tVar.mo32a("appid", aVar.f351555a + ",");
            tVar.mo32a("action", aVar.f351557c + ",");
            tVar.mo32a(AppMeasurement.Param.TIMESTAMP, aVar.f351558d + ",");
            tVar.mo32a("hasRedPoint", (aVar.f351559e ? 1 : 0) + ",");
            Log.m105924i("WelabReporter", "report " + tVar.mo34c());
            C115669n.INSTANCE.mo160131h(14206, tVar);
        }
    }
}

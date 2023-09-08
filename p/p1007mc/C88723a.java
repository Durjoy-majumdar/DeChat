package p1007mc;

import com.tencent.p014mm.sdk.platformtools.Log;
import gy3.C87412m;

/* renamed from: mc.a */
public final class C88723a {

    /* renamed from: a */
    public static C88724a f256079a = new C88724a();

    /* renamed from: mc.a$a */
    public static class C88724a {
        /* renamed from: a */
        public void mo113338a(C88725b bVar) {
            C87412m.m108594g(bVar, "report");
            Log.m105924i("Luggage.SkylineCrashReportLogic", "report:" + bVar);
        }
    }

    /* renamed from: mc.a$b */
    public static class C88725b {

        /* renamed from: a */
        public final String f256080a;

        /* renamed from: b */
        public final String f256081b;

        /* renamed from: c */
        public final String f256082c;

        /* renamed from: d */
        public final String f256083d;

        /* renamed from: e */
        public final String f256084e;

        /* renamed from: f */
        public final String f256085f;

        /* renamed from: g */
        public final int f256086g;

        public C88725b(String str, String str2, String str3, String str4, String str5, String str6, int i) {
            C87412m.m108594g(str, "deviceParameters");
            C87412m.m108594g(str2, "customParameters");
            C87412m.m108594g(str3, "applicationParameters");
            C87412m.m108594g(str4, "dateTime");
            C87412m.m108594g(str5, "context");
            C87412m.m108594g(str6, "crashContent");
            this.f256080a = str;
            this.f256081b = str2;
            this.f256082c = str3;
            this.f256083d = str4;
            this.f256084e = str5;
            this.f256085f = str6;
            this.f256086g = i;
        }

        public String toString() {
            return "Report(deviceParameters='" + this.f256080a + "', customParameters='" + this.f256081b + "', applicationParameters='" + this.f256082c + "', dateTime='" + this.f256083d + "', context='" + this.f256084e + "', crashContent='" + this.f256085f + "', killSelf=" + this.f256086g + ')';
        }
    }
}

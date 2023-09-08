package hi2;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashSet;
import java.util.Set;

/* renamed from: hi2.g */
public final class C32929g implements Runnable {

    /* renamed from: d */
    public static final C32929g f89504d = new C32929g();

    public final void run() {
        Class cls = C32735h.class;
        C32927f fVar = C32927f.f89501a;
        long decodeLong = fVar.mo58868b().decodeLong("MediaReportTimeMs", -1);
        int Qe = ((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_media_clean_interval_day, 1);
        boolean z = System.currentTimeMillis() - decodeLong > ((long) Qe) * 86400000;
        Log.m105924i("MicroMsg.MediaFileReporter", "triggerDailyReport config:" + Qe + " enable:" + z);
        if (z && ((C32735h) C86312j.m106911c(cls)).mo58784wf(C32735h.C32737c.clicfg_media_clean_report_enale, true)) {
            fVar.mo58868b().encode("MediaReportTimeMs", System.currentTimeMillis());
            Set<String> decodeStringSet = fVar.mo58868b().decodeStringSet("MicroMsg.MediaFileReporter", new HashSet());
            C87412m.m108593f(decodeStringSet, "mmkv.decodeStringSet(TAG, HashSet<String>())");
            for (String m1Var : decodeStringSet) {
                C86009m1[] u = new C86009m1(m1Var).mo119984u();
                if (u != null) {
                    for (C86009m1 i : u) {
                        C32927f fVar2 = C32927f.f89501a;
                        String i2 = i.mo119971i();
                        C87412m.m108593f(i2, "it.absolutePath");
                        fVar2.mo58867a(i2, 1);
                    }
                }
            }
        }
    }
}

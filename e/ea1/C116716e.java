package ea1;

import ba1.C113152d;
import com.tencent.p014mm.plugin.expt.hellhound.ext.session.report.HellCommonReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import e91.C116711b;
import f91.C116850b;
import j81.C117302a;
import j81.C87906e;
import t81.C118408h;
import t81.C118412l;
import u24.C90599h;

/* renamed from: ea1.e */
public final class C116716e {
    /* renamed from: a */
    public static void m164607a(String str) {
        String str2;
        int i = C116711b.m164584i();
        if (i == 0) {
            str2 = "-1";
        } else {
            str2 = C116850b.m164833c("mmkv_key_hellSenPageMegRptChe_" + i);
            if (str2 == null || str2.isEmpty()) {
                str2 = null;
            }
        }
        String a = C113152d.m154820a(str2);
        if (a != null && !a.isEmpty()) {
            if (str == null || str.isEmpty()) {
                str = a;
            } else {
                str = a + "|" + str;
            }
        }
        if (str != null && !str.isEmpty()) {
            Log.m105925i("HABBYGE-MALI.HellSessionPageMergeReport", "FuzzyMergeReport, reportSessionPageMerge: %s", str);
            HellCommonReportStruct.m117909s(17647, str, 5120);
            C118412l lVar = C117302a.xx0().f351171d;
            lVar.getClass();
            if (C87906e.m109416j()) {
                if (C90599h.m113511d(str)) {
                    Log.m105920e("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageSingle data or sessionPageID isEmpty!");
                } else {
                    C87906e.m109407a("EdgeComputingDataSourceService", "[EdgeComputingDataSourceService] sendSessionPageMerge data : " + str);
                    lVar.f353895b.post(new C118408h(lVar, System.currentTimeMillis(), str));
                }
            }
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        int i2 = C116711b.m164584i();
        if (i2 != 0) {
            if (valueOf == null) {
                valueOf = "";
            }
            try {
                C116850b.m164835e("mmkv_key_hellSenPageMegRptChe_" + i2, valueOf);
            } catch (Exception e) {
                Log.printErrStackTrace("HABBYGE-MALI.HellSessionReportCache", e, "HellSessionReportCache.writeBackOfMerge", new Object[0]);
            }
        }
    }
}

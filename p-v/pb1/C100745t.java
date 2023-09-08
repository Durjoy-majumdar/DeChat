package pb1;

import com.tencent.p014mm.autogen.mmdata.rpt.FavAddQualityStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FavSyncQualityStruct;
import com.tencent.p014mm.autogen.mmdata.rpt.FavUploadFailReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import di3.C86312j;
import h81.C32735h;
import java.util.HashSet;
import p823sg.C90193h;

/* renamed from: pb1.t */
public class C100745t {

    /* renamed from: a */
    public static final HashSet<String> f295154a = new HashSet<>();

    /* renamed from: b */
    public static final boolean f295155b = ((C32735h) C86312j.m106911c(C32735h.class)).mo58784wf(C32735h.C32738b.clicfg_fav_quality_report_open, true);

    /* renamed from: a */
    public static boolean m131889a(String str) {
        if (XmlParser.parseXml(str, "favitem", (String) null) != null) {
            return true;
        }
        Log.m105920e("MicroMsg.FavApiUtil", "[checkXmlIllegal] maps = null, xml parse error");
        return false;
    }

    /* renamed from: b */
    public static void m131890b() {
        if (!f295155b) {
            Log.m105924i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] needToReport = false, break flow");
            return;
        }
        C100698b0 b0Var = C100698b0.f295038a;
        long d = b0Var.mo140128d(1);
        FavAddQualityStruct b = b0Var.mo140126b();
        if (b == null) {
            Log.m105924i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] session = " + d + ", struct un find and return");
            return;
        }
        b.mo86054n();
        b0Var.mo140131g(1);
        Log.m105924i("MicroMsg.FavApiUtil", "[endFavAddReportEnv] session = " + d + ", finish report");
    }

    /* renamed from: c */
    public static void m131891c() {
        if (!f295155b) {
            Log.m105924i("MicroMsg.FavApiUtil", "[endSyncReportEnv] needToReport == false, return");
            return;
        }
        C100698b0 b0Var = C100698b0.f295038a;
        long d = b0Var.mo140128d(2);
        FavSyncQualityStruct e = b0Var.mo140129e();
        if (e == null || d == -4369) {
            Log.m105924i("MicroMsg.FavApiUtil", "[endSyncReportEnv] struct == null, session = " + d + ", return");
        }
        int i = e.f265540d;
        b0Var.mo140131g(2);
        e.mo86054n();
        Log.m105924i("MicroMsg.FavApiUtil", "[endSyncReportEnv] scene = " + i + ", session = " + d + ", finish report");
    }

    /* renamed from: d */
    public static String m131892d(String str, int i) {
        return C90193h.m112878f((str + i + System.currentTimeMillis()).getBytes());
    }

    /* renamed from: e */
    public static void m131893e(long j, int i, int i2, boolean z, int i3) {
        C100698b0 b0Var = C100698b0.f295038a;
        Long l = C100698b0.f295043f.get(Long.valueOf(j));
        long longValue = l == null ? -4369 : l.longValue();
        if (longValue == -4369) {
            Log.m105920e("MicroMsg.FavApiUtil", "[reportFavAddQuality] session un find, localId = " + j);
            return;
        }
        FavAddQualityStruct a = b0Var.mo140125a(longValue);
        a.f265514t = i3;
        if (z) {
            a.f265515u = 0;
            return;
        }
        a.f265515u = -1;
        a.f265516v = i;
        a.f265517w = i2;
    }

    /* renamed from: f */
    public static void m131894f(int i, int i2, String str) {
        if (f295154a.add(i + "_" + i2 + "_" + str)) {
            FavUploadFailReportStruct favUploadFailReportStruct = new FavUploadFailReportStruct();
            if (i2 < 0) {
                favUploadFailReportStruct.f265557d = (long) (-i2);
            } else {
                favUploadFailReportStruct.f265557d = (long) i2;
            }
            favUploadFailReportStruct.f265558e = favUploadFailReportStruct.mo86045b("ErrorMsg", Util.nullAs(str, ""), true);
            favUploadFailReportStruct.f265561h = 2;
            favUploadFailReportStruct.f265560g = (long) i;
            favUploadFailReportStruct.mo86054n();
            favUploadFailReportStruct.mo86056r();
        }
    }
}

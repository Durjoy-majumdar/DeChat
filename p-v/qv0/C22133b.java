package qv0;

import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.BackUpMigrationOneReportStruct;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.util.WXWebReporter;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: qv0.b */
public final class C22133b {

    /* renamed from: a */
    public static final C22133b f62617a = new C22133b();

    /* renamed from: b */
    public static void m25607b(C22133b bVar, int i, int i2, String str, Long l, Long l2, Integer num, Long l3, Long l4, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = null;
        }
        if ((i3 & 8) != 0) {
            l = null;
        }
        if ((i3 & 16) != 0) {
            l2 = null;
        }
        if ((i3 & 32) != 0) {
            num = null;
        }
        if ((i3 & 64) != 0) {
            l3 = null;
        }
        if ((i3 & 128) != 0) {
            l4 = null;
        }
        bVar.getClass();
        BackUpMigrationOneReportStruct backUpMigrationOneReportStruct = new BackUpMigrationOneReportStruct();
        backUpMigrationOneReportStruct.f48180d = i;
        backUpMigrationOneReportStruct.f48181e = i2;
        backUpMigrationOneReportStruct.f48182f = num != null ? num.intValue() : 0;
        long j = 0;
        backUpMigrationOneReportStruct.f48183g = l != null ? l.longValue() : 0;
        if (str == null) {
            str = "";
        }
        backUpMigrationOneReportStruct.f48185i = backUpMigrationOneReportStruct.mo86045b("SessionID", str, true);
        backUpMigrationOneReportStruct.f48184h = l2 != null ? l2.longValue() : 0;
        backUpMigrationOneReportStruct.f48186j = l3 != null ? l3.longValue() : 0;
        if (l4 != null) {
            j = l4.longValue();
        }
        backUpMigrationOneReportStruct.f48187k = j;
        backUpMigrationOneReportStruct.mo86054n();
        String q = backUpMigrationOneReportStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("MicroMsg.BackUpReportHelper", "report%s %s", 26824, C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    /* renamed from: a */
    public final void mo35248a(int i, int i2, String str) {
        m25607b(this, i, i2, str, (Long) null, (Long) null, (Integer) null, (Long) null, (Long) null, WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
    }
}

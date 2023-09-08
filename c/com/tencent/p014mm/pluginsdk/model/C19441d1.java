package com.tencent.p014mm.pluginsdk.model;

import android.content.Context;
import com.tencent.midas.comm.log.util.APLogFileUtil;
import com.tencent.p014mm.autogen.mmdata.rpt.XFilesActionNewStruct;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C19568o0;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import gy3.C87412m;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.model.d1 */
public final class C19441d1 {
    /* renamed from: a */
    public static final void m20769a(String str, String str2, String str3, long j, int i) {
        long j2 = C19444f1.m20777q(MMApplicationContext.getContext()) ? 1 : 2;
        XFilesActionNewStruct xFilesActionNewStruct = new XFilesActionNewStruct();
        xFilesActionNewStruct.f48687g = j;
        xFilesActionNewStruct.f48684d = xFilesActionNewStruct.mo86045b("ContextId", str, true);
        if (str2 == null) {
            str2 = "";
        }
        xFilesActionNewStruct.f48686f = xFilesActionNewStruct.mo86045b("FileFormat", str2, true);
        if (str3 == null) {
            str3 = "";
        }
        xFilesActionNewStruct.f48685e = xFilesActionNewStruct.mo86045b("FileId", str3, true);
        xFilesActionNewStruct.f48688h = j2;
        xFilesActionNewStruct.f48689i = (long) i;
        xFilesActionNewStruct.mo86054n();
        String q = xFilesActionNewStruct.mo1006q();
        C87412m.m108593f(q, "struct.toShowString()");
        Log.m105925i("QQBrowseEntranceReporterReporter", "report%s %s", Integer.valueOf(WXWebReporter.WXWEB_KV_FR_ACTION), C112551y.m153814n(q, APLogFileUtil.SEPARATOR_LINE, " ", false));
    }

    /* renamed from: b */
    public static final void m20770b(String str, String str2, String str3, long j, Context context) {
        C87412m.m108594g(context, "context");
        m20769a(str, str2, str3, j, context instanceof C19568o0 ? ((C19568o0) context).mo25335P6().mo37002a() : 0);
    }
}

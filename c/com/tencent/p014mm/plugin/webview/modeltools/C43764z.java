package com.tencent.p014mm.plugin.webview.modeltools;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.wx_extension.C40324j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import ob0.C47350c;
import org.json.JSONObject;
import q20.C89449a;
import qc0.C101100c;
import qc0.C47800k;
import te3.C51361t90;
import te3.C51511u90;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.z */
public class C43764z {

    /* renamed from: com.tencent.mm.plugin.webview.modeltools.z$a */
    public class C43765a implements C40324j.C40326a {
        /* renamed from: a */
        public void mo288a(int i, int i2, String str, C47350c cVar) {
            Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "doReport callback errType:%d errCode:%d msg:%s", Integer.valueOf(i), Integer.valueOf(i2), str);
        }
    }

    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.modeltools.z$b */
    public static class C43766b implements C80883e<IPCString, IPCString> {
        private C43766b() {
        }

        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            if (iPCString != null && !Util.isNullOrNil(iPCString.f10315d)) {
                C47800k kVar = new C47800k();
                try {
                    JSONObject jSONObject = new JSONObject(iPCString.f10315d);
                    kVar.f128354a = jSONObject.optString("current_musicid", "");
                    kVar.f128355b = jSONObject.optString("report_list", "");
                } catch (Exception e) {
                    Log.m105929w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e.getMessage());
                }
                MMHandlerThread.postToMainThread(new C101100c(kVar));
            }
        }
    }

    /* renamed from: a */
    public static int m47614a(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "doReport invalid reportData %s", str);
            return -1;
        }
        C47350c.C47352b bVar = new C47350c.C47352b();
        bVar.f127066a = new C51361t90();
        bVar.f127067b = new C51511u90();
        bVar.f127068c = "/cgi-bin/mmbiz-bin/exitreport";
        bVar.f127069d = 1642;
        C47350c a = bVar.mo72403a();
        ((C51361t90) a.f127055a.f127080a).f142051d = str;
        ((C40324j) C86312j.m106911c(C40324j.class)).mo63014eH(a, new C43765a());
        return 0;
    }

    /* renamed from: b */
    public static void m47615b(String str) {
        if (Util.isNullOrNil(str)) {
            Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "doReportMusic invalid reportData %s", str);
            return;
        }
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, new IPCString(str), C43766b.class, (C1256g) null);
    }
}

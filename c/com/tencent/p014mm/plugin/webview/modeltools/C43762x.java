package com.tencent.p014mm.plugin.webview.modeltools;

import ba3.C39750a;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import org.json.JSONObject;
import u24.C90598g;

/* renamed from: com.tencent.mm.plugin.webview.modeltools.x */
public class C43762x implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f118262d;

    public C43762x(C43763y yVar, String str) {
        this.f118262d = str;
    }

    public void run() {
        String str;
        String str2;
        Exception e;
        try {
            String str3 = this.f118262d;
            JSONObject jSONObject = new JSONObject(C90598g.m113505d(str3.substring(1, str3.length() - 1)));
            str2 = jSONObject.optString("data", "");
            try {
                str = jSONObject.optString("music_data", "");
            } catch (Exception e2) {
                str = "";
                e = e2;
                Log.m105929w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e.getMessage());
                C43764z.m47614a(str2);
                C43764z.m47615b(str);
                Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", Integer.valueOf(this.f118262d.length()));
            }
            try {
                C39750a aVar = C39750a.f106644a;
                if (aVar.mo62385a()) {
                    try {
                        String optString = jSONObject.optString("native_data", "");
                        if (Util.isNullOrNil(optString)) {
                            Log.m105924i("MicroMsg.MPVideoPreviewDataMgr", "reportOnLeaveForMP native_data null");
                        } else {
                            aVar.mo62387c(optString);
                        }
                    } catch (Exception e3) {
                        Log.m105925i("MicroMsg.MPVideoPreviewDataMgr", "reportOnLeave, ex = %s", e3.getMessage());
                    }
                }
            } catch (Exception e4) {
                e = e4;
                Log.m105929w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e.getMessage());
                C43764z.m47614a(str2);
                C43764z.m47615b(str);
                Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", Integer.valueOf(this.f118262d.length()));
            }
        } catch (Exception e5) {
            str = "";
            e = e5;
            str2 = str;
            Log.m105929w("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave, ex = %s", e.getMessage());
            C43764z.m47614a(str2);
            C43764z.m47615b(str);
            Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", Integer.valueOf(this.f118262d.length()));
        }
        C43764z.m47614a(str2);
        C43764z.m47615b(str);
        Log.m105925i("MicroMsg.WebViewReportOnLeaveHelper", "reportOnLeave reportData size=%d", Integer.valueOf(this.f118262d.length()));
    }
}

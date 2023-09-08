package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.webview.model.C43704h2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.qqvideo.proxy.api.IUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.q0 */
public class C44131q0 extends C43830a implements IUtils {
    public C44131q0(WebViewUI webViewUI) {
        super(webViewUI);
    }

    public void httpproxyReport(String... strArr) {
        C43704h2 h2Var = mo68388b().f118459E1;
        if (h2Var.f118128k == null) {
            h2Var.f118128k = new C43704h2.C43713j();
        }
        C43704h2.C43713j jVar = h2Var.f118128k;
        jVar.getClass();
        if (!(strArr == null || strArr.length == 0)) {
            List<String> list = jVar.f118156a;
            if (list == null) {
                jVar.f118156a = new ArrayList();
            } else {
                ((ArrayList) list).clear();
            }
            for (int i = 0; i < strArr.length; i++) {
                Log.m105925i("MicroMsg.WebviewReporter", "WebViewVideoProxyReporter report info = %s", strArr[i]);
                ((ArrayList) jVar.f118156a).add(strArr[i]);
            }
        }
        C43704h2 h2Var2 = mo68388b().f118459E1;
        if (h2Var2.f118128k == null) {
            h2Var2.f118128k = new C43704h2.C43713j();
        }
        C43704h2.C43713j jVar2 = h2Var2.f118128k;
        List<String> list2 = jVar2.f118156a;
        if (list2 != null && ((ArrayList) list2).size() != 0) {
            C115669n.INSTANCE.mo160137l(12033, jVar2.f118156a);
            ((ArrayList) jVar2.f118156a).clear();
        }
    }

    public void idKeyReport(String str, String str2, String str3) {
        Log.m105925i("MicroMsg.WebViewUI.UtilsImpl", "idkey report, id = %s, key = %s, value = %s", str, str2, str3);
        if (!Util.isNullOrNil(str) && !Util.isNullOrNil(str2) && !Util.isNullOrNil(str3)) {
            C115669n.INSTANCE.idkeyStat((long) Util.getInt(str, 0), (long) Util.getInt(str2, 0), (long) Util.getInt(str3, 0), false);
        }
    }

    public void javaUtilLog(int i, String str, String str2) {
        if (i == 2) {
            Log.m105926v(str, str2);
        } else if (i == 3) {
            Log.m105918d(str, str2);
        } else if (i == 4) {
            Log.m105924i(str, str2);
        } else if (i == 5) {
            Log.m105928w(str, str2);
        } else if (i == 6) {
            Log.m105920e(str, str2);
        }
    }

    public void kvReport(String... strArr) {
        C43704h2 h2Var = mo68388b().f118459E1;
        if (h2Var.f118129l == null) {
            h2Var.f118129l = new C43704h2.C43712i();
        }
        C43704h2.C43712i iVar = h2Var.f118129l;
        iVar.getClass();
        if (!(strArr == null || strArr.length == 0)) {
            List<String> list = iVar.f118155a;
            if (list == null) {
                iVar.f118155a = new ArrayList();
            } else {
                ((ArrayList) list).clear();
            }
            for (int i = 0; i < strArr.length; i++) {
                Log.m105925i("MicroMsg.WebviewReporter", "WebViewVideoDownloadReporter report info = %s", strArr[i]);
                ((ArrayList) iVar.f118155a).add(strArr[i]);
            }
        }
        C43704h2 h2Var2 = mo68388b().f118459E1;
        if (h2Var2.f118129l == null) {
            h2Var2.f118129l = new C43704h2.C43712i();
        }
        C43704h2.C43712i iVar2 = h2Var2.f118129l;
        List<String> list2 = iVar2.f118155a;
        if (list2 != null && ((ArrayList) list2).size() != 0) {
            C115669n.INSTANCE.mo160137l(12666, iVar2.f118155a);
            ((ArrayList) iVar2.f118155a).clear();
        }
    }
}

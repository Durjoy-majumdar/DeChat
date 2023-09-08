package com.tencent.p014mm.pluginsdk.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.XWebSdk;
import di3.C86312j;
import h81.C32735h;

/* renamed from: com.tencent.mm.pluginsdk.model.n1 */
public class C44594n1 {

    /* renamed from: a */
    public static int f120906a = -1;

    /* renamed from: b */
    public static int f120907b = -1;

    /* renamed from: c */
    public static int f120908c = -1;

    /* renamed from: a */
    public static boolean m49045a() {
        if (f120908c < 0) {
            f120908c = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_game_webview_in_mm, 0);
        }
        return f120908c == 1 && m49047c() == 0;
    }

    /* renamed from: b */
    public static boolean m49046b() {
        return m49047c() == 0;
    }

    /* renamed from: c */
    public static int m49047c() {
        if (f120906a >= 0) {
            Log.m105924i("XWeb.MM.WebViewKernelTestSwitcher", "webViewProgressMode, value:" + f120906a + " (0-mm/1-tools)");
            return f120906a;
        }
        XWebSdk.WebViewModeForMM webViewModeCommandForMM = XWebSdk.getWebViewModeCommandForMM();
        Log.m105924i("XWeb.MM.WebViewKernelTestSwitcher", "webViewProgressMode, webviewMode:" + webViewModeCommandForMM);
        if (webViewModeCommandForMM == XWebSdk.WebViewModeForMM.NOT_IN_MM) {
            f120906a = 1;
            return 1;
        }
        f120906a = 0;
        return 0;
    }
}

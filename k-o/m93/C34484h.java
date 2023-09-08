package m93;

import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import java.util.HashSet;
import sx3.C110826x0;
import z04.C112550d0;

/* renamed from: m93.h */
public final class C34484h {

    /* renamed from: a */
    public static final HashSet<String> f92807a;

    /* renamed from: b */
    public static boolean f92808b;

    /* renamed from: c */
    public static final HashSet<String> f92809c;

    static {
        Class cls = C32735h.class;
        C34484h hVar = new C34484h();
        HashSet<String> b = C110826x0.m151014b("com.tencent.mtt", "com.tencent.mtt.x86", "com.tencent.mtt.qbx", "com.tencent.qbx5", "com.ucmobile", "com.ucmobile.lite", "com.android.chrome", "com.baidu.browser.apps", "com.baidu.searchbox", "com.baidu.searchbox.lite", "com.ijinshan.browser_fast", "com.qihoo.browser", "com.qihoo.contents", "org.mozilla.firefox", "sogou.mobile.explorer");
        f92807a = b;
        HashSet<String> hashSet = new HashSet<>();
        f92809c = hashSet;
        String Y60 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_webview_browser_allow_list_1, "");
        C87412m.m108593f(Y60, "allowConfig1");
        hVar.mo59606a(Y60);
        String Y602 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_webview_browser_allow_list_2, "");
        C87412m.m108593f(Y602, "allowConfig2");
        hVar.mo59606a(Y602);
        boolean z = false;
        if (((C32735h) C86312j.m106911c(cls)).mo58779Qe(C32735h.C32737c.clicfg_webview_browser_enable_block, 0) == 1) {
            z = true;
        }
        f92808b = z;
        String Y603 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_webview_browser_block_list_1, "");
        C87412m.m108593f(Y603, "blockConfig1");
        hVar.mo59607b(Y603);
        String Y604 = ((C32735h) C86312j.m106911c(cls)).Y60(C32735h.C32737c.clicfg_webview_browser_block_list_2, "");
        C87412m.m108593f(Y604, "blockConfig2");
        hVar.mo59607b(Y604);
        Log.m105924i("MicroMsg.BrowserConfigManager", "alvinluo initBrowserConfig allowBrowserList size: " + b.size() + ", " + b + ", enableBlockBrowser: " + f92808b + ", blockBrowserList size: " + hashSet.size() + ", " + hashSet);
    }

    /* renamed from: a */
    public final void mo59606a(String str) {
        for (String lowerCase : C112550d0.m153785U(str, new String[]{";"}, false, 0, 6, (Object) null)) {
            String lowerCase2 = lowerCase.toLowerCase();
            C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase2.length() > 0) {
                HashSet<String> hashSet = f92807a;
                if (!hashSet.contains(lowerCase2)) {
                    hashSet.add(lowerCase2);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo59607b(String str) {
        for (String lowerCase : C112550d0.m153785U(str, new String[]{";"}, false, 0, 6, (Object) null)) {
            String lowerCase2 = lowerCase.toLowerCase();
            C87412m.m108593f(lowerCase2, "this as java.lang.String).toLowerCase()");
            if (lowerCase2.length() > 0) {
                HashSet<String> hashSet = f92809c;
                if (!hashSet.contains(lowerCase2)) {
                    hashSet.add(lowerCase2);
                }
            }
        }
    }
}

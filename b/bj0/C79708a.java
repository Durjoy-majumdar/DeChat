package bj0;

import com.tencent.p014mm.plugin.appbrand.debugger.console.C81720v;
import com.tencent.p014mm.plugin.appbrand.debugger.console.ConsoleDebugLogImpl;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import gy3.C87412m;

/* renamed from: bj0.a */
public final class C79708a {

    /* renamed from: a */
    public static final C79708a f233619a = new C79708a();

    /* renamed from: b */
    public static final boolean f233620b = (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || BuildInfo.IS_FLAVOR_PURPLE || WeChatEnvironment.hasDebugger());

    /* renamed from: a */
    public final void mo109821a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "tag");
        C87412m.m108594g(str4, "msg");
        Log.m105924i(str, str2);
        if (f233620b) {
            ConsoleDebugLogImpl b = C81720v.f239836a.mo114087b();
            b.logI(0, (String) null, (String) null, (String) null, 0, 0, 0, 0, str3 + ": " + str4);
        }
    }

    /* renamed from: b */
    public final void mo109822b(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        C87412m.m108594g(str3, "tag");
        C87412m.m108594g(str4, "msg");
        Log.m105928w(str, str2);
        if (f233620b) {
            ConsoleDebugLogImpl b = C81720v.f239836a.mo114087b();
            b.logW(0, (String) null, (String) null, (String) null, 0, 0, 0, 0, str3 + ": " + str4);
        }
    }
}

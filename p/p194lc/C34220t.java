package p194lc;

import com.tencent.p014mm.plugin.appbrand.page.C83745a;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: lc.t */
public final class C34220t implements C83745a.C83750e {
    /* renamed from: a */
    public void mo59499a(String str) {
        Log.m105920e("SkylinePageScriptInjectionMode", "injectModuleSharedPageFrameScript");
    }

    /* renamed from: b */
    public boolean mo59500b(String str) {
        Log.m105920e("SkylinePageScriptInjectionMode", "checkIsAppSharedPageFrameScript");
        return false;
    }

    /* renamed from: c */
    public void mo59501c() {
        Log.m105920e("SkylinePageScriptInjectionMode", "injectAppSharedPageFrameScript");
    }

    /* renamed from: d */
    public void mo59502d(String str) {
        Log.m105920e("SkylinePageScriptInjectionMode", "injectPageScript url:" + str);
    }

    public String name() {
        return "SkylinePageScriptInjectionMode";
    }
}

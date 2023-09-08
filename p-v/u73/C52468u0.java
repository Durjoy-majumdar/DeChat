package u73;

import android.text.TextUtils;
import bp3.C79758p;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import di3.C86312j;
import e00.C45513i0;
import java.util.HashMap;
import java.util.Map;
import yf3.C39009i;
import zt3.C119157j;

/* renamed from: u73.u0 */
public class C52468u0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f146607d;

    /* renamed from: e */
    public final /* synthetic */ boolean f146608e;

    public C52468u0(boolean z, boolean z2) {
        this.f146607d = z;
        this.f146608e = z2;
    }

    public void run() {
        if (C79758p.f233760a.mo109883f(new C39009i()) == 1) {
            boolean z = this.f146607d;
            String e = C101987v0.m134271e(-1);
            Map<String, String> a = C101987v0.m134267a(-1, z, 0);
            HashMap hashMap = (HashMap) a;
            hashMap.put("sessionId", e);
            hashMap.put("inputMarginTop", "32");
            hashMap.put("inputMarginLeftRight", "24");
            hashMap.put("inputHeight", "48");
            hashMap.put("isPreload", "1");
            String d = C101987v0.m134270d(a, 0);
            if (!TextUtils.isEmpty(d)) {
                if (C52472y0.f146614b == null) {
                    synchronized (C52472y0.class) {
                        if (C52472y0.f146614b == null) {
                            C52472y0.f146614b = new C52472y0();
                        }
                    }
                }
                C52472y0 y0Var = C52472y0.f146614b;
                boolean z2 = this.f146608e;
                y0Var.getClass();
                if (C44594n1.m49046b()) {
                    Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadExport", "disable tools and mp");
                    if (MMApplicationContext.isMainProcess()) {
                        Log.m105924i("MicroMsg.WebSearch.WebSearchPreloadExport", "preload webSearch webView in MM");
                        ((C45513i0) C86312j.m106911c(C45513i0.class)).mo70778E3(d, z2);
                        return;
                    }
                    return;
                }
                Log.m105925i("MicroMsg.WebSearch.WebSearchPreloadExport", "preloadWebView %s %s %s %s", MMApplicationContext.getProcessName(), d, 4, Boolean.valueOf(z2));
                if (MMApplicationContext.isToolsProcess()) {
                    Log.m105925i("MicroMsg.WebSearch.WebSearchPreloadExport", "current preload mgr size %s", Integer.valueOf(y0Var.f146615a.size()));
                    if (z2) {
                        y0Var.f146615a.remove(4);
                    }
                    if (!y0Var.f146615a.containsKey(4)) {
                        C52473z0 z0Var = new C52473z0(4);
                        z0Var.mo73417a(d);
                        y0Var.f146615a.put(4, z0Var);
                        return;
                    }
                    y0Var.f146615a.get(4).mo73417a(d);
                } else if (MMApplicationContext.isMainProcess()) {
                    ((C119157j) C119157j.f356862d).mo183875f(new C52471x0(y0Var, d, 4, z2));
                }
            }
        }
    }
}

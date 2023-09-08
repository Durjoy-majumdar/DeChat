package com.tencent.p014mm.plugin.webview.p128ui.tools;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.x0 */
public final class C44395x0 {

    /* renamed from: a */
    public static final C44395x0 f120338a = new C44395x0();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, WeakReference<WebViewUI>> f120339b = new ConcurrentHashMap<>();

    /* renamed from: c */
    public static final ConcurrentHashMap<String, ArrayList<Runnable>> f120340c = new ConcurrentHashMap<>();

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/x0$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.x0$a */
    public static final class C44396a implements C80883e<IPCString, IPCVoid> {
        public void invoke(Object obj, C1256g gVar) {
            IPCString iPCString = (IPCString) obj;
            C87412m.m108594g(iPCString, "data");
            C87412m.m108594g(gVar, "callback");
            C44395x0 x0Var = C44395x0.f120338a;
            String str = iPCString.f10315d;
            C87412m.m108593f(str, "data.value");
            x0Var.mo69169a(str);
        }
    }

    /* renamed from: a */
    public final synchronized void mo69169a(String str) {
        ArrayList<Runnable> arrayList = f120340c.get(str);
        if (arrayList != null) {
            for (Runnable run : arrayList) {
                run.run();
            }
        }
        f120340c.clear();
    }
}

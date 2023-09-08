package com.tencent.p014mm.plugin.brandservice.webprefetcher.debug;

import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.C80916r;
import com.tencent.p014mm.ipcinvoker.type.IPCString;
import com.tencent.p014mm.plugin.webview.core.C43520v;
import com.tencent.p014mm.plugin.webview.core.C5857x;
import com.tencent.p014mm.pluginsdk.model.C44594n1;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.xweb.CookieManager;
import com.tencent.xweb.internal.ConstValue;
import gy3.C87412m;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* renamed from: com.tencent.mm.plugin.brandservice.webprefetcher.debug.a */
public final class C40819a {

    @Metadata(mo182093d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, mo182094d2 = {"<anonymous>", "Lcom/tencent/mm/ipcinvoker/type/IPCString;", "it", "invoke"}, mo182095k = 3, mo182096mv = {1, 7, 1}, mo182098xi = 48)
    /* renamed from: com.tencent.mm.plugin.brandservice.webprefetcher.debug.a$a */
    public static final class C40820a<InputType, ResultType> implements C80916r {

        /* renamed from: a */
        public static final C40820a<InputType, ResultType> f109697a = new C40820a<>();

        public Object invoke(Object obj) {
            IPCString iPCString = (IPCString) obj;
            String cookie = CookieManager.getInstance().getCookie(iPCString != null ? iPCString.f10315d : null);
            if (cookie == null) {
                cookie = "";
            }
            return new IPCString(cookie);
        }
    }

    /* renamed from: a */
    public static final boolean m44115a() {
        C43520v.C43521b bVar = C43520v.f117665a;
        if (BuildInfo.DEBUG) {
            return true;
        }
        return bVar.mo67810a() && C5857x.m5577a().getInt("debugCookie", -1) == 1;
    }

    /* renamed from: b */
    public static final boolean m44116b() {
        return C43520v.f117665a.mo67810a() && C5857x.m5577a().getInt("debugPatchEnable", -1) == 1;
    }

    /* renamed from: c */
    public static final String m44117c() {
        String str = C44594n1.m49046b() ? WeChatProcess.PROCESS_MAIN : WeChatProcess.PROCESS_TOOLS;
        C87412m.m108593f(str, ConstValue.INIT_CONFIG_KEY_PROCESSNAME);
        IPCString iPCString = (IPCString) C28947a.m38501b(str, new IPCString("https://mp.weixin.qq.com/index/SetContainer"), C40820a.f109697a);
        Object[] objArr = new Object[1];
        String str2 = null;
        objArr[0] = iPCString != null ? iPCString.f10315d : null;
        Log.m105919d("MicroMsg.WebPrefetcherDebugUtils", "getCookieForDebug: %s", objArr);
        if (iPCString != null) {
            str2 = iPCString.f10315d;
        }
        return str2 == null ? "" : str2;
    }

    /* renamed from: d */
    public static final void m44118d(HashMap<String, List<String>> hashMap, String str) {
        C87412m.m108594g(hashMap, "headers");
        C87412m.m108594g(str, "infoPrefix");
        if (BuildInfo.DEBUG) {
            for (Map.Entry next : hashMap.entrySet()) {
                Log.m105926v("MicroMsg.WebPrefetcherDebugUtils", str + " response header key: " + ((String) next.getKey()) + ", value: " + next.getValue());
            }
        }
    }
}

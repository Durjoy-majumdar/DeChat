package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import android.os.Bundle;
import c30.C104288c;
import c30.C26827e;
import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import gy3.C87412m;
import h81.C32735h;
import ht1.C60200t1;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import o40.C61926c;
import org.json.JSONException;
import q20.C89449a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import te3.C50676og0;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.z1 */
public final class C6588z1 extends C15053a {

    /* renamed from: d */
    public static final C6588z1 f23830d = new C6588z1();

    /* renamed from: e */
    public static final int f23831e = -2;

    /* renamed from: f */
    public static final String f23832f = "preloadFinderFeed";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/z1$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Landroid/os/Bundle;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.z1$a */
    public static final class C6589a implements C80883e<Bundle, IPCVoid> {
        /* renamed from: a */
        public void invoke(Bundle bundle, C1256g<IPCVoid> gVar) {
            try {
                Log.m105924i("MicroMsg.JsApiPreloadFinderFeed", "start preload");
                C26827e eVar = new C26827e(bundle != null ? bundle.getString("KEY_REQUEST_DATA") : null);
                int i = bundle != null ? bundle.getInt("KEY_REQUEST_SCENE", 0) : 0;
                LinkedList linkedList = new LinkedList();
                int length = eVar.length();
                int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_finder_search_h5_preload_max_per_count, 20);
                if (length > Qe) {
                    length = Qe;
                }
                Log.m105925i("MicroMsg.JsApiPreloadFinderFeed", "preload %s", Integer.valueOf(eVar.length()));
                for (int i2 = 0; i2 < length; i2++) {
                    C50676og0 og02 = new C50676og0();
                    Object obj = eVar.get(i2);
                    C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.json.InnerJSONObject");
                    C104288c cVar = (C104288c) obj;
                    og02.f139150d = C61926c.m72671P(cVar.getString("feedId"));
                    og02.f139151e = cVar.getString("encryptId");
                    og02.f139152f = cVar.getString("nonceId");
                    linkedList.add(og02);
                }
                ((C60200t1) C86312j.m106911c(C60200t1.class)).mo76733AN(linkedList, 39, i);
            } catch (JSONException e) {
                Log.printErrStackTrace("MicroMsg.JsApiPreloadFinderFeed", e, "", new Object[0]);
            }
            Log.m105924i("MicroMsg.JsApiPreloadFinderFeed", "callback");
            if (gVar != null) {
                gVar.mo894a(new IPCVoid());
            }
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        boolean isMainProcess = MMApplicationContext.isMainProcess();
        int i = 0;
        Log.m105925i("MicroMsg.JsApiPreloadFinderFeed", "preloadFinderFeed main process:%b", Boolean.valueOf(isMainProcess));
        Bundle bundle = new Bundle();
        String str = (String) h1Var.f38983a.get("items");
        Integer num = (Integer) h1Var.f38983a.get("batchLoadScene");
        if (str == null) {
            C13849g gVar = jVar.f39001d;
            String str2 = h1Var.f38990c;
            gVar.mo10774a(str2, h1Var.f38996i + ":param invalid", (Map<String, Object>) null);
            return false;
        }
        bundle.putString("KEY_REQUEST_DATA", str);
        if (num != null) {
            i = num.intValue();
        }
        bundle.putInt("KEY_REQUEST_SCENE", i);
        if (isMainProcess) {
            new C6589a().invoke(bundle, (C1256g<IPCVoid>) null);
            C13849g gVar2 = jVar.f39001d;
            String str3 = h1Var.f38990c;
            gVar2.mo10774a(str3, h1Var.f38996i + ":ok", (Map<String, Object>) null);
            return true;
        }
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, bundle, C6589a.class, (C1256g) null);
        C13849g gVar3 = jVar.f39001d;
        String str4 = h1Var.f38990c;
        gVar3.mo10774a(str4, h1Var.f38996i + ":ok", (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23831e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23832f;
    }
}

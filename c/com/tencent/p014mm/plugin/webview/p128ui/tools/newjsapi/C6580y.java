package com.tencent.p014mm.plugin.webview.p128ui.tools.newjsapi;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.ipcinvoker.type.IPCBoolean;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import gy3.C87412m;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import lg3.C76695c;
import q20.C89449a;
import t83.C13851h1;
import t83.C13855j;
import w83.C15053a;
import xi3.C78844a;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.y */
public final class C6580y extends C15053a {

    /* renamed from: d */
    public static final C6580y f23816d = new C6580y();

    /* renamed from: e */
    public static final int f23817e = 413;

    /* renamed from: f */
    public static final String f23818f = "getUserConfig";

    @Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/y$a;", "Lcom/tencent/mm/ipcinvoker/e;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "Lcom/tencent/mm/ipcinvoker/type/IPCBoolean;", "<init>", "()V", "plugin-webview_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
    @C89449a
    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.y$a */
    public static final class C6581a implements C80883e<IPCVoid, IPCBoolean> {
        public void invoke(Object obj, C1256g gVar) {
            IPCVoid iPCVoid = (IPCVoid) obj;
            if (gVar != null) {
                gVar.mo894a(new IPCBoolean(C76695c.m92341b()));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.newjsapi.y$b */
    public static final class C6582b<T> implements C1256g {

        /* renamed from: d */
        public final /* synthetic */ Map<String, Object> f23819d;

        /* renamed from: e */
        public final /* synthetic */ C13855j f23820e;

        /* renamed from: f */
        public final /* synthetic */ C13851h1 f23821f;

        public C6582b(Map<String, Object> map, C13855j jVar, C13851h1 h1Var) {
            this.f23819d = map;
            this.f23820e = jVar;
            this.f23821f = h1Var;
        }

        /* renamed from: a */
        public void mo894a(Object obj) {
            this.f23819d.put("isAccessibilityMode", Boolean.valueOf(C78844a.C15689b.f42385a.mo108842h(true)));
            this.f23819d.put("isCareMode", Boolean.valueOf(((IPCBoolean) obj).f10312d));
            Log.m105924i("MicroMsg.JsApiGetUserConfig", "isAccessibilityMode:" + this.f23819d.get("isAccessibilityMode") + ", isCareMode:" + this.f23819d.get("isCareMode"));
            StringBuilder sb = new StringBuilder();
            C6580y.f23816d.getClass();
            sb.append(C6580y.f23818f);
            sb.append(":ok");
            this.f23820e.f39001d.mo10774a(this.f23821f.f38990c, sb.toString(), this.f23819d);
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, IPCVoid.f10316d, C6581a.class, new C6582b(new HashMap(), jVar, h1Var));
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23817e;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23818f;
    }
}

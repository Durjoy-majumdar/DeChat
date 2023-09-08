package com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.xweb.file.XVFSFile;
import di3.C86312j;
import e00.C45520t;
import gy3.C87412m;
import java.util.Map;
import kr0.C10403n0;
import p210o.C11323a;
import t83.C13849g;
import t83.C13851h1;
import t83.C13855j;
import un0.C14253d;
import w83.C15053a;
import z04.C112550d0;

/* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l */
public final class C6266l extends C15053a {

    /* renamed from: d */
    public static final C6266l f23065d = new C6266l();

    /* renamed from: e */
    public static final String f23066e = "rebaseWxappPubLibAndRestart";

    /* renamed from: f */
    public static final int f23067f = C14253d.CTRL_INDEX;

    /* renamed from: com.tencent.mm.plugin.webview.ui.tools.jsapi.l$a */
    public static final class C6267a<I, O> implements C11323a {

        /* renamed from: a */
        public final /* synthetic */ C13855j f23068a;

        /* renamed from: b */
        public final /* synthetic */ C13851h1 f23069b;

        public C6267a(C13855j jVar, C13851h1 h1Var) {
            this.f23068a = jVar;
            this.f23069b = h1Var;
        }

        public Object apply(Object obj) {
            String str = (String) obj;
            C13849g gVar = this.f23068a.f39001d;
            String str2 = this.f23069b.f38990c;
            StringBuilder sb = new StringBuilder();
            C6266l.f23065d.getClass();
            sb.append(C6266l.f23066e);
            sb.append(XVFSFile.PATH_SEPARATOR_CHAR);
            if (str == null) {
                str = "";
            }
            sb.append(str);
            gVar.mo10774a(str2, sb.toString(), (Map<String, Object>) null);
            return Boolean.TRUE;
        }
    }

    /* renamed from: a */
    public boolean mo7286a(C13855j jVar, C13851h1 h1Var) {
        C87412m.m108594g(jVar, "env");
        C87412m.m108594g(h1Var, "msg");
        Object obj = h1Var.f38983a.get("appId");
        String obj2 = obj != null ? obj.toString() : null;
        C45520t c = jVar.mo13183c();
        String n0 = c != null ? c.mo63683n0() : null;
        if (n0 == null) {
            n0 = "";
        }
        if (!(obj2 == null || obj2.length() == 0)) {
            if (C112550d0.m153801u(n0, "appid=" + obj2, false)) {
                ((C10403n0) C86312j.m106911c(C10403n0.class)).mo10722vN(obj2, new C6267a(jVar, h1Var));
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("handleMsg with invalid params, rawUrl:");
        sb.append(n0);
        sb.append(", wxaAppId:");
        sb.append(obj2);
        sb.append(", binderId:");
        C45520t c2 = jVar.mo13183c();
        sb.append(c2 != null ? c2.mo67719g() : -1);
        Log.m105920e("MicroMsg.WebView.JsApiRebaseWxappPubLibAndRestart", sb.toString());
        C13849g gVar = jVar.f39001d;
        String str = h1Var.f38990c;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(f23066e);
        sb4.append(":fail invalid appId:");
        if (obj2 == null) {
            obj2 = "";
        }
        sb4.append(obj2);
        gVar.mo10774a(str, sb4.toString(), (Map<String, Object>) null);
        return true;
    }

    /* renamed from: b */
    public int mo7287b() {
        return f23067f;
    }

    /* renamed from: c */
    public String mo7288c() {
        return f23066e;
    }
}

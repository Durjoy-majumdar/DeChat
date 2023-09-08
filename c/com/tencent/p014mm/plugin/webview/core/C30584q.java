package com.tencent.p014mm.plugin.webview.core;

import com.tencent.p014mm.ipcinvoker.C28947a;
import com.tencent.p014mm.ipcinvoker.type.IPCVoid;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import z04.C112551y;

/* renamed from: com.tencent.mm.plugin.webview.core.q */
public final class C30584q {

    /* renamed from: a */
    public static final C30584q f82375a = new C30584q();

    /* renamed from: b */
    public static final C13601g f82376b = C36568h.m40985a(C30585a.f82380d);

    /* renamed from: c */
    public static Pattern f82377c;

    /* renamed from: d */
    public static final C13601g f82378d = C36568h.m40985a(C30586b.f82381d);

    /* renamed from: e */
    public static boolean f82379e;

    /* renamed from: com.tencent.mm.plugin.webview.core.q$a */
    public static final class C30585a extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public static final C30585a f82380d = new C30585a();

        public C30585a() {
            super(0);
        }

        public Object invoke() {
            return ((C32735h) C86312j.m106911c(C32735h.class)).Y60(C32735h.C32737c.clicfg_webview_custom_headers_list, "^https://(mi|v2|c2)\\.gdt\\.qq\\.com/gdt_(.*)\\.fcg(.*)");
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.q$b */
    public static final class C30586b extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C30586b f82381d = new C30586b();

        public C30586b() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("__webView_ad");
        }
    }

    /* renamed from: a */
    public final String mo57492a(String str) {
        if (str == null) {
            return null;
        }
        if (f82377c == null) {
            Pattern compile = Pattern.compile((String) ((C36570n) f82376b).getValue());
            if (compile == null) {
                return null;
            }
            f82377c = compile;
        }
        Pattern pattern = f82377c;
        Matcher matcher = pattern != null ? pattern.matcher(str) : null;
        if (matcher != null && matcher.find()) {
            String decodeString = ((MultiProcessMMKV) ((C36570n) f82378d).getValue()).decodeString("AdWUID", "");
            C87412m.m108593f(decodeString, "mmkv.decodeString(\"AdWUID\", \"\")");
            if (!C112551y.m153811k(decodeString)) {
                Log.m105924i("MicroMsg.WebViewAdHelper", "getCustomHeaders wuid=" + decodeString + ", url=" + str);
                mo57493b(6);
                return "Wuid:" + decodeString;
            }
            mo57493b(7);
            if (!f82379e) {
                f82379e = true;
                mo57493b(0);
                String str2 = WeChatProcess.PROCESS_MAIN;
                C87412m.m108593f(str2, "PROCESS_MAIN");
                C28947a.m38500a(str2, IPCVoid.f10316d, C30588s.f82384d, C30589t.f82385d);
            }
        }
        return null;
    }

    /* renamed from: b */
    public final void mo57493b(long j) {
        C115669n.INSTANCE.idkeyStat(1931, j, 1, false);
    }
}

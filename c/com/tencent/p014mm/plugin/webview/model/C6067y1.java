package com.tencent.p014mm.plugin.webview.model;

import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.WeChatHosts;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import java.util.HashSet;
import rx3.C13601g;
import rx3.C36568h;

/* renamed from: com.tencent.mm.plugin.webview.model.y1 */
public final class C6067y1 {

    /* renamed from: c */
    public static final C13601g<Boolean> f22367c = C36568h.m40985a(C6068a.f22371d);

    /* renamed from: d */
    public static final C13601g<HashSet<String>> f22368d = C36568h.m40985a(C6069b.f22372d);

    /* renamed from: a */
    public long f22369a;

    /* renamed from: b */
    public HashSet<String> f22370b = new HashSet<>();

    /* renamed from: com.tencent.mm.plugin.webview.model.y1$a */
    public static final class C6068a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C6068a f22371d = new C6068a();

        public C6068a() {
            super(0);
        }

        public Object invoke() {
            boolean z = false;
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_RED || ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_enable_webview_report_url_ip, 0) == 1) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.model.y1$b */
    public static final class C6069b extends C87413o implements C32224a<HashSet<String>> {

        /* renamed from: d */
        public static final C6069b f22372d = new C6069b();

        public C6069b() {
            super(0);
        }

        public Object invoke() {
            HashSet hashSet = new HashSet();
            hashSet.add(WeChatHosts.domainString(C0966R.string.f360885fm3));
            return hashSet;
        }
    }
}

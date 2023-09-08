package com.tencent.p014mm.plugin.webview.core;

import di3.C86312j;
import fy3.C32224a;
import gy3.C87413o;
import h81.C32735h;
import qe3.C25549c;
import rx3.C13601g;
import rx3.C36568h;
import t83.C13861m1;
import w83.C15053a;

/* renamed from: com.tencent.mm.plugin.webview.core.f0 */
public final class C5843f0 {

    /* renamed from: a */
    public static final C5843f0 f22025a = new C5843f0();

    /* renamed from: b */
    public static final C13601g f22026b = C36568h.m40985a(C5851h.f22039d);

    /* renamed from: c */
    public static final C13601g f22027c = C36568h.m40985a(C5849f.f22037d);

    /* renamed from: d */
    public static final C13601g f22028d = C36568h.m40985a(C5850g.f22038d);

    /* renamed from: e */
    public static final C13601g f22029e = C36568h.m40985a(C5846c.f22034d);

    /* renamed from: f */
    public static final C13601g f22030f = C36568h.m40985a(C5847d.f22035d);

    /* renamed from: g */
    public static final C13601g f22031g = C36568h.m40985a(C5844a.f22033d);

    /* renamed from: h */
    public static final C13601g f22032h = C36568h.m40985a(C5848e.f22036d);

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$a */
    public static final class C5844a extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C5844a f22033d = new C5844a();

        public C5844a() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_block_oauth_on_background, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$b */
    public static final class C5845b extends C25549c.C12172h {
        public C5845b(String str, String str2, int i) {
            super(str, str2, i, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$c */
    public static final class C5846c extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C5846c f22034d = new C5846c();

        public C5846c() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_get_location_frequent_limit_open, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$d */
    public static final class C5847d extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C5847d f22035d = new C5847d();

        public C5847d() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_get_location_frequent_limit_time, 3000));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$e */
    public static final class C5848e extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C5848e f22036d = new C5848e();

        public C5848e() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_half_webview_pull_down_close, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$f */
    public static final class C5849f extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C5849f f22037d = new C5849f();

        public C5849f() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_background_pending_count, 20));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$g */
    public static final class C5850g extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public static final C5850g f22038d = new C5850g();

        public C5850g() {
            super(0);
        }

        public Object invoke() {
            boolean z = true;
            if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_background_pending_open, 1) != 1) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.f0$h */
    public static final class C5851h extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public static final C5851h f22039d = new C5851h();

        public C5851h() {
            super(0);
        }

        public Object invoke() {
            return Integer.valueOf(((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_background_pending_start_time, 500));
        }
    }

    /* renamed from: a */
    public final C25549c.C12172h mo6894a(String str) {
        C15053a aVar = null;
        if (str == null) {
            return null;
        }
        C25549c.C12172h b = C25549c.m33051b(str);
        if (b != null) {
            return b;
        }
        C13861m1 m1Var = C13861m1.f39016b;
        if (m1Var.mo13194c().containsKey(str)) {
            aVar = m1Var.mo13194c().get(str);
        }
        return aVar != null ? new C5845b(aVar.mo7288c(), aVar.mo7288c(), aVar.mo7287b()) : b;
    }
}

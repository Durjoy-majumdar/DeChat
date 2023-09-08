package com.tencent.p014mm.plugin.webview.core;

import android.net.Uri;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatEnvironment;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import java.net.URLEncoder;
import p823sg.C77710q;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import zt3.C119157j;

/* renamed from: com.tencent.mm.plugin.webview.core.m */
public final class C30579m {

    /* renamed from: a */
    public final long f82355a;

    /* renamed from: b */
    public final C13601g f82356b = C36568h.m40985a(new C30580a(this));

    /* renamed from: c */
    public final C13601g f82357c = C36568h.m40985a(C30582c.f82367d);

    /* renamed from: com.tencent.mm.plugin.webview.core.m$a */
    public static final class C30580a extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public final /* synthetic */ C30579m f82358d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30580a(C30579m mVar) {
            super(0);
            this.f82358d = mVar;
        }

        public Object invoke() {
            long j;
            try {
                String a = C77710q.m93738a((int) this.f82358d.f82355a);
                C87412m.m108593f(a, "getString(uin.toInt())");
                j = Long.parseLong(a);
            } catch (Exception unused) {
                Log.m105924i("MicroMsg.WebPageErrorMonitor", "uin parse error");
                j = 0;
            }
            return Long.valueOf(j);
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.m$b */
    public static final class C30581b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f82359d;

        /* renamed from: e */
        public final /* synthetic */ int f82360e;

        /* renamed from: f */
        public final /* synthetic */ C30579m f82361f;

        /* renamed from: g */
        public final /* synthetic */ String f82362g;

        /* renamed from: h */
        public final /* synthetic */ boolean f82363h;

        /* renamed from: i */
        public final /* synthetic */ String f82364i;

        /* renamed from: j */
        public final /* synthetic */ int f82365j;

        /* renamed from: n */
        public final /* synthetic */ int f82366n;

        public C30581b(String str, int i, C30579m mVar, String str2, boolean z, String str3, int i2, int i3) {
            this.f82359d = str;
            this.f82360e = i;
            this.f82361f = mVar;
            this.f82362g = str2;
            this.f82363h = z;
            this.f82364i = str3;
            this.f82365j = i2;
            this.f82366n = i3;
        }

        public final void run() {
            Uri uri;
            String str;
            try {
                uri = Uri.parse(this.f82359d);
            } catch (Throwable unused) {
                Log.m105920e("MicroMsg.WebPageErrorMonitor", "onReceivedError, parse uri error:" + this.f82359d);
                uri = null;
            }
            if (uri == null || (str = uri.getHost()) == null) {
                str = "";
            }
            C115669n.INSTANCE.mo160131h(22086, 1, Integer.valueOf(this.f82360e), str, C30579m.m39133a(this.f82361f, this.f82359d), C30579m.m39133a(this.f82361f, this.f82362g), Integer.valueOf(this.f82363h ? 1 : 0), this.f82364i, Integer.valueOf(this.f82365j), Integer.valueOf(this.f82366n));
        }
    }

    /* renamed from: com.tencent.mm.plugin.webview.core.m$c */
    public static final class C30582c extends C87413o implements C32224a<Long> {

        /* renamed from: d */
        public static final C30582c f82367d = new C30582c();

        public C30582c() {
            super(0);
        }

        public Object invoke() {
            C32735h hVar = (C32735h) C86312j.m106911c(C32735h.class);
            long j = 2;
            if (hVar != null) {
                j = hVar.mo58777He(C32735h.C32737c.clicfg_webview_page_error_report_rate, 2);
            }
            Log.m105924i("MicroMsg.WebPageErrorMonitor", "WebPageErrorMonitor sample rate= " + j);
            return Long.valueOf(j);
        }
    }

    public C30579m(long j) {
        this.f82355a = j;
    }

    /* renamed from: a */
    public static final String m39133a(C30579m mVar, String str) {
        mVar.getClass();
        if (str == null) {
            return "";
        }
        String encode = URLEncoder.encode(str, "UTF-8");
        C87412m.m108593f(encode, "encode(this, \"UTF-8\")");
        return encode;
    }

    /* renamed from: b */
    public final long mo57487b() {
        return ((Number) ((C36570n) this.f82356b).getValue()).longValue();
    }

    /* renamed from: c */
    public final void mo57488c(int i, String str, String str2, String str3, int i2, int i3, boolean z) {
        if (mo57489d() && str2 != null) {
            ((C119157j) C119157j.f356862d).mo183876g(new C30581b(str2, i, this, str, z, str3, i2, i3), "MicroMsg.WebPageErrorMonitor");
        }
    }

    /* renamed from: d */
    public final boolean mo57489d() {
        if (BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG || ((Log.getLogLevel() <= 1 && WeChatEnvironment.hasDebugger()) || mo57487b() == 0 || mo57487b() == -1)) {
            return true;
        }
        return mo57487b() > 0 && ((Number) ((C36570n) this.f82357c).getValue()).longValue() > 0 && mo57487b() % ((Number) ((C36570n) this.f82357c).getValue()).longValue() == 0;
    }
}

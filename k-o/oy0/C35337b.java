package oy0;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV;
import di3.C86312j;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import h81.C32735h;
import pe3.C47465a;
import q73.C35796c0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49168dn;
import te3.o25;

/* renamed from: oy0.b */
public final class C35337b {

    /* renamed from: a */
    public static final C35337b f94642a = new C35337b();

    /* renamed from: b */
    public static final C13601g f94643b = C36568h.m40985a(C35338a.f94645d);

    /* renamed from: c */
    public static Boolean f94644c;

    /* renamed from: oy0.b$a */
    public static final class C35338a extends C87413o implements C32224a<MultiProcessMMKV> {

        /* renamed from: d */
        public static final C35338a f94645d = new C35338a();

        public C35338a() {
            super(0);
        }

        public Object invoke() {
            return MultiProcessMMKV.getMMKV("PrefetchPkgVersion");
        }
    }

    /* renamed from: a */
    public static final boolean m40642a() {
        if (f94644c == null) {
            boolean z = true;
            int Qe = ((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_webview_prefetcher_enable_download_pkg_by_http, 1);
            if (Qe != 1 && !BuildInfo.DEBUG && !BuildInfo.IS_FLAVOR_RED) {
                z = false;
            }
            f94644c = Boolean.valueOf(z);
            Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "initWebPrefetcherPkgConfig enableDownloadPkgByHttp config: " + Qe + ", enable: " + f94644c);
        }
        Boolean bool = f94644c;
        C87412m.m108591d(bool);
        return bool.booleanValue();
    }

    /* renamed from: b */
    public static final o25 m40643b(String str, String str2) {
        byte[] decodeBytes;
        C87412m.m108594g(str, "appId");
        C87412m.m108594g(str2, "pkgVersion");
        C47465a aVar = null;
        if (!(str.length() > 0)) {
            return null;
        }
        C35337b bVar = f94642a;
        String c = bVar.mo60210c(str, str2);
        Log.m105919d("MicroMsg.WebPrefetcherPkgManager", "getPkgInfo pkgVersion: %s, pkgKey: %s", str2, c);
        MultiProcessMMKV d = bVar.mo60211d();
        C87412m.m108593f(d, "pkgVersionManager");
        if (d.containsKey(c) && (decodeBytes = d.decodeBytes(c)) != null) {
            if (!(decodeBytes.length == 0)) {
                try {
                    C47465a newInstance = o25.class.newInstance();
                    newInstance.parseFrom(decodeBytes);
                    aVar = newInstance;
                } catch (Exception e) {
                    Log.printErrStackTrace("MultiProcessMMKV.decodeProtoBuffer", e, "decode ProtoBuffer", new Object[0]);
                }
            }
        }
        return (o25) aVar;
    }

    /* renamed from: e */
    public static final void m40644e(o25 o25) {
        if (o25 != null) {
            Log.m105924i("MicroMsg.WebPrefetcherPkgManager", "saveCurrentPkgInfo appId: " + o25.f138916d + ", pkgVersion: " + o25.f138918f);
            C35796c0 c0Var = C35796c0.f95588a;
            String str = o25.f138916d;
            C87412m.m108593f(str, "pkgInfo.appId");
            C49168dn dnVar = new C49168dn();
            String str2 = o25.f138916d;
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            dnVar.f132423d = str2;
            String str4 = o25.f138917e;
            if (str4 == null) {
                str4 = str3;
            }
            dnVar.f132424e = str4;
            String str5 = o25.f138918f;
            if (str5 != null) {
                str3 = str5;
            }
            dnVar.f132428i = str3;
            C13598b0 b0Var = C13598b0.f38549a;
            c0Var.mo60412n(str, dnVar);
        }
    }

    /* renamed from: c */
    public final String mo60210c(String str, String str2) {
        if (str2.length() == 0) {
            return str;
        }
        return str + '_' + str2.hashCode();
    }

    /* renamed from: d */
    public final MultiProcessMMKV mo60211d() {
        return (MultiProcessMMKV) ((C36570n) f94643b).getValue();
    }
}

package vq0;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.extension.XIPCInvoker;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheDirectoryDescriptor;
import com.tencent.p014mm.plugin.appbrand.page.web_renderingcache.WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.WeChatProcess;
import com.tencent.p014mm.vfs.C86013q1;
import gy3.C8480h;
import gy3.C87412m;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.concurrent.ConcurrentHashMap;
import te3.C49944j5;

/* renamed from: vq0.k */
public final class C90864k implements C90860a {

    /* renamed from: d */
    public final AppBrandRuntimeWC f260838d;

    /* renamed from: e */
    public final boolean f260839e;

    /* renamed from: f */
    public final String f260840f;

    /* renamed from: g */
    public final String f260841g;

    /* renamed from: h */
    public final String f260842h;

    /* renamed from: i */
    public final ConcurrentHashMap<String, C49944j5> f260843i;

    public C90864k(AppBrandRuntimeWC appBrandRuntimeWC, C8480h hVar) {
        this.f260838d = appBrandRuntimeWC;
        String M = appBrandRuntimeWC.mo113184O1(false).mo113367M();
        C87412m.m108593f(M, "runtime.libReader.versionBuildInfo()");
        this.f260840f = M;
        int i = appBrandRuntimeWC.f238149o.f239365g;
        String valueOf = i != 1 ? i != 2 ? String.valueOf(appBrandRuntimeWC.mo121252j1()) : "DEMO" : "TEST";
        this.f260841g = valueOf;
        WebRenderingCacheDirectoryDescriptor webRenderingCacheDirectoryDescriptor = appBrandRuntimeWC.mo113210l1().f239378i1;
        String str = webRenderingCacheDirectoryDescriptor != null ? webRenderingCacheDirectoryDescriptor.f245118d : null;
        if (str == null || str.length() == 0) {
            this.f260839e = false;
            this.f260842h = "";
        } else {
            this.f260839e = true;
            this.f260842h = str + '_' + M.hashCode() + '_' + valueOf;
        }
        this.f260843i = new ConcurrentHashMap<>();
    }

    /* renamed from: b */
    public static final C90864k m113949b(AppBrandRuntimeWC appBrandRuntimeWC) {
        C87412m.m108594g(appBrandRuntimeWC, "rt");
        if (appBrandRuntimeWC.mo113184O1(false) != null) {
            return new C90864k(appBrandRuntimeWC, (C8480h) null);
        }
        Log.m105920e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "try create provider but rt.libReader is NULL, appId:" + appBrandRuntimeWC.f238147j);
        return null;
    }

    /* renamed from: Jg */
    public String mo124956Jg(String str) {
        if (!this.f260839e) {
            return null;
        }
        boolean z = true;
        if (str == null || str.length() == 0) {
            return null;
        }
        C49944j5 a = mo124961a(str);
        String str2 = a != null ? a.f135865d : null;
        if (!(str2 == null || str2.length() == 0)) {
            z = false;
        }
        if (!z) {
            new C37805f();
            XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, mo124962c(str), C37805f.class, (C1256g) null);
        }
        return str2;
    }

    /* renamed from: Kj */
    public String mo124957Kj(String str) {
        C49944j5 a;
        if (!this.f260839e) {
            return null;
        }
        if (!(str == null || str.length() == 0) && (a = mo124961a(str)) != null) {
            return a.f135867f;
        }
        return null;
    }

    public void Y30(String str, String str2, String str3, String str4) {
        if (this.f260839e) {
            if (!(str == null || str.length() == 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append("save path[");
                sb.append(str);
                sb.append("] content[");
                int i = -1;
                sb.append(str2 != null ? str2.length() : -1);
                sb.append("] webviewData[");
                sb.append(str3 != null ? str3.length() : -1);
                sb.append("] serviceData[");
                if (str4 != null) {
                    i = str4.length();
                }
                sb.append(i);
                sb.append(']');
                Log.m105924i("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", sb.toString());
                if (str2 == null) {
                    C86013q1.m106447h(mo124963d(str));
                    new C37809j();
                    XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, mo124962c(str), C37809j.class, (C1256g) null);
                    return;
                }
                ConcurrentHashMap<String, C49944j5> concurrentHashMap = this.f260843i;
                C49944j5 j5Var = new C49944j5();
                j5Var.f135865d = str2;
                j5Var.f135866e = str3;
                j5Var.f135867f = str4;
                String d = mo124963d(str);
                try {
                    C86013q1.m106437S(d, j5Var.toByteArray());
                    new C37807h();
                    WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel c = mo124962c(str);
                    c.f80544h = d;
                    XIPCInvoker.m98748a(WeChatProcess.PROCESS_MAIN, c, C37807h.class, (C1256g) null);
                } catch (IOException e) {
                    Log.m105920e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "saveRenderingCache appId[" + this.f260838d.f238147j + "] path[" + str + "] e=" + e);
                }
                concurrentHashMap.put(str, j5Var);
                return;
            }
        }
        Log.m105920e("MicroMsg.AppBrand.WebRenderingCacheProviderNewImpl", "saveRenderingCache disabled appId[" + this.f260838d.f238147j + "] path[" + str + ']');
    }

    /* renamed from: a */
    public final C49944j5 mo124961a(String str) {
        C49944j5 j5Var = this.f260843i.get(str);
        if (j5Var == null) {
            String d = mo124963d(str);
            long l = C86013q1.m106451l(d);
            if (l > 0) {
                j5Var = new C49944j5();
                try {
                    j5Var.parseFrom(C86013q1.m106433O(d, 0, (int) l));
                } catch (IOException unused) {
                    C86013q1.m106447h(d);
                }
                this.f260843i.put(str, j5Var);
            }
        }
        return j5Var;
    }

    /* renamed from: a9 */
    public String mo124959a9(String str) {
        C49944j5 a;
        if (!this.f260839e) {
            return null;
        }
        if (!(str == null || str.length() == 0) && (a = mo124961a(str)) != null) {
            return a.f135866e;
        }
        return null;
    }

    /* renamed from: c */
    public final WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel mo124962c(String str) {
        String str2 = this.f260838d.f238147j;
        C87412m.m108593f(str2, "runtime.appId");
        return new WebRenderingCacheIPCOperations$WebRenderingCacheRecordParcel(str2, this.f260840f, this.f260841g, str, (String) null);
    }

    /* renamed from: d */
    public final String mo124963d(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f260842h);
        sb.append('_');
        String encode = URLEncoder.encode(str, "UTF-8");
        C87412m.m108593f(encode, "encode(this, \"UTF-8\")");
        sb.append(encode);
        sb.append(".rc");
        return sb.toString();
    }
}

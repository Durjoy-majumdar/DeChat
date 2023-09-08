package bq0;

import a70.C112760b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MD5Util;
import com.tencent.p014mm.vfs.C86013q1;
import dq0.C86390a;
import dq0.C86392b;
import eq0.C86637g;
import eq0.C86639h;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import nj0.C88971k;

/* renamed from: bq0.e */
public final class C79766e extends C86390a {

    /* renamed from: b */
    public static Set<String> f233768b;

    static {
        C86639h.f251601a = new C79762a();
        C86637g.f251600a = new C79763b();
        C86392b.f251180a = new C79764c();
        C86392b.f251181b = new C79765d();
        HashSet hashSet = new HashSet();
        f233768b = hashSet;
        hashSet.add(MD5Util.getMD5String("wxa51f55ab3b2655b9"));
        f233768b.add(MD5Util.getMD5String("wx5b5555f4b7c7824b"));
        f233768b.add(MD5Util.getMD5String("wx8c67c6eee918d4ea"));
        f233768b.add(MD5Util.getMD5String("wx577c74fb940daaea"));
        f233768b.add(MD5Util.getMD5String("wx7d9e9cbea92ce71f"));
        f233768b.add(MD5Util.getMD5String("wx850d691fd02de8a1"));
    }

    /* renamed from: b */
    public String mo109892b() {
        if (!((Boolean) C88971k.m111126i("debugNode").mo123353e()).booleanValue()) {
            return super.mo109892b();
        }
        try {
            Log.m105924i("MicroMsg.AppBrandNodeJSInstallHelperWC", "hy: inject local node script!");
            return C86013q1.m106432N(C112760b.m154195C() + "nodjs_debug/node_jsapi.js");
        } catch (IOException e) {
            Log.printErrStackTrace("MicroMsg.AppBrandNodeJSInstallHelperWC", e, "hy: can not find node script in sdcard!!", new Object[0]);
            return "";
        }
    }

    /* renamed from: c */
    public void mo109893c(StringBuffer stringBuffer) {
        stringBuffer.append(";const _switchTimer = true;");
        stringBuffer.append(";const _clicfg_android_appbrand_permission_bytes_jsapi_nodejs_impl = ");
        stringBuffer.append(true);
        stringBuffer.append(";");
    }
}

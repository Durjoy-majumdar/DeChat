package com.tencent.p014mm.plugin.appbrand;

import android.os.Build;
import android.webkit.ValueCallback;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.C81289m;
import com.tencent.p014mm.plugin.appbrand.appstorage.ICommLibReader;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.plugin.appbrand.utils.C84754j1;
import com.tencent.p014mm.sdk.platformtools.Log;
import java.net.URL;

/* renamed from: com.tencent.mm.plugin.appbrand.o4 */
public class C83716o4 {

    /* renamed from: com.tencent.mm.plugin.appbrand.o4$a */
    public class C83717a implements C84754j1.C84756b {
        /* renamed from: b */
        public void mo114825b(String str) {
            Log.m105921e("MicroMsg.SourceMapUtil", "hy: Inject '%s' Script Failed: %s", "WASourceMap.js", str);
        }

        public void onSuccess(String str) {
            Log.m105925i("MicroMsg.SourceMapUtil", "hy: Inject '%s' Script Success: %s", "WASourceMap.js", str);
        }
    }

    /* renamed from: a */
    public static String m102756a(AppBrandRuntime appBrandRuntime, String str, String str2) {
        Log.m105925i("MicroMsg.SourceMapUtil", "hy: getting sourcemap %s, %s", str, str2);
        if (appBrandRuntime == null || str == null || str.length() == 0) {
            Log.m105928w("MicroMsg.SourceMapUtil", "runtime or jsRuntime or filePath is null.");
            return "";
        } else if (C81289m.C81290a.m99664b(appBrandRuntime.f238149o.f239365g)) {
            Log.m105924i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
            return "";
        } else {
            String l = C81247g3.m99556l(appBrandRuntime, str + ".map");
            if (l == null || l.length() == 0) {
                Log.m105925i("MicroMsg.SourceMapUtil", "sourceMap of the script(%s) is null or nil.", str);
                return "";
            }
            return String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap['%s'] = %s)", new Object[]{str2 + str, l});
        }
    }

    /* renamed from: b */
    public static void m102757b(C81879g gVar, C83165i iVar) {
        C84754j1.m104418b(iVar, (URL) null, m102758c(gVar), new C83717a());
        iVar.evaluateJavascript(String.format("typeof __wxSourceMap !== 'undefined' && (__wxSourceMap.__system = 'Android %s')", new Object[]{Build.VERSION.RELEASE}), (ValueCallback<String>) null);
    }

    /* renamed from: c */
    public static String m102758c(C81879g gVar) {
        Log.m105924i("MicroMsg.SourceMapUtil", "hy: injecting sourcemap.js");
        if (gVar == null) {
            Log.m105928w("MicroMsg.SourceMapUtil", "hy: not valid runtime");
            return "";
        } else if (gVar.getRuntime() == null) {
            Log.m105928w("MicroMsg.SourceMapUtil", "hy: runtime not prepared. do not try to inject sourcemap.js. maybe preloading");
            return "";
        } else if (C81289m.C81290a.m99664b(gVar.getRuntime().f238149o.f239365g)) {
            Log.m105924i("MicroMsg.SourceMapUtil", "current running type is ReleaseType do not need to inject sourceMap.");
            return "";
        } else {
            ICommLibReader iCommLibReader = (ICommLibReader) gVar.mo109668l(ICommLibReader.class);
            if (iCommLibReader != null) {
                return iCommLibReader.mo113372b("WASourceMap.js");
            }
            Log.m105920e("MicroMsg.SourceMapUtil", "execSourceMapScript NULL reader");
            return "";
        }
    }
}

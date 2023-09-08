package com.tencent.p014mm.plugin.webview.model;

import a70.C112760b;
import android.net.Uri;
import c00.C39885s;
import com.tencent.p014mm.plugin.websearch.C43471q;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p225rc.C89921j;
import sf0.C90188n0;

/* renamed from: com.tencent.mm.plugin.webview.model.i1 */
public class C43718i1 {

    /* renamed from: a */
    public static final Set<String> f118168a;

    static {
        HashSet hashSet = new HashSet();
        f118168a = hashSet;
        hashSet.add("file:///android_asset/");
        String g = C112760b.m154231g();
        if (!Util.isNullOrNil(g)) {
            g = C112760b.m154231g();
        }
        C86009m1 m1Var = new C86009m1(C43471q.m46978b(0));
        hashSet.add("file://" + m1Var.mo119971i());
        hashSet.add("file://" + ((C39885s) C86312j.m106911c(C39885s.class)).y70());
        C86009m1 m1Var2 = new C86009m1(C112760b.m154195C(), C43471q.m46983g(0).mo71075m());
        hashSet.add("file://" + m1Var2.mo119971i());
        Log.m105925i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", m1Var.mo119971i(), m1Var2.mo119971i());
        C86009m1 m1Var3 = new C86009m1(g, "emoji/res");
        hashSet.add("file://" + m1Var3.mo119971i());
        C86009m1 m1Var4 = new C86009m1(C112760b.m154195C(), "emoji/res");
        hashSet.add("file://" + m1Var4.mo119971i());
        Log.m105925i("MicroMsg.URLFilter", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", m1Var3.mo119971i(), m1Var4.mo119971i());
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Log.m105925i("MicroMsg.URLFilter", "WebViewUI white list path : %s", (String) it.next());
        }
    }

    /* renamed from: a */
    public static boolean m47559a(String str) {
        if (C90188n0.f258947o) {
            Log.m105928w("MicroMsg.URLFilter", "skipLoadUrlCheck");
            return true;
        } else if (Util.isNullOrNil(str)) {
            return true;
        } else {
            String lowerCase = str.toLowerCase();
            if (lowerCase.startsWith("about:blank")) {
                return false;
            }
            if (!lowerCase.startsWith("file://")) {
                Uri parse = Uri.parse(lowerCase);
                if (Util.isNullOrNil(parse.getHost())) {
                    return true;
                }
                return !parse.getHost().contains(C89921j.m112462a());
            }
            Iterator it = ((HashSet) f118168a).iterator();
            while (it.hasNext()) {
                if (lowerCase.startsWith((String) it.next())) {
                    return true;
                }
            }
            return false;
        }
    }
}

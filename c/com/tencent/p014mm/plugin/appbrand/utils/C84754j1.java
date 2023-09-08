package com.tencent.p014mm.plugin.appbrand.utils;

import android.webkit.ValueCallback;
import com.tencent.p014mm.appbrand.p942v8.C80669j;
import com.tencent.p014mm.plugin.appbrand.jsruntime.C83165i;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;

/* renamed from: com.tencent.mm.plugin.appbrand.utils.j1 */
public class C84754j1 {

    /* renamed from: a */
    public static final LinkedList<String> f247167a = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.j1$a */
    public class C84755a implements ValueCallback<String> {

        /* renamed from: a */
        public final /* synthetic */ C84756b f247168a;

        public C84755a(C84756b bVar) {
            this.f247168a = bVar;
        }

        public void onReceiveValue(Object obj) {
            String str = (String) obj;
            if (str == null || !str.contains("11111")) {
                C84756b bVar = this.f247168a;
                if (bVar != null) {
                    bVar.mo114825b(str);
                    return;
                }
                return;
            }
            C84756b bVar2 = this.f247168a;
            if (bVar2 != null) {
                bVar2.onSuccess(str);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.j1$b */
    public interface C84756b {
        /* renamed from: b */
        void mo114825b(String str);

        void onSuccess(String str);
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.utils.j1$c */
    public interface C84757c extends C84756b {
        /* renamed from: a */
        void mo117481a(C80669j.C80676g gVar);
    }

    /* renamed from: a */
    public static void m104417a(String str, C84756b bVar, String str2, long j) {
        if (str2 == null || !str2.contains("11111")) {
            if (bVar != null) {
                Log.m105921e("MicroMsg.JsValidationInjector", "hy: file %s inject failed!", str);
                bVar.mo114825b(str2);
            }
        } else if (bVar != null) {
            Log.m105925i("MicroMsg.JsValidationInjector", "hy: file %s inject success! cost:%d", str, Long.valueOf(System.currentTimeMillis() - j));
            bVar.onSuccess(str2);
        }
    }

    /* renamed from: b */
    public static void m104418b(C83165i iVar, URL url, String str, C84756b bVar) {
        boolean z;
        if (Util.isNullOrNil(str)) {
            if (bVar != null) {
                bVar.mo114825b("isNullOrNil script");
            }
        } else if (iVar != null) {
            LinkedList<String> linkedList = f247167a;
            synchronized (linkedList) {
                Iterator<String> it = linkedList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (str.startsWith(it.next())) {
                            z = false;
                            break;
                        }
                    } else {
                        z = true;
                        break;
                    }
                }
            }
            if (z) {
                str = str + String.format(Locale.ENGLISH, "\n;(function(){return %d;})();", new Object[]{11111});
            }
            C84755a aVar = new C84755a(bVar);
            if (url == null) {
                iVar.evaluateJavascript(str, aVar);
            } else {
                iVar.mo63304R0(url, str, aVar);
            }
        } else if (bVar != null) {
            bVar.mo114825b("wv is null");
        }
    }
}

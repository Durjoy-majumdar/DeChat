package com.tencent.p014mm.plugin.appbrand.appcache.predownload;

import android.os.Build;
import com.tencent.xweb.FileReaderHelper;
import gy3.C87412m;
import java.util.concurrent.ConcurrentHashMap;
import ki0.C88153c;
import kr0.C88262c1;
import p170ic.C87688b;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.h */
public final class C81334h {

    /* renamed from: a */
    public static final C81334h f238795a = new C81334h();

    /* renamed from: b */
    public static final ConcurrentHashMap<String, C81335a> f238796b = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.predownload.h$a */
    public static final class C81335a {

        /* renamed from: a */
        public final String f238797a;

        /* renamed from: b */
        public final C88262c1.C88263a f238798b;

        /* renamed from: c */
        public C87688b f238799c;

        public C81335a(String str, C88262c1.C88263a aVar) {
            C87412m.m108594g(str, "localRequestKey");
            C87412m.m108594g(aVar, "callback");
            this.f238797a = str;
            this.f238798b = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C81335a)) {
                return false;
            }
            C81335a aVar = (C81335a) obj;
            return C87412m.m108589b(this.f238797a, aVar.f238797a) && C87412m.m108589b(this.f238798b, aVar.f238798b);
        }

        public int hashCode() {
            return (this.f238797a.hashCode() * 31) + this.f238798b.hashCode();
        }

        public String toString() {
            return "CallbackContext(localRequestKey=" + this.f238797a + ", callback=" + this.f238798b + ')';
        }
    }

    /* renamed from: a */
    public final void mo113610a(String str, C88262c1.C88265c cVar) {
        ConcurrentHashMap<String, C81335a> concurrentHashMap;
        C81335a aVar;
        C87412m.m108594g(cVar, "result");
        if (!(str == null || str.length() == 0) && (aVar = concurrentHashMap.get(str)) != null) {
            aVar.f238798b.mo113616a(cVar);
            if (Build.VERSION.SDK_INT >= 24) {
                concurrentHashMap.remove(aVar.f238797a, aVar);
            } else {
                (concurrentHashMap = f238796b).remove(aVar.f238797a);
            }
        }
    }

    /* renamed from: b */
    public final void mo113611b(C88153c cVar) {
        ConcurrentHashMap<String, C81335a> concurrentHashMap;
        C81335a aVar;
        C87412m.m108594g(cVar, FileReaderHelper.OPEN_FILE_FROM_CMD);
        String str = cVar.field_localRequestKey;
        if (!(str == null || str.length() == 0) && (aVar = concurrentHashMap.get(cVar.field_localRequestKey)) != null) {
            aVar.f238798b.mo113616a(C88262c1.C88265c.Fail_PkgDownloadFail);
            if (Build.VERSION.SDK_INT >= 24) {
                concurrentHashMap.remove(aVar.f238797a, aVar);
            } else {
                (concurrentHashMap = f238796b).remove(aVar.f238797a);
            }
        }
    }

    /* renamed from: c */
    public final void mo113612c(C88153c cVar) {
        C81335a aVar;
        C87412m.m108594g(cVar, FileReaderHelper.OPEN_FILE_FROM_CMD);
        String str = cVar.field_localRequestKey;
        if (!(str == null || str.length() == 0) && (aVar = f238796b.get(cVar.field_localRequestKey)) != null) {
            C87688b bVar = aVar.f238799c;
            if (bVar != null) {
                bVar.mo122118a();
            } else {
                C87412m.m108603p("latch");
                throw null;
            }
        }
    }
}

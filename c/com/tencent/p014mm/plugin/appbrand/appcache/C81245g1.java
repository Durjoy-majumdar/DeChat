package com.tencent.p014mm.plugin.appbrand.appcache;

import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseLongArray;
import com.tencent.mars.cdn.CdnLogic;
import com.tencent.p014mm.autogen.events.WxaPkgPreConnectCDNEventEvent;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import lu3.C34379c;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.appbrand.appcache.g1 */
public final class C81245g1 {

    /* renamed from: a */
    public static volatile boolean f238643a;

    /* renamed from: b */
    public static final SparseLongArray f238644b = new SparseLongArray();

    /* renamed from: c */
    public static final long f238645c = TimeUnit.SECONDS.toMillis(30);

    /* renamed from: d */
    public static final ConcurrentHashMap<String, C34379c<ArrayList<String>>> f238646d = new ConcurrentHashMap<>();

    /* renamed from: com.tencent.mm.plugin.appbrand.appcache.g1$a */
    public class C81246a implements Callable<ArrayList<String>> {

        /* renamed from: d */
        public final /* synthetic */ String f238647d;

        public C81246a(String str) {
            this.f238647d = str;
        }

        public Object call() {
            try {
                ArrayList arrayList = new ArrayList();
                C86709a0.m107529k().f251779b.f256809d.mo55493w3(this.f238647d, arrayList);
                return arrayList;
            } catch (Throwable unused) {
                return new ArrayList(0);
            }
        }
    }

    /* renamed from: a */
    public static void m99552a(String str) {
        long j;
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("MicroMsg.PkgNetworkOpt", "preConnectHost with EMPTY url");
            return;
        }
        SparseLongArray sparseLongArray = f238644b;
        synchronized (sparseLongArray) {
            j = sparseLongArray.get(str.hashCode(), 0);
        }
        if (Util.milliSecondsToNow(j) < f238645c) {
            Log.m105925i("MicroMsg.PkgNetworkOpt", "preConnectHost, hit interval control, url:%s, lastPreConnectedTimestamp:%d", str, Long.valueOf(j));
            return;
        }
        Log.m105925i("MicroMsg.PkgNetworkOpt", "preConnectHost, task start, url:%s", str);
        WxaPkgPreConnectCDNEventEvent wxaPkgPreConnectCDNEventEvent = new WxaPkgPreConnectCDNEventEvent();
        wxaPkgPreConnectCDNEventEvent.f236315d.f236316a = 1;
        wxaPkgPreConnectCDNEventEvent.asyncPublish(Looper.getMainLooper());
        CdnLogic.C2CDownloadRequest c2CDownloadRequest = new CdnLogic.C2CDownloadRequest();
        c2CDownloadRequest.httpMethod = "HEAD";
        c2CDownloadRequest.url = str;
        c2CDownloadRequest.fileKey = str;
        CdnLogic.startCronetSimpleRequest(c2CDownloadRequest, new C81242f1(str));
    }

    /* renamed from: b */
    public static ArrayList<String> m99553b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.m105928w("MicroMsg.PkgNetworkOpt", "getNewDNSIPListByHost with EMPTY host");
            return new ArrayList<>(0);
        }
        Log.m105925i("MicroMsg.PkgNetworkOpt", "getNewDNSIPListByHost with host[%s]", str);
        ConcurrentHashMap<String, C34379c<ArrayList<String>>> concurrentHashMap = f238646d;
        C34379c cVar = concurrentHashMap.get(str);
        if (cVar == null) {
            C119179t tVar = C119157j.f356862d;
            C81246a aVar = new C81246a(str);
            C119157j jVar = (C119157j) tVar;
            jVar.getClass();
            cVar = jVar.mo183881l(aVar, 0, "MicroMsg.PkgNetworkOpt");
            concurrentHashMap.put(str, cVar);
        }
        try {
            return (ArrayList) cVar.get(500, TimeUnit.MILLISECONDS);
        } catch (Throwable th) {
            Log.m105921e("MicroMsg.PkgNetworkOpt", "getNewDNSIPListByHost await future t=%s", th);
            return new ArrayList<>(0);
        }
    }
}

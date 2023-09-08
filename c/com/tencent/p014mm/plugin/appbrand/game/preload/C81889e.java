package com.tencent.p014mm.plugin.appbrand.game.preload;

import android.text.TextUtils;
import com.tencent.midas.api.APMidasPayAPI;
import com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC;
import com.tencent.p014mm.plugin.appbrand.appcache.C81247g3;
import com.tencent.p014mm.plugin.appbrand.appcache.ModulePkgInfo;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81415h0;
import com.tencent.p014mm.plugin.appbrand.appstorage.C81428p0;
import com.tencent.p014mm.plugin.appbrand.config.C81634a;
import com.tencent.p014mm.plugin.appbrand.launching.ModularizingPkgRetrieverSeparatedPluginsCompatible;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.thumbplayer.tmediacodec.codec.CodecError;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import op0.C89261g;
import op0.C89277n;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import sp0.C90272a;
import sp0.C90280d;
import sp0.C90283e;
import sp0.C90322q;

/* renamed from: com.tencent.mm.plugin.appbrand.game.preload.e */
public class C81889e {

    /* renamed from: m */
    public static volatile C81889e f240193m;

    /* renamed from: a */
    public AppBrandRuntimeWC f240194a;

    /* renamed from: b */
    public C90322q f240195b;

    /* renamed from: c */
    public C90272a f240196c;

    /* renamed from: d */
    public C81415h0 f240197d;

    /* renamed from: e */
    public C81887c f240198e;

    /* renamed from: f */
    public boolean f240199f = false;

    /* renamed from: g */
    public CopyOnWriteArrayList<String> f240200g = new CopyOnWriteArrayList<>();

    /* renamed from: h */
    public boolean f240201h = false;

    /* renamed from: i */
    public AtomicInteger f240202i;

    /* renamed from: j */
    public AtomicInteger f240203j;

    /* renamed from: k */
    public AtomicInteger f240204k;

    /* renamed from: l */
    public AtomicInteger f240205l;

    /* renamed from: com.tencent.mm.plugin.appbrand.game.preload.e$a */
    public class C81890a implements C90280d.C90281a {

        /* renamed from: a */
        public final /* synthetic */ String f240206a;

        /* renamed from: b */
        public final /* synthetic */ String f240207b;

        public C81890a(String str, String str2) {
            this.f240206a = str;
            this.f240207b = str2;
        }

        /* renamed from: a */
        public void mo114287a(JSONObject jSONObject) {
            if (jSONObject != null) {
                try {
                    C81889e.this.f240202i.addAndGet(jSONObject.getInt("Content-Length"));
                } catch (JSONException e) {
                    Log.printErrStackTrace("MicroMsg.WAGamePreloadManager", e, "content-length get error", new Object[0]);
                }
            }
        }

        /* renamed from: b */
        public void mo114288b(int i, String str, int i2) {
        }

        /* renamed from: c */
        public void mo114289c(int i, long j, long j2) {
        }

        /* renamed from: d */
        public void mo114290d(int i, String str, String str2, int i2, long j, Map map) {
            Log.m105927v("MicroMsg.WAGamePreloadManager", "download errMsg:%d,mimeType:%s,filePath:%s,statusCode:%d,url:%s", Integer.valueOf(i), str, str2, Integer.valueOf(i2), this.f240206a);
            C81889e eVar = C81889e.this;
            if (eVar.f240197d == null || i2 != 200) {
                Log.m105920e("MicroMsg.WAGamePreloadManager", "download fileSystem is null or download failed!");
                return;
            }
            String str3 = this.f240206a;
            eVar.getClass();
            if (!Util.isNullOrNil(str3)) {
                synchronized (eVar.f240200g) {
                    CopyOnWriteArrayList<String> copyOnWriteArrayList = eVar.f240200g;
                    if (copyOnWriteArrayList != null) {
                        Iterator<String> it = copyOnWriteArrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (str3.equals(it.next())) {
                                    eVar.f240200g.remove(str3);
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
            C81889e.this.mo114284a();
            String str4 = this.f240207b;
            C81410b0 mkdir = ((C81428p0) C81889e.this.f240197d).mkdir(str4.substring(0, str4.lastIndexOf("/") + 1), true);
            if (mkdir == C81410b0.OK || mkdir == C81410b0.RET_ALREADY_EXISTS) {
                ((C81428p0) C81889e.this.f240197d).copyTo(this.f240207b, new C86009m1(str2), true);
            }
            C81889e.this.f240203j.addAndGet(1);
        }
    }

    /* renamed from: d */
    public static C81889e m100570d() {
        if (f240193m == null) {
            synchronized (C81889e.class) {
                if (f240193m == null) {
                    f240193m = new C81889e();
                }
            }
        }
        return f240193m;
    }

    /* renamed from: a */
    public final void mo114284a() {
        CopyOnWriteArrayList<String> copyOnWriteArrayList = this.f240200g;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() == 0) {
            AppBrandRuntimeWC appBrandRuntimeWC = this.f240194a;
            if (appBrandRuntimeWC == null || appBrandRuntimeWC.mo113008F() == null) {
                Log.m105920e("MicroMsg.WAGamePreloadManager", "hy: unexpected null app config");
                return;
            }
            C81634a F = this.f240194a.mo113008F();
            String str = this.f240194a.f238147j;
            ArrayList<String> arrayList = F.f239616v;
            Object[] objArr = new Object[1];
            objArr[0] = Integer.valueOf(arrayList == null ? 0 : arrayList.size());
            Log.m105925i("MicroMsg.WAGamePreloadManager", "predownload subPackage size:%d", objArr);
            if (arrayList != null) {
                Iterator<String> it = arrayList.iterator();
                while (it.hasNext()) {
                    String next = it.next();
                    Log.m105925i("MicroMsg.WAGamePreloadManager", "predownload subPackage name:%s", next);
                    AppBrandRuntimeWC appBrandRuntimeWC2 = this.f240194a;
                    if (appBrandRuntimeWC2 == null || appBrandRuntimeWC2.mo113213o1() == null) {
                        Object[] objArr2 = new Object[1];
                        objArr2[0] = appBrandRuntimeWC2 == null ? "" : appBrandRuntimeWC2.f238147j;
                        Log.m105921e("MicroMsg.WAGamePreloadManager", "runtime(%s) or sysConfig null", objArr2);
                    } else if (appBrandRuntimeWC2.f238117P || appBrandRuntimeWC2.mo113064k0()) {
                        Log.m105921e("MicroMsg.WAGamePreloadManager", "runtime(%s) finishing", appBrandRuntimeWC2.f238147j);
                    } else {
                        C81247g3.m99555k(appBrandRuntimeWC2, false).mo113505h();
                        LinkedList<ModulePkgInfo> linkedList = appBrandRuntimeWC2.mo113213o1().f261072r.f238588g;
                        C87412m.m108594g(linkedList, "<this>");
                        C87412m.m108594g(next, "pathOrModule");
                        ModulePkgInfo modulePkgInfo = (ModulePkgInfo) C89277n.m111584a(linkedList, next, (String) null, false, 6, (Object) null);
                        if (modulePkgInfo == null || TextUtils.isEmpty(modulePkgInfo.md5)) {
                            Log.m105921e("MicroMsg.WAGamePreloadManager", "downloadSubPackage with appId:%s, moduleName:%s, get invalid module obj", appBrandRuntimeWC2.f238147j, next);
                        } else if (C89261g.f257161a == null) {
                            Log.m105920e("MicroMsg.WAGamePreloadManager", "downloadSubPackage fail!");
                        } else {
                            String h = appBrandRuntimeWC2.mo113213o1().f261072r.mo113447h(appBrandRuntimeWC2.f238147j, modulePkgInfo.name);
                            ((ModularizingPkgRetrieverSeparatedPluginsCompatible.C83278a) C89261g.f257161a).getClass();
                            C87412m.m108594g(h, "requestModuleName");
                            ModularizingPkgRetrieverSeparatedPluginsCompatible modularizingPkgRetrieverSeparatedPluginsCompatible = new ModularizingPkgRetrieverSeparatedPluginsCompatible(appBrandRuntimeWC2, h);
                            modularizingPkgRetrieverSeparatedPluginsCompatible.mo115564a(new C81888d(this, next));
                            modularizingPkgRetrieverSeparatedPluginsCompatible.mo115565b();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo114285b(JSONObject jSONObject, String str, String str2) {
        C81890a aVar = new C81890a(str, str2);
        if (this.f240196c.f259136p <= 0) {
            Log.m105924i("MicroMsg.WAGamePreloadManager", "maxDownloadConcurrent <= 0 ");
            return;
        }
        HashMap hashMap = new HashMap();
        int i = this.f240196c.f259146z;
        C90322q qVar = this.f240195b;
        StringBuilder sb = new StringBuilder();
        AtomicInteger atomicInteger = C90283e.f259174b;
        C90283e.C90285b.f259176a.getClass();
        sb.append(C90283e.f259174b.incrementAndGet());
        sb.append("");
        qVar.mo124552b(jSONObject, CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL, hashMap, (ArrayList<String>) null, i, aVar, sb.toString(), APMidasPayAPI.ENV_TEST);
    }

    /* renamed from: c */
    public void mo114286c() {
        if (this.f240201h) {
            if (!this.f240199f) {
                Log.m105920e("MicroMsg.WAGamePreloadManager", "hasn't init!");
                return;
            }
            AppBrandRuntimeWC appBrandRuntimeWC = this.f240194a;
            if (appBrandRuntimeWC != null) {
                if (appBrandRuntimeWC.mo113008F() == null) {
                    Log.m105920e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles getAppConfig null!");
                    return;
                }
                JSONArray jSONArray = this.f240194a.mo113008F().f239615u;
                if (jSONArray != null) {
                    C81891f.m100578a().mo114291b(3000, jSONArray.length());
                    int i = 0;
                    while (i < jSONArray.length()) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i);
                            if (jSONObject != null) {
                                String optString = jSONObject.optString("url");
                                String optString2 = jSONObject.optString("path");
                                if (!Util.isNullOrNil(optString)) {
                                    if (!Util.isNullOrNil(optString2)) {
                                        if (((C81428p0) this.f240197d).access(optString2) == C81410b0.OK) {
                                            Log.m105925i("MicroMsg.WAGamePreloadManager", "predownload path %s has exists!", optString2);
                                        } else {
                                            this.f240200g.add(optString);
                                            mo114285b(jSONObject, optString, optString2);
                                        }
                                    }
                                }
                            }
                            i++;
                        } catch (JSONException e) {
                            Log.printErrStackTrace("MicroMsg.WAGamePreloadManager", e, "", new Object[0]);
                        }
                    }
                }
                C81634a F = this.f240194a.mo113008F();
                if (F == null) {
                    Log.m105920e("MicroMsg.WAGamePreloadManager", "downloadPreloadFiles config null！");
                    return;
                }
                String str = this.f240194a.f238147j;
                ArrayList<String> arrayList = F.f239616v;
                if (arrayList != null) {
                    C81891f.m100578a().mo114291b(4000, arrayList.size());
                }
                mo114284a();
            }
        }
    }
}
